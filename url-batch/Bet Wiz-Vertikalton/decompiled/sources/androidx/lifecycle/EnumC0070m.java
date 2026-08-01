package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0070m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0070m f1466a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0070m f1467b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0070m f1468c;
    public static final EnumC0070m d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0070m f1469e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0070m[] f1470f;

    static {
        EnumC0070m enumC0070m = new EnumC0070m("DESTROYED", 0);
        f1466a = enumC0070m;
        EnumC0070m enumC0070m2 = new EnumC0070m("INITIALIZED", 1);
        f1467b = enumC0070m2;
        EnumC0070m enumC0070m3 = new EnumC0070m("CREATED", 2);
        f1468c = enumC0070m3;
        EnumC0070m enumC0070m4 = new EnumC0070m("STARTED", 3);
        d = enumC0070m4;
        EnumC0070m enumC0070m5 = new EnumC0070m("RESUMED", 4);
        f1469e = enumC0070m5;
        f1470f = new EnumC0070m[]{enumC0070m, enumC0070m2, enumC0070m3, enumC0070m4, enumC0070m5};
    }

    public static EnumC0070m valueOf(String str) {
        return (EnumC0070m) Enum.valueOf(EnumC0070m.class, str);
    }

    public static EnumC0070m[] values() {
        return (EnumC0070m[]) f1470f.clone();
    }
}
