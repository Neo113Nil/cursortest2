package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class r12 {

    /* renamed from: b, reason: collision with root package name */
    public static final r12 f30996b;

    /* renamed from: c, reason: collision with root package name */
    public static final r12 f30997c;

    /* renamed from: d, reason: collision with root package name */
    public static final r12 f30998d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ r12[] f30999e;

    static {
        r12 r12Var = new r12(0, "DEFAULT");
        f30996b = r12Var;
        r12 r12Var2 = new r12(1, "SOCIAL");
        f30997c = r12Var2;
        r12 r12Var3 = new r12(2, "EMPTY");
        f30998d = r12Var3;
        r12[] r12VarArr = {r12Var, r12Var2, r12Var3};
        f30999e = r12VarArr;
        AbstractC1372b.a(r12VarArr);
    }

    private r12(int i4, String str) {
    }

    public static r12 valueOf(String str) {
        return (r12) Enum.valueOf(r12.class, str);
    }

    public static r12[] values() {
        return (r12[]) f30999e.clone();
    }
}
