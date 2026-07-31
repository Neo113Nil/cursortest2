package com.yandex.div.core.view2.divs.widgets;

import O1.C0860i3;
import O1.C0970o6;
import O1.Z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.R$style;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.gallery.DivGridLayoutManager;
import com.yandex.div.core.view2.divs.gallery.PagerSnapStartHelper;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public class DivRecyclerView extends BackHandlingRecyclerView implements DivHolderView<Z.e> {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final /* synthetic */ DivHolderViewMixin<Z.e> $$delegate_0;
    private int beforeScrollFocusPosition;
    private boolean needFling;

    @Nullable
    private OnInterceptTouchEventListener onInterceptTouchEventListener;

    @Nullable
    private PagerSnapStartHelper pagerSnapStartHelper;
    private int pointTouchX;
    private int pointTouchY;
    private float scrollInterceptionAngle;

    @NotNull
    private C0970o6.e scrollMode;
    private int scrollPointerId;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivRecyclerView(Context context, AttributeSet attributeSet, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : attributeSet, (i5 & 4) != 0 ? 0 : i4);
    }

    private boolean canScroll() {
        return canScrollHorizontally(-1) || canScrollHorizontally(1) || canScrollVertically(-1) || canScrollVertically(1);
    }

    private int toTouchPoint(float f4) {
        return (int) Math.ceil(f4);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void addSubscription(@Nullable Disposable disposable) {
        this.$$delegate_0.addSubscription(disposable);
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public void closeAllSubscription() {
        this.$$delegate_0.closeAllSubscription();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @Nullable View view, long j4) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i4, int i5) {
        boolean fling = super.fling(i4, i5);
        if (getScrollMode() == C0970o6.e.PAGING) {
            this.needFling = !fling;
        }
        return fling;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public BindingContext getBindingContext() {
        return this.$$delegate_0.getBindingContext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    @Nullable
    public Z.e getDiv() {
        return this.$$delegate_0.getDiv();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    @Nullable
    public DivBorderDrawer getDivBorderDrawer() {
        return this.$$delegate_0.getDivBorderDrawer();
    }

    @Nullable
    public View getItemView(int i4) {
        View childAt = getChildAt(i4);
        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup.getChildAt(0);
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
    public PagerSnapStartHelper getPagerSnapStartHelper() {
        return this.pagerSnapStartHelper;
    }

    public float getScrollInterceptionAngle() {
        return this.scrollInterceptionAngle;
    }

    @NotNull
    public C0970o6.e getScrollMode() {
        return this.scrollMode;
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

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent event) {
        int findPointerIndex;
        Intrinsics.checkNotNullParameter(event, "event");
        OnInterceptTouchEventListener onInterceptTouchEventListener = getOnInterceptTouchEventListener();
        if (onInterceptTouchEventListener != null ? onInterceptTouchEventListener.onInterceptTouchEvent(this, event) : false) {
            return true;
        }
        if (getScrollInterceptionAngle() == 0.0f) {
            return super.onInterceptTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        int actionIndex = event.getActionIndex();
        if (actionMasked == 0) {
            this.scrollPointerId = event.getPointerId(0);
            this.pointTouchX = toTouchPoint(event.getX());
            this.pointTouchY = toTouchPoint(event.getY());
            return super.onInterceptTouchEvent(event);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(event);
            }
            this.scrollPointerId = event.getPointerId(actionIndex);
            this.pointTouchX = toTouchPoint(event.getX(actionIndex));
            this.pointTouchY = toTouchPoint(event.getY(actionIndex));
            return super.onInterceptTouchEvent(event);
        }
        RecyclerView.p layoutManager = getLayoutManager();
        if (layoutManager == null || (findPointerIndex = event.findPointerIndex(this.scrollPointerId)) < 0) {
            return false;
        }
        int touchPoint = toTouchPoint(event.getX(findPointerIndex));
        int touchPoint2 = toTouchPoint(event.getY(findPointerIndex));
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(event);
        }
        int abs = Math.abs(touchPoint - this.pointTouchX);
        int abs2 = Math.abs(touchPoint2 - this.pointTouchY);
        if (abs == 0 && abs2 == 0) {
            return false;
        }
        double atan = abs != 0 ? (Math.atan(abs2 / abs) * 180) / 3.141592653589793d : 90.0d;
        return (layoutManager.canScrollHorizontally() && atan <= ((double) getScrollInterceptionAngle())) || (layoutManager.canScrollVertically() && atan > ((double) getScrollInterceptionAngle()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i4) {
        if (i4 == 2) {
            View focusedChild = getFocusedChild();
            if (focusedChild == null) {
                this.beforeScrollFocusPosition = -1;
                return;
            }
            this.beforeScrollFocusPosition = getChildAdapterPosition(focusedChild);
        }
        super.onScrollStateChanged(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    @Override // androidx.recyclerview.widget.RecyclerView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrolled(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        DivViewWrapper divViewWrapper;
        View child;
        if (this.beforeScrollFocusPosition == -1) {
            return;
        }
        RecyclerView.p layoutManager = getLayoutManager();
        int orientation = layoutManager instanceof LinearLayoutManager ? ((LinearLayoutManager) layoutManager).getOrientation() : layoutManager instanceof DivGridLayoutManager ? ((DivGridLayoutManager) layoutManager).getOrientation() : 0;
        if (orientation != 1 || i5 <= 0) {
            if (orientation == 1 && i5 <= 0) {
                i6 = this.beforeScrollFocusPosition;
            } else if (i4 > 0) {
                i7 = this.beforeScrollFocusPosition;
            } else {
                i6 = this.beforeScrollFocusPosition;
            }
            i8 = i6 - 1;
            RecyclerView.E findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i8);
            KeyEvent.Callback callback = findViewHolderForAdapterPosition == null ? findViewHolderForAdapterPosition.itemView : null;
            divViewWrapper = callback instanceof DivViewWrapper ? (DivViewWrapper) callback : null;
            if (divViewWrapper != null && (child = divViewWrapper.getChild()) != null) {
                child.requestFocus();
            }
            super.onScrolled(i4, i5);
        }
        i7 = this.beforeScrollFocusPosition;
        i8 = i7 + 1;
        RecyclerView.E findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i8);
        if (findViewHolderForAdapterPosition2 == null) {
        }
        if (callback instanceof DivViewWrapper) {
        }
        if (divViewWrapper != null) {
            child.requestFocus();
        }
        super.onScrolled(i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        onBoundsChanged(i4, i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        RecyclerView.p layoutManager;
        PagerSnapStartHelper pagerSnapStartHelper;
        View findSnapView;
        int i4;
        C0970o6.e scrollMode = getScrollMode();
        C0970o6.e eVar = C0970o6.e.PAGING;
        if (scrollMode == eVar) {
            this.needFling = true;
        }
        boolean z4 = super.onTouchEvent(motionEvent) && canScroll();
        if (motionEvent != null && motionEvent.getActionMasked() == 1 && getScrollMode() == eVar && this.needFling && (layoutManager = getLayoutManager()) != null && (pagerSnapStartHelper = getPagerSnapStartHelper()) != null && (findSnapView = pagerSnapStartHelper.findSnapView(layoutManager)) != null) {
            int[] calculateDistanceToFinalSnap = pagerSnapStartHelper.calculateDistanceToFinalSnap(layoutManager, findSnapView);
            if (calculateDistanceToFinalSnap.length >= 2 && ((i4 = calculateDistanceToFinalSnap[0]) != 0 || calculateDistanceToFinalSnap[1] != 0)) {
                smoothScrollBy(i4, calculateDistanceToFinalSnap[1]);
            }
        }
        return z4;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView, com.yandex.div.internal.core.ExpressionSubscriber, com.yandex.div.core.view2.Releasable
    public void release() {
        super.release();
        Object adapter = getAdapter();
        if (adapter instanceof Releasable) {
            ((Releasable) adapter).release();
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void releaseBorderDrawer() {
        this.$$delegate_0.releaseBorderDrawer();
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

    @Override // com.yandex.div.core.view2.divs.widgets.DivHolderView
    public void setDiv(@Nullable Z.e eVar) {
        this.$$delegate_0.setDiv(eVar);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.DivBorderSupports
    public void setNeedClipping(boolean z4) {
        this.$$delegate_0.setNeedClipping(z4);
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.onInterceptTouchEventListener = onInterceptTouchEventListener;
    }

    public void setPagerSnapStartHelper(@Nullable PagerSnapStartHelper pagerSnapStartHelper) {
        this.pagerSnapStartHelper = pagerSnapStartHelper;
    }

    public void setScrollInterceptionAngle(float f4) {
        this.scrollInterceptionAngle = f4 != 0.0f ? Math.abs(f4) % 90 : 0.0f;
    }

    public void setScrollMode(@NotNull C0970o6.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.scrollMode = eVar;
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
    public DivRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(new d(context, R$style.Div_Gallery), attributeSet, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        this.$$delegate_0 = new DivHolderViewMixin<>();
        this.scrollPointerId = -1;
        this.scrollMode = C0970o6.e.DEFAULT;
        this.beforeScrollFocusPosition = -1;
    }
}
