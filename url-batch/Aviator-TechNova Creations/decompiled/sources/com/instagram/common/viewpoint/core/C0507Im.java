package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Im, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0507Im {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C1836or A07;
    public final long[] A08;
    public final long[] A09;
    public final C0508In[] A0A;

    public C0507Im(int i, int i2, long j, long j2, long j3, C1836or c1836or, int i3, C0508In[] c0508InArr, int i4, long[] jArr, long[] jArr2) {
        this.A00 = i;
        this.A03 = i2;
        this.A06 = j;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = c1836or;
        this.A02 = i3;
        this.A0A = c0508InArr;
        this.A01 = i4;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C0508In A00(int i) {
        if (this.A0A == null) {
            return null;
        }
        return this.A0A[i];
    }
}
