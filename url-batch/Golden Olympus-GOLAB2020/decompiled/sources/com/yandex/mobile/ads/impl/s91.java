package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class s91 {

    /* renamed from: c, reason: collision with root package name */
    public static final s91 f31631c;

    /* renamed from: d, reason: collision with root package name */
    public static final s91 f31632d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ s91[] f31633e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f31634b;

    static {
        s91 s91Var = new s91(0, "AD", "ad");
        f31631c = s91Var;
        s91 s91Var2 = new s91(1, "PROMO", "promo");
        f31632d = s91Var2;
        s91[] s91VarArr = {s91Var, s91Var2};
        f31633e = s91VarArr;
        AbstractC1372b.a(s91VarArr);
    }

    private s91(int i4, String str, String str2) {
        this.f31634b = str2;
    }

    public static s91 valueOf(String str) {
        return (s91) Enum.valueOf(s91.class, str);
    }

    public static s91[] values() {
        return (s91[]) f31633e.clone();
    }

    @NotNull
    public final String a() {
        return this.f31634b;
    }
}
