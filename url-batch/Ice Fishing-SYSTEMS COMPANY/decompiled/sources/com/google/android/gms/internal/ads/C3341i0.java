package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3341i0 {

    /* renamed from: a, reason: collision with root package name */
    public final X f31294a;

    /* renamed from: b, reason: collision with root package name */
    public final C3609n0 f31295b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31296c;

    /* renamed from: f, reason: collision with root package name */
    public long f31299f;
    public boolean i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f31304l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31305m;

    /* renamed from: d, reason: collision with root package name */
    public int f31297d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f31298e = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: g, reason: collision with root package name */
    public long f31300g = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: h, reason: collision with root package name */
    public long f31301h = com.anythink.basead.exoplayer.b.f6539b;

    /* renamed from: j, reason: collision with root package name */
    public float f31302j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public T2 f31303k = T2.f27691y;

    public C3341i0(Context context, X x3) {
        this.f31294a = x3;
        this.f31295b = new C3609n0(context);
    }

    public final void a(int i) {
        if (i == 0) {
            this.f31297d = 1;
        } else if (i != 1) {
            this.f31297d = Math.min(this.f31297d, 2);
        } else {
            this.f31297d = 0;
        }
        this.f31295b.a();
    }

    public final void b() {
        this.f31296c = true;
        this.f31303k.getClass();
        this.f31299f = AbstractC3548lu.u(SystemClock.elapsedRealtime());
        C3609n0 c3609n0 = this.f31295b;
        c3609n0.f32788d = true;
        c3609n0.a();
        DisplayManager displayManager = (DisplayManager) c3609n0.f32786b.getSystemService("display");
        AbstractC3447k0 abstractC3447k0 = null;
        if (displayManager != null) {
            try {
                Choreographer choreographer = Choreographer.getInstance();
                abstractC3447k0 = Build.VERSION.SDK_INT >= 33 ? new ChoreographerVsyncCallbackC3555m0(choreographer, displayManager) : new ChoreographerFrameCallbackC3501l0(choreographer, displayManager);
            } catch (RuntimeException e6) {
                AbstractC3217fl.O("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e6);
            }
        }
        c3609n0.f32787c = abstractC3447k0;
        if (abstractC3447k0 != null) {
            abstractC3447k0.a();
        }
        c3609n0.c(false);
    }

    public final void c(Surface surface) {
        this.f31304l = surface != null;
        this.f31305m = false;
        C3609n0 c3609n0 = this.f31295b;
        if (c3609n0.f32789e != surface) {
            c3609n0.d();
            c3609n0.f32789e = surface;
            c3609n0.c(true);
        }
        this.f31297d = Math.min(this.f31297d, 1);
    }

    public final void d(float f6) {
        C3609n0 c3609n0 = this.f31295b;
        c3609n0.f32790f = f6;
        S s3 = c3609n0.f32785a;
        s3.f27462a.a();
        s3.f27463b.a();
        s3.f27464c = false;
        s3.f27465d = com.anythink.basead.exoplayer.b.f6539b;
        s3.f27466e = 0;
        c3609n0.b();
    }

    public final boolean e(boolean z8) {
        if (z8 && (this.f31297d == 3 || (this.f31305m && !this.f31304l))) {
            this.f31301h = com.anythink.basead.exoplayer.b.f6539b;
            return true;
        }
        if (this.f31301h == com.anythink.basead.exoplayer.b.f6539b) {
            return false;
        }
        this.f31303k.getClass();
        if (SystemClock.elapsedRealtime() < this.f31301h) {
            return true;
        }
        this.f31301h = com.anythink.basead.exoplayer.b.f6539b;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x015f, code lost:
    
        if (r3 > 100000) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x016e, code lost:
    
        if (r33 >= r37) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0177, code lost:
    
        if (r30.f31296c != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0082, code lost:
    
        if ((r9 == 0 ? false : r14.f27096g[(int) ((r9 - 1) % 15)]) != false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(long j9, long j10, long j11, long j12, boolean z8, boolean z9, C3287h0 c3287h0) {
        long j13;
        long j14;
        long j15;
        int i;
        int i4;
        int i9;
        int i10;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        c3287h0.f31130a = com.anythink.basead.exoplayer.b.f6539b;
        c3287h0.f31131b = com.anythink.basead.exoplayer.b.f6539b;
        if (this.f31296c && this.f31298e == com.anythink.basead.exoplayer.b.f6539b) {
            this.f31298e = j10;
        }
        if (this.f31300g != j9) {
            C3609n0 c3609n0 = this.f31295b;
            j13 = -9223372036854775807L;
            long j22 = c3609n0.f32797n;
            if (j22 != -1) {
                c3609n0.f32800q = j22;
                c3609n0.f32801r = c3609n0.f32798o;
                c3609n0.f32802s = c3609n0.f32799p;
                c3609n0.f32794k = c3609n0.f32795l;
            }
            c3609n0.f32796m++;
            long j23 = j9 * 1000;
            S s3 = c3609n0.f32785a;
            j14 = 1000;
            s3.f27462a.c(j23);
            if (s3.f27462a.b()) {
                s3.f27464c = false;
            } else if (s3.f27465d != com.anythink.basead.exoplayer.b.f6539b) {
                if (s3.f27464c) {
                    Q q6 = s3.f27463b;
                    j15 = 0;
                    long j24 = q6.f27093d;
                } else {
                    j15 = 0;
                }
                s3.f27463b.a();
                s3.f27463b.c(s3.f27465d);
                s3.f27464c = true;
                s3.f27463b.c(j23);
                if (s3.f27464c && s3.f27463b.b()) {
                    Q q9 = s3.f27462a;
                    s3.f27462a = s3.f27463b;
                    s3.f27463b = q9;
                    s3.f27464c = false;
                }
                s3.f27465d = j23;
                s3.f27466e = !s3.f27462a.b() ? 0 : s3.f27466e + 1;
                c3609n0.b();
                this.f31300g = j9;
            }
            j15 = 0;
            if (s3.f27464c) {
                Q q92 = s3.f27462a;
                s3.f27462a = s3.f27463b;
                s3.f27463b = q92;
                s3.f27464c = false;
            }
            s3.f27465d = j23;
            s3.f27466e = !s3.f27462a.b() ? 0 : s3.f27466e + 1;
            c3609n0.b();
            this.f31300g = j9;
        } else {
            j13 = -9223372036854775807L;
            j14 = 1000;
            j15 = 0;
        }
        long j25 = (long) ((j9 - j10) / this.f31302j);
        if (this.f31296c) {
            this.f31303k.getClass();
            j25 -= AbstractC3548lu.u(SystemClock.elapsedRealtime()) - j11;
        }
        c3287h0.f31130a = j25;
        if (!z8 || z9) {
            if (this.f31304l) {
                if (this.f31301h == j13 || this.i) {
                    int i11 = this.f31297d;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                i = 3;
                                i4 = 5;
                            } else {
                                if (i11 != 3) {
                                    throw new IllegalStateException();
                                }
                                this.f31303k.getClass();
                                i = 3;
                                i4 = 5;
                                long u7 = AbstractC3548lu.u(SystemClock.elapsedRealtime()) - this.f31299f;
                                if (this.f31296c) {
                                    long j26 = this.f31298e;
                                    if (j26 != j13) {
                                        if (j26 != j10) {
                                            if (j25 < -30000) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return 0;
                    }
                    i = 3;
                    i4 = 5;
                } else {
                    i = 3;
                    i4 = 5;
                }
                if (this.f31296c && j10 != this.f31298e) {
                    this.f31303k.getClass();
                    long nanoTime = System.nanoTime();
                    C3609n0 c3609n02 = this.f31295b;
                    long j27 = (c3287h0.f31130a * j14) + nanoTime;
                    if (c3609n02.f32800q != -1) {
                        S s6 = c3609n02.f32785a;
                        if (s6.f27462a.b()) {
                            if (s6.f27462a.b()) {
                                Q q10 = s6.f27462a;
                                i10 = 2;
                                long j28 = q10.f27094e;
                                i9 = 1;
                                j21 = j28 == j15 ? j15 : q10.f27095f / j28;
                            } else {
                                i9 = 1;
                                i10 = 2;
                                j21 = j13;
                            }
                            j16 = -30000;
                            j20 = (long) (((c3609n02.f32796m - c3609n02.f32800q) * j21) / c3609n02.i);
                        } else {
                            i9 = 1;
                            i10 = 2;
                            j16 = -30000;
                            j20 = (long) (((j9 - c3609n02.f32802s) * j14) / c3609n02.i);
                        }
                        long j29 = c3609n02.f32801r + j20;
                        if (Math.abs(j27 - j29) > 20000000) {
                            c3609n02.a();
                        } else {
                            j27 = j29;
                        }
                    } else {
                        i9 = 1;
                        i10 = 2;
                        j16 = -30000;
                    }
                    c3609n02.f32797n = c3609n02.f32796m;
                    c3609n02.f32798o = j27;
                    c3609n02.f32799p = j9;
                    AbstractC3447k0 abstractC3447k0 = c3609n02.f32787c;
                    if (abstractC3447k0 != null) {
                        long j30 = abstractC3447k0.f32232v;
                        long j31 = c3609n02.f32787c.f32233w;
                        if (j30 != j13 && j31 != j13) {
                            long j32 = (((j27 - j30) / j31) * j31) + j30;
                            if (j27 <= j32) {
                                j17 = j32 - j31;
                            } else {
                                j32 += j31;
                                j17 = j32;
                            }
                            long j33 = j31 / 2;
                            long j34 = j32 - j27;
                            long j35 = j27 - j17;
                            long abs = Math.abs(j34 - j35);
                            if (abs < j33) {
                                long j36 = j31 / 4;
                                j18 = j17;
                                if (abs < j36) {
                                    j19 = c3609n02.f32794k;
                                    if (j19 == j15) {
                                        if (j34 < j35) {
                                            j36 = -j36;
                                        }
                                        c3609n02.f32795l = j36;
                                        j19 = j36;
                                        if (j34 + j19 >= j35) {
                                            j32 = j18;
                                        }
                                        j27 = j32 - ((j31 * 80) / 100);
                                    }
                                } else {
                                    j19 = j15;
                                }
                            } else {
                                j18 = j17;
                                j19 = c3609n02.f32794k;
                            }
                            c3609n02.f32795l = j19;
                            if (j34 + j19 >= j35) {
                            }
                            j27 = j32 - ((j31 * 80) / 100);
                        }
                    }
                    c3287h0.f31131b = j27;
                    long j37 = (j27 - nanoTime) / j14;
                    c3287h0.f31130a = j37;
                    boolean z10 = (this.f31301h == j13 || this.i) ? 0 : i9;
                    if (this.f31294a.y0(j37, j10, z9, z10)) {
                        return 4;
                    }
                    long j38 = c3287h0.f31130a;
                    if (j38 < j16 && !z9) {
                        return z10 != 0 ? i : i10;
                    }
                    if (j38 <= 50000) {
                        return i9;
                    }
                }
                return i4;
            }
            if (this.f31294a.y0(j25, j10, z9, true)) {
                return 4;
            }
            if (!this.f31296c || c3287h0.f31130a >= 30000) {
                this.f31305m = true;
                return 5;
            }
        }
        return 3;
    }

    public final void g(float f6) {
        PA.n(f6 > 0.0f);
        if (f6 == this.f31302j) {
            return;
        }
        this.f31302j = f6;
        C3609n0 c3609n0 = this.f31295b;
        c3609n0.i = f6;
        c3609n0.c(false);
    }
}
