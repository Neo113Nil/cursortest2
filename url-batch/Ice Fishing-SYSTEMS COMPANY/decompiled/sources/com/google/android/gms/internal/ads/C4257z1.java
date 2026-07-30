package com.google.android.gms.internal.ads;

import java.nio.ByteOrder;

/* renamed from: com.google.android.gms.internal.ads.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4257z1 implements H0 {

    /* renamed from: n, reason: collision with root package name */
    public final U0 f35428n;

    /* renamed from: u, reason: collision with root package name */
    public final int f35429u;

    /* renamed from: v, reason: collision with root package name */
    public final S0 f35430v = new S0();

    public C4257z1(U0 u02, int i) {
        this.f35428n = u02;
        this.f35429u = i;
    }

    public final long a(J0 j02) {
        long j9;
        S0 s02;
        U0 u02;
        long j10;
        int c4;
        while (true) {
            long m8 = j02.m();
            j9 = j02.f25674v;
            long j11 = j9 - 6;
            s02 = this.f35430v;
            u02 = this.f35428n;
            if (m8 >= j11) {
                j10 = -6;
                break;
            }
            long m9 = j02.m();
            Lr lr = new Lr(17);
            j02.I(lr.f26233a, 0, 2, false);
            char r9 = lr.r(0, ByteOrder.BIG_ENDIAN);
            int i = this.f35429u;
            if (r9 != i) {
                j02.f25677y = 0;
                j02.d((int) (m9 - j02.f25675w), false);
            } else {
                byte[] bArr = lr.f26233a;
                j10 = -6;
                int i4 = 0;
                while (i4 < 15 && (c4 = j02.c(bArr, 2 + i4, 15 - i4)) != -1) {
                    i4 += c4;
                }
                lr.C(i4 + 2);
                j02.f25677y = 0;
                j02.d((int) (m9 - j02.f25675w), false);
                if (AbstractC2655Lg.l(lr, u02, i, s02)) {
                    break;
                }
            }
            j02.d(1, false);
        }
        if (j02.m() < j9 + j10) {
            return s02.f27467n;
        }
        j02.d((int) (j9 - j02.m()), false);
        return u02.f27908j;
    }

    @Override // com.google.android.gms.internal.ads.H0
    public final G0 k(J0 j02, long j9) {
        long j10 = j02.f25675w;
        long a9 = a(j02);
        long m8 = j02.m();
        j02.d(Math.max(6, this.f35428n.f27902c), false);
        long a10 = a(j02);
        return (a9 > j9 || a10 <= j9) ? a10 <= j9 ? new G0(-2, a10, j02.m()) : new G0(-1, a9, j10) : new G0(0, com.anythink.basead.exoplayer.b.f6539b, m8);
    }
}
