package a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0054b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0054b f1307a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0054b f1308b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0054b f1309c;
    public static final /* synthetic */ EnumC0054b[] d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0054b EF0;

    static {
        EnumC0054b enumC0054b = new EnumC0054b("PENALTY_LOG", 0);
        EnumC0054b enumC0054b2 = new EnumC0054b("PENALTY_DEATH", 1);
        EnumC0054b enumC0054b3 = new EnumC0054b("DETECT_FRAGMENT_REUSE", 2);
        f1307a = enumC0054b3;
        EnumC0054b enumC0054b4 = new EnumC0054b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f1308b = enumC0054b4;
        EnumC0054b enumC0054b5 = new EnumC0054b("DETECT_RETAIN_INSTANCE_USAGE", 4);
        EnumC0054b enumC0054b6 = new EnumC0054b("DETECT_SET_USER_VISIBLE_HINT", 5);
        EnumC0054b enumC0054b7 = new EnumC0054b("DETECT_TARGET_FRAGMENT_USAGE", 6);
        EnumC0054b enumC0054b8 = new EnumC0054b("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f1309c = enumC0054b8;
        d = new EnumC0054b[]{enumC0054b, enumC0054b2, enumC0054b3, enumC0054b4, enumC0054b5, enumC0054b6, enumC0054b7, enumC0054b8};
    }

    public static EnumC0054b valueOf(String str) {
        return (EnumC0054b) Enum.valueOf(EnumC0054b.class, str);
    }

    public static EnumC0054b[] values() {
        return (EnumC0054b[]) d.clone();
    }
}
