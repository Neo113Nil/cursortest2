package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class jz1 {

    /* renamed from: c, reason: collision with root package name */
    public static final jz1 f27908c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ jz1[] f27909d;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f27910b;

    static {
        jz1 jz1Var = new jz1(0, "NEXT", "next");
        jz1 jz1Var2 = new jz1(1, "LAST", "last");
        f27908c = jz1Var2;
        jz1[] jz1VarArr = {jz1Var, jz1Var2};
        f27909d = jz1VarArr;
        AbstractC1372b.a(jz1VarArr);
    }

    private jz1(int i4, String str, String str2) {
        this.f27910b = str2;
    }

    public static jz1 valueOf(String str) {
        return (jz1) Enum.valueOf(jz1.class, str);
    }

    public static jz1[] values() {
        return (jz1[]) f27909d.clone();
    }

    @NotNull
    public final String a() {
        return this.f27910b;
    }
}
