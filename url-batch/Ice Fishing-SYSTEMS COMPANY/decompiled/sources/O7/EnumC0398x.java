package O7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: O7.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0398x {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0398x f2637n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC0398x f2638u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC0398x f2639v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC0398x f2640w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC0398x[] f2641x;

    static {
        EnumC0398x enumC0398x = new EnumC0398x("DEFAULT", 0);
        f2637n = enumC0398x;
        EnumC0398x enumC0398x2 = new EnumC0398x("LAZY", 1);
        f2638u = enumC0398x2;
        EnumC0398x enumC0398x3 = new EnumC0398x("ATOMIC", 2);
        f2639v = enumC0398x3;
        EnumC0398x enumC0398x4 = new EnumC0398x("UNDISPATCHED", 3);
        f2640w = enumC0398x4;
        EnumC0398x[] enumC0398xArr = {enumC0398x, enumC0398x2, enumC0398x3, enumC0398x4};
        f2641x = enumC0398xArr;
        W2.e.d(enumC0398xArr);
    }

    public static EnumC0398x valueOf(String str) {
        return (EnumC0398x) Enum.valueOf(EnumC0398x.class, str);
    }

    public static EnumC0398x[] values() {
        return (EnumC0398x[]) f2641x.clone();
    }
}
