package K6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: K6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0131b {

    /* renamed from: e, reason: collision with root package name */
    public static final D f1490e;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0131b f1491i;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0131b f1492l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0131b f1493m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0131b f1494n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0131b f1495o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC0131b f1496p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ EnumC0131b[] f1497q;

    /* renamed from: d, reason: collision with root package name */
    public final int f1498d;

    static {
        EnumC0131b enumC0131b = new EnumC0131b("NO_ERROR", 0, 0);
        f1491i = enumC0131b;
        EnumC0131b enumC0131b2 = new EnumC0131b("PROTOCOL_ERROR", 1, 1);
        f1492l = enumC0131b2;
        EnumC0131b enumC0131b3 = new EnumC0131b("INTERNAL_ERROR", 2, 2);
        f1493m = enumC0131b3;
        EnumC0131b enumC0131b4 = new EnumC0131b("FLOW_CONTROL_ERROR", 3, 3);
        f1494n = enumC0131b4;
        EnumC0131b enumC0131b5 = new EnumC0131b("SETTINGS_TIMEOUT", 4, 4);
        EnumC0131b enumC0131b6 = new EnumC0131b("STREAM_CLOSED", 5, 5);
        EnumC0131b enumC0131b7 = new EnumC0131b("FRAME_SIZE_ERROR", 6, 6);
        EnumC0131b enumC0131b8 = new EnumC0131b("REFUSED_STREAM", 7, 7);
        f1495o = enumC0131b8;
        EnumC0131b enumC0131b9 = new EnumC0131b("CANCEL", 8, 8);
        f1496p = enumC0131b9;
        EnumC0131b[] enumC0131bArr = {enumC0131b, enumC0131b2, enumC0131b3, enumC0131b4, enumC0131b5, enumC0131b6, enumC0131b7, enumC0131b8, enumC0131b9, new EnumC0131b("COMPRESSION_ERROR", 9, 9), new EnumC0131b("CONNECT_ERROR", 10, 10), new EnumC0131b("ENHANCE_YOUR_CALM", 11, 11), new EnumC0131b("INADEQUATE_SECURITY", 12, 12), new EnumC0131b("HTTP_1_1_REQUIRED", 13, 13)};
        f1497q = enumC0131bArr;
        d4.c.o(enumC0131bArr);
        f1490e = new D();
    }

    public EnumC0131b(String str, int i2, int i5) {
        this.f1498d = i5;
    }

    public static EnumC0131b valueOf(String str) {
        return (EnumC0131b) Enum.valueOf(EnumC0131b.class, str);
    }

    public static EnumC0131b[] values() {
        return (EnumC0131b[]) f1497q.clone();
    }
}
