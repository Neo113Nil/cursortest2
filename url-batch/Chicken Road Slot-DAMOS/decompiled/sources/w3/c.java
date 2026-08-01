package w3;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import b7.k;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Arrays;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static final a f10060v = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f10061a;

    /* renamed from: b, reason: collision with root package name */
    public int f10062b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f10064d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f10065e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f10066f;
    public float[] g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f10067h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f10068i;
    public int[] j;

    /* renamed from: k, reason: collision with root package name */
    public int f10069k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f10070l;

    /* renamed from: m, reason: collision with root package name */
    public final float f10071m;

    /* renamed from: n, reason: collision with root package name */
    public final float f10072n;

    /* renamed from: o, reason: collision with root package name */
    public final int f10073o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f10074p;

    /* renamed from: q, reason: collision with root package name */
    public final a.c f10075q;

    /* renamed from: r, reason: collision with root package name */
    public View f10076r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10077s;

    /* renamed from: t, reason: collision with root package name */
    public final com.onesignal.inAppMessages.internal.display.impl.a f10078t;

    /* renamed from: c, reason: collision with root package name */
    public int f10063c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final k f10079u = new k(23, this);

    public c(Context context, com.onesignal.inAppMessages.internal.display.impl.a aVar, a.c cVar) {
        this.f10078t = aVar;
        this.f10075q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10073o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f10062b = viewConfiguration.getScaledTouchSlop();
        this.f10071m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10072n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f10074p = new OverScroller(context, f10060v);
    }

    public final void a() {
        this.f10063c = -1;
        float[] fArr = this.f10064d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f10065e, 0.0f);
            Arrays.fill(this.f10066f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.f10067h, 0);
            Arrays.fill(this.f10068i, 0);
            Arrays.fill(this.j, 0);
            this.f10069k = 0;
        }
        VelocityTracker velocityTracker = this.f10070l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10070l = null;
        }
    }

    public final int b(int i3, int i10, int i11) {
        if (i3 == 0) {
            return 0;
        }
        float width = this.f10078t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i3) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i10);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i3) / i11) + 1.0f) * 256.0f), 600);
    }

    public final View c(int i3, int i10) {
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f10078t;
        for (int childCount = aVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = aVar.getChildAt(this.f10075q.getOrderedChildIndex(childCount));
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i10 >= childAt.getTop() && i10 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean d(int i3, int i10, int i11, int i12) {
        float f3;
        float f10;
        float f11;
        float f12;
        int left = this.f10076r.getLeft();
        int top = this.f10076r.getTop();
        int i13 = i3 - left;
        int i14 = i10 - top;
        OverScroller overScroller = this.f10074p;
        if (i13 == 0 && i14 == 0) {
            overScroller.abortAnimation();
            i(0);
            return false;
        }
        View view = this.f10076r;
        int i15 = (int) this.f10072n;
        int i16 = (int) this.f10071m;
        int abs = Math.abs(i11);
        if (abs < i15) {
            i11 = 0;
        } else if (abs > i16) {
            i11 = i11 > 0 ? i16 : -i16;
        }
        int abs2 = Math.abs(i12);
        if (abs2 < i15) {
            i12 = 0;
        } else if (abs2 > i16) {
            i12 = i12 > 0 ? i16 : -i16;
        }
        int abs3 = Math.abs(i13);
        int abs4 = Math.abs(i14);
        int abs5 = Math.abs(i11);
        int abs6 = Math.abs(i12);
        int i17 = abs5 + abs6;
        int i18 = abs3 + abs4;
        if (i11 != 0) {
            f3 = abs5;
            f10 = i17;
        } else {
            f3 = abs3;
            f10 = i18;
        }
        float f13 = f3 / f10;
        if (i12 != 0) {
            f11 = abs6;
            f12 = i17;
        } else {
            f11 = abs4;
            f12 = i18;
        }
        float f14 = f11 / f12;
        a.c cVar = this.f10075q;
        overScroller.startScroll(left, top, i13, i14, (int) ((b(i14, i12, cVar.getViewVerticalDragRange(view)) * f14) + (b(i13, i11, cVar.getViewHorizontalDragRange(view)) * f13)));
        i(2);
        return true;
    }

    public final boolean e(int i3) {
        if ((this.f10069k & (1 << i3)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i3 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void f() {
        VelocityTracker velocityTracker = this.f10070l;
        float f3 = this.f10071m;
        velocityTracker.computeCurrentVelocity(1000, f3);
        float xVelocity = this.f10070l.getXVelocity(this.f10063c);
        float abs = Math.abs(xVelocity);
        float f10 = this.f10072n;
        if (abs < f10) {
            xVelocity = 0.0f;
        } else if (abs > f3) {
            xVelocity = xVelocity > 0.0f ? f3 : -f3;
        }
        float yVelocity = this.f10070l.getYVelocity(this.f10063c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f10) {
            f3 = 0.0f;
        } else if (abs2 <= f3) {
            f3 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f3 = -f3;
        }
        this.f10077s = true;
        this.f10075q.onViewReleased(this.f10076r, xVelocity, f3);
        this.f10077s = false;
        if (this.f10061a == 1) {
            i(0);
        }
    }

    public final void g(float f3, float f10, int i3) {
        float[] fArr = this.f10064d;
        if (fArr == null || fArr.length <= i3) {
            int i10 = i3 + 1;
            float[] fArr2 = new float[i10];
            float[] fArr3 = new float[i10];
            float[] fArr4 = new float[i10];
            float[] fArr5 = new float[i10];
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int[] iArr3 = new int[i10];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f10065e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f10066f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f10067h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f10068i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f10064d = fArr2;
            this.f10065e = fArr3;
            this.f10066f = fArr4;
            this.g = fArr5;
            this.f10067h = iArr;
            this.f10068i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.f10064d;
        this.f10066f[i3] = f3;
        fArr9[i3] = f3;
        float[] fArr10 = this.f10065e;
        this.g[i3] = f10;
        fArr10[i3] = f10;
        int[] iArr7 = this.f10067h;
        int i11 = (int) f3;
        int i12 = (int) f10;
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f10078t;
        int left = aVar.getLeft();
        int i13 = this.f10073o;
        int i14 = i11 < left + i13 ? 1 : 0;
        if (i12 < aVar.getTop() + i13) {
            i14 |= 4;
        }
        if (i11 > aVar.getRight() - i13) {
            i14 |= 2;
        }
        if (i12 > aVar.getBottom() - i13) {
            i14 |= 8;
        }
        iArr7[i3] = i14;
        this.f10069k |= 1 << i3;
    }

    public final void h(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            if (e(pointerId)) {
                float x10 = motionEvent.getX(i3);
                float y3 = motionEvent.getY(i3);
                this.f10066f[pointerId] = x10;
                this.g[pointerId] = y3;
            }
        }
    }

    public final void i(int i3) {
        this.f10078t.removeCallbacks(this.f10079u);
        if (this.f10061a != i3) {
            this.f10061a = i3;
            this.f10075q.onViewDragStateChanged(i3);
            if (this.f10061a == 0) {
                this.f10076r = null;
            }
        }
    }

    public final boolean j(View view, int i3) {
        if (view == this.f10076r && this.f10063c == i3) {
            return true;
        }
        if (view == null) {
            return false;
        }
        a.c cVar = this.f10075q;
        if (!cVar.tryCaptureView(view, i3)) {
            return false;
        }
        this.f10063c = i3;
        ViewParent parent = view.getParent();
        com.onesignal.inAppMessages.internal.display.impl.a aVar = this.f10078t;
        if (parent != aVar) {
            a1.g(aVar, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            return false;
        }
        this.f10076r = view;
        this.f10063c = i3;
        cVar.onViewCaptured(view, i3);
        i(1);
        return true;
    }
}
