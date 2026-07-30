package u6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0950b {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0950b f8089d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0950b f8090e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0950b f8091i;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0950b f8092l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0950b f8093m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0950b[] f8094n;

    static {
        EnumC0950b enumC0950b = new EnumC0950b("CPU_ACQUIRED", 0);
        f8089d = enumC0950b;
        EnumC0950b enumC0950b2 = new EnumC0950b("BLOCKING", 1);
        f8090e = enumC0950b2;
        EnumC0950b enumC0950b3 = new EnumC0950b("PARKING", 2);
        f8091i = enumC0950b3;
        EnumC0950b enumC0950b4 = new EnumC0950b("DORMANT", 3);
        f8092l = enumC0950b4;
        EnumC0950b enumC0950b5 = new EnumC0950b("TERMINATED", 4);
        f8093m = enumC0950b5;
        EnumC0950b[] enumC0950bArr = {enumC0950b, enumC0950b2, enumC0950b3, enumC0950b4, enumC0950b5};
        f8094n = enumC0950bArr;
        d4.c.o(enumC0950bArr);
    }

    public static EnumC0950b valueOf(String str) {
        return (EnumC0950b) Enum.valueOf(EnumC0950b.class, str);
    }

    public static EnumC0950b[] values() {
        return (EnumC0950b[]) f8094n.clone();
    }
}
