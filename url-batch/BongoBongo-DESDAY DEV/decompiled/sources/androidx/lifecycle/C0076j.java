package androidx.lifecycle;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0076j {
    public static EnumC0078l a(EnumC0079m enumC0079m) {
        h1.d.e(enumC0079m, "state");
        int ordinal = enumC0079m.ordinal();
        if (ordinal == 1) {
            return EnumC0078l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0078l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0078l.ON_RESUME;
    }
}
