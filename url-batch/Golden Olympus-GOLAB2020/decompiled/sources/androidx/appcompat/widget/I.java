package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class I implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final float f10682a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10683b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10684c;

    /* renamed from: d, reason: collision with root package name */
    final View f10685d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f10686e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f10687f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10688g;

    /* renamed from: h, reason: collision with root package name */
    private int f10689h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f10690i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = I.this.f10685d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            I.this.e();
        }
    }

    public I(View view) {
        this.f10685d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f10682a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f10683b = tapTimeout;
        this.f10684c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f10687f;
        if (runnable != null) {
            this.f10685d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f10686e;
        if (runnable2 != null) {
            this.f10685d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        G g4;
        View view = this.f10685d;
        j.e b4 = b();
        if (b4 != null && b4.isShowing() && (g4 = (G) b4.getListView()) != null && g4.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, obtainNoHistory);
            j(g4, obtainNoHistory);
            boolean e4 = g4.e(obtainNoHistory, this.f10689h);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z4 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (e4 && z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f10685d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f10689h);
                    if (findPointerIndex >= 0 && !h(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f10682a)) {
                        a();
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                }
            }
            a();
        } else {
            this.f10689h = motionEvent.getPointerId(0);
            if (this.f10686e == null) {
                this.f10686e = new a();
            }
            view.postDelayed(this.f10686e, this.f10683b);
            if (this.f10687f == null) {
                this.f10687f = new b();
            }
            view.postDelayed(this.f10687f, this.f10684c);
        }
        return false;
    }

    private static boolean h(View view, float f4, float f5, float f6) {
        float f7 = -f6;
        return f4 >= f7 && f5 >= f7 && f4 < ((float) (view.getRight() - view.getLeft())) + f6 && f5 < ((float) (view.getBottom() - view.getTop())) + f6;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f10690i);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f10690i);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    public abstract j.e b();

    protected abstract boolean c();

    protected boolean d() {
        j.e b4 = b();
        if (b4 == null || !b4.isShowing()) {
            return true;
        }
        b4.dismiss();
        return true;
    }

    void e() {
        a();
        View view = this.f10685d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f10688g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z4;
        boolean z5 = this.f10688g;
        if (z5) {
            z4 = f(motionEvent) || !d();
        } else {
            z4 = g(motionEvent) && c();
            if (z4) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f10685d.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f10688g = z4;
        return z4 || z5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f10688g = false;
        this.f10689h = -1;
        Runnable runnable = this.f10686e;
        if (runnable != null) {
            this.f10685d.removeCallbacks(runnable);
        }
    }
}
