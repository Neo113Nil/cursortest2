package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v50 {

    /* renamed from: b, reason: collision with root package name */
    public static final v50 f33499b;

    /* renamed from: c, reason: collision with root package name */
    public static final v50 f33500c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ v50[] f33501d;

    static {
        v50 v50Var = new v50(0, "FRAME");
        f33499b = v50Var;
        v50 v50Var2 = new v50(1, "TRACE");
        f33500c = v50Var2;
        v50[] v50VarArr = {v50Var, v50Var2};
        f33501d = v50VarArr;
        AbstractC1372b.a(v50VarArr);
    }

    private v50(int i4, String str) {
    }

    public static v50 valueOf(String str) {
        return (v50) Enum.valueOf(v50.class, str);
    }

    public static v50[] values() {
        return (v50[]) f33501d.clone();
    }
}
