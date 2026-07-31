package com.yandex.div.core.view2.divs.pager;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes2.dex */
final class DivPagerBinder$bindInfiniteScroll$1 extends s implements Function1<Boolean, Unit> {
    final /* synthetic */ G $listener;
    final /* synthetic */ RecyclerView $recyclerView;
    final /* synthetic */ DivPagerView $this_bindInfiniteScroll;
    final /* synthetic */ DivPagerBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivPagerBinder$bindInfiniteScroll$1(DivPagerView divPagerView, G g4, DivPagerBinder divPagerBinder, RecyclerView recyclerView) {
        super(1);
        this.$this_bindInfiniteScroll = divPagerView;
        this.$listener = g4;
        this.this$0 = divPagerBinder;
        this.$recyclerView = recyclerView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.f41027a;
    }

    public final void invoke(boolean z4) {
        RecyclerView.h adapter = this.$this_bindInfiniteScroll.getViewPager().getAdapter();
        DivPagerAdapter divPagerAdapter = adapter instanceof DivPagerAdapter ? (DivPagerAdapter) adapter : null;
        if (divPagerAdapter != null) {
            divPagerAdapter.setInfiniteScrollEnabled(z4);
        }
        if (!z4) {
            RecyclerView.u uVar = (RecyclerView.u) this.$listener.f41132b;
            if (uVar != null) {
                this.$recyclerView.removeOnScrollListener(uVar);
                return;
            }
            return;
        }
        RecyclerView.u uVar2 = (RecyclerView.u) this.$listener.f41132b;
        if (uVar2 == null) {
            uVar2 = this.this$0.createInfiniteScrollListener(this.$this_bindInfiniteScroll);
            this.$listener.f41132b = uVar2;
        }
        this.$recyclerView.addOnScrollListener(uVar2);
    }
}
