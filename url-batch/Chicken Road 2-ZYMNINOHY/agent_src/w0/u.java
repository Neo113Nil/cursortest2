package w0;

import W.AbstractC0108a;
import W.J;
import a.AbstractC0124a;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final k f15896a;

    /* renamed from: b, reason: collision with root package name */
    public final C1486A f15897b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15898c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15899d;

    /* renamed from: g, reason: collision with root package name */
    public long f15902g;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15905j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15908m;
    public boolean n;

    /* renamed from: e, reason: collision with root package name */
    public int f15900e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f15901f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    public long f15903h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f15904i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public float f15906k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    public W.D f15907l = W.D.f3254a;

    public u(Context context, k kVar, long j4) {
        this.f15896a = kVar;
        this.f15898c = j4;
        this.f15897b = new C1486A(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x015a, code lost:
    
        if (r3 > 100000) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x016a, code lost:
    
        if (r33 >= r37) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0080, code lost:
    
        if ((r9 == 0 ? false : r7.f15791g[(int) ((r9 - 1) % 15)]) != false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(long j4, long j5, long j6, long j7, boolean z, boolean z4, S0.b bVar) {
        long j8;
        long j9;
        long j10;
        int i4;
        int i5;
        boolean z5;
        int i6;
        long j11;
        int i7;
        long j12;
        long j13;
        long j14;
        float f4;
        float f5;
        long j15;
        bVar.f2396a = -9223372036854775807L;
        bVar.f2397b = -9223372036854775807L;
        if (this.f15899d && this.f15901f == -9223372036854775807L) {
            this.f15901f = j5;
        }
        if (this.f15903h != j4) {
            C1486A c1486a = this.f15897b;
            j8 = -9223372036854775807L;
            long j16 = c1486a.n;
            if (j16 != -1) {
                c1486a.f15751q = j16;
                c1486a.f15752r = c1486a.o;
                c1486a.f15753s = c1486a.f15750p;
                c1486a.f15747k = c1486a.f15748l;
            }
            c1486a.f15749m++;
            C1498e c1498e = c1486a.f15737a;
            j9 = 1000;
            long j17 = j4 * 1000;
            c1498e.f15793a.b(j17);
            if (c1498e.f15793a.a()) {
                c1498e.f15795c = false;
                j10 = 0;
            } else {
                j10 = 0;
                if (c1498e.f15796d != -9223372036854775807L) {
                    if (c1498e.f15795c) {
                        C1497d c1497d = c1498e.f15794b;
                        long j18 = c1497d.f15788d;
                    }
                    c1498e.f15794b.c();
                    c1498e.f15794b.b(c1498e.f15796d);
                    c1498e.f15795c = true;
                    c1498e.f15794b.b(j17);
                }
            }
            if (c1498e.f15795c && c1498e.f15794b.a()) {
                C1497d c1497d2 = c1498e.f15793a;
                c1498e.f15793a = c1498e.f15794b;
                c1498e.f15794b = c1497d2;
                c1498e.f15795c = false;
            }
            c1498e.f15796d = j17;
            c1498e.f15797e = c1498e.f15793a.a() ? 0 : c1498e.f15797e + 1;
            c1486a.c();
            this.f15903h = j4;
        } else {
            j8 = -9223372036854775807L;
            j9 = 1000;
            j10 = 0;
        }
        long j19 = (long) ((j4 - j5) / this.f15906k);
        if (this.f15899d) {
            this.f15907l.getClass();
            j19 -= J.M(SystemClock.elapsedRealtime()) - j6;
        }
        bVar.f2396a = j19;
        if (!z || z4) {
            if (this.f15908m) {
                if (this.f15904i == j8 || this.f15905j) {
                    int i8 = this.f15900e;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            i4 = 3;
                            i5 = 5;
                        } else if (i8 == 2) {
                            i4 = 3;
                            i5 = 5;
                        } else {
                            if (i8 != 3) {
                                throw new IllegalStateException();
                            }
                            this.f15907l.getClass();
                            i4 = 3;
                            i5 = 5;
                            long M4 = J.M(SystemClock.elapsedRealtime()) - this.f15902g;
                            if (this.f15899d) {
                                long j20 = this.f15901f;
                                if (j20 != j8) {
                                    if (j20 != j5) {
                                        if (j19 < -30000) {
                                        }
                                    }
                                }
                            }
                        }
                        z5 = true;
                    } else {
                        i4 = 3;
                        i5 = 5;
                        z5 = this.f15899d;
                    }
                    if (!z5) {
                        return 0;
                    }
                    if (this.f15899d && j5 != this.f15901f) {
                        this.f15907l.getClass();
                        long nanoTime = System.nanoTime();
                        C1486A c1486a2 = this.f15897b;
                        long j21 = (bVar.f2396a * j9) + nanoTime;
                        if (c1486a2.f15751q != -1) {
                            if (c1486a2.f15737a.f15793a.a()) {
                                C1498e c1498e2 = c1486a2.f15737a;
                                if (c1498e2.f15793a.a()) {
                                    C1497d c1497d3 = c1498e2.f15793a;
                                    j11 = -30000;
                                    long j22 = c1497d3.f15789e;
                                    i6 = 1;
                                    j15 = j22 == j10 ? j10 : c1497d3.f15790f / j22;
                                } else {
                                    i6 = 1;
                                    j11 = -30000;
                                    j15 = j8;
                                }
                                i7 = 2;
                                f4 = (c1486a2.f15749m - c1486a2.f15751q) * j15;
                                f5 = c1486a2.f15745i;
                            } else {
                                i6 = 1;
                                j11 = -30000;
                                i7 = 2;
                                f4 = (j4 - c1486a2.f15753s) * j9;
                                f5 = c1486a2.f15745i;
                            }
                            long j23 = c1486a2.f15752r + ((long) (f4 / f5));
                            if (Math.abs(j21 - j23) <= 20000000) {
                                j21 = j23;
                            } else {
                                c1486a2.b();
                            }
                        } else {
                            i6 = 1;
                            j11 = -30000;
                            i7 = 2;
                        }
                        c1486a2.n = c1486a2.f15749m;
                        c1486a2.o = j21;
                        c1486a2.f15750p = j4;
                        w wVar = c1486a2.f15739c;
                        if (wVar != null) {
                            long j24 = wVar.f15915c;
                            long j25 = c1486a2.f15739c.f15916d;
                            if (j24 != j8 && j25 != j8) {
                                long j26 = (((j21 - j24) / j25) * j25) + j24;
                                if (j21 <= j26) {
                                    j12 = j26 - j25;
                                } else {
                                    j26 += j25;
                                    j12 = j26;
                                }
                                long j27 = j26 - j21;
                                long j28 = j21 - j12;
                                long abs = Math.abs(j27 - j28);
                                if (abs < j25 / 2) {
                                    j14 = j25;
                                    long j29 = j14 / 4;
                                    if (abs < j29) {
                                        j13 = j12;
                                        long j30 = c1486a2.f15747k;
                                        if (j30 != j10) {
                                            c1486a2.f15748l = j30;
                                        } else {
                                            if (j27 < j28) {
                                                j29 = -j29;
                                            }
                                            c1486a2.f15748l = j29;
                                        }
                                    } else {
                                        j13 = j12;
                                        c1486a2.f15748l = j10;
                                    }
                                } else {
                                    j13 = j12;
                                    j14 = j25;
                                    c1486a2.f15748l = c1486a2.f15747k;
                                }
                                if (j27 + c1486a2.f15748l >= j28) {
                                    j26 = j13;
                                }
                                j21 = j26 - ((j14 * 80) / 100);
                            }
                        }
                        bVar.f2397b = j21;
                        long j31 = (j21 - nanoTime) / j9;
                        bVar.f2396a = j31;
                        boolean z6 = (this.f15904i == j8 || this.f15905j) ? 0 : i6;
                        if (this.f15896a.O0(j31, j5, z4, z6)) {
                            return 4;
                        }
                        long j32 = bVar.f2396a;
                        if (((j32 >= j11 || z4) ? 0 : i6) != 0) {
                            return z6 != 0 ? i4 : i7;
                        }
                        if (j32 <= 50000) {
                            return i6;
                        }
                    }
                    return i5;
                }
                i4 = 3;
                i5 = 5;
                z5 = false;
                if (!z5) {
                }
            } else {
                if (this.f15896a.O0(j19, j5, z4, true)) {
                    return 4;
                }
                if (!this.f15899d || bVar.f2396a >= 30000) {
                    this.n = true;
                    return 5;
                }
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.f15900e == 3 || (!this.f15908m && this.n))) {
            this.f15904i = -9223372036854775807L;
            return true;
        }
        if (this.f15904i == -9223372036854775807L) {
            return false;
        }
        this.f15907l.getClass();
        if (SystemClock.elapsedRealtime() < this.f15904i) {
            return true;
        }
        this.f15904i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long j4;
        this.f15905j = z;
        long j5 = this.f15898c;
        if (j5 > 0) {
            this.f15907l.getClass();
            j4 = SystemClock.elapsedRealtime() + j5;
        } else {
            j4 = -9223372036854775807L;
        }
        this.f15904i = j4;
    }

    public final void d() {
        this.f15899d = true;
        this.f15907l.getClass();
        this.f15902g = J.M(SystemClock.elapsedRealtime());
        C1486A c1486a = this.f15897b;
        c1486a.f15740d = true;
        c1486a.b();
        DisplayManager displayManager = (DisplayManager) c1486a.f15738b.getSystemService("display");
        w wVar = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                wVar = Build.VERSION.SDK_INT >= 33 ? new z(choreographer, displayManager) : new x(choreographer, displayManager);
            } catch (RuntimeException e4) {
                AbstractC0108a.t("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
            }
        }
        c1486a.f15739c = wVar;
        if (wVar != null) {
            wVar.a();
        }
        c1486a.d(false);
    }

    public final void e(int i4) {
        if (i4 == 0) {
            this.f15900e = 1;
        } else if (i4 == 1) {
            this.f15900e = 0;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException();
            }
            this.f15900e = Math.min(this.f15900e, 2);
        }
        this.f15897b.b();
    }

    public final void f(float f4) {
        C1486A c1486a = this.f15897b;
        c1486a.f15742f = f4;
        C1498e c1498e = c1486a.f15737a;
        c1498e.f15793a.c();
        c1498e.f15794b.c();
        c1498e.f15795c = false;
        c1498e.f15796d = -9223372036854775807L;
        c1498e.f15797e = 0;
        c1486a.c();
    }

    public final void g(Surface surface) {
        this.f15908m = surface != null;
        this.n = false;
        C1486A c1486a = this.f15897b;
        if (c1486a.f15741e != surface) {
            c1486a.a();
            c1486a.f15741e = surface;
            c1486a.d(true);
        }
        this.f15900e = Math.min(this.f15900e, 1);
    }

    public final void h(float f4) {
        AbstractC0124a.h(f4 > 0.0f);
        if (f4 == this.f15906k) {
            return;
        }
        this.f15906k = f4;
        C1486A c1486a = this.f15897b;
        c1486a.f15745i = f4;
        c1486a.d(false);
    }
}
