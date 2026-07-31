package com.facebook.ads.redexgen.core;

import com.facebook.ads.redexgen.core.AbstractC2252Eh;

/* renamed from: com.facebook.ads.redexgen.X.Eh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2252Eh<T extends AbstractC2252Eh<T>> {
    public final int A00;
    public final int A01;
    public final C3778qI A02;
    public final C3741pg A03;

    public abstract int A08();

    public abstract boolean A09(T t);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Eh != com.facebook.ads.androidx.media3.exoplayer.trackselection.DefaultTrackSelector$TrackInfo<T extends com.facebook.ads.redexgen.X.Eh<T>> */
    public AbstractC2252Eh(int i, C3741pg c3741pg, int i2) {
        this.A00 = i;
        this.A03 = c3741pg;
        this.A01 = i2;
        this.A02 = c3741pg.A08(i2);
    }
}
