package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class du0 {

    /* renamed from: b, reason: collision with root package name */
    public static final du0 f24761b;

    /* renamed from: c, reason: collision with root package name */
    public static final du0 f24762c;

    /* renamed from: d, reason: collision with root package name */
    public static final du0 f24763d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ du0[] f24764e;

    static {
        du0 du0Var = new du0(0, "EXACTLY");
        f24761b = du0Var;
        du0 du0Var2 = new du0(1, "AT_MOST");
        f24762c = du0Var2;
        du0 du0Var3 = new du0(2, "UNSPECIFIED");
        f24763d = du0Var3;
        du0[] du0VarArr = {du0Var, du0Var2, du0Var3};
        f24764e = du0VarArr;
        AbstractC1372b.a(du0VarArr);
    }

    private du0(int i4, String str) {
    }

    public static du0 valueOf(String str) {
        return (du0) Enum.valueOf(du0.class, str);
    }

    public static du0[] values() {
        return (du0[]) f24764e.clone();
    }
}
