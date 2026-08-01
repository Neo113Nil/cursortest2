package h0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f2445a;

    /* renamed from: b, reason: collision with root package name */
    public int f2446b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2447c;
    public Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2448e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2450g;

    public Z(RecyclerView recyclerView) {
        this.f2450g = recyclerView;
        U.d dVar = RecyclerView.f1625E0;
        this.d = dVar;
        this.f2448e = false;
        this.f2449f = false;
        this.f2447c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.f2450g;
        recyclerView.setScrollState(2);
        this.f2446b = 0;
        this.f2445a = 0;
        Interpolator interpolator = this.d;
        U.d dVar = RecyclerView.f1625E0;
        if (interpolator != dVar) {
            this.d = dVar;
            this.f2447c = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f2447c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f2448e) {
            this.f2449f = true;
            return;
        }
        RecyclerView recyclerView = this.f2450g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = L.T.f490a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f2450g;
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
            interpolator = RecyclerView.f1625E0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f2447c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2446b = 0;
        this.f2445a = 0;
        recyclerView.setScrollState(2);
        this.f2447c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f2450g;
        if (recyclerView.f1672m == null) {
            recyclerView.removeCallbacks(this);
            this.f2447c.abortAnimation();
            return;
        }
        this.f2449f = false;
        this.f2448e = true;
        recyclerView.p();
        OverScroller overScroller = this.f2447c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f2445a;
            int i6 = currY - this.f2446b;
            this.f2445a = currX;
            this.f2446b = currY;
            int o2 = RecyclerView.o(i5, recyclerView.f1634F, recyclerView.f1635H, recyclerView.getWidth());
            int o3 = RecyclerView.o(i6, recyclerView.G, recyclerView.f1636I, recyclerView.getHeight());
            int[] iArr = recyclerView.f1680q0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u2 = recyclerView.u(o2, o3, iArr, null, 1);
            int[] iArr2 = recyclerView.f1680q0;
            if (u2) {
                o2 -= iArr2[0];
                o3 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o2, o3);
            }
            if (recyclerView.f1671l != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.d0(o2, o3, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = o2 - i7;
                int i10 = o3 - i8;
                C0140w c0140w = recyclerView.f1672m.f2399e;
                if (c0140w != null && !c0140w.d && c0140w.f2628e) {
                    int b2 = recyclerView.f1659e0.b();
                    if (b2 == 0) {
                        c0140w.i();
                    } else if (c0140w.f2625a >= b2) {
                        c0140w.f2625a = b2 - 1;
                        c0140w.g(i7, i8);
                    } else {
                        c0140w.g(i7, i8);
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
            if (!recyclerView.f1676o.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1680q0;
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
            C0140w c0140w2 = recyclerView.f1672m.f2399e;
            if ((c0140w2 == null || !c0140w2.d) && z2) {
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
                        if (recyclerView.f1634F.isFinished()) {
                            recyclerView.f1634F.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.z();
                        if (recyclerView.f1635H.isFinished()) {
                            recyclerView.f1635H.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.G.isFinished()) {
                            recyclerView.G.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f1636I.isFinished()) {
                            recyclerView.f1636I.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = L.T.f490a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1623C0) {
                    C0132n c0132n = recyclerView.f1657d0;
                    int[] iArr4 = c0132n.f2586c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0132n.d = 0;
                }
            } else {
                b();
                RunnableC0134p runnableC0134p = recyclerView.f1656c0;
                if (runnableC0134p != null) {
                    runnableC0134p.a(recyclerView, i4, i11);
                }
            }
        }
        C0140w c0140w3 = recyclerView.f1672m.f2399e;
        if (c0140w3 != null && c0140w3.d) {
            c0140w3.g(0, 0);
        }
        this.f2448e = false;
        if (!this.f2449f) {
            recyclerView.setScrollState(0);
            recyclerView.j0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = L.T.f490a;
            recyclerView.postOnAnimation(this);
        }
    }
}
