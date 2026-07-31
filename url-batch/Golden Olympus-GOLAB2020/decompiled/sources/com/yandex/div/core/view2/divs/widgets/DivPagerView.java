package com.yandex.div.core.view2.divs.widgets;

import O1.C0860i3;
import O1.Z;
import W1.h;
import W1.i;
import W1.l;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.div.R$id;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher;
import com.yandex.div.core.view2.divs.widgets.DivPagerView$accessibilityDelegate$2;
import com.yandex.div.core.widget.ViewPager2Wrapper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivPagerView extends ViewPager2Wrapper implements DivHolderView<Z.k> {
    private final /* synthetic */ DivHolderViewMixin<Z.k> $$delegate_0;

    @NotNull
    private final h accessibilityDelegate$delegate;

    @Nullable
    private ViewPager2.i changePageCallbackForLogger;

    @Nullable
    private OffScreenPagesUpdateCallback changePageCallbackForOffScreenPages;

    @Nullable
    private ViewPager2.i changePageCallbackForState;

    @NotNull
    private final List<ViewPager2.i> changePageCallbacksForIndicators;

    @Nullable
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    @Nullable
    private OnItemsUpdatedCallback pagerOnItemsCountChange;

    @Nullable
    private PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher;

    @Metadata
    public static abstract class OffScreenPagesUpdateCallback extends ViewPager2.i implements View.OnLayoutChangeListener {
        public void onLayoutChange(@Nullable View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        }
    }

    @Metadata
    public interface OnItemsUpdatedCallback {
        void onItemsUpdated();
    }

    public /* synthetic */ DivPagerView(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    private DivPagerView$accessibilityDelegate$2.AnonymousClass1 getAccessibilityDelegate() {
        return (DivPagerView$accessibilityDelegate$2.AnonymousClass1) this.accessibilityDelegate$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer getFocusedChildPos(View view) {
        while (!Intrinsics.areEqual(view, this)) {
            Object tag = view.getTag(R$id.div_pager_item_clip_id);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num != null) {
                return Integer.valueOf(num.intValue());
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
            if (view == null) {
                break;
            }
        }
        return null;
    }

    public void addChangePageCallbackForIndicators(@NotNull ViewPager2.i callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.changePageCallbacksForIndicators.add(callback);
        getViewPager().h(callback);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    public void clearChangePageCallbackForIndicators() {
        Iterator<T> it = this.changePageCallbacksForIndicators.iterator();
        while (it.hasNext()) {
            getViewPager().p((ViewPager2.i) it.next());
        }
        this.changePageCallbacksForIndicators.clear();
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.clipCorners(canvas);
            super.draw(canvas);
            divBorderDrawer.drawBorder(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View view, long j4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    public void enableAccessibility() {
        RecyclerView recyclerView;
        DivPagerView$accessibilityDelegate$2.AnonymousClass1 accessibilityDelegate = getAccessibilityDelegate();
        if (accessibilityDelegate == null || (recyclerView = getRecyclerView()) == null) {
            return;
        }
        recyclerView.setAccessibilityDelegateCompat(accessibilityDelegate);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    @Nullable
    public ViewPager2.i getChangePageCallbackForLogger$div_release() {
        return this.changePageCallbackForLogger;
    }

    @Nullable
    public OffScreenPagesUpdateCallback getChangePageCallbackForOffScreenPages$div_release() {
        return this.changePageCallbackForOffScreenPages;
    }

    @Nullable
    public ViewPager2.i getChangePageCallbackForState$div_release() {
        return this.changePageCallbackForState;
    }

    public boolean getClipToPage$div_release() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            return recyclerView.getClipChildren();
        }
        return false;
    }

    public int getCurrentItem$div_release() {
        return getViewPager().getCurrentItem();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public Z.k getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public boolean getNeedClipping() {
        return this.$$delegate_0.getNeedClipping();
    }

    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.onInterceptTouchEventListener;
    }

    @Nullable
    public View getPageView(int i4) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return null;
        }
        View childAt = recyclerView.getChildAt(i4);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    @Nullable
    public OnItemsUpdatedCallback getPagerOnItemsCountChange$div_release() {
        return this.pagerOnItemsCountChange;
    }

    @Nullable
    public PagerSelectedActionsDispatcher getPagerSelectedActionsDispatcher$div_release() {
        return this.pagerSelectedActionsDispatcher;
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    @NotNull
    public List<Disposable> getSubscriptions() {
        return this.$$delegate_0.getSubscriptions();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void invalidateBorder() {
        this.$$delegate_0.invalidateBorder();
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.$$delegate_0.isTransient();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void onBoundsChanged(int i4, int i5) {
        this.$$delegate_0.onBoundsChanged(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        return (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, event) : false) || super.onInterceptTouchEvent(event);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        onBoundsChanged(i4, i5);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        this.$$delegate_0.release();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
    }

    public void removeChangePageCallbackForIndicators(@NotNull ViewPager2.i callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.changePageCallbacksForIndicators.remove(callback);
        getViewPager().p(callback);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setBindingContext(@Nullable BindingContext bindingContext) {
        this.$$delegate_0.setBindingContext(bindingContext);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setBorder(@NotNull BindingContext bindingContext, @Nullable C0860i3 c0860i3, @NotNull View view) {
        Intrinsics.checkNotNullParameter(bindingContext, "bindingContext");
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.setBorder(bindingContext, c0860i3, view);
    }

    public void setChangePageCallbackForLogger$div_release(@Nullable ViewPager2.i iVar) {
        ViewPager2.i iVar2 = this.changePageCallbackForLogger;
        if (iVar2 != null) {
            getViewPager().p(iVar2);
        }
        if (iVar != null) {
            getViewPager().h(iVar);
        }
        this.changePageCallbackForLogger = iVar;
    }

    public void setChangePageCallbackForOffScreenPages$div_release(@Nullable OffScreenPagesUpdateCallback offScreenPagesUpdateCallback) {
        OffScreenPagesUpdateCallback offScreenPagesUpdateCallback2 = this.changePageCallbackForOffScreenPages;
        if (offScreenPagesUpdateCallback2 != null) {
            getViewPager().p(offScreenPagesUpdateCallback2);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                recyclerView.removeOnLayoutChangeListener(offScreenPagesUpdateCallback2);
            }
        }
        if (offScreenPagesUpdateCallback != null) {
            getViewPager().h(offScreenPagesUpdateCallback);
            RecyclerView recyclerView2 = getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.addOnLayoutChangeListener(offScreenPagesUpdateCallback);
            }
        }
        this.changePageCallbackForOffScreenPages = offScreenPagesUpdateCallback;
    }

    public void setChangePageCallbackForState$div_release(@Nullable ViewPager2.i iVar) {
        ViewPager2.i iVar2 = this.changePageCallbackForState;
        if (iVar2 != null) {
            getViewPager().p(iVar2);
        }
        if (iVar != null) {
            getViewPager().h(iVar);
        }
        this.changePageCallbackForState = iVar;
    }

    public void setClipToPage$div_release(boolean z4) {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.setClipChildren(z4);
    }

    public void setCurrentItem$div_release(int i4) {
        getViewPager().l(i4, false);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable Z.k kVar) {
        this.$$delegate_0.setDiv(kVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z4) {
        this.$$delegate_0.setNeedClipping(z4);
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerOnItemsCountChange$div_release(@Nullable OnItemsUpdatedCallback onItemsUpdatedCallback) {
        this.pagerOnItemsCountChange = onItemsUpdatedCallback;
    }

    public void setPagerSelectedActionsDispatcher$div_release(@Nullable PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher) {
        PagerSelectedActionsDispatcher pagerSelectedActionsDispatcher2 = this.pagerSelectedActionsDispatcher;
        if (pagerSelectedActionsDispatcher2 != null) {
            pagerSelectedActionsDispatcher2.detach(getViewPager());
        }
        if (pagerSelectedActionsDispatcher != null) {
            pagerSelectedActionsDispatcher.attach(getViewPager());
        }
        this.pagerSelectedActionsDispatcher = pagerSelectedActionsDispatcher;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.transitionFinished(view);
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.$$delegate_0.transitionStarted(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivPagerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.changePageCallbacksForIndicators = new ArrayList();
        this.accessibilityDelegate$delegate = i.a(l.f9608d, new DivPagerView$accessibilityDelegate$2(this));
    }
}
