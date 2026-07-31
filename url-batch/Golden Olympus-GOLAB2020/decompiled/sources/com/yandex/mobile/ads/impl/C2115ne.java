package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ne, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2115ne {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Map<EnumC2344xe, String> f29547a = MapsKt.mapOf(TuplesKt.to(EnumC2344xe.f34532c, "Network error"), TuplesKt.to(EnumC2344xe.f34533d, "Invalid response"), TuplesKt.to(EnumC2344xe.f34531b, "Unknown"));

    @NotNull
    public static String a(@Nullable EnumC2344xe enumC2344xe) {
        String str = f29547a.get(enumC2344xe);
        return str == null ? "Unknown" : str;
    }
}
