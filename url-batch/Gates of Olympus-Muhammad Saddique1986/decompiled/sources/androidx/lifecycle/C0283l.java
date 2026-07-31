package androidx.lifecycle;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283l {
    public static EnumC0285n a(EnumC0286o enumC0286o) {
        f2.j.f(enumC0286o, "state");
        int ordinal = enumC0286o.ordinal();
        if (ordinal == 2) {
            return EnumC0285n.ON_DESTROY;
        }
        if (ordinal == 3) {
            return EnumC0285n.ON_STOP;
        }
        if (ordinal != 4) {
            return null;
        }
        return EnumC0285n.ON_PAUSE;
    }

    public static EnumC0285n b(EnumC0286o enumC0286o) {
        f2.j.f(enumC0286o, "state");
        int ordinal = enumC0286o.ordinal();
        if (ordinal == 1) {
            return EnumC0285n.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0285n.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0285n.ON_RESUME;
    }
}
