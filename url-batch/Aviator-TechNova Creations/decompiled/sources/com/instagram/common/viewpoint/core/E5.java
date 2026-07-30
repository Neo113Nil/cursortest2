package com.instagram.common.viewpoint.core;

import com.instagram.common.viewpoint.core.E5;

/* loaded from: assets/audience_network.dex */
public abstract class E5<T extends E5<T>> {
    public final int A00;
    public final int A01;
    public final C1836or A02;
    public final C1802oH A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.E5 != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.E5<T>> */
    public E5(int i, C1802oH c1802oH, int i2) {
        this.A00 = i;
        this.A03 = c1802oH;
        this.A01 = i2;
        this.A02 = c1802oH.A08(i2);
    }
}
