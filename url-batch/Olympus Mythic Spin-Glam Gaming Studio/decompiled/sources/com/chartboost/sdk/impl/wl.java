package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class wl {
    public static final wl b = new wl("MRAID_UNLOAD", 0);
    public static final /* synthetic */ wl[] c;
    public static final /* synthetic */ EnumEntries d;

    static {
        wl[] a = a();
        c = a;
        d = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ wl[] a() {
        return new wl[]{b};
    }

    public static wl valueOf(String str) {
        return (wl) Enum.valueOf(wl.class, str);
    }

    public static wl[] values() {
        return (wl[]) c.clone();
    }

    public wl(String str, int i) {
    }
}
