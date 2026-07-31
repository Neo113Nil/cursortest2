package com.google.android.material.bottomsheet;

import B.w;
import B.z;
import N.c;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1281a0;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import y.AbstractC3521a;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {
    private static final int DEF_STYLE_RES = R$style.Widget_Design_BottomSheet_Modal;
    int activePointerId;
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final c.AbstractC0021c dragCallback;
    private boolean draggable;
    float elevation;
    private int expandHalfwayActionId;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    int lastStableState;
    private MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference<View> nestedScrollingChildRef;
    private boolean paddingBottomSystemWindowInsets;
    private boolean paddingLeftSystemWindowInsets;
    private boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private BottomSheetBehavior<V>.SettleRunnable settleRunnable;
    private ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    private boolean skipCollapsed;
    int state;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    c viewDragHelper;
    WeakReference<V> viewRef;

    public static abstract class BottomSheetCallback {
        public abstract void onSlide(View view, float f4);

        public abstract void onStateChanged(View view, int i4);
    }

    private class SettleRunnable implements Runnable {
        private boolean isPosted;
        int targetState;
        private final View view;

        SettleRunnable(View view, int i4) {
            this.view = view;
            this.targetState = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = BottomSheetBehavior.this.viewDragHelper;
            if (cVar == null || !cVar.k(true)) {
                BottomSheetBehavior.this.setStateInternal(this.targetState);
            } else {
                AbstractC1281a0.g0(this.view, this);
            }
            this.isPosted = false;
        }
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.settleRunnable = null;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new c.AbstractC0021c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private long viewCapturedMillis;

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // N.c.AbstractC0021c
            public int clampViewPositionHorizontal(View view, int i4, int i5) {
                return view.getLeft();
            }

            @Override // N.c.AbstractC0021c
            public int clampViewPositionVertical(View view, int i4, int i5) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return AbstractC3521a.b(i4, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // N.c.AbstractC0021c
            public int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // N.c.AbstractC0021c
            public void onViewDragStateChanged(int i4) {
                if (i4 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // N.c.AbstractC0021c
            public void onViewPositionChanged(View view, int i4, int i5, int i6, int i7) {
                BottomSheetBehavior.this.dispatchOnSlide(i5);
            }

            @Override // N.c.AbstractC0021c
            public void onViewReleased(View view, float f4, float f5) {
                int i4;
                int i5 = 6;
                if (f5 < 0.0f) {
                    if (BottomSheetBehavior.this.fitToContents) {
                        i4 = BottomSheetBehavior.this.fitToContentsOffset;
                    } else {
                        int top = view.getTop();
                        long currentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                        if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            if (BottomSheetBehavior.this.shouldExpandOnUpwardDrag(currentTimeMillis, (top * 100.0f) / r10.parentHeight)) {
                                i4 = BottomSheetBehavior.this.expandedOffset;
                            } else {
                                i4 = BottomSheetBehavior.this.collapsedOffset;
                                i5 = 4;
                            }
                        } else {
                            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                            int i6 = bottomSheetBehavior.halfExpandedOffset;
                            if (top > i6) {
                                i4 = i6;
                            } else {
                                i4 = bottomSheetBehavior.getExpandedOffset();
                            }
                        }
                    }
                    i5 = 3;
                } else {
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior2.hideable && bottomSheetBehavior2.shouldHide(view, f5)) {
                        if ((Math.abs(f4) >= Math.abs(f5) || f5 <= 500.0f) && !releasedLow(view)) {
                            if (BottomSheetBehavior.this.fitToContents) {
                                i4 = BottomSheetBehavior.this.fitToContentsOffset;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                                i4 = BottomSheetBehavior.this.getExpandedOffset();
                            } else {
                                i4 = BottomSheetBehavior.this.halfExpandedOffset;
                            }
                            i5 = 3;
                        } else {
                            i4 = BottomSheetBehavior.this.parentHeight;
                            i5 = 5;
                        }
                    } else if (f5 == 0.0f || Math.abs(f4) > Math.abs(f5)) {
                        int top2 = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                            int i7 = bottomSheetBehavior3.halfExpandedOffset;
                            if (top2 >= i7) {
                                if (Math.abs(top2 - i7) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                                    i4 = BottomSheetBehavior.this.collapsedOffset;
                                } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    i4 = BottomSheetBehavior.this.collapsedOffset;
                                } else {
                                    i4 = BottomSheetBehavior.this.halfExpandedOffset;
                                }
                                i5 = 4;
                            } else if (top2 < Math.abs(top2 - bottomSheetBehavior3.collapsedOffset)) {
                                i4 = BottomSheetBehavior.this.getExpandedOffset();
                                i5 = 3;
                            } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i4 = BottomSheetBehavior.this.collapsedOffset;
                                i5 = 4;
                            } else {
                                i4 = BottomSheetBehavior.this.halfExpandedOffset;
                            }
                        } else if (Math.abs(top2 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            i4 = BottomSheetBehavior.this.fitToContentsOffset;
                            i5 = 3;
                        } else {
                            i4 = BottomSheetBehavior.this.collapsedOffset;
                            i5 = 4;
                        }
                    } else {
                        if (BottomSheetBehavior.this.fitToContents) {
                            i4 = BottomSheetBehavior.this.collapsedOffset;
                        } else {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                                i4 = BottomSheetBehavior.this.collapsedOffset;
                            } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i4 = BottomSheetBehavior.this.collapsedOffset;
                            } else {
                                i4 = BottomSheetBehavior.this.halfExpandedOffset;
                            }
                        }
                        i5 = 4;
                    }
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettlingAnimation(view, i5, i4, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // N.c.AbstractC0021c
            public boolean tryCaptureView(View view, int i4) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior.state;
                if (i5 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i5 == 3 && bottomSheetBehavior.activePointerId == i4) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
    }

    private int addAccessibilityActionForState(V v4, int i4, int i5) {
        return AbstractC1281a0.c(v4, v4.getResources().getString(i4), createAccessibilityViewCommandForState(i5));
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) (this.parentHeight * (1.0f - this.halfExpandedRatio));
    }

    private int calculatePeekHeight() {
        int i4;
        return this.peekHeightAuto ? Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight) + this.insetBottom : (this.gestureInsetBottomIgnored || this.paddingBottomSystemWindowInsets || (i4 = this.gestureInsetBottom) <= 0) ? this.peekHeight + this.insetBottom : Math.max(this.peekHeight, i4 + this.peekHeightGestureInsetBuffer);
    }

    private z createAccessibilityViewCommandForState(final int i4) {
        return new z() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            @Override // B.z
            public boolean perform(View view, z.a aVar) {
                BottomSheetBehavior.this.setState(i4);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z4) {
        createMaterialShapeDrawable(context, attributeSet, z4, null);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
                }
            }
        });
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v4) {
        ViewGroup.LayoutParams layoutParams = v4.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c e4 = ((CoordinatorLayout.f) layoutParams).e();
        if (e4 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) e4;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int getChildMeasureSpec(int i4, int i5, int i6, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, i5, i7);
        if (i6 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i6), 1073741824);
        }
        if (size != 0) {
            i6 = Math.min(size, i6);
        }
        return View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private void replaceAccessibilityActionForState(V v4, w.a aVar, int i4) {
        AbstractC1281a0.k0(v4, aVar, null, createAccessibilityViewCommandForState(i4));
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i4 = this.saveFlags;
        if (i4 == 0) {
            return;
        }
        if (i4 == -1 || (i4 & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i4 == -1 || (i4 & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i4 == -1 || (i4 & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i4 == -1 || (i4 & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void setWindowInsetsListener(View view) {
        final boolean z4 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || z4) {
            ViewUtils.doOnApplyWindowInsets(view, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
                @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
                    BottomSheetBehavior.this.insetTop = windowInsetsCompat.getSystemWindowInsetTop();
                    boolean isLayoutRtl = ViewUtils.isLayoutRtl(view2);
                    int paddingBottom = view2.getPaddingBottom();
                    int paddingLeft = view2.getPaddingLeft();
                    int paddingRight = view2.getPaddingRight();
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                        BottomSheetBehavior.this.insetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
                        paddingBottom = relativePadding.bottom + BottomSheetBehavior.this.insetBottom;
                    }
                    if (BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                        paddingLeft = (isLayoutRtl ? relativePadding.end : relativePadding.start) + windowInsetsCompat.getSystemWindowInsetLeft();
                    }
                    if (BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                        paddingRight = (isLayoutRtl ? relativePadding.start : relativePadding.end) + windowInsetsCompat.getSystemWindowInsetRight();
                    }
                    view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                    if (z4) {
                        BottomSheetBehavior.this.gestureInsetBottom = windowInsetsCompat.getMandatorySystemGestureInsets().bottom;
                    }
                    if (!BottomSheetBehavior.this.paddingBottomSystemWindowInsets && !z4) {
                        return windowInsetsCompat;
                    }
                    BottomSheetBehavior.this.updatePeekHeight(false);
                    return windowInsetsCompat;
                }
            });
        }
    }

    private void settleToStatePendingLayout(final int i4) {
        final V v4 = this.viewRef.get();
        if (v4 == null) {
            return;
        }
        ViewParent parent = v4.getParent();
        if (parent != null && parent.isLayoutRequested() && AbstractC1281a0.S(v4)) {
            v4.post(new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.settleToState(v4, i4);
                }
            });
        } else {
            settleToState(v4, i4);
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    private void updateAccessibilityActions() {
        V v4;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v4 = weakReference.get()) == null) {
            return;
        }
        AbstractC1281a0.i0(v4, 524288);
        AbstractC1281a0.i0(v4, 262144);
        AbstractC1281a0.i0(v4, 1048576);
        int i4 = this.expandHalfwayActionId;
        if (i4 != -1) {
            AbstractC1281a0.i0(v4, i4);
        }
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionId = addAccessibilityActionForState(v4, R$string.bottomsheet_action_expand_halfway, 6);
        }
        if (this.hideable && this.state != 5) {
            replaceAccessibilityActionForState(v4, w.a.f160y, 5);
        }
        int i5 = this.state;
        if (i5 == 3) {
            replaceAccessibilityActionForState(v4, w.a.f159x, this.fitToContents ? 4 : 6);
            return;
        }
        if (i5 == 4) {
            replaceAccessibilityActionForState(v4, w.a.f158w, this.fitToContents ? 3 : 6);
        } else {
            if (i5 != 6) {
                return;
            }
            replaceAccessibilityActionForState(v4, w.a.f159x, 4);
            replaceAccessibilityActionForState(v4, w.a.f158w, 3);
        }
    }

    private void updateDrawableForTargetState(int i4) {
        ValueAnimator valueAnimator;
        if (i4 == 2) {
            return;
        }
        boolean z4 = i4 == 3;
        if (this.isShapeExpanded != z4) {
            this.isShapeExpanded = z4;
            if (this.materialShapeDrawable == null || (valueAnimator = this.interpolatorAnimator) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.interpolatorAnimator.reverse();
                return;
            }
            float f4 = z4 ? 0.0f : 1.0f;
            this.interpolatorAnimator.setFloatValues(1.0f - f4, f4);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z4) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if (childAt != this.viewRef.get()) {
                    if (z4) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            AbstractC1281a0.z0(childAt, 4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        AbstractC1281a0.z0(childAt, this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (!z4) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z4) {
        V v4;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v4 = this.viewRef.get()) == null) {
                return;
            }
            if (z4) {
                settleToStatePendingLayout(this.state);
            } else {
                v4.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    void dispatchOnSlide(int i4) {
        float f4;
        float f5;
        V v4 = this.viewRef.get();
        if (v4 == null || this.callbacks.isEmpty()) {
            return;
        }
        int i5 = this.collapsedOffset;
        if (i4 > i5 || i5 == getExpandedOffset()) {
            int i6 = this.collapsedOffset;
            f4 = i6 - i4;
            f5 = this.parentHeight - i6;
        } else {
            int i7 = this.collapsedOffset;
            f4 = i7 - i4;
            f5 = i7 - getExpandedOffset();
        }
        float f6 = f4 / f5;
        for (int i8 = 0; i8 < this.callbacks.size(); i8++) {
            this.callbacks.get(i8).onSlide(v4, f6);
        }
    }

    View findScrollingChild(View view) {
        if (AbstractC1281a0.U(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i4));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getState() {
        return this.state;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onAttachedToLayoutParams(CoordinatorLayout.f fVar) {
        super.onAttachedToLayoutParams(fVar);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v4, MotionEvent motionEvent) {
        c cVar;
        if (!v4.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x4 = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x4, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v4, x4, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (cVar = this.viewDragHelper) != null && cVar.H(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.ignoreEvents || this.state == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.viewDragHelper == null || Math.abs(((float) this.initialY) - motionEvent.getY()) <= ((float) this.viewDragHelper.u())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v4, int i4) {
        MaterialShapeDrawable materialShapeDrawable;
        if (AbstractC1281a0.z(coordinatorLayout) && !AbstractC1281a0.z(v4)) {
            v4.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v4);
            this.viewRef = new WeakReference<>(v4);
            if (this.shapeThemingEnabled && (materialShapeDrawable = this.materialShapeDrawable) != null) {
                AbstractC1281a0.s0(v4, materialShapeDrawable);
            }
            MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
            if (materialShapeDrawable2 != null) {
                float f4 = this.elevation;
                if (f4 == -1.0f) {
                    f4 = AbstractC1281a0.x(v4);
                }
                materialShapeDrawable2.setElevation(f4);
                boolean z4 = this.state == 3;
                this.isShapeExpanded = z4;
                this.materialShapeDrawable.setInterpolation(z4 ? 0.0f : 1.0f);
            }
            updateAccessibilityActions();
            if (AbstractC1281a0.A(v4) == 0) {
                AbstractC1281a0.z0(v4, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = c.m(coordinatorLayout, this.dragCallback);
        }
        int top = v4.getTop();
        coordinatorLayout.onLayoutChild(v4, i4);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v4.getHeight();
        this.childHeight = height;
        int i5 = this.parentHeight;
        int i6 = i5 - height;
        int i7 = this.insetTop;
        if (i6 < i7) {
            if (this.paddingTopSystemWindowInsets) {
                this.childHeight = i5;
            } else {
                this.childHeight = i5 - i7;
            }
        }
        this.fitToContentsOffset = Math.max(0, i5 - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i8 = this.state;
        if (i8 == 3) {
            AbstractC1281a0.Z(v4, getExpandedOffset());
        } else if (i8 == 6) {
            AbstractC1281a0.Z(v4, this.halfExpandedOffset);
        } else if (this.hideable && i8 == 5) {
            AbstractC1281a0.Z(v4, this.parentHeight);
        } else if (i8 == 4) {
            AbstractC1281a0.Z(v4, this.collapsedOffset);
        } else if (i8 == 1 || i8 == 2) {
            AbstractC1281a0.Z(v4, top - v4.getTop());
        }
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v4));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v4, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v4.getLayoutParams();
        v4.measure(getChildMeasureSpec(i4, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i6, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v4, View view, float f4, float f5) {
        WeakReference<View> weakReference;
        return isNestedScrollingCheckEnabled() && (weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get() && (this.state != 3 || super.onNestedPreFling(coordinatorLayout, v4, view, f4, f5));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v4, View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.nestedScrollingChildRef;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v4.getTop();
            int i7 = top - i5;
            if (i5 > 0) {
                if (i7 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    AbstractC1281a0.Z(v4, -expandedOffset);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i5;
                    AbstractC1281a0.Z(v4, -i5);
                    setStateInternal(1);
                }
            } else if (i5 < 0 && !view.canScrollVertically(-1)) {
                int i8 = this.collapsedOffset;
                if (i7 > i8 && !this.hideable) {
                    int i9 = top - i8;
                    iArr[1] = i9;
                    AbstractC1281a0.Z(v4, -i9);
                    setStateInternal(4);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i5;
                    AbstractC1281a0.Z(v4, -i5);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(v4.getTop());
            this.lastNestedScrollDy = i5;
            this.nestedScrolled = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v4, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v4, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v4, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i4 = savedState.state;
        if (i4 == 1 || i4 == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i4;
            this.lastStableState = i4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v4) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v4), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v4, View view, View view2, int i4, int i5) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i4 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v4, View view, int i4) {
        int i5;
        WeakReference<View> weakReference;
        int i6 = 3;
        if (v4.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || ((weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get() && this.nestedScrolled)) {
            if (this.lastNestedScrollDy > 0) {
                if (this.fitToContents) {
                    i5 = this.fitToContentsOffset;
                } else {
                    int top = v4.getTop();
                    int i7 = this.halfExpandedOffset;
                    if (top > i7) {
                        i6 = 6;
                        i5 = i7;
                    } else {
                        i5 = getExpandedOffset();
                    }
                }
            } else if (this.hideable && shouldHide(v4, getYVelocity())) {
                i5 = this.parentHeight;
                i6 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top2 = v4.getTop();
                if (!this.fitToContents) {
                    int i8 = this.halfExpandedOffset;
                    if (top2 < i8) {
                        if (top2 < Math.abs(top2 - this.collapsedOffset)) {
                            i5 = getExpandedOffset();
                        } else if (shouldSkipHalfExpandedStateWhenDragging()) {
                            i5 = this.collapsedOffset;
                            i6 = 4;
                        } else {
                            i5 = this.halfExpandedOffset;
                            i6 = 6;
                        }
                    } else if (Math.abs(top2 - i8) < Math.abs(top2 - this.collapsedOffset)) {
                        i5 = this.halfExpandedOffset;
                        i6 = 6;
                    } else {
                        i5 = this.collapsedOffset;
                        i6 = 4;
                    }
                } else if (Math.abs(top2 - this.fitToContentsOffset) < Math.abs(top2 - this.collapsedOffset)) {
                    i5 = this.fitToContentsOffset;
                } else {
                    i5 = this.collapsedOffset;
                    i6 = 4;
                }
            } else {
                if (this.fitToContents) {
                    i5 = this.collapsedOffset;
                } else {
                    int top3 = v4.getTop();
                    if (Math.abs(top3 - this.halfExpandedOffset) < Math.abs(top3 - this.collapsedOffset)) {
                        i5 = this.halfExpandedOffset;
                        i6 = 6;
                    } else {
                        i5 = this.collapsedOffset;
                    }
                }
                i6 = 4;
            }
            startSettlingAnimation(v4, i6, i5, false);
            this.nestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v4, MotionEvent motionEvent) {
        if (!v4.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.z(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents && Math.abs(this.initialY - motionEvent.getY()) > this.viewDragHelper.u()) {
            this.viewDragHelper.b(v4, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setDraggable(boolean z4) {
        this.draggable = z4;
    }

    public void setExpandedOffset(int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.expandedOffset = i4;
    }

    public void setFitToContents(boolean z4) {
        if (this.fitToContents == z4) {
            return;
        }
        this.fitToContents = z4;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z4) {
        this.gestureInsetBottomIgnored = z4;
    }

    public void setHalfExpandedRatio(float f4) {
        if (f4 <= 0.0f || f4 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f4;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideable(boolean z4) {
        if (this.hideable != z4) {
            this.hideable = z4;
            if (!z4 && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setMaxHeight(int i4) {
        this.maxHeight = i4;
    }

    public void setMaxWidth(int i4) {
        this.maxWidth = i4;
    }

    public void setPeekHeight(int i4) {
        setPeekHeight(i4, false);
    }

    public void setSaveFlags(int i4) {
        this.saveFlags = i4;
    }

    public void setSkipCollapsed(boolean z4) {
        this.skipCollapsed = z4;
    }

    public void setState(int i4) {
        if (i4 == this.state) {
            return;
        }
        if (this.viewRef != null) {
            settleToStatePendingLayout(i4);
            return;
        }
        if (i4 == 4 || i4 == 3 || i4 == 6 || (this.hideable && i4 == 5)) {
            this.state = i4;
            this.lastStableState = i4;
        }
    }

    void setStateInternal(int i4) {
        V v4;
        if (this.state == i4) {
            return;
        }
        this.state = i4;
        if (i4 == 4 || i4 == 3 || i4 == 6 || (this.hideable && i4 == 5)) {
            this.lastStableState = i4;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v4 = weakReference.get()) == null) {
            return;
        }
        if (i4 == 3) {
            updateImportantForAccessibility(true);
        } else if (i4 == 6 || i4 == 5 || i4 == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i4);
        for (int i5 = 0; i5 < this.callbacks.size(); i5++) {
            this.callbacks.get(i5).onStateChanged(v4, i4);
        }
        updateAccessibilityActions();
    }

    void settleToState(View view, int i4) {
        int i5;
        int i6;
        if (i4 == 4) {
            i5 = this.collapsedOffset;
        } else if (i4 == 6) {
            i5 = this.halfExpandedOffset;
            if (this.fitToContents && i5 <= (i6 = this.fitToContentsOffset)) {
                i4 = 3;
                i5 = i6;
            }
        } else if (i4 == 3) {
            i5 = getExpandedOffset();
        } else {
            if (!this.hideable || i4 != 5) {
                Log.w("BottomSheetBehavior", "The bottom sheet may be in an invalid state. Ensure `hideable` is true when using `STATE_HIDDEN`.");
                return;
            }
            i5 = this.parentHeight;
        }
        startSettlingAnimation(view, i4, i5, false);
    }

    public boolean shouldExpandOnUpwardDrag(long j4, float f4) {
        return false;
    }

    boolean shouldHide(View view, float f4) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f4 * 0.1f)) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    void startSettlingAnimation(View view, int i4, int i5, boolean z4) {
        c cVar = this.viewDragHelper;
        if (cVar == null || (!z4 ? cVar.I(view, view.getLeft(), i5) : cVar.G(view.getLeft(), i5))) {
            setStateInternal(i4);
            return;
        }
        setStateInternal(2);
        updateDrawableForTargetState(i4);
        if (this.settleRunnable == null) {
            this.settleRunnable = new SettleRunnable(view, i4);
        }
        if (((SettleRunnable) this.settleRunnable).isPosted) {
            this.settleRunnable.targetState = i4;
            return;
        }
        BottomSheetBehavior<V>.SettleRunnable settleRunnable = this.settleRunnable;
        settleRunnable.targetState = i4;
        AbstractC1281a0.g0(view, settleRunnable);
        ((SettleRunnable) this.settleRunnable).isPosted = true;
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z4, ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = ShapeAppearanceModel.builder(context, attributeSet, R$attr.bottomSheetStyle, DEF_STYLE_RES).build();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = materialShapeDrawable;
            materialShapeDrawable.initializeElevationOverlay(context);
            if (z4 && colorStateList != null) {
                this.materialShapeDrawable.setFillColor(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.materialShapeDrawable.setTint(typedValue.data);
        }
    }

    public final void setPeekHeight(int i4, boolean z4) {
        if (i4 == -1) {
            if (this.peekHeightAuto) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!this.peekHeightAuto && this.peekHeight == i4) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i4);
        }
        updatePeekHeight(z4);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        };
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i4;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.settleRunnable = null;
        this.halfExpandedRatio = 0.5f;
        this.elevation = -1.0f;
        this.draggable = true;
        this.state = 4;
        this.lastStableState = 4;
        this.callbacks = new ArrayList<>();
        this.expandHalfwayActionId = -1;
        this.dragCallback = new c.AbstractC0021c() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
            private long viewCapturedMillis;

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.parentHeight + bottomSheetBehavior.getExpandedOffset()) / 2;
            }

            @Override // N.c.AbstractC0021c
            public int clampViewPositionHorizontal(View view, int i42, int i5) {
                return view.getLeft();
            }

            @Override // N.c.AbstractC0021c
            public int clampViewPositionVertical(View view, int i42, int i5) {
                int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return AbstractC3521a.b(i42, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
            }

            @Override // N.c.AbstractC0021c
            public int getViewVerticalDragRange(View view) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // N.c.AbstractC0021c
            public void onViewDragStateChanged(int i42) {
                if (i42 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // N.c.AbstractC0021c
            public void onViewPositionChanged(View view, int i42, int i5, int i6, int i7) {
                BottomSheetBehavior.this.dispatchOnSlide(i5);
            }

            @Override // N.c.AbstractC0021c
            public void onViewReleased(View view, float f4, float f5) {
                int i42;
                int i5 = 6;
                if (f5 < 0.0f) {
                    if (BottomSheetBehavior.this.fitToContents) {
                        i42 = BottomSheetBehavior.this.fitToContentsOffset;
                    } else {
                        int top = view.getTop();
                        long currentTimeMillis = System.currentTimeMillis() - this.viewCapturedMillis;
                        if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            if (BottomSheetBehavior.this.shouldExpandOnUpwardDrag(currentTimeMillis, (top * 100.0f) / r10.parentHeight)) {
                                i42 = BottomSheetBehavior.this.expandedOffset;
                            } else {
                                i42 = BottomSheetBehavior.this.collapsedOffset;
                                i5 = 4;
                            }
                        } else {
                            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                            int i6 = bottomSheetBehavior.halfExpandedOffset;
                            if (top > i6) {
                                i42 = i6;
                            } else {
                                i42 = bottomSheetBehavior.getExpandedOffset();
                            }
                        }
                    }
                    i5 = 3;
                } else {
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior2.hideable && bottomSheetBehavior2.shouldHide(view, f5)) {
                        if ((Math.abs(f4) >= Math.abs(f5) || f5 <= 500.0f) && !releasedLow(view)) {
                            if (BottomSheetBehavior.this.fitToContents) {
                                i42 = BottomSheetBehavior.this.fitToContentsOffset;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                                i42 = BottomSheetBehavior.this.getExpandedOffset();
                            } else {
                                i42 = BottomSheetBehavior.this.halfExpandedOffset;
                            }
                            i5 = 3;
                        } else {
                            i42 = BottomSheetBehavior.this.parentHeight;
                            i5 = 5;
                        }
                    } else if (f5 == 0.0f || Math.abs(f4) > Math.abs(f5)) {
                        int top2 = view.getTop();
                        if (!BottomSheetBehavior.this.fitToContents) {
                            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                            int i7 = bottomSheetBehavior3.halfExpandedOffset;
                            if (top2 >= i7) {
                                if (Math.abs(top2 - i7) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                                    i42 = BottomSheetBehavior.this.collapsedOffset;
                                } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                    i42 = BottomSheetBehavior.this.collapsedOffset;
                                } else {
                                    i42 = BottomSheetBehavior.this.halfExpandedOffset;
                                }
                                i5 = 4;
                            } else if (top2 < Math.abs(top2 - bottomSheetBehavior3.collapsedOffset)) {
                                i42 = BottomSheetBehavior.this.getExpandedOffset();
                                i5 = 3;
                            } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i42 = BottomSheetBehavior.this.collapsedOffset;
                                i5 = 4;
                            } else {
                                i42 = BottomSheetBehavior.this.halfExpandedOffset;
                            }
                        } else if (Math.abs(top2 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            i42 = BottomSheetBehavior.this.fitToContentsOffset;
                            i5 = 3;
                        } else {
                            i42 = BottomSheetBehavior.this.collapsedOffset;
                            i5 = 4;
                        }
                    } else {
                        if (BottomSheetBehavior.this.fitToContents) {
                            i42 = BottomSheetBehavior.this.collapsedOffset;
                        } else {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                                i42 = BottomSheetBehavior.this.collapsedOffset;
                            } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i42 = BottomSheetBehavior.this.collapsedOffset;
                            } else {
                                i42 = BottomSheetBehavior.this.halfExpandedOffset;
                            }
                        }
                        i5 = 4;
                    }
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettlingAnimation(view, i5, i42, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // N.c.AbstractC0021c
            public boolean tryCaptureView(View view, int i42) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i5 = bottomSheetBehavior.state;
                if (i5 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i5 == 3 && bottomSheetBehavior.activePointerId == i42) {
                    WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
                return weakReference2 != null && weakReference2.get() == view;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BottomSheetBehavior_Layout);
        this.shapeThemingEnabled = obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_shapeAppearance);
        boolean hasValue = obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_backgroundTint);
        if (hasValue) {
            createMaterialShapeDrawable(context, attributeSet, hasValue, MaterialResources.getColorStateList(context, obtainStyledAttributes, R$styleable.BottomSheetBehavior_Layout_backgroundTint));
        } else {
            createMaterialShapeDrawable(context, attributeSet, hasValue);
        }
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(R$styleable.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        if (obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_android_maxWidth)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_android_maxWidth, -1));
        }
        if (obtainStyledAttributes.hasValue(R$styleable.BottomSheetBehavior_Layout_android_maxHeight)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_android_maxHeight, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null && (i4 = peekValue.data) == -1) {
            setPeekHeight(i4);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false));
        setFitToContents(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        setDraggable(obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_draggable, true));
        setSaveFlags(obtainStyledAttributes.getInt(R$styleable.BottomSheetBehavior_Layout_behavior_saveFlags, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(R$styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset);
        if (peekValue2 != null && peekValue2.type == 16) {
            setExpandedOffset(peekValue2.data);
        } else {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(R$styleable.BottomSheetBehavior_Layout_behavior_expandedOffset, 0));
        }
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(R$styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
