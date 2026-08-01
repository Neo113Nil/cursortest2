package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class br {
    private static final /* synthetic */ hn $ENTRIES;
    private static final /* synthetic */ br[] $VALUES;
    public static final br ON_CONFIGURE = new br("ON_CONFIGURE", 0);
    public static final br ON_CREATE = new br("ON_CREATE", 1);
    public static final br ON_UPGRADE = new br("ON_UPGRADE", 2);
    public static final br ON_DOWNGRADE = new br("ON_DOWNGRADE", 3);
    public static final br ON_OPEN = new br("ON_OPEN", 4);

    private static final /* synthetic */ br[] $values() {
        return new br[]{ON_CONFIGURE, ON_CREATE, ON_UPGRADE, ON_DOWNGRADE, ON_OPEN};
    }

    static {
        br[] $values = $values();
        $VALUES = $values;
        $ENTRIES = n9.k($values);
    }

    private br(String str, int i) {
    }

    public static hn getEntries() {
        return $ENTRIES;
    }

    public static br valueOf(String str) {
        return (br) Enum.valueOf(br.class, str);
    }

    public static br[] values() {
        return (br[]) $VALUES.clone();
    }
}
