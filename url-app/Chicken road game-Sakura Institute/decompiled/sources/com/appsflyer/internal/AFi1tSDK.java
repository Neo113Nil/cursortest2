package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import z2.C1412P;

/* loaded from: classes.dex */
public final class AFi1tSDK implements AFi1sSDK {
    private PluginInfo valueOf = new PluginInfo(Plugin.NATIVE, "6.14.0", null, 4, null);

    @Override // com.appsflyer.internal.AFi1sSDK
    public final void AFKeystoreWrapper(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.valueOf = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1sSDK
    public final Map<String, Object> values() {
        LinkedHashMap f4 = C1412P.f(new Pair("platform", this.valueOf.getPlugin().getPluginName()), new Pair("version", this.valueOf.getVersion()));
        if (!this.valueOf.getAdditionalParams().isEmpty()) {
            f4.put("extras", this.valueOf.getAdditionalParams());
        }
        return f4;
    }
}
