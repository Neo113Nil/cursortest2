package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0070l {
    private static final /* synthetic */ EnumC0070l[] $VALUES;
    public static final C0068j Companion;
    public static final EnumC0070l ON_ANY;
    public static final EnumC0070l ON_CREATE;
    public static final EnumC0070l ON_DESTROY;
    public static final EnumC0070l ON_PAUSE;
    public static final EnumC0070l ON_RESUME;
    public static final EnumC0070l ON_START;
    public static final EnumC0070l ON_STOP;

    static {
        EnumC0070l enumC0070l = new EnumC0070l("ON_CREATE", 0);
        ON_CREATE = enumC0070l;
        EnumC0070l enumC0070l2 = new EnumC0070l("ON_START", 1);
        ON_START = enumC0070l2;
        EnumC0070l enumC0070l3 = new EnumC0070l("ON_RESUME", 2);
        ON_RESUME = enumC0070l3;
        EnumC0070l enumC0070l4 = new EnumC0070l("ON_PAUSE", 3);
        ON_PAUSE = enumC0070l4;
        EnumC0070l enumC0070l5 = new EnumC0070l("ON_STOP", 4);
        ON_STOP = enumC0070l5;
        EnumC0070l enumC0070l6 = new EnumC0070l("ON_DESTROY", 5);
        ON_DESTROY = enumC0070l6;
        EnumC0070l enumC0070l7 = new EnumC0070l("ON_ANY", 6);
        ON_ANY = enumC0070l7;
        $VALUES = new EnumC0070l[]{enumC0070l, enumC0070l2, enumC0070l3, enumC0070l4, enumC0070l5, enumC0070l6, enumC0070l7};
        Companion = new C0068j();
    }

    public static EnumC0070l valueOf(String str) {
        return (EnumC0070l) Enum.valueOf(EnumC0070l.class, str);
    }

    public static EnumC0070l[] values() {
        return (EnumC0070l[]) $VALUES.clone();
    }

    public final EnumC0071m a() {
        switch (AbstractC0069k.f1395a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0071m.f1398c;
            case 3:
            case 4:
                return EnumC0071m.d;
            case 5:
                return EnumC0071m.f1399e;
            case 6:
                return EnumC0071m.f1396a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
