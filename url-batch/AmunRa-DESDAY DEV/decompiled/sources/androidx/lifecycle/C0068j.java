package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068j {
    public static EnumC0070l a(EnumC0071m enumC0071m) {
        Z0.d.e(enumC0071m, "state");
        int ordinal = enumC0071m.ordinal();
        if (ordinal == 1) {
            return EnumC0070l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0070l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0070l.ON_RESUME;
    }
}
