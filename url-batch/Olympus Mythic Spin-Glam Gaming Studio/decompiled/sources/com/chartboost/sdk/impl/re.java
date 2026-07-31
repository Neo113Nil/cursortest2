package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class re {
    public static final re b = new re("ENABLE_ORIENTATION_CHANGE", 0);
    public static final re c = new re("DISABLE_ORIENTATION_CHANGE", 1);
    public static final re d = new re("LANDSCAPE_ONLY", 2);
    public static final re e = new re("PORTRAIT_ONLY", 3);
    public static final /* synthetic */ re[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        re[] a = a();
        f = a;
        g = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ re[] a() {
        return new re[]{b, c, d, e};
    }

    public static re valueOf(String str) {
        return (re) Enum.valueOf(re.class, str);
    }

    public static re[] values() {
        return (re[]) f.clone();
    }

    public re(String str, int i) {
    }
}
