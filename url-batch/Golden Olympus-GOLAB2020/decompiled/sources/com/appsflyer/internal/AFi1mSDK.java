package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.ironsource.ge;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFi1mSDK implements AFi1lSDK {
    private PluginInfo getCurrencyIso4217Code = new PluginInfo(Plugin.NATIVE, "6.17.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void AFAdRevenueData(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getCurrencyIso4217Code = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final Map<String, Object> getMediationNetwork() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(ge.f16399G, this.getCurrencyIso4217Code.getPlugin().getPluginName()), TuplesKt.to("version", this.getCurrencyIso4217Code.getVersion()));
        if (!this.getCurrencyIso4217Code.getAdditionalParams().isEmpty()) {
            mutableMapOf.put("extras", this.getCurrencyIso4217Code.getAdditionalParams());
        }
        return mutableMapOf;
    }
}
