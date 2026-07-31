package com.yandex.div.core.view2.divs;

import O1.R3;
import com.yandex.div.core.view2.divs.widgets.DivLinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivContainerBinder$bindProperties$$inlined$bindOrientation$1 extends s implements Function1<R3.d, Unit> {
    final /* synthetic */ DivLinearLayout $this_bindProperties$inlined;
    final /* synthetic */ DivContainerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivContainerBinder$bindProperties$$inlined$bindOrientation$1(DivLinearLayout divLinearLayout, DivContainerBinder divContainerBinder) {
        super(1);
        this.$this_bindProperties$inlined = divLinearLayout;
        this.this$0 = divContainerBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((R3.d) obj);
        return Unit.f41027a;
    }

    public final void invoke(@NotNull R3.d orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.$this_bindProperties$inlined.setOrientation(this.this$0.toOrientationMode(orientation));
    }
}
