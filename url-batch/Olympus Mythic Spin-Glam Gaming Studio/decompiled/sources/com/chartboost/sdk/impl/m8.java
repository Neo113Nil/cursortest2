package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class m8 {
    public static final m8 b = new m8("TTL_EXPIRED", 0);
    public static final m8 c = new m8("SIZE_LIMIT_EVICTION", 1);
    public static final m8 d = new m8("EXPLICIT_EVICTION", 2);
    public static final m8 e = new m8("CACHE_CLEARED", 3);
    public static final m8 f = new m8("UNKNOWN", 4);
    public static final /* synthetic */ m8[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        m8[] a = a();
        g = a;
        h = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ m8[] a() {
        return new m8[]{b, c, d, e, f};
    }

    public static m8 valueOf(String str) {
        return (m8) Enum.valueOf(m8.class, str);
    }

    public static m8[] values() {
        return (m8[]) g.clone();
    }

    public m8(String str, int i) {
    }
}
