package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jt implements View.OnTouchListener, View.OnAttachStateChangeListener {
    private final float a;
    private final int b;
    public final View c;
    public boolean d;
    private final int e;
    private Runnable f;
    private Runnable g;
    private int h;
    private final int[] i = new int[2];

    public jt(View view) {
        this.c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.b = tapTimeout;
        this.e = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public abstract gt a();

    public boolean b() {
        throw null;
    }

    protected boolean c() {
        gt a = a();
        if (a == null || !a.x()) {
            return true;
        }
        a.m();
        return true;
    }

    public final void d() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f;
        if (runnable2 != null) {
            this.c.removeCallbacks(runnable2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r14 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        if (r4 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0106  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        ListView bi;
        boolean z2 = this.d;
        View view2 = this.c;
        if (z2) {
            gt a = a();
            if (a != null && a.x() && (bi = a.bi()) != null) {
                jp jpVar = (jp) bi;
                if (jpVar.isShown()) {
                    MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    int[] iArr = this.i;
                    view2.getLocationOnScreen(iArr);
                    obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                    bi.getLocationOnScreen(iArr);
                    obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                    boolean a2 = jpVar.a(obtainNoHistory, this.h);
                    obtainNoHistory.recycle();
                    int actionMasked = motionEvent.getActionMasked();
                    boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                    if (a2) {
                    }
                }
            }
            if (c()) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.h);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.a;
                                float f2 = -f;
                                if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                                    d();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (b()) {
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
                    d();
                } else {
                    this.h = motionEvent.getPointerId(0);
                    if (this.f == null) {
                        this.f = new bo(this, 11, null);
                    }
                    view2.postDelayed(this.f, this.b);
                    if (this.g == null) {
                        this.g = new bo(this, 12, null);
                    }
                    view2.postDelayed(this.g, this.e);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.d = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d = false;
        this.h = -1;
        Runnable runnable = this.f;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
