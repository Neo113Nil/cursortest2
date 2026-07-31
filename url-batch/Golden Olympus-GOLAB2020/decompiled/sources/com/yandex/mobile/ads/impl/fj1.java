package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fj1 implements td0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q00<ExtendedNativeAdView> f25813a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f25814b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final iq f25815c;

    public fj1(@NotNull sp adTypeSpecificBinder, @NotNull mp1 reporter, @NotNull iq commonComponentsBinderProvider) {
        Intrinsics.checkNotNullParameter(adTypeSpecificBinder, "adTypeSpecificBinder");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(commonComponentsBinderProvider, "commonComponentsBinderProvider");
        this.f25813a = adTypeSpecificBinder;
        this.f25814b = reporter;
        this.f25815c = commonComponentsBinderProvider;
    }

    @Override // com.yandex.mobile.ads.impl.td0
    @NotNull
    public final nq0<ExtendedNativeAdView> a(@NotNull Context context, @NotNull C2360y7<?> adResponse, @NotNull f61 nativeAdPrivate, @NotNull mr contentCloseListener, @NotNull dt nativeAdEventListener, @NotNull C1792a1 eventController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        ct adAssets = nativeAdPrivate.getAdAssets();
        iq iqVar = this.f25815c;
        q00<ExtendedNativeAdView> q00Var = this.f25813a;
        mp1 mp1Var = this.f25814b;
        iqVar.getClass();
        return new nq0<>(R.layout.monetization_ads_internal_native_interstitial_portrait, new nq(iq.a(nativeAdPrivate, contentCloseListener, nativeAdEventListener, q00Var, mp1Var), new sv0(adAssets, new p41(), new gu0(adAssets)), new yi2(), new bn(nativeAdPrivate, new y31()), new zm(context, new y31(), new ym(context))), new ef1(1));
    }
}
