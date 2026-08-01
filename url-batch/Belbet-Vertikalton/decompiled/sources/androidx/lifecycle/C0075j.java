package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075j {
    public static EnumC0077l a(EnumC0078m enumC0078m) {
        j1.h.e(enumC0078m, "state");
        int ordinal = enumC0078m.ordinal();
        if (ordinal == 1) {
            return EnumC0077l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0077l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0077l.ON_RESUME;
    }
}
