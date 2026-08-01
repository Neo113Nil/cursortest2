package androidx.lifecycle;

/* renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0078k {
    public static EnumC0080m a(EnumC0081n enumC0081n) {
        X0.f.e(enumC0081n, "state");
        int ordinal = enumC0081n.ordinal();
        if (ordinal == 2) {
            return EnumC0080m.ON_DESTROY;
        }
        if (ordinal == 3) {
            return EnumC0080m.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return EnumC0080m.ON_PAUSE;
    }

    public static EnumC0080m b(EnumC0081n enumC0081n) {
        X0.f.e(enumC0081n, "state");
        int ordinal = enumC0081n.ordinal();
        if (ordinal == 1) {
            return EnumC0080m.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0080m.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0080m.ON_RESUME;
    }
}
