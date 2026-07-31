package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c92;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class th2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Map<c92.a, String> f32443a = MapsKt.mapOf(TuplesKt.to(c92.a.f24128d, "Screen is locked"), TuplesKt.to(c92.a.f24129e, "Asset value %s doesn't match view value"), TuplesKt.to(c92.a.f24130f, "No ad view"), TuplesKt.to(c92.a.f24131g, "No valid ads in ad unit"), TuplesKt.to(c92.a.f24132h, "No visible sponsored asset"), TuplesKt.to(c92.a.f24133i, "No visible required assets"), TuplesKt.to(c92.a.f24134j, "Ad view is not added to hierarchy"), TuplesKt.to(c92.a.f24135k, "Ad is not visible for percent"), TuplesKt.to(c92.a.f24136l, "Required asset %s is not visible in ad view"), TuplesKt.to(c92.a.f24137m, "Required asset %s is not subview of ad view"), TuplesKt.to(c92.a.f24127c, "Unknown error, that shouldn't happen"), TuplesKt.to(c92.a.f24138n, "Ad view is null"), TuplesKt.to(c92.a.f24139o, "Ad view is hidden"), TuplesKt.to(c92.a.f24140p, "View is too small"), TuplesKt.to(c92.a.f24141q, "Visible area of an ad view is too small"));

    @NotNull
    public static String a(@NotNull c92 validationResult) {
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        String a4 = validationResult.a();
        String str = f32443a.get(validationResult.b());
        if (str == null) {
            return "Visibility error";
        }
        kotlin.jvm.internal.L l4 = kotlin.jvm.internal.L.f41137a;
        return C2284v0.a(new Object[]{a4}, 1, str, "format(...)");
    }
}
