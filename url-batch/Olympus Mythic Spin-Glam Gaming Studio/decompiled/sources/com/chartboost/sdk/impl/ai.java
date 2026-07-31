package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ai {
    public static final ai b = new ai("TEXT", 0);
    public static final ai c = new ai("ARC", 1);
    public static final /* synthetic */ ai[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ai[] a = a();
        d = a;
        e = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ ai[] a() {
        return new ai[]{b, c};
    }

    public static ai valueOf(String str) {
        return (ai) Enum.valueOf(ai.class, str);
    }

    public static ai[] values() {
        return (ai[]) d.clone();
    }

    public ai(String str, int i) {
    }
}
