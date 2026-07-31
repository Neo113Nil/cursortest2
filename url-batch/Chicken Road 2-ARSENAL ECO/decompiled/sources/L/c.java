package L;

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
    public static final a f1416v = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f1417a;

    /* renamed from: b, reason: collision with root package name */
    public int f1418b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1420d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1421e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1422f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1423g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1424h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1425i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1426j;

    /* renamed from: k, reason: collision with root package name */
    public int f1427k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1428l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1429m;

    /* renamed from: n, reason: collision with root package name */
    public final float f1430n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1431o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f1432p;

    /* renamed from: q, reason: collision with root package name */
    public final a.c f1433q;

    /* renamed from: r, reason: collision with root package name */
    public View f1434r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1435s;

    /* renamed from: t, reason: collision with root package name */
    public final com.onesignal.inAppMessages.internal.display.impl.a f1436t;

    /* renamed from: c, reason: collision with root package name */
    public int f1419c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final A.b f1437u = new A.b(2, this);

    public c(Context context, com.onesignal.inAppMessages.internal.display.impl.a aVar, a.c cVar) {
        this.f1436t = aVar;
        this.f1433q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1431o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1418b = viewConfiguration.getScaledTouchSlop();
        this.f1429m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1430n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1432p = new OverScroller(context, f1416v);
    }

    public final void a() {
        this.f1419c = -1;
        float[] fArr = this.f1420d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1421e, 0.0f);
            Arrays.fill(this.f1422f, 0.0f);
            Arrays.fill(this.f1423g, 0.0f);
            Arrays.fill(this.f1424h, 0);
            Arrays.fill(this.f1425i, 0);
            Arrays.fill(this.f1426j, 0);
            this.f1427k = 0;
        }
        VelocityTracker velocityTracker = this.f1428l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1428l = null;
        }
    }

    public final int b(int i7, int i8, int i9) {
        if (i7 == 0) {
            return 0;
        }
        float width = this.f1436t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i7) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i8);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i7) / i9) + 1.0f) * 256.0f), 600);
    }

    public final View c(int i7, int i8) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f1436t;
        for (int childCount = aVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = aVar.getChildAt(this.f1433q.getOrderedChildIndex(childCount));
            if (i7 >= childAt.getLeft() && i7 < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean d(int i7, int i8, int i9, int i10) {
        float f7;
        float f8;
        float f9;
        float f10;
        int left = this.f1434r.getLeft();
        int top = this.f1434r.getTop();
        int i11 = i7 - left;
        int i12 = i8 - top;
        OverScroller overScroller = this.f1432p;
        if (i11 == 0 && i12 == 0) {
            overScroller.abortAnimation();
            i(0);
            return false;
        }
        View view = this.f1434r;
        int i13 = (int) this.f1430n;
        int i14 = (int) this.f1429m;
        int abs = Math.abs(i9);
        if (abs < i13) {
            i9 = 0;
        } else if (abs > i14) {
            i9 = i9 > 0 ? i14 : -i14;
        }
        int abs2 = Math.abs(i10);
        if (abs2 < i13) {
            i10 = 0;
        } else if (abs2 > i14) {
            i10 = i10 > 0 ? i14 : -i14;
        }
        int abs3 = Math.abs(i11);
        int abs4 = Math.abs(i12);
        int abs5 = Math.abs(i9);
        int abs6 = Math.abs(i10);
        int i15 = abs5 + abs6;
        int i16 = abs3 + abs4;
        if (i9 != 0) {
            f7 = abs5;
            f8 = i15;
        } else {
            f7 = abs3;
            f8 = i16;
        }
        float f11 = f7 / f8;
        if (i10 != 0) {
            f9 = abs6;
            f10 = i15;
        } else {
            f9 = abs4;
            f10 = i16;
        }
        float f12 = f9 / f10;
        a.c cVar = this.f1433q;
        overScroller.startScroll(left, top, i11, i12, (int) ((b(i12, i10, cVar.getViewVerticalDragRange(view)) * f12) + (b(i11, i9, cVar.getViewHorizontalDragRange(view)) * f11)));
        i(2);
        return true;
    }

    public final boolean e(int i7) {
        if ((this.f1427k & (1 << i7)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i7 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void f() {
        VelocityTracker velocityTracker = this.f1428l;
        float f7 = this.f1429m;
        velocityTracker.computeCurrentVelocity(1000, f7);
        float xVelocity = this.f1428l.getXVelocity(this.f1419c);
        float abs = Math.abs(xVelocity);
        float f8 = this.f1430n;
        if (abs < f8) {
            xVelocity = 0.0f;
        } else if (abs > f7) {
            xVelocity = xVelocity > 0.0f ? f7 : -f7;
        }
        float yVelocity = this.f1428l.getYVelocity(this.f1419c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f8) {
            f7 = 0.0f;
        } else if (abs2 <= f7) {
            f7 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f7 = -f7;
        }
        this.f1435s = true;
        this.f1433q.onViewReleased(this.f1434r, xVelocity, f7);
        this.f1435s = false;
        if (this.f1417a == 1) {
            i(0);
        }
    }

    public final void g(float f7, float f8, int i7) {
        float[] fArr = this.f1420d;
        if (fArr == null || fArr.length <= i7) {
            int i8 = i7 + 1;
            float[] fArr2 = new float[i8];
            float[] fArr3 = new float[i8];
            float[] fArr4 = new float[i8];
            float[] fArr5 = new float[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1421e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1422f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1423g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1424h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1425i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1426j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1420d = fArr2;
            this.f1421e = fArr3;
            this.f1422f = fArr4;
            this.f1423g = fArr5;
            this.f1424h = iArr;
            this.f1425i = iArr2;
            this.f1426j = iArr3;
        }
        float[] fArr9 = this.f1420d;
        this.f1422f[i7] = f7;
        fArr9[i7] = f7;
        float[] fArr10 = this.f1421e;
        this.f1423g[i7] = f8;
        fArr10[i7] = f8;
        int[] iArr7 = this.f1424h;
        int i9 = (int) f7;
        int i10 = (int) f8;
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f1436t;
        int left = aVar.getLeft();
        int i11 = this.f1431o;
        int i12 = i9 < left + i11 ? 1 : 0;
        if (i10 < aVar.getTop() + i11) {
            i12 |= 4;
        }
        if (i9 > aVar.getRight() - i11) {
            i12 |= 2;
        }
        if (i10 > aVar.getBottom() - i11) {
            i12 |= 8;
        }
        iArr7[i7] = i12;
        this.f1427k |= 1 << i7;
    }

    public final void h(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i7 = 0; i7 < pointerCount; i7++) {
            int pointerId = motionEvent.getPointerId(i7);
            if (e(pointerId)) {
                float x6 = motionEvent.getX(i7);
                float y = motionEvent.getY(i7);
                this.f1422f[pointerId] = x6;
                this.f1423g[pointerId] = y;
            }
        }
    }

    public final void i(int i7) {
        this.f1436t.removeCallbacks(this.f1437u);
        if (this.f1417a != i7) {
            this.f1417a = i7;
            this.f1433q.onViewDragStateChanged(i7);
            if (this.f1417a == 0) {
                this.f1434r = null;
            }
        }
    }

    public final boolean j(View view, int i7) {
        if (view == this.f1434r && this.f1419c == i7) {
            return true;
        }
        if (view == null) {
            return false;
        }
        a.c cVar = this.f1433q;
        if (!cVar.tryCaptureView(view, i7)) {
            return false;
        }
        this.f1419c = i7;
        ViewParent parent = view.getParent();
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f1436t;
        if (parent != aVar) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + aVar + ")");
        }
        this.f1434r = view;
        this.f1419c = i7;
        cVar.onViewCaptured(view, i7);
        i(1);
        return true;
    }
}
