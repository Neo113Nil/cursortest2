package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0067j {
    public static EnumC0069l a(EnumC0070m enumC0070m) {
        g1.d.e(enumC0070m, "state");
        int ordinal = enumC0070m.ordinal();
        if (ordinal == 1) {
            return EnumC0069l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0069l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0069l.ON_RESUME;
    }
}
