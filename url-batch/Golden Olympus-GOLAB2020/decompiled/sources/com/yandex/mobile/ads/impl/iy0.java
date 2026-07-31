package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class iy0 implements rb1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final rb1 f27421a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final MediatedNativeAd f27422b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final hy0 f27423c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C2221s6 f27424d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27425e;

    public iy0(@NotNull rb1 nativeAdViewRenderer, @NotNull MediatedNativeAd mediatedNativeAd, @NotNull hy0 mediatedNativeRenderingTracker, @NotNull C2221s6 adQualityVerifierController) {
        Intrinsics.checkNotNullParameter(nativeAdViewRenderer, "nativeAdViewRenderer");
        Intrinsics.checkNotNullParameter(mediatedNativeAd, "mediatedNativeAd");
        Intrinsics.checkNotNullParameter(mediatedNativeRenderingTracker, "mediatedNativeRenderingTracker");
        Intrinsics.checkNotNullParameter(adQualityVerifierController, "adQualityVerifierController");
        this.f27421a = nativeAdViewRenderer;
        this.f27422b = mediatedNativeAd;
        this.f27423c = mediatedNativeRenderingTracker;
        this.f27424d = adQualityVerifierController;
    }

    @Override // com.yandex.mobile.ads.impl.rb1
    public final void a(@NotNull v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f27421a.a(nativeAdViewAdapter);
        f71 h4 = nativeAdViewAdapter.h();
        View f4 = nativeAdViewAdapter.f();
        if (f4 != null) {
            this.f27422b.unbindNativeAd(new ey0(f4, h4));
        }
        if (this.f27425e) {
            this.f27424d.d();
        }
    }

    @Override // com.yandex.mobile.ads.impl.rb1
    public final void a(@NotNull v61 nativeAdViewAdapter, @NotNull ko clickListenerConfigurator) {
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(clickListenerConfigurator, "clickListenerConfigurator");
        this.f27421a.a(nativeAdViewAdapter, clickListenerConfigurator);
        f71 h4 = nativeAdViewAdapter.h();
        View f4 = nativeAdViewAdapter.f();
        if (f4 != null) {
            this.f27422b.bindNativeAd(new ey0(f4, h4));
        }
        this.f27424d.c();
        if (nativeAdViewAdapter.f() == null || this.f27425e) {
            return;
        }
        this.f27425e = true;
        this.f27423c.a();
    }

    @Override // com.yandex.mobile.ads.impl.rb1
    public final void a() {
        this.f27421a.a();
    }
}
