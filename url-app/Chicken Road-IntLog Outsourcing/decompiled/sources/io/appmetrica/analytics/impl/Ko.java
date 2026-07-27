package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ko implements InterfaceC0990t {
    @Override // io.appmetrica.analytics.impl.InterfaceC0990t
    public final Map<String, String> a(Map<String, String> map) {
        map.put(AdRevenueConstants.SOURCE_KEY, "yandex");
        return map;
    }
}
