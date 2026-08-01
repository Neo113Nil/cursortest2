package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0078m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0078m f1934a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0078m f1935b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0078m f1936c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0078m f1937d;
    public static final EnumC0078m e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0078m[] f1938f;

    static {
        EnumC0078m enumC0078m = new EnumC0078m("DESTROYED", 0);
        f1934a = enumC0078m;
        EnumC0078m enumC0078m2 = new EnumC0078m("INITIALIZED", 1);
        f1935b = enumC0078m2;
        EnumC0078m enumC0078m3 = new EnumC0078m("CREATED", 2);
        f1936c = enumC0078m3;
        EnumC0078m enumC0078m4 = new EnumC0078m("STARTED", 3);
        f1937d = enumC0078m4;
        EnumC0078m enumC0078m5 = new EnumC0078m("RESUMED", 4);
        e = enumC0078m5;
        f1938f = new EnumC0078m[]{enumC0078m, enumC0078m2, enumC0078m3, enumC0078m4, enumC0078m5};
    }

    public static EnumC0078m valueOf(String str) {
        return (EnumC0078m) Enum.valueOf(EnumC0078m.class, str);
    }

    public static EnumC0078m[] values() {
        return (EnumC0078m[]) f1938f.clone();
    }
}
