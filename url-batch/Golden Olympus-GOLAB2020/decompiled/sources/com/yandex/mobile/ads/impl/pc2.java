package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class pc2 {

    /* renamed from: b, reason: collision with root package name */
    public static final pc2 f30409b;

    /* renamed from: c, reason: collision with root package name */
    public static final pc2 f30410c;

    /* renamed from: d, reason: collision with root package name */
    public static final pc2 f30411d;

    /* renamed from: e, reason: collision with root package name */
    public static final pc2 f30412e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ pc2[] f30413f;

    static {
        pc2 pc2Var = new pc2(0, "PREROLL");
        f30409b = pc2Var;
        pc2 pc2Var2 = new pc2(1, "MIDROLL");
        f30410c = pc2Var2;
        pc2 pc2Var3 = new pc2(2, "POSTROLL");
        f30411d = pc2Var3;
        pc2 pc2Var4 = new pc2(3, "STANDALONE");
        f30412e = pc2Var4;
        pc2[] pc2VarArr = {pc2Var, pc2Var2, pc2Var3, pc2Var4};
        f30413f = pc2VarArr;
        AbstractC1372b.a(pc2VarArr);
    }

    private pc2(int i4, String str) {
    }

    public static pc2 valueOf(String str) {
        return (pc2) Enum.valueOf(pc2.class, str);
    }

    public static pc2[] values() {
        return (pc2[]) f30413f.clone();
    }
}
