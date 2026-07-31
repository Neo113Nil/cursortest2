package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ee, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2598ee implements InterfaceC2947s {
    @Override // io.appmetrica.analytics.impl.InterfaceC2947s
    @NotNull
    public final Map<String, String> a(@NotNull Map<String, String> map) {
        map.put(AdRevenueConstants.LAYER_KEY, "native");
        return map;
    }
}
