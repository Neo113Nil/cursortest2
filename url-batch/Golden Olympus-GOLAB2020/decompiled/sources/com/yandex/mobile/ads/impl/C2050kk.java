package com.yandex.mobile.ads.impl;

import com.appsflyer.AdRevenueScheme;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2050kk {
    @NotNull
    public static jp1 a(@Nullable C2074lk c2074lk) {
        gs a4;
        jp1 jp1Var = new jp1((Map) null, 3);
        jp1Var.a((c2074lk == null || (a4 = c2074lk.a()) == null) ? null : a4.b(), AdRevenueScheme.AD_TYPE);
        jp1Var.a(c2074lk != null ? c2074lk.b() : null, "parameters");
        vy1 c4 = c2074lk != null ? c2074lk.c() : null;
        if (c4 != null) {
            jp1Var.b(c4.a().a(), "size_type");
            jp1Var.b(Integer.valueOf(c4.getWidth()), "width");
            jp1Var.b(Integer.valueOf(c4.getHeight()), "height");
        }
        return jp1Var;
    }
}
