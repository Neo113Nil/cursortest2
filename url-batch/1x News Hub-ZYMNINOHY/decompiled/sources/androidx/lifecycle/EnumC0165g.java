package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0165g {
    private static final /* synthetic */ EnumC0165g[] $VALUES;
    public static final C0163e Companion;
    public static final EnumC0165g ON_ANY;
    public static final EnumC0165g ON_CREATE;
    public static final EnumC0165g ON_DESTROY;
    public static final EnumC0165g ON_PAUSE;
    public static final EnumC0165g ON_RESUME;
    public static final EnumC0165g ON_START;
    public static final EnumC0165g ON_STOP;

    static {
        EnumC0165g enumC0165g = new EnumC0165g("ON_CREATE", 0);
        ON_CREATE = enumC0165g;
        EnumC0165g enumC0165g2 = new EnumC0165g("ON_START", 1);
        ON_START = enumC0165g2;
        EnumC0165g enumC0165g3 = new EnumC0165g("ON_RESUME", 2);
        ON_RESUME = enumC0165g3;
        EnumC0165g enumC0165g4 = new EnumC0165g("ON_PAUSE", 3);
        ON_PAUSE = enumC0165g4;
        EnumC0165g enumC0165g5 = new EnumC0165g("ON_STOP", 4);
        ON_STOP = enumC0165g5;
        EnumC0165g enumC0165g6 = new EnumC0165g("ON_DESTROY", 5);
        ON_DESTROY = enumC0165g6;
        EnumC0165g enumC0165g7 = new EnumC0165g("ON_ANY", 6);
        ON_ANY = enumC0165g7;
        $VALUES = new EnumC0165g[]{enumC0165g, enumC0165g2, enumC0165g3, enumC0165g4, enumC0165g5, enumC0165g6, enumC0165g7};
        Companion = new C0163e();
    }

    public static EnumC0165g valueOf(String str) {
        return (EnumC0165g) Enum.valueOf(EnumC0165g.class, str);
    }

    public static EnumC0165g[] values() {
        return (EnumC0165g[]) $VALUES.clone();
    }

    public final h a() {
        switch (AbstractC0164f.f2378a[ordinal()]) {
            case 1:
            case 2:
                return h.f2381c;
            case 3:
            case 4:
                return h.f2382d;
            case 5:
                return h.f2383e;
            case 6:
                return h.f2379a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
