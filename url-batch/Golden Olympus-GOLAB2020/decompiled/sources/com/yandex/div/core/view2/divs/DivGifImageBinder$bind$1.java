package com.yandex.div.core.view2.divs;

import O1.Y6;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivGifImageBinder$bind$1 extends s implements Function1<Y6, Unit> {
    final /* synthetic */ DivGifImageView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivGifImageBinder$bind$1(DivGifImageView divGifImageView) {
        super(1);
        this.$this_bind = divGifImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Y6) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Y6 scale) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.$this_bind.setImageScale(BaseDivViewExtensionsKt.toImageScale(scale));
    }
}
