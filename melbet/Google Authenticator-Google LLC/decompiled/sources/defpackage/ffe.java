package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ffe extends ffh {
    private Runnable a;
    OverScroller b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private VelocityTracker g;

    public ffe() {
        this.d = -1;
        this.f = -1;
    }

    public int J(View view) {
        throw null;
    }

    public int K(View view) {
        throw null;
    }

    public int L() {
        throw null;
    }

    public int M(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw null;
    }

    public void O(CoordinatorLayout coordinatorLayout, View view) {
        throw null;
    }

    public boolean Q(View view) {
        throw null;
    }

    public final int T(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return M(coordinatorLayout, view, L() - i, i2, i3);
    }

    @Override // defpackage.tw
    public final boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f < 0) {
            this.f = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.c) {
            int i = this.d;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y - this.e) > this.f) {
                    this.e = y;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.d = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = Q(view) && coordinatorLayout.k(view, x, y2);
            this.c = z;
            if (z) {
                this.e = y2;
                this.d = motionEvent.getPointerId(0);
                if (this.g == null) {
                    this.g = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.b;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.b.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    @Override // defpackage.tw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.d);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(findPointerIndex);
                int i = this.e - y;
                this.e = y;
                T(coordinatorLayout, view, i, J(view), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.d = motionEvent.getPointerId(i2);
                    this.e = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.g;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.c || z;
        }
        VelocityTracker velocityTracker3 = this.g;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.g.computeCurrentVelocity(1000);
            float yVelocity = this.g.getYVelocity(this.d);
            int i3 = -K(view);
            Runnable runnable = this.a;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.a = null;
            }
            OverScroller overScroller = this.b;
            if (overScroller == null) {
                overScroller = new OverScroller(view.getContext());
                this.b = overScroller;
            }
            overScroller.fling(0, U(), 0, Math.round(yVelocity), 0, 0, i3, 0);
            if (this.b.computeScrollOffset()) {
                ffd ffdVar = new ffd(this, coordinatorLayout, view);
                this.a = ffdVar;
                view.postOnAnimation(ffdVar);
            } else {
                O(coordinatorLayout, view);
            }
            z = true;
            this.c = false;
            this.d = -1;
            velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.g = null;
            }
            velocityTracker2 = this.g;
            if (velocityTracker2 != null) {
            }
            if (this.c) {
            }
        }
        z = false;
        this.c = false;
        this.d = -1;
        velocityTracker = this.g;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
        }
        if (this.c) {
        }
    }

    public ffe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }
}
