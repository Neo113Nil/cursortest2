package s2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0967a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0967a f8359d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0967a f8360e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0967a f8361f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0967a[] f8362g;

    static {
        EnumC0967a enumC0967a = new EnumC0967a("SUSPEND", 0);
        f8359d = enumC0967a;
        EnumC0967a enumC0967a2 = new EnumC0967a("DROP_OLDEST", 1);
        f8360e = enumC0967a2;
        EnumC0967a enumC0967a3 = new EnumC0967a("DROP_LATEST", 2);
        f8361f = enumC0967a3;
        f8362g = new EnumC0967a[]{enumC0967a, enumC0967a2, enumC0967a3};
    }

    public static EnumC0967a valueOf(String str) {
        return (EnumC0967a) Enum.valueOf(EnumC0967a.class, str);
    }

    public static EnumC0967a[] values() {
        return (EnumC0967a[]) f8362g.clone();
    }
}
