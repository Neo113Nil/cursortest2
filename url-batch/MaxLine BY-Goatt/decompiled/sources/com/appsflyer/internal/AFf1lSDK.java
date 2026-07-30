package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.facebook.internal.ServerProtocol;
import defpackage.li1;
import defpackage.mi1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFf1lSDK implements AFf1mSDK {
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.12.1", null, 4, null);

    @Override // com.appsflyer.internal.AFf1mSDK
    public final Map<String, Object> AFInAppEventParameterName() {
        Pair[] pairArr = {new Pair("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), new Pair(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.AFInAppEventParameterName.getVersion())};
        LinkedHashMap linkedHashMap = new LinkedHashMap(li1.a(2));
        mi1.g(linkedHashMap, pairArr);
        if (!this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            linkedHashMap.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return linkedHashMap;
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public final void values(PluginInfo pluginInfo) {
        pluginInfo.getClass();
        this.AFInAppEventParameterName = pluginInfo;
    }
}
