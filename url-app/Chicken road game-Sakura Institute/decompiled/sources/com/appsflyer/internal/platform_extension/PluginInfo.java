package com.appsflyer.internal.platform_extension;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z2.C1412P;

@Metadata
/* loaded from: classes.dex */
public final class PluginInfo {
    private final Plugin AFInAppEventParameterName;
    private final Map<String, String> AFInAppEventType;
    private final String valueOf;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PluginInfo(Plugin plugin, String str) {
        this(plugin, str, null, 4, null);
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            plugin = pluginInfo.AFInAppEventParameterName;
        }
        if ((i2 & 2) != 0) {
            str = pluginInfo.valueOf;
        }
        if ((i2 & 4) != 0) {
            map = pluginInfo.AFInAppEventType;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    public final Plugin component1() {
        return this.AFInAppEventParameterName;
    }

    public final String component2() {
        return this.valueOf;
    }

    public final Map<String, String> component3() {
        return this.AFInAppEventType;
    }

    public final PluginInfo copy(Plugin plugin, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new PluginInfo(plugin, str, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) obj;
        return this.AFInAppEventParameterName == pluginInfo.AFInAppEventParameterName && Intrinsics.a(this.valueOf, pluginInfo.valueOf) && Intrinsics.a(this.AFInAppEventType, pluginInfo.AFInAppEventType);
    }

    public final Map<String, String> getAdditionalParams() {
        return this.AFInAppEventType;
    }

    public final Plugin getPlugin() {
        return this.AFInAppEventParameterName;
    }

    public final String getVersion() {
        return this.valueOf;
    }

    public final int hashCode() {
        return this.AFInAppEventType.hashCode() + ((this.valueOf.hashCode() + (this.AFInAppEventParameterName.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginInfo(plugin=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", version=");
        sb.append(this.valueOf);
        sb.append(", additionalParams=");
        sb.append(this.AFInAppEventType);
        sb.append(')');
        return sb.toString();
    }

    public PluginInfo(Plugin plugin, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.AFInAppEventParameterName = plugin;
        this.valueOf = str;
        this.AFInAppEventType = map;
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i2 & 4) != 0 ? C1412P.c() : map);
    }
}
