package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lz1 {

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ lz1[] f28812c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f28813d = 0;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f28814b;

    static {
        lz1[] lz1VarArr = {new lz1(0, "VISIBLE", "visible"), new lz1(1, "DELAYED", "delayed")};
        f28812c = lz1VarArr;
        AbstractC1372b.a(lz1VarArr);
    }

    private lz1(int i4, String str, String str2) {
        this.f28814b = str2;
    }

    public static lz1 valueOf(String str) {
        return (lz1) Enum.valueOf(lz1.class, str);
    }

    public static lz1[] values() {
        return (lz1[]) f28812c.clone();
    }

    @NotNull
    public final String a() {
        return this.f28814b;
    }
}
