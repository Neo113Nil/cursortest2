package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import k.InterfaceC0142C;

/* renamed from: l.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0240u0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3041c;
    public final View d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0238t0 f3042e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0238t0 f3043f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3044g;
    public int h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC0240u0(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3039a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3040b = tapTimeout;
        this.f3041c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0238t0 runnableC0238t0 = this.f3043f;
        View view = this.d;
        if (runnableC0238t0 != null) {
            view.removeCallbacks(runnableC0238t0);
        }
        RunnableC0238t0 runnableC0238t02 = this.f3042e;
        if (runnableC0238t02 != null) {
            view.removeCallbacks(runnableC0238t02);
        }
    }

    public abstract InterfaceC0142C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0142C b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        C0234r0 e2;
        boolean z3 = this.f3044g;
        View view2 = this.d;
        if (z3) {
            InterfaceC0142C b2 = b();
            if (b2 != null && b2.a() && (e2 = b2.e()) != null && e2.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                e2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = e2.b(obtainNoHistory, this.h);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b3) {
                }
            }
            if (d()) {
                z2 = false;
            }
            z2 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f3039a;
                                float f3 = -f2;
                                if (x2 < f3 || y2 < f3 || x2 >= (view2.getRight() - view2.getLeft()) + f2 || y2 >= (view2.getBottom() - view2.getTop()) + f2) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z2 = true;
                                        if (z2) {
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
                    this.h = motionEvent.getPointerId(0);
                    if (this.f3042e == null) {
                        this.f3042e = new RunnableC0238t0(this, 0);
                    }
                    view2.postDelayed(this.f3042e, this.f3040b);
                    if (this.f3043f == null) {
                        this.f3043f = new RunnableC0238t0(this, 1);
                    }
                    view2.postDelayed(this.f3043f, this.f3041c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f3044g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3044g = false;
        this.h = -1;
        RunnableC0238t0 runnableC0238t0 = this.f3042e;
        if (runnableC0238t0 != null) {
            this.d.removeCallbacks(runnableC0238t0);
        }
    }
}
