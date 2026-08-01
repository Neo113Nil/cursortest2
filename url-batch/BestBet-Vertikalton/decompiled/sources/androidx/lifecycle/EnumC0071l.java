package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0071l {
    private static final /* synthetic */ EnumC0071l[] $VALUES;
    public static final C0069j Companion;
    public static final EnumC0071l ON_ANY;
    public static final EnumC0071l ON_CREATE;
    public static final EnumC0071l ON_DESTROY;
    public static final EnumC0071l ON_PAUSE;
    public static final EnumC0071l ON_RESUME;
    public static final EnumC0071l ON_START;
    public static final EnumC0071l ON_STOP;

    static {
        EnumC0071l enumC0071l = new EnumC0071l("ON_CREATE", 0);
        ON_CREATE = enumC0071l;
        EnumC0071l enumC0071l2 = new EnumC0071l("ON_START", 1);
        ON_START = enumC0071l2;
        EnumC0071l enumC0071l3 = new EnumC0071l("ON_RESUME", 2);
        ON_RESUME = enumC0071l3;
        EnumC0071l enumC0071l4 = new EnumC0071l("ON_PAUSE", 3);
        ON_PAUSE = enumC0071l4;
        EnumC0071l enumC0071l5 = new EnumC0071l("ON_STOP", 4);
        ON_STOP = enumC0071l5;
        EnumC0071l enumC0071l6 = new EnumC0071l("ON_DESTROY", 5);
        ON_DESTROY = enumC0071l6;
        EnumC0071l enumC0071l7 = new EnumC0071l("ON_ANY", 6);
        ON_ANY = enumC0071l7;
        $VALUES = new EnumC0071l[]{enumC0071l, enumC0071l2, enumC0071l3, enumC0071l4, enumC0071l5, enumC0071l6, enumC0071l7};
        Companion = new C0069j();
    }

    public static EnumC0071l valueOf(String str) {
        return (EnumC0071l) Enum.valueOf(EnumC0071l.class, str);
    }

    public static EnumC0071l[] values() {
        return (EnumC0071l[]) $VALUES.clone();
    }

    public final EnumC0072m a() {
        switch (AbstractC0070k.f1883a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0072m.f1886c;
            case 3:
            case 4:
                return EnumC0072m.d;
            case 5:
                return EnumC0072m.f1887e;
            case 6:
                return EnumC0072m.f1884a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
