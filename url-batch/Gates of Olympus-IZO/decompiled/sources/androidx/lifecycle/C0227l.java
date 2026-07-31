package androidx.lifecycle;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227l {
    public static EnumC0229n a(EnumC0230o enumC0230o) {
        Z1.i.f(enumC0230o, "state");
        int ordinal = enumC0230o.ordinal();
        if (ordinal == 2) {
            return EnumC0229n.ON_DESTROY;
        }
        if (ordinal == 3) {
            return EnumC0229n.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return EnumC0229n.ON_PAUSE;
    }

    public static EnumC0229n b(EnumC0230o enumC0230o) {
        Z1.i.f(enumC0230o, "state");
        int ordinal = enumC0230o.ordinal();
        if (ordinal == 1) {
            return EnumC0229n.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0229n.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0229n.ON_RESUME;
    }
}
