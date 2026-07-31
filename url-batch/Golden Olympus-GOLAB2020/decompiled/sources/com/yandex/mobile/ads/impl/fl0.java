package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import com.yandex.mobile.ads.impl.ad2;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fl0 implements ad2.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C2037k7 f25835a;

    public fl0(@NotNull ss coreInstreamAdBreak) {
        Intrinsics.checkNotNullParameter(coreInstreamAdBreak, "coreInstreamAdBreak");
        this.f25835a = new C2037k7(coreInstreamAdBreak.a());
    }

    @Override // com.yandex.mobile.ads.impl.ad2.a
    @NotNull
    public final Map<String, Object> a() {
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.b(gs.f26284h.b(), AdRevenueScheme.AD_TYPE);
        jp1Var.b(this.f25835a.d(), "page_id");
        jp1Var.b(this.f25835a.b(), "category_id");
        jp1Var.b(this.f25835a.c(), "imp_id");
        return jp1Var.b();
    }
}
