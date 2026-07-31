package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class xc {
    public static final xc c = new xc("LANDSCAPE", 0, "landscape");
    public static final xc d = new xc("PORTRAIT", 1, "portrait");
    public static final xc e = new xc("NONE", 2, "");
    public static final /* synthetic */ xc[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    static {
        xc[] a = a();
        f = a;
        g = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ xc[] a() {
        return new xc[]{c, d, e};
    }

    public static xc valueOf(String str) {
        return (xc) Enum.valueOf(xc.class, str);
    }

    public static xc[] values() {
        return (xc[]) f.clone();
    }

    public xc(String str, int i, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
