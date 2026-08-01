package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0073m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0073m f1421a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0073m f1422b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0073m f1423c;
    public static final EnumC0073m d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0073m f1424e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0073m[] f1425f;

    static {
        EnumC0073m enumC0073m = new EnumC0073m("DESTROYED", 0);
        f1421a = enumC0073m;
        EnumC0073m enumC0073m2 = new EnumC0073m("INITIALIZED", 1);
        f1422b = enumC0073m2;
        EnumC0073m enumC0073m3 = new EnumC0073m("CREATED", 2);
        f1423c = enumC0073m3;
        EnumC0073m enumC0073m4 = new EnumC0073m("STARTED", 3);
        d = enumC0073m4;
        EnumC0073m enumC0073m5 = new EnumC0073m("RESUMED", 4);
        f1424e = enumC0073m5;
        f1425f = new EnumC0073m[]{enumC0073m, enumC0073m2, enumC0073m3, enumC0073m4, enumC0073m5};
    }

    public static EnumC0073m valueOf(String str) {
        return (EnumC0073m) Enum.valueOf(EnumC0073m.class, str);
    }

    public static EnumC0073m[] values() {
        return (EnumC0073m[]) f1425f.clone();
    }
}
