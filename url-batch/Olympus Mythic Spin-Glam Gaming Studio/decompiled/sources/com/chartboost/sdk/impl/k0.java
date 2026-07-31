package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class k0 {
    public static final k0 a = new k0();

    public final boolean a(c0 c0Var, boolean z, EndpointConfig endpointConfig) {
        String rewarded;
        if (!z) {
            return false;
        }
        if (Intrinsics.areEqual(c0Var, c0.a.g)) {
            rewarded = endpointConfig.getBanner();
        } else if (Intrinsics.areEqual(c0Var, c0.b.g)) {
            rewarded = endpointConfig.getInterstitial();
        } else {
            if (!Intrinsics.areEqual(c0Var, c0.c.g)) {
                throw new NoWhenBranchMatchedException();
            }
            rewarded = endpointConfig.getRewarded();
        }
        return rewarded.length() > 0;
    }

    public final Pair a(q1 appRequest, tb params, Function2 loadOpenRTBAd, Function2 loadAdGet, Function2 loadNrpAd, c0 adType, boolean z, EndpointConfig nrpWaterfallEndpoints) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadOpenRTBAd, "loadOpenRTBAd");
        Intrinsics.checkNotNullParameter(loadAdGet, "loadAdGet");
        Intrinsics.checkNotNullParameter(loadNrpAd, "loadNrpAd");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(nrpWaterfallEndpoints, "nrpWaterfallEndpoints");
        if (appRequest.c() != null) {
            return new Pair(loadOpenRTBAd, params);
        }
        if (a(adType, z, nrpWaterfallEndpoints)) {
            return new Pair(loadNrpAd, params);
        }
        return new Pair(loadAdGet, params);
    }
}
