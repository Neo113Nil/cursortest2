package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h5.a;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1805b;

    /* renamed from: d, reason: collision with root package name */
    public int f1807d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f1809f;

    /* renamed from: c, reason: collision with root package name */
    public int f1806c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f1808e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // d3.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f1808e < 0) {
            this.f1808e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f1805b) {
            int i = this.f1806c;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y7 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y7 - this.f1807d) > this.f1808e) {
                    this.f1807d = y7;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f1809f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f1806c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // h5.a, d3.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // d3.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9) {
        throw new ClassCastException();
    }

    @Override // d3.a
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i8, int[] iArr, int i9) {
        throw new ClassCastException();
    }

    @Override // d3.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i8, int i9, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // d3.a
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // d3.a
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // d3.a
    public final boolean o(View view, int i, int i8) {
        throw new ClassCastException();
    }

    @Override // d3.a
    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[RETURN] */
    @Override // d3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f1809f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f1809f.computeCurrentVelocity(1000);
                this.f1809f.getYVelocity(this.f1806c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1806c);
                if (findPointerIndex != -1) {
                    this.f1807d = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f1806c = motionEvent.getPointerId(i);
                    this.f1807d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f1809f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return !this.f1805b;
            }
        }
        this.f1805b = false;
        this.f1806c = -1;
        VelocityTracker velocityTracker3 = this.f1809f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f1809f = null;
        }
        velocityTracker = this.f1809f;
        if (velocityTracker != null) {
        }
        if (!this.f1805b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
