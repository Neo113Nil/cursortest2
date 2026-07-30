package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFf1lSDK implements AFf1mSDK {
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.12.1", null, 4, null);

    @Override // com.appsflyer.internal.AFf1mSDK
    public final void values(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFInAppEventParameterName = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public final Map<String, Object> AFInAppEventParameterName() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), TuplesKt.to("version", this.AFInAppEventParameterName.getVersion()));
        if (!this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            mutableMapOf.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return mutableMapOf;
    }
}
