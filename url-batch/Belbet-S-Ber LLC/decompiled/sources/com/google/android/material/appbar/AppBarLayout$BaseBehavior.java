package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import s1.a;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f897b;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f900f;

    /* renamed from: c, reason: collision with root package name */
    public int f898c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f899e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // a0.c
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f899e < 0) {
            this.f899e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f897b) {
            int i = this.f898c;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y4 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y4 - this.d) > this.f899e) {
                    this.d = y4;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f900f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.f898c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // s1.a, a0.c
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // a0.c
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5) {
        throw new ClassCastException();
    }

    @Override // a0.c
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i4, int[] iArr, int i5) {
        throw new ClassCastException();
    }

    @Override // a0.c
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i4, int i5, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // a0.c
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // a0.c
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // a0.c
    public final boolean o(View view, int i, int i4) {
        throw new ClassCastException();
    }

    @Override // a0.c
    public final void p(View view, View view2, int i) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[RETURN] */
    @Override // a0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f900f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f900f.computeCurrentVelocity(1000);
                this.f900f.getYVelocity(this.f898c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f898c);
                if (findPointerIndex != -1) {
                    this.d = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.f898c = motionEvent.getPointerId(i);
                    this.d = (int) (motionEvent.getY(i) + 0.5f);
                }
                velocityTracker = this.f900f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return !this.f897b;
            }
        }
        this.f897b = false;
        this.f898c = -1;
        VelocityTracker velocityTracker3 = this.f900f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f900f = null;
        }
        velocityTracker = this.f900f;
        if (velocityTracker != null) {
        }
        if (!this.f897b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
