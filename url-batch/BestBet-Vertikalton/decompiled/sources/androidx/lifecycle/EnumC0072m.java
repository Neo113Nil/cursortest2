package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0072m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0072m f1884a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0072m f1885b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0072m f1886c;
    public static final EnumC0072m d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0072m f1887e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0072m[] f1888f;

    static {
        EnumC0072m enumC0072m = new EnumC0072m("DESTROYED", 0);
        f1884a = enumC0072m;
        EnumC0072m enumC0072m2 = new EnumC0072m("INITIALIZED", 1);
        f1885b = enumC0072m2;
        EnumC0072m enumC0072m3 = new EnumC0072m("CREATED", 2);
        f1886c = enumC0072m3;
        EnumC0072m enumC0072m4 = new EnumC0072m("STARTED", 3);
        d = enumC0072m4;
        EnumC0072m enumC0072m5 = new EnumC0072m("RESUMED", 4);
        f1887e = enumC0072m5;
        f1888f = new EnumC0072m[]{enumC0072m, enumC0072m2, enumC0072m3, enumC0072m4, enumC0072m5};
    }

    public static EnumC0072m valueOf(String str) {
        return (EnumC0072m) Enum.valueOf(EnumC0072m.class, str);
    }

    public static EnumC0072m[] values() {
        return (EnumC0072m[]) f1888f.clone();
    }
}
