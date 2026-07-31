package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class nf {
    public static final nf b = new nf("FIRST", 0);
    public static final nf c = new nf("MIDDLE", 1);
    public static final nf d = new nf("THIRD", 2);
    public static final /* synthetic */ nf[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        nf[] a = a();
        e = a;
        f = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ nf[] a() {
        return new nf[]{b, c, d};
    }

    public static nf valueOf(String str) {
        return (nf) Enum.valueOf(nf.class, str);
    }

    public static nf[] values() {
        return (nf[]) e.clone();
    }

    public nf(String str, int i) {
    }
}
