package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zw {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ zw[] $VALUES;
    public static final zw SYNCHRONIZED = new zw("SYNCHRONIZED", 0);
    public static final zw PUBLICATION = new zw("PUBLICATION", 1);
    public static final zw NONE = new zw("NONE", 2);

    private static final /* synthetic */ zw[] $values() {
        return new zw[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        zw[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private zw(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static zw valueOf(String str) {
        return (zw) Enum.valueOf(zw.class, str);
    }

    public static zw[] values() {
        return (zw[]) $VALUES.clone();
    }
}
