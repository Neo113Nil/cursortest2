package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nf2 {

    /* renamed from: b, reason: collision with root package name */
    public static final nf2 f29561b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ nf2[] f29562c;

    static {
        nf2 nf2Var = new nf2(0, "FIT_XY");
        nf2 nf2Var2 = new nf2(1, "FIT_CENTER");
        f29561b = nf2Var2;
        nf2[] nf2VarArr = {nf2Var, nf2Var2, new nf2(2, "CENTER_CROP")};
        f29562c = nf2VarArr;
        AbstractC1372b.a(nf2VarArr);
    }

    private nf2(int i4, String str) {
    }

    public static nf2 valueOf(String str) {
        return (nf2) Enum.valueOf(nf2.class, str);
    }

    public static nf2[] values() {
        return (nf2[]) f29562c.clone();
    }
}
