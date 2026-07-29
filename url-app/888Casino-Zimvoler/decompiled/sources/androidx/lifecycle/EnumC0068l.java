package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0068l {
    private static final /* synthetic */ EnumC0068l[] $VALUES;
    public static final C0066j Companion;
    public static final EnumC0068l ON_ANY;
    public static final EnumC0068l ON_CREATE;
    public static final EnumC0068l ON_DESTROY;
    public static final EnumC0068l ON_PAUSE;
    public static final EnumC0068l ON_RESUME;
    public static final EnumC0068l ON_START;
    public static final EnumC0068l ON_STOP;

    static {
        EnumC0068l enumC0068l = new EnumC0068l("ON_CREATE", 0);
        ON_CREATE = enumC0068l;
        EnumC0068l enumC0068l2 = new EnumC0068l("ON_START", 1);
        ON_START = enumC0068l2;
        EnumC0068l enumC0068l3 = new EnumC0068l("ON_RESUME", 2);
        ON_RESUME = enumC0068l3;
        EnumC0068l enumC0068l4 = new EnumC0068l("ON_PAUSE", 3);
        ON_PAUSE = enumC0068l4;
        EnumC0068l enumC0068l5 = new EnumC0068l("ON_STOP", 4);
        ON_STOP = enumC0068l5;
        EnumC0068l enumC0068l6 = new EnumC0068l("ON_DESTROY", 5);
        ON_DESTROY = enumC0068l6;
        EnumC0068l enumC0068l7 = new EnumC0068l("ON_ANY", 6);
        ON_ANY = enumC0068l7;
        $VALUES = new EnumC0068l[]{enumC0068l, enumC0068l2, enumC0068l3, enumC0068l4, enumC0068l5, enumC0068l6, enumC0068l7};
        Companion = new C0066j();
    }

    public static EnumC0068l valueOf(String str) {
        return (EnumC0068l) Enum.valueOf(EnumC0068l.class, str);
    }

    public static EnumC0068l[] values() {
        return (EnumC0068l[]) $VALUES.clone();
    }

    public final EnumC0069m a() {
        switch (AbstractC0067k.f1357a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0069m.f1360c;
            case 3:
            case 4:
                return EnumC0069m.d;
            case 5:
                return EnumC0069m.f1361e;
            case 6:
                return EnumC0069m.f1358a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
