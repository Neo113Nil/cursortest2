package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0474n {
    private static final /* synthetic */ EnumC0474n[] $VALUES;
    public static final C0472l Companion;
    public static final EnumC0474n ON_ANY;
    public static final EnumC0474n ON_CREATE;
    public static final EnumC0474n ON_DESTROY;
    public static final EnumC0474n ON_PAUSE;
    public static final EnumC0474n ON_RESUME;
    public static final EnumC0474n ON_START;
    public static final EnumC0474n ON_STOP;

    static {
        EnumC0474n enumC0474n = new EnumC0474n("ON_CREATE", 0);
        ON_CREATE = enumC0474n;
        EnumC0474n enumC0474n2 = new EnumC0474n("ON_START", 1);
        ON_START = enumC0474n2;
        EnumC0474n enumC0474n3 = new EnumC0474n("ON_RESUME", 2);
        ON_RESUME = enumC0474n3;
        EnumC0474n enumC0474n4 = new EnumC0474n("ON_PAUSE", 3);
        ON_PAUSE = enumC0474n4;
        EnumC0474n enumC0474n5 = new EnumC0474n("ON_STOP", 4);
        ON_STOP = enumC0474n5;
        EnumC0474n enumC0474n6 = new EnumC0474n("ON_DESTROY", 5);
        ON_DESTROY = enumC0474n6;
        EnumC0474n enumC0474n7 = new EnumC0474n("ON_ANY", 6);
        ON_ANY = enumC0474n7;
        $VALUES = new EnumC0474n[]{enumC0474n, enumC0474n2, enumC0474n3, enumC0474n4, enumC0474n5, enumC0474n6, enumC0474n7};
        Companion = new C0472l();
    }

    public static EnumC0474n valueOf(String str) {
        return (EnumC0474n) Enum.valueOf(EnumC0474n.class, str);
    }

    public static EnumC0474n[] values() {
        return (EnumC0474n[]) $VALUES.clone();
    }

    public final EnumC0475o a() {
        switch (AbstractC0473m.f5479a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0475o.f5482i;
            case 3:
            case 4:
                return EnumC0475o.f5483j;
            case 5:
                return EnumC0475o.f5484k;
            case 6:
                return EnumC0475o.f5480d;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
