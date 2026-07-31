package com.google.android.material.behavior;

import B.w;
import B.z;
import N.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1281a0;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {
    private boolean interceptingEvents;
    OnDismissListener listener;
    private boolean sensitivitySet;
    c viewDragHelper;
    private float sensitivity = 0.0f;
    int swipeDirection = 2;
    float dragDismissThreshold = 0.5f;
    float alphaStartSwipeDistance = 0.0f;
    float alphaEndSwipeDistance = 0.5f;
    private final c.AbstractC0021c dragCallback = new c.AbstractC0021c() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(View view, float f4) {
            if (f4 == 0.0f) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z4 = AbstractC1281a0.C(view) == 1;
            int i4 = SwipeDismissBehavior.this.swipeDirection;
            if (i4 == 2) {
                return true;
            }
            if (i4 == 0) {
                return z4 ? f4 < 0.0f : f4 > 0.0f;
            }
            if (i4 == 1) {
                if (z4) {
                    return f4 > 0.0f;
                }
                if (f4 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // N.c.AbstractC0021c
        public int clampViewPositionHorizontal(View view, int i4, int i5) {
            int width;
            int width2;
            int width3;
            boolean z4 = AbstractC1281a0.C(view) == 1;
            int i6 = SwipeDismissBehavior.this.swipeDirection;
            if (i6 == 0) {
                if (z4) {
                    width = this.originalCapturedViewLeft - view.getWidth();
                    width2 = this.originalCapturedViewLeft;
                } else {
                    width = this.originalCapturedViewLeft;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i6 != 1) {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = view.getWidth() + this.originalCapturedViewLeft;
            } else if (z4) {
                width = this.originalCapturedViewLeft;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.originalCapturedViewLeft - view.getWidth();
                width2 = this.originalCapturedViewLeft;
            }
            return SwipeDismissBehavior.clamp(width, i4, width2);
        }

        @Override // N.c.AbstractC0021c
        public int clampViewPositionVertical(View view, int i4, int i5) {
            return view.getTop();
        }

        @Override // N.c.AbstractC0021c
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // N.c.AbstractC0021c
        public void onViewCaptured(View view, int i4) {
            this.activePointerId = i4;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // N.c.AbstractC0021c
        public void onViewDragStateChanged(int i4) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i4);
            }
        }

        @Override // N.c.AbstractC0021c
        public void onViewPositionChanged(View view, int i4, int i5, int i6, int i7) {
            float width = this.originalCapturedViewLeft + (view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance);
            float width2 = this.originalCapturedViewLeft + (view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance);
            float f4 = i4;
            if (f4 <= width) {
                view.setAlpha(1.0f);
            } else if (f4 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, f4), 1.0f));
            }
        }

        @Override // N.c.AbstractC0021c
        public void onViewReleased(View view, float f4, float f5) {
            int i4;
            boolean z4;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f4)) {
                int left = view.getLeft();
                int i5 = this.originalCapturedViewLeft;
                i4 = left < i5 ? i5 - width : i5 + width;
                z4 = true;
            } else {
                i4 = this.originalCapturedViewLeft;
                z4 = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.G(i4, view.getTop())) {
                AbstractC1281a0.g0(view, new SettleRunnable(view, z4));
            } else {
                if (!z4 || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(view);
            }
        }

        @Override // N.c.AbstractC0021c
        public boolean tryCaptureView(View view, int i4) {
            int i5 = this.activePointerId;
            return (i5 == -1 || i5 == i4) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i4);
    }

    private class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        SettleRunnable(View view, boolean z4) {
            this.view = view;
            this.dismiss = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            c cVar = SwipeDismissBehavior.this.viewDragHelper;
            if (cVar != null && cVar.k(true)) {
                AbstractC1281a0.g0(this.view, this);
            } else {
                if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
                    return;
                }
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    static float clamp(float f4, float f5, float f6) {
        return Math.min(Math.max(f4, f5), f6);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? c.l(viewGroup, this.sensitivity, this.dragCallback) : c.m(viewGroup, this.dragCallback);
        }
    }

    static float fraction(float f4, float f5, float f6) {
        return (f6 - f4) / (f5 - f4);
    }

    private void updateAccessibilityActions(View view) {
        AbstractC1281a0.i0(view, 1048576);
        if (canSwipeDismissView(view)) {
            AbstractC1281a0.k0(view, w.a.f160y, null, new z() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // B.z
                public boolean perform(View view2, z.a aVar) {
                    if (!SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        return false;
                    }
                    boolean z4 = AbstractC1281a0.C(view2) == 1;
                    int i4 = SwipeDismissBehavior.this.swipeDirection;
                    AbstractC1281a0.Y(view2, (!(i4 == 0 && z4) && (i4 != 1 || z4)) ? view2.getWidth() : -view2.getWidth());
                    view2.setAlpha(0.0f);
                    OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                    if (onDismissListener != null) {
                        onDismissListener.onDismiss(view2);
                    }
                    return true;
                }
            });
        }
    }

    public boolean canSwipeDismissView(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v4, MotionEvent motionEvent) {
        boolean z4 = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z4 = coordinatorLayout.isPointInChildBounds(v4, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z4;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (!z4) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return this.viewDragHelper.H(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v4, int i4) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v4, i4);
        if (AbstractC1281a0.A(v4) == 0) {
            AbstractC1281a0.z0(v4, 1);
            updateAccessibilityActions(v4);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v4, MotionEvent motionEvent) {
        c cVar = this.viewDragHelper;
        if (cVar == null) {
            return false;
        }
        cVar.z(motionEvent);
        return true;
    }

    public void setEndAlphaSwipeDistance(float f4) {
        this.alphaEndSwipeDistance = clamp(0.0f, f4, 1.0f);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setStartAlphaSwipeDistance(float f4) {
        this.alphaStartSwipeDistance = clamp(0.0f, f4, 1.0f);
    }

    public void setSwipeDirection(int i4) {
        this.swipeDirection = i4;
    }

    static int clamp(int i4, int i5, int i6) {
        return Math.min(Math.max(i4, i5), i6);
    }
}
