package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1828bd {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23711a;

    public C1828bd(boolean z4) {
        this.f23711a = z4;
    }

    public final boolean a() {
        return this.f23711a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1828bd) && this.f23711a == ((C1828bd) obj).f23711a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23711a);
    }

    @NotNull
    public final String toString() {
        return "AnalyticsIntegrationConfiguration(advertisingIdentifiersTracking=" + this.f23711a + ")";
    }
}
