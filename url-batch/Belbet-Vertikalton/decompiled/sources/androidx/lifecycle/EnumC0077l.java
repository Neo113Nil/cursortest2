package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0077l {
    private static final /* synthetic */ EnumC0077l[] $VALUES;
    public static final C0075j Companion;
    public static final EnumC0077l ON_ANY;
    public static final EnumC0077l ON_CREATE;
    public static final EnumC0077l ON_DESTROY;
    public static final EnumC0077l ON_PAUSE;
    public static final EnumC0077l ON_RESUME;
    public static final EnumC0077l ON_START;
    public static final EnumC0077l ON_STOP;

    static {
        EnumC0077l enumC0077l = new EnumC0077l("ON_CREATE", 0);
        ON_CREATE = enumC0077l;
        EnumC0077l enumC0077l2 = new EnumC0077l("ON_START", 1);
        ON_START = enumC0077l2;
        EnumC0077l enumC0077l3 = new EnumC0077l("ON_RESUME", 2);
        ON_RESUME = enumC0077l3;
        EnumC0077l enumC0077l4 = new EnumC0077l("ON_PAUSE", 3);
        ON_PAUSE = enumC0077l4;
        EnumC0077l enumC0077l5 = new EnumC0077l("ON_STOP", 4);
        ON_STOP = enumC0077l5;
        EnumC0077l enumC0077l6 = new EnumC0077l("ON_DESTROY", 5);
        ON_DESTROY = enumC0077l6;
        EnumC0077l enumC0077l7 = new EnumC0077l("ON_ANY", 6);
        ON_ANY = enumC0077l7;
        $VALUES = new EnumC0077l[]{enumC0077l, enumC0077l2, enumC0077l3, enumC0077l4, enumC0077l5, enumC0077l6, enumC0077l7};
        Companion = new C0075j();
    }

    public static EnumC0077l valueOf(String str) {
        return (EnumC0077l) Enum.valueOf(EnumC0077l.class, str);
    }

    public static EnumC0077l[] values() {
        return (EnumC0077l[]) $VALUES.clone();
    }

    public final EnumC0078m a() {
        switch (AbstractC0076k.f1933a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0078m.f1936c;
            case 3:
            case 4:
                return EnumC0078m.f1937d;
            case 5:
                return EnumC0078m.e;
            case 6:
                return EnumC0078m.f1934a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
