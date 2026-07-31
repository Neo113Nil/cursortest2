package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ck1 {
    @NotNull
    public static LinkedHashMap a(@NotNull ak1 prefetchedMediationInfo) {
        Intrinsics.checkNotNullParameter(prefetchedMediationInfo, "prefetchedMediationInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(com.ironsource.ge.f16389B1, prefetchedMediationInfo.a());
        fk1 b4 = prefetchedMediationInfo.b();
        if (b4 != null) {
            linkedHashMap.put("winner_name", b4.b());
            linkedHashMap.put("winner_ad_unit", b4.a());
        }
        String lowerCase = prefetchedMediationInfo.c().c().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        linkedHashMap.put("status", lowerCase);
        Integer d4 = prefetchedMediationInfo.c().d();
        if (d4 != null) {
            linkedHashMap.put("error_code", String.valueOf(d4.intValue()));
        }
        String b5 = prefetchedMediationInfo.c().b();
        if (b5 != null) {
            linkedHashMap.put("error_message", b5);
        }
        return linkedHashMap;
    }
}
