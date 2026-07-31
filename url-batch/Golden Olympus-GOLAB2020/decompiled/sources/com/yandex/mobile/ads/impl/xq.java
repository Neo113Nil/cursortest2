package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class xq {

    /* renamed from: c, reason: collision with root package name */
    public static final xq f34660c;

    /* renamed from: d, reason: collision with root package name */
    public static final xq f34661d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ xq[] f34662e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f34663b;

    static {
        xq xqVar = new xq(0, "NETWORK", "network");
        f34660c = xqVar;
        xq xqVar2 = new xq(1, "CACHE", "cache");
        f34661d = xqVar2;
        xq[] xqVarArr = {xqVar, xqVar2};
        f34662e = xqVarArr;
        AbstractC1372b.a(xqVarArr);
    }

    private xq(int i4, String str, String str2) {
        this.f34663b = str2;
    }

    public static xq valueOf(String str) {
        return (xq) Enum.valueOf(xq.class, str);
    }

    public static xq[] values() {
        return (xq[]) f34662e.clone();
    }

    @NotNull
    public final String a() {
        return this.f34663b;
    }
}
