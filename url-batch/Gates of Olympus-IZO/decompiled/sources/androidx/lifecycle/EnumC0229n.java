package androidx.lifecycle;

import h1.C0438i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0229n {
    private static final /* synthetic */ EnumC0229n[] $VALUES;
    public static final C0227l Companion;
    public static final EnumC0229n ON_ANY;
    public static final EnumC0229n ON_CREATE;
    public static final EnumC0229n ON_DESTROY;
    public static final EnumC0229n ON_PAUSE;
    public static final EnumC0229n ON_RESUME;
    public static final EnumC0229n ON_START;
    public static final EnumC0229n ON_STOP;

    static {
        EnumC0229n enumC0229n = new EnumC0229n("ON_CREATE", 0);
        ON_CREATE = enumC0229n;
        EnumC0229n enumC0229n2 = new EnumC0229n("ON_START", 1);
        ON_START = enumC0229n2;
        EnumC0229n enumC0229n3 = new EnumC0229n("ON_RESUME", 2);
        ON_RESUME = enumC0229n3;
        EnumC0229n enumC0229n4 = new EnumC0229n("ON_PAUSE", 3);
        ON_PAUSE = enumC0229n4;
        EnumC0229n enumC0229n5 = new EnumC0229n("ON_STOP", 4);
        ON_STOP = enumC0229n5;
        EnumC0229n enumC0229n6 = new EnumC0229n("ON_DESTROY", 5);
        ON_DESTROY = enumC0229n6;
        EnumC0229n enumC0229n7 = new EnumC0229n("ON_ANY", 6);
        ON_ANY = enumC0229n7;
        $VALUES = new EnumC0229n[]{enumC0229n, enumC0229n2, enumC0229n3, enumC0229n4, enumC0229n5, enumC0229n6, enumC0229n7};
        Companion = new C0227l();
    }

    public static EnumC0229n valueOf(String str) {
        return (EnumC0229n) Enum.valueOf(EnumC0229n.class, str);
    }

    public static EnumC0229n[] values() {
        return (EnumC0229n[]) $VALUES.clone();
    }

    public final EnumC0230o a() {
        switch (AbstractC0228m.f4024a[ordinal()]) {
            case 1:
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                return EnumC0230o.f4027f;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return EnumC0230o.f4028g;
            case 5:
                return EnumC0230o.f4029h;
            case 6:
                return EnumC0230o.f4025d;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
