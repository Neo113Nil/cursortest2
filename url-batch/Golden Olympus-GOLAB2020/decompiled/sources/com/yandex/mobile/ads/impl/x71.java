package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class x71 implements f61 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<f61> f34479a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private final f61 f34480b;

    public x71(@NotNull ArrayList nativePrivates) {
        Intrinsics.checkNotNullParameter(nativePrivates, "nativePrivates");
        this.f34479a = nativePrivates;
        this.f34480b = nativePrivates.isEmpty() ? null : (f61) nativePrivates.get(0);
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @Nullable
    public final n61 a() {
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            return f61Var.a();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void b(@NotNull ft listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            f61Var.b(listener);
        }
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @Nullable
    public final List<q20> c() {
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            return f61Var.c();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void destroy() {
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            f61Var.destroy();
        }
    }

    @NotNull
    public final List<f61> e() {
        return this.f34479a;
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @NotNull
    public final ct getAdAssets() {
        ct adAssets;
        f61 f61Var = this.f34480b;
        return (f61Var == null || (adAssets = f61Var.getAdAssets()) == null) ? new ct(0) : adAssets;
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @NotNull
    public final zq1 getAdType() {
        zq1 adType;
        f61 f61Var = this.f34480b;
        return (f61Var == null || (adType = f61Var.getAdType()) == null) ? zq1.f35748c : adType;
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @Nullable
    public final String getInfo() {
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            return f61Var.getInfo();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @Nullable
    public final kt getNativeAdVideoController() {
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            return f61Var.getNativeAdVideoController();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void loadImages() {
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            f61Var.loadImages();
        }
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void a(@NotNull ft listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            f61Var.a(listener);
        }
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void b(@NotNull z61 viewProvider, @NotNull Cdo clickConnector) {
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            f61Var.b(viewProvider, clickConnector);
        }
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void a(@Nullable com.yandex.mobile.ads.nativeads.c cVar) {
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            f61Var.a(cVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void a(@Nullable dt dtVar) {
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            f61Var.a(dtVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.f61
    public final void b(@NotNull z61 viewProvider) {
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        f61 f61Var = this.f34480b;
        if (f61Var != null) {
            f61Var.b(viewProvider);
        }
    }

    @Override // com.yandex.mobile.ads.impl.f61
    @NotNull
    public final a91 b() {
        a91 b4;
        f61 f61Var = this.f34480b;
        return (f61Var == null || (b4 = f61Var.b()) == null) ? new a91(null, null) : b4;
    }
}
