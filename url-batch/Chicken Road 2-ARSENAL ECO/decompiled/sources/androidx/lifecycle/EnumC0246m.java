package androidx.lifecycle;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0246m {
    private static final /* synthetic */ EnumC0246m[] $VALUES;
    public static final C0244k Companion;
    public static final EnumC0246m ON_ANY;
    public static final EnumC0246m ON_CREATE;
    public static final EnumC0246m ON_DESTROY;
    public static final EnumC0246m ON_PAUSE;
    public static final EnumC0246m ON_RESUME;
    public static final EnumC0246m ON_START;
    public static final EnumC0246m ON_STOP;

    static {
        EnumC0246m enumC0246m = new EnumC0246m("ON_CREATE", 0);
        ON_CREATE = enumC0246m;
        EnumC0246m enumC0246m2 = new EnumC0246m("ON_START", 1);
        ON_START = enumC0246m2;
        EnumC0246m enumC0246m3 = new EnumC0246m("ON_RESUME", 2);
        ON_RESUME = enumC0246m3;
        EnumC0246m enumC0246m4 = new EnumC0246m("ON_PAUSE", 3);
        ON_PAUSE = enumC0246m4;
        EnumC0246m enumC0246m5 = new EnumC0246m("ON_STOP", 4);
        ON_STOP = enumC0246m5;
        EnumC0246m enumC0246m6 = new EnumC0246m("ON_DESTROY", 5);
        ON_DESTROY = enumC0246m6;
        EnumC0246m enumC0246m7 = new EnumC0246m("ON_ANY", 6);
        ON_ANY = enumC0246m7;
        $VALUES = new EnumC0246m[]{enumC0246m, enumC0246m2, enumC0246m3, enumC0246m4, enumC0246m5, enumC0246m6, enumC0246m7};
        Companion = new C0244k();
    }

    public static EnumC0246m valueOf(String str) {
        return (EnumC0246m) Enum.valueOf(EnumC0246m.class, str);
    }

    public static EnumC0246m[] values() {
        return (EnumC0246m[]) $VALUES.clone();
    }

    public final EnumC0247n a() {
        switch (AbstractC0245l.f3510a[ordinal()]) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return EnumC0247n.f3513h;
            case 3:
            case 4:
                return EnumC0247n.f3514i;
            case 5:
                return EnumC0247n.f3515j;
            case 6:
                return EnumC0247n.f3511f;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
