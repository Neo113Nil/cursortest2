package x9;

import y9.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements b {
    private static final /* synthetic */ od.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a USER = new a("USER", 0);
    public static final a SUBSCRIPTION = new a("SUBSCRIPTION", 1);

    private static final /* synthetic */ a[] $values() {
        return new a[]{USER, SUBSCRIPTION};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = i7.a.J($values);
    }

    private a(String str, int i3) {
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
}
