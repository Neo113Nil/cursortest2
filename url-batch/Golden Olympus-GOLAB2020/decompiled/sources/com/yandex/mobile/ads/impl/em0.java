package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class em0 {

    /* renamed from: b, reason: collision with root package name */
    public static final em0 f25351b;

    /* renamed from: c, reason: collision with root package name */
    public static final em0 f25352c;

    /* renamed from: d, reason: collision with root package name */
    public static final em0 f25353d;

    /* renamed from: e, reason: collision with root package name */
    public static final em0 f25354e;

    /* renamed from: f, reason: collision with root package name */
    public static final em0 f25355f;

    /* renamed from: g, reason: collision with root package name */
    public static final em0 f25356g;

    /* renamed from: h, reason: collision with root package name */
    public static final em0 f25357h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ em0[] f25358i;

    static {
        em0 em0Var = new em0(0, "NONE");
        f25351b = em0Var;
        em0 em0Var2 = new em0(1, "PREPARED");
        f25352c = em0Var2;
        em0 em0Var3 = new em0(2, "PLAYING");
        f25353d = em0Var3;
        em0 em0Var4 = new em0(3, "PAUSED");
        f25354e = em0Var4;
        em0 em0Var5 = new em0(4, "SKIPPED");
        f25355f = em0Var5;
        em0 em0Var6 = new em0(5, "ERROR");
        f25356g = em0Var6;
        em0 em0Var7 = new em0(6, "COMPLETED");
        f25357h = em0Var7;
        em0[] em0VarArr = {em0Var, em0Var2, em0Var3, em0Var4, em0Var5, em0Var6, em0Var7};
        f25358i = em0VarArr;
        AbstractC1372b.a(em0VarArr);
    }

    private em0(int i4, String str) {
    }

    public static em0 valueOf(String str) {
        return (em0) Enum.valueOf(em0.class, str);
    }

    public static em0[] values() {
        return (em0[]) f25358i.clone();
    }
}
