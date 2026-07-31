package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import com.yandex.mobile.ads.impl.EnumC1941g6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.y6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2359y6 {
    @NotNull
    public static C2036k6 a(@NotNull C1989i6 sdkAdQualityConfiguration) {
        Object obj;
        Intrinsics.checkNotNullParameter(sdkAdQualityConfiguration, "sdkAdQualityConfiguration");
        int g4 = sdkAdQualityConfiguration.g();
        boolean e4 = sdkAdQualityConfiguration.e();
        boolean c4 = sdkAdQualityConfiguration.c();
        Map<String, C2012j6> a4 = sdkAdQualityConfiguration.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = a4.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            EnumC1941g6.a aVar = EnumC1941g6.f26009c;
            String value = (String) entry.getKey();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<E> it2 = EnumC1941g6.a().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.areEqual(((EnumC1941g6) obj).b(), value)) {
                    break;
                }
            }
            AdQualityVerifiableNetwork a5 = EnumC1941g6.a.a((EnumC1941g6) obj);
            if (a5 != null) {
                linkedHashMap.put(a5, new C2313w6(((C2012j6) entry.getValue()).a(), ((C2012j6) entry.getValue()).b()));
            }
        }
        return new C2036k6(g4, e4, c4, linkedHashMap, sdkAdQualityConfiguration.f());
    }
}
