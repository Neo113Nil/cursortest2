package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class i9 {
    public static final i9 c = new i9("REQUEST_SUCCESS_START", 0, 200);
    public static final i9 d = new i9("REQUEST_SUCCESS_END", 1, 299);
    public static final i9 e = new i9("REDIRECTION_START", 2, 300);
    public static final i9 f = new i9("REDIRECTION_END", 3, 399);
    public static final /* synthetic */ i9[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int b;

    static {
        i9[] a = a();
        g = a;
        h = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ i9[] a() {
        return new i9[]{c, d, e, f};
    }

    public static i9 valueOf(String str) {
        return (i9) Enum.valueOf(i9.class, str);
    }

    public static i9[] values() {
        return (i9[]) g.clone();
    }

    public i9(String str, int i, int i2) {
        this.b = i2;
    }

    public final int b() {
        return this.b;
    }
}
