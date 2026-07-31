package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0247n {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0247n f3511f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0247n f3512g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0247n f3513h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0247n f3514i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0247n f3515j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ EnumC0247n[] f3516k;

    static {
        EnumC0247n enumC0247n = new EnumC0247n("DESTROYED", 0);
        f3511f = enumC0247n;
        EnumC0247n enumC0247n2 = new EnumC0247n("INITIALIZED", 1);
        f3512g = enumC0247n2;
        EnumC0247n enumC0247n3 = new EnumC0247n("CREATED", 2);
        f3513h = enumC0247n3;
        EnumC0247n enumC0247n4 = new EnumC0247n("STARTED", 3);
        f3514i = enumC0247n4;
        EnumC0247n enumC0247n5 = new EnumC0247n("RESUMED", 4);
        f3515j = enumC0247n5;
        f3516k = new EnumC0247n[]{enumC0247n, enumC0247n2, enumC0247n3, enumC0247n4, enumC0247n5};
    }

    public static EnumC0247n valueOf(String str) {
        return (EnumC0247n) Enum.valueOf(EnumC0247n.class, str);
    }

    public static EnumC0247n[] values() {
        return (EnumC0247n[]) f3516k.clone();
    }
}
