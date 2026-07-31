package com.onesignal.internal;

import a.AbstractC0219a;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a NOT_STARTED = new a("NOT_STARTED", 0);
    public static final a IN_PROGRESS = new a("IN_PROGRESS", 1);
    public static final a SUCCESS = new a("SUCCESS", 2);
    public static final a FAILED = new a("FAILED", 3);

    private static final /* synthetic */ a[] $values() {
        return new a[]{NOT_STARTED, IN_PROGRESS, SUCCESS, FAILED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
    }

    private a(String str, int i7) {
    }

    public static InterfaceC0620a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final boolean isSDKAccessible() {
        return this == IN_PROGRESS || this == SUCCESS;
    }
}
