package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class s1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public final float f2556f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2557g;
    public final int h;
    public final View i;

    /* renamed from: j, reason: collision with root package name */
    public r1 f2558j;

    /* renamed from: k, reason: collision with root package name */
    public r1 f2559k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2560l;

    /* renamed from: m, reason: collision with root package name */
    public int f2561m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f2562n = new int[2];

    public s1(View view) {
        this.i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2556f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f2557g = tapTimeout;
        this.h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        r1 r1Var = this.f2559k;
        View view = this.i;
        if (r1Var != null) {
            view.removeCallbacks(r1Var);
        }
        r1 r1Var2 = this.f2558j;
        if (r1Var2 != null) {
            view.removeCallbacks(r1Var2);
        }
    }

    public abstract k.c0 b();

    public abstract boolean c();

    public boolean d() {
        k.c0 b2 = b();
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
        boolean z4;
        p1 h;
        boolean z5 = this.f2560l;
        View view2 = this.i;
        if (z5) {
            k.c0 b2 = b();
            if (b2 != null && b2.b() && (h = b2.h()) != null && h.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f2562n;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                h.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b5 = h.b(obtainNoHistory, this.f2561m);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z6 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b5) {
                }
            }
            if (d()) {
                z4 = false;
            }
            z4 = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.f2561m);
                            if (findPointerIndex >= 0) {
                                float x4 = motionEvent.getX(findPointerIndex);
                                float y4 = motionEvent.getY(findPointerIndex);
                                float f5 = this.f2556f;
                                float f6 = -f5;
                                if (x4 < f6 || y4 < f6 || x4 >= (view2.getRight() - view2.getLeft()) + f5 || y4 >= (view2.getBottom() - view2.getTop()) + f5) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z4 = true;
                                        if (z4) {
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
                    this.f2561m = motionEvent.getPointerId(0);
                    if (this.f2558j == null) {
                        this.f2558j = new r1(this, 0);
                    }
                    view2.postDelayed(this.f2558j, this.f2557g);
                    if (this.f2559k == null) {
                        this.f2559k = new r1(this, 1);
                    }
                    view2.postDelayed(this.f2559k, this.h);
                }
            }
            z4 = false;
            if (z4) {
            }
        }
        this.f2560l = z4;
        return z4 || z5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2560l = false;
        this.f2561m = -1;
        r1 r1Var = this.f2558j;
        if (r1Var != null) {
            this.i.removeCallbacks(r1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
