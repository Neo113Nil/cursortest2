package com.yandex.mobile.ads.impl;

import O1.C1165z4;
import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2142oi {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1165z4 f30052a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30053b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b20 f30054c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final l10 f30055d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qq0<ExtendedNativeAdView> f30056e;

    public C2142oi(@NotNull C1165z4 divData, @NotNull C2286v2 adConfiguration, @NotNull b20 divKitAdBinderFactory, @NotNull l10 divConfigurationCreator, @NotNull qq0<ExtendedNativeAdView> layoutDesignFactory) {
        Intrinsics.checkNotNullParameter(divData, "divData");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(divKitAdBinderFactory, "divKitAdBinderFactory");
        Intrinsics.checkNotNullParameter(divConfigurationCreator, "divConfigurationCreator");
        Intrinsics.checkNotNullParameter(layoutDesignFactory, "layoutDesignFactory");
        this.f30052a = divData;
        this.f30053b = adConfiguration;
        this.f30054c = divKitAdBinderFactory;
        this.f30055d = divConfigurationCreator;
        this.f30056e = layoutDesignFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    @NotNull
    public final nq0 a(@NotNull Context context, @NotNull C2360y7 adResponse, @NotNull f61 nativeAdPrivate, @NotNull p71 nativeAdEventListener, @NotNull fe2 videoEventController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(videoEventController, "videoEventController");
        Cdo cdo = new Cdo();
        mr mrVar = new mr() { // from class: com.yandex.mobile.ads.impl.Ob
            @Override // com.yandex.mobile.ads.impl.mr
            public final void f() {
                C2142oi.a();
            }
        };
        C2119ni c2119ni = new C2119ni();
        e01 c4 = this.f30053b.p().c();
        this.f30054c.getClass();
        q00 a4 = b20.a(nativeAdPrivate, mrVar, nativeAdEventListener, cdo, c4);
        k20 k20Var = new k20(cdo);
        nq designComponentBinder = new nq(new j20(this.f30052a, new z10(context, this.f30053b, adResponse, mrVar, c2119ni, k20Var), this.f30055d.a(context, this.f30052a, nativeAdPrivate, k20Var), c4, new hb0()), a4, new q71(nativeAdPrivate.b(), videoEventController));
        t20 designConstraint = new t20(adResponse);
        qq0<ExtendedNativeAdView> qq0Var = this.f30056e;
        int i4 = R.layout.monetization_ads_internal_divkit;
        qq0Var.getClass();
        Intrinsics.checkNotNullParameter(ExtendedNativeAdView.class, "layoutViewClass");
        Intrinsics.checkNotNullParameter(designComponentBinder, "designComponentBinder");
        Intrinsics.checkNotNullParameter(designConstraint, "designConstraint");
        return new nq0(i4, designComponentBinder, designConstraint);
    }
}
