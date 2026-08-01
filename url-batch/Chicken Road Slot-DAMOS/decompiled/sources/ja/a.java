package ja;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ od.a $ENTRIES;
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
        $ENTRIES = i7.a.J($values);
    }

    private a(String str, int i3, int i10) {
        this.value = i10;
    }

    public static od.a getEntries() {
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
