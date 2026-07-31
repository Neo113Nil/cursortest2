package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class fq0 {

    /* renamed from: b, reason: collision with root package name */
    public static final fq0 f25896b;

    /* renamed from: c, reason: collision with root package name */
    public static final fq0 f25897c;

    /* renamed from: d, reason: collision with root package name */
    public static final fq0 f25898d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ fq0[] f25899e;

    static {
        fq0 fq0Var = new fq0(0, "LOAD");
        f25896b = fq0Var;
        fq0 fq0Var2 = new fq0(1, "SHOW");
        f25897c = fq0Var2;
        fq0 fq0Var3 = new fq0(2, "RETURN_TO_APP");
        f25898d = fq0Var3;
        fq0[] fq0VarArr = {fq0Var, fq0Var2, fq0Var3};
        f25899e = fq0VarArr;
        AbstractC1372b.a(fq0VarArr);
    }

    private fq0(int i4, String str) {
    }

    public static fq0 valueOf(String str) {
        return (fq0) Enum.valueOf(fq0.class, str);
    }

    public static fq0[] values() {
        return (fq0[]) f25899e.clone();
    }
}
