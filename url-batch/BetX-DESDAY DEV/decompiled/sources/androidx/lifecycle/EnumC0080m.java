package androidx.lifecycle;

import com.luckyarcade.spinthrow.GameConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0080m {
    private static final /* synthetic */ EnumC0080m[] $VALUES;
    public static final C0078k Companion;
    public static final EnumC0080m ON_ANY;
    public static final EnumC0080m ON_CREATE;
    public static final EnumC0080m ON_DESTROY;
    public static final EnumC0080m ON_PAUSE;
    public static final EnumC0080m ON_RESUME;
    public static final EnumC0080m ON_START;
    public static final EnumC0080m ON_STOP;

    static {
        EnumC0080m enumC0080m = new EnumC0080m("ON_CREATE", 0);
        ON_CREATE = enumC0080m;
        EnumC0080m enumC0080m2 = new EnumC0080m("ON_START", 1);
        ON_START = enumC0080m2;
        EnumC0080m enumC0080m3 = new EnumC0080m("ON_RESUME", 2);
        ON_RESUME = enumC0080m3;
        EnumC0080m enumC0080m4 = new EnumC0080m("ON_PAUSE", 3);
        ON_PAUSE = enumC0080m4;
        EnumC0080m enumC0080m5 = new EnumC0080m("ON_STOP", 4);
        ON_STOP = enumC0080m5;
        EnumC0080m enumC0080m6 = new EnumC0080m("ON_DESTROY", 5);
        ON_DESTROY = enumC0080m6;
        EnumC0080m enumC0080m7 = new EnumC0080m("ON_ANY", 6);
        ON_ANY = enumC0080m7;
        $VALUES = new EnumC0080m[]{enumC0080m, enumC0080m2, enumC0080m3, enumC0080m4, enumC0080m5, enumC0080m6, enumC0080m7};
        Companion = new C0078k();
    }

    public static EnumC0080m valueOf(String str) {
        return (EnumC0080m) Enum.valueOf(EnumC0080m.class, str);
    }

    public static EnumC0080m[] values() {
        return (EnumC0080m[]) $VALUES.clone();
    }

    public final EnumC0081n a() {
        switch (AbstractC0079l.f1488a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0081n.f1491c;
            case GameConfig.COMBO_EVERY /* 3 */:
            case 4:
                return EnumC0081n.f1492d;
            case 5:
                return EnumC0081n.f1493e;
            case 6:
                return EnumC0081n.f1489a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
