package e0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f2164a;

    /* renamed from: b, reason: collision with root package name */
    public int f2165b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2166c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f2167d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2168e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2170g;

    public W(RecyclerView recyclerView) {
        this.f2170g = recyclerView;
        S.d dVar = RecyclerView.f1543u0;
        this.f2167d = dVar;
        this.f2168e = false;
        this.f2169f = false;
        this.f2166c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f2168e) {
            this.f2169f = true;
            return;
        }
        RecyclerView recyclerView = this.f2170g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = K.X.f419a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        int i4;
        RecyclerView recyclerView = this.f2170g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i5 = width / 2;
            float f2 = width;
            float f3 = i5;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i4 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i4, 2000);
        }
        int i6 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f1543u0;
        }
        if (this.f2167d != interpolator) {
            this.f2167d = interpolator;
            this.f2166c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2165b = 0;
        this.f2164a = 0;
        recyclerView.setScrollState(2);
        this.f2166c.startScroll(0, 0, i, i2, i6);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f2170g;
        if (recyclerView.f1585l == null) {
            recyclerView.removeCallbacks(this);
            this.f2166c.abortAnimation();
            return;
        }
        this.f2169f = false;
        this.f2168e = true;
        recyclerView.m();
        OverScroller overScroller = this.f2166c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f2164a;
            int i6 = currY - this.f2165b;
            this.f2164a = currX;
            this.f2165b = currY;
            int[] iArr = recyclerView.f1591o0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r2 = recyclerView.r(i5, i6, iArr, null, 1);
            int[] iArr2 = recyclerView.f1591o0;
            if (r2) {
                i5 -= iArr2[0];
                i6 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i5, i6);
            }
            if (recyclerView.f1583k != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.X(i5, i6, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = i5 - i7;
                int i10 = i6 - i8;
                C0134v c0134v = recyclerView.f1585l.f2118e;
                if (c0134v != null && !c0134v.f2356d && c0134v.f2357e) {
                    int b2 = recyclerView.f1571c0.b();
                    if (b2 == 0) {
                        c0134v.i();
                    } else if (c0134v.f2353a >= b2) {
                        c0134v.f2353a = b2 - 1;
                        c0134v.g(i7, i8);
                    } else {
                        c0134v.g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f1587m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1591o0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.s(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.t(i4, i11);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C0134v c0134v2 = recyclerView.f1585l.f2118e;
            if ((c0134v2 == null || !c0134v2.f2356d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.v();
                        if (recyclerView.f1547D.isFinished()) {
                            recyclerView.f1547D.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.w();
                        if (recyclerView.F.isFinished()) {
                            recyclerView.F.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f1548E.isFinished()) {
                            recyclerView.f1548E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f1549G.isFinished()) {
                            recyclerView.f1549G.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = K.X.f419a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0126m c0126m = recyclerView.f1569b0;
                int[] iArr4 = c0126m.f2309c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0126m.f2310d = 0;
            } else {
                a();
                RunnableC0128o runnableC0128o = recyclerView.f1567a0;
                if (runnableC0128o != null) {
                    runnableC0128o.a(recyclerView, i4, i11);
                }
            }
        }
        C0134v c0134v3 = recyclerView.f1585l.f2118e;
        if (c0134v3 != null && c0134v3.f2356d) {
            c0134v3.g(0, 0);
        }
        this.f2168e = false;
        if (!this.f2169f) {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = K.X.f419a;
            recyclerView.postOnAnimation(this);
        }
    }
}
