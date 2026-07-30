package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFi1tSDK implements AFi1sSDK {
    private PluginInfo valueOf = new PluginInfo(Plugin.NATIVE, "6.14.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1sSDK
    public final void AFKeystoreWrapper(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.valueOf = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1sSDK
    public final Map<String, Object> values() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("platform", this.valueOf.getPlugin().getPluginName()), TuplesKt.to("version", this.valueOf.getVersion()));
        if (!this.valueOf.getAdditionalParams().isEmpty()) {
            mutableMapOf.put("extras", this.valueOf.getAdditionalParams());
        }
        return mutableMapOf;
    }
}
