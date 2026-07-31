package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class j5 {
    public static final j5 c = new j5("CONNECTION_UNKNOWN", 0, -1);
    public static final j5 d = new j5("CONNECTION_ERROR", 1, 0);
    public static final j5 e = new j5("CONNECTION_WIFI", 2, 1);
    public static final j5 f = new j5("CONNECTION_MOBILE", 3, 2);
    public static final /* synthetic */ j5[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int b;

    static {
        j5[] a = a();
        g = a;
        h = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ j5[] a() {
        return new j5[]{c, d, e, f};
    }

    public static j5 valueOf(String str) {
        return (j5) Enum.valueOf(j5.class, str);
    }

    public static j5[] values() {
        return (j5[]) g.clone();
    }

    public j5(String str, int i, int i2) {
        this.b = i2;
    }

    public final int b() {
        return this.b;
    }
}
