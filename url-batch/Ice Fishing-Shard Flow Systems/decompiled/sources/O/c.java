package O;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static final a f1882v = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public int f1883a;

    /* renamed from: b, reason: collision with root package name */
    public int f1884b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1886d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1887e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1888f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1889g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1890h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1891i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f1892k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1893l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1894m;

    /* renamed from: n, reason: collision with root package name */
    public final float f1895n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1896o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f1897p;

    /* renamed from: q, reason: collision with root package name */
    public final a.c f1898q;

    /* renamed from: r, reason: collision with root package name */
    public View f1899r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1900s;

    /* renamed from: t, reason: collision with root package name */
    public final com.onesignal.inAppMessages.internal.display.impl.a f1901t;

    /* renamed from: c, reason: collision with root package name */
    public int f1885c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final F.b f1902u = new F.b(7, this);

    public c(Context context, com.onesignal.inAppMessages.internal.display.impl.a aVar, a.c cVar) {
        this.f1901t = aVar;
        this.f1898q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1896o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1884b = viewConfiguration.getScaledTouchSlop();
        this.f1894m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1895n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1897p = new OverScroller(context, f1882v);
    }

    public final void a() {
        this.f1885c = -1;
        float[] fArr = this.f1886d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1887e, 0.0f);
            Arrays.fill(this.f1888f, 0.0f);
            Arrays.fill(this.f1889g, 0.0f);
            Arrays.fill(this.f1890h, 0);
            Arrays.fill(this.f1891i, 0);
            Arrays.fill(this.j, 0);
            this.f1892k = 0;
        }
        VelocityTracker velocityTracker = this.f1893l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1893l = null;
        }
    }

    public final int b(int i2, int i5, int i7) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f1901t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i5);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i7) + 1.0f) * 256.0f), 600);
    }

    public final View c(int i2, int i5) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f1901t;
        for (int childCount = aVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = aVar.getChildAt(this.f1898q.getOrderedChildIndex(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean d(int i2, int i5, int i7, int i8) {
        float f7;
        float f8;
        float f9;
        float f10;
        int left = this.f1899r.getLeft();
        int top = this.f1899r.getTop();
        int i9 = i2 - left;
        int i10 = i5 - top;
        OverScroller overScroller = this.f1897p;
        if (i9 == 0 && i10 == 0) {
            overScroller.abortAnimation();
            i(0);
            return false;
        }
        View view = this.f1899r;
        int i11 = (int) this.f1895n;
        int i12 = (int) this.f1894m;
        int abs = Math.abs(i7);
        if (abs < i11) {
            i7 = 0;
        } else if (abs > i12) {
            i7 = i7 > 0 ? i12 : -i12;
        }
        int abs2 = Math.abs(i8);
        if (abs2 < i11) {
            i8 = 0;
        } else if (abs2 > i12) {
            i8 = i8 > 0 ? i12 : -i12;
        }
        int abs3 = Math.abs(i9);
        int abs4 = Math.abs(i10);
        int abs5 = Math.abs(i7);
        int abs6 = Math.abs(i8);
        int i13 = abs5 + abs6;
        int i14 = abs3 + abs4;
        if (i7 != 0) {
            f7 = abs5;
            f8 = i13;
        } else {
            f7 = abs3;
            f8 = i14;
        }
        float f11 = f7 / f8;
        if (i8 != 0) {
            f9 = abs6;
            f10 = i13;
        } else {
            f9 = abs4;
            f10 = i14;
        }
        float f12 = f9 / f10;
        a.c cVar = this.f1898q;
        overScroller.startScroll(left, top, i9, i10, (int) ((b(i10, i8, cVar.getViewVerticalDragRange(view)) * f12) + (b(i9, i7, cVar.getViewHorizontalDragRange(view)) * f11)));
        i(2);
        return true;
    }

    public final boolean e(int i2) {
        if ((this.f1892k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void f() {
        VelocityTracker velocityTracker = this.f1893l;
        float f7 = this.f1894m;
        velocityTracker.computeCurrentVelocity(1000, f7);
        float xVelocity = this.f1893l.getXVelocity(this.f1885c);
        float abs = Math.abs(xVelocity);
        float f8 = this.f1895n;
        if (abs < f8) {
            xVelocity = 0.0f;
        } else if (abs > f7) {
            xVelocity = xVelocity > 0.0f ? f7 : -f7;
        }
        float yVelocity = this.f1893l.getYVelocity(this.f1885c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f8) {
            f7 = 0.0f;
        } else if (abs2 <= f7) {
            f7 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f7 = -f7;
        }
        this.f1900s = true;
        this.f1898q.onViewReleased(this.f1899r, xVelocity, f7);
        this.f1900s = false;
        if (this.f1883a == 1) {
            i(0);
        }
    }

    public final void g(float f7, float f8, int i2) {
        float[] fArr = this.f1886d;
        if (fArr == null || fArr.length <= i2) {
            int i5 = i2 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1887e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1888f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1889g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1890h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1891i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1886d = fArr2;
            this.f1887e = fArr3;
            this.f1888f = fArr4;
            this.f1889g = fArr5;
            this.f1890h = iArr;
            this.f1891i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f1886d;
        this.f1888f[i2] = f7;
        fArr9[i2] = f7;
        float[] fArr10 = this.f1887e;
        this.f1889g[i2] = f8;
        fArr10[i2] = f8;
        int[] iArr7 = this.f1890h;
        int i7 = (int) f7;
        int i8 = (int) f8;
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f1901t;
        int left = aVar.getLeft();
        int i9 = this.f1896o;
        int i10 = i7 < left + i9 ? 1 : 0;
        if (i8 < aVar.getTop() + i9) {
            i10 |= 4;
        }
        if (i7 > aVar.getRight() - i9) {
            i10 |= 2;
        }
        if (i8 > aVar.getBottom() - i9) {
            i10 |= 8;
        }
        iArr7[i2] = i10;
        this.f1892k |= 1 << i2;
    }

    public final void h(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (e(pointerId)) {
                float x7 = motionEvent.getX(i2);
                float y7 = motionEvent.getY(i2);
                this.f1888f[pointerId] = x7;
                this.f1889g[pointerId] = y7;
            }
        }
    }

    public final void i(int i2) {
        this.f1901t.removeCallbacks(this.f1902u);
        if (this.f1883a != i2) {
            this.f1883a = i2;
            this.f1898q.onViewDragStateChanged(i2);
            if (this.f1883a == 0) {
                this.f1899r = null;
            }
        }
    }

    public final boolean j(View view, int i2) {
        if (view == this.f1899r && this.f1885c == i2) {
            return true;
        }
        if (view == null) {
            return false;
        }
        a.c cVar = this.f1898q;
        if (!cVar.tryCaptureView(view, i2)) {
            return false;
        }
        this.f1885c = i2;
        ViewParent parent = view.getParent();
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f1901t;
        if (parent != aVar) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + aVar + ")");
        }
        this.f1899r = view;
        this.f1885c = i2;
        cVar.onViewCaptured(view, i2);
        i(1);
        return true;
    }
}
