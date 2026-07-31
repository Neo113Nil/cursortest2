package androidx.recyclerview.widget;

import O1.C0970o6;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.core.view2.divs.gallery.ScrollPosition;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.widget.DivLayoutParams;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class DivLinearLayoutManager extends LinearLayoutManager implements DivGalleryItemHelper {

    /* renamed from: a, reason: collision with root package name */
    private final BindingContext f12829a;

    /* renamed from: b, reason: collision with root package name */
    private final RecyclerView f12830b;

    /* renamed from: c, reason: collision with root package name */
    private final C0970o6 f12831c;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f12832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivLinearLayoutManager(BindingContext bindingContext, RecyclerView view, C0970o6 div, int i4) {
        super(view.getContext(), i4, false);
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(div, "div");
        this.f12829a = bindingContext;
        this.f12830b = view;
        this.f12831c = div;
        this.f12832d = new HashSet();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public DivLinearLayoutManager toLayoutManager() {
        return this;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public View _getChildAt(int i4) {
        return getChildAt(i4);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int _getPosition(View child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return getPosition(child);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void detachViewAt(int i4) {
        super.detachViewAt(i4);
        _detachViewAt(i4);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstCompletelyVisibleItemPosition() {
        return findFirstCompletelyVisibleItemPosition();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstVisibleItemPosition() {
        return findFirstVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public BindingContext getBindingContext() {
        return this.f12829a;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public C0970o6 getDiv() {
        return this.f12831c;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public DivItemBuilderResult getItemDiv(int i4) {
        RecyclerView.h adapter = getView().getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.yandex.div.core.view2.divs.gallery.DivGalleryAdapter");
        return (DivItemBuilderResult) CollectionsKt.getOrNull(((DivGalleryAdapter) adapter).getVisibleItems(), i4);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int getLayoutManagerOrientation() {
        return getOrientation();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public RecyclerView getView() {
        return this.f12830b;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPosition(int i4, ScrollPosition scrollPosition) {
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        DivGalleryItemHelper.instantScroll$default(this, i4, scrollPosition, 0, 4, null);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPositionWithOffset(int i4, int i5, ScrollPosition scrollPosition) {
        Intrinsics.checkNotNullParameter(scrollPosition, "scrollPosition");
        instantScroll(i4, scrollPosition, i5);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastCompletelyVisibleItemPosition() {
        return findLastCompletelyVisibleItemPosition();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastVisibleItemPosition() {
        return findLastVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void layoutDecoratedWithMargins(View child, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(child, "child");
        DivGalleryItemHelper._layoutDecoratedWithMargins$default(this, child, i4, i5, i6, i7, false, 32, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void measureChildWithMargins(View child, int i4, int i5) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.DivLinearLayoutManager.DivRecyclerViewLayoutParams");
        a aVar = (a) layoutParams;
        Rect itemDecorInsetsForChild = getView().getItemDecorInsetsForChild(child);
        int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + i4 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, ((ViewGroup.MarginLayoutParams) aVar).width, aVar.f(), canScrollHorizontally());
        int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + i5 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom, ((ViewGroup.MarginLayoutParams) aVar).height, aVar.e(), canScrollVertically());
        if (shouldMeasureChild(child, childMeasureSpec, childMeasureSpec2, aVar)) {
            child.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onAttachedToWindow(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAttachedToWindow(view);
        _onAttachedToWindow(view);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView view, RecyclerView.w recycler) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        super.onDetachedFromWindow(view, recycler);
        _onDetachedFromWindow(view, recycler);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.A a4) {
        _onLayoutCompleted(a4);
        super.onLayoutCompleted(a4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void removeAndRecycleAllViews(RecyclerView.w recycler) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        _removeAndRecycleAllViews(recycler);
        super.removeAndRecycleAllViews(recycler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void removeView(View child) {
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
    public void superLayoutDecoratedWithMargins(View child, int i4, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(child, "child");
        super.layoutDecoratedWithMargins(child, i4, i5, i6, i7);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int width() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof RecyclerView.q ? new a((RecyclerView.q) layoutParams) : layoutParams instanceof DivLayoutParams ? new a((DivLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public HashSet getChildrenToRelayout() {
        return this.f12832d;
    }

    public static final class a extends RecyclerView.q {

        /* renamed from: e, reason: collision with root package name */
        private int f12833e;

        /* renamed from: f, reason: collision with root package name */
        private int f12834f;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12833e = Integer.MAX_VALUE;
            this.f12834f = Integer.MAX_VALUE;
        }

        public final int e() {
            return this.f12833e;
        }

        public final int f() {
            return this.f12834f;
        }

        public a(int i4, int i5) {
            super(i4, i5);
            this.f12833e = Integer.MAX_VALUE;
            this.f12834f = Integer.MAX_VALUE;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12833e = Integer.MAX_VALUE;
            this.f12834f = Integer.MAX_VALUE;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12833e = Integer.MAX_VALUE;
            this.f12834f = Integer.MAX_VALUE;
        }

        public a(RecyclerView.q qVar) {
            super(qVar);
            this.f12833e = Integer.MAX_VALUE;
            this.f12834f = Integer.MAX_VALUE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a source) {
            super((RecyclerView.q) source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.f12833e = Integer.MAX_VALUE;
            this.f12834f = Integer.MAX_VALUE;
            this.f12833e = source.f12833e;
            this.f12834f = source.f12834f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DivLayoutParams source) {
            super((ViewGroup.MarginLayoutParams) source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.f12833e = Integer.MAX_VALUE;
            this.f12834f = Integer.MAX_VALUE;
            this.f12833e = source.getMaxHeight();
            this.f12834f = source.getMaxWidth();
        }
    }
}
