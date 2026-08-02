package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0229h {
    private static final /* synthetic */ EnumC0229h[] $VALUES;
    public static final C0227f Companion;
    public static final EnumC0229h ON_ANY;
    public static final EnumC0229h ON_CREATE;
    public static final EnumC0229h ON_DESTROY;
    public static final EnumC0229h ON_PAUSE;
    public static final EnumC0229h ON_RESUME;
    public static final EnumC0229h ON_START;
    public static final EnumC0229h ON_STOP;

    static {
        EnumC0229h enumC0229h = new EnumC0229h("ON_CREATE", 0);
        ON_CREATE = enumC0229h;
        EnumC0229h enumC0229h2 = new EnumC0229h("ON_START", 1);
        ON_START = enumC0229h2;
        EnumC0229h enumC0229h3 = new EnumC0229h("ON_RESUME", 2);
        ON_RESUME = enumC0229h3;
        EnumC0229h enumC0229h4 = new EnumC0229h("ON_PAUSE", 3);
        ON_PAUSE = enumC0229h4;
        EnumC0229h enumC0229h5 = new EnumC0229h("ON_STOP", 4);
        ON_STOP = enumC0229h5;
        EnumC0229h enumC0229h6 = new EnumC0229h("ON_DESTROY", 5);
        ON_DESTROY = enumC0229h6;
        EnumC0229h enumC0229h7 = new EnumC0229h("ON_ANY", 6);
        ON_ANY = enumC0229h7;
        $VALUES = new EnumC0229h[]{enumC0229h, enumC0229h2, enumC0229h3, enumC0229h4, enumC0229h5, enumC0229h6, enumC0229h7};
        Companion = new C0227f();
    }

    public static EnumC0229h valueOf(String str) {
        return (EnumC0229h) Enum.valueOf(EnumC0229h.class, str);
    }

    public static EnumC0229h[] values() {
        return (EnumC0229h[]) $VALUES.clone();
    }

    public final EnumC0230i a() {
        switch (AbstractC0228g.f5040a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0230i.f5043c;
            case 3:
            case 4:
                return EnumC0230i.f5044d;
            case 5:
                return EnumC0230i.f5045e;
            case 6:
                return EnumC0230i.f5041a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
