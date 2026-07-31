package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class dm0 {

    /* renamed from: b, reason: collision with root package name */
    public static final dm0 f24678b;

    /* renamed from: c, reason: collision with root package name */
    public static final dm0 f24679c;

    /* renamed from: d, reason: collision with root package name */
    public static final dm0 f24680d;

    /* renamed from: e, reason: collision with root package name */
    public static final dm0 f24681e;

    /* renamed from: f, reason: collision with root package name */
    public static final dm0 f24682f;

    /* renamed from: g, reason: collision with root package name */
    public static final dm0 f24683g;

    /* renamed from: h, reason: collision with root package name */
    public static final dm0 f24684h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ dm0[] f24685i;

    static {
        dm0 dm0Var = new dm0(0, "NONE");
        f24678b = dm0Var;
        dm0 dm0Var2 = new dm0(1, "PREPARED");
        f24679c = dm0Var2;
        dm0 dm0Var3 = new dm0(2, "PLAYING");
        f24680d = dm0Var3;
        dm0 dm0Var4 = new dm0(3, "PAUSED");
        f24681e = dm0Var4;
        dm0 dm0Var5 = new dm0(4, "SKIPPED");
        f24682f = dm0Var5;
        dm0 dm0Var6 = new dm0(5, "ERROR");
        f24683g = dm0Var6;
        dm0 dm0Var7 = new dm0(6, "COMPLETED");
        f24684h = dm0Var7;
        dm0[] dm0VarArr = {dm0Var, dm0Var2, dm0Var3, dm0Var4, dm0Var5, dm0Var6, dm0Var7};
        f24685i = dm0VarArr;
        AbstractC1372b.a(dm0VarArr);
    }

    private dm0(int i4, String str) {
    }

    public static dm0 valueOf(String str) {
        return (dm0) Enum.valueOf(dm0.class, str);
    }

    public static dm0[] values() {
        return (dm0[]) f24685i.clone();
    }
}
