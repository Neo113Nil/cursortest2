package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ab1 {

    /* renamed from: c, reason: collision with root package name */
    public static final ab1 f23212c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ ab1[] f23213d;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f23214b = "first_video_preloading_strategy";

    static {
        ab1 ab1Var = new ab1();
        f23212c = ab1Var;
        ab1[] ab1VarArr = {ab1Var};
        f23213d = ab1VarArr;
        AbstractC1372b.a(ab1VarArr);
    }

    private ab1() {
    }

    public static ab1 valueOf(String str) {
        return (ab1) Enum.valueOf(ab1.class, str);
    }

    public static ab1[] values() {
        return (ab1[]) f23213d.clone();
    }

    @NotNull
    public final String a() {
        return this.f23214b;
    }
}
