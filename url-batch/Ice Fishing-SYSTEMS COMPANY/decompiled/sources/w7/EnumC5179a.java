package w7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5179a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC5179a f41704n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC5179a f41705u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC5179a f41706v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC5179a[] f41707w;

    static {
        EnumC5179a enumC5179a = new EnumC5179a("COROUTINE_SUSPENDED", 0);
        f41704n = enumC5179a;
        EnumC5179a enumC5179a2 = new EnumC5179a("UNDECIDED", 1);
        f41705u = enumC5179a2;
        EnumC5179a enumC5179a3 = new EnumC5179a("RESUMED", 2);
        f41706v = enumC5179a3;
        EnumC5179a[] enumC5179aArr = {enumC5179a, enumC5179a2, enumC5179a3};
        f41707w = enumC5179aArr;
        W2.e.d(enumC5179aArr);
    }

    public static EnumC5179a valueOf(String str) {
        return (EnumC5179a) Enum.valueOf(EnumC5179a.class, str);
    }

    public static EnumC5179a[] values() {
        return (EnumC5179a[]) f41707w.clone();
    }
}
