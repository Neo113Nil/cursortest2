package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f27127a;

    public i71(@NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f27127a = adConfiguration;
    }

    @NotNull
    public final Map<String, Object> a() {
        Map<String, Object> mapOf;
        List<String> l4 = this.f27127a.l();
        if (l4.isEmpty()) {
            l4 = null;
        }
        return (l4 == null || (mapOf = MapsKt.mapOf(TuplesKt.to("image_sizes", CollectionsKt.toList(l4)))) == null) ? MapsKt.emptyMap() : mapOf;
    }
}
