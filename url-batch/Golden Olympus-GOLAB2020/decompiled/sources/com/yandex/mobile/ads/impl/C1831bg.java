package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.bg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1831bg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C2276uf<?>> f23737a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2149p2 f23738b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qo1 f23739c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final xj0 f23740d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private final dr0 f23741e;

    /* JADX WARN: Multi-variable type inference failed */
    public C1831bg(@NotNull List<? extends C2276uf<?>> assets, @NotNull C2149p2 adClickHandler, @NotNull qo1 renderedTimer, @NotNull xj0 impressionEventsObservable, @Nullable dr0 dr0Var) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(adClickHandler, "adClickHandler");
        Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
        Intrinsics.checkNotNullParameter(impressionEventsObservable, "impressionEventsObservable");
        this.f23737a = assets;
        this.f23738b = adClickHandler;
        this.f23739c = renderedTimer;
        this.f23740d = impressionEventsObservable;
        this.f23741e = dr0Var;
    }

    @NotNull
    public final C1807ag a(@NotNull mo clickListenerFactory, @NotNull v61 viewAdapter) {
        Intrinsics.checkNotNullParameter(clickListenerFactory, "clickListenerFactory");
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        return new C1807ag(clickListenerFactory, this.f23737a, this.f23738b, viewAdapter, this.f23739c, this.f23740d, this.f23741e);
    }
}
