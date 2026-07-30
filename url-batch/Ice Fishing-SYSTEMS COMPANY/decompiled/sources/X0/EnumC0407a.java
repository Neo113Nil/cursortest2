package X0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0407a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0407a f3647n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0407a f3648u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ EnumC0407a[] f3649v;

    static {
        EnumC0407a enumC0407a = new EnumC0407a("AUTOMATIC", 0);
        f3647n = enumC0407a;
        EnumC0407a enumC0407a2 = new EnumC0407a("ENABLED", 1);
        f3648u = enumC0407a2;
        f3649v = new EnumC0407a[]{enumC0407a, enumC0407a2, new EnumC0407a("DISABLED", 2)};
    }

    public static EnumC0407a valueOf(String str) {
        return (EnumC0407a) Enum.valueOf(EnumC0407a.class, str);
    }

    public static EnumC0407a[] values() {
        return (EnumC0407a[]) f3649v.clone();
    }
}
