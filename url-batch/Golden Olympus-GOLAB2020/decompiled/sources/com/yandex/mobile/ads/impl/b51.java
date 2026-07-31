package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b51 implements q00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f61 f23594a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mr f23595b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final dt f23596c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Cdo f23597d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final mp1 f23598e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x31 f23599f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2208rg f23600g;

    public b51(@NotNull f61 nativeAd, @NotNull mr contentCloseListener, @NotNull dt nativeAdEventListener, @NotNull Cdo clickConnector, @NotNull mp1 reporter, @NotNull x31 nativeAdAssetViewProvider, @NotNull g61 divKitDesignAssetNamesProvider, @NotNull C2208rg assetsNativeAdViewProviderCreator) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        Intrinsics.checkNotNullParameter(divKitDesignAssetNamesProvider, "divKitDesignAssetNamesProvider");
        Intrinsics.checkNotNullParameter(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        this.f23594a = nativeAd;
        this.f23595b = contentCloseListener;
        this.f23596c = nativeAdEventListener;
        this.f23597d = clickConnector;
        this.f23598e = reporter;
        this.f23599f = nativeAdAssetViewProvider;
        this.f23600g = assetsNativeAdViewProviderCreator;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView nativeAdView = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        try {
            this.f23594a.b(this.f23600g.a(nativeAdView, this.f23599f), this.f23597d);
            this.f23594a.a(this.f23596c);
        } catch (t51 e4) {
            this.f23595b.f();
            this.f23598e.reportError("Failed to bind DivKit Native Ad", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        this.f23594a.a((dt) null);
    }
}
