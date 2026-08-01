package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import n1.a;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1160b;

    /* renamed from: d, reason: collision with root package name */
    public int f1161d;

    /* renamed from: f, reason: collision with root package name */
    public VelocityTracker f1163f;
    public int c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f1162e = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // x.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f1162e < 0) {
            this.f1162e = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f1160b) {
            int i4 = this.c;
            if (i4 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i4)) != -1) {
                int y3 = (int) motionEvent.getY(findPointerIndex);
                if (Math.abs(y3 - this.f1161d) > this.f1162e) {
                    this.f1161d = y3;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() != 0) {
            VelocityTracker velocityTracker = this.f1163f;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return false;
        }
        this.c = -1;
        motionEvent.getX();
        motionEvent.getY();
        throw new ClassCastException();
    }

    @Override // n1.a, x.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i4) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final /* synthetic */ void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final void m(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final Parcelable n(View view) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final boolean o(View view, int i4, int i5) {
        throw new ClassCastException();
    }

    @Override // x.a
    public final void p(View view, View view2, int i4) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[RETURN] */
    @Override // x.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.f1163f;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.f1163f.computeCurrentVelocity(1000);
                this.f1163f.getYVelocity(this.c);
                view.getClass();
                throw new ClassCastException();
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.c);
                if (findPointerIndex != -1) {
                    this.f1161d = (int) motionEvent.getY(findPointerIndex);
                    view.getClass();
                    throw new ClassCastException();
                }
            }
            if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i4 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.c = motionEvent.getPointerId(i4);
                    this.f1161d = (int) (motionEvent.getY(i4) + 0.5f);
                }
                velocityTracker = this.f1163f;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                return !this.f1160b;
            }
        }
        this.f1160b = false;
        this.c = -1;
        VelocityTracker velocityTracker3 = this.f1163f;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.f1163f = null;
        }
        velocityTracker = this.f1163f;
        if (velocityTracker != null) {
        }
        if (!this.f1160b) {
        }
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
