package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1918f7 f27546a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final p91 f27547b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final s91 f27548c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final bq1<n61> f27549d;

    /* renamed from: e, reason: collision with root package name */
    private final int f27550e;

    public j61(@NotNull C1918f7 adRequestData, @NotNull p91 nativeResponseType, @NotNull k61 requestPolicy, int i4) {
        s91 sourceType = s91.f31631c;
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(nativeResponseType, "nativeResponseType");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        this.f27546a = adRequestData;
        this.f27547b = nativeResponseType;
        this.f27548c = sourceType;
        this.f27549d = requestPolicy;
        this.f27550e = i4;
    }

    @NotNull
    public final C1918f7 a() {
        return this.f27546a;
    }

    public final int b() {
        return this.f27550e;
    }

    @NotNull
    public final p91 c() {
        return this.f27547b;
    }

    @NotNull
    public final bq1<n61> d() {
        return this.f27549d;
    }

    @NotNull
    public final s91 e() {
        return this.f27548c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j61)) {
            return false;
        }
        j61 j61Var = (j61) obj;
        return Intrinsics.areEqual(this.f27546a, j61Var.f27546a) && this.f27547b == j61Var.f27547b && this.f27548c == j61Var.f27548c && Intrinsics.areEqual(this.f27549d, j61Var.f27549d) && this.f27550e == j61Var.f27550e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27550e) + ((this.f27549d.hashCode() + ((this.f27548c.hashCode() + ((this.f27547b.hashCode() + (this.f27546a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "NativeAdRequestData(adRequestData=" + this.f27546a + ", nativeResponseType=" + this.f27547b + ", sourceType=" + this.f27548c + ", requestPolicy=" + this.f27549d + ", adsCount=" + this.f27550e + ")";
    }
}
