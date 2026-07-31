package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class am2 implements di2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InstreamAdRequestConfiguration f23383a;

    public am2(@NotNull InstreamAdRequestConfiguration adRequestConfiguration) {
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        this.f23383a = adRequestConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.di2
    @NotNull
    public final String a() {
        return this.f23383a.getPageId();
    }

    @Override // com.yandex.mobile.ads.impl.di2
    @NotNull
    public final String b() {
        return this.f23383a.getCategoryId();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am2) && Intrinsics.areEqual(this.f23383a, ((am2) obj).f23383a);
    }

    @Override // com.yandex.mobile.ads.impl.di2
    @NotNull
    public final Map<String, String> getParameters() {
        Map<String, String> parameters = this.f23383a.getParameters();
        if (parameters != null) {
            return parameters;
        }
        Map<String, String> map = Collections.EMPTY_MAP;
        Intrinsics.checkNotNullExpressionValue(map, "emptyMap(...)");
        return map;
    }

    public final int hashCode() {
        return this.f23383a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YandexInstreamAdRequestConfigurationAdapter(adRequestConfiguration=" + this.f23383a + ")";
    }
}
