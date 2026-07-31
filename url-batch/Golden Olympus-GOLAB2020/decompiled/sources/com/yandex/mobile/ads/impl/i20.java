package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i20 {

    /* renamed from: b, reason: collision with root package name */
    public static final i20 f27070b;

    /* renamed from: c, reason: collision with root package name */
    public static final i20 f27071c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ i20[] f27072d;

    static {
        i20 i20Var = new i20(0, "BLOCK");
        f27070b = i20Var;
        i20 i20Var2 = new i20(1, "BLOCK_INNER_AD");
        f27071c = i20Var2;
        i20[] i20VarArr = {i20Var, i20Var2};
        f27072d = i20VarArr;
        AbstractC1372b.a(i20VarArr);
    }

    private i20(int i4, String str) {
    }

    public static i20 valueOf(String str) {
        return (i20) Enum.valueOf(i20.class, str);
    }

    public static i20[] values() {
        return (i20[]) f27072d.clone();
    }
}
