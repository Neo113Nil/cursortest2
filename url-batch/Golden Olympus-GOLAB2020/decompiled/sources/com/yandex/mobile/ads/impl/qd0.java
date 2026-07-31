package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qd0 implements q00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f61 f30734a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mr f30735b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final dt f30736c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final mp1 f30737d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2208rg f30738e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final y31 f30739f;

    public qd0(@NotNull f61 nativeAd, @NotNull mr contentCloseListener, @NotNull dt nativeAdEventListener, @NotNull mp1 reporter, @NotNull C2208rg assetsNativeAdViewProviderCreator, @NotNull y31 nativeAdAssetViewProviderById) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProviderById, "nativeAdAssetViewProviderById");
        this.f30734a = nativeAd;
        this.f30735b = contentCloseListener;
        this.f30736c = nativeAdEventListener;
        this.f30737d = reporter;
        this.f30738e = assetsNativeAdViewProviderCreator;
        this.f30739f = nativeAdAssetViewProviderById;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView nativeAdView = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        try {
            this.f30734a.b(this.f30738e.a(nativeAdView, this.f30739f));
            this.f30734a.a(this.f30736c);
        } catch (t51 e4) {
            this.f30735b.f();
            this.f30737d.reportError("Failed to bind DivKit Fullscreen Native Ad", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        this.f30734a.a((dt) null);
    }
}
