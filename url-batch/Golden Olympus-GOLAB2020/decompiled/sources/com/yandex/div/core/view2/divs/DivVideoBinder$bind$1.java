package com.yandex.div.core.view2.divs;

import com.yandex.div.core.player.DivPlayerView;
import com.yandex.div.core.util.ImageRepresentation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivVideoBinder$bind$1 extends s implements Function1<ImageRepresentation, Unit> {
    final /* synthetic */ DivPlayerView $playerView;
    final /* synthetic */ PreviewImageView $previewImageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivVideoBinder$bind$1(DivPlayerView divPlayerView, PreviewImageView previewImageView) {
        super(1);
        this.$playerView = divPlayerView;
        this.$previewImageView = previewImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ImageRepresentation) obj);
        return Unit.f41027a;
    }

    public final void invoke(@Nullable ImageRepresentation imageRepresentation) {
        if (imageRepresentation != null) {
            PreviewImageView previewImageView = this.$previewImageView;
            previewImageView.setVisibility(0);
            if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                previewImageView.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).m55unboximpl());
            } else if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                previewImageView.setImageBitmap(((ImageRepresentation.Bitmap) imageRepresentation).m49unboximpl());
            }
        }
        this.$playerView.setVisibility(0);
    }
}
