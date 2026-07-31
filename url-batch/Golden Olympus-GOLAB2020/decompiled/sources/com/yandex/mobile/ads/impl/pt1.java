package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pt1 implements InterfaceC1847c8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2360y7<?> f30562a;

    public pt1(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f30562a = adResponse;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC1847c8
    @NotNull
    public final jp1 a() {
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.b(this.f30562a.m(), FirebaseAnalytics.Param.AD_SOURCE);
        jp1Var.b(this.f30562a.o(), "ad_type_format");
        jp1Var.b(this.f30562a.p(), "block_id");
        jp1Var.b(this.f30562a.p(), "ad_unit_id");
        jp1Var.b(this.f30562a.H(), "product_type");
        jp1Var.a(this.f30562a.L(), "server_log_id");
        jp1Var.b(this.f30562a.M().a().a(), "size_type");
        jp1Var.b(Integer.valueOf(this.f30562a.M().getWidth()), "width");
        jp1Var.b(Integer.valueOf(this.f30562a.M().getHeight()), "height");
        jp1Var.a(this.f30562a.a());
        return jp1Var;
    }
}
