package com.onesignal.user.internal.jwt;

import H5.r;
import a.AbstractC0219a;
import kotlin.jvm.internal.e;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final a Companion;
    public static final b UNKNOWN = new b("UNKNOWN", 0);
    public static final b NOT_REQUIRED = new b("NOT_REQUIRED", 1);
    public static final b REQUIRED = new b("REQUIRED", 2);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final b fromBoolean(Boolean bool) {
            if (bool == null) {
                return b.UNKNOWN;
            }
            if (bool.equals(Boolean.FALSE)) {
                return b.NOT_REQUIRED;
            }
            if (bool.equals(Boolean.TRUE)) {
                return b.REQUIRED;
            }
            throw new r();
        }

        private a() {
        }
    }

    private static final /* synthetic */ b[] $values() {
        return new b[]{UNKNOWN, NOT_REQUIRED, REQUIRED};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
        Companion = new a(null);
    }

    private b(String str, int i7) {
    }

    public static InterfaceC0620a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
