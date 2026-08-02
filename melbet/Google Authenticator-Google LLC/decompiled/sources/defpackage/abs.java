package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abs {
    public int a;
    public int b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float g;
    public int h;
    public final int i;
    public int j;
    public View k;
    private int[] m;
    private int[] n;
    private int[] o;
    private int p;
    private VelocityTracker q;
    private final float r;
    private final OverScroller s;
    private final abr t;
    private boolean u;
    private final ViewGroup v;
    private int l = -1;
    private final Runnable w = new nc(this, 9, null);

    private abs(Context context, ViewGroup viewGroup, abr abrVar) {
        a.v(abrVar, "Callback may not be null");
        this.v = viewGroup;
        this.t = abrVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.i = i;
        this.h = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.r = viewConfiguration.getScaledMaximumFlingVelocity();
        this.g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s = new OverScroller(context, new abq(0));
    }

    public static abs b(ViewGroup viewGroup, abr abrVar) {
        return new abs(viewGroup.getContext(), viewGroup, abrVar);
    }

    public static abs m(ViewGroup viewGroup, abr abrVar) {
        abs b = b(viewGroup, abrVar);
        b.b = b.b;
        return b;
    }

    private final int n(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth() / 2;
        float sin = (float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            float f = width;
            abs = Math.round(Math.abs((f + (sin * f)) / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private final void o(int i) {
        float[] fArr = this.c;
        if (fArr == null || !g(i)) {
            return;
        }
        fArr[i] = 0.0f;
        this.d[i] = 0.0f;
        this.e[i] = 0.0f;
        this.f[i] = 0.0f;
        this.m[i] = 0;
        this.n[i] = 0;
        this.o[i] = 0;
        this.p = (~(1 << i)) & this.p;
    }

    private final void p(float f, float f2) {
        this.u = true;
        this.t.e(this.k, f, f2);
        this.u = false;
        if (this.a == 1) {
            f(0);
        }
    }

    private final void q() {
        float f = this.r;
        this.q.computeCurrentVelocity(1000, f);
        p(y(this.q.getXVelocity(this.l), this.g, f), y(this.q.getYVelocity(this.l), this.g, f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [abr] */
    private final void r(float f, float f2, int i) {
        boolean u = u(f, f2, i, 1);
        boolean z = u;
        if (u(f2, f, i, 4)) {
            z = (u ? 1 : 0) | 4;
        }
        boolean z2 = z;
        if (u(f, f2, i, 2)) {
            z2 = (z ? 1 : 0) | 2;
        }
        ?? r0 = z2;
        if (u(f2, f, i, 8)) {
            r0 = (z2 ? 1 : 0) | 8;
        }
        if (r0 != 0) {
            int[] iArr = this.n;
            iArr[i] = iArr[i] | r0;
            this.t.b(r0, i);
        }
    }

    private final void s(float f, float f2, int i) {
        float[] fArr = this.c;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.d;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.e;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.m;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.n;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.o;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.c = fArr2;
            this.d = fArr3;
            this.e = fArr4;
            this.f = fArr5;
            this.m = iArr;
            this.n = iArr2;
            this.o = iArr3;
            fArr = fArr2;
        }
        this.e[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.d;
        this.f[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.m;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.h ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.h) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.h) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.h) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.p |= 1 << i;
    }

    private final void t(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.e[pointerId] = x;
                this.f[pointerId] = y;
            }
        }
    }

    private final boolean u(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.m[i] & i2) == i2 && (this.j & i2) != 0 && (this.o[i] & i2) != i2 && (this.n[i] & i2) != i2) {
            float f3 = this.b;
            if (abs > f3 || abs2 > f3) {
                if (abs < abs2 * 0.5f) {
                    this.t.j();
                }
                if ((this.n[i] & i2) == 0 && abs > this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean v(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        abr abrVar = this.t;
        boolean z = abrVar.a(view) > 0;
        boolean z2 = abrVar.i() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.b) : z2 && Math.abs(f2) > ((float) this.b);
        }
        int i = this.b;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    private final boolean w(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int left = this.k.getLeft();
        int top = this.k.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                this.s.abortAnimation();
                f(0);
                return false;
            }
        }
        int i7 = i5;
        View view = this.k;
        int i8 = (int) this.g;
        int i9 = (int) this.r;
        int z = z(i3, i8, i9);
        int z2 = z(i4, (int) this.g, i9);
        int abs = Math.abs(i7);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(z);
        int abs4 = Math.abs(z2);
        int i10 = abs3 + abs4;
        int i11 = abs + abs2;
        if (z != 0) {
            f = abs3 / i10;
        } else {
            f = abs / i11;
        }
        if (z2 != 0) {
            f2 = i10;
            f3 = abs4;
        } else {
            f2 = i11;
            f3 = abs2;
        }
        float f4 = f3 / f2;
        abr abrVar = this.t;
        this.s.startScroll(left, top, i7, i6, (int) ((n(i7, z, abrVar.a(view)) * f) + (n(i6, z2, abrVar.i()) * f4)));
        f(2);
        return true;
    }

    private final boolean x(int i) {
        return g(i);
    }

    private static final float y(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    private static final int z(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    public final View a(int i, int i2) {
        ViewGroup viewGroup = this.v;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void c() {
        this.l = -1;
        float[] fArr = this.c;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.d, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.m, 0);
            Arrays.fill(this.n, 0);
            Arrays.fill(this.o, 0);
            this.p = 0;
        }
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    public final void d(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException(a.ab(viewGroup, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")"));
        }
        this.k = view;
        this.l = i;
        this.t.c(view, i);
        f(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r9.l == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        q();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i = 0;
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.q = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View a = a((int) x, (int) y);
            s(x, y, pointerId);
            k(a, pointerId);
            if ((this.m[pointerId] & this.j) != 0) {
                this.t.k();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                q();
            }
            c();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    p(0.0f, 0.0f);
                }
                c();
                return;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    return;
                }
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                if (this.a == 1 && pointerId2 == this.l) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i >= pointerCount) {
                            break;
                        }
                        int pointerId3 = motionEvent.getPointerId(i);
                        if (pointerId3 != this.l) {
                            View a2 = a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                            View view = this.k;
                            if (a2 == view && k(view, pointerId3)) {
                            }
                        }
                        i++;
                    }
                }
                o(pointerId2);
                return;
            }
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            float x2 = motionEvent.getX(actionIndex);
            int i2 = (int) x2;
            float y2 = motionEvent.getY(actionIndex);
            int i3 = (int) y2;
            s(x2, y2, pointerId4);
            if (this.a == 0) {
                k(a(i2, i3), pointerId4);
                if ((this.m[pointerId4] & this.j) != 0) {
                    this.t.k();
                    return;
                }
                return;
            }
            View view2 = this.k;
            if (view2 != null && i2 >= view2.getLeft() && i2 < view2.getRight() && i3 >= view2.getTop() && i3 < view2.getBottom()) {
                k(this.k, pointerId4);
                return;
            }
            return;
        }
        if (this.a == 1) {
            int i4 = this.l;
            if (!x(i4) || (findPointerIndex = motionEvent.findPointerIndex(i4)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(findPointerIndex);
            float y3 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.e;
            int i5 = this.l;
            float f = x3 - fArr[i5];
            float f2 = y3 - this.f[i5];
            int i6 = (int) f;
            int left = this.k.getLeft() + i6;
            int i7 = (int) f2;
            int top = this.k.getTop() + i7;
            int left2 = this.k.getLeft();
            int top2 = this.k.getTop();
            if (i6 != 0) {
                left = this.t.g(this.k, left);
                int i8 = yq.a;
                this.k.offsetLeftAndRight(left - left2);
            }
            if (i7 != 0) {
                top = this.t.h(this.k, top);
                int i9 = yq.a;
                this.k.offsetTopAndBottom(top - top2);
            }
            if (i6 != 0 || i7 != 0) {
                this.t.l(this.k, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i);
                if (x(pointerId5)) {
                    float x4 = motionEvent.getX(i);
                    float y4 = motionEvent.getY(i);
                    float f3 = x4 - this.c[pointerId5];
                    float f4 = y4 - this.d[pointerId5];
                    r(f3, f4, pointerId5);
                    if (this.a == 1) {
                        break;
                    }
                    View a3 = a((int) x4, (int) y4);
                    if (v(a3, f3, f4) && k(a3, pointerId5)) {
                        break;
                    }
                }
                i++;
            }
        }
        t(motionEvent);
    }

    public final void f(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.t.d(i);
            if (this.a == 0) {
                this.k = null;
            }
        }
    }

    public final boolean g(int i) {
        return (this.p & (1 << i)) != 0;
    }

    public final boolean h(int i, int i2) {
        if (this.u) {
            return w(i, i2, (int) this.q.getXVelocity(this.l), (int) this.q.getYVelocity(this.l));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        if (r12 != r11) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(MotionEvent motionEvent) {
        View a;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        VelocityTracker velocityTracker = this.q;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.q = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            s(x, y, pointerId);
                            int i = this.a;
                            if (i == 0) {
                                if ((this.m[pointerId] & this.j) != 0) {
                                    this.t.k();
                                }
                            } else if (i == 2 && (a = a((int) x, (int) y)) == this.k) {
                                k(a, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            o(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.c != null && this.d != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (x(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.c[pointerId2];
                            float f2 = y2 - this.d[pointerId2];
                            View a2 = a((int) x2, (int) y2);
                            boolean v = v(a2, f, f2);
                            if (v) {
                                int left = a2.getLeft();
                                abr abrVar = this.t;
                                int g = abrVar.g(a2, ((int) f) + left);
                                int top = a2.getTop();
                                int h = abrVar.h(a2, ((int) f2) + top);
                                int a3 = abrVar.a(a2);
                                int i3 = abrVar.i();
                                if (a3 != 0) {
                                    if (a3 > 0) {
                                    }
                                }
                                if (i3 == 0) {
                                    break;
                                }
                                if (i3 > 0 && h == top) {
                                    break;
                                }
                            }
                            r(f, f2, pointerId2);
                            if (this.a == 1) {
                                break;
                            }
                            if (v && k(a2, pointerId2)) {
                                break;
                            }
                        }
                    }
                    t(motionEvent);
                }
            }
            c();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            s(x3, y3, pointerId3);
            View a4 = a((int) x3, (int) y3);
            if (a4 == this.k && this.a == 2) {
                k(a4, pointerId3);
            }
            if ((this.m[pointerId3] & this.j) != 0) {
                this.t.k();
            }
        }
        return this.a == 1;
    }

    public final boolean j(View view, int i, int i2) {
        this.k = view;
        this.l = -1;
        boolean w = w(i, i2, 0, 0);
        if (w || this.a != 0 || this.k == null) {
            return w;
        }
        this.k = null;
        return false;
    }

    final boolean k(View view, int i) {
        if (view == this.k && this.l == i) {
            return true;
        }
        if (view == null || !this.t.f(view, i)) {
            return false;
        }
        this.l = i;
        d(view, i);
        return true;
    }

    public final boolean l() {
        if (this.a == 2) {
            OverScroller overScroller = this.s;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.k.getLeft();
            int top = currY - this.k.getTop();
            if (left != 0) {
                View view = this.k;
                int i = yq.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.k;
                int i2 = yq.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.t.l(this.k, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                    overScroller.abortAnimation();
                }
            }
            this.v.post(this.w);
        }
        return this.a == 2;
    }
}
