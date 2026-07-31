package com.chartboost.sdk.impl;

import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class dc {
    public static final dc c = new dc(VastTagName.VAST, 0, "vast");
    public static final dc d = new dc("HTML", 1, "html");
    public static final dc e = new dc("NATIVE", 2, "native");
    public static final /* synthetic */ dc[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    static {
        dc[] a = a();
        f = a;
        g = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ dc[] a() {
        return new dc[]{c, d, e};
    }

    public static dc valueOf(String str) {
        return (dc) Enum.valueOf(dc.class, str);
    }

    public static dc[] values() {
        return (dc[]) f.clone();
    }

    public dc(String str, int i, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
