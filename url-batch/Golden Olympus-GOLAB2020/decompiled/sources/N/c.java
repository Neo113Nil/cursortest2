package N;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.AbstractC1281a0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    private static final Interpolator f1002x = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f1003a;

    /* renamed from: b, reason: collision with root package name */
    private int f1004b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f1006d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f1007e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f1008f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f1009g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f1010h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f1011i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f1012j;

    /* renamed from: k, reason: collision with root package name */
    private int f1013k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f1014l;

    /* renamed from: m, reason: collision with root package name */
    private float f1015m;

    /* renamed from: n, reason: collision with root package name */
    private float f1016n;

    /* renamed from: o, reason: collision with root package name */
    private int f1017o;

    /* renamed from: p, reason: collision with root package name */
    private final int f1018p;

    /* renamed from: q, reason: collision with root package name */
    private int f1019q;

    /* renamed from: r, reason: collision with root package name */
    private OverScroller f1020r;

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC0021c f1021s;

    /* renamed from: t, reason: collision with root package name */
    private View f1022t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f1023u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f1024v;

    /* renamed from: c, reason: collision with root package name */
    private int f1005c = -1;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f1025w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0021c abstractC0021c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0021c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f1024v = viewGroup;
        this.f1021s = abstractC0021c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i4 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f1018p = i4;
        this.f1017o = i4;
        this.f1004b = viewConfiguration.getScaledTouchSlop();
        this.f1015m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1016n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1020r = new OverScroller(context, f1002x);
    }

    private void A() {
        this.f1014l.computeCurrentVelocity(1000, this.f1015m);
        n(e(this.f1014l.getXVelocity(this.f1005c), this.f1016n, this.f1015m), e(this.f1014l.getYVelocity(this.f1005c), this.f1016n, this.f1015m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [N.c$c] */
    private void B(float f4, float f5, int i4) {
        boolean c4 = c(f4, f5, i4, 1);
        boolean z4 = c4;
        if (c(f5, f4, i4, 4)) {
            z4 = (c4 ? 1 : 0) | 4;
        }
        boolean z5 = z4;
        if (c(f4, f5, i4, 2)) {
            z5 = (z4 ? 1 : 0) | 2;
        }
        ?? r02 = z5;
        if (c(f5, f4, i4, 8)) {
            r02 = (z5 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f1011i;
            iArr[i4] = iArr[i4] | r02;
            this.f1021s.onEdgeDragStarted(r02, i4);
        }
    }

    private void C(float f4, float f5, int i4) {
        q(i4);
        float[] fArr = this.f1006d;
        this.f1008f[i4] = f4;
        fArr[i4] = f4;
        float[] fArr2 = this.f1007e;
        this.f1009g[i4] = f5;
        fArr2[i4] = f5;
        this.f1010h[i4] = t((int) f4, (int) f5);
        this.f1013k |= 1 << i4;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if (x(pointerId)) {
                float x4 = motionEvent.getX(i4);
                float y4 = motionEvent.getY(i4);
                this.f1008f[pointerId] = x4;
                this.f1009g[pointerId] = y4;
            }
        }
    }

    private boolean c(float f4, float f5, int i4, int i5) {
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f5);
        if ((this.f1010h[i4] & i5) == i5 && (this.f1019q & i5) != 0 && (this.f1012j[i4] & i5) != i5 && (this.f1011i[i4] & i5) != i5) {
            int i6 = this.f1004b;
            if (abs > i6 || abs2 > i6) {
                if (abs < abs2 * 0.5f && this.f1021s.onEdgeLock(i5)) {
                    int[] iArr = this.f1012j;
                    iArr[i4] = iArr[i4] | i5;
                    return false;
                }
                if ((this.f1011i[i4] & i5) == 0 && abs > this.f1004b) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean d(View view, float f4, float f5) {
        if (view == null) {
            return false;
        }
        boolean z4 = this.f1021s.getViewHorizontalDragRange(view) > 0;
        boolean z5 = this.f1021s.getViewVerticalDragRange(view) > 0;
        if (!z4 || !z5) {
            return z4 ? Math.abs(f4) > ((float) this.f1004b) : z5 && Math.abs(f5) > ((float) this.f1004b);
        }
        float f6 = (f4 * f4) + (f5 * f5);
        int i4 = this.f1004b;
        return f6 > ((float) (i4 * i4));
    }

    private float e(float f4, float f5, float f6) {
        float abs = Math.abs(f4);
        if (abs < f5) {
            return 0.0f;
        }
        return abs > f6 ? f4 > 0.0f ? f6 : -f6 : f4;
    }

    private int f(int i4, int i5, int i6) {
        int abs = Math.abs(i4);
        if (abs < i5) {
            return 0;
        }
        return abs > i6 ? i4 > 0 ? i6 : -i6 : i4;
    }

    private void g() {
        float[] fArr = this.f1006d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f1007e, 0.0f);
        Arrays.fill(this.f1008f, 0.0f);
        Arrays.fill(this.f1009g, 0.0f);
        Arrays.fill(this.f1010h, 0);
        Arrays.fill(this.f1011i, 0);
        Arrays.fill(this.f1012j, 0);
        this.f1013k = 0;
    }

    private void h(int i4) {
        if (this.f1006d == null || !w(i4)) {
            return;
        }
        this.f1006d[i4] = 0.0f;
        this.f1007e[i4] = 0.0f;
        this.f1008f[i4] = 0.0f;
        this.f1009g[i4] = 0.0f;
        this.f1010h[i4] = 0;
        this.f1011i[i4] = 0;
        this.f1012j[i4] = 0;
        this.f1013k = (~(1 << i4)) & this.f1013k;
    }

    private int i(int i4, int i5, int i6) {
        if (i4 == 0) {
            return 0;
        }
        int width = this.f1024v.getWidth();
        float f4 = width / 2;
        float o4 = f4 + (o(Math.min(1.0f, Math.abs(i4) / width)) * f4);
        int abs = Math.abs(i5);
        return Math.min(abs > 0 ? Math.round(Math.abs(o4 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / i6) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i4, int i5, int i6, int i7) {
        float f4;
        float f5;
        float f6;
        float f7;
        int f8 = f(i6, (int) this.f1016n, (int) this.f1015m);
        int f9 = f(i7, (int) this.f1016n, (int) this.f1015m);
        int abs = Math.abs(i4);
        int abs2 = Math.abs(i5);
        int abs3 = Math.abs(f8);
        int abs4 = Math.abs(f9);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (f8 != 0) {
            f4 = abs3;
            f5 = i8;
        } else {
            f4 = abs;
            f5 = i9;
        }
        float f10 = f4 / f5;
        if (f9 != 0) {
            f6 = abs4;
            f7 = i8;
        } else {
            f6 = abs2;
            f7 = i9;
        }
        return (int) ((i(i4, f8, this.f1021s.getViewHorizontalDragRange(view)) * f10) + (i(i5, f9, this.f1021s.getViewVerticalDragRange(view)) * (f6 / f7)));
    }

    public static c l(ViewGroup viewGroup, float f4, AbstractC0021c abstractC0021c) {
        c m4 = m(viewGroup, abstractC0021c);
        m4.f1004b = (int) (m4.f1004b * (1.0f / f4));
        return m4;
    }

    public static c m(ViewGroup viewGroup, AbstractC0021c abstractC0021c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0021c);
    }

    private void n(float f4, float f5) {
        this.f1023u = true;
        this.f1021s.onViewReleased(this.f1022t, f4, f5);
        this.f1023u = false;
        if (this.f1003a == 1) {
            E(0);
        }
    }

    private float o(float f4) {
        return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
    }

    private void p(int i4, int i5, int i6, int i7) {
        int left = this.f1022t.getLeft();
        int top = this.f1022t.getTop();
        if (i6 != 0) {
            i4 = this.f1021s.clampViewPositionHorizontal(this.f1022t, i4, i6);
            AbstractC1281a0.Y(this.f1022t, i4 - left);
        }
        int i8 = i4;
        if (i7 != 0) {
            i5 = this.f1021s.clampViewPositionVertical(this.f1022t, i5, i7);
            AbstractC1281a0.Z(this.f1022t, i5 - top);
        }
        int i9 = i5;
        if (i6 == 0 && i7 == 0) {
            return;
        }
        this.f1021s.onViewPositionChanged(this.f1022t, i8, i9, i8 - left, i9 - top);
    }

    private void q(int i4) {
        float[] fArr = this.f1006d;
        if (fArr == null || fArr.length <= i4) {
            int i5 = i4 + 1;
            float[] fArr2 = new float[i5];
            float[] fArr3 = new float[i5];
            float[] fArr4 = new float[i5];
            float[] fArr5 = new float[i5];
            int[] iArr = new int[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f1007e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f1008f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f1009g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f1010h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f1011i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f1012j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f1006d = fArr2;
            this.f1007e = fArr3;
            this.f1008f = fArr4;
            this.f1009g = fArr5;
            this.f1010h = iArr;
            this.f1011i = iArr2;
            this.f1012j = iArr3;
        }
    }

    private boolean s(int i4, int i5, int i6, int i7) {
        int left = this.f1022t.getLeft();
        int top = this.f1022t.getTop();
        int i8 = i4 - left;
        int i9 = i5 - top;
        if (i8 == 0 && i9 == 0) {
            this.f1020r.abortAnimation();
            E(0);
            return false;
        }
        this.f1020r.startScroll(left, top, i8, i9, j(this.f1022t, i8, i9, i6, i7));
        E(2);
        return true;
    }

    private int t(int i4, int i5) {
        int i6 = i4 < this.f1024v.getLeft() + this.f1017o ? 1 : 0;
        if (i5 < this.f1024v.getTop() + this.f1017o) {
            i6 |= 4;
        }
        if (i4 > this.f1024v.getRight() - this.f1017o) {
            i6 |= 2;
        }
        return i5 > this.f1024v.getBottom() - this.f1017o ? i6 | 8 : i6;
    }

    private boolean x(int i4) {
        if (w(i4)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i4) {
        this.f1024v.removeCallbacks(this.f1025w);
        if (this.f1003a != i4) {
            this.f1003a = i4;
            this.f1021s.onViewDragStateChanged(i4);
            if (this.f1003a == 0) {
                this.f1022t = null;
            }
        }
    }

    public void F(int i4) {
        this.f1019q = i4;
    }

    public boolean G(int i4, int i5) {
        if (this.f1023u) {
            return s(i4, i5, (int) this.f1014l.getXVelocity(this.f1005c), (int) this.f1014l.getYVelocity(this.f1005c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean H(MotionEvent motionEvent) {
        View r4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1014l == null) {
            this.f1014l = VelocityTracker.obtain();
        }
        this.f1014l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x4 = motionEvent.getX(actionIndex);
                            float y4 = motionEvent.getY(actionIndex);
                            C(x4, y4, pointerId);
                            int i4 = this.f1003a;
                            if (i4 == 0) {
                                int i5 = this.f1010h[pointerId];
                                int i6 = this.f1019q;
                                if ((i5 & i6) != 0) {
                                    this.f1021s.onEdgeTouched(i5 & i6, pointerId);
                                }
                            } else if (i4 == 2 && (r4 = r((int) x4, (int) y4)) == this.f1022t) {
                                J(r4, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            h(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f1006d != null && this.f1007e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i7 = 0; i7 < pointerCount; i7++) {
                        int pointerId2 = motionEvent.getPointerId(i7);
                        if (x(pointerId2)) {
                            float x5 = motionEvent.getX(i7);
                            float y5 = motionEvent.getY(i7);
                            float f4 = x5 - this.f1006d[pointerId2];
                            float f5 = y5 - this.f1007e[pointerId2];
                            View r5 = r((int) x5, (int) y5);
                            boolean z4 = r5 != null && d(r5, f4, f5);
                            if (z4) {
                                int left = r5.getLeft();
                                int i8 = (int) f4;
                                int clampViewPositionHorizontal = this.f1021s.clampViewPositionHorizontal(r5, left + i8, i8);
                                int top = r5.getTop();
                                int i9 = (int) f5;
                                int clampViewPositionVertical = this.f1021s.clampViewPositionVertical(r5, top + i9, i9);
                                int viewHorizontalDragRange = this.f1021s.getViewHorizontalDragRange(r5);
                                int viewVerticalDragRange = this.f1021s.getViewVerticalDragRange(r5);
                                if (viewHorizontalDragRange != 0) {
                                    if (viewHorizontalDragRange > 0) {
                                    }
                                }
                                if (viewVerticalDragRange == 0) {
                                    break;
                                }
                                if (viewVerticalDragRange > 0 && clampViewPositionVertical == top) {
                                    break;
                                }
                            }
                            B(f4, f5, pointerId2);
                            if (this.f1003a == 1) {
                                break;
                            }
                            if (z4 && J(r5, pointerId2)) {
                                break;
                            }
                        }
                    }
                    D(motionEvent);
                }
            }
            a();
        } else {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            C(x6, y6, pointerId3);
            View r6 = r((int) x6, (int) y6);
            if (r6 == this.f1022t && this.f1003a == 2) {
                J(r6, pointerId3);
            }
            int i10 = this.f1010h[pointerId3];
            int i11 = this.f1019q;
            if ((i10 & i11) != 0) {
                this.f1021s.onEdgeTouched(i10 & i11, pointerId3);
            }
        }
        return this.f1003a == 1;
    }

    public boolean I(View view, int i4, int i5) {
        this.f1022t = view;
        this.f1005c = -1;
        boolean s4 = s(i4, i5, 0, 0);
        if (!s4 && this.f1003a == 0 && this.f1022t != null) {
            this.f1022t = null;
        }
        return s4;
    }

    boolean J(View view, int i4) {
        if (view == this.f1022t && this.f1005c == i4) {
            return true;
        }
        if (view == null || !this.f1021s.tryCaptureView(view, i4)) {
            return false;
        }
        this.f1005c = i4;
        b(view, i4);
        return true;
    }

    public void a() {
        this.f1005c = -1;
        g();
        VelocityTracker velocityTracker = this.f1014l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1014l = null;
        }
    }

    public void b(View view, int i4) {
        if (view.getParent() == this.f1024v) {
            this.f1022t = view;
            this.f1005c = i4;
            this.f1021s.onViewCaptured(view, i4);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f1024v + ")");
    }

    public boolean k(boolean z4) {
        if (this.f1003a == 2) {
            boolean computeScrollOffset = this.f1020r.computeScrollOffset();
            int currX = this.f1020r.getCurrX();
            int currY = this.f1020r.getCurrY();
            int left = currX - this.f1022t.getLeft();
            int top = currY - this.f1022t.getTop();
            if (left != 0) {
                AbstractC1281a0.Y(this.f1022t, left);
            }
            if (top != 0) {
                AbstractC1281a0.Z(this.f1022t, top);
            }
            if (left != 0 || top != 0) {
                this.f1021s.onViewPositionChanged(this.f1022t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f1020r.getFinalX() && currY == this.f1020r.getFinalY()) {
                this.f1020r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z4) {
                    this.f1024v.post(this.f1025w);
                } else {
                    E(0);
                }
            }
        }
        return this.f1003a == 2;
    }

    public View r(int i4, int i5) {
        for (int childCount = this.f1024v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f1024v.getChildAt(this.f1021s.getOrderedChildIndex(childCount));
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f1004b;
    }

    public boolean v(int i4, int i5) {
        return y(this.f1022t, i4, i5);
    }

    public boolean w(int i4) {
        return ((1 << i4) & this.f1013k) != 0;
    }

    public boolean y(View view, int i4, int i5) {
        return view != null && i4 >= view.getLeft() && i4 < view.getRight() && i5 >= view.getTop() && i5 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f1014l == null) {
            this.f1014l = VelocityTracker.obtain();
        }
        this.f1014l.addMovement(motionEvent);
        int i5 = 0;
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r4 = r((int) x4, (int) y4);
            C(x4, y4, pointerId);
            J(r4, pointerId);
            int i6 = this.f1010h[pointerId];
            int i7 = this.f1019q;
            if ((i6 & i7) != 0) {
                this.f1021s.onEdgeTouched(i6 & i7, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f1003a == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f1003a == 1) {
                if (x(this.f1005c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f1005c);
                    float x5 = motionEvent.getX(findPointerIndex);
                    float y5 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f1008f;
                    int i8 = this.f1005c;
                    int i9 = (int) (x5 - fArr[i8]);
                    int i10 = (int) (y5 - this.f1009g[i8]);
                    p(this.f1022t.getLeft() + i9, this.f1022t.getTop() + i10, i9, i10);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i5 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i5);
                if (x(pointerId2)) {
                    float x6 = motionEvent.getX(i5);
                    float y6 = motionEvent.getY(i5);
                    float f4 = x6 - this.f1006d[pointerId2];
                    float f5 = y6 - this.f1007e[pointerId2];
                    B(f4, f5, pointerId2);
                    if (this.f1003a != 1) {
                        View r5 = r((int) x6, (int) y6);
                        if (d(r5, f4, f5) && J(r5, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i5++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f1003a == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x7 = motionEvent.getX(actionIndex);
            float y7 = motionEvent.getY(actionIndex);
            C(x7, y7, pointerId3);
            if (this.f1003a != 0) {
                if (v((int) x7, (int) y7)) {
                    J(this.f1022t, pointerId3);
                    return;
                }
                return;
            } else {
                J(r((int) x7, (int) y7), pointerId3);
                int i11 = this.f1010h[pointerId3];
                int i12 = this.f1019q;
                if ((i11 & i12) != 0) {
                    this.f1021s.onEdgeTouched(i11 & i12, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f1003a == 1 && pointerId4 == this.f1005c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i5 >= pointerCount2) {
                    i4 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i5);
                if (pointerId5 != this.f1005c) {
                    View r6 = r((int) motionEvent.getX(i5), (int) motionEvent.getY(i5));
                    View view = this.f1022t;
                    if (r6 == view && J(view, pointerId5)) {
                        i4 = this.f1005c;
                        break;
                    }
                }
                i5++;
            }
            if (i4 == -1) {
                A();
            }
        }
        h(pointerId4);
    }

    /* renamed from: N.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0021c {
        public int clampViewPositionHorizontal(View view, int i4, int i5) {
            return 0;
        }

        public int clampViewPositionVertical(View view, int i4, int i5) {
            return 0;
        }

        public int getViewHorizontalDragRange(View view) {
            return 0;
        }

        public int getViewVerticalDragRange(View view) {
            return 0;
        }

        public boolean onEdgeLock(int i4) {
            return false;
        }

        public abstract boolean tryCaptureView(View view, int i4);

        public int getOrderedChildIndex(int i4) {
            return i4;
        }

        public void onViewDragStateChanged(int i4) {
        }

        public void onEdgeDragStarted(int i4, int i5) {
        }

        public void onEdgeTouched(int i4, int i5) {
        }

        public void onViewCaptured(View view, int i4) {
        }

        public void onViewReleased(View view, float f4, float f5) {
        }

        public void onViewPositionChanged(View view, int i4, int i5, int i6, int i7) {
        }
    }
}
