package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class cf1 {

    /* renamed from: c, reason: collision with root package name */
    public static final cf1 f24192c;

    /* renamed from: d, reason: collision with root package name */
    public static final cf1 f24193d;

    /* renamed from: e, reason: collision with root package name */
    public static final cf1 f24194e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ cf1[] f24195f;

    /* renamed from: b, reason: collision with root package name */
    private final int f24196b;

    static {
        cf1 cf1Var = new cf1(0, 2, "LANDSCAPE");
        f24192c = cf1Var;
        cf1 cf1Var2 = new cf1(1, 1, "PORTRAIT");
        f24193d = cf1Var2;
        cf1 cf1Var3 = new cf1(2, 0, "UNDEFINED");
        f24194e = cf1Var3;
        cf1[] cf1VarArr = {cf1Var, cf1Var2, cf1Var3};
        f24195f = cf1VarArr;
        AbstractC1372b.a(cf1VarArr);
    }

    private cf1(int i4, int i5, String str) {
        this.f24196b = i5;
    }

    public static cf1 valueOf(String str) {
        return (cf1) Enum.valueOf(cf1.class, str);
    }

    public static cf1[] values() {
        return (cf1[]) f24195f.clone();
    }

    public final int a() {
        return this.f24196b;
    }
}
