package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class v5 {
    public static final v5 c = new v5("CTA_BUTTON", 0, "cta_button");
    public static final v5 d = new v5("CTA_HTML", 1, "cta_html");
    public static final v5 e = new v5("SKOVERLAY", 2, "skoverlay");
    public static final /* synthetic */ v5[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    static {
        v5[] a = a();
        f = a;
        g = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ v5[] a() {
        return new v5[]{c, d, e};
    }

    public static v5 valueOf(String str) {
        return (v5) Enum.valueOf(v5.class, str);
    }

    public static v5[] values() {
        return (v5[]) f.clone();
    }

    public v5(String str, int i, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
