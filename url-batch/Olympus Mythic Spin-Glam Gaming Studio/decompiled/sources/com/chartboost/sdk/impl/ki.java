package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ki {
    public static final ki b = new ki("SUCCESS", 0);
    public static final ki c = new ki("NETWORK_FAILURE", 1);
    public static final ki d = new ki("INVALID_REQUEST", 2);
    public static final /* synthetic */ ki[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ki[] a = a();
        e = a;
        f = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ ki[] a() {
        return new ki[]{b, c, d};
    }

    public static ki valueOf(String str) {
        return (ki) Enum.valueOf(ki.class, str);
    }

    public static ki[] values() {
        return (ki[]) e.clone();
    }

    public ki(String str, int i) {
    }
}
