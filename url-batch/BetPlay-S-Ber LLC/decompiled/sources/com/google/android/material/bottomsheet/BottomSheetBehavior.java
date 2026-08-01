package com.google.android.material.bottomsheet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.awerser.monnit.betplay.R;
import defpackage.aa0;
import defpackage.ac0;
import defpackage.ay;
import defpackage.c0;
import defpackage.e90;
import defpackage.f;
import defpackage.g90;
import defpackage.gs;
import defpackage.h5;
import defpackage.h90;
import defpackage.ip;
import defpackage.j8;
import defpackage.l0;
import defpackage.l70;
import defpackage.ls;
import defpackage.ly;
import defpackage.n20;
import defpackage.o3;
import defpackage.o30;
import defpackage.o8;
import defpackage.op;
import defpackage.r7;
import defpackage.rd;
import defpackage.rt;
import defpackage.si;
import defpackage.t0;
import defpackage.ud;
import defpackage.v;
import defpackage.w;
import defpackage.w80;
import defpackage.x0;
import defpackage.x80;
import defpackage.x90;
import defpackage.z90;
import defpackage.zm;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends rd implements gs {
    private static final int CORNER_ANIMATION_DURATION = 500;
    static final int DEFAULT_SIGNIFICANT_VEL_THRESHOLD = 500;
    private static final int DEF_STYLE_RES = 2131756097;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int INVALID_POSITION = -1;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    static final int VIEW_INDEX_ACCESSIBILITY_DELEGATE_VIEW = 1;
    static final int VIEW_INDEX_BOTTOM_SHEET = 0;
    WeakReference<View> accessibilityDelegateViewRef;
    int activePointerId;
    private boolean autoExpandOnRequestChildRectangleOffscreen;
    private ColorStateList backgroundTint;
    ls bottomContainerBackHelper;
    private final ArrayList<BottomSheetCallback> callbacks;
    private int childHeight;
    final SparseIntArray collapseActionIds;
    int collapsedOffset;
    private WeakReference<View> currentTouchedScrollChildRef;
    private final g90 dragCallback;
    WeakReference<View> dragHandleViewRef;
    private boolean draggable;
    private boolean draggableOnNestedScroll;
    private boolean draggableOnNestedScrollLastDragIgnored;
    float elevation;
    final SparseIntArray expandActionIds;
    final SparseIntArray expandHalfwayActionIds;
    private boolean expandedCornersRemoved;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    private float hideFriction;
    boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    private int insetBottom;
    private int insetTop;
    private ValueAnimator interpolatorAnimator;
    private int lastNestedScrollDy;
    int lastStableState;
    private boolean marginLeftSystemWindowInsets;
    private boolean marginRightSystemWindowInsets;
    private boolean marginTopSystemWindowInsets;
    private rt materialShapeDrawable;
    private int maxHeight;
    private int maxWidth;
    private float maximumVelocity;
    private boolean multipleScrollingChildrenSupported;
    private boolean nestedScrolled;
    final List<WeakReference<View>> nestedScrollingChildrenRef;
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
    private n20 shapeAppearanceModelDefault;
    private final Rect sheetRect;
    private boolean shouldRemoveExpandedCorners;
    private int significantVelocityThreshold;
    private boolean skipCollapsed;
    int state;
    private final BottomSheetBehavior<V>.StateSettlingTracker stateSettlingTracker;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private VelocityTracker velocityTracker;
    h90 viewDragHelper;
    WeakReference<V> viewRef;

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StableState {
    }

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    public class StateSettlingTracker {
        private final Runnable continueSettlingRunnable;
        private boolean isContinueSettlingRunnablePosted;
        private int targetState;

        private StateSettlingTracker() {
            this.continueSettlingRunnable = new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.StateSettlingTracker.1
                @Override // java.lang.Runnable
                public void run() {
                    StateSettlingTracker.this.isContinueSettlingRunnablePosted = false;
                    h90 h90Var = BottomSheetBehavior.this.viewDragHelper;
                    if (h90Var != null && h90Var.f()) {
                        StateSettlingTracker stateSettlingTracker = StateSettlingTracker.this;
                        stateSettlingTracker.continueSettlingToState(stateSettlingTracker.targetState);
                        return;
                    }
                    StateSettlingTracker stateSettlingTracker2 = StateSettlingTracker.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.state == 2) {
                        bottomSheetBehavior.setStateInternal(stateSettlingTracker2.targetState);
                    }
                }
            };
        }

        public void continueSettlingToState(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.targetState = i;
            if (this.isContinueSettlingRunnablePosted) {
                return;
            }
            BottomSheetBehavior.this.viewRef.get().postOnAnimation(this.continueSettlingRunnable);
            this.isContinueSettlingRunnablePosted = true;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.draggableOnNestedScroll = true;
        this.autoExpandOnRequestChildRectangleOffscreen = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.nestedScrollingChildrenRef = new ArrayList();
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.expandActionIds = new SparseIntArray();
        this.collapseActionIds = new SparseIntArray();
        this.sheetRect = new Rect();
        this.dragCallback = new g90() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // defpackage.g90
            public int clampViewPositionHorizontal(View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // defpackage.g90
            public int clampViewPositionVertical(View view, int i2, int i3) {
                return l70.i(i2, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // defpackage.g90
            public int getViewVerticalDragRange(View view) {
                boolean canBeHiddenByDragging = BottomSheetBehavior.this.canBeHiddenByDragging();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return canBeHiddenByDragging ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // defpackage.g90
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // defpackage.g90
            public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                BottomSheetBehavior.this.dispatchOnSlide(i3);
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            
                if (r2.shouldExpandOnUpwardDrag(r0, (r10 * 100.0f) / r2.parentHeight) != false) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
            
                if (r10 > r2.halfExpandedOffset) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
            
                if (java.lang.Math.abs(r9.getTop() - r8.this$0.getExpandedOffset()) < java.lang.Math.abs(r9.getTop() - r8.this$0.halfExpandedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
            
                if (java.lang.Math.abs(r10 - r0.fitToContentsOffset) < java.lang.Math.abs(r10 - r8.this$0.collapsedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            @Override // defpackage.g90
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onViewReleased(View view, float f, float f2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.fitToContents) {
                        int top = view.getTop();
                        long uptimeMillis = SystemClock.uptimeMillis() - this.viewCapturedMillis;
                        boolean shouldSkipHalfExpandedStateWhenDragging = BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        if (shouldSkipHalfExpandedStateWhenDragging) {
                        }
                    }
                    i2 = 3;
                } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f2)) {
                    if ((Math.abs(f) >= Math.abs(f2) || f2 <= BottomSheetBehavior.this.significantVelocityThreshold) && !releasedLow(view)) {
                        if (!BottomSheetBehavior.this.fitToContents) {
                        }
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    boolean z = BottomSheetBehavior.this.fitToContents;
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!z) {
                        int i3 = bottomSheetBehavior3.halfExpandedOffset;
                        if (top2 < i3) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior3.collapsedOffset)) {
                            }
                            i2 = 3;
                        } else {
                            if (Math.abs(top2 - i3) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            }
                            i2 = 4;
                        }
                    }
                } else {
                    if (!BottomSheetBehavior.this.fitToContents) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                        }
                    }
                    i2 = 4;
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i2, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // defpackage.g90
            public boolean tryCaptureView(View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.state;
                if (i3 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.activePointerId == i2) {
                    boolean z = bottomSheetBehavior.multipleScrollingChildrenSupported;
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    View singleScrollingChildOrNull = z ? bottomSheetBehavior2.currentTouchedScrollChildRef != null ? (View) BottomSheetBehavior.this.currentTouchedScrollChildRef.get() : null : bottomSheetBehavior2.getSingleScrollingChildOrNull();
                    if (singleScrollingChildOrNull != null && singleScrollingChildOrNull.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = SystemClock.uptimeMillis();
                WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
                return weakReference != null && weakReference.get() == view;
            }
        };
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ly.a);
        if (obtainStyledAttributes.hasValue(3)) {
            this.backgroundTint = op.x(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(24)) {
            this.shapeAppearanceModelDefault = n20.g(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).a();
        }
        createMaterialShapeDrawableIfNeeded(context);
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(0, -1));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(1, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(12);
        if (peekValue == null || (i = peekValue.data) != -1) {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            setPeekHeight(i);
        }
        setHideable(obtainStyledAttributes.getBoolean(10, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(16, false));
        setFitToContents(obtainStyledAttributes.getBoolean(8, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(15, false));
        setDraggable(obtainStyledAttributes.getBoolean(5, true));
        setDraggableOnNestedScroll(obtainStyledAttributes.getBoolean(6, true));
        setSaveFlags(obtainStyledAttributes.getInt(13, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(9, HIDE_THRESHOLD));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(7);
        if (peekValue2 == null || peekValue2.type != 16) {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(7, 0));
        } else {
            setExpandedOffset(peekValue2.data);
        }
        setSignificantVelocityThreshold(obtainStyledAttributes.getInt(14, 500));
        this.multipleScrollingChildrenSupported = obtainStyledAttributes.getBoolean(11, false);
        this.autoExpandOnRequestChildRectangleOffscreen = obtainStyledAttributes.getBoolean(4, true);
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(20, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(21, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(22, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(23, true);
        this.marginLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(17, false);
        this.marginRightSystemWindowInsets = obtainStyledAttributes.getBoolean(18, false);
        this.marginTopSystemWindowInsets = obtainStyledAttributes.getBoolean(19, false);
        this.shouldRemoveExpandedCorners = obtainStyledAttributes.getBoolean(26, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private int addAccessibilityActionForState(View view, int i, int i2) {
        int i3;
        String string = view.getResources().getString(i);
        t0 createAccessibilityViewCommandForState = createAccessibilityViewCommandForState(i2);
        ArrayList f = e90.f(view);
        int i4 = 0;
        while (true) {
            if (i4 >= f.size()) {
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    int[] iArr = e90.d;
                    if (i5 >= 32 || i6 != -1) {
                        break;
                    }
                    int i7 = iArr[i5];
                    boolean z = true;
                    for (int i8 = 0; i8 < f.size(); i8++) {
                        z &= ((c0) f.get(i8)).a() != i7;
                    }
                    if (z) {
                        i6 = i7;
                    }
                    i5++;
                }
                i3 = i6;
            } else {
                if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((c0) f.get(i4)).a).getLabel())) {
                    i3 = ((c0) f.get(i4)).a();
                    break;
                }
                i4++;
            }
        }
        if (i3 != -1) {
            c0 c0Var = new c0(null, i3, string, createAccessibilityViewCommandForState, null);
            View.AccessibilityDelegate d = e90.d(view);
            w wVar = d == null ? null : d instanceof v ? ((v) d).a : new w(d);
            if (wVar == null) {
                wVar = new w();
            }
            e90.m(view, wVar);
            e90.j(view, c0Var.a());
            e90.f(view).add(c0Var);
            e90.h(view, 0);
        }
        return i3;
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        boolean z = this.fitToContents;
        int i = this.parentHeight;
        if (z) {
            this.collapsedOffset = Math.max(i - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = i - calculatePeekHeight;
        }
    }

    private float calculateCornerInterpolation(float f, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f2 = radius;
            if (f2 > 0.0f && f > 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * this.parentHeight);
    }

    private float calculateInterpolationWithCornersRemoved() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.materialShapeDrawable == null || (weakReference = this.viewRef) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        V v = this.viewRef.get();
        if (!isAtTopOfScreen() || (rootWindowInsets = v.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        float k = this.materialShapeDrawable.k();
        roundedCorner = rootWindowInsets.getRoundedCorner(0);
        float calculateCornerInterpolation = calculateCornerInterpolation(k, roundedCorner);
        rt rtVar = this.materialShapeDrawable;
        float[] fArr = rtVar.G;
        float a = fArr != null ? fArr[0] : rtVar.g.a.d().f.a(rtVar.g());
        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        return Math.max(calculateCornerInterpolation, calculateCornerInterpolation(a, roundedCorner2));
    }

    private int calculatePeekHeight() {
        int i;
        int i2;
        int i3;
        if (this.peekHeightAuto) {
            i = Math.min(Math.max(this.peekHeightMin, this.parentHeight - ((this.parentWidth * 9) / 16)), this.childHeight);
            i2 = this.insetBottom;
        } else {
            if (!this.gestureInsetBottomIgnored && !this.paddingBottomSystemWindowInsets && (i3 = this.gestureInsetBottom) > 0) {
                return Math.max(this.peekHeight, i3 + this.peekHeightGestureInsetBuffer);
            }
            i = this.peekHeight;
            i2 = this.insetBottom;
        }
        return i + i2;
    }

    private float calculateSlideOffsetWithTop(int i) {
        float f;
        float f2;
        int i2 = this.collapsedOffset;
        if (i > i2 || i2 == getExpandedOffset()) {
            int i3 = this.collapsedOffset;
            f = i3 - i;
            f2 = this.parentHeight - i3;
        } else {
            int i4 = this.collapsedOffset;
            f = i4 - i;
            f2 = i4 - getExpandedOffset();
        }
        return f / f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canBeHiddenByDragging() {
        return isHideable() && isHideableWhenDragging();
    }

    private void clearAccessibilityAction(View view, int i) {
        if (view == null) {
            return;
        }
        e90.j(view, 1048576);
        e90.h(view, 0);
        e90.j(view, 524288);
        e90.h(view, 0);
        e90.j(view, 262144);
        e90.h(view, 0);
        int i2 = this.expandActionIds.get(i, -1);
        if (i2 != -1) {
            e90.j(view, i2);
            e90.h(view, 0);
            this.expandActionIds.delete(i);
        }
        int i3 = this.expandHalfwayActionIds.get(i, -1);
        if (i3 != -1) {
            e90.j(view, i3);
            e90.h(view, 0);
            this.expandHalfwayActionIds.delete(i);
        }
        int i4 = this.collapseActionIds.get(i, -1);
        if (i4 != -1) {
            e90.j(view, i4);
            e90.h(view, 0);
            this.collapseActionIds.delete(i);
        }
    }

    private t0 createAccessibilityViewCommandForState(final int i) {
        return new t0() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.6
            @Override // defpackage.t0
            public boolean perform(View view, l0 l0Var) {
                BottomSheetBehavior.this.setState(i);
                return true;
            }
        };
    }

    private void createMaterialShapeDrawableIfNeeded(Context context) {
        if (this.shapeAppearanceModelDefault == null) {
            return;
        }
        rt rtVar = new rt(this.shapeAppearanceModelDefault);
        this.materialShapeDrawable = rtVar;
        rtVar.n(context);
        ColorStateList colorStateList = this.backgroundTint;
        if (colorStateList != null) {
            this.materialShapeDrawable.r(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
        this.materialShapeDrawable.setTint(typedValue.data);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(calculateInterpolationWithCornersRemoved(), 1.0f);
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500L);
        this.interpolatorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                    BottomSheetBehavior.this.materialShapeDrawable.s(floatValue);
                }
            }
        });
    }

    private View findScrollingChildContainingCoordinates(CoordinatorLayout coordinatorLayout, int i, int i2) {
        if (this.nestedScrollingChildrenRef.isEmpty()) {
            return null;
        }
        Iterator<WeakReference<View>> it = this.nestedScrollingChildrenRef.iterator();
        while (it.hasNext()) {
            View view = it.next().get();
            if (view != null && coordinatorLayout.o(view, i, i2)) {
                return view;
            }
        }
        return null;
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof ud)) {
            o8.j("The view is not a child of CoordinatorLayout");
            return null;
        }
        rd rdVar = ((ud) layoutParams).a;
        if (rdVar instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) rdVar;
        }
        o8.j("The view is not associated with BottomSheetBehavior");
        return null;
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static ay getDefaultBottomGradientProtection(Context context) {
        Integer p = j8.p(context, R.attr.colorSurfaceContainerLow);
        if (p == null) {
            p = Integer.valueOf(j8.L(context, l70.R(context, R.attr.colorSurface, TAG)));
        }
        return new zm(p.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getSingleScrollingChildOrNull() {
        if (this.nestedScrollingChildrenRef.isEmpty()) {
            return null;
        }
        return this.nestedScrollingChildrenRef.get(0).get();
    }

    private int getTopOffsetForState(int i) {
        if (i == 3) {
            return getExpandedOffset();
        }
        if (i == 4) {
            return this.collapsedOffset;
        }
        if (i == 5) {
            return this.parentHeight;
        }
        if (i == 6) {
            return this.halfExpandedOffset;
        }
        o8.j(o30.e("Invalid state to get top offset: ", i));
        return 0;
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private boolean hasScrollingChild() {
        Iterator<WeakReference<View>> it = this.nestedScrollingChildrenRef.iterator();
        while (it.hasNext()) {
            if (it.next().get() != null) {
                return true;
            }
        }
        return false;
    }

    private boolean isAtTopOfScreen() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.viewRef.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean isExpandedAndShouldRemoveCorners() {
        if (this.state == 3) {
            return this.shouldRemoveExpandedCorners || isAtTopOfScreen();
        }
        return false;
    }

    private boolean isLayouting(V v) {
        ViewParent parent = v.getParent();
        return parent != null && parent.isLayoutRequested() && v.isAttachedToWindow();
    }

    private boolean isTouchingDragHandle(CoordinatorLayout coordinatorLayout, int i, int i2) {
        WeakReference<View> weakReference = this.dragHandleViewRef;
        View view = weakReference != null ? weakReference.get() : null;
        return view != null && coordinatorLayout.o(view, i, i2);
    }

    private boolean isTouchingScrollingChild(CoordinatorLayout coordinatorLayout, MotionEvent motionEvent) {
        if (this.multipleScrollingChildrenSupported) {
            WeakReference<View> weakReference = this.currentTouchedScrollChildRef;
            return (weakReference == null || weakReference.get() == null) ? false : true;
        }
        View singleScrollingChildOrNull = getSingleScrollingChildOrNull();
        return singleScrollingChildOrNull != null && coordinatorLayout.o(singleScrollingChildOrNull, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    private boolean isViewScrollingChild(View view) {
        Iterator<WeakReference<View>> it = this.nestedScrollingChildrenRef.iterator();
        while (it.hasNext()) {
            if (it.next().get() == view) {
                return true;
            }
        }
        return false;
    }

    private void replaceAccessibilityActionForState(View view, c0 c0Var, int i) {
        e90.k(view, c0Var, null, createAccessibilityViewCommandForState(i));
    }

    private void reset() {
        this.activePointerId = -1;
        this.initialY = -1;
        this.currentTouchedScrollChildRef = null;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i = this.saveFlags;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.peekHeight = savedState.peekHeight;
        }
        if (i == -1 || (i & 2) == 2) {
            this.fitToContents = savedState.fitToContents;
        }
        if (i == -1 || (i & 4) == 4) {
            this.hideable = savedState.hideable;
        }
        if (i == -1 || (i & 8) == 8) {
            this.skipCollapsed = savedState.skipCollapsed;
        }
    }

    private void runAfterLayout(V v, Runnable runnable) {
        if (isLayouting(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void setWindowInsetsListener(View view) {
        final boolean z = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.peekHeightAuto) ? false : true;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || this.marginLeftSystemWindowInsets || this.marginRightSystemWindowInsets || this.marginTopSystemWindowInsets || z) {
            z90 z90Var = new z90() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.4
                /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
                @Override // defpackage.z90
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public ac0 onApplyWindowInsets(View view2, ac0 ac0Var, aa0 aa0Var) {
                    boolean z2;
                    ip h = ac0Var.a.h(519);
                    ip h2 = ac0Var.a.h(32);
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    int i = h.b;
                    int i2 = h.c;
                    int i3 = h.a;
                    bottomSheetBehavior.insetTop = i;
                    boolean z3 = true;
                    boolean z4 = view2.getLayoutDirection() == 1;
                    int paddingBottom = view2.getPaddingBottom();
                    int paddingLeft = view2.getPaddingLeft();
                    int paddingRight = view2.getPaddingRight();
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                        BottomSheetBehavior.this.insetBottom = ac0Var.a();
                        paddingBottom = aa0Var.c + BottomSheetBehavior.this.insetBottom;
                    }
                    if (BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                        paddingLeft = (z4 ? aa0Var.b : aa0Var.a) + i3;
                    }
                    if (BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                        paddingRight = (z4 ? aa0Var.a : aa0Var.b) + i2;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                    if (!BottomSheetBehavior.this.marginLeftSystemWindowInsets || marginLayoutParams.leftMargin == i3) {
                        z2 = false;
                    } else {
                        marginLayoutParams.leftMargin = i3;
                        z2 = true;
                    }
                    if (BottomSheetBehavior.this.marginRightSystemWindowInsets && marginLayoutParams.rightMargin != i2) {
                        marginLayoutParams.rightMargin = i2;
                        z2 = true;
                    }
                    if (BottomSheetBehavior.this.marginTopSystemWindowInsets) {
                        int i4 = marginLayoutParams.topMargin;
                        int i5 = h.b;
                        if (i4 != i5) {
                            marginLayoutParams.topMargin = i5;
                            if (z3) {
                                view2.setLayoutParams(marginLayoutParams);
                            }
                            view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                            if (z) {
                                BottomSheetBehavior.this.gestureInsetBottom = h2.d;
                            }
                            if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets && !z) {
                                return ac0Var;
                            }
                            BottomSheetBehavior.this.updatePeekHeight(false);
                            return ac0Var;
                        }
                    }
                    z3 = z2;
                    if (z3) {
                    }
                    view2.setPadding(paddingLeft, view2.getPaddingTop(), paddingRight, paddingBottom);
                    if (z) {
                    }
                    if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                    }
                    BottomSheetBehavior.this.updatePeekHeight(false);
                    return ac0Var;
                }
            };
            int paddingStart = view.getPaddingStart();
            view.getPaddingTop();
            int paddingEnd = view.getPaddingEnd();
            int paddingBottom = view.getPaddingBottom();
            aa0 aa0Var = new aa0();
            aa0Var.a = paddingStart;
            aa0Var.b = paddingEnd;
            aa0Var.c = paddingBottom;
            h5 h5Var = new h5(z90Var, aa0Var, 24);
            WeakHashMap weakHashMap = e90.a;
            w80.c(view, h5Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new x90());
            }
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        if (this.viewDragHelper != null) {
            return this.draggable || this.state == 1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r1.n(r3.getLeft(), r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        setStateInternal(2);
        updateDrawableForTargetState(r4, true);
        r2.stateSettlingTracker.continueSettlingToState(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void startSettling(View view, int i, boolean z) {
        int topOffsetForState = getTopOffsetForState(i);
        h90 h90Var = this.viewDragHelper;
        if (h90Var != null) {
            if (!z) {
                int left = view.getLeft();
                h90Var.r = view;
                h90Var.c = -1;
                boolean h = h90Var.h(left, topOffsetForState, 0, 0);
                if (!h && h90Var.a == 0 && h90Var.r != null) {
                    h90Var.r = null;
                }
            }
        }
        setStateInternal(i);
    }

    private void updateAccessibilityActions(View view, int i) {
        if (view == null) {
            return;
        }
        clearAccessibilityAction(view, i);
        if (!this.fitToContents && this.state != 6) {
            this.expandHalfwayActionIds.put(i, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6));
        }
        if (this.hideable && isHideableWhenDragging() && this.state != 5) {
            replaceAccessibilityActionForState(view, c0.i, 5);
        }
        int i2 = this.state;
        if (i2 == 3) {
            if (canCollapse()) {
                this.collapseActionIds.put(i, addAccessibilityActionForState(view, R.string.bottomsheet_action_collapse, 4));
            }
        } else if (i2 == 4) {
            this.expandActionIds.put(i, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand, 3));
        } else {
            if (i2 != 6) {
                return;
            }
            if (canCollapse()) {
                this.collapseActionIds.put(i, addAccessibilityActionForState(view, R.string.bottomsheet_action_collapse, 4));
            }
            this.expandActionIds.put(i, addAccessibilityActionForState(view, R.string.bottomsheet_action_expand, 3));
        }
    }

    private void updateDrawableForTargetState(int i, boolean z) {
        boolean isExpandedAndShouldRemoveCorners;
        ValueAnimator valueAnimator;
        if (i == 2 || this.expandedCornersRemoved == (isExpandedAndShouldRemoveCorners = isExpandedAndShouldRemoveCorners()) || this.materialShapeDrawable == null) {
            return;
        }
        this.expandedCornersRemoved = isExpandedAndShouldRemoveCorners;
        if (!z || (valueAnimator = this.interpolatorAnimator) == null) {
            ValueAnimator valueAnimator2 = this.interpolatorAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.interpolatorAnimator.cancel();
            }
            this.materialShapeDrawable.s(this.expandedCornersRemoved ? calculateInterpolationWithCornersRemoved() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.interpolatorAnimator.reverse();
        } else {
            this.interpolatorAnimator.setFloatValues(this.materialShapeDrawable.g.i, isExpandedAndShouldRemoveCorners ? calculateInterpolationWithCornersRemoved() : 1.0f);
            this.interpolatorAnimator.start();
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.importantForAccessibilityMap != null) {
                    return;
                } else {
                    this.importantForAccessibilityMap = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.viewRef.get()) {
                    if (z) {
                        this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.updateImportantForAccessibilityOnSiblings) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(this.importantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
            if (!z) {
                this.importantForAccessibilityMap = null;
            } else if (this.updateImportantForAccessibilityOnSiblings) {
                this.viewRef.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        V v;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state != 4 || (v = this.viewRef.get()) == null) {
                return;
            }
            if (z) {
                setState(4);
            } else {
                v.requestLayout();
            }
        }
    }

    public void addBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        if (this.callbacks.contains(bottomSheetCallback)) {
            return;
        }
        this.callbacks.add(bottomSheetCallback);
    }

    public float calculateSlideOffset() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return calculateSlideOffsetWithTop(this.viewRef.get().getTop());
    }

    public boolean canCollapse() {
        return (this.skipCollapsed && this.hideable) ? false : true;
    }

    @Override // defpackage.gs
    public void cancelBackProgress() {
        ls lsVar = this.bottomContainerBackHelper;
        if (lsVar == null) {
            return;
        }
        if (lsVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        r7 r7Var = lsVar.f;
        lsVar.f = null;
        if (r7Var == null) {
            return;
        }
        AnimatorSet a = lsVar.a();
        a.setDuration(lsVar.e);
        a.start();
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i) {
        V v = this.viewRef.get();
        if (v == null || this.callbacks.isEmpty()) {
            return;
        }
        float calculateSlideOffsetWithTop = calculateSlideOffsetWithTop(i);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onSlide(v, calculateSlideOffsetWithTop);
        }
    }

    public View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    public ls getBackHelper() {
        return this.bottomContainerBackHelper;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public float getHideFriction() {
        return this.hideFriction;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public rt getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public int getSignificantVelocityThreshold() {
        return this.significantVelocityThreshold;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    @Override // defpackage.gs
    public void handleBackInvoked() {
        ls lsVar = this.bottomContainerBackHelper;
        if (lsVar == null) {
            return;
        }
        int i = lsVar.d;
        int i2 = lsVar.c;
        r7 r7Var = lsVar.f;
        lsVar.f = null;
        if (r7Var != null) {
            float f = r7Var.c;
            if (Build.VERSION.SDK_INT >= 34) {
                if (!this.hideable) {
                    AnimatorSet a = lsVar.a();
                    a.setDuration(o3.c(i2, i, f));
                    a.start();
                    setState(4);
                    return;
                }
                AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        BottomSheetBehavior.this.setStateInternal(5);
                        WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
                        if (weakReference == null || weakReference.get() == null) {
                            return;
                        }
                        BottomSheetBehavior.this.viewRef.get().requestLayout();
                    }
                };
                View view = lsVar.b;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getScaleY() * view.getHeight());
                ofFloat.setInterpolator(new si(1));
                ofFloat.setDuration(o3.c(i2, i, f));
                ofFloat.addListener(new x0(6, lsVar));
                ofFloat.addListener(animatorListenerAdapter);
                ofFloat.start();
                return;
            }
        }
        setState(this.hideable ? 5 : 4);
    }

    public boolean isAutoExpandOnRequestChildRectangleOffscreen() {
        return this.autoExpandOnRequestChildRectangleOffscreen;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isDraggableOnNestedScroll() {
        return this.draggableOnNestedScroll;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.shouldRemoveExpandedCorners;
    }

    @Override // defpackage.rd
    public void onAttachedToLayoutParams(ud udVar) {
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // defpackage.rd
    public void onDetachedFromLayoutParams() {
        this.viewRef = null;
        this.viewDragHelper = null;
        this.bottomContainerBackHelper = null;
    }

    @Override // defpackage.rd
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int i;
        h90 h90Var;
        if (!v.isShown() || !this.draggable) {
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
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            WeakReference<View> weakReference = new WeakReference<>(findScrollingChildContainingCoordinates(coordinatorLayout, (int) motionEvent.getX(), (int) motionEvent.getY()));
            this.currentTouchedScrollChildRef = weakReference;
            if (this.state != 2 && weakReference.get() != null) {
                this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!isTouchingDragHandle(coordinatorLayout, x, this.initialY)) {
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.o(v, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.currentTouchedScrollChildRef = null;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (this.ignoreEvents || (h90Var = this.viewDragHelper) == null || !h90Var.o(motionEvent)) {
            return (actionMasked != 2 || !hasScrollingChild() || this.ignoreEvents || this.state == 1 || isTouchingScrollingChild(coordinatorLayout, motionEvent) || this.viewDragHelper == null || (i = this.initialY) == -1 || Math.abs(((float) i) - motionEvent.getY()) <= ((float) this.viewDragHelper.b)) ? false : true;
        }
        return true;
    }

    @Override // defpackage.rd
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !v.getFitsSystemWindows()) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v);
            e90.o(v, new InsetsAnimationCallback(v));
            this.viewRef = new WeakReference<>(v);
            this.bottomContainerBackHelper = new ls(v);
            rt rtVar = this.materialShapeDrawable;
            if (rtVar != null) {
                v.setBackground(rtVar);
                rt rtVar2 = this.materialShapeDrawable;
                float f = this.elevation;
                if (f == -1.0f) {
                    f = v.getElevation();
                }
                rtVar2.q(f);
            } else {
                ColorStateList colorStateList = this.backgroundTint;
                if (colorStateList != null) {
                    v.setBackgroundTintList(colorStateList);
                }
            }
            updateAccessibilityActions();
            if (v.getImportantForAccessibility() == 0) {
                v.setImportantForAccessibility(1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new h90(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.q(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        int i2 = this.parentHeight;
        int i3 = i2 - height;
        int i4 = this.insetTop;
        if (i3 < i4) {
            boolean z = this.paddingTopSystemWindowInsets;
            int i5 = this.maxHeight;
            if (z) {
                if (i5 != -1) {
                    i2 = Math.min(i2, i5);
                }
                this.childHeight = i2;
            } else {
                int i6 = i2 - i4;
                if (i5 != -1) {
                    i6 = Math.min(i6, i5);
                }
                this.childHeight = i6;
            }
        }
        this.fitToContentsOffset = Math.max(0, this.parentHeight - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i7 = this.state;
        if (i7 == 3) {
            int expandedOffset = getExpandedOffset();
            WeakHashMap weakHashMap = e90.a;
            v.offsetTopAndBottom(expandedOffset);
        } else if (i7 == 6) {
            int i8 = this.halfExpandedOffset;
            WeakHashMap weakHashMap2 = e90.a;
            v.offsetTopAndBottom(i8);
        } else if (this.hideable && i7 == 5) {
            int i9 = this.parentHeight;
            WeakHashMap weakHashMap3 = e90.a;
            v.offsetTopAndBottom(i9);
        } else if (i7 == 4) {
            int i10 = this.collapsedOffset;
            WeakHashMap weakHashMap4 = e90.a;
            v.offsetTopAndBottom(i10);
        } else if (i7 == 1 || i7 == 2) {
            int top2 = top - v.getTop();
            WeakHashMap weakHashMap5 = e90.a;
            v.offsetTopAndBottom(top2);
        }
        updateDrawableForTargetState(this.state, false);
        this.nestedScrollingChildrenRef.clear();
        if (this.multipleScrollingChildrenSupported) {
            populateScrollingChildren(v);
        } else {
            this.nestedScrollingChildrenRef.add(new WeakReference<>(findScrollingChild(v)));
        }
        for (int i11 = 0; i11 < this.callbacks.size(); i11++) {
            this.callbacks.get(i11).onLayout(v);
        }
        return true;
    }

    @Override // defpackage.rd
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.rd
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return isNestedScrollingCheckEnabled() && hasScrollingChild() && isViewScrollingChild(view) && this.state != 3 && !this.draggableOnNestedScrollLastDragIgnored;
    }

    @Override // defpackage.rd
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        boolean isViewScrollingChild = isViewScrollingChild(view);
        if (!isNestedScrollingCheckEnabled() || isViewScrollingChild) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (!this.nestedScrolled && !this.draggableOnNestedScroll && isViewScrollingChild && view.canScrollVertically(1)) {
                    this.draggableOnNestedScrollLastDragIgnored = true;
                    return;
                }
                if (i4 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    WeakHashMap weakHashMap = e90.a;
                    v.offsetTopAndBottom(-expandedOffset);
                    setStateInternal(3);
                } else {
                    if (!this.draggable) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap2 = e90.a;
                    v.offsetTopAndBottom(-i2);
                    setStateInternal(1);
                }
            } else if (i2 < 0) {
                boolean canScrollVertically = view.canScrollVertically(-1);
                if (!this.nestedScrolled && !this.draggableOnNestedScroll && isViewScrollingChild && canScrollVertically) {
                    this.draggableOnNestedScrollLastDragIgnored = true;
                    return;
                }
                if (!canScrollVertically) {
                    if (i4 > this.collapsedOffset && !canBeHiddenByDragging()) {
                        int i5 = top - this.collapsedOffset;
                        iArr[1] = i5;
                        WeakHashMap weakHashMap3 = e90.a;
                        v.offsetTopAndBottom(-i5);
                        setStateInternal(4);
                    } else {
                        if (!this.draggable) {
                            return;
                        }
                        iArr[1] = i2;
                        WeakHashMap weakHashMap4 = e90.a;
                        v.offsetTopAndBottom(-i2);
                        setStateInternal(1);
                    }
                }
            }
            dispatchOnSlide(v.getTop());
            this.lastNestedScrollDy = i2;
            this.nestedScrolled = true;
            this.draggableOnNestedScrollLastDragIgnored = false;
        }
    }

    @Override // defpackage.rd
    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
        if (!this.autoExpandOnRequestChildRectangleOffscreen || v.isInTouchMode()) {
            return false;
        }
        int i = this.state;
        if (i != 4 && i != 6) {
            return false;
        }
        if (v.getLocalVisibleRect(this.sheetRect)) {
            WeakHashMap weakHashMap = e90.a;
            ac0 a = x80.a(v);
            if (a != null) {
                this.sheetRect.bottom -= a.a.h(519).d;
            }
            int i2 = rect.top;
            Rect rect2 = this.sheetRect;
            if (i2 >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        setState(3);
        return true;
    }

    @Override // defpackage.rd
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        savedState.getSuperState();
        restoreOptionalState(savedState);
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.state = 4;
            this.lastStableState = 4;
        } else {
            this.state = i;
            this.lastStableState = i;
        }
    }

    @Override // defpackage.rd
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // defpackage.rd
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r4.getTop() <= r2.halfExpandedOffset) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        if (java.lang.Math.abs(r3 - r2.fitToContentsOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        if (shouldSkipHalfExpandedStateWhenDragging() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (java.lang.Math.abs(r3 - r2.halfExpandedOffset) < java.lang.Math.abs(r3 - r2.collapsedOffset)) goto L49;
     */
    @Override // defpackage.rd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        if (!isNestedScrollingCheckEnabled() || (isViewScrollingChild(view) && this.nestedScrolled)) {
            if (this.lastNestedScrollDy > 0) {
                if (!this.fitToContents) {
                }
                startSettling(v, i2, false);
                this.nestedScrolled = false;
            }
            if (this.hideable && shouldHide(v, getYVelocity())) {
                i2 = 5;
            } else if (this.lastNestedScrollDy == 0) {
                int top = v.getTop();
                if (!this.fitToContents) {
                    int i3 = this.halfExpandedOffset;
                    if (top < i3) {
                        if (top >= Math.abs(top - this.collapsedOffset)) {
                        }
                    }
                }
            } else {
                if (!this.fitToContents) {
                    int top2 = v.getTop();
                }
                i2 = 4;
            }
            startSettling(v, i2, false);
            this.nestedScrolled = false;
        }
    }

    @Override // defpackage.rd
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.i(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents) {
            float abs = Math.abs(this.initialY - motionEvent.getY());
            h90 h90Var = this.viewDragHelper;
            if (abs > h90Var.b) {
                h90Var.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.ignoreEvents;
    }

    public void populateScrollingChildren(View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.nestedScrollingChildrenRef.add(new WeakReference<>(view));
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                populateScrollingChildren(viewGroup.getChildAt(i));
            }
        }
    }

    public void removeBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        this.callbacks.remove(bottomSheetCallback);
    }

    public void setAccessibilityDelegateView(View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.accessibilityDelegateViewRef) == null) {
            this.accessibilityDelegateViewRef = new WeakReference<>(view);
            updateAccessibilityActions(view, 1);
        } else {
            clearAccessibilityAction(weakReference.get(), 1);
            this.accessibilityDelegateViewRef = null;
        }
    }

    public void setAutoExpandOnRequestChildRectangleOffscreen(boolean z) {
        this.autoExpandOnRequestChildRectangleOffscreen = z;
    }

    @Deprecated
    public void setBottomSheetCallback(BottomSheetCallback bottomSheetCallback) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (bottomSheetCallback != null) {
            this.callbacks.add(bottomSheetCallback);
        }
    }

    public void setDragHandleView(BottomSheetDragHandleView bottomSheetDragHandleView) {
        this.dragHandleViewRef = bottomSheetDragHandleView != null ? new WeakReference<>(bottomSheetDragHandleView) : null;
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setDraggableOnNestedScroll(boolean z) {
        this.draggableOnNestedScroll = z;
    }

    public void setExpandedOffset(int i) {
        if (i < 0) {
            o8.j("offset must be greater than or equal to 0");
        } else {
            this.expandedOffset = i;
            updateDrawableForTargetState(this.state, true);
        }
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents == z) {
            return;
        }
        this.fitToContents = z;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
        }
        setStateInternal((this.fitToContents && this.state == 6) ? 3 : this.state);
        updateDrawableForTargetState(this.state, true);
        updateAccessibilityActions();
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            o8.j("ratio must be a float value between 0 and 1");
            return;
        }
        this.halfExpandedRatio = f;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideFriction(float f) {
        this.hideFriction = f;
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setHideableInternal(boolean z) {
        this.hideable = z;
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public final void setPeekHeight(int i, boolean z) {
        boolean z2 = this.peekHeightAuto;
        if (i == -1) {
            if (z2) {
                return;
            } else {
                this.peekHeightAuto = true;
            }
        } else {
            if (!z2 && this.peekHeight == i) {
                return;
            }
            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, i);
        }
        updatePeekHeight(z);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setShouldRemoveExpandedCorners(boolean z) {
        if (this.shouldRemoveExpandedCorners != z) {
            this.shouldRemoveExpandedCorners = z;
            updateDrawableForTargetState(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i) {
        this.significantVelocityThreshold = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        if (i == 1 || i == 2) {
            StringBuilder sb = new StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.hideable && i == 5) {
            Log.w(TAG, "Cannot set state: " + i);
            return;
        }
        final int i2 = (i == 6 && this.fitToContents && getTopOffsetForState(i) <= this.fitToContentsOffset) ? 3 : i;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i);
        } else {
            final V v = this.viewRef.get();
            runAfterLayout(v, new Runnable() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.startSettling(v, i2, false);
                }
            });
        }
    }

    public void setStateInternal(int i) {
        V v;
        if (this.state == i) {
            return;
        }
        this.state = i;
        if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
            this.lastStableState = i;
        }
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        updateDrawableForTargetState(i, true);
        for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
            this.callbacks.get(i2).onStateChanged(v, i);
        }
        updateAccessibilityActions();
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    public boolean shouldExpandOnUpwardDrag(long j, float f) {
        return false;
    }

    public boolean shouldHide(View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f * this.hideFriction) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > HIDE_THRESHOLD;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // defpackage.gs
    public void startBackProgress(r7 r7Var) {
        ls lsVar = this.bottomContainerBackHelper;
        if (lsVar == null) {
            return;
        }
        lsVar.f = r7Var;
    }

    @Override // defpackage.gs
    public void updateBackProgress(r7 r7Var) {
        ls lsVar = this.bottomContainerBackHelper;
        if (lsVar == null) {
            return;
        }
        if (lsVar.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        r7 r7Var2 = lsVar.f;
        lsVar.f = r7Var;
        if (r7Var2 == null) {
            return;
        }
        lsVar.b(r7Var.c);
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    public static class SavedState extends f {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
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

        @Override // defpackage.f, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = ((BottomSheetBehavior) bottomSheetBehavior).peekHeight;
            this.fitToContents = ((BottomSheetBehavior) bottomSheetBehavior).fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = ((BottomSheetBehavior) bottomSheetBehavior).skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    public static abstract class BottomSheetCallback {
        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);

        public void onLayout(View view) {
        }
    }

    private void updateAccessibilityActions() {
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            updateAccessibilityActions(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.accessibilityDelegateViewRef;
        if (weakReference2 != null) {
            updateAccessibilityActions(weakReference2.get(), 1);
        }
    }

    @Override // defpackage.rd
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.saveFlags = 0;
        this.fitToContents = true;
        this.updateImportantForAccessibilityOnSiblings = false;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.stateSettlingTracker = new StateSettlingTracker();
        this.halfExpandedRatio = HIDE_THRESHOLD;
        this.elevation = -1.0f;
        this.draggable = true;
        this.draggableOnNestedScroll = true;
        this.autoExpandOnRequestChildRectangleOffscreen = true;
        this.state = 4;
        this.lastStableState = 4;
        this.hideFriction = HIDE_FRICTION;
        this.nestedScrollingChildrenRef = new ArrayList();
        this.callbacks = new ArrayList<>();
        this.initialY = -1;
        this.expandHalfwayActionIds = new SparseIntArray();
        this.expandActionIds = new SparseIntArray();
        this.collapseActionIds = new SparseIntArray();
        this.sheetRect = new Rect();
        this.dragCallback = new g90() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior.5
            private long viewCapturedMillis;

            private boolean releasedLow(View view) {
                int top = view.getTop();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return top > (bottomSheetBehavior.getExpandedOffset() + bottomSheetBehavior.parentHeight) / 2;
            }

            @Override // defpackage.g90
            public int clampViewPositionHorizontal(View view, int i2, int i3) {
                return view.getLeft();
            }

            @Override // defpackage.g90
            public int clampViewPositionVertical(View view, int i2, int i3) {
                return l70.i(i2, BottomSheetBehavior.this.getExpandedOffset(), getViewVerticalDragRange(view));
            }

            @Override // defpackage.g90
            public int getViewVerticalDragRange(View view) {
                boolean canBeHiddenByDragging = BottomSheetBehavior.this.canBeHiddenByDragging();
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                return canBeHiddenByDragging ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
            }

            @Override // defpackage.g90
            public void onViewDragStateChanged(int i2) {
                if (i2 == 1 && BottomSheetBehavior.this.draggable) {
                    BottomSheetBehavior.this.setStateInternal(1);
                }
            }

            @Override // defpackage.g90
            public void onViewPositionChanged(View view, int i2, int i3, int i4, int i5) {
                BottomSheetBehavior.this.dispatchOnSlide(i3);
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
            
                if (r2.shouldExpandOnUpwardDrag(r0, (r10 * 100.0f) / r2.parentHeight) != false) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
            
                if (r10 > r2.halfExpandedOffset) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
            
                if (java.lang.Math.abs(r9.getTop() - r8.this$0.getExpandedOffset()) < java.lang.Math.abs(r9.getTop() - r8.this$0.halfExpandedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
            
                if (java.lang.Math.abs(r10 - r0.fitToContentsOffset) < java.lang.Math.abs(r10 - r8.this$0.collapsedOffset)) goto L6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() != false) goto L39;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0120, code lost:
            
                if (r8.this$0.shouldSkipHalfExpandedStateWhenDragging() == false) goto L63;
             */
            @Override // defpackage.g90
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onViewReleased(View view, float f, float f2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i2 = 6;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.fitToContents) {
                        int top = view.getTop();
                        long uptimeMillis = SystemClock.uptimeMillis() - this.viewCapturedMillis;
                        boolean shouldSkipHalfExpandedStateWhenDragging = BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        if (shouldSkipHalfExpandedStateWhenDragging) {
                        }
                    }
                    i2 = 3;
                } else if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f2)) {
                    if ((Math.abs(f) >= Math.abs(f2) || f2 <= BottomSheetBehavior.this.significantVelocityThreshold) && !releasedLow(view)) {
                        if (!BottomSheetBehavior.this.fitToContents) {
                        }
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    boolean z = BottomSheetBehavior.this.fitToContents;
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!z) {
                        int i3 = bottomSheetBehavior3.halfExpandedOffset;
                        if (top2 < i3) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior3.collapsedOffset)) {
                            }
                            i2 = 3;
                        } else {
                            if (Math.abs(top2 - i3) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                            }
                            i2 = 4;
                        }
                    }
                } else {
                    if (!BottomSheetBehavior.this.fitToContents) {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) < Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                        }
                    }
                    i2 = 4;
                }
                BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                bottomSheetBehavior4.startSettling(view, i2, bottomSheetBehavior4.shouldSkipSmoothAnimation());
            }

            @Override // defpackage.g90
            public boolean tryCaptureView(View view, int i2) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                int i3 = bottomSheetBehavior.state;
                if (i3 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                    return false;
                }
                if (i3 == 3 && bottomSheetBehavior.activePointerId == i2) {
                    boolean z = bottomSheetBehavior.multipleScrollingChildrenSupported;
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    View singleScrollingChildOrNull = z ? bottomSheetBehavior2.currentTouchedScrollChildRef != null ? (View) BottomSheetBehavior.this.currentTouchedScrollChildRef.get() : null : bottomSheetBehavior2.getSingleScrollingChildOrNull();
                    if (singleScrollingChildOrNull != null && singleScrollingChildOrNull.canScrollVertically(-1)) {
                        return false;
                    }
                }
                this.viewCapturedMillis = SystemClock.uptimeMillis();
                WeakReference<V> weakReference = BottomSheetBehavior.this.viewRef;
                return weakReference != null && weakReference.get() == view;
            }
        };
    }
}
