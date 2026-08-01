package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0081n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0081n f1489a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0081n f1490b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0081n f1491c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0081n f1492d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0081n f1493e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0081n[] f1494f;

    static {
        EnumC0081n enumC0081n = new EnumC0081n("DESTROYED", 0);
        f1489a = enumC0081n;
        EnumC0081n enumC0081n2 = new EnumC0081n("INITIALIZED", 1);
        f1490b = enumC0081n2;
        EnumC0081n enumC0081n3 = new EnumC0081n("CREATED", 2);
        f1491c = enumC0081n3;
        EnumC0081n enumC0081n4 = new EnumC0081n("STARTED", 3);
        f1492d = enumC0081n4;
        EnumC0081n enumC0081n5 = new EnumC0081n("RESUMED", 4);
        f1493e = enumC0081n5;
        f1494f = new EnumC0081n[]{enumC0081n, enumC0081n2, enumC0081n3, enumC0081n4, enumC0081n5};
    }

    public static EnumC0081n valueOf(String str) {
        return (EnumC0081n) Enum.valueOf(EnumC0081n.class, str);
    }

    public static EnumC0081n[] values() {
        return (EnumC0081n[]) f1494f.clone();
    }
}
