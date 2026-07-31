package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2235sk;

/* loaded from: classes3.dex */
final class b72 extends AbstractC2235sk {

    private static final class a implements AbstractC2235sk.f {

        /* renamed from: a, reason: collision with root package name */
        private final e52 f23623a;

        /* renamed from: b, reason: collision with root package name */
        private final sf1 f23624b = new sf1();

        /* renamed from: c, reason: collision with root package name */
        private final int f23625c;

        /* renamed from: d, reason: collision with root package name */
        private final int f23626d;

        public a(int i4, e52 e52Var, int i5) {
            this.f23625c = i4;
            this.f23623a = e52Var;
            this.f23626d = i5;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2235sk.f
        public final void a() {
            this.f23624b.a(u82.f32878f);
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2235sk.f
        public final AbstractC2235sk.e a(lz lzVar, long j4) {
            long j5;
            long a4 = lzVar.a();
            int min = (int) Math.min(this.f23626d, lzVar.b() - a4);
            this.f23624b.c(min);
            lzVar.b(this.f23624b.c(), 0, min, false);
            sf1 sf1Var = this.f23624b;
            int e4 = sf1Var.e();
            long j6 = -1;
            long j7 = -1;
            long j8 = -9223372036854775807L;
            while (true) {
                if (sf1Var.a() < 188) {
                    j5 = -9223372036854775807L;
                    break;
                }
                byte[] c4 = sf1Var.c();
                int d4 = sf1Var.d();
                while (true) {
                    if (d4 >= e4) {
                        j5 = -9223372036854775807L;
                        break;
                    }
                    j5 = -9223372036854775807L;
                    if (c4[d4] == 71) {
                        break;
                    }
                    d4++;
                }
                int i4 = d4 + 188;
                if (i4 > e4) {
                    break;
                }
                long a5 = f72.a(d4, this.f23625c, sf1Var);
                if (a5 != j5) {
                    long b4 = this.f23623a.b(a5);
                    if (b4 > j4) {
                        return j8 == j5 ? AbstractC2235sk.e.a(b4, a4) : AbstractC2235sk.e.a(a4 + j7);
                    }
                    if (100000 + b4 > j4) {
                        return AbstractC2235sk.e.a(a4 + d4);
                    }
                    j8 = b4;
                    j7 = d4;
                }
                sf1Var.e(i4);
                j6 = i4;
            }
            return j8 != j5 ? AbstractC2235sk.e.b(j8, a4 + j6) : AbstractC2235sk.e.f31813d;
        }
    }

    public b72(e52 e52Var, long j4, long j5, int i4, int i5) {
        super(new AbstractC2235sk.b(), new a(i4, e52Var, i5), j4, j4 + 1, 0L, j5, 188L, 940);
    }
}
