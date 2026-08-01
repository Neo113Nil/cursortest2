package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0069m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0069m f1360a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0069m f1361b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0069m f1362c;
    public static final EnumC0069m d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0069m f1363e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0069m[] f1364f;

    static {
        EnumC0069m enumC0069m = new EnumC0069m("DESTROYED", 0);
        f1360a = enumC0069m;
        EnumC0069m enumC0069m2 = new EnumC0069m("INITIALIZED", 1);
        f1361b = enumC0069m2;
        EnumC0069m enumC0069m3 = new EnumC0069m("CREATED", 2);
        f1362c = enumC0069m3;
        EnumC0069m enumC0069m4 = new EnumC0069m("STARTED", 3);
        d = enumC0069m4;
        EnumC0069m enumC0069m5 = new EnumC0069m("RESUMED", 4);
        f1363e = enumC0069m5;
        f1364f = new EnumC0069m[]{enumC0069m, enumC0069m2, enumC0069m3, enumC0069m4, enumC0069m5};
    }

    public static EnumC0069m valueOf(String str) {
        return (EnumC0069m) Enum.valueOf(EnumC0069m.class, str);
    }

    public static EnumC0069m[] values() {
        return (EnumC0069m[]) f1364f.clone();
    }
}
