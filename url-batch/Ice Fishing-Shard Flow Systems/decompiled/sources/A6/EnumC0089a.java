package A6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: A6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0089a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0089a f94d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0089a[] f95e;

    static {
        EnumC0089a enumC0089a = new EnumC0089a("NONE", 0);
        EnumC0089a enumC0089a2 = new EnumC0089a("ALL_JSON_OBJECTS", 1);
        EnumC0089a enumC0089a3 = new EnumC0089a("POLYMORPHIC", 2);
        f94d = enumC0089a3;
        EnumC0089a[] enumC0089aArr = {enumC0089a, enumC0089a2, enumC0089a3};
        f95e = enumC0089aArr;
        d4.c.o(enumC0089aArr);
    }

    public static EnumC0089a valueOf(String str) {
        return (EnumC0089a) Enum.valueOf(EnumC0089a.class, str);
    }

    public static EnumC0089a[] values() {
        return (EnumC0089a[]) f95e.clone();
    }
}
