package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class oz1 implements q00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pz1 f30233a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mr f30234b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final dt f30235c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Cdo f30236d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final mp1 f30237e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final x31 f30238f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2208rg f30239g;

    public oz1(@NotNull pz1 sliderAd, @NotNull mr contentCloseListener, @NotNull dt nativeAdEventListener, @NotNull Cdo clickConnector, @NotNull mp1 reporter, @NotNull x31 nativeAdAssetViewProvider, @NotNull g61 divKitDesignAssetNamesProvider, @NotNull C2208rg assetsNativeAdViewProviderCreator) {
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        Intrinsics.checkNotNullParameter(divKitDesignAssetNamesProvider, "divKitDesignAssetNamesProvider");
        Intrinsics.checkNotNullParameter(assetsNativeAdViewProviderCreator, "assetsNativeAdViewProviderCreator");
        this.f30233a = sliderAd;
        this.f30234b = contentCloseListener;
        this.f30235c = nativeAdEventListener;
        this.f30236d = clickConnector;
        this.f30237e = reporter;
        this.f30238f = nativeAdAssetViewProvider;
        this.f30239g = assetsNativeAdViewProviderCreator;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView nativeAdView = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        try {
            this.f30233a.a(this.f30239g.a(nativeAdView, this.f30238f), this.f30236d);
            z22 z22Var = new z22(this.f30235c);
            ArrayList d4 = this.f30233a.d();
            int size = d4.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = d4.get(i4);
                i4++;
                ((f61) obj).a(z22Var);
            }
            this.f30233a.b(this.f30235c);
        } catch (t51 e4) {
            this.f30234b.f();
            this.f30237e.reportError("Failed to bind DivKit Slider Ad", e4);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        this.f30233a.b((dt) null);
        ArrayList d4 = this.f30233a.d();
        int size = d4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = d4.get(i4);
            i4++;
            ((f61) obj).a((dt) null);
        }
    }
}
