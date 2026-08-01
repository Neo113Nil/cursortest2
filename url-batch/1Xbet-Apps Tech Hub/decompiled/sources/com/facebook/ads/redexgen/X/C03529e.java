package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.9e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03529e {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AbstractC03729z A03;
    public final EW A04;
    public final TrackGroupArray A05;
    public final GS A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C03529e(AbstractC03729z abstractC03729z, long j, TrackGroupArray trackGroupArray, GS gs) {
        this(abstractC03729z, null, new EW(0), j, -9223372036854775807L, 1, false, trackGroupArray, gs);
    }

    public C03529e(AbstractC03729z abstractC03729z, Object obj, EW ew, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, GS gs) {
        this.A03 = abstractC03729z;
        this.A07 = obj;
        this.A04 = ew;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = gs;
    }

    public static void A00(C03529e c03529e, C03529e c03529e2) {
        c03529e2.A0A = c03529e.A0A;
        c03529e2.A09 = c03529e.A09;
    }

    public final C03529e A01(int i) {
        C03529e c03529e = new C03529e(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c03529e);
        return c03529e;
    }

    public final C03529e A02(int i) {
        C03529e playbackInfo = new C03529e(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C03529e A03(AbstractC03729z abstractC03729z, Object obj) {
        C03529e playbackInfo = new C03529e(abstractC03729z, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C03529e A04(EW ew, long j, long j2) {
        long j3 = j2;
        AbstractC03729z abstractC03729z = this.A03;
        Object obj = this.A07;
        if (!ew.A01()) {
            j3 = -9223372036854775807L;
        }
        return new C03529e(abstractC03729z, obj, ew, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final C03529e A05(TrackGroupArray trackGroupArray, GS gs) {
        C03529e playbackInfo = new C03529e(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, gs);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C03529e A06(boolean z) {
        C03529e playbackInfo = new C03529e(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
