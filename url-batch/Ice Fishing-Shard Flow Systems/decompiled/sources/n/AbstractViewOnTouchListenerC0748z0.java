package n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import m.InterfaceC0675D;

/* renamed from: n.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0748z0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final float f6958d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6959e;

    /* renamed from: i, reason: collision with root package name */
    public final int f6960i;

    /* renamed from: l, reason: collision with root package name */
    public final View f6961l;

    /* renamed from: m, reason: collision with root package name */
    public RunnableC0746y0 f6962m;

    /* renamed from: n, reason: collision with root package name */
    public RunnableC0746y0 f6963n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6964o;

    /* renamed from: p, reason: collision with root package name */
    public int f6965p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f6966q = new int[2];

    public AbstractViewOnTouchListenerC0748z0(View view) {
        this.f6961l = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f6958d = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f6959e = tapTimeout;
        this.f6960i = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0746y0 runnableC0746y0 = this.f6963n;
        View view = this.f6961l;
        if (runnableC0746y0 != null) {
            view.removeCallbacks(runnableC0746y0);
        }
        RunnableC0746y0 runnableC0746y02 = this.f6962m;
        if (runnableC0746y02 != null) {
            view.removeCallbacks(runnableC0746y02);
        }
    }

    public abstract InterfaceC0675D b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0675D b7 = b();
        if (b7 == null || !b7.b()) {
            return true;
        }
        b7.dismiss();
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
        boolean z7;
        C0742w0 e7;
        boolean z8 = this.f6964o;
        View view2 = this.f6961l;
        if (z8) {
            InterfaceC0675D b7 = b();
            if (b7 != null && b7.b() && (e7 = b7.e()) != null && e7.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f6966q;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                e7.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b8 = e7.b(this.f6965p, obtainNoHistory);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z9 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b8) {
                }
            }
            if (d()) {
                z7 = false;
            }
            z7 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f6965p);
                            if (findPointerIndex >= 0) {
                                float x7 = motionEvent.getX(findPointerIndex);
                                float y7 = motionEvent.getY(findPointerIndex);
                                float f7 = this.f6958d;
                                float f8 = -f7;
                                if (x7 < f8 || y7 < f8 || x7 >= (view2.getRight() - view2.getLeft()) + f7 || y7 >= (view2.getBottom() - view2.getTop()) + f7) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z7 = true;
                                        if (z7) {
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
                    this.f6965p = motionEvent.getPointerId(0);
                    if (this.f6962m == null) {
                        this.f6962m = new RunnableC0746y0(this, 0);
                    }
                    view2.postDelayed(this.f6962m, this.f6959e);
                    if (this.f6963n == null) {
                        this.f6963n = new RunnableC0746y0(this, 1);
                    }
                    view2.postDelayed(this.f6963n, this.f6960i);
                }
            }
            z7 = false;
            if (z7) {
            }
        }
        this.f6964o = z7;
        return z7 || z8;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f6964o = false;
        this.f6965p = -1;
        RunnableC0746y0 runnableC0746y0 = this.f6962m;
        if (runnableC0746y0 != null) {
            this.f6961l.removeCallbacks(runnableC0746y0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
