package f0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f2186a;

    /* renamed from: b, reason: collision with root package name */
    public int f2187b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2188c;
    public Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2189e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2190f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2191g;

    public V(RecyclerView recyclerView) {
        this.f2191g = recyclerView;
        S.d dVar = RecyclerView.f1558u0;
        this.d = dVar;
        this.f2189e = false;
        this.f2190f = false;
        this.f2188c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f2189e) {
            this.f2190f = true;
            return;
        }
        RecyclerView recyclerView = this.f2191g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = K.S.f365a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        int i4;
        RecyclerView recyclerView = this.f2191g;
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
            interpolator = RecyclerView.f1558u0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f2188c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2187b = 0;
        this.f2186a = 0;
        recyclerView.setScrollState(2);
        this.f2188c.startScroll(0, 0, i, i2, i6);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f2191g;
        if (recyclerView.f1600l == null) {
            recyclerView.removeCallbacks(this);
            this.f2188c.abortAnimation();
            return;
        }
        this.f2190f = false;
        this.f2189e = true;
        recyclerView.m();
        OverScroller overScroller = this.f2188c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f2186a;
            int i6 = currY - this.f2187b;
            this.f2186a = currX;
            this.f2187b = currY;
            int[] iArr = recyclerView.f1606o0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean r2 = recyclerView.r(i5, i6, iArr, null, 1);
            int[] iArr2 = recyclerView.f1606o0;
            if (r2) {
                i5 -= iArr2[0];
                i6 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i5, i6);
            }
            if (recyclerView.f1598k != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.X(i5, i6, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = i5 - i7;
                int i10 = i6 - i8;
                C0115v c0115v = recyclerView.f1600l.f2145e;
                if (c0115v != null && !c0115v.d && c0115v.f2354e) {
                    int b2 = recyclerView.f1586c0.b();
                    if (b2 == 0) {
                        c0115v.i();
                    } else if (c0115v.f2351a >= b2) {
                        c0115v.f2351a = b2 - 1;
                        c0115v.g(i7, i8);
                    } else {
                        c0115v.g(i7, i8);
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
            if (!recyclerView.f1602m.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1606o0;
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
            C0115v c0115v2 = recyclerView.f1600l.f2145e;
            if ((c0115v2 == null || !c0115v2.d) && z2) {
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
                        if (recyclerView.f1562D.isFinished()) {
                            recyclerView.f1562D.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.w();
                        if (recyclerView.F.isFinished()) {
                            recyclerView.F.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f1563E.isFinished()) {
                            recyclerView.f1563E.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f1564G.isFinished()) {
                            recyclerView.f1564G.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = K.S.f365a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0107m c0107m = recyclerView.f1584b0;
                int[] iArr4 = c0107m.f2314c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0107m.d = 0;
            } else {
                a();
                RunnableC0109o runnableC0109o = recyclerView.f1582a0;
                if (runnableC0109o != null) {
                    runnableC0109o.a(recyclerView, i4, i11);
                }
            }
        }
        C0115v c0115v3 = recyclerView.f1600l.f2145e;
        if (c0115v3 != null && c0115v3.d) {
            c0115v3.g(0, 0);
        }
        this.f2189e = false;
        if (!this.f2190f) {
            recyclerView.setScrollState(0);
            recyclerView.c0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = K.S.f365a;
            recyclerView.postOnAnimation(this);
        }
    }
}
