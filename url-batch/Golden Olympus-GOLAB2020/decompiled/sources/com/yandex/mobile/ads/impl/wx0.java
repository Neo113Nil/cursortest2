package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wx0 implements sc0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<String> f34249a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sy0 f34250b;

    public wx0(@NotNull C2360y7<String> adResponse, @NotNull sy0 mediationData) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        this.f34249a = adResponse;
        this.f34250b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    @NotNull
    public final rc0<cp0> a(@NotNull yc0<cp0> loadController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        return new com.monetization.ads.mediation.interstitial.c(loadController, this.f34249a, this.f34250b);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    @NotNull
    public final rc0<ur1> b(@NotNull yc0<ur1> loadController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        return new ky0(loadController, this.f34249a, this.f34250b);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    @NotNull
    public final rc0<C1926ff> c(@NotNull yc0<C1926ff> loadController) {
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        C2360y7<String> adResponse = this.f34249a;
        sy0 mediationData = this.f34250b;
        Intrinsics.checkNotNullParameter(loadController, "loadController");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        C2286v2 e4 = loadController.e();
        vx0 vx0Var = new vx0(e4);
        qx0 qx0Var = new qx0(e4, adResponse);
        rx0 rx0Var = new rx0(new hx0(mediationData.c(), vx0Var, qx0Var));
        C2105n4 h4 = loadController.h();
        ag1 ag1Var = new ag1(loadController, mediationData, h4, new C1945ga());
        com.monetization.ads.mediation.appopenad.c cVar = new com.monetization.ads.mediation.appopenad.c();
        zw0 zw0Var = new zw0(e4, h4, cVar, qx0Var, rx0Var, ag1Var, new lx0());
        return new com.monetization.ads.mediation.appopenad.b(zw0Var, cVar, new com.monetization.ads.mediation.appopenad.a(loadController, zw0Var), qx0Var);
    }
}
