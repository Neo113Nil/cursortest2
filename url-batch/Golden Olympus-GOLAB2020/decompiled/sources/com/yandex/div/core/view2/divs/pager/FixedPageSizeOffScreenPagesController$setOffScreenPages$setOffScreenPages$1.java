package com.yandex.div.core.view2.divs.pager;

import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class FixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1 extends s implements Function1<Integer, Unit> {
    final /* synthetic */ FixedPageSizeOffScreenPagesController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FixedPageSizeOffScreenPagesController$setOffScreenPages$setOffScreenPages$1(FixedPageSizeOffScreenPagesController fixedPageSizeOffScreenPagesController) {
        super(1);
        this.this$0 = fixedPageSizeOffScreenPagesController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.f41027a;
    }

    public final void invoke(int i4) {
        DivPagerView divPagerView;
        DivPagerAdapter divPagerAdapter;
        divPagerView = this.this$0.parent;
        ViewPager2 viewPager = divPagerView.getViewPager();
        int i5 = 1;
        if (i4 != 0) {
            divPagerAdapter = this.this$0.adapter;
            if (i4 != divPagerAdapter.getItemCount() - 1) {
                i5 = -1;
            }
        }
        viewPager.setOffscreenPageLimit(i5);
    }
}
