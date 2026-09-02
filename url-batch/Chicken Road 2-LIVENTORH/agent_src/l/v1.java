package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class v1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final float f2474f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2475g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2476h;
    public final View i;

    /* renamed from: j, reason: collision with root package name */
    public u1 f2477j;

    /* renamed from: k, reason: collision with root package name */
    public u1 f2478k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2479l;

    /* renamed from: m, reason: collision with root package name */
    public int f2480m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f2481n = new int[2];

    public v1(View view) {
        this.i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2474f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2475g = tapTimeout;
        this.f2476h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        u1 u1Var = this.f2478k;
        View view = this.i;
        if (u1Var != null) {
            view.removeCallbacks(u1Var);
        }
        u1 u1Var2 = this.f2477j;
        if (u1Var2 != null) {
            view.removeCallbacks(u1Var2);
        }
    }

    public abstract k.c0 b();

    public abstract boolean c();

    public boolean d() {
        k.c0 b4 = b();
        if (b4 == null || !b4.b()) {
            return true;
        }
        b4.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        s1 k4;
        boolean z4 = this.f2479l;
        View view2 = this.i;
        if (z4) {
            k.c0 b4 = b();
            if (b4 != null && b4.b() && (k4 = b4.k()) != null && k4.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2481n;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                k4.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b5 = k4.b(obtainNoHistory, this.f2480m);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b5) {
                }
            }
            if (d()) {
                z3 = false;
            }
            z3 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f2480m);
                            if (findPointerIndex >= 0) {
                                float x3 = motionEvent.getX(findPointerIndex);
                                float y3 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f2474f;
                                float f4 = -f2;
                                if (x3 < f4 || y3 < f4 || x3 >= (view2.getRight() - view2.getLeft()) + f2 || y3 >= (view2.getBottom() - view2.getTop()) + f2) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z3 = true;
                                        if (z3) {
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
                    this.f2480m = motionEvent.getPointerId(0);
                    if (this.f2477j == null) {
                        this.f2477j = new u1(this, 0);
                    }
                    view2.postDelayed(this.f2477j, this.f2475g);
                    if (this.f2478k == null) {
                        this.f2478k = new u1(this, 1);
                    }
                    view2.postDelayed(this.f2478k, this.f2476h);
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        this.f2479l = z3;
        return z3 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2479l = false;
        this.f2480m = -1;
        u1 u1Var = this.f2477j;
        if (u1Var != null) {
            this.i.removeCallbacks(u1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
