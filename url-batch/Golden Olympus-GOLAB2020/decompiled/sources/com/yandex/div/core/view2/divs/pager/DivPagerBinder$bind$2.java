package com.yandex.div.core.view2.divs.pager;

import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.core.view2.divs.widgets.ParentScrollRestrictor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivPagerBinder$bind$2 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ DivPagerView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivPagerBinder$bind$2(DivPagerView divPagerView) {
        super(1);
        this.$this_bind = divPagerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        this.$this_bind.setOnInterceptTouchEventListener(z4 ? ParentScrollRestrictor.INSTANCE : null);
    }
}
