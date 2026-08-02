package g3;

import O3.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0441a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0441a f9038a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0441a[] f9039b;

    static {
        EnumC0441a enumC0441a = new EnumC0441a("COROUTINE_SUSPENDED", 0);
        f9038a = enumC0441a;
        EnumC0441a[] enumC0441aArr = {enumC0441a, new EnumC0441a("UNDECIDED", 1), new EnumC0441a("RESUMED", 2)};
        f9039b = enumC0441aArr;
        d.m(enumC0441aArr);
    }

    public static EnumC0441a valueOf(String str) {
        return (EnumC0441a) Enum.valueOf(EnumC0441a.class, str);
    }

    public static EnumC0441a[] values() {
        return (EnumC0441a[]) f9039b.clone();
    }
}
