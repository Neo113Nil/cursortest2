package com.yandex.div.core.view2.divs.tabs;

import com.yandex.div.core.view2.divs.widgets.DivTabsLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivTabsBinder$bindAdapter$selectTab$1 extends s implements Function1<Long, Unit> {
    final /* synthetic */ DivTabsLayout $view;
    final /* synthetic */ DivTabsBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivTabsBinder$bindAdapter$selectTab$1(DivTabsBinder divTabsBinder, DivTabsLayout divTabsLayout) {
        super(1);
        this.this$0 = divTabsBinder;
        this.$view = divTabsLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.f41027a;
    }

    public final void invoke(long j4) {
        PagerController pager;
        int i4;
        this.this$0.oldDivSelectedTab = Long.valueOf(j4);
        DivTabsAdapter divTabsAdapter = this.$view.getDivTabsAdapter();
        if (divTabsAdapter == null || (pager = divTabsAdapter.getPager()) == null) {
            return;
        }
        long j5 = j4 >> 31;
        if (j5 == 0 || j5 == -1) {
            i4 = (int) j4;
        } else {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + j4 + "' to Int");
            }
            i4 = j4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        if (pager.getCurrentItemIndex() != i4) {
            pager.smoothScrollTo(i4);
        }
    }
}
