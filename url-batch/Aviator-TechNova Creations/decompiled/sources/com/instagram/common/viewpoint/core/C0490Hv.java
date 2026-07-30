package com.instagram.common.viewpoint.core;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Hv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0490Hv {
    public final int A00;
    public final long A01;
    public final long A02;

    public C0490Hv(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ C0490Hv(int i, long j, long j2, C0489Hu c0489Hu) {
        this(i, j, j2);
    }

    public static C0490Hv A00(Parcel parcel) {
        return new C0490Hv(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
