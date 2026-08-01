package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0079m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0079m f1572a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0079m f1573b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0079m f1574c;
    public static final EnumC0079m d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0079m f1575e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0079m[] f1576f;

    static {
        EnumC0079m enumC0079m = new EnumC0079m("DESTROYED", 0);
        f1572a = enumC0079m;
        EnumC0079m enumC0079m2 = new EnumC0079m("INITIALIZED", 1);
        f1573b = enumC0079m2;
        EnumC0079m enumC0079m3 = new EnumC0079m("CREATED", 2);
        f1574c = enumC0079m3;
        EnumC0079m enumC0079m4 = new EnumC0079m("STARTED", 3);
        d = enumC0079m4;
        EnumC0079m enumC0079m5 = new EnumC0079m("RESUMED", 4);
        f1575e = enumC0079m5;
        f1576f = new EnumC0079m[]{enumC0079m, enumC0079m2, enumC0079m3, enumC0079m4, enumC0079m5};
    }

    public static EnumC0079m valueOf(String str) {
        return (EnumC0079m) Enum.valueOf(EnumC0079m.class, str);
    }

    public static EnumC0079m[] values() {
        return (EnumC0079m[]) f1576f.clone();
    }
}
