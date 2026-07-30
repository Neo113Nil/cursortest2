package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class JO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C2399qI A07;
    public final long[] A08;
    public final long[] A09;
    public final JP[] A0A;

    public JO(int i, int i4, long j9, long j10, long j11, C2399qI c2399qI, int i9, JP[] jpArr, int i10, long[] jArr, long[] jArr2) {
        this.A00 = i;
        this.A03 = i4;
        this.A06 = j9;
        this.A05 = j10;
        this.A04 = j11;
        this.A07 = c2399qI;
        this.A02 = i9;
        this.A0A = jpArr;
        this.A01 = i10;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final JP A00(int i) {
        if (this.A0A == null) {
            return null;
        }
        return this.A0A[i];
    }
}
