package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class xi {
    public static final xi c = new xi("TRACKING_UNKNOWN", 0, -1);
    public static final xi d = new xi("TRACKING_ENABLED", 1, 0);
    public static final xi e = new xi("TRACKING_LIMITED", 2, 1);
    public static final /* synthetic */ xi[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int b;

    static {
        xi[] a = a();
        f = a;
        g = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ xi[] a() {
        return new xi[]{c, d, e};
    }

    public static xi valueOf(String str) {
        return (xi) Enum.valueOf(xi.class, str);
    }

    public static xi[] values() {
        return (xi[]) f.clone();
    }

    public xi(String str, int i, int i2) {
        this.b = i2;
    }

    public final int b() {
        return this.b;
    }
}
