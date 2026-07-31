package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class pe {
    public static final pe b = new pe("PORTRAIT", 0);
    public static final pe c = new pe("LANDSCAPE", 1);
    public static final pe d = new pe("PORTRAIT_REVERSE", 2);
    public static final pe e = new pe("LANDSCAPE_REVERSE", 3);
    public static final pe f = new pe("PORTRAIT_LEFT", 4);
    public static final pe g = new pe("PORTRAIT_RIGHT", 5);
    public static final pe h = new pe("LANDSCAPE_LEFT", 6);
    public static final pe i = new pe("LANDSCAPE_RIGHT", 7);
    public static final /* synthetic */ pe[] j;
    public static final /* synthetic */ EnumEntries k;

    static {
        pe[] a = a();
        j = a;
        k = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ pe[] a() {
        return new pe[]{b, c, d, e, f, g, h, i};
    }

    public static pe valueOf(String str) {
        return (pe) Enum.valueOf(pe.class, str);
    }

    public static pe[] values() {
        return (pe[]) j.clone();
    }

    public pe(String str, int i2) {
    }
}
