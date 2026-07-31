package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yv1 implements z71 {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ m2.h[] f35341f = {C1873da.a(yv1.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2286v2 f35342a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vv1 f35343b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ao1 f35344c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final rt1 f35345d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final i71 f35346e;

    public yv1(@NotNull vu1 sdkEnvironmentModule, @NotNull v51 nativeAdLoadManager, @NotNull C2286v2 adConfiguration, @NotNull vv1 sdkNativeAdFactoriesProviderCreator) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(nativeAdLoadManager, "nativeAdLoadManager");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sdkNativeAdFactoriesProviderCreator, "sdkNativeAdFactoriesProviderCreator");
        this.f35342a = adConfiguration;
        this.f35343b = sdkNativeAdFactoriesProviderCreator;
        this.f35344c = bo1.a(nativeAdLoadManager);
        this.f35345d = new rt1(nativeAdLoadManager.e());
        this.f35346e = new i71(nativeAdLoadManager.e());
    }

    @Override // com.yandex.mobile.ads.impl.z71
    public final void a(@NotNull Context context, @NotNull C2360y7<n61> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        v51 v51Var = (v51) this.f35344c.getValue(this, f35341f[0]);
        if (v51Var != null) {
            C2105n4 h4 = v51Var.h();
            EnumC2082m4 adLoadingPhaseType = EnumC2082m4.f28846c;
            h4.getClass();
            Intrinsics.checkNotNullParameter(adLoadingPhaseType, "adLoadingPhaseType");
            h4.a(adLoadingPhaseType, null);
            j71 j71Var = new j71(adResponse, adResponse.I(), this.f35342a);
            this.f35345d.a(context, adResponse, this.f35346e);
            this.f35345d.a(context, adResponse, j71Var);
            v51Var.a(adResponse, this.f35343b.a(adResponse));
        }
    }
}
