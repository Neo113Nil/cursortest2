package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class s1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final float f2642f;
    public final int g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final View f2643i;

    /* renamed from: j, reason: collision with root package name */
    public r1 f2644j;

    /* renamed from: k, reason: collision with root package name */
    public r1 f2645k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2646l;

    /* renamed from: m, reason: collision with root package name */
    public int f2647m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f2648n = new int[2];

    public s1(View view) {
        this.f2643i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2642f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.g = tapTimeout;
        this.h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        r1 r1Var = this.f2645k;
        View view = this.f2643i;
        if (r1Var != null) {
            view.removeCallbacks(r1Var);
        }
        r1 r1Var2 = this.f2644j;
        if (r1Var2 != null) {
            view.removeCallbacks(r1Var2);
        }
    }

    public abstract j.c0 b();

    public abstract boolean c();

    public boolean d() {
        j.c0 b2 = b();
        if (b2 == null || !b2.b()) {
            return true;
        }
        b2.dismiss();
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
        p1 f4;
        boolean z4 = this.f2646l;
        View view2 = this.f2643i;
        if (z4) {
            j.c0 b2 = b();
            if (b2 != null && b2.b() && (f4 = b2.f()) != null && f4.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2648n;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f4.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b4 = f4.b(obtainNoHistory, this.f2647m);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b4) {
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
                            int findPointerIndex = motionEvent.findPointerIndex(this.f2647m);
                            if (findPointerIndex >= 0) {
                                float x3 = motionEvent.getX(findPointerIndex);
                                float y3 = motionEvent.getY(findPointerIndex);
                                float f5 = this.f2642f;
                                float f6 = -f5;
                                if (x3 < f6 || y3 < f6 || x3 >= (view2.getRight() - view2.getLeft()) + f5 || y3 >= (view2.getBottom() - view2.getTop()) + f5) {
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
                    this.f2647m = motionEvent.getPointerId(0);
                    if (this.f2644j == null) {
                        this.f2644j = new r1(this, 0);
                    }
                    view2.postDelayed(this.f2644j, this.g);
                    if (this.f2645k == null) {
                        this.f2645k = new r1(this, 1);
                    }
                    view2.postDelayed(this.f2645k, this.h);
                }
            }
            z3 = false;
            if (z3) {
            }
        }
        this.f2646l = z3;
        return z3 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2646l = false;
        this.f2647m = -1;
        r1 r1Var = this.f2644j;
        if (r1Var != null) {
            this.f2643i.removeCallbacks(r1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
