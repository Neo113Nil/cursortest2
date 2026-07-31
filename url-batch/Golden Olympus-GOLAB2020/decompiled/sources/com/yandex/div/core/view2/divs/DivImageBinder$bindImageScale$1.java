package com.yandex.div.core.view2.divs;

import O1.Y6;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivImageBinder$bindImageScale$1 extends s implements Function1<Y6, Unit> {
    final /* synthetic */ DivImageView $this_bindImageScale;
    final /* synthetic */ DivImageBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivImageBinder$bindImageScale$1(DivImageBinder divImageBinder, DivImageView divImageView) {
        super(1);
        this.this$0 = divImageBinder;
        this.$this_bindImageScale = divImageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Y6) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull Y6 scale) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.this$0.applyImageScale(this.$this_bindImageScale, scale);
    }
}
