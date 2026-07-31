package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class d90 extends y90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pz1 f24506a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f24507b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<pk1> f24508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d90(@NotNull pz1 sliderAd, @NotNull C2360y7 adResponse, @NotNull ArrayList preloadedDivKitDesigns) {
        super(0);
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(preloadedDivKitDesigns, "preloadedDivKitDesigns");
        this.f24506a = sliderAd;
        this.f24507b = adResponse;
        this.f24508c = preloadedDivKitDesigns;
    }

    @NotNull
    public final C2360y7<String> a() {
        return this.f24507b;
    }

    @NotNull
    public final List<pk1> b() {
        return this.f24508c;
    }

    @NotNull
    public final pz1 c() {
        return this.f24506a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d90)) {
            return false;
        }
        d90 d90Var = (d90) obj;
        return Intrinsics.areEqual(this.f24506a, d90Var.f24506a) && Intrinsics.areEqual(this.f24507b, d90Var.f24507b) && Intrinsics.areEqual(this.f24508c, d90Var.f24508c);
    }

    public final int hashCode() {
        return this.f24508c.hashCode() + ((this.f24507b.hashCode() + (this.f24506a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "FeedItem(sliderAd=" + this.f24506a + ", adResponse=" + this.f24507b + ", preloadedDivKitDesigns=" + this.f24508c + ")";
    }
}
