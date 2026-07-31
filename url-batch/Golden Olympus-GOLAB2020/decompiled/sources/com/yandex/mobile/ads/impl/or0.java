package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class or0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pz1 f30185a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f30186b;

    public or0(@NotNull pz1 sliderAd, @NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f30185a = sliderAd;
        this.f30186b = adResponse;
    }

    @NotNull
    public final C2360y7<String> a() {
        return this.f30186b;
    }

    @NotNull
    public final pz1 b() {
        return this.f30185a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or0)) {
            return false;
        }
        or0 or0Var = (or0) obj;
        return Intrinsics.areEqual(this.f30185a, or0Var.f30185a) && Intrinsics.areEqual(this.f30186b, or0Var.f30186b);
    }

    public final int hashCode() {
        return this.f30186b.hashCode() + (this.f30185a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "LoadedFeedItem(sliderAd=" + this.f30185a + ", adResponse=" + this.f30186b + ")";
    }
}
