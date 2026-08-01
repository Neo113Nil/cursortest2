package g0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class X implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f2770a;

    /* renamed from: b, reason: collision with root package name */
    public int f2771b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2772c;
    public Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2773e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2775g;

    public X(RecyclerView recyclerView) {
        this.f2775g = recyclerView;
        T.d dVar = RecyclerView.f1941E0;
        this.d = dVar;
        this.f2773e = false;
        this.f2774f = false;
        this.f2772c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.f2775g;
        recyclerView.setScrollState(2);
        this.f2771b = 0;
        this.f2770a = 0;
        Interpolator interpolator = this.d;
        T.d dVar = RecyclerView.f1941E0;
        if (interpolator != dVar) {
            this.d = dVar;
            this.f2772c = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f2772c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f2773e) {
            this.f2774f = true;
            return;
        }
        RecyclerView recyclerView = this.f2775g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = K.Q.f578a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f2775g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z2 = abs > abs2;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z2) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f1941E0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f2772c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2771b = 0;
        this.f2770a = 0;
        recyclerView.setScrollState(2);
        this.f2772c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f2775g;
        if (recyclerView.f1989m == null) {
            recyclerView.removeCallbacks(this);
            this.f2772c.abortAnimation();
            return;
        }
        this.f2774f = false;
        this.f2773e = true;
        recyclerView.p();
        OverScroller overScroller = this.f2772c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f2770a;
            int i6 = currY - this.f2771b;
            this.f2770a = currX;
            this.f2771b = currY;
            int o2 = RecyclerView.o(i5, recyclerView.F, recyclerView.f1952H, recyclerView.getWidth());
            int o3 = RecyclerView.o(i6, recyclerView.f1951G, recyclerView.f1953I, recyclerView.getHeight());
            int[] iArr = recyclerView.f1997q0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u2 = recyclerView.u(o2, o3, iArr, null, 1);
            int[] iArr2 = recyclerView.f1997q0;
            if (u2) {
                o2 -= iArr2[0];
                o3 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o2, o3);
            }
            if (recyclerView.f1987l != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.d0(o2, o3, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = o2 - i7;
                int i10 = o3 - i8;
                C0157v c0157v = recyclerView.f1989m.f2727e;
                if (c0157v != null && !c0157v.d && c0157v.f2941e) {
                    int b2 = recyclerView.f1976e0.b();
                    if (b2 == 0) {
                        c0157v.i();
                    } else if (c0157v.f2938a >= b2) {
                        c0157v.f2938a = b2 - 1;
                        c0157v.g(i7, i8);
                    } else {
                        c0157v.g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = o2;
                i2 = o3;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f1993o.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1997q0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.v(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.w(i4, i11);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C0157v c0157v2 = recyclerView.f1989m.f2727e;
            if ((c0157v2 == null || !c0157v2.d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.y();
                        if (recyclerView.F.isFinished()) {
                            recyclerView.F.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.z();
                        if (recyclerView.f1952H.isFinished()) {
                            recyclerView.f1952H.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.f1951G.isFinished()) {
                            recyclerView.f1951G.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f1953I.isFinished()) {
                            recyclerView.f1953I.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = K.Q.f578a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1939C0) {
                    C0149m c0149m = recyclerView.f1974d0;
                    int[] iArr4 = c0149m.f2901c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0149m.d = 0;
                }
            } else {
                b();
                RunnableC0151o runnableC0151o = recyclerView.f1973c0;
                if (runnableC0151o != null) {
                    runnableC0151o.a(recyclerView, i4, i11);
                }
            }
        }
        C0157v c0157v3 = recyclerView.f1989m.f2727e;
        if (c0157v3 != null && c0157v3.d) {
            c0157v3.g(0, 0);
        }
        this.f2773e = false;
        if (!this.f2774f) {
            recyclerView.setScrollState(0);
            recyclerView.j0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = K.Q.f578a;
            recyclerView.postOnAnimation(this);
        }
    }
}
