package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class vr {

    /* renamed from: b, reason: collision with root package name */
    public static final vr f33727b;

    /* renamed from: c, reason: collision with root package name */
    public static final vr f33728c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ vr[] f33729d;

    static {
        vr vrVar = new vr(0, "HTML");
        f33727b = vrVar;
        vr vrVar2 = new vr(1, "NATIVE");
        f33728c = vrVar2;
        vr[] vrVarArr = {vrVar, vrVar2};
        f33729d = vrVarArr;
        AbstractC1372b.a(vrVarArr);
    }

    private vr(int i4, String str) {
    }

    public static vr valueOf(String str) {
        return (vr) Enum.valueOf(vr.class, str);
    }

    public static vr[] values() {
        return (vr[]) f33729d.clone();
    }
}
