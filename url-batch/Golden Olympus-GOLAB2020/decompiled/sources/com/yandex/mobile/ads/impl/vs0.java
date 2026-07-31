package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class vs0 {

    /* renamed from: c, reason: collision with root package name */
    public static final vs0 f33731c;

    /* renamed from: d, reason: collision with root package name */
    public static final vs0 f33732d;

    /* renamed from: e, reason: collision with root package name */
    public static final vs0 f33733e;

    /* renamed from: f, reason: collision with root package name */
    public static final vs0 f33734f;

    /* renamed from: g, reason: collision with root package name */
    public static final vs0 f33735g;

    /* renamed from: h, reason: collision with root package name */
    public static final vs0 f33736h;

    /* renamed from: i, reason: collision with root package name */
    public static final vs0 f33737i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ vs0[] f33738j;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33739b;

    static {
        vs0 vs0Var = new vs0(0, "AUTOMATIC_SDK_INITIALIZATION", "com.yandex.mobile.ads.AUTOMATIC_SDK_INITIALIZATION");
        f33731c = vs0Var;
        vs0 vs0Var2 = new vs0(1, "AGE_RESTRICTED_USER", "com.yandex.mobile.ads.AGE_RESTRICTED_USER");
        f33732d = vs0Var2;
        vs0 vs0Var3 = new vs0(2, "ENABLE_LOGGING", "com.yandex.mobile.ads.ENABLE_LOGGING");
        f33733e = vs0Var3;
        vs0 vs0Var4 = new vs0(3, "AD_HOST", "com.yandex.mobile.ads.AD_HOST");
        f33734f = vs0Var4;
        vs0 vs0Var5 = new vs0(4, "FALLBACK_HOSTS", "com.yandex.mobile.ads.FALLBACK_HOSTS");
        f33735g = vs0Var5;
        vs0 vs0Var6 = new vs0(5, "APPMETRICA_EASY_INTEGRATION_ENABLED", "com.yandex.mobile.ads.APPMETRICA_EASY_INTEGRATION_ENABLED");
        f33736h = vs0Var6;
        vs0 vs0Var7 = new vs0(6, "SINGLE_ASSEMBLY_ENABLED", "com.yandex.mobile.ads.SINGLE_ASSEMBLY_ENABLED");
        f33737i = vs0Var7;
        vs0[] vs0VarArr = {vs0Var, vs0Var2, vs0Var3, vs0Var4, vs0Var5, vs0Var6, vs0Var7};
        f33738j = vs0VarArr;
        AbstractC1372b.a(vs0VarArr);
    }

    private vs0(int i4, String str, String str2) {
        this.f33739b = str2;
    }

    public static vs0 valueOf(String str) {
        return (vs0) Enum.valueOf(vs0.class, str);
    }

    public static vs0[] values() {
        return (vs0[]) f33738j.clone();
    }

    @NotNull
    public final String a() {
        return this.f33739b;
    }
}
