package com.yandex.div.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.core.view2.divs.pager.DivPagerAdapter;
import com.yandex.div.core.view2.divs.pager.DivPagerPageTransformer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ViewPager2Wrapper extends FrameLayout {

    @Nullable
    private DivPagerPageTransformer pageTransformer;

    @NotNull
    private final ViewPager2 viewPager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPager2Wrapper(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewPager = new ViewPager2(context);
        addView(getViewPager());
    }

    private final int findMaxChildDimension(Function2<? super RecyclerView.p, ? super View, Integer> function2) {
        E e4 = new E();
        withRecyclerView(new ViewPager2Wrapper$findMaxChildDimension$1(e4, function2));
        return e4.f41130b;
    }

    private final void withRecyclerView(Function1<? super RecyclerView, Unit> function1) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        function1.invoke(recyclerView);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Nullable View view) {
        super.addView(view);
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    @Nullable
    public final DivPagerPageTransformer getPageTransformer$div_release() {
        return this.pageTransformer;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        View childAt = getViewPager().getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    @NotNull
    public ViewPager2 getViewPager() {
        return this.viewPager;
    }

    public final boolean isWrapContentAlongCrossAxis$div_release() {
        return (getOrientation() == 0 && getLayoutParams().height == -2) || (getOrientation() == 1 && getLayoutParams().width == -2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (!isWrapContentAlongCrossAxis$div_release()) {
            super.onMeasure(i4, i5);
            return;
        }
        measureChild(getViewPager(), i4, i5);
        int orientation = getOrientation();
        if (orientation == 0) {
            super.onMeasure(i4, ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxHeight$1.INSTANCE)));
        } else {
            if (orientation != 1) {
                return;
            }
            super.onMeasure(ViewsKt.makeExactSpec(findMaxChildDimension(ViewPager2Wrapper$onMeasure$maxWidth$1.INSTANCE)), i5);
        }
    }

    public final void setOrientation(int i4) {
        DivPagerAdapter divPagerAdapter = (DivPagerAdapter) getViewPager().getAdapter();
        if (getViewPager().getOrientation() == i4 && divPagerAdapter != null && divPagerAdapter.getOrientation() == i4) {
            return;
        }
        getViewPager().setOrientation(i4);
        if (divPagerAdapter != null) {
            divPagerAdapter.setOrientation(i4);
        }
        withRecyclerView(ViewPager2Wrapper$orientation$1.INSTANCE);
    }

    public final void setPageTransformer$div_release(@Nullable DivPagerPageTransformer divPagerPageTransformer) {
        this.pageTransformer = divPagerPageTransformer;
        getViewPager().setPageTransformer(divPagerPageTransformer);
    }

    public final void setRecycledViewPool(@NotNull RecyclerView.v viewPool) {
        Intrinsics.checkNotNullParameter(viewPool, "viewPool");
        withRecyclerView(new ViewPager2Wrapper$setRecycledViewPool$1(viewPool));
    }
}
