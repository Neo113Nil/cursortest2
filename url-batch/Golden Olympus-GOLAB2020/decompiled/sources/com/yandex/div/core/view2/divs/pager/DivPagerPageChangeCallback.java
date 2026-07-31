package com.yandex.div.core.view2.divs.pager;

import O1.E9;
import O1.Z;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.core.view.AbstractC1293g0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivPagerView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.k;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class DivPagerPageChangeCallback extends ViewPager2.i {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final E9 divPager;

    @NotNull
    private final Div2View divView;

    @NotNull
    private final List<DivItemBuilderResult> items;
    private final int minimumSignificantDx;

    @NotNull
    private final DivPagerView pagerView;
    private int prevPosition;

    @NotNull
    private final RecyclerView recyclerView;
    private int totalDelta;

    public DivPagerPageChangeCallback(@NotNull E9 divPager, @NotNull List<DivItemBuilderResult> items, @NotNull BindingContext bindingContext, @NotNull RecyclerView recyclerView, @NotNull DivPagerView pagerView) {
        Intrinsics.checkNotNullParameter(divPager, "divPager");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(pagerView, "pagerView");
        this.divPager = divPager;
        this.items = items;
        this.bindingContext = bindingContext;
        this.recyclerView = recyclerView;
        this.pagerView = pagerView;
        this.prevPosition = -1;
        Div2View divView = bindingContext.getDivView();
        this.divView = divView;
        this.minimumSignificantDx = divView.getConfig().getLogCardScrollSignificantThreshold();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackVisibleChildren() {
        View view;
        int childAdapterPosition;
        Iterator it = AbstractC1293g0.b(this.recyclerView).iterator();
        while (it.hasNext() && (childAdapterPosition = this.recyclerView.getChildAdapterPosition((view = (View) it.next()))) != -1) {
            DivItemBuilderResult divItemBuilderResult = this.items.get(childAdapterPosition);
            this.divView.getDiv2Component$div_release().getVisibilityActionTracker().startTrackingViewsHierarchy(this.bindingContext.getFor(divItemBuilderResult.getExpressionResolver()), view, divItemBuilderResult.getDiv());
        }
    }

    private final void trackVisibleViews() {
        if (k.n(AbstractC1293g0.b(this.recyclerView)) > 0) {
            trackVisibleChildren();
            return;
        }
        RecyclerView recyclerView = this.recyclerView;
        if (!ViewsKt.isActuallyLaidOut(recyclerView) || recyclerView.isLayoutRequested()) {
            recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerPageChangeCallback$trackVisibleViews$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    view.removeOnLayoutChangeListener(this);
                    DivPagerPageChangeCallback.this.trackVisibleChildren();
                }
            });
        } else {
            trackVisibleChildren();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    @SuppressLint({"SwitchIntDef"})
    public void onPageScrollStateChanged(int i4) {
        super.onPageScrollStateChanged(i4);
        if (i4 == 0) {
            trackVisibleViews();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageScrolled(int i4, float f4, int i5) {
        super.onPageScrolled(i4, f4, i5);
        int i6 = this.minimumSignificantDx;
        if (i6 <= 0) {
            RecyclerView.p layoutManager = this.recyclerView.getLayoutManager();
            i6 = (layoutManager != null ? layoutManager.getWidth() : 0) / 20;
        }
        int i7 = this.totalDelta + i5;
        this.totalDelta = i7;
        if (i7 > i6) {
            this.totalDelta = 0;
            trackVisibleViews();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public void onPageSelected(int i4) {
        int i5;
        super.onPageSelected(i4);
        trackVisibleViews();
        int i6 = this.prevPosition;
        if (i4 == i6) {
            return;
        }
        if (i6 != -1) {
            this.divView.unbindViewFromDiv$div_release(this.pagerView);
        }
        if (i4 == -1) {
            this.prevPosition = i4;
            return;
        }
        int i7 = this.prevPosition;
        if (i7 != -1) {
            i5 = i4;
            this.divView.getDiv2Component$div_release().getDiv2Logger().logPagerChangePage(this.divView, this.items.get(i4).getExpressionResolver(), this.divPager, i5, i4 > i7 ? "next" : "back");
        } else {
            i5 = i4;
        }
        Z div = this.items.get(i5).getDiv();
        if (BaseDivViewExtensionsKt.getHasSightActions(div.b())) {
            this.divView.bindViewToDiv$div_release(this.pagerView, div);
        }
        this.prevPosition = i5;
    }
}
