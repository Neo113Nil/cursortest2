package com.chartboost.sdk.impl;

import com.pubmatic.sdk.common.POBCommonConstants;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class yc {
    public static final yc c = new yc("INLINE", 0, POBCommonConstants.BANNER_PLACEMENT_TYPE);
    public static final yc d = new yc("INTERSTITIAL", 1, "interstitial");
    public static final /* synthetic */ yc[] e;
    public static final /* synthetic */ EnumEntries f;
    public final String b;

    static {
        yc[] a = a();
        e = a;
        f = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ yc[] a() {
        return new yc[]{c, d};
    }

    public static yc valueOf(String str) {
        return (yc) Enum.valueOf(yc.class, str);
    }

    public static yc[] values() {
        return (yc[]) e.clone();
    }

    public yc(String str, int i, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
