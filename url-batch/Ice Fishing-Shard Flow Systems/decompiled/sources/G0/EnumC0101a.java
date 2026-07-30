package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: G0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0101a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0101a f778d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0101a f779e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC0101a[] f780i;

    static {
        EnumC0101a enumC0101a = new EnumC0101a("EXPONENTIAL", 0);
        f778d = enumC0101a;
        EnumC0101a enumC0101a2 = new EnumC0101a("LINEAR", 1);
        f779e = enumC0101a2;
        f780i = new EnumC0101a[]{enumC0101a, enumC0101a2};
    }

    public static EnumC0101a valueOf(String str) {
        return (EnumC0101a) Enum.valueOf(EnumC0101a.class, str);
    }

    public static EnumC0101a[] values() {
        return (EnumC0101a[]) f780i.clone();
    }
}
