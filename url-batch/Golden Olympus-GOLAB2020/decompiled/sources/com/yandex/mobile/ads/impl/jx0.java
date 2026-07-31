package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jx0 implements InterfaceC1847c8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f27892a;

    public jx0(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f27892a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1847c8
    @NotNull
    public final jp1 a() {
        jp1 jp1Var = new jp1(new HashMap(), 2);
        jp1Var.b(this.f27892a.m(), FirebaseAnalytics.Param.AD_SOURCE);
        jp1Var.b(this.f27892a.p(), "block_id");
        jp1Var.b(this.f27892a.p(), "ad_unit_id");
        jp1Var.a(this.f27892a.L(), "server_log_id");
        jp1Var.a(this.f27892a.a());
        return jp1Var;
    }
}
