package com.yandex.mobile.ads.impl;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.i6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1989i6 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27106a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27107b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f27108c;

    /* renamed from: d, reason: collision with root package name */
    private final long f27109d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27110e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f27111f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Set<String> f27112g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Map<String, C2012j6> f27113h;

    public C1989i6(boolean z4, boolean z5, @NotNull String apiKey, long j4, int i4, boolean z6, @NotNull Set<String> enabledAdUnits, @NotNull Map<String, C2012j6> adNetworksCustomParameters) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(enabledAdUnits, "enabledAdUnits");
        Intrinsics.checkNotNullParameter(adNetworksCustomParameters, "adNetworksCustomParameters");
        this.f27106a = z4;
        this.f27107b = z5;
        this.f27108c = apiKey;
        this.f27109d = j4;
        this.f27110e = i4;
        this.f27111f = z6;
        this.f27112g = enabledAdUnits;
        this.f27113h = adNetworksCustomParameters;
    }

    @NotNull
    public final Map<String, C2012j6> a() {
        return this.f27113h;
    }

    @NotNull
    public final String b() {
        return this.f27108c;
    }

    public final boolean c() {
        return this.f27111f;
    }

    public final boolean d() {
        return this.f27107b;
    }

    public final boolean e() {
        return this.f27106a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1989i6)) {
            return false;
        }
        C1989i6 c1989i6 = (C1989i6) obj;
        return this.f27106a == c1989i6.f27106a && this.f27107b == c1989i6.f27107b && Intrinsics.areEqual(this.f27108c, c1989i6.f27108c) && this.f27109d == c1989i6.f27109d && this.f27110e == c1989i6.f27110e && this.f27111f == c1989i6.f27111f && Intrinsics.areEqual(this.f27112g, c1989i6.f27112g) && Intrinsics.areEqual(this.f27113h, c1989i6.f27113h);
    }

    @NotNull
    public final Set<String> f() {
        return this.f27112g;
    }

    public final int g() {
        return this.f27110e;
    }

    public final long h() {
        return this.f27109d;
    }

    public final int hashCode() {
        return this.f27113h.hashCode() + ((this.f27112g.hashCode() + C1965h6.a(this.f27111f, sx1.a(this.f27110e, (Long.hashCode(this.f27109d) + C1842c3.a(this.f27108c, C1965h6.a(this.f27107b, Boolean.hashCode(this.f27106a) * 31, 31), 31)) * 31, 31), 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AdQualityVerificationConfiguration(enabled=" + this.f27106a + ", debug=" + this.f27107b + ", apiKey=" + this.f27108c + ", validationTimeoutInSec=" + this.f27109d + ", usagePercent=" + this.f27110e + ", blockAdOnInternalError=" + this.f27111f + ", enabledAdUnits=" + this.f27112g + ", adNetworksCustomParameters=" + this.f27113h + ")";
    }
}
