package b1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public int f738f;
    public int g;
    public OverScroller h;

    /* renamed from: i, reason: collision with root package name */
    public Interpolator f739i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f740j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f741k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f742l;

    public b1(RecyclerView recyclerView) {
        this.f742l = recyclerView;
        c0 c0Var = RecyclerView.F0;
        this.f739i = c0Var;
        this.f740j = false;
        this.f741k = false;
        this.h = new OverScroller(recyclerView.getContext(), c0Var);
    }

    public final void a() {
        if (this.f740j) {
            this.f741k = true;
            return;
        }
        RecyclerView recyclerView = this.f742l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = k0.j0.f2752a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i4, int i5, int i6, Interpolator interpolator) {
        RecyclerView recyclerView = this.f742l;
        if (i6 == Integer.MIN_VALUE) {
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i5);
            boolean z3 = abs > abs2;
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z3) {
                abs = abs2;
            }
            i6 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i7 = i6;
        if (interpolator == null) {
            interpolator = RecyclerView.F0;
        }
        if (this.f739i != interpolator) {
            this.f739i = interpolator;
            this.h = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.g = 0;
        this.f738f = 0;
        recyclerView.setScrollState(2);
        this.h.startScroll(0, 0, i4, i5, i7);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f742l;
        int[] iArr = recyclerView.f664w0;
        if (recyclerView.f653r == null) {
            recyclerView.removeCallbacks(this);
            this.h.abortAnimation();
            return;
        }
        this.f741k = false;
        this.f740j = true;
        recyclerView.m();
        OverScroller overScroller = this.h;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i8 = currX - this.f738f;
            int i9 = currY - this.g;
            this.f738f = currX;
            this.g = currY;
            int[] iArr2 = recyclerView.f664w0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.r(i8, i9, 1, iArr2, null)) {
                i4 = i8 - iArr[0];
                i5 = i9 - iArr[1];
            } else {
                i4 = i8;
                i5 = i9;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i4, i5);
            }
            if (recyclerView.f651q != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.Y(i4, i5, iArr);
                i6 = iArr[0];
                i7 = iArr[1];
                i4 -= i6;
                i5 -= i7;
                x xVar = recyclerView.f653r.f877e;
                if (xVar != null && !xVar.f938d && xVar.f939e) {
                    int b2 = recyclerView.f640k0.b();
                    if (b2 == 0) {
                        xVar.i();
                    } else if (xVar.f936a >= b2) {
                        xVar.f936a = b2 - 1;
                        xVar.g(i6, i7);
                    } else {
                        xVar.g(i6, i7);
                    }
                }
            } else {
                i6 = 0;
                i7 = 0;
            }
            if (!recyclerView.f657t.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f664w0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i6, i7, i4, i5, null, 1, iArr3);
            int i10 = i4 - iArr[0];
            int i11 = i5 - iArr[1];
            if (i6 != 0 || i7 != 0) {
                recyclerView.t(i6, i7);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
            x xVar2 = recyclerView.f653r.f877e;
            if ((xVar2 == null || !xVar2.f938d) && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i12 = i10 < 0 ? -currVelocity : i10 > 0 ? currVelocity : 0;
                    if (i11 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i11 <= 0) {
                        currVelocity = 0;
                    }
                    if (i12 < 0) {
                        recyclerView.v();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(-i12);
                        }
                    } else if (i12 > 0) {
                        recyclerView.w();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(i12);
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
                    if (i12 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = k0.j0.f2752a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                o oVar = recyclerView.f638j0;
                int[] iArr4 = oVar.c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                oVar.f888d = 0;
            } else {
                a();
                q qVar = recyclerView.f636i0;
                if (qVar != null) {
                    qVar.a(recyclerView, i6, i7);
                }
            }
        }
        x xVar3 = recyclerView.f653r.f877e;
        if (xVar3 != null && xVar3.f938d) {
            xVar3.g(0, 0);
        }
        this.f740j = false;
        if (!this.f741k) {
            recyclerView.setScrollState(0);
            recyclerView.d0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = k0.j0.f2752a;
            recyclerView.postOnAnimation(this);
        }
    }
}
