package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0248n {
    private static final /* synthetic */ EnumC0248n[] $VALUES;
    public static final C0246l Companion;
    public static final EnumC0248n ON_ANY;
    public static final EnumC0248n ON_CREATE;
    public static final EnumC0248n ON_DESTROY;
    public static final EnumC0248n ON_PAUSE;
    public static final EnumC0248n ON_RESUME;
    public static final EnumC0248n ON_START;
    public static final EnumC0248n ON_STOP;

    static {
        EnumC0248n enumC0248n = new EnumC0248n("ON_CREATE", 0);
        ON_CREATE = enumC0248n;
        EnumC0248n enumC0248n2 = new EnumC0248n("ON_START", 1);
        ON_START = enumC0248n2;
        EnumC0248n enumC0248n3 = new EnumC0248n("ON_RESUME", 2);
        ON_RESUME = enumC0248n3;
        EnumC0248n enumC0248n4 = new EnumC0248n("ON_PAUSE", 3);
        ON_PAUSE = enumC0248n4;
        EnumC0248n enumC0248n5 = new EnumC0248n("ON_STOP", 4);
        ON_STOP = enumC0248n5;
        EnumC0248n enumC0248n6 = new EnumC0248n("ON_DESTROY", 5);
        ON_DESTROY = enumC0248n6;
        EnumC0248n enumC0248n7 = new EnumC0248n("ON_ANY", 6);
        ON_ANY = enumC0248n7;
        $VALUES = new EnumC0248n[]{enumC0248n, enumC0248n2, enumC0248n3, enumC0248n4, enumC0248n5, enumC0248n6, enumC0248n7};
        Companion = new C0246l();
    }

    public static EnumC0248n valueOf(String str) {
        return (EnumC0248n) Enum.valueOf(EnumC0248n.class, str);
    }

    public static EnumC0248n[] values() {
        return (EnumC0248n[]) $VALUES.clone();
    }

    public final EnumC0249o a() {
        switch (AbstractC0247m.f3905a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0249o.f3908i;
            case 3:
            case 4:
                return EnumC0249o.f3909l;
            case 5:
                return EnumC0249o.f3910m;
            case 6:
                return EnumC0249o.f3906d;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
