package p2;

import d4.c;
import q2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0826a implements b {
    private static final /* synthetic */ Y5.a $ENTRIES;
    private static final /* synthetic */ EnumC0826a[] $VALUES;
    public static final EnumC0826a USER = new EnumC0826a("USER", 0);
    public static final EnumC0826a SUBSCRIPTION = new EnumC0826a("SUBSCRIPTION", 1);

    private static final /* synthetic */ EnumC0826a[] $values() {
        return new EnumC0826a[]{USER, SUBSCRIPTION};
    }

    static {
        EnumC0826a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.o($values);
    }

    private EnumC0826a(String str, int i2) {
    }

    public static Y5.a getEntries() {
        return $ENTRIES;
    }

    public static EnumC0826a valueOf(String str) {
        return (EnumC0826a) Enum.valueOf(EnumC0826a.class, str);
    }

    public static EnumC0826a[] values() {
        return (EnumC0826a[]) $VALUES.clone();
    }
}
