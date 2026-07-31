package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class qa {
    public static final qa c = new qa("INTERSTITIAL", 0, 0);
    public static final qa d = new qa("INTERSTITIAL_VIDEO", 1, 1);
    public static final qa e = new qa("INTERSTITIAL_REWARD_VIDEO", 2, 2);
    public static final qa f = new qa("BANNER", 3, 3);
    public static final qa g = new qa("NONE", 4, 4);
    public static final /* synthetic */ qa[] h;
    public static final /* synthetic */ EnumEntries i;
    public final int b;

    static {
        qa[] a = a();
        h = a;
        i = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ qa[] a() {
        return new qa[]{c, d, e, f, g};
    }

    public static qa valueOf(String str) {
        return (qa) Enum.valueOf(qa.class, str);
    }

    public static qa[] values() {
        return (qa[]) h.clone();
    }

    public qa(String str, int i2, int i3) {
        this.b = i3;
    }
}
