package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class m91 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f28953a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final l91 f28954b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x41 f28955c;

    public interface b {
        void a(@NotNull C1866d3 c1866d3);

        void a(@NotNull f61 f61Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m91(Context context, vu1 vu1Var, C2286v2 c2286v2, C2105n4 c2105n4) {
        this(context, vu1Var, c2286v2, c2105n4, r6, r2, new l91(context, vu1Var.c()), new x41(r2, vu1Var, c2286v2, c2105n4, r6));
        InterfaceC3316J a4 = fu.a((j50) vu1Var.c());
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
    }

    public final void a(@NotNull C2360y7<String> adResponse, @NotNull b responseCreationListener, @NotNull wq1 converterListener) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(responseCreationListener, "responseCreationListener");
        Intrinsics.checkNotNullParameter(converterListener, "converterListener");
        this.f28954b.a(adResponse, new a(this, adResponse, responseCreationListener, converterListener, new vv1(this.f28953a)));
    }

    private final class a implements wq1 {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C2360y7<String> f28956a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final b f28957b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final wq1 f28958c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final vv1 f28959d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ m91 f28960e;

        public a(m91 m91Var, @NotNull C2360y7<String> adResponse, @NotNull b responseCreationListener, @NotNull wq1 responseConverterListener, @NotNull vv1 sdkNativeAdFactoriesProviderCreator) {
            Intrinsics.checkNotNullParameter(adResponse, "adResponse");
            Intrinsics.checkNotNullParameter(responseCreationListener, "responseCreationListener");
            Intrinsics.checkNotNullParameter(responseConverterListener, "responseConverterListener");
            Intrinsics.checkNotNullParameter(sdkNativeAdFactoriesProviderCreator, "sdkNativeAdFactoriesProviderCreator");
            this.f28960e = m91Var;
            this.f28956a = adResponse;
            this.f28957b = responseCreationListener;
            this.f28958c = responseConverterListener;
            this.f28959d = sdkNativeAdFactoriesProviderCreator;
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull C1866d3 adRequestError) {
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f28958c.a(adRequestError);
            this.f28957b.a(adRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.wq1
        public final void a(@NotNull n61 nativeAdResponse) {
            Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
            this.f28958c.a(nativeAdResponse);
            C2360y7<String> c2360y7 = this.f28956a;
            b bVar = this.f28957b;
            this.f28960e.f28955c.a(c2360y7, nativeAdResponse, this.f28959d.a(c2360y7), new b81(bVar));
        }
    }

    public m91(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration, @NotNull C2105n4 adLoadingPhasesManager, @NotNull InterfaceC3316J coroutineScope, @NotNull Context appContext, @NotNull l91 nativeResponseConverter, @NotNull x41 nativeAdCreationManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(nativeResponseConverter, "nativeResponseConverter");
        Intrinsics.checkNotNullParameter(nativeAdCreationManager, "nativeAdCreationManager");
        this.f28953a = sdkEnvironmentModule;
        this.f28954b = nativeResponseConverter;
        this.f28955c = nativeAdCreationManager;
        adConfiguration.a(p91.f30362c);
    }

    public final void a() {
        this.f28955c.a();
    }
}
