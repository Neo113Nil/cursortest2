package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uf2 {

    /* renamed from: b, reason: collision with root package name */
    public static final uf2 f33081b;

    /* renamed from: c, reason: collision with root package name */
    public static final uf2 f33082c;

    /* renamed from: d, reason: collision with root package name */
    public static final uf2 f33083d;

    /* renamed from: e, reason: collision with root package name */
    public static final uf2 f33084e;

    /* renamed from: f, reason: collision with root package name */
    public static final uf2 f33085f;

    /* renamed from: g, reason: collision with root package name */
    public static final uf2 f33086g;

    /* renamed from: h, reason: collision with root package name */
    public static final uf2 f33087h;

    /* renamed from: i, reason: collision with root package name */
    public static final uf2 f33088i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ uf2[] f33089j;

    static {
        uf2 uf2Var = new uf2(0, "INITIAL");
        f33081b = uf2Var;
        uf2 uf2Var2 = new uf2(1, "PREPARING");
        f33082c = uf2Var2;
        uf2 uf2Var3 = new uf2(2, "PREPARED");
        f33083d = uf2Var3;
        uf2 uf2Var4 = new uf2(3, "PLAYING");
        f33084e = uf2Var4;
        uf2 uf2Var5 = new uf2(4, "STOPPED");
        f33085f = uf2Var5;
        uf2 uf2Var6 = new uf2(5, "FINISHED");
        f33086g = uf2Var6;
        uf2 uf2Var7 = new uf2(6, "PAUSED");
        f33087h = uf2Var7;
        uf2 uf2Var8 = new uf2(7, "ERROR");
        f33088i = uf2Var8;
        uf2[] uf2VarArr = {uf2Var, uf2Var2, uf2Var3, uf2Var4, uf2Var5, uf2Var6, uf2Var7, uf2Var8};
        f33089j = uf2VarArr;
        AbstractC1372b.a(uf2VarArr);
    }

    private uf2(int i4, String str) {
    }

    public static uf2 valueOf(String str) {
        return (uf2) Enum.valueOf(uf2.class, str);
    }

    public static uf2[] values() {
        return (uf2[]) f33089j.clone();
    }
}
