package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class zq1 {

    /* renamed from: c, reason: collision with root package name */
    public static final zq1 f35748c;

    /* renamed from: d, reason: collision with root package name */
    public static final zq1 f35749d;

    /* renamed from: e, reason: collision with root package name */
    public static final zq1 f35750e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ zq1[] f35751f;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35752b;

    static {
        zq1 zq1Var = new zq1(0, "CONTENT", FirebaseAnalytics.Param.CONTENT);
        f35748c = zq1Var;
        zq1 zq1Var2 = new zq1(1, "APP_INSTALL", "app");
        f35749d = zq1Var2;
        zq1 zq1Var3 = new zq1(2, "IMAGE", "image");
        zq1 zq1Var4 = new zq1(3, "PROMO", "promo");
        zq1 zq1Var5 = new zq1(4, "PRODUCT_PROMO", "productPromo");
        f35750e = zq1Var5;
        zq1[] zq1VarArr = {zq1Var, zq1Var2, zq1Var3, zq1Var4, zq1Var5};
        f35751f = zq1VarArr;
        AbstractC1372b.a(zq1VarArr);
    }

    private zq1(int i4, String str, String str2) {
        this.f35752b = str2;
    }

    public static zq1 valueOf(String str) {
        return (zq1) Enum.valueOf(zq1.class, str);
    }

    public static zq1[] values() {
        return (zq1[]) f35751f.clone();
    }

    @NotNull
    public final String a() {
        return this.f35752b;
    }
}
