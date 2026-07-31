package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lx0 {
    @NotNull
    public static Map a(@NotNull bx0 mediatedAdData) {
        Intrinsics.checkNotNullParameter(mediatedAdData, "mediatedAdData");
        MediatedAdapterInfo b4 = mediatedAdData.b();
        String adapterVersion = b4.getAdapterVersion();
        if (adapterVersion == null) {
            adapterVersion = "null";
        }
        Pair pair = TuplesKt.to("mediation_adapter_version", adapterVersion);
        String networkName = b4.getNetworkName();
        if (networkName == null) {
            networkName = "null";
        }
        Pair pair2 = TuplesKt.to("mediation_network_name", networkName);
        String networkSdkVersion = b4.getNetworkSdkVersion();
        return MapsKt.mapOf(pair, pair2, TuplesKt.to("mediation_network_sdk_version", networkSdkVersion != null ? networkSdkVersion : "null"));
    }
}
