package L;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout;
import com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout$createDragHelper$1;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static final a f1460v = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public int f1461a;

    /* renamed from: b, reason: collision with root package name */
    public int f1462b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f1464d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f1465e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f1466f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f1467g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f1468h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f1469i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f1470j;

    /* renamed from: k, reason: collision with root package name */
    public int f1471k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1472l;

    /* renamed from: m, reason: collision with root package name */
    public final float f1473m;

    /* renamed from: n, reason: collision with root package name */
    public final float f1474n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1475o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f1476p;

    /* renamed from: q, reason: collision with root package name */
    public final DraggableRelativeLayout$createDragHelper$1 f1477q;

    /* renamed from: r, reason: collision with root package name */
    public View f1478r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1479s;

    /* renamed from: t, reason: collision with root package name */
    public final DraggableRelativeLayout f1480t;

    /* renamed from: c, reason: collision with root package name */
    public int f1463c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final B.a f1481u = new B.a(4, this);

    public c(Context context, DraggableRelativeLayout draggableRelativeLayout, DraggableRelativeLayout$createDragHelper$1 draggableRelativeLayout$createDragHelper$1) {
        this.f1480t = draggableRelativeLayout;
        this.f1477q = draggableRelativeLayout$createDragHelper$1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1475o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1462b = viewConfiguration.getScaledTouchSlop();
        this.f1473m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1474n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1476p = new OverScroller(context, f1460v);
    }

    public final void a() {
        this.f1463c = -1;
        float[] fArr = this.f1464d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f1465e, 0.0f);
            Arrays.fill(this.f1466f, 0.0f);
            Arrays.fill(this.f1467g, 0.0f);
            Arrays.fill(this.f1468h, 0);
            Arrays.fill(this.f1469i, 0);
            Arrays.fill(this.f1470j, 0);
            this.f1471k = 0;
        }
        VelocityTracker velocityTracker = this.f1472l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1472l = null;
        }
    }

    public final int b(int i2, int i3, int i6) {
        if (i2 == 0) {
            return 0;
        }
        float width = this.f1480t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i6) + 1.0f) * 256.0f), 600);
    }

    public final View c(int i2, int i3) {
        DraggableRelativeLayout draggableRelativeLayout = this.f1480t;
        for (int childCount = draggableRelativeLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = draggableRelativeLayout.getChildAt(this.f1477q.getOrderedChildIndex(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i2, int i3, int i6, int i7) {
        float f3;
        float f6;
        float f7;
        float f8;
        int left = this.f1478r.getLeft();
        int top = this.f1478r.getTop();
        int i8 = i2 - left;
        int i9 = i3 - top;
        OverScroller overScroller = this.f1476p;
        int i10 = 0;
        if (i8 == 0 && i9 == 0) {
            overScroller.abortAnimation();
            i(0);
            return false;
        }
        View view = this.f1478r;
        int i11 = (int) this.f1474n;
        int i12 = (int) this.f1473m;
        int abs = Math.abs(i6);
        if (abs < i11) {
            i6 = 0;
        } else if (abs > i12) {
            i6 = i6 > 0 ? i12 : -i12;
        }
        int abs2 = Math.abs(i7);
        if (abs2 >= i11) {
            if (abs2 > i12) {
                if (i7 > 0) {
                    i7 = i12;
                } else {
                    i10 = -i12;
                }
            }
            int abs3 = Math.abs(i8);
            int abs4 = Math.abs(i9);
            int abs5 = Math.abs(i6);
            int abs6 = Math.abs(i7);
            int i13 = abs5 + abs6;
            int i14 = abs3 + abs4;
            if (i6 == 0) {
                f3 = abs5;
                f6 = i13;
            } else {
                f3 = abs3;
                f6 = i14;
            }
            float f9 = f3 / f6;
            if (i7 == 0) {
                f7 = abs6;
                f8 = i13;
            } else {
                f7 = abs4;
                f8 = i14;
            }
            float f10 = f7 / f8;
            DraggableRelativeLayout$createDragHelper$1 draggableRelativeLayout$createDragHelper$1 = this.f1477q;
            overScroller.startScroll(left, top, i8, i9, (int) ((b(i9, i7, draggableRelativeLayout$createDragHelper$1.getViewVerticalDragRange(view)) * f10) + (b(i8, i6, draggableRelativeLayout$createDragHelper$1.getViewHorizontalDragRange(view)) * f9)));
            i(2);
            return true;
        }
        i7 = i10;
        int abs32 = Math.abs(i8);
        int abs42 = Math.abs(i9);
        int abs52 = Math.abs(i6);
        int abs62 = Math.abs(i7);
        int i132 = abs52 + abs62;
        int i142 = abs32 + abs42;
        if (i6 == 0) {
        }
        float f92 = f3 / f6;
        if (i7 == 0) {
        }
        float f102 = f7 / f8;
        DraggableRelativeLayout$createDragHelper$1 draggableRelativeLayout$createDragHelper$12 = this.f1477q;
        overScroller.startScroll(left, top, i8, i9, (int) ((b(i9, i7, draggableRelativeLayout$createDragHelper$12.getViewVerticalDragRange(view)) * f102) + (b(i8, i6, draggableRelativeLayout$createDragHelper$12.getViewHorizontalDragRange(view)) * f92)));
        i(2);
        return true;
    }

    public final boolean e(int i2) {
        if ((this.f1471k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void f() {
        VelocityTracker velocityTracker = this.f1472l;
        float f3 = this.f1473m;
        velocityTracker.computeCurrentVelocity(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, f3);
        float xVelocity = this.f1472l.getXVelocity(this.f1463c);
        float f6 = this.f1474n;
        float abs = Math.abs(xVelocity);
        float f7 = 0.0f;
        if (abs < f6) {
            xVelocity = 0.0f;
        } else if (abs > f3) {
            xVelocity = xVelocity > 0.0f ? f3 : -f3;
        }
        float yVelocity = this.f1472l.getYVelocity(this.f1463c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f6) {
            if (abs2 > f3) {
                if (yVelocity <= 0.0f) {
                    f3 = -f3;
                }
                f7 = f3;
            } else {
                f7 = yVelocity;
            }
        }
        this.f1479s = true;
        this.f1477q.onViewReleased(this.f1478r, xVelocity, f7);
        this.f1479s = false;
        if (this.f1461a == 1) {
            i(0);
        }
    }

    public final void g(float f3, float f6, int i2) {
        float[] fArr = this.f1464d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1465e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1466f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1467g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1468h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1469i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1470j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1464d = fArr2;
            this.f1465e = fArr3;
            this.f1466f = fArr4;
            this.f1467g = fArr5;
            this.f1468h = iArr;
            this.f1469i = iArr2;
            this.f1470j = iArr3;
        }
        float[] fArr9 = this.f1464d;
        this.f1466f[i2] = f3;
        fArr9[i2] = f3;
        float[] fArr10 = this.f1465e;
        this.f1467g[i2] = f6;
        fArr10[i2] = f6;
        int[] iArr7 = this.f1468h;
        int i6 = (int) f3;
        int i7 = (int) f6;
        DraggableRelativeLayout draggableRelativeLayout = this.f1480t;
        int left = draggableRelativeLayout.getLeft();
        int i8 = this.f1475o;
        int i9 = i6 < left + i8 ? 1 : 0;
        if (i7 < draggableRelativeLayout.getTop() + i8) {
            i9 |= 4;
        }
        if (i6 > draggableRelativeLayout.getRight() - i8) {
            i9 |= 2;
        }
        if (i7 > draggableRelativeLayout.getBottom() - i8) {
            i9 |= 8;
        }
        iArr7[i2] = i9;
        this.f1471k |= 1 << i2;
    }

    public final void h(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (e(pointerId)) {
                float x5 = motionEvent.getX(i2);
                float y5 = motionEvent.getY(i2);
                this.f1466f[pointerId] = x5;
                this.f1467g[pointerId] = y5;
            }
        }
    }

    public final void i(int i2) {
        this.f1480t.removeCallbacks(this.f1481u);
        if (this.f1461a != i2) {
            this.f1461a = i2;
            this.f1477q.onViewDragStateChanged(i2);
            if (this.f1461a == 0) {
                this.f1478r = null;
            }
        }
    }

    public final boolean j(View view, int i2) {
        if (view == this.f1478r && this.f1463c == i2) {
            return true;
        }
        if (view == null) {
            return false;
        }
        DraggableRelativeLayout$createDragHelper$1 draggableRelativeLayout$createDragHelper$1 = this.f1477q;
        if (!draggableRelativeLayout$createDragHelper$1.tryCaptureView(view, i2)) {
            return false;
        }
        this.f1463c = i2;
        ViewParent parent = view.getParent();
        DraggableRelativeLayout draggableRelativeLayout = this.f1480t;
        if (parent != draggableRelativeLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + draggableRelativeLayout + ")");
        }
        this.f1478r = view;
        this.f1463c = i2;
        draggableRelativeLayout$createDragHelper$1.onViewCaptured(view, i2);
        i(1);
        return true;
    }
}
