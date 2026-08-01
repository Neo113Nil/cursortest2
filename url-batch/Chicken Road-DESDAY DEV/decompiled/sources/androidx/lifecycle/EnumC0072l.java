package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0072l {
    private static final /* synthetic */ EnumC0072l[] $VALUES;
    public static final C0070j Companion;
    public static final EnumC0072l ON_ANY;
    public static final EnumC0072l ON_CREATE;
    public static final EnumC0072l ON_DESTROY;
    public static final EnumC0072l ON_PAUSE;
    public static final EnumC0072l ON_RESUME;
    public static final EnumC0072l ON_START;
    public static final EnumC0072l ON_STOP;

    static {
        EnumC0072l enumC0072l = new EnumC0072l("ON_CREATE", 0);
        ON_CREATE = enumC0072l;
        EnumC0072l enumC0072l2 = new EnumC0072l("ON_START", 1);
        ON_START = enumC0072l2;
        EnumC0072l enumC0072l3 = new EnumC0072l("ON_RESUME", 2);
        ON_RESUME = enumC0072l3;
        EnumC0072l enumC0072l4 = new EnumC0072l("ON_PAUSE", 3);
        ON_PAUSE = enumC0072l4;
        EnumC0072l enumC0072l5 = new EnumC0072l("ON_STOP", 4);
        ON_STOP = enumC0072l5;
        EnumC0072l enumC0072l6 = new EnumC0072l("ON_DESTROY", 5);
        ON_DESTROY = enumC0072l6;
        EnumC0072l enumC0072l7 = new EnumC0072l("ON_ANY", 6);
        ON_ANY = enumC0072l7;
        $VALUES = new EnumC0072l[]{enumC0072l, enumC0072l2, enumC0072l3, enumC0072l4, enumC0072l5, enumC0072l6, enumC0072l7};
        Companion = new C0070j();
    }

    public static EnumC0072l valueOf(String str) {
        return (EnumC0072l) Enum.valueOf(EnumC0072l.class, str);
    }

    public static EnumC0072l[] values() {
        return (EnumC0072l[]) $VALUES.clone();
    }

    public final EnumC0073m a() {
        switch (AbstractC0071k.f1420a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0073m.f1423c;
            case 3:
            case 4:
                return EnumC0073m.d;
            case 5:
                return EnumC0073m.f1424e;
            case 6:
                return EnumC0073m.f1421a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
