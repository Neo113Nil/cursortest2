package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class tq0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float m;
    public final int n;
    public final int o;
    public final View p;
    public sq0 q;
    public sq0 r;
    public boolean s;
    public int t;
    public final int[] u = new int[2];

    public tq0(View view) {
        this.p = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.m = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.n = tapTimeout;
        this.o = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        sq0 sq0Var = this.r;
        View view = this.p;
        if (sq0Var != null) {
            view.removeCallbacks(sq0Var);
        }
        sq0 sq0Var2 = this.q;
        if (sq0Var2 != null) {
            view.removeCallbacks(sq0Var2);
        }
    }

    public abstract cl2 b();

    public abstract boolean c();

    public boolean d() {
        cl2 b = b();
        if (b == null || !b.a()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        ne0 h;
        boolean z2 = this.s;
        View view2 = this.p;
        if (z2) {
            cl2 b = b();
            if (b != null && b.a() && (h = b.h()) != null && h.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.u;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                h.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b2 = h.b(obtainNoHistory, this.t);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b2) {
                }
            }
            if (d()) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.t);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.m;
                                float f2 = -f;
                                if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z = true;
                                        if (z) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.t = motionEvent.getPointerId(0);
                    if (this.q == null) {
                        this.q = new sq0(this, 0);
                    }
                    view2.postDelayed(this.q, this.n);
                    if (this.r == null) {
                        this.r = new sq0(this, 1);
                    }
                    view2.postDelayed(this.r, this.o);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.s = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.s = false;
        this.t = -1;
        sq0 sq0Var = this.q;
        if (sq0Var != null) {
            this.p.removeCallbacks(sq0Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
