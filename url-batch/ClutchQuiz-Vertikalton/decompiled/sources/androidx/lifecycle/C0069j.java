package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069j {
    public static EnumC0071l a(EnumC0072m enumC0072m) {
        g1.f.e(enumC0072m, "state");
        int ordinal = enumC0072m.ordinal();
        if (ordinal == 1) {
            return EnumC0071l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0071l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0071l.ON_RESUME;
    }
}
