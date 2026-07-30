package y4;

import W2.e;
import y7.InterfaceC5255a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5252a {
    private static final /* synthetic */ InterfaceC5255a $ENTRIES;
    private static final /* synthetic */ EnumC5252a[] $VALUES;
    private final int value;
    public static final EnumC5252a Fire = new EnumC5252a("Fire", 0, 2);
    public static final EnumC5252a Android = new EnumC5252a("Android", 1, 1);
    public static final EnumC5252a Huawei = new EnumC5252a("Huawei", 2, 13);

    private static final /* synthetic */ EnumC5252a[] $values() {
        return new EnumC5252a[]{Fire, Android, Huawei};
    }

    static {
        EnumC5252a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = e.d($values);
    }

    private EnumC5252a(String str, int i, int i4) {
        this.value = i4;
    }

    public static InterfaceC5255a getEntries() {
        return $ENTRIES;
    }

    public static EnumC5252a valueOf(String str) {
        return (EnumC5252a) Enum.valueOf(EnumC5252a.class, str);
    }

    public static EnumC5252a[] values() {
        return (EnumC5252a[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
