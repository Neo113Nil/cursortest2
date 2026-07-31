package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p42 {

    /* renamed from: b, reason: collision with root package name */
    public static final p42 f30335b;

    /* renamed from: c, reason: collision with root package name */
    public static final p42 f30336c;

    /* renamed from: d, reason: collision with root package name */
    public static final p42 f30337d;

    /* renamed from: e, reason: collision with root package name */
    public static final p42 f30338e;

    /* renamed from: f, reason: collision with root package name */
    public static final p42 f30339f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ p42[] f30340g;

    static {
        p42 p42Var = new p42(0, "TIME");
        f30335b = p42Var;
        p42 p42Var2 = new p42(1, "PERCENTAGE");
        f30336c = p42Var2;
        p42 p42Var3 = new p42(2, "START");
        f30337d = p42Var3;
        p42 p42Var4 = new p42(3, "END");
        f30338e = p42Var4;
        p42 p42Var5 = new p42(4, "POSITION");
        f30339f = p42Var5;
        p42[] p42VarArr = {p42Var, p42Var2, p42Var3, p42Var4, p42Var5};
        f30340g = p42VarArr;
        AbstractC1372b.a(p42VarArr);
    }

    private p42(int i4, String str) {
    }

    public static p42 valueOf(String str) {
        return (p42) Enum.valueOf(p42.class, str);
    }

    public static p42[] values() {
        return (p42[]) f30340g.clone();
    }
}
