package n4;

import W2.e;
import o4.b;
import y7.InterfaceC5255a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4812a implements b {
    private static final /* synthetic */ InterfaceC5255a $ENTRIES;
    private static final /* synthetic */ EnumC4812a[] $VALUES;
    public static final EnumC4812a USER = new EnumC4812a("USER", 0);
    public static final EnumC4812a SUBSCRIPTION = new EnumC4812a("SUBSCRIPTION", 1);

    private static final /* synthetic */ EnumC4812a[] $values() {
        return new EnumC4812a[]{USER, SUBSCRIPTION};
    }

    static {
        EnumC4812a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = e.d($values);
    }

    private EnumC4812a(String str, int i) {
    }

    public static InterfaceC5255a getEntries() {
        return $ENTRIES;
    }

    public static EnumC4812a valueOf(String str) {
        return (EnumC4812a) Enum.valueOf(EnumC4812a.class, str);
    }

    public static EnumC4812a[] values() {
        return (EnumC4812a[]) $VALUES.clone();
    }
}
