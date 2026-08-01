package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import k.InterfaceC0142C;

/* renamed from: l.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0267w0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3078a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3080c;
    public final View d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0265v0 f3081e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0265v0 f3082f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3083g;
    public int h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC0267w0(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3078a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3079b = tapTimeout;
        this.f3080c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0265v0 runnableC0265v0 = this.f3082f;
        View view = this.d;
        if (runnableC0265v0 != null) {
            view.removeCallbacks(runnableC0265v0);
        }
        RunnableC0265v0 runnableC0265v02 = this.f3081e;
        if (runnableC0265v02 != null) {
            view.removeCallbacks(runnableC0265v02);
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
        C0261t0 f2;
        boolean z3 = this.f3083g;
        View view2 = this.d;
        if (z3) {
            InterfaceC0142C b2 = b();
            if (b2 != null && b2.a() && (f2 = b2.f()) != null && f2.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = f2.b(obtainNoHistory, this.h);
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
                                float f3 = this.f3078a;
                                float f4 = -f3;
                                if (x2 < f4 || y2 < f4 || x2 >= (view2.getRight() - view2.getLeft()) + f3 || y2 >= (view2.getBottom() - view2.getTop()) + f3) {
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
                    if (this.f3081e == null) {
                        this.f3081e = new RunnableC0265v0(this, 0);
                    }
                    view2.postDelayed(this.f3081e, this.f3079b);
                    if (this.f3082f == null) {
                        this.f3082f = new RunnableC0265v0(this, 1);
                    }
                    view2.postDelayed(this.f3082f, this.f3080c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f3083g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3083g = false;
        this.h = -1;
        RunnableC0265v0 runnableC0265v0 = this.f3081e;
        if (runnableC0265v0 != null) {
            this.d.removeCallbacks(runnableC0265v0);
        }
    }
}
