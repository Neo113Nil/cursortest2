package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class m4 {
    public static final a c;
    public static final m4 d = new m4("CLICK_PREFERENCE_EMBEDDED", 0, 0);
    public static final m4 e = new m4("CLICK_PREFERENCE_NATIVE", 1, 1);
    public static final /* synthetic */ m4[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int b;

    static {
        m4[] a2 = a();
        f = a2;
        g = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public static final /* synthetic */ m4[] a() {
        return new m4[]{d, e};
    }

    public static m4 valueOf(String str) {
        return (m4) Enum.valueOf(m4.class, str);
    }

    public static m4[] values() {
        return (m4[]) f.clone();
    }

    public m4(String str, int i, int i2) {
        this.b = i2;
    }

    public final int b() {
        return this.b;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m4 a(int i) {
            if (i == 0) {
                return m4.d;
            }
            if (i != 1) {
                return m4.d;
            }
            return m4.e;
        }
    }
}
