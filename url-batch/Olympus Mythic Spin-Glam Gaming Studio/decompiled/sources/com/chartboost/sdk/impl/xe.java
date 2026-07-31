package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class xe {
    public static final xe c = new xe("NONE", 0, 0);
    public static final xe d = new xe("IDLE", 1, 1);
    public static final xe e = new xe("PLAYING", 2, 2);
    public static final xe f = new xe("PAUSED", 3, 3);
    public static final /* synthetic */ xe[] g;
    public static final /* synthetic */ EnumEntries h;
    public final int b;

    static {
        xe[] a = a();
        g = a;
        h = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ xe[] a() {
        return new xe[]{c, d, e, f};
    }

    public static xe valueOf(String str) {
        return (xe) Enum.valueOf(xe.class, str);
    }

    public static xe[] values() {
        return (xe[]) g.clone();
    }

    public xe(String str, int i, int i2) {
        this.b = i2;
    }
}
