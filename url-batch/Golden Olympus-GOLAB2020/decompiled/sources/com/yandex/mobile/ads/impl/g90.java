package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g90 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pk1 f26075a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f26076b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b20 f26077c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qq0<ExtendedNativeAdView> f26078d;

    public g90(@NotNull pk1 divKitDesign, @NotNull C2286v2 adConfiguration, @NotNull b20 divKitAdBinderFactory, @NotNull qq0<ExtendedNativeAdView> layoutDesignFactory) {
        Intrinsics.checkNotNullParameter(divKitDesign, "divKitDesign");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(divKitAdBinderFactory, "divKitAdBinderFactory");
        Intrinsics.checkNotNullParameter(layoutDesignFactory, "layoutDesignFactory");
        this.f26075a = divKitDesign;
        this.f26076b = adConfiguration;
        this.f26077c = divKitAdBinderFactory;
        this.f26078d = layoutDesignFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    @NotNull
    public final nq0 a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull pz1 nativeAdPrivate, @NotNull dt nativeAdEventListener, @NotNull fe2 videoEventController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Cdo a4 = this.f26075a.a();
        k20 b4 = this.f26075a.b();
        mr mrVar = new mr() { // from class: com.yandex.mobile.ads.impl.X2
            @Override // com.yandex.mobile.ads.impl.mr
            public final void f() {
                g90.a();
            }
        };
        C2119ni c2119ni = new C2119ni();
        e01 c4 = this.f26076b.p().c();
        this.f26077c.getClass();
        nq designComponentBinder = new nq(new w90(this.f26075a, new z10(context, this.f26076b, adResponse, mrVar, c2119ni, b4), c4), b20.a(nativeAdPrivate, mrVar, nativeAdEventListener, a4, c4), new q71(nativeAdPrivate.b(), videoEventController));
        t20 designConstraint = new t20(adResponse);
        qq0<ExtendedNativeAdView> qq0Var = this.f26078d;
        int i4 = R.layout.monetization_ads_internal_divkit;
        qq0Var.getClass();
        Intrinsics.checkNotNullParameter(ExtendedNativeAdView.class, "layoutViewClass");
        Intrinsics.checkNotNullParameter(designComponentBinder, "designComponentBinder");
        Intrinsics.checkNotNullParameter(designConstraint, "designConstraint");
        return new nq0(i4, designComponentBinder, designConstraint);
    }
}
