package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ii0 {

    /* renamed from: b, reason: collision with root package name */
    public static final ii0 f27207b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ ii0[] f27208c;

    static {
        ii0 ii0Var = new ii0(0, "PROD");
        f27207b = ii0Var;
        ii0[] ii0VarArr = {ii0Var, new ii0(1, "PREDEFINED")};
        f27208c = ii0VarArr;
        AbstractC1372b.a(ii0VarArr);
    }

    private ii0(int i4, String str) {
    }

    public static ii0 valueOf(String str) {
        return (ii0) Enum.valueOf(ii0.class, str);
    }

    public static ii0[] values() {
        return (ii0[]) f27208c.clone();
    }
}
