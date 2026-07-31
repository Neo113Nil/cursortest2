package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<u31> f29456a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f29457b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<String> f29458c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private final C1795a4 f29459d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f29460e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<q20> f29461f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<tx1> f29462g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private final String f29463h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private final nx1 f29464i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private final C2106n5 f29465j;

    /* JADX WARN: Multi-variable type inference failed */
    public n61(@NotNull List<u31> nativeAds, @NotNull List<? extends C2276uf<?>> assets, @NotNull List<String> renderTrackingUrls, @Nullable C1795a4 c1795a4, @NotNull Map<String, ? extends Object> properties, @NotNull List<q20> divKitDesigns, @NotNull List<tx1> showNotices, @Nullable String str, @Nullable nx1 nx1Var, @Nullable C2106n5 c2106n5) {
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(divKitDesigns, "divKitDesigns");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        this.f29456a = nativeAds;
        this.f29457b = assets;
        this.f29458c = renderTrackingUrls;
        this.f29459d = c1795a4;
        this.f29460e = properties;
        this.f29461f = divKitDesigns;
        this.f29462g = showNotices;
        this.f29463h = str;
        this.f29464i = nx1Var;
        this.f29465j = c2106n5;
    }

    public static n61 a(n61 n61Var, List nativeAds) {
        List<C2276uf<?>> assets = n61Var.f29457b;
        List<String> renderTrackingUrls = n61Var.f29458c;
        C1795a4 c1795a4 = n61Var.f29459d;
        Map<String, Object> properties = n61Var.f29460e;
        List<q20> divKitDesigns = n61Var.f29461f;
        List<tx1> showNotices = n61Var.f29462g;
        String str = n61Var.f29463h;
        nx1 nx1Var = n61Var.f29464i;
        C2106n5 c2106n5 = n61Var.f29465j;
        Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(renderTrackingUrls, "renderTrackingUrls");
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(divKitDesigns, "divKitDesigns");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        return new n61(nativeAds, assets, renderTrackingUrls, c1795a4, properties, divKitDesigns, showNotices, str, nx1Var, c2106n5);
    }

    @NotNull
    public final List<C2276uf<?>> b() {
        return this.f29457b;
    }

    @NotNull
    public final List<q20> c() {
        return this.f29461f;
    }

    @Nullable
    public final C1795a4 d() {
        return this.f29459d;
    }

    @NotNull
    public final List<u31> e() {
        return this.f29456a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n61)) {
            return false;
        }
        n61 n61Var = (n61) obj;
        return Intrinsics.areEqual(this.f29456a, n61Var.f29456a) && Intrinsics.areEqual(this.f29457b, n61Var.f29457b) && Intrinsics.areEqual(this.f29458c, n61Var.f29458c) && Intrinsics.areEqual(this.f29459d, n61Var.f29459d) && Intrinsics.areEqual(this.f29460e, n61Var.f29460e) && Intrinsics.areEqual(this.f29461f, n61Var.f29461f) && Intrinsics.areEqual(this.f29462g, n61Var.f29462g) && Intrinsics.areEqual(this.f29463h, n61Var.f29463h) && Intrinsics.areEqual(this.f29464i, n61Var.f29464i) && Intrinsics.areEqual(this.f29465j, n61Var.f29465j);
    }

    @NotNull
    public final Map<String, Object> f() {
        return this.f29460e;
    }

    @NotNull
    public final List<String> g() {
        return this.f29458c;
    }

    @Nullable
    public final nx1 h() {
        return this.f29464i;
    }

    public final int hashCode() {
        int a4 = C2039k9.a(this.f29458c, C2039k9.a(this.f29457b, this.f29456a.hashCode() * 31, 31), 31);
        C1795a4 c1795a4 = this.f29459d;
        int a5 = C2039k9.a(this.f29462g, C2039k9.a(this.f29461f, (this.f29460e.hashCode() + ((a4 + (c1795a4 == null ? 0 : c1795a4.hashCode())) * 31)) * 31, 31), 31);
        String str = this.f29463h;
        int hashCode = (a5 + (str == null ? 0 : str.hashCode())) * 31;
        nx1 nx1Var = this.f29464i;
        int hashCode2 = (hashCode + (nx1Var == null ? 0 : nx1Var.hashCode())) * 31;
        C2106n5 c2106n5 = this.f29465j;
        return hashCode2 + (c2106n5 != null ? c2106n5.hashCode() : 0);
    }

    @NotNull
    public final List<tx1> i() {
        return this.f29462g;
    }

    @NotNull
    public final String toString() {
        return "NativeAdResponse(nativeAds=" + this.f29456a + ", assets=" + this.f29457b + ", renderTrackingUrls=" + this.f29458c + ", impressionData=" + this.f29459d + ", properties=" + this.f29460e + ", divKitDesigns=" + this.f29461f + ", showNotices=" + this.f29462g + ", version=" + this.f29463h + ", settings=" + this.f29464i + ", adPod=" + this.f29465j + ")";
    }

    @Nullable
    public final C2106n5 a() {
        return this.f29465j;
    }
}
