package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.b9;
import com.yandex.mobile.ads.impl.ew1;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2070lg {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f28533a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final vu1 f28534b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ob2<on0> f28535c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ss f28536d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final bg2 f28537e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final tn0 f28538f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final zi0 f28539g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final pm0 f28540h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final go f28541i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final vn0 f28542j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final C2391zf f28543k;

    public /* synthetic */ C2070lg(Context context, vu1 vu1Var, ob2 ob2Var, ss ssVar, bg2 bg2Var, cb2 cb2Var, sk1 sk1Var, pm0 pm0Var) {
        this(context, vu1Var, ob2Var, ssVar, bg2Var, cb2Var, sk1Var, pm0Var, new go(), new vn0(), new C2391zf());
    }

    @NotNull
    public final List<nm0> a() {
        C2391zf c2391zf = this.f28543k;
        Context context = this.f28533a;
        vu1 sdkEnvironmentModule = this.f28534b;
        ob2<on0> videoAdInfo = this.f28535c;
        ss adBreak = this.f28536d;
        bg2 videoTracker = this.f28537e;
        c2391zf.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        C2368yf c2368yf = new C2368yf(videoAdInfo, new gn0(context, sdkEnvironmentModule, adBreak, videoAdInfo).a(), videoTracker);
        C2276uf<?> a4 = this.f28540h.a("call_to_action");
        wd2 videoClicks = this.f28542j.a(this.f28535c.b(), a4 != null ? a4.b() : null);
        go goVar = this.f28541i;
        ob2<on0> videoAdInfo2 = this.f28535c;
        Context context2 = this.f28533a;
        vu1 sdkEnvironmentModule2 = this.f28534b;
        ss adBreak2 = this.f28536d;
        bg2 videoTracker2 = this.f28537e;
        tn0 playbackListener = this.f28538f;
        goVar.getClass();
        Intrinsics.checkNotNullParameter(videoAdInfo2, "videoAdInfo");
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule2, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(adBreak2, "adBreak");
        Intrinsics.checkNotNullParameter(videoTracker2, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(videoClicks, "videoClicks");
        fo foVar = new fo(context2, sdkEnvironmentModule2, adBreak2, videoAdInfo2, videoTracker2, playbackListener, videoClicks, new hm0(context2, sdkEnvironmentModule2, adBreak2, videoAdInfo2, videoTracker2, playbackListener, videoClicks), new a10());
        cn cnVar = new cn(a4, foVar);
        dn dnVar = new dn();
        ob2<on0> ob2Var = this.f28535c;
        InterfaceC2341xb a5 = new C2364yb(ob2Var, new C2387zb(ob2Var.g())).a();
        C2276uf<?> a6 = this.f28540h.a("favicon");
        if (a6 == null || !(a6.d() instanceof ej0)) {
            a6 = null;
        }
        qi0 qi0Var = new qi0(this.f28533a, new an0(false), this.f28539g);
        l80 l80Var = new l80(qi0Var, a6, c2368yf);
        j30 j30Var = new j30(this.f28540h.a(b9.i.f15522D), c2368yf);
        p12 p12Var = new p12(this.f28540h.a("sponsored"), this.f28535c.a(), c2368yf, new q12());
        C2312w5 c2312w5 = new C2312w5(this.f28535c.d().b().a(), this.f28535c.d().b().b());
        r62 r62Var = new r62(qi0Var, this.f28540h.a("trademark"), c2368yf);
        jl0 jl0Var = new jl0();
        xe1 a7 = new gn0(this.f28533a, this.f28534b, this.f28536d, this.f28535c).a();
        C2276uf<?> a8 = this.f28540h.a("feedback");
        C2158pb c2158pb = new C2158pb(jl0Var, a7, new C1935g0());
        b10 b10Var = new b10();
        d20 d20Var = new d20(b10Var);
        ka0 ka0Var = new ka0(a8, c2368yf, this.f28537e, c2158pb, new g20(b10Var, d20Var, new f20(d20Var, new c30())));
        C2276uf<?> a9 = this.f28540h.a("warning");
        C2276uf<?> a10 = this.f28540h.a("qrcode");
        C2276uf<?> c2276uf = (a10 == null || !(a10.d() instanceof no)) ? null : a10;
        zi2 zi2Var = new zi2(a9, c2368yf);
        Context context3 = this.f28533a;
        zi0 zi0Var = this.f28539g;
        Context applicationContext = context3.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ym1 ym1Var = new ym1(context3, zi0Var);
        int i4 = ew1.f25476l;
        return CollectionsKt.listOf((Object[]) new nm0[]{cnVar, a5, l80Var, j30Var, p12Var, c2312w5, r62Var, dnVar, ka0Var, zi2Var, new xm1(context3, zi0Var, videoClicks, a6, c2276uf, applicationContext, ym1Var, ew1.a.a()), new ms1(this.f28540h.a("root_container"), foVar)});
    }

    public C2070lg(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull ob2 videoAdInfo, @NotNull ss adBreak, @NotNull bg2 videoTracker, @NotNull cb2 playbackListener, @NotNull sk1 imageProvider, @NotNull pm0 assetsWrapper, @NotNull go clickControlConfiguratorProvider, @NotNull vn0 instreamVideoClicksProvider, @NotNull C2391zf assetClickConfiguratorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(assetsWrapper, "assetsWrapper");
        Intrinsics.checkNotNullParameter(clickControlConfiguratorProvider, "clickControlConfiguratorProvider");
        Intrinsics.checkNotNullParameter(instreamVideoClicksProvider, "instreamVideoClicksProvider");
        Intrinsics.checkNotNullParameter(assetClickConfiguratorProvider, "assetClickConfiguratorProvider");
        this.f28533a = context;
        this.f28534b = sdkEnvironmentModule;
        this.f28535c = videoAdInfo;
        this.f28536d = adBreak;
        this.f28537e = videoTracker;
        this.f28538f = playbackListener;
        this.f28539g = imageProvider;
        this.f28540h = assetsWrapper;
        this.f28541i = clickControlConfiguratorProvider;
        this.f28542j = instreamVideoClicksProvider;
        this.f28543k = assetClickConfiguratorProvider;
    }
}
