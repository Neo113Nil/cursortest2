package f1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public int f1296f;

    /* renamed from: g, reason: collision with root package name */
    public int f1297g;

    /* renamed from: h, reason: collision with root package name */
    public OverScroller f1298h;
    public Interpolator i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1299j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1300k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1301l;

    public a1(RecyclerView recyclerView) {
        this.f1301l = recyclerView;
        b0 b0Var = RecyclerView.F0;
        this.i = b0Var;
        this.f1299j = false;
        this.f1300k = false;
        this.f1298h = new OverScroller(recyclerView.getContext(), b0Var);
    }

    public final void a() {
        if (this.f1299j) {
            this.f1300k = true;
            return;
        }
        RecyclerView recyclerView = this.f1301l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = n0.l0.f2757a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i4, int i5, Interpolator interpolator) {
        RecyclerView recyclerView = this.f1301l;
        if (i5 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i4);
            boolean z3 = abs > abs2;
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z3) {
                abs = abs2;
            }
            i5 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i6 = i5;
        if (interpolator == null) {
            interpolator = RecyclerView.F0;
        }
        if (this.i != interpolator) {
            this.i = interpolator;
            this.f1298h = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f1297g = 0;
        this.f1296f = 0;
        recyclerView.setScrollState(2);
        this.f1298h.startScroll(0, 0, i, i4, i6);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i4;
        int i5;
        int i6;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f1301l;
        int[] iArr = recyclerView.f696w0;
        if (recyclerView.f685r == null) {
            recyclerView.removeCallbacks(this);
            this.f1298h.abortAnimation();
            return;
        }
        this.f1300k = false;
        this.f1299j = true;
        recyclerView.m();
        OverScroller overScroller = this.f1298h;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i7 = currX - this.f1296f;
            int i8 = currY - this.f1297g;
            this.f1296f = currX;
            this.f1297g = currY;
            int[] iArr2 = recyclerView.f696w0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.r(i7, i8, 1, iArr2, null)) {
                i = i7 - iArr[0];
                i4 = i8 - iArr[1];
            } else {
                i = i7;
                i4 = i8;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i4);
            }
            if (recyclerView.f683q != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.Y(i, i4, iArr);
                i5 = iArr[0];
                i6 = iArr[1];
                i -= i5;
                i4 -= i6;
                w wVar = recyclerView.f685r.f1447e;
                if (wVar != null && !wVar.d && wVar.f1518e) {
                    int b4 = recyclerView.f672k0.b();
                    if (b4 == 0) {
                        wVar.i();
                    } else if (wVar.f1515a >= b4) {
                        wVar.f1515a = b4 - 1;
                        wVar.g(i5, i6);
                    } else {
                        wVar.g(i5, i6);
                    }
                }
            } else {
                i5 = 0;
                i6 = 0;
            }
            if (!recyclerView.f689t.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f696w0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i5, i6, i, i4, null, 1, iArr3);
            int i9 = i - iArr[0];
            int i10 = i4 - iArr[1];
            if (i5 != 0 || i6 != 0) {
                recyclerView.t(i5, i6);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i9 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i10 != 0));
            w wVar2 = recyclerView.f685r.f1447e;
            if ((wVar2 == null || !wVar2.d) && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i11 = i9 < 0 ? -currVelocity : i9 > 0 ? currVelocity : 0;
                    if (i10 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i10 <= 0) {
                        currVelocity = 0;
                    }
                    if (i11 < 0) {
                        recyclerView.v();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(-i11);
                        }
                    } else if (i11 > 0) {
                        recyclerView.w();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(i11);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.M.isFinished()) {
                            recyclerView.M.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.O.isFinished()) {
                            recyclerView.O.onAbsorb(currVelocity);
                        }
                    }
                    if (i11 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = n0.l0.f2757a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                n nVar = recyclerView.f670j0;
                int[] iArr4 = nVar.f1459c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                nVar.d = 0;
            } else {
                a();
                p pVar = recyclerView.i0;
                if (pVar != null) {
                    pVar.a(recyclerView, i5, i6);
                }
            }
        }
        w wVar3 = recyclerView.f685r.f1447e;
        if (wVar3 != null && wVar3.d) {
            wVar3.g(0, 0);
        }
        this.f1299j = false;
        if (!this.f1300k) {
            recyclerView.setScrollState(0);
            recyclerView.d0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = n0.l0.f2757a;
            recyclerView.postOnAnimation(this);
        }
    }
}
