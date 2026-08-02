package com.squareup.cash.util.country;

import java.util.LinkedHashMap;
import kotlin.collections.MapsKt__MapsJVMKt;

/* loaded from: classes.dex */
public abstract class UtilKt {
    public static final LinkedHashMap SUPPORTED_COUNTRY_MAP;
    public static final LinkedHashMap SUPPORTED_REGION_MAP;

    static {
        SupportedCountryConfig[] values = SupportedCountryConfig.values();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(values.length);
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (SupportedCountryConfig supportedCountryConfig : values) {
            linkedHashMap.put(supportedCountryConfig.country, supportedCountryConfig);
        }
        SUPPORTED_COUNTRY_MAP = linkedHashMap;
        SupportedCountryConfig[] values2 = SupportedCountryConfig.values();
        int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(values2.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
        for (SupportedCountryConfig supportedCountryConfig2 : values2) {
            linkedHashMap2.put(supportedCountryConfig2.region, supportedCountryConfig2);
        }
        SUPPORTED_REGION_MAP = linkedHashMap2;
    }
}
