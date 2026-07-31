package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l11;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.wz0;
import com.yandex.mobile.ads.impl.yb0;

/* loaded from: classes3.dex */
public final class aq0 implements p70 {

    /* renamed from: b, reason: collision with root package name */
    private r70 f23408b;

    /* renamed from: c, reason: collision with root package name */
    private int f23409c;

    /* renamed from: d, reason: collision with root package name */
    private int f23410d;

    /* renamed from: e, reason: collision with root package name */
    private int f23411e;

    /* renamed from: g, reason: collision with root package name */
    private m11 f23413g;

    /* renamed from: h, reason: collision with root package name */
    private q70 f23414h;

    /* renamed from: i, reason: collision with root package name */
    private e22 f23415i;

    /* renamed from: j, reason: collision with root package name */
    private o11 f23416j;

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f23407a = new sf1(6);

    /* renamed from: f, reason: collision with root package name */
    private long f23412f = -1;

    private void a() {
        r70 r70Var = this.f23408b;
        r70Var.getClass();
        r70Var.a(1024, 4).a(new yb0.a().b().a(new wz0(new wz0.b[0])).a());
        r70 r70Var2 = this.f23408b;
        r70Var2.getClass();
        r70Var2.a();
        this.f23408b.a(new tw1.b(-9223372036854775807L, 0L));
        this.f23409c = 6;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f23408b = r70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q70 q70Var, hj1 hj1Var) {
        String q4;
        m11 m11Var;
        l11 a4;
        long j4;
        long j5;
        char c4 = 65535;
        int i4 = this.f23409c;
        long j6 = -1;
        if (i4 == 0) {
            this.f23407a.c(2);
            ((lz) q70Var).a(this.f23407a.c(), 0, 2, false);
            int z4 = this.f23407a.z();
            this.f23410d = z4;
            if (z4 == 65498) {
                if (this.f23412f != -1) {
                    this.f23409c = 4;
                } else {
                    a();
                }
            } else if ((z4 < 65488 || z4 > 65497) && z4 != 65281) {
                this.f23409c = 1;
            }
            return 0;
        }
        if (i4 == 1) {
            this.f23407a.c(2);
            ((lz) q70Var).a(this.f23407a.c(), 0, 2, false);
            this.f23411e = this.f23407a.z() - 2;
            this.f23409c = 2;
            return 0;
        }
        if (i4 != 2) {
            if (i4 != 4) {
                if (i4 != 5) {
                    if (i4 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f23415i == null || q70Var != this.f23414h) {
                    this.f23414h = q70Var;
                    this.f23415i = new e22((lz) q70Var, this.f23412f);
                }
                o11 o11Var = this.f23416j;
                o11Var.getClass();
                int a5 = o11Var.a(this.f23415i, hj1Var);
                if (a5 == 1) {
                    hj1Var.f26771a += this.f23412f;
                }
                return a5;
            }
            lz lzVar = (lz) q70Var;
            long a6 = lzVar.a();
            long j7 = this.f23412f;
            if (a6 != j7) {
                hj1Var.f26771a = j7;
                return 1;
            }
            if (!lzVar.b(this.f23407a.c(), 0, 1, true)) {
                a();
            } else {
                lzVar.c();
                if (this.f23416j == null) {
                    this.f23416j = new o11();
                }
                e22 e22Var = new e22(lzVar, this.f23412f);
                this.f23415i = e22Var;
                if (this.f23416j.a(e22Var)) {
                    o11 o11Var2 = this.f23416j;
                    long j8 = this.f23412f;
                    r70 r70Var = this.f23408b;
                    r70Var.getClass();
                    o11Var2.a(new f22(j8, r70Var));
                    m11 m11Var2 = this.f23413g;
                    m11Var2.getClass();
                    wz0.b[] bVarArr = {m11Var2};
                    r70 r70Var2 = this.f23408b;
                    r70Var2.getClass();
                    r70Var2.a(1024, 4).a(new yb0.a().b().a(new wz0(bVarArr)).a());
                    this.f23409c = 5;
                } else {
                    a();
                }
            }
            return 0;
        }
        if (this.f23410d == 65505) {
            sf1 sf1Var = new sf1(this.f23411e);
            lz lzVar2 = (lz) q70Var;
            lzVar2.a(sf1Var.c(), 0, this.f23411e, false);
            if (this.f23413g == null && "http://ns.adobe.com/xap/1.0/".equals(sf1Var.q()) && (q4 = sf1Var.q()) != null) {
                long b4 = lzVar2.b();
                if (b4 != -1 && (a4 = wk2.a(q4)) != null && a4.f28386b.size() >= 2) {
                    int size = a4.f28386b.size() - 1;
                    boolean z5 = false;
                    long j9 = -1;
                    long j10 = -1;
                    long j11 = -1;
                    long j12 = -1;
                    while (size >= 0) {
                        l11.a aVar = a4.f28386b.get(size);
                        char c5 = c4;
                        boolean equals = "video/mp4".equals(aVar.f28387a) | z5;
                        if (size == 0) {
                            j4 = j6;
                            b4 -= aVar.f28389c;
                            j5 = 0;
                        } else {
                            j4 = j6;
                            j5 = b4 - aVar.f28388b;
                        }
                        long j13 = j5;
                        long j14 = b4;
                        b4 = j13;
                        if (!equals || b4 == j14) {
                            z5 = equals;
                        } else {
                            j12 = j14 - b4;
                            z5 = false;
                            j11 = b4;
                        }
                        if (size == 0) {
                            j9 = b4;
                            j10 = j14;
                        }
                        size--;
                        c4 = c5;
                        j6 = j4;
                    }
                    long j15 = j6;
                    if (j11 != j15 && j12 != j15 && j9 != j15 && j10 != j15) {
                        m11Var = new m11(j9, j10, a4.f28385a, j11, j12);
                        this.f23413g = m11Var;
                        if (m11Var != null) {
                            this.f23412f = m11Var.f28831e;
                        }
                    }
                }
                m11Var = null;
                this.f23413g = m11Var;
                if (m11Var != null) {
                }
            }
        } else {
            ((lz) q70Var).a(this.f23411e);
        }
        this.f23409c = 0;
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        if (j4 == 0) {
            this.f23409c = 0;
            this.f23416j = null;
        } else if (this.f23409c == 5) {
            o11 o11Var = this.f23416j;
            o11Var.getClass();
            o11Var.a(j4, j5);
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        lz lzVar = (lz) q70Var;
        this.f23407a.c(2);
        lzVar.b(this.f23407a.c(), 0, 2, false);
        if (this.f23407a.z() != 65496) {
            return false;
        }
        this.f23407a.c(2);
        lzVar.b(this.f23407a.c(), 0, 2, false);
        int z4 = this.f23407a.z();
        this.f23410d = z4;
        if (z4 == 65504) {
            this.f23407a.c(2);
            lzVar.b(this.f23407a.c(), 0, 2, false);
            lzVar.a(false, this.f23407a.z() - 2);
            this.f23407a.c(2);
            lzVar.b(this.f23407a.c(), 0, 2, false);
            this.f23410d = this.f23407a.z();
        }
        if (this.f23410d != 65505) {
            return false;
        }
        lzVar.a(false, 2);
        this.f23407a.c(6);
        lzVar.b(this.f23407a.c(), 0, 6, false);
        return this.f23407a.v() == 1165519206 && this.f23407a.z() == 0;
    }
}
