package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.Jz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1019Jz {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final SparseArray<K0> A09;
    public final boolean A0A;

    public C1019Jz(int i, boolean z8, int i4, int i9, int i10, int i11, int i12, int i13, int i14, int i15, SparseArray<K0> sparseArray) {
        this.A03 = i;
        this.A0A = z8;
        this.A08 = i4;
        this.A02 = i9;
        this.A04 = i10;
        this.A01 = i11;
        this.A00 = i12;
        this.A07 = i13;
        this.A06 = i14;
        this.A05 = i15;
        this.A09 = sparseArray;
    }

    public final void A00(C1019Jz c1019Jz) {
        SparseArray<K0> sparseArray = c1019Jz.A09;
        for (int i = 0; i < sparseArray.size(); i++) {
            SparseArray<K0> sparseArray2 = this.A09;
            int i4 = sparseArray.keyAt(i);
            sparseArray2.put(i4, sparseArray.valueAt(i));
        }
    }
}
