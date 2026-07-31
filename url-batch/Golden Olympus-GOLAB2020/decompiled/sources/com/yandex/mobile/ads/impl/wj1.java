package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class wj1 {

    /* renamed from: d, reason: collision with root package name */
    public static final wj1 f34092d;

    /* renamed from: e, reason: collision with root package name */
    public static final wj1 f34093e;

    /* renamed from: f, reason: collision with root package name */
    public static final wj1 f34094f;

    /* renamed from: g, reason: collision with root package name */
    public static final wj1 f34095g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ wj1[] f34096h;

    /* renamed from: b, reason: collision with root package name */
    private final int f34097b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f34098c;

    static {
        wj1 wj1Var = new wj1(0, 1001, "TIMEOUT", "The request failed to load due to a timeout");
        f34092d = wj1Var;
        wj1 wj1Var2 = new wj1(1, 1002, "INVALID_CONFIGURATION", "The provided configuration is invalid");
        f34093e = wj1Var2;
        wj1 wj1Var3 = new wj1(2, 1003, "EMPTY_MEDIATION_DATA", "No mediation data was received. Possibly, Client Bidding adapters are not connected");
        f34094f = wj1Var3;
        wj1 wj1Var4 = new wj1(3, 1004, "INVALID_FETCHED_DATA", "The fetched data is invalid");
        f34095g = wj1Var4;
        wj1[] wj1VarArr = {wj1Var, wj1Var2, wj1Var3, wj1Var4};
        f34096h = wj1VarArr;
        AbstractC1372b.a(wj1VarArr);
    }

    private wj1(int i4, int i5, String str, String str2) {
        this.f34097b = i5;
        this.f34098c = str2;
    }

    public static wj1 valueOf(String str) {
        return (wj1) Enum.valueOf(wj1.class, str);
    }

    public static wj1[] values() {
        return (wj1[]) f34096h.clone();
    }

    public final int a() {
        return this.f34097b;
    }

    @NotNull
    public final String b() {
        return this.f34098c;
    }
}
