package t0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.g;
import f1.b0;
import java.util.Arrays;
import java.util.WeakHashMap;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final b0 f3287v = new b0(1);

    /* renamed from: a, reason: collision with root package name */
    public int f3288a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3289b;
    public float[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f3291e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f3292f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f3293g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f3294h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f3295j;

    /* renamed from: k, reason: collision with root package name */
    public int f3296k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f3297l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3298m;

    /* renamed from: n, reason: collision with root package name */
    public final float f3299n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3300o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f3301p;

    /* renamed from: q, reason: collision with root package name */
    public final d f3302q;

    /* renamed from: r, reason: collision with root package name */
    public View f3303r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3304s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f3305t;

    /* renamed from: c, reason: collision with root package name */
    public int f3290c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final g f3306u = new g(10, this);

    public e(Context context, CoordinatorLayout coordinatorLayout, d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f3305t = coordinatorLayout;
        this.f3302q = dVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3300o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f3289b = viewConfiguration.getScaledTouchSlop();
        this.f3298m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3299n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3301p = new OverScroller(context, f3287v);
    }

    public final void a() {
        this.f3290c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3291e, 0.0f);
            Arrays.fill(this.f3292f, 0.0f);
            Arrays.fill(this.f3293g, 0.0f);
            Arrays.fill(this.f3294h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f3295j, 0);
            this.f3296k = 0;
        }
        VelocityTracker velocityTracker = this.f3297l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3297l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f3305t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f3303r = view;
        this.f3290c = i;
        this.f3302q.n(view, i);
        n(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f2, float f4) {
        if (view != null) {
            d dVar = this.f3302q;
            boolean z3 = dVar.i(view) > 0;
            boolean z4 = dVar.j() > 0;
            if (z3 && z4) {
                float f5 = (f4 * f4) + (f2 * f2);
                int i = this.f3289b;
                if (f5 > i * i) {
                }
            } else if (!z3 ? !(!z4 || Math.abs(f4) <= this.f3289b) : Math.abs(f2) > this.f3289b) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i4 = this.f3296k;
            int i5 = 1 << i;
            if ((i4 & i5) != 0) {
                fArr[i] = 0.0f;
                this.f3291e[i] = 0.0f;
                this.f3292f[i] = 0.0f;
                this.f3293g[i] = 0.0f;
                this.f3294h[i] = 0;
                this.i[i] = 0;
                this.f3295j[i] = 0;
                this.f3296k = (~i5) & i4;
            }
        }
    }

    public final int e(int i, int i4, int i5) {
        if (i == 0) {
            return 0;
        }
        float width = this.f3305t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i4);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i5) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f3288a == 2) {
            OverScroller overScroller = this.f3301p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f3303r.getLeft();
            int top = currY - this.f3303r.getTop();
            if (left != 0) {
                View view = this.f3303r;
                WeakHashMap weakHashMap = l0.f2757a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f3303r;
                WeakHashMap weakHashMap2 = l0.f2757a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f3302q.p(this.f3303r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f3305t.post(this.f3306u);
            }
        }
        return this.f3288a == 2;
    }

    public final View g(int i, int i4) {
        CoordinatorLayout coordinatorLayout = this.f3305t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f3302q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i4, int i5, int i6) {
        float f2;
        float f4;
        float f5;
        float f6;
        int left = this.f3303r.getLeft();
        int top = this.f3303r.getTop();
        int i7 = i - left;
        int i8 = i4 - top;
        OverScroller overScroller = this.f3301p;
        if (i7 == 0 && i8 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f3303r;
        int i9 = (int) this.f3299n;
        int i10 = (int) this.f3298m;
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
            f2 = abs5;
            f4 = i11;
        } else {
            f2 = abs3;
            f4 = i12;
        }
        float f7 = f2 / f4;
        if (i6 != 0) {
            f5 = abs6;
            f6 = i11;
        } else {
            f5 = abs4;
            f6 = i12;
        }
        float f8 = f5 / f6;
        d dVar = this.f3302q;
        overScroller.startScroll(left, top, i7, i8, (int) ((e(i8, i6, dVar.j()) * f8) + (e(i7, i5, dVar.i(view)) * f7)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.f3296k & (1 << i)) != 0) {
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
        if (this.f3297l == null) {
            this.f3297l = VelocityTracker.obtain();
        }
        this.f3297l.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g4 = g((int) x3, (int) y3);
            l(x3, y3, pointerId);
            q(g4, pointerId);
            int i5 = this.f3294h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f3288a == 1) {
                k();
            }
            a();
            return;
        }
        d dVar = this.f3302q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f3288a == 1) {
                    this.f3304s = true;
                    dVar.q(this.f3303r, 0.0f, 0.0f);
                    this.f3304s = false;
                    if (this.f3288a == 1) {
                        n(0);
                    }
                }
                a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                l(x4, y4, pointerId2);
                if (this.f3288a == 0) {
                    q(g((int) x4, (int) y4), pointerId2);
                    int i6 = this.f3294h[pointerId2];
                    return;
                }
                int i7 = (int) x4;
                int i8 = (int) y4;
                View view = this.f3303r;
                if (view != null && i7 >= view.getLeft() && i7 < view.getRight() && i8 >= view.getTop() && i8 < view.getBottom()) {
                    i4 = 1;
                }
                if (i4 != 0) {
                    q(this.f3303r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f3288a == 1 && pointerId3 == this.f3290c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i4 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i4);
                    if (pointerId4 != this.f3290c) {
                        View g5 = g((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                        View view2 = this.f3303r;
                        if (g5 == view2 && q(view2, pointerId4)) {
                            i = this.f3290c;
                            break;
                        }
                    }
                    i4++;
                }
                if (i == -1) {
                    k();
                }
            }
            d(pointerId3);
            return;
        }
        if (this.f3288a == 1) {
            if (i(this.f3290c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3290c);
                float x5 = motionEvent.getX(findPointerIndex);
                float y5 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f3292f;
                int i9 = this.f3290c;
                int i10 = (int) (x5 - fArr[i9]);
                int i11 = (int) (y5 - this.f3293g[i9]);
                int left = this.f3303r.getLeft() + i10;
                int top = this.f3303r.getTop() + i11;
                int left2 = this.f3303r.getLeft();
                int top2 = this.f3303r.getTop();
                if (i10 != 0) {
                    left = dVar.c(this.f3303r, left);
                    WeakHashMap weakHashMap = l0.f2757a;
                    this.f3303r.offsetLeftAndRight(left - left2);
                }
                if (i11 != 0) {
                    top = dVar.d(this.f3303r, top);
                    WeakHashMap weakHashMap2 = l0.f2757a;
                    this.f3303r.offsetTopAndBottom(top - top2);
                }
                if (i10 != 0 || i11 != 0) {
                    dVar.p(this.f3303r, left, top);
                }
                m(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i4 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i4);
            if (i(pointerId5)) {
                float x6 = motionEvent.getX(i4);
                float y6 = motionEvent.getY(i4);
                float f2 = x6 - this.d[pointerId5];
                float f4 = y6 - this.f3291e[pointerId5];
                Math.abs(f2);
                Math.abs(f4);
                int i12 = this.f3294h[pointerId5];
                Math.abs(f4);
                Math.abs(f2);
                int i13 = this.f3294h[pointerId5];
                Math.abs(f2);
                Math.abs(f4);
                int i14 = this.f3294h[pointerId5];
                Math.abs(f4);
                Math.abs(f2);
                int i15 = this.f3294h[pointerId5];
                if (this.f3288a != 1) {
                    View g6 = g((int) x6, (int) y6);
                    if (c(g6, f2, f4) && q(g6, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i4++;
        }
        m(motionEvent);
    }

    public final void k() {
        VelocityTracker velocityTracker = this.f3297l;
        float f2 = this.f3298m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f3297l.getXVelocity(this.f3290c);
        float abs = Math.abs(xVelocity);
        float f4 = this.f3299n;
        if (abs < f4) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.f3297l.getYVelocity(this.f3290c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f4) {
            f2 = 0.0f;
        } else if (abs2 <= f2) {
            f2 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f2 = -f2;
        }
        this.f3304s = true;
        this.f3302q.q(this.f3303r, xVelocity, f2);
        this.f3304s = false;
        if (this.f3288a == 1) {
            n(0);
        }
    }

    public final void l(float f2, float f4, int i) {
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
                float[] fArr6 = this.f3291e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3292f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3293g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3294h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3295j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f3291e = fArr3;
            this.f3292f = fArr4;
            this.f3293g = fArr5;
            this.f3294h = iArr;
            this.i = iArr2;
            this.f3295j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f3292f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f3291e;
        this.f3293g[i] = f4;
        fArr10[i] = f4;
        int[] iArr7 = this.f3294h;
        int i5 = (int) f2;
        int i6 = (int) f4;
        CoordinatorLayout coordinatorLayout = this.f3305t;
        int left = coordinatorLayout.getLeft();
        int i7 = this.f3300o;
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
        this.f3296k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x3 = motionEvent.getX(i);
                float y3 = motionEvent.getY(i);
                this.f3292f[pointerId] = x3;
                this.f3293g[pointerId] = y3;
            }
        }
    }

    public final void n(int i) {
        this.f3305t.removeCallbacks(this.f3306u);
        if (this.f3288a != i) {
            this.f3288a = i;
            this.f3302q.o(i);
            if (this.f3288a == 0) {
                this.f3303r = null;
            }
        }
    }

    public final boolean o(int i, int i4) {
        if (this.f3304s) {
            return h(i, i4, (int) this.f3297l.getXVelocity(this.f3290c), (int) this.f3297l.getYVelocity(this.f3290c));
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
        View g4;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3297l == null) {
            this.f3297l = VelocityTracker.obtain();
        }
        this.f3297l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x3 = motionEvent.getX(actionIndex);
                            float y3 = motionEvent.getY(actionIndex);
                            l(x3, y3, pointerId);
                            int i = this.f3288a;
                            if (i == 0) {
                                int i4 = this.f3294h[pointerId];
                            } else if (i == 2 && (g4 = g((int) x3, (int) y3)) == this.f3303r) {
                                q(g4, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.d != null && this.f3291e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i5 = 0; i5 < pointerCount; i5++) {
                        int pointerId2 = motionEvent.getPointerId(i5);
                        if (i(pointerId2)) {
                            float x4 = motionEvent.getX(i5);
                            float y4 = motionEvent.getY(i5);
                            float f2 = x4 - this.d[pointerId2];
                            float f4 = y4 - this.f3291e[pointerId2];
                            View g5 = g((int) x4, (int) y4);
                            boolean z3 = g5 != null && c(g5, f2, f4);
                            if (z3) {
                                int left = g5.getLeft();
                                d dVar = this.f3302q;
                                int c4 = dVar.c(g5, ((int) f2) + left);
                                int top = g5.getTop();
                                int d = dVar.d(g5, ((int) f4) + top);
                                int i6 = dVar.i(g5);
                                int j4 = dVar.j();
                                if (i6 != 0) {
                                    if (i6 > 0) {
                                    }
                                }
                                if (j4 == 0) {
                                    break;
                                }
                                if (j4 > 0 && d == top) {
                                    break;
                                }
                            }
                            Math.abs(f2);
                            Math.abs(f4);
                            int i7 = this.f3294h[pointerId2];
                            Math.abs(f4);
                            Math.abs(f2);
                            int i8 = this.f3294h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f4);
                            int i9 = this.f3294h[pointerId2];
                            Math.abs(f4);
                            Math.abs(f2);
                            int i10 = this.f3294h[pointerId2];
                            if (this.f3288a == 1) {
                                break;
                            }
                            if (z3 && q(g5, pointerId2)) {
                                break;
                            }
                        }
                    }
                    m(motionEvent);
                }
            }
            a();
        } else {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            l(x5, y5, pointerId3);
            View g6 = g((int) x5, (int) y5);
            if (g6 == this.f3303r && this.f3288a == 2) {
                q(g6, pointerId3);
            }
            int i11 = this.f3294h[pointerId3];
        }
        return this.f3288a == 1;
    }

    public final boolean q(View view, int i) {
        if (view == this.f3303r && this.f3290c == i) {
            return true;
        }
        if (view == null || !this.f3302q.u(view, i)) {
            return false;
        }
        this.f3290c = i;
        b(view, i);
        return true;
    }
}
