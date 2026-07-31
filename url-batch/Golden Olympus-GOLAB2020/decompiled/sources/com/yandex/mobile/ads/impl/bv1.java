package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bv1 implements cv1<av1> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f23922a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f23923b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2286v2 f23924c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private av1 f23925d;

    public bv1(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f23922a = context;
        this.f23923b = sdkEnvironmentModule;
        this.f23924c = adConfiguration;
    }

    public static final void a(bv1 bv1Var) {
        av1 av1Var = bv1Var.f23925d;
        if (av1Var != null) {
            av1Var.a((sr) null);
        }
        bv1Var.f23925d = null;
    }

    private final class a implements sr {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final av1 f23926a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ev1<av1> f23927b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ bv1 f23928c;

        public a(bv1 bv1Var, @NotNull av1 fullscreenHtmlAd, @NotNull ev1<av1> creationListener) {
            Intrinsics.checkNotNullParameter(fullscreenHtmlAd, "fullscreenHtmlAd");
            Intrinsics.checkNotNullParameter(creationListener, "creationListener");
            this.f23928c = bv1Var;
            this.f23926a = fullscreenHtmlAd;
            this.f23927b = creationListener;
        }

        @Override // com.yandex.mobile.ads.impl.sr
        public final void a(@NotNull C1866d3 adFetchRequestError) {
            Intrinsics.checkNotNullParameter(adFetchRequestError, "adFetchRequestError");
            bv1.a(this.f23928c);
            this.f23927b.a(adFetchRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.sr
        public final void a() {
            bv1.a(this.f23928c);
            this.f23927b.a((ev1<av1>) this.f23926a);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cv1
    public final void a() {
        av1 av1Var = this.f23925d;
        if (av1Var != null) {
            av1Var.d();
        }
        av1 av1Var2 = this.f23925d;
        if (av1Var2 != null) {
            av1Var2.a((sr) null);
        }
        this.f23925d = null;
    }

    @Override // com.yandex.mobile.ads.impl.cv1
    public final void a(@NotNull C2360y7<String> adResponse, @NotNull vy1 sizeInfo, @NotNull String htmlResponse, @NotNull ev1<av1> creationListener) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        Intrinsics.checkNotNullParameter(creationListener, "creationListener");
        Context context = this.f23922a;
        vu1 vu1Var = this.f23923b;
        C2286v2 c2286v2 = this.f23924c;
        C1871d8 c1871d8 = new C1871d8();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        wc0 wc0Var = new wc0(applicationContext, vu1Var, c2286v2, adResponse, c1871d8);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        av1 av1Var = new av1(context, vu1Var, c2286v2, adResponse, htmlResponse, c1871d8, wc0Var, new ad0(applicationContext2, c2286v2, adResponse, c1871d8), new mc0(), new fg0(), new hd0(vu1Var));
        this.f23925d = av1Var;
        av1Var.a(new a(this, av1Var, creationListener));
        av1Var.h();
    }
}
