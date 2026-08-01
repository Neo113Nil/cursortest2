package q0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.c0;
import java.util.Arrays;
import java.util.WeakHashMap;
import k0.j0;
import l0.g;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: w, reason: collision with root package name */
    public static final c0 f3108w = new c0(1);

    /* renamed from: a, reason: collision with root package name */
    public int f3109a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3110b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f3111d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3112e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f3113f;
    public float[] g;
    public int[] h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f3114i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3115j;

    /* renamed from: k, reason: collision with root package name */
    public int f3116k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f3117l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3118m;

    /* renamed from: n, reason: collision with root package name */
    public final float f3119n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3120o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f3121p;

    /* renamed from: q, reason: collision with root package name */
    public final g f3122q;

    /* renamed from: r, reason: collision with root package name */
    public View f3123r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3124s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f3125t;

    /* renamed from: u, reason: collision with root package name */
    public c0 f3126u;
    public int c = -1;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.fragment.app.g f3127v = new androidx.fragment.app.g(11, this);

    public e(Context context, CoordinatorLayout coordinatorLayout, g gVar) {
        if (gVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.f3125t = coordinatorLayout;
        this.f3122q = gVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3120o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3110b = viewConfiguration.getScaledTouchSlop();
        this.f3118m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3119n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3126u = f3108w;
        this.f3121p = new OverScroller(context, new d(this));
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.f3111d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3112e, 0.0f);
            Arrays.fill(this.f3113f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.f3114i, 0);
            Arrays.fill(this.f3115j, 0);
            this.f3116k = 0;
        }
        VelocityTracker velocityTracker = this.f3117l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3117l = null;
        }
    }

    public final void b(View view, int i4) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f3125t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f3123r = view;
        this.c = i4;
        this.f3122q.p(view, i4);
        m(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f4, float f5) {
        if (view != null) {
            g gVar = this.f3122q;
            boolean z3 = gVar.l(view) > 0;
            boolean z4 = gVar.m() > 0;
            if (z3 && z4) {
                float f6 = (f5 * f5) + (f4 * f4);
                int i4 = this.f3110b;
                if (f6 > i4 * i4) {
                }
            } else if (!z3 ? !(!z4 || Math.abs(f5) <= this.f3110b) : Math.abs(f4) > this.f3110b) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i4) {
        float[] fArr = this.f3111d;
        if (fArr != null) {
            int i5 = this.f3116k;
            int i6 = 1 << i4;
            if ((i5 & i6) != 0) {
                fArr[i4] = 0.0f;
                this.f3112e[i4] = 0.0f;
                this.f3113f[i4] = 0.0f;
                this.g[i4] = 0.0f;
                this.h[i4] = 0;
                this.f3114i[i4] = 0;
                this.f3115j[i4] = 0;
                this.f3116k = (~i6) & i5;
            }
        }
    }

    public final int e(int i4, int i5, int i6) {
        if (i4 == 0) {
            return 0;
        }
        float width = this.f3125t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i4) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i5);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i4) / i6) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f3109a == 2) {
            OverScroller overScroller = this.f3121p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3123r.getLeft();
            int top = currY - this.f3123r.getTop();
            if (left != 0) {
                View view = this.f3123r;
                WeakHashMap weakHashMap = j0.f2752a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3123r;
                WeakHashMap weakHashMap2 = j0.f2752a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3122q.r(this.f3123r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3125t.post(this.f3127v);
            }
        }
        return this.f3109a == 2;
    }

    public final View g(int i4, int i5) {
        CoordinatorLayout coordinatorLayout = this.f3125t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3122q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i4 >= childAt.getLeft() && i4 < childAt.getRight() && i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i4, int i5, int i6, int i7) {
        float f4;
        float f5;
        float f6;
        float f7;
        int left = this.f3123r.getLeft();
        int top = this.f3123r.getTop();
        int i8 = i4 - left;
        int i9 = i5 - top;
        OverScroller overScroller = this.f3121p;
        if (i8 == 0 && i9 == 0) {
            overScroller.abortAnimation();
            m(0);
            return false;
        }
        View view = this.f3123r;
        int i10 = (int) this.f3119n;
        int i11 = (int) this.f3118m;
        int abs = Math.abs(i6);
        if (abs < i10) {
            i6 = 0;
        } else if (abs > i11) {
            i6 = i6 > 0 ? i11 : -i11;
        }
        int abs2 = Math.abs(i7);
        if (abs2 < i10) {
            i7 = 0;
        } else if (abs2 > i11) {
            i7 = i7 > 0 ? i11 : -i11;
        }
        int abs3 = Math.abs(i8);
        int abs4 = Math.abs(i9);
        int abs5 = Math.abs(i6);
        int abs6 = Math.abs(i7);
        int i12 = abs5 + abs6;
        int i13 = abs3 + abs4;
        if (i6 != 0) {
            f4 = abs5;
            f5 = i12;
        } else {
            f4 = abs3;
            f5 = i13;
        }
        float f8 = f4 / f5;
        if (i7 != 0) {
            f6 = abs6;
            f7 = i12;
        } else {
            f6 = abs4;
            f7 = i13;
        }
        float f9 = f6 / f7;
        g gVar = this.f3122q;
        this.f3126u = f3108w;
        overScroller.startScroll(left, top, i8, i9, (int) ((e(i9, i7, gVar.m()) * f9) + (e(i8, i6, gVar.l(view)) * f8)));
        m(2);
        return true;
    }

    public final void i(MotionEvent motionEvent) {
        int findPointerIndex;
        int i4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3117l == null) {
            this.f3117l = VelocityTracker.obtain();
        }
        this.f3117l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g = g((int) x3, (int) y3);
            k(x3, y3, pointerId);
            p(g, pointerId);
            int i5 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f3109a == 1) {
                j();
            }
            a();
            return;
        }
        g gVar = this.f3122q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3109a == 1) {
                    this.f3124s = true;
                    gVar.s(this.f3123r, 0.0f, 0.0f);
                    this.f3124s = false;
                    if (this.f3109a == 1) {
                        m(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                k(x4, y4, pointerId2);
                if (this.f3109a == 0) {
                    p(g((int) x4, (int) y4), pointerId2);
                    int i6 = this.h[pointerId2];
                    return;
                }
                int i7 = (int) x4;
                int i8 = (int) y4;
                View view = this.f3123r;
                if (view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom()) {
                    r2 = 1;
                }
                if (r2 != 0) {
                    p(this.f3123r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f3109a == 1 && pointerId3 == this.c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (r2 >= pointerCount) {
                        i4 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(r2);
                    if (pointerId4 != this.c) {
                        View g4 = g((int) motionEvent.getX(r2), (int) motionEvent.getY(r2));
                        View view2 = this.f3123r;
                        if (g4 == view2 && p(view2, pointerId4)) {
                            i4 = this.c;
                            break;
                        }
                    }
                    r2++;
                }
                if (i4 == -1) {
                    j();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f3109a == 1) {
            int i9 = this.c;
            if (((this.f3116k & (1 << i9)) != 0 ? 1 : 0) == 0 || (findPointerIndex = motionEvent.findPointerIndex(i9)) == -1) {
                return;
            }
            float x5 = motionEvent.getX(findPointerIndex);
            float y5 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f3113f;
            int i10 = this.c;
            int i11 = (int) (x5 - fArr[i10]);
            int i12 = (int) (y5 - this.g[i10]);
            int left = this.f3123r.getLeft() + i11;
            int top = this.f3123r.getTop() + i12;
            int left2 = this.f3123r.getLeft();
            int top2 = this.f3123r.getTop();
            if (i11 != 0) {
                left = gVar.d(this.f3123r, left);
                WeakHashMap weakHashMap = j0.f2752a;
                this.f3123r.offsetLeftAndRight(left - left2);
            }
            if (i12 != 0) {
                top = gVar.e(this.f3123r, top);
                WeakHashMap weakHashMap2 = j0.f2752a;
                this.f3123r.offsetTopAndBottom(top - top2);
            }
            if (i11 != 0 || i12 != 0) {
                gVar.r(this.f3123r, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i13 = 0; i13 < pointerCount2; i13++) {
                int pointerId5 = motionEvent.getPointerId(i13);
                if ((this.f3116k & (1 << pointerId5)) != 0) {
                    float x6 = motionEvent.getX(i13);
                    float y6 = motionEvent.getY(i13);
                    float f4 = x6 - this.f3111d[pointerId5];
                    float f5 = y6 - this.f3112e[pointerId5];
                    Math.abs(f4);
                    Math.abs(f5);
                    int i14 = this.h[pointerId5];
                    Math.abs(f5);
                    Math.abs(f4);
                    int i15 = this.h[pointerId5];
                    Math.abs(f4);
                    Math.abs(f5);
                    int i16 = this.h[pointerId5];
                    Math.abs(f5);
                    Math.abs(f4);
                    int i17 = this.h[pointerId5];
                    if (this.f3109a == 1) {
                        break;
                    }
                    View g5 = g((int) x6, (int) y6);
                    if (c(g5, f4, f5) && p(g5, pointerId5)) {
                        break;
                    }
                }
            }
        }
        l(motionEvent);
    }

    public final void j() {
        VelocityTracker velocityTracker = this.f3117l;
        float f4 = this.f3118m;
        velocityTracker.computeCurrentVelocity(1000, f4);
        float xVelocity = this.f3117l.getXVelocity(this.c);
        float abs = Math.abs(xVelocity);
        float f5 = this.f3119n;
        if (abs < f5) {
            xVelocity = 0.0f;
        } else if (abs > f4) {
            xVelocity = xVelocity > 0.0f ? f4 : -f4;
        }
        float yVelocity = this.f3117l.getYVelocity(this.c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f5) {
            f4 = 0.0f;
        } else if (abs2 <= f4) {
            f4 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f4 = -f4;
        }
        this.f3124s = true;
        this.f3122q.s(this.f3123r, xVelocity, f4);
        this.f3124s = false;
        if (this.f3109a == 1) {
            m(0);
        }
    }

    public final void k(float f4, float f5, int i4) {
        float[] fArr = this.f3111d;
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
                float[] fArr6 = this.f3112e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3113f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3114i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3115j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3111d = fArr2;
            this.f3112e = fArr3;
            this.f3113f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.f3114i = iArr2;
            this.f3115j = iArr3;
        }
        float[] fArr9 = this.f3111d;
        this.f3113f[i4] = f4;
        fArr9[i4] = f4;
        float[] fArr10 = this.f3112e;
        this.g[i4] = f5;
        fArr10[i4] = f5;
        int[] iArr7 = this.h;
        int i6 = (int) f4;
        int i7 = (int) f5;
        CoordinatorLayout coordinatorLayout = this.f3125t;
        int left = coordinatorLayout.getLeft();
        int i8 = this.f3120o;
        int i9 = i6 < left + i8 ? 1 : 0;
        if (i7 < coordinatorLayout.getTop() + i8) {
            i9 |= 4;
        }
        if (i6 > coordinatorLayout.getRight() - i8) {
            i9 |= 2;
        }
        if (i7 > coordinatorLayout.getBottom() - i8) {
            i9 |= 8;
        }
        iArr7[i4] = i9;
        this.f3116k |= 1 << i4;
    }

    public final void l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            int pointerId = motionEvent.getPointerId(i4);
            if ((this.f3116k & (1 << pointerId)) != 0) {
                float x3 = motionEvent.getX(i4);
                float y3 = motionEvent.getY(i4);
                this.f3113f[pointerId] = x3;
                this.g[pointerId] = y3;
            }
        }
    }

    public final void m(int i4) {
        this.f3125t.removeCallbacks(this.f3127v);
        if (this.f3109a != i4) {
            this.f3109a = i4;
            this.f3122q.q(i4);
            if (this.f3109a == 0) {
                this.f3123r = null;
            }
        }
    }

    public final boolean n(int i4, int i5) {
        if (this.f3124s) {
            return h(i4, i5, (int) this.f3117l.getXVelocity(this.c), (int) this.f3117l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c5, code lost:
    
        if (r12 != r11) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(MotionEvent motionEvent) {
        View g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3117l == null) {
            this.f3117l = VelocityTracker.obtain();
        }
        this.f3117l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x3 = motionEvent.getX(actionIndex);
                            float y3 = motionEvent.getY(actionIndex);
                            k(x3, y3, pointerId);
                            int i4 = this.f3109a;
                            if (i4 == 0) {
                                int i5 = this.h[pointerId];
                            } else if (i4 == 2 && (g = g((int) x3, (int) y3)) == this.f3123r) {
                                p(g, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f3111d != null && this.f3112e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i6 = 0; i6 < pointerCount; i6++) {
                        int pointerId2 = motionEvent.getPointerId(i6);
                        if ((this.f3116k & (1 << pointerId2)) != 0) {
                            float x4 = motionEvent.getX(i6);
                            float y4 = motionEvent.getY(i6);
                            float f4 = x4 - this.f3111d[pointerId2];
                            float f5 = y4 - this.f3112e[pointerId2];
                            View g4 = g((int) x4, (int) y4);
                            boolean c = c(g4, f4, f5);
                            if (c) {
                                int left = g4.getLeft();
                                g gVar = this.f3122q;
                                int d4 = gVar.d(g4, ((int) f4) + left);
                                int top = g4.getTop();
                                int e4 = gVar.e(g4, ((int) f5) + top);
                                int l4 = gVar.l(g4);
                                int m4 = gVar.m();
                                if (l4 != 0) {
                                    if (l4 > 0) {
                                    }
                                }
                                if (m4 == 0) {
                                    break;
                                }
                                if (m4 > 0 && e4 == top) {
                                    break;
                                }
                            }
                            Math.abs(f4);
                            Math.abs(f5);
                            int i7 = this.h[pointerId2];
                            Math.abs(f5);
                            Math.abs(f4);
                            int i8 = this.h[pointerId2];
                            Math.abs(f4);
                            Math.abs(f5);
                            int i9 = this.h[pointerId2];
                            Math.abs(f5);
                            Math.abs(f4);
                            int i10 = this.h[pointerId2];
                            if (this.f3109a == 1) {
                                break;
                            }
                            if (c && p(g4, pointerId2)) {
                                break;
                            }
                        }
                    }
                    l(motionEvent);
                }
            }
            a();
        } else {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            k(x5, y5, pointerId3);
            View g5 = g((int) x5, (int) y5);
            if (g5 == this.f3123r && this.f3109a == 2) {
                p(g5, pointerId3);
            }
            int i11 = this.h[pointerId3];
        }
        return this.f3109a == 1;
    }

    public final boolean p(View view, int i4) {
        if (view == this.f3123r && this.c == i4) {
            return true;
        }
        if (view == null || !this.f3122q.y(view, i4)) {
            return false;
        }
        this.c = i4;
        b(view, i4);
        return true;
    }
}
