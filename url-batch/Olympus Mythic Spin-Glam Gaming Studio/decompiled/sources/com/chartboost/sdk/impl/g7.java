package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class g7 {
    public static final g7 c = new g7("CTA_SHOW", 0, "cta_show");
    public static final g7 d = new g7("COUNTDOWN_COMPLETE", 1, "countdown_complete");
    public static final /* synthetic */ g7[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String b;

    static {
        g7[] a = a();
        e = a;
        f = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ g7[] a() {
        return new g7[]{c, d};
    }

    public static g7 valueOf(String str) {
        return (g7) Enum.valueOf(g7.class, str);
    }

    public static g7[] values() {
        return (g7[]) e.clone();
    }

    public g7(String str, int i, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
