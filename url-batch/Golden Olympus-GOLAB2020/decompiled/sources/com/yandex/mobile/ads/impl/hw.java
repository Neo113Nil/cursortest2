package com.yandex.mobile.ads.impl;

import b2.AbstractC1372b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hw {

    /* renamed from: c, reason: collision with root package name */
    public static final hw f26960c;

    /* renamed from: d, reason: collision with root package name */
    public static final hw f26961d;

    /* renamed from: e, reason: collision with root package name */
    public static final hw f26962e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ hw[] f26963f;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f26964b;

    static {
        hw hwVar = new hw(0, "BIDDING", "Bidding");
        f26960c = hwVar;
        hw hwVar2 = new hw(1, "WATERFALL", "Waterfall");
        f26961d = hwVar2;
        hw hwVar3 = new hw(2, "NONE", "None");
        f26962e = hwVar3;
        hw[] hwVarArr = {hwVar, hwVar2, hwVar3};
        f26963f = hwVarArr;
        AbstractC1372b.a(hwVarArr);
    }

    private hw(int i4, String str, String str2) {
        this.f26964b = str2;
    }

    public static hw valueOf(String str) {
        return (hw) Enum.valueOf(hw.class, str);
    }

    public static hw[] values() {
        return (hw[]) f26963f.clone();
    }

    @NotNull
    public final String a() {
        return this.f26964b;
    }
}
