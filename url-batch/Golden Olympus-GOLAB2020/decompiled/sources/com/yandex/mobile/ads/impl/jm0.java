package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jm0 {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f27726c = {C1873da.a(jm0.class, "view", "getView()Lcom/monetization/ads/instream/view/ExtendedInstreamAdView;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<mb2> f27727a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ao1 f27728b;

    public jm0(@NotNull j70 instreamAdView, @NotNull List<mb2> friendlyOverlays) {
        Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
        Intrinsics.checkNotNullParameter(friendlyOverlays, "friendlyOverlays");
        this.f27727a = friendlyOverlays;
        this.f27728b = bo1.a(instreamAdView);
    }

    @NotNull
    public final List<mb2> a() {
        return this.f27727a;
    }

    @Nullable
    public final j70 b() {
        return (j70) this.f27728b.getValue(this, f27726c[0]);
    }
}
