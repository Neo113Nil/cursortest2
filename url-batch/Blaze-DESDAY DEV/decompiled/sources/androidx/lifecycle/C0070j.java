package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0070j {
    public static EnumC0072l a(EnumC0073m enumC0073m) {
        g1.d.e(enumC0073m, "state");
        int ordinal = enumC0073m.ordinal();
        if (ordinal == 1) {
            return EnumC0072l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0072l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0072l.ON_RESUME;
    }
}
