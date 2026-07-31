package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v00 {

    /* renamed from: c, reason: collision with root package name */
    public static final v00 f33455c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ v00[] f33456d;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f33457b = "divkit";

    static {
        v00 v00Var = new v00();
        f33455c = v00Var;
        v00[] v00VarArr = {v00Var};
        f33456d = v00VarArr;
        AbstractC1372b.a(v00VarArr);
    }

    private v00() {
    }

    public static v00 valueOf(String str) {
        return (v00) Enum.valueOf(v00.class, str);
    }

    public static v00[] values() {
        return (v00[]) f33456d.clone();
    }

    @NotNull
    public final String a() {
        return this.f33457b;
    }
}
