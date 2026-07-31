package com.gates.olympus.miruv.data;

import M1.B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ S1.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DOVETAIL = new f("DOVETAIL", 0);
    public static final f FINGER = new f("FINGER", 1);
    public static final f MORTISE = new f("MORTISE", 2);
    public static final f MITRE = new f("MITRE", 3);
    public static final f LAP = new f("LAP", 4);
    public static final f DOWEL = new f("DOWEL", 5);
    public static final f BUTT = new f("BUTT", 6);
    public static final f DADO = new f("DADO", 7);
    public static final f RABBET = new f("RABBET", 8);
    public static final f TONGUE = new f("TONGUE", 9);
    public static final f BRIDLE = new f("BRIDLE", 10);
    public static final f SCARF = new f("SCARF", 11);
    public static final f POCKET = new f("POCKET", 12);
    public static final f BISCUIT = new f("BISCUIT", 13);

    private static final /* synthetic */ f[] $values() {
        return new f[]{DOVETAIL, FINGER, MORTISE, MITRE, LAP, DOWEL, BUTT, DADO, RABBET, TONGUE, BRIDLE, SCARF, POCKET, BISCUIT};
    }

    static {
        f[] $values = $values();
        $VALUES = $values;
        $ENTRIES = B.x($values);
    }

    private f(String str, int i3) {
    }

    public static S1.a getEntries() {
        return $ENTRIES;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
