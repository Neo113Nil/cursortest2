package e2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0317a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0317a f4969a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0317a[] f4970b;

    static {
        EnumC0317a enumC0317a = new EnumC0317a("COROUTINE_SUSPENDED", 0);
        f4969a = enumC0317a;
        f4970b = new EnumC0317a[]{enumC0317a, new EnumC0317a("UNDECIDED", 1), new EnumC0317a("RESUMED", 2)};
    }

    public static EnumC0317a valueOf(String str) {
        return (EnumC0317a) Enum.valueOf(EnumC0317a.class, str);
    }

    public static EnumC0317a[] values() {
        return (EnumC0317a[]) f4970b.clone();
    }
}
