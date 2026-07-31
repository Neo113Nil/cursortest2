package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class yd {
    public static final yd d = new yd("UNKNOWN", 0, 0, "Unknown");
    public static final yd e = new yd("ETHERNET", 1, 1, "Ethernet");
    public static final yd f = new yd("WIFI", 2, 2, "WIFI");
    public static final yd g = new yd("CELLULAR_UNKNOWN", 3, 3, "Cellular_Unknown");
    public static final yd h = new yd("CELLULAR_2G", 4, 4, "Cellular_2G");
    public static final yd i = new yd("CELLULAR_3G", 5, 5, "Cellular_3G");
    public static final yd j = new yd("CELLULAR_4G", 6, 6, "Cellular_4G");
    public static final yd k = new yd("CELLULAR_5G", 7, 7, "Cellular_5G");
    public static final /* synthetic */ yd[] l;
    public static final /* synthetic */ EnumEntries m;
    public final int b;
    public final String c;

    static {
        yd[] a = a();
        l = a;
        m = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ yd[] a() {
        return new yd[]{d, e, f, g, h, i, j, k};
    }

    public static yd valueOf(String str) {
        return (yd) Enum.valueOf(yd.class, str);
    }

    public static yd[] values() {
        return (yd[]) l.clone();
    }

    public yd(String str, int i2, int i3, String str2) {
        this.b = i3;
        this.c = str2;
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return this.b;
    }
}
