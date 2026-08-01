package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p1.a;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f786b;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f789f;

    /* renamed from: c, reason: collision with root package name */
    public int f787c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f788e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // a0.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f788e < 0) {
            this.f788e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f786b) {
            int i = this.f787c;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y3 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y3 - this.d) > this.f788e) {
                    this.d = y3;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f789f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f787c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // p1.a, a0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // a0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        throw new ClassCastException();
    }

    @Override // a0.b
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i5) {
        throw new ClassCastException();
    }

    @Override // a0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // a0.b
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // a0.b
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // a0.b
    public final boolean o(View view, int i, int i4) {
        throw new ClassCastException();
    }

    @Override // a0.b
    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[RETURN] */
    @Override // a0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f789f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f789f.computeCurrentVelocity(1000);
                this.f789f.getYVelocity(this.f787c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f787c);
                if (findPointerIndex != -1) {
                    this.d = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f787c = motionEvent.getPointerId(i);
                    this.d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f789f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return !this.f786b;
            }
        }
        this.f786b = false;
        this.f787c = -1;
        VelocityTracker velocityTracker3 = this.f789f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f789f = null;
        }
        velocityTracker = this.f789f;
        if (velocityTracker != null) {
        }
        if (!this.f786b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
