package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class AFh1dSDK implements AFh1bSDK {
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.12.6", null, 4, null);

    @Override // com.appsflyer.internal.AFh1bSDK
    public final void values(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFInAppEventParameterName = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFh1bSDK
    public final Map<String, Object> AFKeystoreWrapper() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), TuplesKt.to("version", this.AFInAppEventParameterName.getVersion()));
        if (!this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            mutableMapOf.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return mutableMapOf;
    }
}
