package com.yandex.div.core.view2.divs;

import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivGifImageBinder$applyGifImage$2 extends s implements Function1<ImageRepresentation, Unit> {
    final /* synthetic */ DivGifImageView $this_applyGifImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivGifImageBinder$applyGifImage$2(DivGifImageView divGifImageView) {
        super(1);
        this.$this_applyGifImage = divGifImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ImageRepresentation) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull ImageRepresentation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.$this_applyGifImage.isImageLoaded()) {
            return;
        }
        if (it instanceof ImageRepresentation.Bitmap) {
            this.$this_applyGifImage.setPreview(((ImageRepresentation.Bitmap) it).m49unboximpl());
        } else if (it instanceof ImageRepresentation.PictureDrawable) {
            this.$this_applyGifImage.setPreview(((ImageRepresentation.PictureDrawable) it).m55unboximpl());
        }
        this.$this_applyGifImage.previewLoaded();
    }
}
