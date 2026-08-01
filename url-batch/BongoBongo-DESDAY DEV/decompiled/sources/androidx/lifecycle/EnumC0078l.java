package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0078l {
    private static final /* synthetic */ EnumC0078l[] $VALUES;
    public static final C0076j Companion;
    public static final EnumC0078l ON_ANY;
    public static final EnumC0078l ON_CREATE;
    public static final EnumC0078l ON_DESTROY;
    public static final EnumC0078l ON_PAUSE;
    public static final EnumC0078l ON_RESUME;
    public static final EnumC0078l ON_START;
    public static final EnumC0078l ON_STOP;

    static {
        EnumC0078l enumC0078l = new EnumC0078l("ON_CREATE", 0);
        ON_CREATE = enumC0078l;
        EnumC0078l enumC0078l2 = new EnumC0078l("ON_START", 1);
        ON_START = enumC0078l2;
        EnumC0078l enumC0078l3 = new EnumC0078l("ON_RESUME", 2);
        ON_RESUME = enumC0078l3;
        EnumC0078l enumC0078l4 = new EnumC0078l("ON_PAUSE", 3);
        ON_PAUSE = enumC0078l4;
        EnumC0078l enumC0078l5 = new EnumC0078l("ON_STOP", 4);
        ON_STOP = enumC0078l5;
        EnumC0078l enumC0078l6 = new EnumC0078l("ON_DESTROY", 5);
        ON_DESTROY = enumC0078l6;
        EnumC0078l enumC0078l7 = new EnumC0078l("ON_ANY", 6);
        ON_ANY = enumC0078l7;
        $VALUES = new EnumC0078l[]{enumC0078l, enumC0078l2, enumC0078l3, enumC0078l4, enumC0078l5, enumC0078l6, enumC0078l7};
        Companion = new C0076j();
    }

    public static EnumC0078l valueOf(String str) {
        return (EnumC0078l) Enum.valueOf(EnumC0078l.class, str);
    }

    public static EnumC0078l[] values() {
        return (EnumC0078l[]) $VALUES.clone();
    }

    public final EnumC0079m a() {
        switch (AbstractC0077k.f1571a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0079m.f1574c;
            case 3:
            case 4:
                return EnumC0079m.d;
            case 5:
                return EnumC0079m.f1575e;
            case 6:
                return EnumC0079m.f1572a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
