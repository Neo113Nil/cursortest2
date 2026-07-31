package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2149p2 implements InterfaceC2172q2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vu1 f30270a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f30271b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C2286v2 f30272c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final e51 f30273d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final v32 f30274e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final C1920f9 f30275f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final n41 f30276g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final n62 f30277h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final C2010j4 f30278i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private m71 f30279j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C2149p2(Context context, vu1 vu1Var, C2360y7 c2360y7, C2286v2 c2286v2, e51 e51Var, v32 v32Var) {
        this(context, vu1Var, c2360y7, c2286v2, e51Var, v32Var, r7, new n41(context, c2286v2, c2360y7), new n62(r7), new C2010j4(e51Var));
        C1920f9 c1920f9 = new C1920f9(context, c2286v2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2172q2
    @NotNull
    public final ve0 a(@NotNull View view, @NotNull C2276uf<?> asset, @NotNull dr0 link, @NotNull v61 nativeAdViewAdapter) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        this.f30273d.a(link);
        Context context = view.getContext();
        C1871d8 a4 = this.f30278i.a();
        po a5 = this.f30276g.a(asset.b(), "url");
        v32 v32Var = this.f30274e;
        Intrinsics.checkNotNull(context);
        f91 f91Var = new f91(this.f30275f, v32Var.a(context, this.f30270a, this.f30272c, this.f30271b, a4));
        e91 a6 = f91Var.a(a5);
        C2286v2 c2286v2 = this.f30272c;
        C2360y7<?> c2360y7 = this.f30271b;
        e51 e51Var = this.f30273d;
        ve0 a7 = new C1815b0(c2286v2, c2360y7, a5, f91Var, nativeAdViewAdapter, e51Var, new C2306w(c2286v2, c2360y7, a5, f91Var, nativeAdViewAdapter, e51Var, this.f30279j)).a(view, link.a());
        this.f30277h.a(link.d());
        String e4 = link.e();
        if (e4 != null && e4.length() > 0) {
            a6.a(e4);
        }
        return a7;
    }

    public C2149p2(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull C2360y7<?> adResponse, @NotNull C2286v2 adConfiguration, @NotNull e51 nativeAdEventController, @NotNull v32 targetUrlHandlerProvider, @NotNull C1920f9 adTracker, @NotNull n41 clickReporterCreator, @NotNull n62 trackingUrlHandler, @NotNull C2010j4 adLinksHandlerReceiver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(targetUrlHandlerProvider, "targetUrlHandlerProvider");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(clickReporterCreator, "clickReporterCreator");
        Intrinsics.checkNotNullParameter(trackingUrlHandler, "trackingUrlHandler");
        Intrinsics.checkNotNullParameter(adLinksHandlerReceiver, "adLinksHandlerReceiver");
        this.f30270a = sdkEnvironmentModule;
        this.f30271b = adResponse;
        this.f30272c = adConfiguration;
        this.f30273d = nativeAdEventController;
        this.f30274e = targetUrlHandlerProvider;
        this.f30275f = adTracker;
        this.f30276g = clickReporterCreator;
        this.f30277h = trackingUrlHandler;
        this.f30278i = adLinksHandlerReceiver;
    }

    public final void a(@Nullable m71 m71Var) {
        this.f30279j = m71Var;
        this.f30276g.a(m71Var);
    }
}
