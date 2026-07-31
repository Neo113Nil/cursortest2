package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivTextBinder$bindSelectable$1 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ DivLineHeightTextView $this_bindSelectable;
    final /* synthetic */ DivTextBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTextBinder$bindSelectable$1(DivTextBinder divTextBinder, DivLineHeightTextView divLineHeightTextView) {
        super(1);
        this.this$0 = divTextBinder;
        this.$this_bindSelectable = divLineHeightTextView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        this.this$0.applySelectable(this.$this_bindSelectable, z4);
    }
}
