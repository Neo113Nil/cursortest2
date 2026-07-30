package t0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C2830Vl;
import java.util.Arrays;
import java.util.WeakHashMap;

/* renamed from: t0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5031O implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public int f40607n;

    /* renamed from: u, reason: collision with root package name */
    public int f40608u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f40609v;

    /* renamed from: w, reason: collision with root package name */
    public Interpolator f40610w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f40611x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f40612y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f40613z;

    public RunnableC5031O(RecyclerView recyclerView) {
        this.f40613z = recyclerView;
        G0.b bVar = RecyclerView.f5322a1;
        this.f40610w = bVar;
        this.f40611x = false;
        this.f40612y = false;
        this.f40609v = new OverScroller(recyclerView.getContext(), bVar);
    }

    public final void a() {
        if (this.f40611x) {
            this.f40612y = true;
            return;
        }
        RecyclerView recyclerView = this.f40613z;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = O.X.f2240a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i4, int i9, BaseInterpolator baseInterpolator) {
        int i10;
        RecyclerView recyclerView = this.f40613z;
        if (i9 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i4);
            boolean z8 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i4 * i4) + (i * i));
            int width = z8 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i11 = width / 2;
            float f6 = width;
            float f9 = i11;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f6) - 0.5f) * 0.47123894f)) * f9) + f9;
            if (sqrt > 0) {
                i10 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z8) {
                    abs = abs2;
                }
                i10 = (int) (((abs / f6) + 1.0f) * 300.0f);
            }
            i9 = Math.min(i10, 2000);
        }
        int i12 = i9;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f5322a1;
        }
        if (this.f40610w != interpolator) {
            this.f40610w = interpolator;
            this.f40609v = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f40608u = 0;
        this.f40607n = 0;
        recyclerView.setScrollState(2);
        this.f40609v.startScroll(0, 0, i, i4, i12);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i4;
        int i9;
        int i10;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f40613z;
        if (recyclerView.f5330E == null) {
            recyclerView.removeCallbacks(this);
            this.f40609v.abortAnimation();
            return;
        }
        this.f40612y = false;
        this.f40611x = true;
        recyclerView.m();
        OverScroller overScroller = this.f40609v;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i11 = currX - this.f40607n;
            int i12 = currY - this.f40608u;
            this.f40607n = currX;
            this.f40608u = currY;
            int[] iArr = recyclerView.f5362U0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r9 = recyclerView.r(i11, i12, 1, iArr, null);
            int[] iArr2 = recyclerView.f5362U0;
            if (r9) {
                i = i11 - iArr2[0];
                i4 = i12 - iArr2[1];
            } else {
                i = i11;
                i4 = i12;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i, i4);
            }
            if (recyclerView.f5328D != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.X(i, i4, iArr2);
                i9 = iArr2[0];
                i10 = iArr2[1];
                i -= i9;
                i4 -= i10;
                C5056s c5056s = recyclerView.f5330E.f40566e;
                if (c5056s != null && !c5056s.f40782d && c5056s.f40783e) {
                    int b9 = recyclerView.f5339I0.b();
                    if (b9 == 0) {
                        c5056s.i();
                    } else if (c5056s.f40779a >= b9) {
                        c5056s.f40779a = b9 - 1;
                        c5056s.g(i9, i10);
                    } else {
                        c5056s.g(i9, i10);
                    }
                }
            } else {
                i9 = 0;
                i10 = 0;
            }
            if (!recyclerView.f5332F.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f5362U0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.s(i9, i10, i, i4, null, 1, iArr3);
            int i13 = i - iArr2[0];
            int i14 = i4 - iArr2[1];
            if (i9 != 0 || i10 != 0) {
                recyclerView.t(i9, i10);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z8 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i13 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i14 != 0));
            C5056s c5056s2 = recyclerView.f5330E.f40566e;
            if ((c5056s2 == null || !c5056s2.f40782d) && z8) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i15 = i13 < 0 ? -currVelocity : i13 > 0 ? currVelocity : 0;
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i15 < 0) {
                        recyclerView.v();
                        if (recyclerView.f5365W.isFinished()) {
                            recyclerView.f5365W.onAbsorb(-i15);
                        }
                    } else if (i15 > 0) {
                        recyclerView.w();
                        if (recyclerView.f5370o0.isFinished()) {
                            recyclerView.f5370o0.onAbsorb(i15);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f5369n0.isFinished()) {
                            recyclerView.f5369n0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f5371p0.isFinished()) {
                            recyclerView.f5371p0.onAbsorb(currVelocity);
                        }
                    }
                    if (i15 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = O.X.f2240a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C2830Vl c2830Vl = recyclerView.f5337H0;
                int[] iArr4 = c2830Vl.f28296c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c2830Vl.f28297d = 0;
            } else {
                a();
                RunnableC5050m runnableC5050m = recyclerView.f5335G0;
                if (runnableC5050m != null) {
                    runnableC5050m.a(recyclerView, i9, i10);
                }
            }
        }
        C5056s c5056s3 = recyclerView.f5330E.f40566e;
        if (c5056s3 != null && c5056s3.f40782d) {
            c5056s3.g(0, 0);
        }
        this.f40611x = false;
        if (!this.f40612y) {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = O.X.f2240a;
            recyclerView.postOnAnimation(this);
        }
    }
}
