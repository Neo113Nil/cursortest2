package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2235sk;

/* loaded from: classes3.dex */
final class qm1 extends AbstractC2235sk {

    private static final class a implements AbstractC2235sk.f {

        /* renamed from: a, reason: collision with root package name */
        private final e52 f30845a;

        /* renamed from: b, reason: collision with root package name */
        private final sf1 f30846b;

        @Override // com.yandex.mobile.ads.impl.AbstractC2235sk.f
        public final void a() {
            this.f30846b.a(u82.f32878f);
        }

        private a(e52 e52Var) {
            this.f30845a = e52Var;
            this.f30846b = new sf1();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2235sk.f
        public final AbstractC2235sk.e a(lz lzVar, long j4) {
            long a4 = lzVar.a();
            int min = (int) Math.min(20000L, lzVar.b() - a4);
            this.f30846b.c(min);
            lzVar.b(this.f30846b.c(), 0, min, false);
            sf1 sf1Var = this.f30846b;
            int i4 = -1;
            int i5 = -1;
            long j5 = -9223372036854775807L;
            while (sf1Var.a() >= 4) {
                if (qm1.a(sf1Var.d(), sf1Var.c()) != 442) {
                    sf1Var.f(1);
                } else {
                    sf1Var.f(4);
                    long a5 = rm1.a(sf1Var);
                    if (a5 != -9223372036854775807L) {
                        long b4 = this.f30845a.b(a5);
                        if (b4 > j4) {
                            return j5 == -9223372036854775807L ? AbstractC2235sk.e.a(b4, a4) : AbstractC2235sk.e.a(a4 + i5);
                        }
                        if (100000 + b4 > j4) {
                            return AbstractC2235sk.e.a(a4 + sf1Var.d());
                        }
                        i5 = sf1Var.d();
                        j5 = b4;
                    }
                    int e4 = sf1Var.e();
                    if (sf1Var.a() >= 10) {
                        sf1Var.f(9);
                        int t4 = sf1Var.t() & 7;
                        if (sf1Var.a() >= t4) {
                            sf1Var.f(t4);
                            if (sf1Var.a() >= 4) {
                                if (qm1.a(sf1Var.d(), sf1Var.c()) == 443) {
                                    sf1Var.f(4);
                                    int z4 = sf1Var.z();
                                    if (sf1Var.a() < z4) {
                                        sf1Var.e(e4);
                                    } else {
                                        sf1Var.f(z4);
                                    }
                                }
                                while (true) {
                                    if (sf1Var.a() < 4) {
                                        break;
                                    }
                                    int a6 = qm1.a(sf1Var.d(), sf1Var.c());
                                    if (a6 == 442 || a6 == 441 || (a6 >>> 8) != 1) {
                                        break;
                                    }
                                    sf1Var.f(4);
                                    if (sf1Var.a() < 2) {
                                        sf1Var.e(e4);
                                        break;
                                    }
                                    sf1Var.e(Math.min(sf1Var.e(), sf1Var.d() + sf1Var.z()));
                                }
                            } else {
                                sf1Var.e(e4);
                            }
                        } else {
                            sf1Var.e(e4);
                        }
                    } else {
                        sf1Var.e(e4);
                    }
                    i4 = sf1Var.d();
                }
            }
            return j5 != -9223372036854775807L ? AbstractC2235sk.e.b(j5, a4 + i4) : AbstractC2235sk.e.f31813d;
        }
    }

    public qm1(e52 e52Var, long j4, long j5) {
        super(new AbstractC2235sk.b(), new a(e52Var), j4, j4 + 1, 0L, j5, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(int i4, byte[] bArr) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }
}
