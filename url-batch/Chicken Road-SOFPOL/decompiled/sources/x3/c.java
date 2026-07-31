package x3;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Field;
import java.util.Arrays;
import q3.k0;
import r2.r;
import w4.v;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: v, reason: collision with root package name */
    public static final v f8631v = new v(1);

    /* renamed from: a, reason: collision with root package name */
    public int f8632a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8633b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f8635d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f8636e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f8637f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f8638g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f8639h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f8640j;

    /* renamed from: k, reason: collision with root package name */
    public int f8641k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f8642l;

    /* renamed from: m, reason: collision with root package name */
    public final float f8643m;

    /* renamed from: n, reason: collision with root package name */
    public final float f8644n;

    /* renamed from: o, reason: collision with root package name */
    public final int f8645o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f8646p;

    /* renamed from: q, reason: collision with root package name */
    public final r f8647q;

    /* renamed from: r, reason: collision with root package name */
    public View f8648r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8649s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f8650t;

    /* renamed from: c, reason: collision with root package name */
    public int f8634c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final h4.b f8651u = new h4.b(11, this);

    public c(Context context, CoordinatorLayout coordinatorLayout, r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f8650t = coordinatorLayout;
        this.f8647q = rVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f8645o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f8633b = viewConfiguration.getScaledTouchSlop();
        this.f8643m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f8644n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f8646p = new OverScroller(context, f8631v);
    }

    public final void a() {
        this.f8634c = -1;
        float[] fArr = this.f8635d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f8636e, 0.0f);
            Arrays.fill(this.f8637f, 0.0f);
            Arrays.fill(this.f8638g, 0.0f);
            Arrays.fill(this.f8639h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f8640j, 0);
            this.f8641k = 0;
        }
        VelocityTracker velocityTracker = this.f8642l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8642l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f8650t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f8648r = view;
        this.f8634c = i;
        this.f8647q.J(view, i);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f6, float f8) {
        if (view != null) {
            r rVar = this.f8647q;
            boolean z3 = rVar.B(view) > 0;
            boolean z7 = rVar.C() > 0;
            if (z3 && z7) {
                float f9 = (f8 * f8) + (f6 * f6);
                int i = this.f8633b;
                if (f9 > i * i) {
                }
            } else if (!z3 ? !(!z7 || Math.abs(f8) <= this.f8633b) : Math.abs(f6) > this.f8633b) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        float[] fArr = this.f8635d;
        if (fArr != null) {
            int i8 = this.f8641k;
            int i9 = 1 << i;
            if ((i8 & i9) != 0) {
                fArr[i] = 0.0f;
                this.f8636e[i] = 0.0f;
                this.f8637f[i] = 0.0f;
                this.f8638g[i] = 0.0f;
                this.f8639h[i] = 0;
                this.i[i] = 0;
                this.f8640j[i] = 0;
                this.f8641k = (~i9) & i8;
            }
        }
    }

    public final int e(int i, int i8, int i9) {
        if (i == 0) {
            return 0;
        }
        float width = this.f8650t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i8);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i9) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f8632a == 2) {
            OverScroller overScroller = this.f8646p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f8648r.getLeft();
            int top = currY - this.f8648r.getTop();
            if (left != 0) {
                View view = this.f8648r;
                Field field = k0.f6120a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f8648r;
                Field field2 = k0.f6120a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f8647q.L(this.f8648r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f8650t.post(this.f8651u);
            }
        }
        return this.f8632a == 2;
    }

    public final View g(int i, int i8) {
        CoordinatorLayout coordinatorLayout = this.f8650t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f8647q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i8 >= childAt.getTop() && i8 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i8, int i9, int i10) {
        float f6;
        float f8;
        float f9;
        float f10;
        int left = this.f8648r.getLeft();
        int top = this.f8648r.getTop();
        int i11 = i - left;
        int i12 = i8 - top;
        OverScroller overScroller = this.f8646p;
        if (i11 == 0 && i12 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f8648r;
        int i13 = (int) this.f8644n;
        int i14 = (int) this.f8643m;
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
            f6 = abs5;
            f8 = i15;
        } else {
            f6 = abs3;
            f8 = i16;
        }
        float f11 = f6 / f8;
        if (i10 != 0) {
            f9 = abs6;
            f10 = i15;
        } else {
            f9 = abs4;
            f10 = i16;
        }
        float f12 = f9 / f10;
        r rVar = this.f8647q;
        overScroller.startScroll(left, top, i11, i12, (int) ((e(i12, i10, rVar.C()) * f12) + (e(i11, i9, rVar.B(view)) * f11)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.f8641k & (1 << i)) != 0) {
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
        if (this.f8642l == null) {
            this.f8642l = VelocityTracker.obtain();
        }
        this.f8642l.addMovement(motionEvent);
        int i8 = 0;
        if (actionMasked == 0) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g3 = g((int) x7, (int) y7);
            l(x7, y7, pointerId);
            q(g3, pointerId);
            int i9 = this.f8639h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f8632a == 1) {
                k();
            }
            a();
            return;
        }
        r rVar = this.f8647q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f8632a == 1) {
                    this.f8649s = true;
                    rVar.M(this.f8648r, 0.0f, 0.0f);
                    this.f8649s = false;
                    if (this.f8632a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x8 = motionEvent.getX(actionIndex);
                float y8 = motionEvent.getY(actionIndex);
                l(x8, y8, pointerId2);
                if (this.f8632a == 0) {
                    q(g((int) x8, (int) y8), pointerId2);
                    int i10 = this.f8639h[pointerId2];
                    return;
                }
                int i11 = (int) x8;
                int i12 = (int) y8;
                View view = this.f8648r;
                if (view != null && i11 >= view.getLeft() && i11 < view.getRight() && i12 >= view.getTop() && i12 < view.getBottom()) {
                    i8 = 1;
                }
                if (i8 != 0) {
                    q(this.f8648r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f8632a == 1 && pointerId3 == this.f8634c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i8 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i8);
                    if (pointerId4 != this.f8634c) {
                        View g7 = g((int) motionEvent.getX(i8), (int) motionEvent.getY(i8));
                        View view2 = this.f8648r;
                        if (g7 == view2 && q(view2, pointerId4)) {
                            i = this.f8634c;
                            break;
                        }
                    }
                    i8++;
                }
                if (i == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f8632a == 1) {
            if (i(this.f8634c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f8634c);
                float x9 = motionEvent.getX(findPointerIndex);
                float y9 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f8637f;
                int i13 = this.f8634c;
                int i14 = (int) (x9 - fArr[i13]);
                int i15 = (int) (y9 - this.f8638g[i13]);
                int left = this.f8648r.getLeft() + i14;
                int top = this.f8648r.getTop() + i15;
                int left2 = this.f8648r.getLeft();
                int top2 = this.f8648r.getTop();
                if (i14 != 0) {
                    left = rVar.o(this.f8648r, left);
                    Field field = k0.f6120a;
                    this.f8648r.offsetLeftAndRight(left - left2);
                }
                if (i15 != 0) {
                    top = rVar.p(this.f8648r, top);
                    Field field2 = k0.f6120a;
                    this.f8648r.offsetTopAndBottom(top - top2);
                }
                if (i14 != 0 || i15 != 0) {
                    rVar.L(this.f8648r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i8 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i8);
            if (i(pointerId5)) {
                float x10 = motionEvent.getX(i8);
                float y10 = motionEvent.getY(i8);
                float f6 = x10 - this.f8635d[pointerId5];
                float f8 = y10 - this.f8636e[pointerId5];
                Math.abs(f6);
                Math.abs(f8);
                int i16 = this.f8639h[pointerId5];
                Math.abs(f8);
                Math.abs(f6);
                int i17 = this.f8639h[pointerId5];
                Math.abs(f6);
                Math.abs(f8);
                int i18 = this.f8639h[pointerId5];
                Math.abs(f8);
                Math.abs(f6);
                int i19 = this.f8639h[pointerId5];
                if (this.f8632a != 1) {
                    View g8 = g((int) x10, (int) y10);
                    if (c(g8, f6, f8) && q(g8, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i8++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f8642l;
        float f6 = this.f8643m;
        velocityTracker.computeCurrentVelocity(1000, f6);
        float xVelocity = this.f8642l.getXVelocity(this.f8634c);
        float abs = Math.abs(xVelocity);
        float f8 = this.f8644n;
        if (abs < f8) {
            xVelocity = 0.0f;
        } else if (abs > f6) {
            xVelocity = xVelocity > 0.0f ? f6 : -f6;
        }
        float yVelocity = this.f8642l.getYVelocity(this.f8634c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f8) {
            f6 = 0.0f;
        } else if (abs2 <= f6) {
            f6 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f6 = -f6;
        }
        this.f8649s = true;
        this.f8647q.M(this.f8648r, xVelocity, f6);
        this.f8649s = false;
        if (this.f8632a == 1) {
            n(0);
        }
    }

    public final void l(float f6, float f8, int i) {
        float[] fArr = this.f8635d;
        if (fArr == null || fArr.length <= i) {
            int i8 = i + 1;
            float[] fArr2 = new float[i8];
            float[] fArr3 = new float[i8];
            float[] fArr4 = new float[i8];
            float[] fArr5 = new float[i8];
            int[] iArr = new int[i8];
            int[] iArr2 = new int[i8];
            int[] iArr3 = new int[i8];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f8636e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f8637f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f8638g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f8639h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f8640j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f8635d = fArr2;
            this.f8636e = fArr3;
            this.f8637f = fArr4;
            this.f8638g = fArr5;
            this.f8639h = iArr;
            this.i = iArr2;
            this.f8640j = iArr3;
        }
        float[] fArr9 = this.f8635d;
        this.f8637f[i] = f6;
        fArr9[i] = f6;
        float[] fArr10 = this.f8636e;
        this.f8638g[i] = f8;
        fArr10[i] = f8;
        int[] iArr7 = this.f8639h;
        int i9 = (int) f6;
        int i10 = (int) f8;
        CoordinatorLayout coordinatorLayout = this.f8650t;
        int left = coordinatorLayout.getLeft();
        int i11 = this.f8645o;
        int i12 = i9 < left + i11 ? 1 : 0;
        if (i10 < coordinatorLayout.getTop() + i11) {
            i12 |= 4;
        }
        if (i9 > coordinatorLayout.getRight() - i11) {
            i12 |= 2;
        }
        if (i10 > coordinatorLayout.getBottom() - i11) {
            i12 |= 8;
        }
        iArr7[i] = i12;
        this.f8641k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x7 = motionEvent.getX(i);
                float y7 = motionEvent.getY(i);
                this.f8637f[pointerId] = x7;
                this.f8638g[pointerId] = y7;
            }
        }
    }

    public final void n(int i) {
        this.f8650t.removeCallbacks(this.f8651u);
        if (this.f8632a != i) {
            this.f8632a = i;
            this.f8647q.K(i);
            if (this.f8632a == 0) {
                this.f8648r = null;
            }
        }
    }

    public final boolean o(int i, int i8) {
        if (this.f8649s) {
            return h(i, i8, (int) this.f8642l.getXVelocity(this.f8634c), (int) this.f8642l.getYVelocity(this.f8634c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r12 != r11) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(MotionEvent motionEvent) {
        View g3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f8642l == null) {
            this.f8642l = VelocityTracker.obtain();
        }
        this.f8642l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x7 = motionEvent.getX(actionIndex);
                            float y7 = motionEvent.getY(actionIndex);
                            l(x7, y7, pointerId);
                            int i = this.f8632a;
                            if (i == 0) {
                                int i8 = this.f8639h[pointerId];
                            } else if (i == 2 && (g3 = g((int) x7, (int) y7)) == this.f8648r) {
                                q(g3, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f8635d != null && this.f8636e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i9 = 0; i9 < pointerCount; i9++) {
                        int pointerId2 = motionEvent.getPointerId(i9);
                        if (i(pointerId2)) {
                            float x8 = motionEvent.getX(i9);
                            float y8 = motionEvent.getY(i9);
                            float f6 = x8 - this.f8635d[pointerId2];
                            float f8 = y8 - this.f8636e[pointerId2];
                            View g7 = g((int) x8, (int) y8);
                            boolean z3 = g7 != null && c(g7, f6, f8);
                            if (z3) {
                                int left = g7.getLeft();
                                r rVar = this.f8647q;
                                int o2 = rVar.o(g7, ((int) f6) + left);
                                int top = g7.getTop();
                                int p7 = rVar.p(g7, ((int) f8) + top);
                                int B = rVar.B(g7);
                                int C = rVar.C();
                                if (B != 0) {
                                    if (B > 0) {
                                    }
                                }
                                if (C == 0) {
                                    break;
                                }
                                if (C > 0 && p7 == top) {
                                    break;
                                }
                            }
                            Math.abs(f6);
                            Math.abs(f8);
                            int i10 = this.f8639h[pointerId2];
                            Math.abs(f8);
                            Math.abs(f6);
                            int i11 = this.f8639h[pointerId2];
                            Math.abs(f6);
                            Math.abs(f8);
                            int i12 = this.f8639h[pointerId2];
                            Math.abs(f8);
                            Math.abs(f6);
                            int i13 = this.f8639h[pointerId2];
                            if (this.f8632a == 1) {
                                break;
                            }
                            if (z3 && q(g7, pointerId2)) {
                                break;
                            }
                        }
                    }
                    m(motionEvent);
                }
            }
            a();
        } else {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            l(x9, y9, pointerId3);
            View g8 = g((int) x9, (int) y9);
            if (g8 == this.f8648r && this.f8632a == 2) {
                q(g8, pointerId3);
            }
            int i14 = this.f8639h[pointerId3];
        }
        return this.f8632a == 1;
    }

    public final boolean q(View view, int i) {
        if (view == this.f8648r && this.f8634c == i) {
            return true;
        }
        if (view == null || !this.f8647q.Y(view, i)) {
            return false;
        }
        this.f8634c = i;
        b(view, i);
        return true;
    }
}
