package n6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n6.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0790x {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0790x f7088d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0790x f7089e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0790x f7090i;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0790x f7091l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ EnumC0790x[] f7092m;

    static {
        EnumC0790x enumC0790x = new EnumC0790x("DEFAULT", 0);
        f7088d = enumC0790x;
        EnumC0790x enumC0790x2 = new EnumC0790x("LAZY", 1);
        f7089e = enumC0790x2;
        EnumC0790x enumC0790x3 = new EnumC0790x("ATOMIC", 2);
        f7090i = enumC0790x3;
        EnumC0790x enumC0790x4 = new EnumC0790x("UNDISPATCHED", 3);
        f7091l = enumC0790x4;
        EnumC0790x[] enumC0790xArr = {enumC0790x, enumC0790x2, enumC0790x3, enumC0790x4};
        f7092m = enumC0790xArr;
        d4.c.o(enumC0790xArr);
    }

    public static EnumC0790x valueOf(String str) {
        return (EnumC0790x) Enum.valueOf(EnumC0790x.class, str);
    }

    public static EnumC0790x[] values() {
        return (EnumC0790x[]) f7092m.clone();
    }
}
