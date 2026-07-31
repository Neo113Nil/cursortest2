package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tt1 implements InterfaceC2072li {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1977hi f32685a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dv1<vt1> f32686b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final rt1 f32687c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private C2360y7<String> f32688d;

    public static final class a implements ev1<vt1> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C1977hi f32689a;

        public a(@NotNull C1977hi adViewController) {
            Intrinsics.checkNotNullParameter(adViewController, "adViewController");
            this.f32689a = adViewController;
        }

        @Override // com.yandex.mobile.ads.impl.ev1
        public final void a(vt1 vt1Var) {
            vt1 ad = vt1Var;
            Intrinsics.checkNotNullParameter(ad, "ad");
            ad.a(new st1(this));
        }

        @Override // com.yandex.mobile.ads.impl.ev1
        public final void a(@NotNull C1866d3 adFetchRequestError) {
            Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
            this.f32689a.b(adFetchRequestError);
        }
    }

    public tt1(@NotNull C1977hi adLoadController, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull C2024ji bannerAdSizeValidator, @NotNull wt1 sdkBannerHtmlAdCreator, @NotNull dv1<vt1> adCreationHandler, @NotNull rt1 sdkAdapterReporter) {
        Intrinsics.checkNotNullParameter(adLoadController, "adLoadController");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(bannerAdSizeValidator, "bannerAdSizeValidator");
        Intrinsics.checkNotNullParameter(sdkBannerHtmlAdCreator, "sdkBannerHtmlAdCreator");
        Intrinsics.checkNotNullParameter(adCreationHandler, "adCreationHandler");
        Intrinsics.checkNotNullParameter(sdkAdapterReporter, "sdkAdapterReporter");
        this.f32685a = adLoadController;
        this.f32686b = adCreationHandler;
        this.f32687c = sdkAdapterReporter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2072li
    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ap0.d(new Object[0]);
        this.f32686b.a();
        this.f32688d = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2072li
    @Nullable
    public final String getAdInfo() {
        C2360y7<String> c2360y7 = this.f32688d;
        if (c2360y7 != null) {
            return c2360y7.e();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2072li
    public final void a(@NotNull Context context, @NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f32688d = adResponse;
        C2105n4 h4 = this.f32685a.h();
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28846c;
        C2001ij.a(h4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        this.f32687c.a(context, adResponse, (i71) null);
        this.f32687c.a(context, adResponse);
        this.f32686b.a(context, adResponse, new a(this.f32685a));
    }
}
