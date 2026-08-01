package n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import m.InterfaceC0214C;

/* renamed from: n.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0311y0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3743c;

    /* renamed from: d, reason: collision with root package name */
    public final View f3744d;
    public RunnableC0309x0 e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0309x0 f3745f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3746g;

    /* renamed from: h, reason: collision with root package name */
    public int f3747h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC0311y0(View view) {
        this.f3744d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3741a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3742b = tapTimeout;
        this.f3743c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0309x0 runnableC0309x0 = this.f3745f;
        View view = this.f3744d;
        if (runnableC0309x0 != null) {
            view.removeCallbacks(runnableC0309x0);
        }
        RunnableC0309x0 runnableC0309x02 = this.e;
        if (runnableC0309x02 != null) {
            view.removeCallbacks(runnableC0309x02);
        }
    }

    public abstract InterfaceC0214C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0214C b2 = b();
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
        C0305v0 e;
        boolean z3 = this.f3746g;
        View view2 = this.f3744d;
        if (z3) {
            InterfaceC0214C b2 = b();
            if (b2 != null && b2.a() && (e = b2.e()) != null && e.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                e.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = e.b(obtainNoHistory, this.f3747h);
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
                            int findPointerIndex = motionEvent.findPointerIndex(this.f3747h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f2 = this.f3741a;
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
                    this.f3747h = motionEvent.getPointerId(0);
                    if (this.e == null) {
                        this.e = new RunnableC0309x0(this, 0);
                    }
                    view2.postDelayed(this.e, this.f3742b);
                    if (this.f3745f == null) {
                        this.f3745f = new RunnableC0309x0(this, 1);
                    }
                    view2.postDelayed(this.f3745f, this.f3743c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f3746g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3746g = false;
        this.f3747h = -1;
        RunnableC0309x0 runnableC0309x0 = this.e;
        if (runnableC0309x0 != null) {
            this.f3744d.removeCallbacks(runnableC0309x0);
        }
    }
}
