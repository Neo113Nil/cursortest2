package com.startapp.sdk.internal;

import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.PlacementConfig;
import com.startapp.sdk.ads.external.config.StrategyConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* loaded from: classes.dex */
public abstract class d7 {
    public static final boolean a(boolean z, String str, boolean z2, boolean z3) {
        ExternalAdConfig v;
        AdUnitConfig adUnitConfig;
        if (str == null || (v = MetaData.E().v()) == null || (adUnitConfig = v.getMapping().get(str)) == null || !adUnitConfig.isValid()) {
            return false;
        }
        StrategyConfig strategies = v.getStrategies();
        PlacementConfig banner = z2 ? strategies.getBanner() : z3 ? strategies.getRewarded() : strategies.getInterstitial();
        return z ? banner.isFallbackActive() : si.a(banner.getRatio());
    }
}
