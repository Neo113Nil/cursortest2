package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a71 implements rb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final u31 f23178a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private v61 f23179b;

    public a71(@NotNull u31 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f23178a = nativeAd;
    }

    @Override // com.yandex.mobile.ads.impl.rb1
    public final void a(@NotNull v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        nativeAdViewAdapter.a();
    }

    @Override // com.yandex.mobile.ads.impl.rb1
    public final void a(@NotNull v61 nativeAdViewAdapter, @NotNull ko clickListenerConfigurator) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(clickListenerConfigurator, "clickListenerConfigurator");
        this.f23179b = nativeAdViewAdapter;
        C1825ba c1825ba = new C1825ba(nativeAdViewAdapter, clickListenerConfigurator, this.f23178a.e(), new jh2());
        Iterator<C2276uf<?>> it = this.f23178a.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2276uf<?> next = it.next();
            InterfaceC2299vf<?> a4 = nativeAdViewAdapter.a(next);
            InterfaceC2299vf<?> interfaceC2299vf = a4 != null ? a4 : null;
            if (interfaceC2299vf != null) {
                interfaceC2299vf.c(next.d());
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                interfaceC2299vf.a(next, c1825ba);
            }
        }
        List<zu> b4 = nativeAdViewAdapter.h().b();
        if (b4 != null) {
            Iterator<T> it2 = b4.iterator();
            if (it2.hasNext()) {
                ((zu) it2.next()).getClass();
                nativeAdViewAdapter.c();
                throw null;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.rb1
    public final void a() {
        v61 v61Var = this.f23179b;
        if (v61Var != null) {
            for (C2276uf<?> c2276uf : this.f23178a.b()) {
                InterfaceC2299vf<?> a4 = v61Var.a(c2276uf);
                if (a4 instanceof n00) {
                    ((n00) a4).b(c2276uf.d());
                }
            }
        }
    }
}
