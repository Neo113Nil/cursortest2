package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class cg1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final String f24202a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sy0 f24203b;

    public cg1(@Nullable String str, @NotNull sy0 mediationData) {
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        this.f24202a = str;
        this.f24203b = mediationData;
    }

    @NotNull
    public final Map<String, String> a() {
        String str = this.f24202a;
        return (str == null || str.length() == 0) ? this.f24203b.d() : MapsKt.plus(this.f24203b.d(), MapsKt.mapOf(TuplesKt.to("adf-resp_time", this.f24202a)));
    }
}
