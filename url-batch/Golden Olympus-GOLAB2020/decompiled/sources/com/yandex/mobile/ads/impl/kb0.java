package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lb0;
import com.yandex.mobile.ads.impl.tw1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class kb0 implements p70 {

    /* renamed from: e, reason: collision with root package name */
    private r70 f28151e;

    /* renamed from: f, reason: collision with root package name */
    private p52 f28152f;

    /* renamed from: h, reason: collision with root package name */
    private wz0 f28154h;

    /* renamed from: i, reason: collision with root package name */
    private pb0 f28155i;

    /* renamed from: j, reason: collision with root package name */
    private int f28156j;

    /* renamed from: k, reason: collision with root package name */
    private int f28157k;

    /* renamed from: l, reason: collision with root package name */
    private jb0 f28158l;

    /* renamed from: m, reason: collision with root package name */
    private int f28159m;

    /* renamed from: n, reason: collision with root package name */
    private long f28160n;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f28147a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f28148b = new sf1(0, new byte[32768]);

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28149c = false;

    /* renamed from: d, reason: collision with root package name */
    private final lb0.a f28150d = new lb0.a();

    /* renamed from: g, reason: collision with root package name */
    private int f28153g = 0;

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.K8
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] a4;
                a4 = kb0.a();
                return a4;
            }
        };
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f28151e = r70Var;
        this.f28152f = r70Var.a(0, 1);
        r70Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final int a(q70 q70Var, hj1 hj1Var) {
        boolean f4;
        tw1 bVar;
        boolean z4;
        long j4;
        boolean z5;
        boolean z6 = true;
        int i4 = this.f28153g;
        wz0 wz0Var = null;
        if (i4 == 0) {
            boolean z7 = this.f28149c;
            lz lzVar = (lz) q70Var;
            lzVar.c();
            long d4 = lzVar.d();
            wz0 a4 = new ai0().a(lzVar, !z7 ? null : yh0.f35137b);
            if (a4 != null && a4.c() != 0) {
                wz0Var = a4;
            }
            lzVar.a((int) (lzVar.d() - d4));
            this.f28154h = wz0Var;
            this.f28153g = 1;
            return 0;
        }
        if (i4 == 1) {
            byte[] bArr = this.f28147a;
            lz lzVar2 = (lz) q70Var;
            lzVar2.b(bArr, 0, bArr.length, false);
            lzVar2.c();
            this.f28153g = 2;
            return 0;
        }
        if (i4 == 2) {
            sf1 sf1Var = new sf1(4);
            ((lz) q70Var).a(sf1Var.c(), 0, 4, false);
            if (sf1Var.v() == 1716281667) {
                this.f28153g = 3;
                return 0;
            }
            throw wf1.a("Failed to read FLAC stream marker.", (Exception) null);
        }
        if (i4 == 3) {
            pb0 pb0Var = this.f28155i;
            do {
                lz lzVar3 = (lz) q70Var;
                lzVar3.c();
                byte[] bArr2 = new byte[4];
                rf1 rf1Var = new rf1(4, bArr2);
                lzVar3.b(bArr2, 0, 4, false);
                f4 = rf1Var.f();
                int b4 = rf1Var.b(7);
                int b5 = rf1Var.b(24) + 4;
                if (b4 == 0) {
                    byte[] bArr3 = new byte[38];
                    lzVar3.a(bArr3, 0, 38, false);
                    pb0Var = new pb0(4, bArr3);
                } else {
                    if (pb0Var == null) {
                        throw new IllegalArgumentException();
                    }
                    if (b4 == 3) {
                        sf1 sf1Var2 = new sf1(b5);
                        lzVar3.a(sf1Var2.c(), 0, b5, false);
                        pb0Var = pb0Var.a(mb0.a(sf1Var2));
                    } else if (b4 == 4) {
                        sf1 sf1Var3 = new sf1(b5);
                        lzVar3.a(sf1Var3.c(), 0, b5, false);
                        sf1Var3.f(4);
                        pb0Var = pb0Var.b(Arrays.asList(vi2.a(sf1Var3, false, false).f33646a));
                    } else if (b4 == 6) {
                        sf1 sf1Var4 = new sf1(b5);
                        lzVar3.a(sf1Var4.c(), 0, b5, false);
                        sf1Var4.f(4);
                        int h4 = sf1Var4.h();
                        String a5 = sf1Var4.a(sf1Var4.h(), un.f33181a);
                        String a6 = sf1Var4.a(sf1Var4.h(), un.f33183c);
                        int h5 = sf1Var4.h();
                        int h6 = sf1Var4.h();
                        int h7 = sf1Var4.h();
                        int h8 = sf1Var4.h();
                        int h9 = sf1Var4.h();
                        byte[] bArr4 = new byte[h9];
                        sf1Var4.a(bArr4, 0, h9);
                        pb0Var = pb0Var.a(sj0.a(new bh1(h4, a5, a6, h5, h6, h7, h8, bArr4)));
                    } else {
                        lzVar3.a(b5);
                    }
                }
                int i5 = u82.f32873a;
                this.f28155i = pb0Var;
            } while (!f4);
            this.f28156j = Math.max(pb0Var.f30390c, 6);
            this.f28152f.a(this.f28155i.a(this.f28147a, this.f28154h));
            this.f28153g = 4;
            return 0;
        }
        long j5 = 0;
        if (i4 == 4) {
            lz lzVar4 = (lz) q70Var;
            lzVar4.c();
            sf1 sf1Var5 = new sf1(2);
            lzVar4.b(sf1Var5.c(), 0, 2, false);
            int z8 = sf1Var5.z();
            if ((z8 >> 2) == 16382) {
                lzVar4.c();
                this.f28157k = z8;
                r70 r70Var = this.f28151e;
                int i6 = u82.f32873a;
                long a7 = lzVar4.a();
                long b6 = lzVar4.b();
                this.f28155i.getClass();
                pb0 pb0Var2 = this.f28155i;
                if (pb0Var2.f30398k != null) {
                    bVar = new ob0(pb0Var2, a7);
                } else if (b6 != -1 && pb0Var2.f30397j > 0) {
                    jb0 jb0Var = new jb0(pb0Var2, this.f28157k, a7, b6);
                    this.f28158l = jb0Var;
                    bVar = jb0Var.a();
                } else {
                    bVar = new tw1.b(pb0Var2.b(), 0L);
                }
                r70Var.a(bVar);
                this.f28153g = 5;
                return 0;
            }
            lzVar4.c();
            throw wf1.a("First frame does not start with sync code.", (Exception) null);
        }
        if (i4 == 5) {
            this.f28152f.getClass();
            this.f28155i.getClass();
            jb0 jb0Var2 = this.f28158l;
            if (jb0Var2 != null && jb0Var2.b()) {
                return this.f28158l.a((lz) q70Var, hj1Var);
            }
            if (this.f28160n == -1) {
                pb0 pb0Var3 = this.f28155i;
                lz lzVar5 = (lz) q70Var;
                lzVar5.c();
                lzVar5.a(false, 1);
                byte[] bArr5 = new byte[1];
                lzVar5.b(bArr5, 0, 1, false);
                boolean z9 = (bArr5[0] & 1) == 1;
                lzVar5.a(false, 2);
                int i7 = z9 ? 7 : 6;
                sf1 sf1Var6 = new sf1(i7);
                byte[] c4 = sf1Var6.c();
                int i8 = 0;
                while (i8 < i7) {
                    int c5 = lzVar5.c(c4, i8, i7 - i8);
                    if (c5 == -1) {
                        break;
                    }
                    i8 += c5;
                }
                sf1Var6.d(i8);
                lzVar5.c();
                try {
                    long A4 = sf1Var6.A();
                    if (!z9) {
                        A4 *= pb0Var3.f30389b;
                    }
                    j5 = A4;
                } catch (NumberFormatException unused) {
                    z6 = false;
                }
                if (z6) {
                    this.f28160n = j5;
                } else {
                    throw wf1.a((String) null, (Exception) null);
                }
            } else {
                int e4 = this.f28148b.e();
                if (e4 < 32768) {
                    int read = ((lz) q70Var).read(this.f28148b.c(), e4, 32768 - e4);
                    z4 = read == -1;
                    if (!z4) {
                        this.f28148b.d(e4 + read);
                    } else if (this.f28148b.a() == 0) {
                        long j6 = this.f28160n * 1000000;
                        pb0 pb0Var4 = this.f28155i;
                        int i9 = u82.f32873a;
                        this.f28152f.a(j6 / pb0Var4.f30392e, 1, this.f28159m, 0, null);
                        return -1;
                    }
                } else {
                    z4 = false;
                }
                int d5 = this.f28148b.d();
                int i10 = this.f28159m;
                int i11 = this.f28156j;
                if (i10 < i11) {
                    sf1 sf1Var7 = this.f28148b;
                    sf1Var7.f(Math.min(i11 - i10, sf1Var7.a()));
                }
                sf1 sf1Var8 = this.f28148b;
                this.f28155i.getClass();
                int d6 = sf1Var8.d();
                while (true) {
                    if (d6 <= sf1Var8.e() - 16) {
                        sf1Var8.e(d6);
                        if (lb0.a(sf1Var8, this.f28155i, this.f28157k, this.f28150d)) {
                            sf1Var8.e(d6);
                            j4 = this.f28150d.f28500a;
                            break;
                        }
                        d6++;
                    } else {
                        if (z4) {
                            while (d6 <= sf1Var8.e() - this.f28156j) {
                                sf1Var8.e(d6);
                                try {
                                    z5 = lb0.a(sf1Var8, this.f28155i, this.f28157k, this.f28150d);
                                } catch (IndexOutOfBoundsException unused2) {
                                    z5 = false;
                                }
                                if (sf1Var8.d() <= sf1Var8.e() && z5) {
                                    sf1Var8.e(d6);
                                    j4 = this.f28150d.f28500a;
                                    break;
                                }
                                d6++;
                            }
                            sf1Var8.e(sf1Var8.e());
                        } else {
                            sf1Var8.e(d6);
                        }
                        j4 = -1;
                    }
                }
                int d7 = this.f28148b.d() - d5;
                this.f28148b.e(d5);
                this.f28152f.a(d7, this.f28148b);
                int i12 = this.f28159m + d7;
                this.f28159m = i12;
                if (j4 != -1) {
                    long j7 = this.f28160n * 1000000;
                    pb0 pb0Var5 = this.f28155i;
                    int i13 = u82.f32873a;
                    this.f28152f.a(j7 / pb0Var5.f30392e, 1, i12, 0, null);
                    this.f28159m = 0;
                    this.f28160n = j4;
                }
                if (this.f28148b.a() < 16) {
                    int a8 = this.f28148b.a();
                    System.arraycopy(this.f28148b.c(), this.f28148b.d(), this.f28148b.c(), 0, a8);
                    this.f28148b.e(0);
                    this.f28148b.d(a8);
                }
            }
            return 0;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        if (j4 == 0) {
            this.f28153g = 0;
        } else {
            jb0 jb0Var = this.f28158l;
            if (jb0Var != null) {
                jb0Var.a(j5);
            }
        }
        this.f28160n = j5 != 0 ? -1L : 0L;
        this.f28159m = 0;
        this.f28148b.c(0);
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        lz lzVar = (lz) q70Var;
        wz0 a4 = new ai0().a(lzVar, yh0.f35137b);
        if (a4 != null) {
            a4.c();
        }
        sf1 sf1Var = new sf1(4);
        lzVar.b(sf1Var.c(), 0, 4, false);
        return sf1Var.v() == 1716281667;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p70[] a() {
        return new p70[]{new kb0()};
    }
}
