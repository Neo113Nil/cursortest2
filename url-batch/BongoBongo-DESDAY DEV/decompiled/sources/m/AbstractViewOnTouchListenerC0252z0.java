package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import l.InterfaceC0154C;

/* renamed from: m.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0252z0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final float f3218a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3219b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3220c;
    public final View d;

    /* renamed from: e, reason: collision with root package name */
    public RunnableC0250y0 f3221e;

    /* renamed from: f, reason: collision with root package name */
    public RunnableC0250y0 f3222f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3223g;

    /* renamed from: h, reason: collision with root package name */
    public int f3224h;
    public final int[] i = new int[2];

    public AbstractViewOnTouchListenerC0252z0(View view) {
        this.d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3218a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3219b = tapTimeout;
        this.f3220c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        RunnableC0250y0 runnableC0250y0 = this.f3222f;
        View view = this.d;
        if (runnableC0250y0 != null) {
            view.removeCallbacks(runnableC0250y0);
        }
        RunnableC0250y0 runnableC0250y02 = this.f3221e;
        if (runnableC0250y02 != null) {
            view.removeCallbacks(runnableC0250y02);
        }
    }

    public abstract InterfaceC0154C b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0154C b2 = b();
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
        C0246w0 f2;
        boolean z3 = this.f3223g;
        View view2 = this.d;
        if (z3) {
            InterfaceC0154C b2 = b();
            if (b2 != null && b2.a() && (f2 = b2.f()) != null && f2.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                f2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b3 = f2.b(obtainNoHistory, this.f3224h);
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
                            int findPointerIndex = motionEvent.findPointerIndex(this.f3224h);
                            if (findPointerIndex >= 0) {
                                float x2 = motionEvent.getX(findPointerIndex);
                                float y2 = motionEvent.getY(findPointerIndex);
                                float f3 = this.f3218a;
                                float f4 = -f3;
                                if (x2 < f4 || y2 < f4 || x2 >= (view2.getRight() - view2.getLeft()) + f3 || y2 >= (view2.getBottom() - view2.getTop()) + f3) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z2 = true;
                                        if (z2) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.A0, RecyclerView.A0, 0);
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
                    this.f3224h = motionEvent.getPointerId(0);
                    if (this.f3221e == null) {
                        this.f3221e = new RunnableC0250y0(this, 0);
                    }
                    view2.postDelayed(this.f3221e, this.f3219b);
                    if (this.f3222f == null) {
                        this.f3222f = new RunnableC0250y0(this, 1);
                    }
                    view2.postDelayed(this.f3222f, this.f3220c);
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        this.f3223g = z2;
        return z2 || z3;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3223g = false;
        this.f3224h = -1;
        RunnableC0250y0 runnableC0250y0 = this.f3221e;
        if (runnableC0250y0 != null) {
            this.d.removeCallbacks(runnableC0250y0);
        }
    }
}
