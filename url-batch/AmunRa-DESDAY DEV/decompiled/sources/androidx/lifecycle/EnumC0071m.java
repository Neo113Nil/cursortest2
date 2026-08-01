package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0071m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0071m f1396a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0071m f1397b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0071m f1398c;
    public static final EnumC0071m d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0071m f1399e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0071m[] f1400f;

    static {
        EnumC0071m enumC0071m = new EnumC0071m("DESTROYED", 0);
        f1396a = enumC0071m;
        EnumC0071m enumC0071m2 = new EnumC0071m("INITIALIZED", 1);
        f1397b = enumC0071m2;
        EnumC0071m enumC0071m3 = new EnumC0071m("CREATED", 2);
        f1398c = enumC0071m3;
        EnumC0071m enumC0071m4 = new EnumC0071m("STARTED", 3);
        d = enumC0071m4;
        EnumC0071m enumC0071m5 = new EnumC0071m("RESUMED", 4);
        f1399e = enumC0071m5;
        f1400f = new EnumC0071m[]{enumC0071m, enumC0071m2, enumC0071m3, enumC0071m4, enumC0071m5};
    }

    public static EnumC0071m valueOf(String str) {
        return (EnumC0071m) Enum.valueOf(EnumC0071m.class, str);
    }

    public static EnumC0071m[] values() {
        return (EnumC0071m[]) f1400f.clone();
    }
}
