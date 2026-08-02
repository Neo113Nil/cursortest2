package defpackage;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lo implements Runnable {
    public OverScroller a;
    Interpolator b;
    final /* synthetic */ RecyclerView c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public lo(RecyclerView recyclerView) {
        this.c = recyclerView;
        Interpolator interpolator = RecyclerView.c;
        this.b = interpolator;
        this.f = false;
        this.g = false;
        this.a = new OverScroller(recyclerView.getContext(), interpolator);
    }

    private final void e() {
        RecyclerView recyclerView = this.c;
        recyclerView.removeCallbacks(this);
        int i = yq.a;
        recyclerView.postOnAnimation(this);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.c;
        recyclerView.Z(2);
        this.e = 0;
        this.d = 0;
        Interpolator interpolator = this.b;
        Interpolator interpolator2 = RecyclerView.c;
        if (interpolator != interpolator2) {
            this.b = interpolator2;
            this.a = new OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    final void b() {
        if (this.f) {
            this.g = true;
        } else {
            e();
        }
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = this.c;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (true != z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.c;
        }
        if (this.b != interpolator) {
            this.b = interpolator;
            this.a = new OverScroller(this.c.getContext(), interpolator);
        }
        this.e = 0;
        this.d = 0;
        this.c.Z(2);
        this.a.startScroll(0, 0, i, i2, i4);
        b();
    }

    public final void d() {
        this.c.removeCallbacks(this);
        this.a.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        boolean z;
        ll llVar;
        RecyclerView recyclerView = this.c;
        if (recyclerView.m == null) {
            d();
            return;
        }
        this.g = false;
        this.f = true;
        recyclerView.x();
        OverScroller overScroller = this.a;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.d;
            int i6 = currY - this.e;
            this.d = currX;
            this.e = currY;
            int am = RecyclerView.am(i5, recyclerView.y, recyclerView.A, recyclerView.getWidth());
            int am2 = RecyclerView.am(i6, recyclerView.z, recyclerView.B, recyclerView.getHeight());
            int[] iArr = recyclerView.R;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.ag(am, am2, iArr, null, 1)) {
                am -= iArr[0];
                am2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.w(am, am2);
            }
            if (recyclerView.l != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.U(am, am2, iArr);
                int i7 = iArr[0];
                i3 = iArr[1];
                am -= i7;
                int i8 = am2 - i3;
                ll llVar2 = recyclerView.m.t;
                if (llVar2 != null && !llVar2.e && llVar2.f) {
                    int a = recyclerView.M.a();
                    if (a == 0) {
                        llVar2.f();
                    } else if (llVar2.b >= a) {
                        llVar2.b = a - 1;
                        llVar2.e(i7, i3);
                    } else {
                        llVar2.e(i7, i3);
                    }
                }
                i = i8;
                i2 = i7;
            } else {
                i = am2;
                i2 = 0;
                i3 = 0;
            }
            if (!recyclerView.o.isEmpty()) {
                recyclerView.invalidate();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int i9 = am;
            int i10 = i2;
            int i11 = i3;
            recyclerView.B(i10, i11, i9, i, null, 1, iArr);
            int i12 = i;
            int i13 = i9 - iArr[0];
            int i14 = i12 - iArr[1];
            if (i10 == 0) {
                if (i11 != 0) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    i4 = 0;
                    awakenScrollBars = recyclerView.awakenScrollBars();
                    if (!awakenScrollBars) {
                        recyclerView.invalidate();
                    }
                    int currX2 = overScroller.getCurrX();
                    int finalX = overScroller.getFinalX();
                    int currY2 = overScroller.getCurrY();
                    int finalY = overScroller.getFinalY();
                    if (!overScroller.isFinished()) {
                        if (currX2 != finalX && i13 == 0) {
                            z = false;
                            i13 = 0;
                        } else if (currY2 != finalY && i14 == 0) {
                            z = false;
                            i14 = 0;
                        }
                        llVar = recyclerView.m.t;
                        if (!(llVar == null && llVar.e) && z) {
                            if (recyclerView.getOverScrollMode() != 2) {
                                int currVelocity = (int) overScroller.getCurrVelocity();
                                int i15 = i13 < 0 ? -currVelocity : i13 > 0 ? currVelocity : 0;
                                if (i14 < 0) {
                                    currVelocity = -currVelocity;
                                } else if (i14 <= 0) {
                                    currVelocity = 0;
                                }
                                if (i15 < 0) {
                                    recyclerView.E();
                                    if (recyclerView.y.isFinished()) {
                                        recyclerView.y.onAbsorb(-i15);
                                    }
                                } else if (i15 > 0) {
                                    recyclerView.F();
                                    if (recyclerView.A.isFinished()) {
                                        recyclerView.A.onAbsorb(i15);
                                    }
                                }
                                if (currVelocity < 0) {
                                    recyclerView.G();
                                    if (recyclerView.z.isFinished()) {
                                        recyclerView.z.onAbsorb(-currVelocity);
                                    }
                                } else if (currVelocity > 0) {
                                    recyclerView.D();
                                    if (recyclerView.B.isFinished()) {
                                        recyclerView.B.onAbsorb(currVelocity);
                                    }
                                }
                                if (i15 != 0 || currVelocity != 0) {
                                    recyclerView.postInvalidateOnAnimation();
                                }
                            }
                            recyclerView.L.b();
                        } else {
                            b();
                            jx jxVar = recyclerView.K;
                            if (jxVar != null) {
                                jxVar.a(recyclerView, i10, i4);
                            }
                        }
                        if (Build.VERSION.SDK_INT >= 35) {
                            kt.m(recyclerView, Math.abs(overScroller.getCurrVelocity()));
                        }
                    }
                    z = true;
                    llVar = recyclerView.m.t;
                    if (llVar == null) {
                    }
                    if (recyclerView.getOverScrollMode() != 2) {
                    }
                    recyclerView.L.b();
                    if (Build.VERSION.SDK_INT >= 35) {
                    }
                }
            }
            recyclerView.C(i10, i11);
            i4 = i11;
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
            }
            int currX22 = overScroller.getCurrX();
            int finalX2 = overScroller.getFinalX();
            int currY22 = overScroller.getCurrY();
            int finalY2 = overScroller.getFinalY();
            if (!overScroller.isFinished()) {
            }
            z = true;
            llVar = recyclerView.m.t;
            if (llVar == null) {
            }
            if (recyclerView.getOverScrollMode() != 2) {
            }
            recyclerView.L.b();
            if (Build.VERSION.SDK_INT >= 35) {
            }
        }
        ll llVar3 = recyclerView.m.t;
        if (llVar3 != null && llVar3.e) {
            llVar3.e(0, 0);
        }
        this.f = false;
        if (this.g) {
            e();
        } else {
            recyclerView.Z(0);
            recyclerView.ad(1);
        }
    }
}
