package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC2235sk;
import com.yandex.mobile.ads.impl.lb0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class jb0 extends AbstractC2235sk {

    private static final class a implements AbstractC2235sk.f {

        /* renamed from: a, reason: collision with root package name */
        private final pb0 f27619a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27620b;

        /* renamed from: c, reason: collision with root package name */
        private final lb0.a f27621c;

        private long a(lz lzVar) {
            long j4;
            while (true) {
                long j5 = 6;
                if (lzVar.d() >= lzVar.b() - 6) {
                    j4 = 6;
                    break;
                }
                pb0 pb0Var = this.f27619a;
                int i4 = this.f27620b;
                lb0.a aVar = this.f27621c;
                long d4 = lzVar.d();
                byte[] bArr = new byte[2];
                lzVar.b(bArr, 0, 2, false);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i4) {
                    sf1 sf1Var = new sf1(16);
                    System.arraycopy(bArr, 0, sf1Var.c(), 0, 2);
                    byte[] c4 = sf1Var.c();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= 14) {
                            j4 = j5;
                            break;
                        }
                        j4 = j5;
                        int c5 = lzVar.c(c4, 2 + i5, 14 - i5);
                        if (c5 == -1) {
                            break;
                        }
                        i5 += c5;
                        j5 = j4;
                    }
                    sf1Var.d(i5);
                    lzVar.c();
                    lzVar.a(false, (int) (d4 - lzVar.a()));
                    if (lb0.a(sf1Var, pb0Var, i4, aVar)) {
                        break;
                    }
                } else {
                    lzVar.c();
                    lzVar.a(false, (int) (d4 - lzVar.a()));
                }
                lzVar.a(false, 1);
            }
            if (lzVar.d() < lzVar.b() - j4) {
                return this.f27621c.f28500a;
            }
            lzVar.a(false, (int) (lzVar.b() - lzVar.d()));
            return this.f27619a.f30397j;
        }

        private a(int i4, pb0 pb0Var) {
            this.f27619a = pb0Var;
            this.f27620b = i4;
            this.f27621c = new lb0.a();
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC2235sk.f
        public final AbstractC2235sk.e a(lz lzVar, long j4) {
            long a4 = lzVar.a();
            long a5 = a(lzVar);
            long d4 = lzVar.d();
            lzVar.a(false, Math.max(6, this.f27619a.f30390c));
            long a6 = a(lzVar);
            long d5 = lzVar.d();
            if (a5 <= j4 && a6 > j4) {
                return AbstractC2235sk.e.a(d4);
            }
            if (a6 <= j4) {
                return AbstractC2235sk.e.b(a6, d5);
            }
            return AbstractC2235sk.e.a(a5, a4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(final pb0 pb0Var, int i4, long j4, long j5) {
        super(new AbstractC2235sk.d() { // from class: com.yandex.mobile.ads.impl.Y7
            @Override // com.yandex.mobile.ads.impl.AbstractC2235sk.d
            public final long a(long j6) {
                return pb0.this.a(j6);
            }
        }, new a(i4, pb0Var), pb0Var.b(), pb0Var.f30397j, j4, j5, pb0Var.a(), Math.max(6, pb0Var.f30390c));
        Objects.requireNonNull(pb0Var);
    }
}
