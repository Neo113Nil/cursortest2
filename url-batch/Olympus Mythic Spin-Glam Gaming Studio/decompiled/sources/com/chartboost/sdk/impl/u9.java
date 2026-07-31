package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class u9 {
    public static final a c;
    public static final u9 d = new u9("NONE", 0, 0);
    public static final u9 e = new u9("TOP", 1, 1);
    public static final u9 f = new u9("LEFT", 2, 2);
    public static final u9 g = new u9("BOTTOM", 3, 4);
    public static final u9 h = new u9("RIGHT", 4, 8);
    public static final u9 i = new u9("ALL", 5, 15);
    public static final /* synthetic */ u9[] j;
    public static final /* synthetic */ EnumEntries k;
    public final int b;

    static {
        u9[] a2 = a();
        j = a2;
        k = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public static final /* synthetic */ u9[] a() {
        return new u9[]{d, e, f, g, h, i};
    }

    public static u9 valueOf(String str) {
        return (u9) Enum.valueOf(u9.class, str);
    }

    public static u9[] values() {
        return (u9[]) j.clone();
    }

    public u9(String str, int i2, int i3) {
        this.b = i3;
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

        public final boolean d(int i) {
            return (i & u9.e.b()) != 0;
        }

        public final boolean b(int i) {
            return (i & u9.f.b()) != 0;
        }

        public final boolean a(int i) {
            return (i & u9.g.b()) != 0;
        }

        public final boolean c(int i) {
            return (i & u9.h.b()) != 0;
        }
    }
}
