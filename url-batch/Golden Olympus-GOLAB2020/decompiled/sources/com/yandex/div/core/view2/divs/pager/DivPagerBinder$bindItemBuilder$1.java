package com.yandex.div.core.view2.divs.pager;

import O1.H3;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivPagerBinder$bindItemBuilder$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ H3 $builder;
    final /* synthetic */ BindingContext $context;
    final /* synthetic */ DivPagerView $this_bindItemBuilder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivPagerBinder$bindItemBuilder$1(DivPagerView divPagerView, H3 h32, BindingContext bindingContext) {
        super(1);
        this.$this_bindItemBuilder = divPagerView;
        this.$builder = h32;
        this.$context = bindingContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m149invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m149invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DivPagerAdapter divPagerAdapter = (DivPagerAdapter) this.$this_bindItemBuilder.getViewPager().getAdapter();
        if (divPagerAdapter != null) {
            divPagerAdapter.setItems(DivCollectionExtensionsKt.build(this.$builder, this.$context.getDivView(), this.$context.getExpressionResolver()));
        }
        DivPagerView.OnItemsUpdatedCallback pagerOnItemsCountChange$div_release = this.$this_bindItemBuilder.getPagerOnItemsCountChange$div_release();
        if (pagerOnItemsCountChange$div_release != null) {
            pagerOnItemsCountChange$div_release.onItemsUpdated();
        }
        RecyclerView recyclerView = this.$this_bindItemBuilder.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.scrollToPosition(this.$this_bindItemBuilder.getCurrentItem$div_release());
        }
        ViewPager2 viewPager = this.$this_bindItemBuilder.getViewPager();
        final DivPagerView divPagerView = this.$this_bindItemBuilder;
        viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerBinder$bindItemBuilder$1$invoke$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(@NotNull View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                view.removeOnLayoutChangeListener(this);
                DivPagerView.this.getViewPager().j();
            }
        });
    }
}
