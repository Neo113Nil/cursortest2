package com.yandex.div.core.view2.divs;

import android.graphics.drawable.Drawable;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
final class DivImageBinder$applyPlaceholders$1 extends s implements Function1<Drawable, Unit> {
    final /* synthetic */ DivImageView $this_applyPlaceholders;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivImageBinder$applyPlaceholders$1(DivImageView divImageView) {
        super(1);
        this.$this_applyPlaceholders = divImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Drawable) obj);
        return Unit.f41027a;
    }

    public final void invoke(@Nullable Drawable drawable) {
        if (this.$this_applyPlaceholders.isImageLoaded() || this.$this_applyPlaceholders.isImagePreview()) {
            return;
        }
        this.$this_applyPlaceholders.setPlaceholder(drawable);
    }
}
