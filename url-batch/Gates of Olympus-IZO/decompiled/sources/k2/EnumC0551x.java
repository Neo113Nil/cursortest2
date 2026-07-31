package k2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0551x {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0551x f5395d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0551x f5396e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0551x f5397f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0551x f5398g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0551x[] f5399h;

    static {
        EnumC0551x enumC0551x = new EnumC0551x("DEFAULT", 0);
        f5395d = enumC0551x;
        EnumC0551x enumC0551x2 = new EnumC0551x("LAZY", 1);
        f5396e = enumC0551x2;
        EnumC0551x enumC0551x3 = new EnumC0551x("ATOMIC", 2);
        f5397f = enumC0551x3;
        EnumC0551x enumC0551x4 = new EnumC0551x("UNDISPATCHED", 3);
        f5398g = enumC0551x4;
        EnumC0551x[] enumC0551xArr = {enumC0551x, enumC0551x2, enumC0551x3, enumC0551x4};
        f5399h = enumC0551xArr;
        M1.B.x(enumC0551xArr);
    }

    public static EnumC0551x valueOf(String str) {
        return (EnumC0551x) Enum.valueOf(EnumC0551x.class, str);
    }

    public static EnumC0551x[] values() {
        return (EnumC0551x[]) f5399h.clone();
    }
}
