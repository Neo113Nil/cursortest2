package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class s4 {
    public static final s4 c = new s4("CTA", 0, "cta");
    public static final s4 d = new s4("BODY", 1, "body");
    public static final s4 e = new s4("VAST_COMPANION", 2, "vast_companion");
    public static final /* synthetic */ s4[] f;
    public static final /* synthetic */ EnumEntries g;
    public final String b;

    static {
        s4[] a = a();
        f = a;
        g = EnumEntriesKt.enumEntries(a);
    }

    public static final /* synthetic */ s4[] a() {
        return new s4[]{c, d, e};
    }

    public static s4 valueOf(String str) {
        return (s4) Enum.valueOf(s4.class, str);
    }

    public static s4[] values() {
        return (s4[]) f.clone();
    }

    public s4(String str, int i, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
