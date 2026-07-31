package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class h7 {
    public static final h7 b = new h7("COUNTDOWN_COMPLETE", 0);
    public static final h7 c = new h7("CTA_SHOW", 1);
    public static final /* synthetic */ h7[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        h7[] a = a();
        d = a;
        e = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ h7[] a() {
        return new h7[]{b, c};
    }

    public static h7 valueOf(String str) {
        return (h7) Enum.valueOf(h7.class, str);
    }

    public static h7[] values() {
        return (h7[]) d.clone();
    }

    public h7(String str, int i) {
    }
}
