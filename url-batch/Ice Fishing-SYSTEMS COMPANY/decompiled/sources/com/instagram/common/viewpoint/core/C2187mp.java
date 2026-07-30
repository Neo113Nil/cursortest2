package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.mp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2187mp implements HY {
    public static String[] A02 = {"1Tt6ltc55g", "ops4n6D0RsDIbcNK2iFIW7Ay7S5Nano", "QFUbJLsUaFmSVLdjzr36RpAXorrqi07i", "7FxugF0ZmqBQk4dAnarwpNTfiaTe1g6g", "N3T7HRrxqFzk5rl0dpC6S3h47ocLp3rK", "Rq3uRmlvLOcLbWX3oXceNMTvaDTByq6j", "8TmLuftHICqYkzwVWbIwZIwFPzZSJxQj", "4hmJxBFNQAJLWam3xj85pvhcrB85xjeQ"};
    public final long A00;
    public final HJ A01;

    public C2187mp(HJ hj, long j9) {
        this.A01 = hj;
        this.A00 = j9;
    }

    private HZ A00(long j9, long j10) {
        return new HZ((1000000 * j9) / this.A01.A07, this.A00 + j10);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A01.A06();
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j9) {
        long j10;
        AbstractC06233y.A02(this.A01.A0A);
        long[] jArr = this.A01.A0A.A01;
        long[] jArr2 = this.A01.A0A.A00;
        int A0L = C5C.A0L(jArr, this.A01.A07(j9), true, false);
        long j11 = 0;
        if (A0L == -1) {
            j10 = 0;
        } else {
            j10 = jArr[A0L];
        }
        if (A0L != -1) {
            j11 = jArr2[A0L];
        }
        HZ A00 = A00(j10, j11);
        if (A00.A01 != j9) {
            int length = jArr.length - 1;
            String[] strArr = A02;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "o5tsTNyqew751hc5myqwVOdw8F1gICkG";
            strArr2[6] = "VidtQTuToVY7NImzxnJwSrK8bx75lEQY";
            if (A0L != length) {
                HZ secondSeekPoint = A00(jArr[A0L + 1], jArr2[A0L + 1]);
                return new HX(A00, secondSeekPoint);
            }
        }
        return new HX(A00);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
