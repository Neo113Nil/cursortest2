package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ul {
    public static final ul b = new ul("MRAID_OPEN", 0);
    public static final ul c = new ul("WEBVIEW_CLICK", 1);
    public static final /* synthetic */ ul[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        ul[] a = a();
        d = a;
        e = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ ul[] a() {
        return new ul[]{b, c};
    }

    public static ul valueOf(String str) {
        return (ul) Enum.valueOf(ul.class, str);
    }

    public static ul[] values() {
        return (ul[]) d.clone();
    }

    public ul(String str, int i) {
    }
}
