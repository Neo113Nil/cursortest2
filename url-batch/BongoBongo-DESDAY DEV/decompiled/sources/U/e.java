package U;

import A1.m;
import L.T;
import N0.B;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: v, reason: collision with root package name */
    public static final d f851v = new d(0);

    /* renamed from: a, reason: collision with root package name */
    public int f852a;

    /* renamed from: b, reason: collision with root package name */
    public final int f853b;
    public float[] d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f855e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f856f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f857g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f858h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f859j;

    /* renamed from: k, reason: collision with root package name */
    public int f860k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f861l;

    /* renamed from: m, reason: collision with root package name */
    public final float f862m;

    /* renamed from: n, reason: collision with root package name */
    public final float f863n;

    /* renamed from: o, reason: collision with root package name */
    public final int f864o;

    /* renamed from: p, reason: collision with root package name */
    public final OverScroller f865p;

    /* renamed from: q, reason: collision with root package name */
    public final m f866q;

    /* renamed from: r, reason: collision with root package name */
    public View f867r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f868s;

    /* renamed from: t, reason: collision with root package name */
    public final CoordinatorLayout f869t;

    /* renamed from: c, reason: collision with root package name */
    public int f854c = -1;

    /* renamed from: u, reason: collision with root package name */
    public final B f870u = new B(2, this);

    public e(Context context, CoordinatorLayout coordinatorLayout, m mVar) {
        if (coordinatorLayout == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f869t = coordinatorLayout;
        this.f866q = mVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f864o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f853b = viewConfiguration.getScaledTouchSlop();
        this.f862m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f863n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f865p = new OverScroller(context, f851v);
    }

    public final void a() {
        this.f854c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, RecyclerView.A0);
            Arrays.fill(this.f855e, RecyclerView.A0);
            Arrays.fill(this.f856f, RecyclerView.A0);
            Arrays.fill(this.f857g, RecyclerView.A0);
            Arrays.fill(this.f858h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.f859j, 0);
            this.f860k = 0;
        }
        VelocityTracker velocityTracker = this.f861l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f861l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f869t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f867r = view;
        this.f854c = i;
        this.f866q.R(view, i);
        n(1);
    }

    public final boolean c(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        m mVar = this.f866q;
        boolean z2 = mVar.F(view) > 0;
        boolean z3 = mVar.G() > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f853b) : z3 && Math.abs(f3) > ((float) this.f853b);
        }
        float f4 = (f3 * f3) + (f2 * f2);
        int i = this.f853b;
        return f4 > ((float) (i * i));
    }

    public final void d(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.f860k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.f855e[i] = 0.0f;
                this.f856f[i] = 0.0f;
                this.f857g[i] = 0.0f;
                this.f858h[i] = 0;
                this.i[i] = 0;
                this.f859j[i] = 0;
                this.f860k = (~i3) & i2;
            }
        }
    }

    public final int e(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f869t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean f() {
        if (this.f852a == 2) {
            OverScroller overScroller = this.f865p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f867r.getLeft();
            int top = currY - this.f867r.getTop();
            if (left != 0) {
                View view = this.f867r;
                WeakHashMap weakHashMap = T.f490a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f867r;
                WeakHashMap weakHashMap2 = T.f490a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f866q.T(this.f867r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.f869t.post(this.f870u);
            }
        }
        return this.f852a == 2;
    }

    public final View g(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f869t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f866q.getClass();
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
        int left = this.f867r.getLeft();
        int top = this.f867r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.f865p;
        int i7 = 0;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            n(0);
            return false;
        }
        View view = this.f867r;
        int i8 = (int) this.f863n;
        int i9 = (int) this.f862m;
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
            m mVar = this.f866q;
            overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, mVar.G()) * f7) + (e(i5, i3, mVar.F(view)) * f6)));
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
        m mVar2 = this.f866q;
        overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, mVar2.G()) * f72) + (e(i5, i3, mVar2.F(view)) * f62)));
        n(2);
        return true;
    }

    public final boolean i(int i) {
        if ((this.f860k & (1 << i)) != 0) {
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
        if (this.f861l == null) {
            this.f861l = VelocityTracker.obtain();
        }
        this.f861l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View g2 = g((int) x2, (int) y2);
            l(x2, y2, pointerId);
            q(g2, pointerId);
            int i3 = this.f858h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f852a == 1) {
                k();
            }
            a();
            return;
        }
        m mVar = this.f866q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f852a == 1) {
                    this.f868s = true;
                    mVar.U(this.f867r, RecyclerView.A0, RecyclerView.A0);
                    this.f868s = false;
                    if (this.f852a == 1) {
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
                if (this.f852a == 0) {
                    q(g((int) x3, (int) y3), pointerId2);
                    int i4 = this.f858h[pointerId2];
                    return;
                }
                int i5 = (int) x3;
                int i6 = (int) y3;
                View view = this.f867r;
                if (view != null) {
                    i2 = (i5 < view.getLeft() || i5 >= view.getRight() || i6 < view.getTop() || i6 >= view.getBottom()) ? 0 : 1;
                }
                if (i2 != 0) {
                    q(this.f867r, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f852a == 1 && pointerId3 == this.f854c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.f854c) {
                        View g3 = g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.f867r;
                        if (g3 == view2 && q(view2, pointerId4)) {
                            i = this.f854c;
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
        if (this.f852a == 1) {
            if (i(this.f854c)) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f854c);
                float x4 = motionEvent.getX(findPointerIndex);
                float y4 = motionEvent.getY(findPointerIndex);
                float[] fArr = this.f856f;
                int i7 = this.f854c;
                int i8 = (int) (x4 - fArr[i7]);
                int i9 = (int) (y4 - this.f857g[i7]);
                int left = this.f867r.getLeft() + i8;
                int top = this.f867r.getTop() + i9;
                int left2 = this.f867r.getLeft();
                int top2 = this.f867r.getTop();
                if (i8 != 0) {
                    left = mVar.k(this.f867r, left);
                    WeakHashMap weakHashMap = T.f490a;
                    this.f867r.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = mVar.l(this.f867r, top);
                    WeakHashMap weakHashMap2 = T.f490a;
                    this.f867r.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    mVar.T(this.f867r, left, top);
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
                float f3 = y5 - this.f855e[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i10 = this.f858h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i11 = this.f858h[pointerId5];
                Math.abs(f2);
                Math.abs(f3);
                int i12 = this.f858h[pointerId5];
                Math.abs(f3);
                Math.abs(f2);
                int i13 = this.f858h[pointerId5];
                if (this.f852a != 1) {
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
        VelocityTracker velocityTracker = this.f861l;
        float f2 = this.f862m;
        velocityTracker.computeCurrentVelocity(1000, f2);
        float xVelocity = this.f861l.getXVelocity(this.f854c);
        float f3 = this.f863n;
        float abs = Math.abs(xVelocity);
        float f4 = RecyclerView.A0;
        if (abs < f3) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            xVelocity = xVelocity > RecyclerView.A0 ? f2 : -f2;
        }
        float yVelocity = this.f861l.getYVelocity(this.f854c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f3) {
            if (abs2 > f2) {
                if (yVelocity <= RecyclerView.A0) {
                    f2 = -f2;
                }
                f4 = f2;
            } else {
                f4 = yVelocity;
            }
        }
        this.f868s = true;
        this.f866q.U(this.f867r, xVelocity, f4);
        this.f868s = false;
        if (this.f852a == 1) {
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
                float[] fArr6 = this.f855e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f856f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f857g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f858h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f859j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.f855e = fArr3;
            this.f856f = fArr4;
            this.f857g = fArr5;
            this.f858h = iArr;
            this.i = iArr2;
            this.f859j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f856f[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.f855e;
        this.f857g[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.f858h;
        int i3 = (int) f2;
        int i4 = (int) f3;
        CoordinatorLayout coordinatorLayout = this.f869t;
        int left = coordinatorLayout.getLeft();
        int i5 = this.f864o;
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
        this.f860k |= 1 << i;
    }

    public final void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (i(pointerId)) {
                float x2 = motionEvent.getX(i);
                float y2 = motionEvent.getY(i);
                this.f856f[pointerId] = x2;
                this.f857g[pointerId] = y2;
            }
        }
    }

    public final void n(int i) {
        this.f869t.removeCallbacks(this.f870u);
        if (this.f852a != i) {
            this.f852a = i;
            this.f866q.S(i);
            if (this.f852a == 0) {
                this.f867r = null;
            }
        }
    }

    public final boolean o(int i, int i2) {
        if (this.f868s) {
            return h(i, i2, (int) this.f861l.getXVelocity(this.f854c), (int) this.f861l.getYVelocity(this.f854c));
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
        if (this.f861l == null) {
            this.f861l = VelocityTracker.obtain();
        }
        this.f861l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x2 = motionEvent.getX(actionIndex);
                            float y2 = motionEvent.getY(actionIndex);
                            l(x2, y2, pointerId);
                            int i = this.f852a;
                            if (i == 0) {
                                int i2 = this.f858h[pointerId];
                            } else if (i == 2 && (g2 = g((int) x2, (int) y2)) == this.f867r) {
                                q(g2, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.d != null && this.f855e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if (i(pointerId2)) {
                            float x3 = motionEvent.getX(i3);
                            float y3 = motionEvent.getY(i3);
                            float f2 = x3 - this.d[pointerId2];
                            float f3 = y3 - this.f855e[pointerId2];
                            View g3 = g((int) x3, (int) y3);
                            boolean z2 = g3 != null && c(g3, f2, f3);
                            if (z2) {
                                int left = g3.getLeft();
                                m mVar = this.f866q;
                                int k2 = mVar.k(g3, ((int) f2) + left);
                                int top = g3.getTop();
                                int l2 = mVar.l(g3, ((int) f3) + top);
                                int F2 = mVar.F(g3);
                                int G = mVar.G();
                                if (F2 != 0) {
                                    if (F2 > 0) {
                                    }
                                }
                                if (G == 0) {
                                    break;
                                }
                                if (G > 0 && l2 == top) {
                                    break;
                                }
                            }
                            Math.abs(f2);
                            Math.abs(f3);
                            int i4 = this.f858h[pointerId2];
                            Math.abs(f3);
                            Math.abs(f2);
                            int i5 = this.f858h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f3);
                            int i6 = this.f858h[pointerId2];
                            Math.abs(f3);
                            Math.abs(f2);
                            int i7 = this.f858h[pointerId2];
                            if (this.f852a == 1) {
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
            if (g4 == this.f867r && this.f852a == 2) {
                q(g4, pointerId3);
            }
            int i8 = this.f858h[pointerId3];
        }
        return this.f852a == 1;
    }

    public final boolean q(View view, int i) {
        if (view == this.f867r && this.f854c == i) {
            return true;
        }
        if (view == null || !this.f866q.m0(view, i)) {
            return false;
        }
        this.f854c = i;
        b(view, i);
        return true;
    }
}
