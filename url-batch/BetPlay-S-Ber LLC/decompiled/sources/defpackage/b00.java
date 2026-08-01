package defpackage;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class b00 implements Runnable {
    public int f;
    public int g;
    public OverScroller h;
    public Interpolator i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ RecyclerView l;

    public b00(RecyclerView recyclerView) {
        this.l = recyclerView;
        dz dzVar = RecyclerView.F0;
        this.i = dzVar;
        this.j = false;
        this.k = false;
        this.h = new OverScroller(recyclerView.getContext(), dzVar);
    }

    public final void a() {
        if (this.j) {
            this.k = true;
            return;
        }
        RecyclerView recyclerView = this.l;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = e90.a;
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
                wq wqVar = recyclerView.r.e;
                if (wqVar != null && !wqVar.d && wqVar.e) {
                    int b = recyclerView.k0.b();
                    if (b == 0) {
                        wqVar.i();
                    } else if (wqVar.a >= b) {
                        wqVar.a = b - 1;
                        wqVar.g(i3, i4);
                    } else {
                        wqVar.g(i3, i4);
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
            wq wqVar2 = recyclerView.r.e;
            if ((wqVar2 == null || !wqVar2.d) && z) {
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
                        WeakHashMap weakHashMap = e90.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                sm smVar = recyclerView.j0;
                int[] iArr4 = smVar.c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                smVar.d = 0;
            } else {
                a();
                um umVar = recyclerView.i0;
                if (umVar != null) {
                    umVar.a(recyclerView, i3, i4);
                }
            }
        }
        wq wqVar3 = recyclerView.r.e;
        if (wqVar3 != null && wqVar3.d) {
            wqVar3.g(0, 0);
        }
        this.j = false;
        if (!this.k) {
            recyclerView.setScrollState(0);
            recyclerView.d0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = e90.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
