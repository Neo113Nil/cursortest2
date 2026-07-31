package com.yandex.div.core.view2.divs;

import O1.C1060t7;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeBackground$1 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ BindingContext $bindingContext;
    final /* synthetic */ C1060t7 $newDiv;
    final /* synthetic */ C1060t7 $oldDiv;
    final /* synthetic */ DivInputView $this_observeBackground;
    final /* synthetic */ DivInputBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivInputBinder$observeBackground$1(DivInputBinder divInputBinder, DivInputView divInputView, BindingContext bindingContext, C1060t7 c1060t7, C1060t7 c1060t72) {
        super(1);
        this.this$0 = divInputBinder;
        this.$this_observeBackground = divInputView;
        this.$bindingContext = bindingContext;
        this.$newDiv = c1060t7;
        this.$oldDiv = c1060t72;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.f41027a;
    }

    public final void invoke(int i4) {
        this.this$0.applyNativeBackgroundColor(this.$this_observeBackground, this.$bindingContext, this.$newDiv, this.$oldDiv);
    }
}
