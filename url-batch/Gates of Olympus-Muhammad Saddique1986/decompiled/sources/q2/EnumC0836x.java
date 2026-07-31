package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0836x {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0836x f7934d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0836x f7935e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0836x f7936f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0836x f7937g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0836x[] f7938h;

    static {
        EnumC0836x enumC0836x = new EnumC0836x("DEFAULT", 0);
        f7934d = enumC0836x;
        EnumC0836x enumC0836x2 = new EnumC0836x("LAZY", 1);
        f7935e = enumC0836x2;
        EnumC0836x enumC0836x3 = new EnumC0836x("ATOMIC", 2);
        f7936f = enumC0836x3;
        EnumC0836x enumC0836x4 = new EnumC0836x("UNDISPATCHED", 3);
        f7937g = enumC0836x4;
        f7938h = new EnumC0836x[]{enumC0836x, enumC0836x2, enumC0836x3, enumC0836x4};
    }

    public static EnumC0836x valueOf(String str) {
        return (EnumC0836x) Enum.valueOf(EnumC0836x.class, str);
    }

    public static EnumC0836x[] values() {
        return (EnumC0836x[]) f7938h.clone();
    }
}
