package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class v51 extends AbstractC2025jj<n61> {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final x41 f33502A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final a f33503B;

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private final k51 f33504C;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final j61 f33505v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final e61 f33506w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final p61 f33507x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final s61 f33508y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final y22 f33509z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v51(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull j61 requestData, @NotNull C2286v2 adConfiguration, @NotNull e61 nativeAdOnLoadListener, @NotNull C2105n4 adLoadingPhasesManager, @NotNull InterfaceC3316J coroutineScope, @NotNull p61 adResponseControllerFactoryCreator, @NotNull s61 nativeAdResponseReportManager, @NotNull y22 strongReferenceKeepingManager, @NotNull x41 nativeAdCreationManager) {
        super(context, adLoadingPhasesManager, adConfiguration, coroutineScope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdOnLoadListener, "nativeAdOnLoadListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(adResponseControllerFactoryCreator, "adResponseControllerFactoryCreator");
        Intrinsics.checkNotNullParameter(nativeAdResponseReportManager, "nativeAdResponseReportManager");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        Intrinsics.checkNotNullParameter(nativeAdCreationManager, "nativeAdCreationManager");
        this.f33505v = requestData;
        this.f33506w = nativeAdOnLoadListener;
        this.f33507x = adResponseControllerFactoryCreator;
        this.f33508y = nativeAdResponseReportManager;
        this.f33509z = strongReferenceKeepingManager;
        this.f33502A = nativeAdCreationManager;
        this.f33503B = new a();
        this.f33504C = new k51(context, this, this);
        nativeAdOnLoadListener.a(nativeAdResponseReportManager);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    protected final boolean a(@Nullable C1918f7 c1918f7) {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    public final synchronized void b(@Nullable C1918f7 c1918f7) {
        throw null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    @SuppressLint({"VisibleForTests"})
    @Nullable
    protected final C1866d3 w() {
        return m().c();
    }

    public final void x() {
        o().a();
        f().a();
        this.f33506w.a();
        this.f33509z.a(fq0.f25896b, this);
        a(EnumC2174q4.f30654b);
        this.f33502A.a();
    }

    public final void y() {
        C1918f7 a4 = this.f33505v.a();
        if (!this.f33505v.d().a()) {
            b(C1942g7.q());
            return;
        }
        C2105n4 h4 = h();
        EnumC2082m4 enumC2082m4 = EnumC2082m4.f28848e;
        C2001ij.a(h4, enumC2082m4, "adLoadingPhaseType", enumC2082m4, null);
        this.f33509z.b(fq0.f25896b, this);
        e().a(Integer.valueOf(this.f33505v.b()));
        e().a(a4.a());
        e().a(this.f33505v.c());
        e().a(a4.l());
        e().a(this.f33505v.e());
        synchronized (this) {
            c(a4);
        }
    }

    public final class a implements v41 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.v41
        public final void a(@NotNull C1866d3 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            v51.this.h().a(EnumC2082m4.f28848e);
            v51.this.b(error);
        }

        @Override // com.yandex.mobile.ads.impl.v41
        public final void a(@NotNull f61 nativeAd) {
            Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
            v51.this.s();
            v51.this.f33506w.a(nativeAd);
        }

        @Override // com.yandex.mobile.ads.impl.v41
        public final void a(@NotNull ArrayList nativeAds) {
            Intrinsics.checkNotNullParameter(nativeAds, "nativeAds");
            v51.this.s();
            v51.this.f33506w.a(nativeAds);
        }

        @Override // com.yandex.mobile.ads.impl.v41
        public final void a(@NotNull y71 sliderAd) {
            Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
            v51.this.s();
            v51.this.f33506w.a(sliderAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    @NotNull
    protected final AbstractC1978hj<n61> a(@NotNull String url, @NotNull String query) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(query, "query");
        return this.f33504C.a(this.f33505v.d(), e(), this.f33505v.a(), url, query);
    }

    public final void a(@NotNull C2360y7<n61> adResponse, @NotNull h51 adFactoriesProvider) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adFactoriesProvider, "adFactoriesProvider");
        if (g()) {
            return;
        }
        this.f33502A.a(adResponse, adResponse.I(), adFactoriesProvider, this.f33503B);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    public final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f33506w.b(error);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj, com.yandex.mobile.ads.impl.qq1.b
    public final void a(@NotNull C2360y7<n61> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        super.a((C2360y7) adResponse);
        this.f33508y.a(adResponse);
        if (g()) {
            return;
        }
        z71 a4 = this.f33507x.a(adResponse).a(this);
        Context a5 = C2054l0.a();
        if (a5 != null) {
            ap0.a(new Object[0]);
        }
        if (a5 == null) {
            a5 = k();
        }
        a4.a(a5, adResponse);
    }

    public final void a(@Nullable gt gtVar) {
        this.f33506w.a(gtVar);
    }

    public final void a(@Nullable nt ntVar) {
        this.f33506w.a(ntVar);
    }

    public final void a(@Nullable wt wtVar) {
        this.f33506w.a(wtVar);
    }
}
