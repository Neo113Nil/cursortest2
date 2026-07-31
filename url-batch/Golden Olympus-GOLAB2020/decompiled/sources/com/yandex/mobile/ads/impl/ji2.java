package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ji2 {
    @NotNull
    public static pq1 a(@NotNull lc1 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        int i4 = response.f28505a;
        tq1 tq1Var = new tq1(response.f28506b);
        Map<String, String> map = response.f28507c;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        return new pq1(i4, tq1Var, map);
    }
}
