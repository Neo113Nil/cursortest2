package com.appsflyer.internal.platform_extension;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.I;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class PluginInfo {
    private final Map<String, String> additionalParams;
    private final Plugin plugin;
    private final String version;

    public PluginInfo(Plugin plugin, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.plugin = plugin;
        this.version = str;
        this.additionalParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            plugin = pluginInfo.plugin;
        }
        if ((i2 & 2) != 0) {
            str = pluginInfo.version;
        }
        if ((i2 & 4) != 0) {
            map = pluginInfo.additionalParams;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    public final Plugin component1() {
        return this.plugin;
    }

    public final String component2() {
        return this.version;
    }

    public final Map<String, String> component3() {
        return this.additionalParams;
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
        return this.plugin == pluginInfo.plugin && Intrinsics.a(this.version, pluginInfo.version) && Intrinsics.a(this.additionalParams, pluginInfo.additionalParams);
    }

    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    public final Plugin getPlugin() {
        return this.plugin;
    }

    public final String getVersion() {
        return this.version;
    }

    public final int hashCode() {
        return this.additionalParams.hashCode() + ((this.version.hashCode() + (this.plugin.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PluginInfo(plugin=" + this.plugin + ", version=" + this.version + ", additionalParams=" + this.additionalParams + ")";
    }

    public /* synthetic */ PluginInfo(Plugin plugin, String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(plugin, str, (i2 & 4) != 0 ? I.c() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PluginInfo(Plugin plugin, String str) {
        this(plugin, str, null, 4, null);
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
    }
}
