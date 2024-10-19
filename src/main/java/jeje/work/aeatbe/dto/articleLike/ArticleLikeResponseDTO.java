package jeje.work.aeatbe.dto.articleLike;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
public record ArticleLikeResponseDTO(Long articleLikeId, int count) {

}
