package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class x6 {
    public static final a c;
    public static final x6 d = new x6("NONE", 0, 0);
    public static final x6 e = new x6("STOPPED_QUEUE", 1, 1);
    public static final x6 f = new x6("MAX_COUNT_TIME_WINDOW", 2, 2);
    public static final x6 g = new x6("FORCED_OUT", 3, 3);
    public static final /* synthetic */ x6[] h;
    public static final /* synthetic */ EnumEntries i;
    public final int b;

    static {
        x6[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public static final /* synthetic */ x6[] a() {
        return new x6[]{d, e, f, g};
    }

    public static x6 valueOf(String str) {
        return (x6) Enum.valueOf(x6.class, str);
    }

    public static x6[] values() {
        return (x6[]) h.clone();
    }

    public x6(String str, int i2, int i3) {
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
    }
}
