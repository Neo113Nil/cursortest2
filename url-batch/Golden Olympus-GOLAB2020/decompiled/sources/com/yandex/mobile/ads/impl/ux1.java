package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ux1 {

    /* renamed from: b, reason: collision with root package name */
    public static final ux1 f33442b;

    /* renamed from: c, reason: collision with root package name */
    public static final ux1 f33443c;

    /* renamed from: d, reason: collision with root package name */
    public static final ux1 f33444d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ ux1[] f33445e;

    static {
        ux1 ux1Var = new ux1(0, "AD");
        f33442b = ux1Var;
        ux1 ux1Var2 = new ux1(1, "DSP");
        f33443c = ux1Var2;
        ux1 ux1Var3 = new ux1(2, "UNDEFINED");
        f33444d = ux1Var3;
        ux1[] ux1VarArr = {ux1Var, ux1Var2, ux1Var3};
        f33445e = ux1VarArr;
        AbstractC1372b.a(ux1VarArr);
    }

    private ux1(int i4, String str) {
    }

    public static ux1 valueOf(String str) {
        return (ux1) Enum.valueOf(ux1.class, str);
    }

    public static ux1[] values() {
        return (ux1[]) f33445e.clone();
    }
}
