package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class gy0 implements a81 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<n61> f26362a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final sy0 f26363b;

    public gy0(@NotNull C2360y7<n61> adResponse, @NotNull sy0 mediationData) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        this.f26362a = adResponse;
        this.f26363b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.a81
    @NotNull
    public final z71 a(@NotNull v51 nativeAdLoadManager) {
        Intrinsics.checkNotNullParameter(nativeAdLoadManager, "nativeAdLoadManager");
        C2360y7<n61> c2360y7 = this.f26362a;
        sy0 sy0Var = this.f26363b;
        C2286v2 e4 = nativeAdLoadManager.e();
        vx0 vx0Var = new vx0(e4);
        qx0 qx0Var = new qx0(e4, c2360y7);
        hx0 hx0Var = new hx0(sy0Var.c(), vx0Var, qx0Var);
        cy0 cy0Var = new cy0(hx0Var);
        C2105n4 h4 = nativeAdLoadManager.h();
        ag1 ag1Var = new ag1(nativeAdLoadManager, sy0Var, h4, new C1945ga());
        dy0 dy0Var = new dy0();
        zw0 zw0Var = new zw0(e4, h4, dy0Var, qx0Var, cy0Var, ag1Var, new lx0());
        return new fy0(nativeAdLoadManager, c2360y7, sy0Var, e4, vx0Var, qx0Var, hx0Var, cy0Var, h4, ag1Var, dy0Var, zw0Var, new h71(c2360y7, nativeAdLoadManager, zw0Var));
    }
}
