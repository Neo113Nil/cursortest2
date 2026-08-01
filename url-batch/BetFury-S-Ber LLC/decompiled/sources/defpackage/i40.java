package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class i40 {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ i40[] $VALUES;
    public static final i40 NO_OP = new i40("NO_OP", 0);
    public static final i40 ADD = new i40("ADD", 1);
    public static final i40 REMOVE = new i40("REMOVE", 2);

    private static final /* synthetic */ i40[] $values() {
        return new i40[]{NO_OP, ADD, REMOVE};
    }

    static {
        i40[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private i40(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static i40 valueOf(String str) {
        return (i40) Enum.valueOf(i40.class, str);
    }

    public static i40[] values() {
        return (i40[]) $VALUES.clone();
    }
}
