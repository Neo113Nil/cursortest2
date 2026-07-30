package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import defpackage.hk0;
import defpackage.ik0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class AFi1kSDK implements AFi1lSDK {
    private PluginInfo getMonetizationNetwork = new PluginInfo(Plugin.NATIVE, "6.18.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    public final Map<String, Object> getRevenue() {
        Pair[] pairArr = {new Pair("platform", this.getMonetizationNetwork.getPlugin().getPluginName()), new Pair("version", this.getMonetizationNetwork.getVersion())};
        LinkedHashMap linkedHashMap = new LinkedHashMap(hk0.a(2));
        ik0.d(linkedHashMap, pairArr);
        if (!this.getMonetizationNetwork.getAdditionalParams().isEmpty()) {
            linkedHashMap.put("extras", this.getMonetizationNetwork.getAdditionalParams());
        }
        return linkedHashMap;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void getRevenue(PluginInfo pluginInfo) {
        pluginInfo.getClass();
        this.getMonetizationNetwork = pluginInfo;
    }
}
