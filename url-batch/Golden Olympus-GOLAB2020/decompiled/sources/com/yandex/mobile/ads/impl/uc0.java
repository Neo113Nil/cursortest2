package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class uc0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f33031a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33032b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final av1 f33033c;

    public uc0(@NotNull C2360y7<?> adResponse, @NotNull String htmlResponse, @NotNull av1 sdkFullscreenHtmlAd) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        Intrinsics.checkNotNullParameter(sdkFullscreenHtmlAd, "sdkFullscreenHtmlAd");
        this.f33031a = adResponse;
        this.f33032b = htmlResponse;
        this.f33033c = sdkFullscreenHtmlAd;
    }

    @NotNull
    public final C2360y7<?> a() {
        return this.f33031a;
    }

    @NotNull
    public final av1 b() {
        return this.f33033c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        return Intrinsics.areEqual(this.f33031a, uc0Var.f33031a) && Intrinsics.areEqual(this.f33032b, uc0Var.f33032b) && Intrinsics.areEqual(this.f33033c, uc0Var.f33033c);
    }

    public final int hashCode() {
        return this.f33033c.hashCode() + C1842c3.a(this.f33032b, this.f33031a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "FullScreenDataHolder(adResponse=" + this.f33031a + ", htmlResponse=" + this.f33032b + ", sdkFullscreenHtmlAd=" + this.f33033c + ")";
    }
}
