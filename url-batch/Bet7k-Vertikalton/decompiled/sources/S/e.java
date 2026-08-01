package S;

import K.T;
import K0.B;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;
import q1.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f692v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f694b;
    public float[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f696e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f697f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f698g;
    public int[] h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f699j;

    /* renamed from: k, reason: collision with root package name */
    public int f700k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f701l;

    /* renamed from: m, reason: collision with root package name */
    public final float f702m;

    /* renamed from: n, reason: collision with root package name */
    public final float f703n;

    /* renamed from: o, reason: collision with root package name */
    public final int f704o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f705p;

    /* renamed from: q, reason: collision with root package name */
    public final l f706q;

    /* renamed from: r, reason: collision with root package name */
    public View f707r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f708s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f709t;

    /* renamed from: c, reason: collision with root package name */
    public int f695c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final B f710u = new B(2, this);

    public e(Context context, CoordinatorLayout coordinatorLayout, l lVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (lVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f709t = coordinatorLayout;
        this.f706q = lVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f704o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f694b = viewConfiguration.getScaledTouchSlop();
        this.f702m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f703n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f705p = new OverScroller(context, f692v);
    }

    public final void a() {
        this.f695c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f696e, 0.0f);
            Arrays.fill(this.f697f, 0.0f);
            Arrays.fill(this.f698g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f699j, 0);
            this.f700k = 0;
        }
        VelocityTracker velocityTracker = this.f701l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f701l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f709t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f707r = view;
        this.f695c = i;
        this.f706q.I(view, i);
        n(1);
    }

    public final boolean c(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        l lVar = this.f706q;
        boolean z2 = lVar.A(view) > 0;
        boolean z3 = lVar.B() > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f694b) : z3 && Math.abs(f3) > ((float) this.f694b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i = this.f694b;
        return f4 > ((float) (i * i));
    }

    public final void d(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.f700k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f696e[i] = 0.0f;
                this.f697f[i] = 0.0f;
                this.f698g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.f699j[i] = 0;
                this.f700k = (~i3) & i2;
            }
        }
    }

    public final int e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f709t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f693a == 2) {
            OverScroller overScroller = this.f705p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f707r.getLeft();
            int top = currY - this.f707r.getTop();
            if (left != 0) {
                View view = this.f707r;
                WeakHashMap weakHashMap = T.f381a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f707r;
                WeakHashMap weakHashMap2 = T.f381a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f706q.K(this.f707r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f709t.post(this.f710u);
            }
        }
        return this.f693a == 2;
    }

    public final View g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f709t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f706q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
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
    public final boolean h(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f707r.getLeft();
        int top = this.f707r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f705p;
        int i7 = 0;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f707r;
        int i8 = (int) this.f703n;
        int i9 = (int) this.f702m;
        int abs = Math.abs(i3);
        if (abs < i8) {
            i3 = 0;
        } else if (abs > i9) {
            i3 = i3 > 0 ? i9 : -i9;
        }
        int abs2 = Math.abs(i4);
        if (abs2 >= i8) {
            if (abs2 > i9) {
                if (i4 > 0) {
                    i4 = i9;
                } else {
                    i7 = -i9;
                }
            }
            int abs3 = Math.abs(i5);
            int abs4 = Math.abs(i6);
            int abs5 = Math.abs(i3);
            int abs6 = Math.abs(i4);
            int i10 = abs5 + abs6;
            int i11 = abs3 + abs4;
            if (i3 == 0) {
                f2 = abs5;
                f3 = i10;
            } else {
                f2 = abs3;
                f3 = i11;
            }
            float f6 = f2 / f3;
            if (i4 == 0) {
                f4 = abs6;
                f5 = i10;
            } else {
                f4 = abs4;
                f5 = i11;
            }
            float f7 = f4 / f5;
            l lVar = this.f706q;
            overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, lVar.B()) * f7) + (e(i5, i3, lVar.A(view)) * f6)));
            n(2);
            return true;
        }
        i4 = i7;
        int abs32 = Math.abs(i5);
        int abs42 = Math.abs(i6);
        int abs52 = Math.abs(i3);
        int abs62 = Math.abs(i4);
        int i102 = abs52 + abs62;
        int i112 = abs32 + abs42;
        if (i3 == 0) {
        }
        float f62 = f2 / f3;
        if (i4 == 0) {
        }
        float f72 = f4 / f5;
        l lVar2 = this.f706q;
        overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, lVar2.B()) * f72) + (e(i5, i3, lVar2.A(view)) * f62)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.f700k & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f701l == null) {
            this.f701l = VelocityTracker.obtain();
        }
        this.f701l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g2 = g((int) x2, (int) y2);
            l(x2, y2, pointerId);
            q(g2, pointerId);
            int i3 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f693a == 1) {
                k();
            }
            a();
            return;
        }
        l lVar = this.f706q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f693a == 1) {
                    this.f708s = true;
                    lVar.L(this.f707r, 0.0f, 0.0f);
                    this.f708s = false;
                    if (this.f693a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x3 = motionEvent.getX(actionIndex);
                float y3 = motionEvent.getY(actionIndex);
                l(x3, y3, pointerId2);
                if (this.f693a == 0) {
                    q(g((int) x3, (int) y3), pointerId2);
                    int i4 = this.h[pointerId2];
                    return;
                }
                int i5 = (int) x3;
                int i6 = (int) y3;
                View view = this.f707r;
                if (view != null) {
                    i2 = (i5 < view.getLeft() || i5 >= view.getRight() || i6 < view.getTop() || i6 >= view.getBottom()) ? 0 : 1;
                }
                if (i2 != 0) {
                    q(this.f707r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f693a == 1 && pointerId3 == this.f695c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f695c) {
                        View g3 = g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f707r;
                        if (g3 == view2 && q(view2, pointerId4)) {
                            i = this.f695c;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f693a == 1) {
            if (i(this.f695c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f695c);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f697f;
                int i7 = this.f695c;
                int i8 = (int) (x4 - fArr[i7]);
                int i9 = (int) (y4 - this.f698g[i7]);
                int left = this.f707r.getLeft() + i8;
                int top = this.f707r.getTop() + i9;
                int left2 = this.f707r.getLeft();
                int top2 = this.f707r.getTop();
                if (i8 != 0) {
                    left = lVar.m(this.f707r, left);
                    WeakHashMap weakHashMap = T.f381a;
                    this.f707r.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = lVar.n(this.f707r, top);
                    WeakHashMap weakHashMap2 = T.f381a;
                    this.f707r.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    lVar.K(this.f707r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (i(pointerId5)) {
                float x5 = motionEvent.getX(i2);
                float y5 = motionEvent.getY(i2);
                float f2 = x5 - this.d[pointerId5];
                float f3 = y5 - this.f696e[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i10 = this.h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i11 = this.h[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i12 = this.h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i13 = this.h[pointerId5];
                if (this.f693a != 1) {
                    View g4 = g((int) x5, (int) y5);
                    if (c(g4, f2, f3) && q(g4, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f701l;
        float f2 = this.f702m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f701l.getXVelocity(this.f695c);
        float f3 = this.f703n;
        float abs = Math.abs(xVelocity);
        float f4 = 0.0f;
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f701l.getYVelocity(this.f695c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f3) {
            if (abs2 > f2) {
                if (yVelocity <= 0.0f) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.f708s = true;
        this.f706q.L(this.f707r, xVelocity, f4);
        this.f708s = false;
        if (this.f693a == 1) {
            n(0);
        }
    }

    public final void l(float f2, float f3, int i) {
        float[] fArr = this.d;
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
                float[] fArr6 = this.f696e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f697f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f698g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f699j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f696e = fArr3;
            this.f697f = fArr4;
            this.f698g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.f699j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f697f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f696e;
        this.f698g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.h;
        int i3 = (int) f2;
        int i4 = (int) f3;
        CoordinatorLayout coordinatorLayout = this.f709t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f704o;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.f700k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f697f[pointerId] = x2;
                this.f698g[pointerId] = y2;
            }
        }
    }

    public final void n(int i) {
        this.f709t.removeCallbacks(this.f710u);
        if (this.f693a != i) {
            this.f693a = i;
            this.f706q.J(i);
            if (this.f693a == 0) {
                this.f707r = null;
            }
        }
    }

    public final boolean o(int i, int i2) {
        if (this.f708s) {
            return h(i, i2, (int) this.f701l.getXVelocity(this.f695c), (int) this.f701l.getYVelocity(this.f695c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MotionEvent motionEvent) {
        View g2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f701l == null) {
            this.f701l = VelocityTracker.obtain();
        }
        this.f701l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            l(x2, y2, pointerId);
                            int i = this.f693a;
                            if (i == 0) {
                                int i2 = this.h[pointerId];
                            } else if (i == 2 && (g2 = g((int) x2, (int) y2)) == this.f707r) {
                                q(g2, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.d != null && this.f696e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if (i(pointerId2)) {
                            float x3 = motionEvent.getX(i3);
                            float y3 = motionEvent.getY(i3);
                            float f2 = x3 - this.d[pointerId2];
                            float f3 = y3 - this.f696e[pointerId2];
                            View g3 = g((int) x3, (int) y3);
                            boolean z2 = g3 != null && c(g3, f2, f3);
                            if (z2) {
                                int left = g3.getLeft();
                                l lVar = this.f706q;
                                int m2 = lVar.m(g3, ((int) f2) + left);
                                int top = g3.getTop();
                                int n2 = lVar.n(g3, ((int) f3) + top);
                                int A2 = lVar.A(g3);
                                int B2 = lVar.B();
                                if (A2 != 0) {
                                    if (A2 > 0) {
                                    }
                                }
                                if (B2 == 0) {
                                    break;
                                }
                                if (B2 > 0 && n2 == top) {
                                    break;
                                }
                            }
                            Math.abs(f2);
                            Math.abs(f3);
                            int i4 = this.h[pointerId2];
                            Math.abs(f3);
                            Math.abs(f2);
                            int i5 = this.h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f3);
                            int i6 = this.h[pointerId2];
                            Math.abs(f3);
                            Math.abs(f2);
                            int i7 = this.h[pointerId2];
                            if (this.f693a == 1) {
                                break;
                            }
                            if (z2 && q(g3, pointerId2)) {
                                break;
                            }
                        }
                    }
                    m(motionEvent);
                }
            }
            a();
        } else {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            l(x4, y4, pointerId3);
            View g4 = g((int) x4, (int) y4);
            if (g4 == this.f707r && this.f693a == 2) {
                q(g4, pointerId3);
            }
            int i8 = this.h[pointerId3];
        }
        return this.f693a == 1;
    }

    public final boolean q(View view, int i) {
        if (view == this.f707r && this.f695c == i) {
            return true;
        }
        if (view == null || !this.f706q.b0(view, i)) {
            return false;
        }
        this.f695c = i;
        b(view, i);
        return true;
    }
}
