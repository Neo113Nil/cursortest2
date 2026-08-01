package g1;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public int f1753f;

    /* renamed from: g, reason: collision with root package name */
    public int f1754g;
    public OverScroller h;
    public Interpolator i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1755j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1756k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1757l;

    public p1(RecyclerView recyclerView) {
        this.f1757l = recyclerView;
        o0 o0Var = RecyclerView.N0;
        this.i = o0Var;
        this.f1755j = false;
        this.f1756k = false;
        this.h = new OverScroller(recyclerView.getContext(), o0Var);
    }

    public final void a(int i, int i4) {
        RecyclerView recyclerView = this.f1757l;
        recyclerView.setScrollState(2);
        this.f1754g = 0;
        this.f1753f = 0;
        Interpolator interpolator = this.i;
        o0 o0Var = RecyclerView.N0;
        if (interpolator != o0Var) {
            this.i = o0Var;
            this.h = new OverScroller(recyclerView.getContext(), o0Var);
        }
        this.h.fling(0, 0, i, i4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f1755j) {
            this.f1756k = true;
            return;
        }
        RecyclerView recyclerView = this.f1757l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = n0.p0.f2816a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i4, int i5, Interpolator interpolator) {
        RecyclerView recyclerView = this.f1757l;
        if (i5 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i4);
            boolean z4 = abs > abs2;
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z4) {
                abs = abs2;
            }
            i5 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i6 = i5;
        if (interpolator == null) {
            interpolator = RecyclerView.N0;
        }
        if (this.i != interpolator) {
            this.i = interpolator;
            this.h = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f1754g = 0;
        this.f1753f = 0;
        recyclerView.setScrollState(2);
        this.h.startScroll(0, 0, i, i4, i6);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i4;
        int i5;
        int i6;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f1757l;
        int[] iArr = recyclerView.f799x0;
        if (recyclerView.f788s == null) {
            recyclerView.removeCallbacks(this);
            this.h.abortAnimation();
            return;
        }
        this.f1756k = false;
        this.f1755j = true;
        recyclerView.p();
        OverScroller overScroller = this.h;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i7 = currX - this.f1753f;
            int i8 = currY - this.f1754g;
            this.f1753f = currX;
            this.f1754g = currY;
            int o4 = RecyclerView.o(i7, recyclerView.M, recyclerView.O, recyclerView.getWidth());
            int o5 = RecyclerView.o(i8, recyclerView.N, recyclerView.P, recyclerView.getHeight());
            int[] iArr2 = recyclerView.f799x0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.u(o4, o5, 1, iArr2, null)) {
                o4 -= iArr[0];
                o5 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o4, o5);
            }
            if (recyclerView.f786r != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.f0(o4, o5, iArr);
                int i9 = iArr[0];
                int i10 = iArr[1];
                int i11 = o4 - i9;
                int i12 = o5 - i10;
                h0 h0Var = recyclerView.f788s.f1600e;
                if (h0Var != null && !h0Var.d && h0Var.f1678e) {
                    int b2 = recyclerView.f775l0.b();
                    if (b2 == 0) {
                        h0Var.i();
                    } else if (h0Var.f1675a >= b2) {
                        h0Var.f1675a = b2 - 1;
                        h0Var.g(i9, i10);
                    } else {
                        h0Var.g(i9, i10);
                    }
                }
                i = i11;
                i5 = i9;
                i4 = i12;
                i6 = i10;
            } else {
                i = o4;
                i4 = o5;
                i5 = 0;
                i6 = 0;
            }
            if (!recyclerView.f792u.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f799x0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.v(i5, i6, i, i4, null, 1, iArr3);
            int i13 = i - iArr[0];
            int i14 = i4 - iArr[1];
            if (i5 != 0 || i6 != 0) {
                recyclerView.w(i5, i6);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i13 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i14 != 0));
            h0 h0Var2 = recyclerView.f788s.f1600e;
            if ((h0Var2 == null || !h0Var2.d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i15 = i13 < 0 ? -currVelocity : i13 > 0 ? currVelocity : 0;
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i15 < 0) {
                        recyclerView.y();
                        if (recyclerView.M.isFinished()) {
                            recyclerView.M.onAbsorb(-i15);
                        }
                    } else if (i15 > 0) {
                        recyclerView.z();
                        if (recyclerView.O.isFinished()) {
                            recyclerView.O.onAbsorb(i15);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.P.isFinished()) {
                            recyclerView.P.onAbsorb(currVelocity);
                        }
                    }
                    if (i15 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.L0) {
                    y yVar = recyclerView.f773k0;
                    int[] iArr4 = yVar.f1853c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    yVar.d = 0;
                }
            } else {
                b();
                a0 a0Var = recyclerView.f771j0;
                if (a0Var != null) {
                    a0Var.a(recyclerView, i5, i6);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                s0.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        h0 h0Var3 = recyclerView.f788s.f1600e;
        if (h0Var3 != null && h0Var3.d) {
            h0Var3.g(0, 0);
        }
        this.f1755j = false;
        if (!this.f1756k) {
            recyclerView.setScrollState(0);
            recyclerView.n0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = n0.p0.f2816a;
            recyclerView.postOnAnimation(this);
        }
    }
}
