package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import k.InterfaceC0152C;

/* renamed from: l.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0242u0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3054a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3055b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3056c;
    public final View d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0240t0 f3057e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0240t0 f3058f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3059g;
    public int h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC0242u0(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3054a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3055b = tapTimeout;
        this.f3056c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0240t0 runnableC0240t0 = this.f3058f;
        View view = this.d;
        if (runnableC0240t0 != null) {
            view.removeCallbacks(runnableC0240t0);
        }
        RunnableC0240t0 runnableC0240t02 = this.f3057e;
        if (runnableC0240t02 != null) {
            view.removeCallbacks(runnableC0240t02);
        }
    }

    public abstract InterfaceC0152C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0152C b2 = b();
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
        C0236r0 e2;
        boolean z3 = this.f3059g;
        View view2 = this.d;
        if (z3) {
            InterfaceC0152C b2 = b();
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
                                float f2 = this.f3054a;
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
                    if (this.f3057e == null) {
                        this.f3057e = new RunnableC0240t0(this, 0);
                    }
                    view2.postDelayed(this.f3057e, this.f3055b);
                    if (this.f3058f == null) {
                        this.f3058f = new RunnableC0240t0(this, 1);
                    }
                    view2.postDelayed(this.f3058f, this.f3056c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f3059g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3059g = false;
        this.h = -1;
        RunnableC0240t0 runnableC0240t0 = this.f3057e;
        if (runnableC0240t0 != null) {
            this.d.removeCallbacks(runnableC0240t0);
        }
    }
}
