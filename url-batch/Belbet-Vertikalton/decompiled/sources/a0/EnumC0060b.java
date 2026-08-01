package a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0060b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0060b f1660a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0060b f1661b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0060b f1662c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC0060b[] f1663d;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0060b EF0;

    static {
        EnumC0060b enumC0060b = new EnumC0060b("PENALTY_LOG", 0);
        EnumC0060b enumC0060b2 = new EnumC0060b("PENALTY_DEATH", 1);
        EnumC0060b enumC0060b3 = new EnumC0060b("DETECT_FRAGMENT_REUSE", 2);
        f1660a = enumC0060b3;
        EnumC0060b enumC0060b4 = new EnumC0060b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f1661b = enumC0060b4;
        EnumC0060b enumC0060b5 = new EnumC0060b("DETECT_RETAIN_INSTANCE_USAGE", 4);
        EnumC0060b enumC0060b6 = new EnumC0060b("DETECT_SET_USER_VISIBLE_HINT", 5);
        EnumC0060b enumC0060b7 = new EnumC0060b("DETECT_TARGET_FRAGMENT_USAGE", 6);
        EnumC0060b enumC0060b8 = new EnumC0060b("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        f1662c = enumC0060b8;
        f1663d = new EnumC0060b[]{enumC0060b, enumC0060b2, enumC0060b3, enumC0060b4, enumC0060b5, enumC0060b6, enumC0060b7, enumC0060b8};
    }

    public static EnumC0060b valueOf(String str) {
        return (EnumC0060b) Enum.valueOf(EnumC0060b.class, str);
    }

    public static EnumC0060b[] values() {
        return (EnumC0060b[]) f1663d.clone();
    }
}
