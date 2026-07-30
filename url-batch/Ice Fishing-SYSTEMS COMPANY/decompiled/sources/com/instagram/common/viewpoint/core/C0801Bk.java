package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest;

/* renamed from: com.facebook.ads.redexgen.X.Bk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0801Bk {
    public final C6 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final DownloadRequest A07;

    public C0801Bk(DownloadRequest downloadRequest, int i, long j9, long j10, long j11, int i4, int i9) {
        this(downloadRequest, i, j9, j10, j11, i4, i9, new C6());
    }

    public C0801Bk(DownloadRequest downloadRequest, int i, long j9, long j10, long j11, int i4, int i9, C6 c62) {
        AbstractC06233y.A01(c62);
        AbstractC06233y.A07((i9 == 0) == (i != 4));
        if (i4 != 0) {
            AbstractC06233y.A07((i == 2 || i == 0) ? false : true);
        }
        this.A07 = downloadRequest;
        this.A02 = i;
        this.A05 = j9;
        this.A06 = j10;
        this.A04 = j11;
        this.A03 = i4;
        this.A01 = i9;
        this.A00 = c62;
    }

    public final float A00() {
        return this.A00.A00;
    }

    public final long A01() {
        return this.A00.A01;
    }

    public final boolean A02() {
        return this.A02 == 3 || this.A02 == 4;
    }
}
