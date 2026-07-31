package com.startapp.sdk.adsbase.cache;

import com.startapp.sdk.adsbase.model.AdPreferences;
import java.io.Serializable;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class DiskAdCacheManager$DiskCacheKey implements Serializable {
    private static final long serialVersionUID = 7401552775422045093L;
    protected AdPreferences adPreferences;
    private int numberOfLoadedAd;
    protected AdPreferences.Placement placement;

    public DiskAdCacheManager$DiskCacheKey(AdPreferences.Placement placement, AdPreferences adPreferences) {
        this.placement = placement;
        this.adPreferences = adPreferences;
    }

    public final int a() {
        return this.numberOfLoadedAd;
    }

    public final void a(int i) {
        this.numberOfLoadedAd = i;
    }
}
