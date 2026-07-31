package com.my.tracker.ads;

import com.my.tracker.obfuscated.AbstractC1632f1;

/* loaded from: classes2.dex */
public final class AdEvent extends AbstractC1632f1 {
    public final String adFormat;
    public final String adId;
    public final String currency;
    public final int network;
    public final String placementId;
    public final double revenue;
    public final String source;

    AdEvent(int i4, int i5, double d4, String str, String str2, String str3, String str4, String str5) {
        super(i4);
        this.network = i5;
        this.revenue = d4;
        this.currency = str;
        this.source = str2;
        this.placementId = str3;
        this.adId = str4;
        this.adFormat = str5;
    }
}
