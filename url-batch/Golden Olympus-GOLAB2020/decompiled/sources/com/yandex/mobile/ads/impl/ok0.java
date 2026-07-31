package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ok0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ok0 f30066c;

    /* renamed from: d, reason: collision with root package name */
    public static final ok0 f30067d;

    /* renamed from: e, reason: collision with root package name */
    public static final ok0 f30068e;

    /* renamed from: f, reason: collision with root package name */
    public static final ok0 f30069f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ ok0[] f30070g;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f30071b;

    static {
        ok0 ok0Var = new ok0(0, "INITIALIZATION", "initialization");
        f30066c = ok0Var;
        ok0 ok0Var2 = new ok0(1, "AD", "ad");
        f30067d = ok0Var2;
        ok0 ok0Var3 = new ok0(2, "INSTREAM", "instream");
        f30068e = ok0Var3;
        ok0 ok0Var4 = new ok0(3, "BIDDER_TOKEN", "bidder_token");
        f30069f = ok0Var4;
        ok0[] ok0VarArr = {ok0Var, ok0Var2, ok0Var3, ok0Var4};
        f30070g = ok0VarArr;
        AbstractC1372b.a(ok0VarArr);
    }

    private ok0(int i4, String str, String str2) {
        this.f30071b = str2;
    }

    public static ok0 valueOf(String str) {
        return (ok0) Enum.valueOf(ok0.class, str);
    }

    public static ok0[] values() {
        return (ok0[]) f30070g.clone();
    }

    @NotNull
    public final String a() {
        return this.f30071b;
    }
}
