package com.yandex.div.core.view2.divs.gallery;

import O1.C0970o6;
import O1.InterfaceC0752c3;
import O1.Yb;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.AbstractC3219i;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements DivGalleryItemHelper {

    @NotNull
    private final BindingContext bindingContext;

    @NotNull
    private final HashSet<View> childrenToRelayout;

    @NotNull
    private final C0970o6 div;

    @NotNull
    private final RecyclerView view;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivGridLayoutManager(@NotNull BindingContext bindingContext, @NotNull RecyclerView view, @NotNull C0970o6 div, int i4) {
        super(r0, i4);
        int i5;
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        Expression expression = div.f7298h;
        if (expression != null) {
            long longValue = ((Number) expression.evaluate(bindingContext.getExpressionResolver())).longValue();
            long j4 = longValue >> 31;
            if (j4 == 0 || j4 == -1) {
                i5 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + longValue + "' to Int");
                }
                i5 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i5 = 1;
        }
        this.bindingContext = bindingContext;
        this.view = view;
        this.div = div;
        this.childrenToRelayout = new HashSet<>();
    }

    private final int getCrossSpacing() {
        Expression expression = getDiv().f7301k;
        if (expression == null) {
            return getItemSpacing();
        }
        Long valueOf = Long.valueOf(((Number) expression.evaluate(getBindingContext().getExpressionResolver())).longValue());
        DisplayMetrics displayMetrics = getView().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "view.resources.displayMetrics");
        return BaseDivViewExtensionsKt.dpToPx(valueOf, displayMetrics);
    }

    private final int getItemSpacing() {
        Long l4 = (Long) getDiv().f7310t.evaluate(getBindingContext().getExpressionResolver());
        DisplayMetrics displayMetrics = getView().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "view.resources.displayMetrics");
        return BaseDivViewExtensionsKt.dpToPx(l4, displayMetrics);
    }

    private final int spacingByOrientation(int i4) {
        return i4 == getOrientation() ? getItemSpacing() : getCrossSpacing();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @Nullable
    public View _getChildAt(int i4) {
        return getChildAt(i4);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int _getPosition(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return getPosition(child);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void calculateItemDecorationsForChild(@NotNull View child, @NotNull Rect outRect) {
        DivItemBuilderResult itemDiv;
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        super.calculateItemDecorationsForChild(child, outRect);
        int _getPosition = _getPosition(child);
        if (_getPosition == -1 || (itemDiv = getItemDiv(_getPosition)) == null) {
            return;
        }
        InterfaceC0752c3 b4 = itemDiv.getDiv().b();
        boolean z4 = b4.getHeight() instanceof Yb.c;
        boolean z5 = b4.getWidth() instanceof Yb.c;
        int i4 = 0;
        boolean z6 = getSpanCount() > 1;
        int spacingByOrientation = (z4 && z6) ? spacingByOrientation(1) / 2 : 0;
        if (z5 && z6) {
            i4 = spacingByOrientation(0) / 2;
        }
        outRect.set(outRect.left - i4, outRect.top - spacingByOrientation, outRect.right - i4, outRect.bottom - spacingByOrientation);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void detachViewAt(int i4) {
        super.detachViewAt(i4);
        _detachViewAt(i4);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstCompletelyVisibleItemPosition() {
        int[] iArr = new int[g.d(getItemCount(), getSpanCount())];
        findFirstCompletelyVisibleItemPositions(iArr);
        return AbstractC3219i.F(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstVisibleItemPosition() {
        int[] iArr = new int[g.d(getItemCount(), getSpanCount())];
        findFirstVisibleItemPositions(iArr);
        return AbstractC3219i.F(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public C0970o6 getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @Nullable
    public DivItemBuilderResult getItemDiv(int i4) {
        RecyclerView.h adapter = getView().getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
        return (DivItemBuilderResult) CollectionsKt.getOrNull(((DivGalleryAdapter) adapter).getVisibleItems(), i4);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int getLayoutManagerOrientation() {
        return getOrientation();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getPaddingBottom() {
        return super.getPaddingBottom() - (spacingByOrientation(1) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getPaddingLeft() {
        return super.getPaddingLeft() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getPaddingRight() {
        return super.getPaddingRight() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getPaddingTop() {
        return super.getPaddingTop() - (spacingByOrientation(1) / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public RecyclerView getView() {
        return this.view;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPosition(int i4, @NotNull ScrollPosition scrollPosition) {
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        DivGalleryItemHelper.instantScroll$default(this, i4, scrollPosition, 0, 4, null);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPositionWithOffset(int i4, int i5, @NotNull ScrollPosition scrollPosition) {
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        instantScroll(i4, scrollPosition, i5);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastCompletelyVisibleItemPosition() {
        int[] iArr = new int[g.d(getItemCount(), getSpanCount())];
        findLastCompletelyVisibleItemPositions(iArr);
        return AbstractC3219i.p0(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastVisibleItemPosition() {
        int[] iArr = new int[g.d(getItemCount(), getSpanCount())];
        findLastVisibleItemPositions(iArr);
        return AbstractC3219i.p0(iArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void layoutDecoratedWithMargins(@NotNull View child, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(child, "child");
        DivGalleryItemHelper._layoutDecoratedWithMargins$default(this, child, i4, i5, i6, i7, false, 32, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAttachedToWindow(@NotNull RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        _onAttachedToWindow(view);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(@NotNull RecyclerView view, @NotNull RecyclerView.w recycler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        super.onDetachedFromWindow(view, recycler);
        _onDetachedFromWindow(view, recycler);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(@Nullable RecyclerView.A a4) {
        _onLayoutCompleted(a4);
        super.onLayoutCompleted(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void removeAndRecycleAllViews(@NotNull RecyclerView.w recycler) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        _removeAndRecycleAllViews(recycler);
        super.removeAndRecycleAllViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void removeView(@NotNull View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.removeView(child);
        _removeView(child);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void removeViewAt(int i4) {
        super.removeViewAt(i4);
        _removeViewAt(i4);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void superLayoutDecoratedWithMargins(@NotNull View child, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.layoutDecoratedWithMargins(child, i4, i5, i6, i7);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public DivGridLayoutManager toLayoutManager() {
        return this;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int width() {
        return getWidth();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    @NotNull
    public HashSet<View> getChildrenToRelayout() {
        return this.childrenToRelayout;
    }
}
