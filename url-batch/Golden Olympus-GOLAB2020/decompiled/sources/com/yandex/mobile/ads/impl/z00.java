package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z00 {

    /* renamed from: b, reason: collision with root package name */
    public static final z00 f35411b;

    /* renamed from: c, reason: collision with root package name */
    public static final z00 f35412c;

    /* renamed from: d, reason: collision with root package name */
    public static final z00 f35413d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ z00[] f35414e;

    static {
        z00 z00Var = new z00(0, "PHONE");
        f35411b = z00Var;
        z00 z00Var2 = new z00(1, "TABLET");
        f35412c = z00Var2;
        z00 z00Var3 = new z00(2, "TV");
        f35413d = z00Var3;
        z00[] z00VarArr = {z00Var, z00Var2, z00Var3};
        f35414e = z00VarArr;
        AbstractC1372b.a(z00VarArr);
    }

    private z00(int i4, String str) {
    }

    public static z00 valueOf(String str) {
        return (z00) Enum.valueOf(z00.class, str);
    }

    public static z00[] values() {
        return (z00[]) f35414e.clone();
    }
}
