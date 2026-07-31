package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class x01 {

    /* renamed from: b, reason: collision with root package name */
    public static final x01 f34359b;

    /* renamed from: c, reason: collision with root package name */
    public static final x01 f34360c;

    /* renamed from: d, reason: collision with root package name */
    public static final x01 f34361d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ x01[] f34362e;

    static {
        x01 x01Var = new x01(0, "VERBOSE");
        x01 x01Var2 = new x01(1, "DEBUG");
        x01 x01Var3 = new x01(2, "INFO");
        f34359b = x01Var3;
        x01 x01Var4 = new x01(3, "WARNING");
        f34360c = x01Var4;
        x01 x01Var5 = new x01(4, "ERROR");
        f34361d = x01Var5;
        x01[] x01VarArr = {x01Var, x01Var2, x01Var3, x01Var4, x01Var5};
        f34362e = x01VarArr;
        AbstractC1372b.a(x01VarArr);
    }

    private x01(int i4, String str) {
    }

    public static x01 valueOf(String str) {
        return (x01) Enum.valueOf(x01.class, str);
    }

    public static x01[] values() {
        return (x01[]) f34362e.clone();
    }
}
