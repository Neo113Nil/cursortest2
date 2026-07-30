package com.appsflyer.internal.platform_extension;

import defpackage.mi1;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class PluginInfo {
    private final Plugin AFInAppEventType;
    private final Map<String, String> valueOf;
    private final String values;

    public PluginInfo(Plugin plugin, String str, Map<String, String> map) {
        plugin.getClass();
        str.getClass();
        map.getClass();
        this.AFInAppEventType = plugin;
        this.values = str;
        this.valueOf = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            plugin = pluginInfo.AFInAppEventType;
        }
        if ((i & 2) != 0) {
            str = pluginInfo.values;
        }
        if ((i & 4) != 0) {
            map = pluginInfo.valueOf;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    public final Plugin component1() {
        return this.AFInAppEventType;
    }

    public final String component2() {
        return this.values;
    }

    public final Map<String, String> component3() {
        return this.valueOf;
    }

    public final PluginInfo copy(Plugin plugin, String str, Map<String, String> map) {
        plugin.getClass();
        str.getClass();
        map.getClass();
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
        return this.AFInAppEventType == pluginInfo.AFInAppEventType && Intrinsics.b(this.values, pluginInfo.values) && Intrinsics.b(this.valueOf, pluginInfo.valueOf);
    }

    public final Map<String, String> getAdditionalParams() {
        return this.valueOf;
    }

    public final Plugin getPlugin() {
        return this.AFInAppEventType;
    }

    public final String getVersion() {
        return this.values;
    }

    public final int hashCode() {
        return this.valueOf.hashCode() + ((this.values.hashCode() + (this.AFInAppEventType.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginInfo(plugin=");
        sb.append(this.AFInAppEventType);
        sb.append(", version=");
        sb.append(this.values);
        sb.append(", additionalParams=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PluginInfo(Plugin plugin, String str) {
        this(plugin, str, null, 4, null);
        plugin.getClass();
        str.getClass();
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i & 4) != 0 ? mi1.c() : map);
    }
}
