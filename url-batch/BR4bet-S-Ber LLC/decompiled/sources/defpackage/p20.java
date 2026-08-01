package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p20 implements Runnable {
    public int f;
    public int g;
    public OverScroller h;
    public Interpolator i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ RecyclerView l;

    public p20(RecyclerView recyclerView) {
        this.l = recyclerView;
        r10 r10Var = RecyclerView.F0;
        this.i = r10Var;
        this.j = false;
        this.k = false;
        this.h = new OverScroller(recyclerView.getContext(), r10Var);
    }

    public final void a() {
        if (this.j) {
            this.k = true;
            return;
        }
        RecyclerView recyclerView = this.l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = ic0.a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.l;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.F0;
        }
        if (this.i != interpolator) {
            this.i = interpolator;
            this.h = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.g = 0;
        this.f = 0;
        recyclerView.setScrollState(2);
        this.h.startScroll(0, 0, i, i2, i4);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.l;
        int[] iArr = recyclerView.w0;
        if (recyclerView.r == null) {
            recyclerView.removeCallbacks(this);
            this.h.abortAnimation();
            return;
        }
        this.k = false;
        this.j = true;
        recyclerView.m();
        OverScroller overScroller = this.h;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f;
            int i6 = currY - this.g;
            this.f = currX;
            this.g = currY;
            int[] iArr2 = recyclerView.w0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.r(i5, i6, 1, iArr2, null)) {
                i = i5 - iArr[0];
                i2 = i6 - iArr[1];
            } else {
                i = i5;
                i2 = i6;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i2);
            }
            if (recyclerView.q != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.Y(i, i2, iArr);
                i3 = iArr[0];
                i4 = iArr[1];
                i -= i3;
                i2 -= i4;
                xs xsVar = recyclerView.r.e;
                if (xsVar != null && !xsVar.d && xsVar.e) {
                    int b = recyclerView.k0.b();
                    if (b == 0) {
                        xsVar.i();
                    } else if (xsVar.a >= b) {
                        xsVar.a = b - 1;
                        xsVar.g(i3, i4);
                    } else {
                        xsVar.g(i3, i4);
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.t.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.w0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i3, i4, i, i2, null, 1, iArr3);
            int i7 = i - iArr[0];
            int i8 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.t(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
            xs xsVar2 = recyclerView.r.e;
            if ((xsVar2 == null || !xsVar2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                    if (i8 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i8 <= 0) {
                        currVelocity = 0;
                    }
                    if (i9 < 0) {
                        recyclerView.v();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(-i9);
                        }
                    } else if (i9 > 0) {
                        recyclerView.w();
                        if (recyclerView.N.isFinished()) {
                            recyclerView.N.onAbsorb(i9);
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
                    if (i9 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = ic0.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                ro roVar = recyclerView.j0;
                int[] iArr4 = (int[]) roVar.d;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                roVar.c = 0;
            } else {
                a();
                to toVar = recyclerView.i0;
                if (toVar != null) {
                    toVar.a(recyclerView, i3, i4);
                }
            }
        }
        xs xsVar3 = recyclerView.r.e;
        if (xsVar3 != null && xsVar3.d) {
            xsVar3.g(0, 0);
        }
        this.j = false;
        if (!this.k) {
            recyclerView.setScrollState(0);
            recyclerView.d0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = ic0.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
