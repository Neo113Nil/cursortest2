package Y1;

import a.AbstractC0219a;
import r5.InterfaceC0620a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ InterfaceC0620a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final int value;
    public static final a Fire = new a("Fire", 0, 2);
    public static final a Android = new a("Android", 1, 1);
    public static final a Huawei = new a("Huawei", 2, 13);

    private static final /* synthetic */ a[] $values() {
        return new a[]{Fire, Android, Huawei};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC0219a.n($values);
    }

    private a(String str, int i7, int i8) {
        this.value = i8;
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

    public final int getValue() {
        return this.value;
    }
}
