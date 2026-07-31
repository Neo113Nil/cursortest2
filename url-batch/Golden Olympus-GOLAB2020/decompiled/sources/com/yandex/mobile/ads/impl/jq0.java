package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jq0 implements td0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final q00<ExtendedNativeAdView> f27802a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mp1 f27803b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final nq1 f27804c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final iq f27805d;

    public jq0(@NotNull sp adTypeSpecificBinder, @NotNull mp1 reporter, @NotNull nq1 resourceUtils, @NotNull iq commonComponentsBinderProvider) {
        Intrinsics.checkNotNullParameter(adTypeSpecificBinder, "adTypeSpecificBinder");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(resourceUtils, "resourceUtils");
        Intrinsics.checkNotNullParameter(commonComponentsBinderProvider, "commonComponentsBinderProvider");
        this.f27802a = adTypeSpecificBinder;
        this.f27803b = reporter;
        this.f27804c = resourceUtils;
        this.f27805d = commonComponentsBinderProvider;
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
        nq1 nq1Var = this.f27804c;
        int i4 = R.dimen.monetization_ads_internal_landscape_horizontal_icon_size;
        nq1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        pq pqVar = new pq(adAssets, AbstractC3185a.c(context.getResources().getDimension(i4)));
        iq iqVar = this.f27805d;
        q00<ExtendedNativeAdView> q00Var = this.f27802a;
        mp1 mp1Var = this.f27803b;
        iqVar.getClass();
        return new nq0<>(R.layout.monetization_ads_internal_native_interstitial_landscape_horizontal_media, new nq(pqVar, iq.a(nativeAdPrivate, contentCloseListener, nativeAdEventListener, q00Var, mp1Var), new fu0(adAssets, new p41(), new gu0(adAssets)), new fh1(adAssets, new v31(), new y31()), new yi2(), new bn(nativeAdPrivate, new y31())), new ef1(2));
    }
}
