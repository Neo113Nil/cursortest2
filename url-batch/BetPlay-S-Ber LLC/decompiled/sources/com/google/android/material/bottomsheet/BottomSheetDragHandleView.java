package com.google.android.material.bottomsheet;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.awerser.monnit.betplay.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.c0;
import defpackage.e5;
import defpackage.e90;
import defpackage.i0;
import defpackage.l0;
import defpackage.op;
import defpackage.rd;
import defpackage.u40;
import defpackage.ud;
import defpackage.w;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class BottomSheetDragHandleView extends e5 implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = 2131756129;
    private final AccessibilityManager accessibilityManager;
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    private final String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final String clickToExpandActionLabel;
    private final String clickToHalfExpandActionLabel;
    private final GestureDetector gestureDetector;
    private final GestureDetector.OnGestureListener gestureListener;
    private boolean hasClickListener;
    private boolean hasTouchListener;

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i) {
        super(op.Z(context, attributeSet, i, DEF_STYLE_RES), attributeSet, i);
        this.hasTouchListener = false;
        this.hasClickListener = false;
        this.clickToExpandActionLabel = getResources().getString(R.string.bottomsheet_action_expand_description);
        this.clickToHalfExpandActionLabel = getResources().getString(R.string.bottomsheet_action_half_expand_description);
        this.clickToCollapseActionLabel = getResources().getString(R.string.bottomsheet_action_collapse_description);
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.1
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i2) {
                BottomSheetDragHandleView.this.onBottomSheetStateChanged(i2);
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
            }
        };
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (BottomSheetDragHandleView.this.bottomSheetBehavior == null || !BottomSheetDragHandleView.this.bottomSheetBehavior.isHideable()) {
                    return super.onDoubleTap(motionEvent);
                }
                BottomSheetDragHandleView.this.bottomSheetBehavior.setState(5);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.isClickable();
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                BottomSheetDragHandleView.this.performLongClick(motionEvent.getX(), motionEvent.getY());
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
            }
        };
        this.gestureListener = simpleOnGestureListener;
        Context context2 = getContext();
        setTooltipText(getResources().getString(R.string.bottomsheet_drag_handle_content_description));
        this.gestureDetector = new GestureDetector(context2, simpleOnGestureListener, new Handler(Looper.getMainLooper()));
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        e90.m(this, new w() { // from class: com.google.android.material.bottomsheet.BottomSheetDragHandleView.3
            @Override // defpackage.w
            public void onInitializeAccessibilityNodeInfo(View view, i0 i0Var) {
                super.onInitializeAccessibilityNodeInfo(view, i0Var);
                if (BottomSheetDragHandleView.this.hasAttachedBehavior()) {
                    CharSequence contentDescription = BottomSheetDragHandleView.this.getContentDescription();
                    int state = BottomSheetDragHandleView.this.bottomSheetBehavior.getState();
                    String string = state != 3 ? state != 4 ? state != 6 ? null : BottomSheetDragHandleView.this.getResources().getString(R.string.bottomsheet_state_half_expanded) : BottomSheetDragHandleView.this.getResources().getString(R.string.bottomsheet_state_collapsed) : BottomSheetDragHandleView.this.getResources().getString(R.string.bottomsheet_state_expanded);
                    if (TextUtils.isEmpty(string)) {
                        return;
                    }
                    if (!TextUtils.isEmpty(contentDescription)) {
                        string = string + ". " + ((Object) contentDescription);
                    }
                    i0Var.a.setContentDescription(string);
                }
            }

            @Override // defpackage.w
            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                if (accessibilityEvent.getEventType() == 1) {
                    BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean expandOrCollapseBottomSheetIfPossible() {
        if (!hasAttachedBehavior()) {
            return false;
        }
        int nextState = getNextState();
        if (nextState == -1) {
            return true;
        }
        this.bottomSheetBehavior.setState(nextState);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.material.bottomsheet.BottomSheetDragHandleView] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    private BottomSheetBehavior<?> findParentBottomSheetBehavior() {
        while (true) {
            this = getParentView(this);
            if (this == 0) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams instanceof ud) {
                rd rdVar = ((ud) layoutParams).a;
                if (rdVar instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) rdVar;
                }
            }
        }
    }

    private int getNextState() {
        if (!hasAttachedBehavior()) {
            return -1;
        }
        boolean z = (this.bottomSheetBehavior.isFitToContents() || this.bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) ? false : true;
        int state = this.bottomSheetBehavior.getState();
        if (state == 3) {
            if (z) {
                return 6;
            }
            return this.bottomSheetBehavior.canCollapse() ? 4 : -1;
        }
        if (state == 4) {
            return z ? 6 : 3;
        }
        if (state != 6) {
            return -1;
        }
        if (this.clickToExpand) {
            return 3;
        }
        return this.bottomSheetBehavior.canCollapse() ? 4 : -1;
    }

    private static View getParentView(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasAttachedBehavior() {
        return this.bottomSheetBehavior != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onBottomSheetStateChanged$0(View view, l0 l0Var) {
        return expandOrCollapseBottomSheetIfPossible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBottomSheetStateChanged(int i) {
        if (i == 4) {
            this.clickToExpand = true;
        } else if (i == 3) {
            this.clickToExpand = false;
        }
        int nextState = getNextState();
        e90.k(this, c0.e, nextState != 3 ? nextState != 4 ? nextState != 6 ? null : this.clickToHalfExpandActionLabel : this.clickToCollapseActionLabel : this.clickToExpandActionLabel, new u40(2, this));
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.bottomSheetCallback);
            this.bottomSheetBehavior.setAccessibilityDelegateView(null);
            this.bottomSheetBehavior.setDragHandleView(null);
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView(this);
            this.bottomSheetBehavior.setDragHandleView(this);
            onBottomSheetStateChanged(this.bottomSheetBehavior.getState());
            this.bottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        }
        setClickable(hasAttachedBehavior());
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(findParentBottomSheetBehavior());
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return !isEnabled() ? super.onKeyDown(i, keyEvent) : (i == 23 || i == 66) ? this.hasClickListener ? performClick() : expandOrCollapseBottomSheetIfPossible() : super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (this.hasClickListener || this.hasTouchListener) ? super.onTouchEvent(motionEvent) : this.gestureDetector.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.hasClickListener = onClickListener != null;
        super.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.hasTouchListener = onTouchListener != null;
        super.setOnTouchListener(onTouchListener);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }
}
