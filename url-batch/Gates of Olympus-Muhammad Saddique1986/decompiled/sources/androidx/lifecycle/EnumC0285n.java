package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0285n {
    private static final /* synthetic */ EnumC0285n[] $VALUES;
    public static final C0283l Companion;
    public static final EnumC0285n ON_ANY;
    public static final EnumC0285n ON_CREATE;
    public static final EnumC0285n ON_DESTROY;
    public static final EnumC0285n ON_PAUSE;
    public static final EnumC0285n ON_RESUME;
    public static final EnumC0285n ON_START;
    public static final EnumC0285n ON_STOP;

    static {
        EnumC0285n enumC0285n = new EnumC0285n("ON_CREATE", 0);
        ON_CREATE = enumC0285n;
        EnumC0285n enumC0285n2 = new EnumC0285n("ON_START", 1);
        ON_START = enumC0285n2;
        EnumC0285n enumC0285n3 = new EnumC0285n("ON_RESUME", 2);
        ON_RESUME = enumC0285n3;
        EnumC0285n enumC0285n4 = new EnumC0285n("ON_PAUSE", 3);
        ON_PAUSE = enumC0285n4;
        EnumC0285n enumC0285n5 = new EnumC0285n("ON_STOP", 4);
        ON_STOP = enumC0285n5;
        EnumC0285n enumC0285n6 = new EnumC0285n("ON_DESTROY", 5);
        ON_DESTROY = enumC0285n6;
        EnumC0285n enumC0285n7 = new EnumC0285n("ON_ANY", 6);
        ON_ANY = enumC0285n7;
        $VALUES = new EnumC0285n[]{enumC0285n, enumC0285n2, enumC0285n3, enumC0285n4, enumC0285n5, enumC0285n6, enumC0285n7};
        Companion = new C0283l();
    }

    public static EnumC0285n valueOf(String str) {
        return (EnumC0285n) Enum.valueOf(EnumC0285n.class, str);
    }

    public static EnumC0285n[] values() {
        return (EnumC0285n[]) $VALUES.clone();
    }

    public final EnumC0286o a() {
        switch (AbstractC0284m.f5225a[ordinal()]) {
            case 1:
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return EnumC0286o.f5228f;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return EnumC0286o.f5229g;
            case 5:
                return EnumC0286o.f5230h;
            case 6:
                return EnumC0286o.f5226d;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
