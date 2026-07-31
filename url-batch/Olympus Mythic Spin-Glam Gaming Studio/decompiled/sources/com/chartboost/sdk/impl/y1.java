package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class y1 {
    public static final y1 b = new y1("FAILURE", 0);
    public static final y1 c = new y1("READY_TO_SHOW", 1);
    public static final y1 d = new y1("SUCCESS", 2);
    public static final /* synthetic */ y1[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        y1[] a = a();
        e = a;
        f = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ y1[] a() {
        return new y1[]{b, c, d};
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) e.clone();
    }

    public y1(String str, int i) {
    }
}
