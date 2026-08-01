package b1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0098a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0098a f2223a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0098a[] f2224b;

    static {
        EnumC0098a enumC0098a = new EnumC0098a("COROUTINE_SUSPENDED", 0);
        f2223a = enumC0098a;
        f2224b = new EnumC0098a[]{enumC0098a, new EnumC0098a("UNDECIDED", 1), new EnumC0098a("RESUMED", 2)};
    }

    public static EnumC0098a valueOf(String str) {
        return (EnumC0098a) Enum.valueOf(EnumC0098a.class, str);
    }

    public static EnumC0098a[] values() {
        return (EnumC0098a[]) f2224b.clone();
    }
}
