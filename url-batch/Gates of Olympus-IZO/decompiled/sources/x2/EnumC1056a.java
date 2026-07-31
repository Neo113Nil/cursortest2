package x2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1056a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1056a f8729d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC1056a[] f8730e;

    static {
        EnumC1056a enumC1056a = new EnumC1056a("NONE", 0);
        EnumC1056a enumC1056a2 = new EnumC1056a("ALL_JSON_OBJECTS", 1);
        EnumC1056a enumC1056a3 = new EnumC1056a("POLYMORPHIC", 2);
        f8729d = enumC1056a3;
        EnumC1056a[] enumC1056aArr = {enumC1056a, enumC1056a2, enumC1056a3};
        f8730e = enumC1056aArr;
        M1.B.x(enumC1056aArr);
    }

    public static EnumC1056a valueOf(String str) {
        return (EnumC1056a) Enum.valueOf(EnumC1056a.class, str);
    }

    public static EnumC1056a[] values() {
        return (EnumC1056a[]) f8730e.clone();
    }
}
