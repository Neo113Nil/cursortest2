package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class rz1 implements rb1 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final List<C2276uf<?>> f31499a;

    /* JADX WARN: Multi-variable type inference failed */
    public rz1(@Nullable List<? extends C2276uf<?>> list) {
        this.f31499a = list;
    }

    @Override // com.yandex.mobile.ads.impl.rb1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.rb1
    public final void a(@NotNull v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
    }

    @Override // com.yandex.mobile.ads.impl.rb1
    public final void a(@NotNull v61 nativeAdViewAdapter, @NotNull ko clickListenerConfigurator) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(clickListenerConfigurator, "clickListenerConfigurator");
        if (this.f31499a != null) {
            C2247t9 c2247t9 = new C2247t9(nativeAdViewAdapter, clickListenerConfigurator);
            for (C2276uf<?> c2276uf : this.f31499a) {
                InterfaceC2299vf<?> a4 = nativeAdViewAdapter.a(c2276uf);
                if (a4 == null) {
                    a4 = null;
                }
                if (a4 != null) {
                    a4.c(c2276uf.d());
                    Intrinsics.checkNotNull(c2276uf, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                    a4.a(c2276uf, c2247t9);
                }
            }
        }
    }
}
