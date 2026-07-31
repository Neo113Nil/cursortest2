package com.onesignal.debug.internal.crash;

import a.AbstractC0219a;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l RESPONSIVE = new l("RESPONSIVE", 0);
    public static final l FROZEN_PROCESS = new l("FROZEN_PROCESS", 1);
    public static final l FOREGROUND_ANR = new l("FOREGROUND_ANR", 2);
    public static final l BACKGROUND_WARNING = new l("BACKGROUND_WARNING", 3);

    private static final /* synthetic */ l[] $values() {
        return new l[]{RESPONSIVE, FROZEN_PROCESS, FOREGROUND_ANR, BACKGROUND_WARNING};
    }

    static {
        l[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
    }

    private l(String str, int i7) {
    }

    public static InterfaceC0620a getEntries() {
        return $ENTRIES;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
