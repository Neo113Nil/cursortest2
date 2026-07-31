package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class kl {
    public static final kl b = new kl("INIT", 0);
    public static final kl c = new kl("STARTED", 1);
    public static final kl d = new kl("STARTED_VIDEO", 2);
    public static final kl e = new kl("IMPRESSED", 3);
    public static final kl f = new kl("STOPPED", 4);
    public static final /* synthetic */ kl[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        kl[] a = a();
        g = a;
        h = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ kl[] a() {
        return new kl[]{b, c, d, e, f};
    }

    public static kl valueOf(String str) {
        return (kl) Enum.valueOf(kl.class, str);
    }

    public static kl[] values() {
        return (kl[]) g.clone();
    }

    public kl(String str, int i) {
    }
}
