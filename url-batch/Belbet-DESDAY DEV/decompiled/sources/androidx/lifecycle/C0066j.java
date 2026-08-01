package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066j {
    public static EnumC0068l a(EnumC0069m enumC0069m) {
        X0.d.e(enumC0069m, "state");
        int ordinal = enumC0069m.ordinal();
        if (ordinal == 1) {
            return EnumC0068l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0068l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0068l.ON_RESUME;
    }
}
