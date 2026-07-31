package com.yandex.div.core.view2.divs;

import com.yandex.div.core.view2.divs.widgets.DivGridLayout;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivGridBinder$bind$1 extends s implements Function1<Long, Unit> {
    final /* synthetic */ DivGridLayout $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivGridBinder$bind$1(DivGridLayout divGridLayout) {
        super(1);
        this.$this_bind = divGridLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return Unit.f41027a;
    }

    public final void invoke(long j4) {
        int i4;
        DivGridLayout divGridLayout = this.$this_bind;
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
        divGridLayout.setColumnCount(i4);
    }
}
