package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class af {
    public static final af c = new af("IMMEDIATE", 0, 0);
    public static final af d = new af("HIGH", 1, 1);
    public static final af e = new af("NORMAL", 2, 2);
    public static final af f = new af("LOW", 3, 3);
    public static final /* synthetic */ af[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int b;

    static {
        af[] a = a();
        g = a;
        h = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ af[] a() {
        return new af[]{c, d, e, f};
    }

    public static af valueOf(String str) {
        return (af) Enum.valueOf(af.class, str);
    }

    public static af[] values() {
        return (af[]) g.clone();
    }

    public af(String str, int i, int i2) {
        this.b = i2;
    }

    public final int b() {
        return this.b;
    }
}
