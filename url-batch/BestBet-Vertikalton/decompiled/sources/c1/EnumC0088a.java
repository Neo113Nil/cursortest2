package c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0088a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0088a f2060a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0088a[] f2061b;

    static {
        EnumC0088a enumC0088a = new EnumC0088a("COROUTINE_SUSPENDED", 0);
        f2060a = enumC0088a;
        f2061b = new EnumC0088a[]{enumC0088a, new EnumC0088a("UNDECIDED", 1), new EnumC0088a("RESUMED", 2)};
    }

    public static EnumC0088a valueOf(String str) {
        return (EnumC0088a) Enum.valueOf(EnumC0088a.class, str);
    }

    public static EnumC0088a[] values() {
        return (EnumC0088a[]) f2061b.clone();
    }
}
