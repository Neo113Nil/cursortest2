package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.m91;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class l90 extends s80 {

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final m91 f28472A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final yf0 f28473B;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final p90 f28474w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final C1918f7 f28475x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final rt1 f28476y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final i71 f28477z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l90(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull p90 feedItemLoadListener, @NotNull C1918f7 adRequestData, @Nullable aa0 aa0Var, @NotNull rt1 sdkAdapterReporter, @NotNull i71 requestParameterManager, @NotNull m91 nativeResponseCreator, @NotNull yf0 htmlAdResponseReportManager) {
        super(context, adConfiguration, new C2105n4(), aa0Var, sdkEnvironmentModule);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(feedItemLoadListener, "feedItemLoadListener");
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(sdkAdapterReporter, "sdkAdapterReporter");
        Intrinsics.checkNotNullParameter(requestParameterManager, "requestParameterManager");
        Intrinsics.checkNotNullParameter(nativeResponseCreator, "nativeResponseCreator");
        Intrinsics.checkNotNullParameter(htmlAdResponseReportManager, "htmlAdResponseReportManager");
        this.f28474w = feedItemLoadListener;
        this.f28475x = adRequestData;
        this.f28476y = sdkAdapterReporter;
        this.f28477z = requestParameterManager;
        this.f28472A = nativeResponseCreator;
        this.f28473B = htmlAdResponseReportManager;
    }

    public final void x() {
        b(this.f28475x);
    }

    public final class b implements m91.b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2360y7<String> f28480a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l90 f28481b;

        public b(l90 l90Var, @NotNull C2360y7<String> adResponse) {
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            this.f28481b = l90Var;
            this.f28480a = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.m91.b
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f28481b.b(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.m91.b
        public final void a(@NotNull f61 nativeAd) {
            Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
            if (nativeAd instanceof pz1) {
                this.f28481b.t();
                this.f28481b.f28474w.a(new or0((pz1) nativeAd, this.f28480a));
            } else {
                this.f28481b.b(C1942g7.x());
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj
    protected final void a(@NotNull C1866d3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        super.a(error);
        this.f28474w.a(error);
    }

    public final class a implements wq1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2360y7<String> f28478a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ l90 f28479b;

        public a(l90 l90Var, @NotNull C2360y7<String> adResponse) {
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            this.f28479b = l90Var;
            this.f28478a = adResponse;
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f28479b.f28476y.a(this.f28479b.k(), this.f28478a, this.f28479b.f28477z);
            this.f28479b.f28476y.a(this.f28479b.k(), this.f28478a, (j71) null);
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull n61 nativeAdResponse) {
            Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
            j71 j71Var = new j71(this.f28478a, nativeAdResponse, this.f28479b.e());
            this.f28479b.f28476y.a(this.f28479b.k(), this.f28478a, this.f28479b.f28477z);
            this.f28479b.f28476y.a(this.f28479b.k(), this.f28478a, j71Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC2025jj, com.yandex.mobile.ads.impl.qq1.b
    public final void a(@NotNull C2360y7<String> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        super.a((C2360y7) adResponse);
        this.f28473B.a(adResponse);
        this.f28473B.a(e());
        this.f28472A.a(adResponse, new b(this, adResponse), new a(this, adResponse));
    }
}
