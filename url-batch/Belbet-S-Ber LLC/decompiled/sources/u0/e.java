package u0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.g;
import g1.o0;
import java.util.Arrays;
import java.util.WeakHashMap;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: w, reason: collision with root package name */
    public static final o0 f3556w = new o0(1);

    /* renamed from: a, reason: collision with root package name */
    public int f3557a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3558b;
    public float[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3560e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f3561f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f3562g;
    public int[] h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3563j;

    /* renamed from: k, reason: collision with root package name */
    public int f3564k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f3565l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3566m;

    /* renamed from: n, reason: collision with root package name */
    public final float f3567n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3568o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f3569p;

    /* renamed from: q, reason: collision with root package name */
    public final r1.b f3570q;

    /* renamed from: r, reason: collision with root package name */
    public View f3571r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3572s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f3573t;

    /* renamed from: u, reason: collision with root package name */
    public o0 f3574u;

    /* renamed from: c, reason: collision with root package name */
    public int f3559c = -1;

    /* renamed from: v, reason: collision with root package name */
    public final g f3575v = new g(10, this);

    public e(Context context, CoordinatorLayout coordinatorLayout, r1.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.f3573t = coordinatorLayout;
        this.f3570q = bVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3568o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3558b = viewConfiguration.getScaledTouchSlop();
        this.f3566m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3567n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3574u = f3556w;
        this.f3569p = new OverScroller(context, new d(this));
    }

    public final void a() {
        this.f3559c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3560e, 0.0f);
            Arrays.fill(this.f3561f, 0.0f);
            Arrays.fill(this.f3562g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f3563j, 0);
            this.f3564k = 0;
        }
        VelocityTracker velocityTracker = this.f3565l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3565l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f3573t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f3571r = view;
        this.f3559c = i;
        this.f3570q.q(view, i);
        m(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f5, float f6) {
        if (view != null) {
            r1.b bVar = this.f3570q;
            boolean z4 = bVar.n(view) > 0;
            boolean z5 = bVar.o() > 0;
            if (z4 && z5) {
                float f7 = (f6 * f6) + (f5 * f5);
                int i = this.f3558b;
                if (f7 > i * i) {
                }
            } else if (!z4 ? !(!z5 || Math.abs(f6) <= this.f3558b) : Math.abs(f5) > this.f3558b) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i4 = this.f3564k;
            int i5 = 1 << i;
            if ((i4 & i5) != 0) {
                fArr[i] = 0.0f;
                this.f3560e[i] = 0.0f;
                this.f3561f[i] = 0.0f;
                this.f3562g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.f3563j[i] = 0;
                this.f3564k = (~i5) & i4;
            }
        }
    }

    public final int e(int i, int i4, int i5) {
        if (i == 0) {
            return 0;
        }
        float width = this.f3573t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i4);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i5) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f3557a == 2) {
            OverScroller overScroller = this.f3569p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3571r.getLeft();
            int top = currY - this.f3571r.getTop();
            if (left != 0) {
                View view = this.f3571r;
                WeakHashMap weakHashMap = p0.f2816a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3571r;
                WeakHashMap weakHashMap2 = p0.f2816a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3570q.s(this.f3571r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3573t.post(this.f3575v);
            }
        }
        return this.f3557a == 2;
    }

    public final View g(int i, int i4) {
        CoordinatorLayout coordinatorLayout = this.f3573t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3570q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i4, int i5, int i6) {
        float f5;
        float f6;
        float f7;
        float f8;
        int left = this.f3571r.getLeft();
        int top = this.f3571r.getTop();
        int i7 = i - left;
        int i8 = i4 - top;
        OverScroller overScroller = this.f3569p;
        if (i7 == 0 && i8 == 0) {
            overScroller.abortAnimation();
            m(0);
            return false;
        }
        View view = this.f3571r;
        int i9 = (int) this.f3567n;
        int i10 = (int) this.f3566m;
        int abs = Math.abs(i5);
        if (abs < i9) {
            i5 = 0;
        } else if (abs > i10) {
            i5 = i5 > 0 ? i10 : -i10;
        }
        int abs2 = Math.abs(i6);
        if (abs2 < i9) {
            i6 = 0;
        } else if (abs2 > i10) {
            i6 = i6 > 0 ? i10 : -i10;
        }
        int abs3 = Math.abs(i7);
        int abs4 = Math.abs(i8);
        int abs5 = Math.abs(i5);
        int abs6 = Math.abs(i6);
        int i11 = abs5 + abs6;
        int i12 = abs3 + abs4;
        if (i5 != 0) {
            f5 = abs5;
            f6 = i11;
        } else {
            f5 = abs3;
            f6 = i12;
        }
        float f9 = f5 / f6;
        if (i6 != 0) {
            f7 = abs6;
            f8 = i11;
        } else {
            f7 = abs4;
            f8 = i12;
        }
        float f10 = f7 / f8;
        r1.b bVar = this.f3570q;
        this.f3574u = f3556w;
        overScroller.startScroll(left, top, i7, i8, (int) ((e(i8, i6, bVar.o()) * f10) + (e(i7, i5, bVar.n(view)) * f9)));
        m(2);
        return true;
    }

    public final void i(MotionEvent motionEvent) {
        int findPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3565l == null) {
            this.f3565l = VelocityTracker.obtain();
        }
        this.f3565l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x4 = motionEvent.getX();
            float y4 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g3 = g((int) x4, (int) y4);
            k(x4, y4, pointerId);
            p(g3, pointerId);
            int i4 = this.h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f3557a == 1) {
                j();
            }
            a();
            return;
        }
        r1.b bVar = this.f3570q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3557a == 1) {
                    this.f3572s = true;
                    bVar.t(this.f3571r, 0.0f, 0.0f);
                    this.f3572s = false;
                    if (this.f3557a == 1) {
                        m(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x5 = motionEvent.getX(actionIndex);
                float y5 = motionEvent.getY(actionIndex);
                k(x5, y5, pointerId2);
                if (this.f3557a == 0) {
                    p(g((int) x5, (int) y5), pointerId2);
                    int i5 = this.h[pointerId2];
                    return;
                }
                int i6 = (int) x5;
                int i7 = (int) y5;
                View view = this.f3571r;
                if (view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom()) {
                    r2 = 1;
                }
                if (r2 != 0) {
                    p(this.f3571r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f3557a == 1 && pointerId3 == this.f3559c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (r2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(r2);
                    if (pointerId4 != this.f3559c) {
                        View g5 = g((int) motionEvent.getX(r2), (int) motionEvent.getY(r2));
                        View view2 = this.f3571r;
                        if (g5 == view2 && p(view2, pointerId4)) {
                            i = this.f3559c;
                            break;
                        }
                    }
                    r2++;
                }
                if (i == -1) {
                    j();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f3557a == 1) {
            int i8 = this.f3559c;
            if (((this.f3564k & (1 << i8)) != 0 ? 1 : 0) == 0 || (findPointerIndex = motionEvent.findPointerIndex(i8)) == -1) {
                return;
            }
            float x6 = motionEvent.getX(findPointerIndex);
            float y6 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f3561f;
            int i9 = this.f3559c;
            int i10 = (int) (x6 - fArr[i9]);
            int i11 = (int) (y6 - this.f3562g[i9]);
            int left = this.f3571r.getLeft() + i10;
            int top = this.f3571r.getTop() + i11;
            int left2 = this.f3571r.getLeft();
            int top2 = this.f3571r.getTop();
            if (i10 != 0) {
                left = bVar.e(this.f3571r, left);
                WeakHashMap weakHashMap = p0.f2816a;
                this.f3571r.offsetLeftAndRight(left - left2);
            }
            if (i11 != 0) {
                top = bVar.f(this.f3571r, top);
                WeakHashMap weakHashMap2 = p0.f2816a;
                this.f3571r.offsetTopAndBottom(top - top2);
            }
            if (i10 != 0 || i11 != 0) {
                bVar.s(this.f3571r, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i12 = 0; i12 < pointerCount2; i12++) {
                int pointerId5 = motionEvent.getPointerId(i12);
                if ((this.f3564k & (1 << pointerId5)) != 0) {
                    float x7 = motionEvent.getX(i12);
                    float y7 = motionEvent.getY(i12);
                    float f5 = x7 - this.d[pointerId5];
                    float f6 = y7 - this.f3560e[pointerId5];
                    Math.abs(f5);
                    Math.abs(f6);
                    int i13 = this.h[pointerId5];
                    Math.abs(f6);
                    Math.abs(f5);
                    int i14 = this.h[pointerId5];
                    Math.abs(f5);
                    Math.abs(f6);
                    int i15 = this.h[pointerId5];
                    Math.abs(f6);
                    Math.abs(f5);
                    int i16 = this.h[pointerId5];
                    if (this.f3557a == 1) {
                        break;
                    }
                    View g6 = g((int) x7, (int) y7);
                    if (c(g6, f5, f6) && p(g6, pointerId5)) {
                        break;
                    }
                }
            }
        }
        l(motionEvent);
    }

    public final void j() {
        VelocityTracker velocityTracker = this.f3565l;
        float f5 = this.f3566m;
        velocityTracker.computeCurrentVelocity(1000, f5);
        float xVelocity = this.f3565l.getXVelocity(this.f3559c);
        float abs = Math.abs(xVelocity);
        float f6 = this.f3567n;
        if (abs < f6) {
            xVelocity = 0.0f;
        } else if (abs > f5) {
            xVelocity = xVelocity > 0.0f ? f5 : -f5;
        }
        float yVelocity = this.f3565l.getYVelocity(this.f3559c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f6) {
            f5 = 0.0f;
        } else if (abs2 <= f5) {
            f5 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f5 = -f5;
        }
        this.f3572s = true;
        this.f3570q.t(this.f3571r, xVelocity, f5);
        this.f3572s = false;
        if (this.f3557a == 1) {
            m(0);
        }
    }

    public final void k(float f5, float f6, int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i4 = i + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3560e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3561f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3562g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3563j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f3560e = fArr3;
            this.f3561f = fArr4;
            this.f3562g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.f3563j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f3561f[i] = f5;
        fArr9[i] = f5;
        float[] fArr10 = this.f3560e;
        this.f3562g[i] = f6;
        fArr10[i] = f6;
        int[] iArr7 = this.h;
        int i5 = (int) f5;
        int i6 = (int) f6;
        CoordinatorLayout coordinatorLayout = this.f3573t;
        int left = coordinatorLayout.getLeft();
        int i7 = this.f3568o;
        int i8 = i5 < left + i7 ? 1 : 0;
        if (i6 < coordinatorLayout.getTop() + i7) {
            i8 |= 4;
        }
        if (i5 > coordinatorLayout.getRight() - i7) {
            i8 |= 2;
        }
        if (i6 > coordinatorLayout.getBottom() - i7) {
            i8 |= 8;
        }
        iArr7[i] = i8;
        this.f3564k |= 1 << i;
    }

    public final void l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.f3564k & (1 << pointerId)) != 0) {
                float x4 = motionEvent.getX(i);
                float y4 = motionEvent.getY(i);
                this.f3561f[pointerId] = x4;
                this.f3562g[pointerId] = y4;
            }
        }
    }

    public final void m(int i) {
        this.f3573t.removeCallbacks(this.f3575v);
        if (this.f3557a != i) {
            this.f3557a = i;
            this.f3570q.r(i);
            if (this.f3557a == 0) {
                this.f3571r = null;
            }
        }
    }

    public final boolean n(int i, int i4) {
        if (this.f3572s) {
            return h(i, i4, (int) this.f3565l.getXVelocity(this.f3559c), (int) this.f3565l.getYVelocity(this.f3559c));
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
        View g3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3565l == null) {
            this.f3565l = VelocityTracker.obtain();
        }
        this.f3565l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x4 = motionEvent.getX(actionIndex);
                            float y4 = motionEvent.getY(actionIndex);
                            k(x4, y4, pointerId);
                            int i = this.f3557a;
                            if (i == 0) {
                                int i4 = this.h[pointerId];
                            } else if (i == 2 && (g3 = g((int) x4, (int) y4)) == this.f3571r) {
                                p(g3, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.d != null && this.f3560e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i5 = 0; i5 < pointerCount; i5++) {
                        int pointerId2 = motionEvent.getPointerId(i5);
                        if ((this.f3564k & (1 << pointerId2)) != 0) {
                            float x5 = motionEvent.getX(i5);
                            float y5 = motionEvent.getY(i5);
                            float f5 = x5 - this.d[pointerId2];
                            float f6 = y5 - this.f3560e[pointerId2];
                            View g5 = g((int) x5, (int) y5);
                            boolean c5 = c(g5, f5, f6);
                            if (c5) {
                                int left = g5.getLeft();
                                r1.b bVar = this.f3570q;
                                int e4 = bVar.e(g5, ((int) f5) + left);
                                int top = g5.getTop();
                                int f7 = bVar.f(g5, ((int) f6) + top);
                                int n4 = bVar.n(g5);
                                int o4 = bVar.o();
                                if (n4 != 0) {
                                    if (n4 > 0) {
                                    }
                                }
                                if (o4 == 0) {
                                    break;
                                }
                                if (o4 > 0 && f7 == top) {
                                    break;
                                }
                            }
                            Math.abs(f5);
                            Math.abs(f6);
                            int i6 = this.h[pointerId2];
                            Math.abs(f6);
                            Math.abs(f5);
                            int i7 = this.h[pointerId2];
                            Math.abs(f5);
                            Math.abs(f6);
                            int i8 = this.h[pointerId2];
                            Math.abs(f6);
                            Math.abs(f5);
                            int i9 = this.h[pointerId2];
                            if (this.f3557a == 1) {
                                break;
                            }
                            if (c5 && p(g5, pointerId2)) {
                                break;
                            }
                        }
                    }
                    l(motionEvent);
                }
            }
            a();
        } else {
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            k(x6, y6, pointerId3);
            View g6 = g((int) x6, (int) y6);
            if (g6 == this.f3571r && this.f3557a == 2) {
                p(g6, pointerId3);
            }
            int i10 = this.h[pointerId3];
        }
        return this.f3557a == 1;
    }

    public final boolean p(View view, int i) {
        if (view == this.f3571r && this.f3559c == i) {
            return true;
        }
        if (view == null || !this.f3570q.D(view, i)) {
            return false;
        }
        this.f3559c = i;
        b(view, i);
        return true;
    }
}
