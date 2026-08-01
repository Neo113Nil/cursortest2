package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import q0.AbstractC0287a;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends AbstractC0287a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1550b;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f1553f;

    /* renamed from: c, reason: collision with root package name */
    public int f1551c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f1552e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // x.AbstractC0328a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f1552e < 0) {
            this.f1552e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f1550b) {
            int i = this.f1551c;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y2 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y2 - this.d) > this.f1552e) {
                this.d = y2;
                return true;
            }
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f1553f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f1551c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // q0.AbstractC0287a, x.AbstractC0328a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0328a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0328a
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0328a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0328a
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0328a
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0328a
    public final boolean o(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // x.AbstractC0328a
    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    @Override // x.AbstractC0328a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f1553f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f1553f.computeCurrentVelocity(1000);
                this.f1553f.getYVelocity(this.f1551c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f1551c);
                if (findPointerIndex == -1) {
                    return false;
                }
                this.d = (int) motionEvent.getY(findPointerIndex);
                view.getClass();
                throw new ClassCastException();
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() != 0 ? 0 : 1;
                    this.f1551c = motionEvent.getPointerId(i);
                    this.d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f1553f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return this.f1550b;
            }
        }
        this.f1550b = false;
        this.f1551c = -1;
        VelocityTracker velocityTracker3 = this.f1553f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f1553f = null;
        }
        velocityTracker = this.f1553f;
        if (velocityTracker != null) {
        }
        return this.f1550b;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
