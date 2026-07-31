package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivSelectView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivSelectBinder$observeHintColor$1 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ DivSelectView $this_observeHintColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivSelectBinder$observeHintColor$1(DivSelectView divSelectView) {
        super(1);
        this.$this_observeHintColor = divSelectView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.f41027a;
    }

    public final void invoke(int i4) {
        this.$this_observeHintColor.setHintTextColor(i4);
    }
}
