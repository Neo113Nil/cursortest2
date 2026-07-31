package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.banner.MediatedBannerSize;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class az0 {
    @Nullable
    public static JSONObject a(@NotNull xy0 mediationNetwork, @NotNull String bidderToken, @Nullable MediatedBannerSize mediatedBannerSize) {
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        Intrinsics.checkNotNullParameter(bidderToken, "bidderToken");
        String e4 = mediationNetwork.e();
        Map<String, String> f4 = mediationNetwork.f();
        Map<String, String> i4 = mediationNetwork.i();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.ironsource.ge.f16389B1, e4);
            if (f4 != null) {
                jSONObject.put("bidding_info", new JSONObject(f4));
            }
            jSONObject.put("network_data", new JSONObject(i4));
            jSONObject.put("bidder_token", bidderToken);
            if (mediatedBannerSize != null) {
                jSONObject.put("size", new JSONObject(mediatedBannerSize.toSizeData()));
            }
            return jSONObject;
        } catch (JSONException unused) {
            ap0.c(new Object[0]);
            return null;
        }
    }
}
