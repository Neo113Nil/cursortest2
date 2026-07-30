package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0939Gw {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public C0939Gw(long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.A06 = j9;
        this.A07 = j10;
        this.A03 = j11;
        this.A01 = j12;
        this.A02 = j13;
        this.A00 = j14;
        this.A05 = j15;
        this.A04 = A05(j10, j11, j12, j13, j14, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00() {
        return this.A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A01() {
        return this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A02() {
        return this.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A06;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A07;
    }

    public static long A05(long j9, long j10, long j11, long bytesToSkip, long confidenceInterval, long j12) {
        if (bytesToSkip + 1 >= confidenceInterval || j10 + 1 >= j11) {
            return bytesToSkip;
        }
        long j13 = (long) ((j9 - j10) * ((confidenceInterval - bytesToSkip) / (j11 - j10)));
        return C5C.A0T(((bytesToSkip + j13) - j12) - (j13 / 20), bytesToSkip, confidenceInterval - 1);
    }

    private void A0B() {
        this.A04 = A05(this.A07, this.A03, this.A01, this.A02, this.A00, this.A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(long j9, long j10) {
        this.A01 = j9;
        this.A00 = j10;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(long j9, long j10) {
        this.A03 = j9;
        this.A02 = j10;
        A0B();
    }
}
