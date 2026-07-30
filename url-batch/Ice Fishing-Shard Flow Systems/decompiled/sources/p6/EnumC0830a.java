package p6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0830a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0830a f7215d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0830a f7216e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0830a f7217i;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ EnumC0830a[] f7218l;

    static {
        EnumC0830a enumC0830a = new EnumC0830a("SUSPEND", 0);
        f7215d = enumC0830a;
        EnumC0830a enumC0830a2 = new EnumC0830a("DROP_OLDEST", 1);
        f7216e = enumC0830a2;
        EnumC0830a enumC0830a3 = new EnumC0830a("DROP_LATEST", 2);
        f7217i = enumC0830a3;
        EnumC0830a[] enumC0830aArr = {enumC0830a, enumC0830a2, enumC0830a3};
        f7218l = enumC0830aArr;
        d4.c.o(enumC0830aArr);
    }

    public static EnumC0830a valueOf(String str) {
        return (EnumC0830a) Enum.valueOf(EnumC0830a.class, str);
    }

    public static EnumC0830a[] values() {
        return (EnumC0830a[]) f7218l.clone();
    }
}
