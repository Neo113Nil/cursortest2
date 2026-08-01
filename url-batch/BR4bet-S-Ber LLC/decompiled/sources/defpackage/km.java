package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class km implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float f;
    public final int g;
    public final int h;
    public final View i;
    public jm j;
    public jm k;
    public boolean l;
    public int m;
    public final int[] n = new int[2];

    public km(View view) {
        this.i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.g = tapTimeout;
        this.h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        jm jmVar = this.k;
        View view = this.i;
        if (jmVar != null) {
            view.removeCallbacks(jmVar);
        }
        jm jmVar2 = this.j;
        if (jmVar2 != null) {
            view.removeCallbacks(jmVar2);
        }
    }

    public abstract s50 b();

    public abstract boolean c();

    public boolean d() {
        s50 b = b();
        if (b == null || !b.b()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r14 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007b, code lost:
    
        if (r4 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        mi i;
        boolean z2 = this.l;
        View view2 = this.i;
        if (z2) {
            s50 b = b();
            if (b != null && b.b() && (i = b.i()) != null && i.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.n;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                i.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b2 = i.b(obtainNoHistory, this.m);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (b2) {
                }
            }
            if (d()) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.m);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.f;
                                float f2 = -f;
                                if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
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
                    a();
                } else {
                    this.m = motionEvent.getPointerId(0);
                    if (this.j == null) {
                        this.j = new jm(this, 0);
                    }
                    view2.postDelayed(this.j, this.g);
                    if (this.k == null) {
                        this.k = new jm(this, 1);
                    }
                    view2.postDelayed(this.k, this.h);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.l = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l = false;
        this.m = -1;
        jm jmVar = this.j;
        if (jmVar != null) {
            this.i.removeCallbacks(jmVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
