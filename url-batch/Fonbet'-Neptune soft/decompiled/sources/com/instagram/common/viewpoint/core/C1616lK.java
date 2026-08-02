package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.lK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1616lK implements InterfaceC0460Gw {
    public static String[] A02 = {"1Tt6ltc55g", "ops4n6D0RsDIbcNK2iFIW7Ay7S5Nano", "QFUbJLsUaFmSVLdjzr36RpAXorrqi07i", "7FxugF0ZmqBQk4dAnarwpNTfiaTe1g6g", "N3T7HRrxqFzk5rl0dpC6S3h47ocLp3rK", "Rq3uRmlvLOcLbWX3oXceNMTvaDTByq6j", "8TmLuftHICqYkzwVWbIwZIwFPzZSJxQj", "4hmJxBFNQAJLWam3xj85pvhcrB85xjeQ"};
    public final long A00;
    public final C0445Gh A01;

    public C1616lK(C0445Gh c0445Gh, long j) {
        this.A01 = c0445Gh;
        this.A00 = j;
    }

    private C0461Gx A00(long j, long j2) {
        return new C0461Gx((1000000 * j) / this.A01.A07, this.A00 + j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final long A7l() {
        return this.A01.A06();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final C0459Gv A8t(long j) {
        long j2;
        C3M.A02(this.A01.A0A);
        long[] jArr = this.A01.A0A.A01;
        long[] jArr2 = this.A01.A0A.A00;
        int A0L = AbstractC01424a.A0L(jArr, this.A01.A07(j), true, false);
        long j3 = 0;
        if (A0L == -1) {
            j2 = 0;
        } else {
            j2 = jArr[A0L];
        }
        if (A0L != -1) {
            j3 = jArr2[A0L];
        }
        C0461Gx A00 = A00(j2, j3);
        if (A00.A01 != j) {
            int length = jArr.length - 1;
            String[] strArr = A02;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "o5tsTNyqew751hc5myqwVOdw8F1gICkG";
            strArr2[6] = "VidtQTuToVY7NImzxnJwSrK8bx75lEQY";
            if (A0L != length) {
                C0461Gx secondSeekPoint = A00(jArr[A0L + 1], jArr2[A0L + 1]);
                return new C0459Gv(A00, secondSeekPoint);
            }
        }
        return new C0459Gv(A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final boolean AAa() {
        return true;
    }
}
