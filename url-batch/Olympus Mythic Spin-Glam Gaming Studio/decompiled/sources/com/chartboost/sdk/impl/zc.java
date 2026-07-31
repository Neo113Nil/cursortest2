package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class zc {
    public static final zc c = new zc("DEFAULT", 0, "default");
    public static final zc d = new zc("EXPANDED", 1, "expanded");
    public static final zc e = new zc("HIDDEN", 2, "hidden");
    public static final zc f = new zc("LOADING", 3, "loading");
    public static final zc g = new zc("RESIZED", 4, "resized");
    public static final /* synthetic */ zc[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String b;

    static {
        zc[] a = a();
        h = a;
        i = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ zc[] a() {
        return new zc[]{c, d, e, f, g};
    }

    public static zc valueOf(String str) {
        return (zc) Enum.valueOf(zc.class, str);
    }

    public static zc[] values() {
        return (zc[]) h.clone();
    }

    public zc(String str, int i2, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
