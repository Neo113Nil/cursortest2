package com.gates.olympus.miruv.data;

import M1.B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ S1.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    private final String label;
    public static final d FRAME = new d("FRAME", 0, "Frame");
    public static final d CARCASS = new d("CARCASS", 1, "Carcass");
    public static final d BOARD = new d("BOARD", 2, "Board & Panel");
    public static final d LENGTHENING = new d("LENGTHENING", 3, "Lengthening");
    public static final d QUICK = new d("QUICK", 4, "Site & Quick");

    private static final /* synthetic */ d[] $values() {
        return new d[]{FRAME, CARCASS, BOARD, LENGTHENING, QUICK};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = B.x($values);
    }

    private d(String str, int i3, String str2) {
        this.label = str2;
    }

    public static S1.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String getLabel() {
        return this.label;
    }
}
