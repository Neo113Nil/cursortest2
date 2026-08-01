package g0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f2329a;

    /* renamed from: b, reason: collision with root package name */
    public int f2330b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2331c;
    public Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2332e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2334g;

    public b0(RecyclerView recyclerView) {
        this.f2334g = recyclerView;
        T.d dVar = RecyclerView.f1534H0;
        this.d = dVar;
        this.f2332e = false;
        this.f2333f = false;
        this.f2331c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.f2334g;
        recyclerView.setScrollState(2);
        this.f2330b = 0;
        this.f2329a = 0;
        Interpolator interpolator = this.d;
        T.d dVar = RecyclerView.f1534H0;
        if (interpolator != dVar) {
            this.d = dVar;
            this.f2331c = new OverScroller(recyclerView.getContext(), dVar);
        }
        this.f2331c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f2332e) {
            this.f2333f = true;
            return;
        }
        RecyclerView recyclerView = this.f2334g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = K.T.f423a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        RecyclerView recyclerView = this.f2334g;
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
            interpolator = RecyclerView.f1534H0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.f2331c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2330b = 0;
        this.f2329a = 0;
        recyclerView.setScrollState(2);
        this.f2331c.startScroll(0, 0, i, i2, i4);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f2334g;
        if (recyclerView.f1580n == null) {
            recyclerView.removeCallbacks(this);
            this.f2331c.abortAnimation();
            return;
        }
        this.f2333f = false;
        this.f2332e = true;
        recyclerView.p();
        OverScroller overScroller = this.f2331c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f2329a;
            int i6 = currY - this.f2330b;
            this.f2329a = currX;
            this.f2330b = currY;
            int o2 = RecyclerView.o(i5, recyclerView.f1542H, recyclerView.f1544J, recyclerView.getWidth());
            int o3 = RecyclerView.o(i6, recyclerView.f1543I, recyclerView.f1545K, recyclerView.getHeight());
            int[] iArr = recyclerView.f1590s0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u2 = recyclerView.u(o2, o3, iArr, null, 1);
            int[] iArr2 = recyclerView.f1590s0;
            if (u2) {
                o2 -= iArr2[0];
                o3 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o2, o3);
            }
            if (recyclerView.f1578m != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.e0(o2, o3, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = o2 - i7;
                int i10 = o3 - i8;
                C0137x c0137x = recyclerView.f1580n.f2278e;
                if (c0137x != null && !c0137x.d && c0137x.f2500e) {
                    int b2 = recyclerView.f1570g0.b();
                    if (b2 == 0) {
                        c0137x.i();
                    } else if (c0137x.f2497a >= b2) {
                        c0137x.f2497a = b2 - 1;
                        c0137x.g(i7, i8);
                    } else {
                        c0137x.g(i7, i8);
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
            if (!recyclerView.f1583p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f1590s0;
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
            C0137x c0137x2 = recyclerView.f1580n.f2278e;
            if ((c0137x2 == null || !c0137x2.d) && z2) {
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
                        if (recyclerView.f1542H.isFinished()) {
                            recyclerView.f1542H.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.z();
                        if (recyclerView.f1544J.isFinished()) {
                            recyclerView.f1544J.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.f1543I.isFinished()) {
                            recyclerView.f1543I.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.f1545K.isFinished()) {
                            recyclerView.f1545K.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = K.T.f423a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f1532F0) {
                    C0129o c0129o = recyclerView.f1568f0;
                    int[] iArr4 = c0129o.f2460c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0129o.d = 0;
                }
            } else {
                b();
                RunnableC0131q runnableC0131q = recyclerView.f1566e0;
                if (runnableC0131q != null) {
                    runnableC0131q.a(recyclerView, i4, i11);
                }
            }
        }
        C0137x c0137x3 = recyclerView.f1580n.f2278e;
        if (c0137x3 != null && c0137x3.d) {
            c0137x3.g(0, 0);
        }
        this.f2332e = false;
        if (!this.f2333f) {
            recyclerView.setScrollState(0);
            recyclerView.k0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = K.T.f423a;
            recyclerView.postOnAnimation(this);
        }
    }
}
