package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2036k6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f28072a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28073b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28074c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<AdQualityVerifiableNetwork, C2313w6> f28075d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Set<String> f28076e;

    public C2036k6(int i4, boolean z4, boolean z5, @NotNull LinkedHashMap adNetworksCustomParameters, @NotNull Set enabledAdUnits) {
        Intrinsics.checkNotNullParameter(adNetworksCustomParameters, "adNetworksCustomParameters");
        Intrinsics.checkNotNullParameter(enabledAdUnits, "enabledAdUnits");
        this.f28072a = i4;
        this.f28073b = z4;
        this.f28074c = z5;
        this.f28075d = adNetworksCustomParameters;
        this.f28076e = enabledAdUnits;
    }

    @NotNull
    public final Map<AdQualityVerifiableNetwork, C2313w6> a() {
        return this.f28075d;
    }

    public final boolean b() {
        return this.f28074c;
    }

    public final boolean c() {
        return this.f28073b;
    }

    @NotNull
    public final Set<String> d() {
        return this.f28076e;
    }

    public final int e() {
        return this.f28072a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2036k6)) {
            return false;
        }
        C2036k6 c2036k6 = (C2036k6) obj;
        return this.f28072a == c2036k6.f28072a && this.f28073b == c2036k6.f28073b && this.f28074c == c2036k6.f28074c && Intrinsics.areEqual(this.f28075d, c2036k6.f28075d) && Intrinsics.areEqual(this.f28076e, c2036k6.f28076e);
    }

    public final int hashCode() {
        return this.f28076e.hashCode() + ((this.f28075d.hashCode() + C1965h6.a(this.f28074c, C1965h6.a(this.f28073b, Integer.hashCode(this.f28072a) * 31, 31), 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdQualityVerificationPolicy(usagePercent=" + this.f28072a + ", enabled=" + this.f28073b + ", blockAdOnInternalError=" + this.f28074c + ", adNetworksCustomParameters=" + this.f28075d + ", enabledAdUnits=" + this.f28076e + ")";
    }
}
