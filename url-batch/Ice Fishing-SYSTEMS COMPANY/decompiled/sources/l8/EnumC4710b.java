package l8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4710b {

    /* renamed from: A, reason: collision with root package name */
    public static final EnumC4710b f39096A;

    /* renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ EnumC4710b[] f39097B;

    /* renamed from: u, reason: collision with root package name */
    public static final C f39098u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC4710b f39099v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC4710b f39100w;

    /* renamed from: x, reason: collision with root package name */
    public static final EnumC4710b f39101x;

    /* renamed from: y, reason: collision with root package name */
    public static final EnumC4710b f39102y;

    /* renamed from: z, reason: collision with root package name */
    public static final EnumC4710b f39103z;

    /* renamed from: n, reason: collision with root package name */
    public final int f39104n;

    static {
        EnumC4710b enumC4710b = new EnumC4710b("NO_ERROR", 0, 0);
        f39099v = enumC4710b;
        EnumC4710b enumC4710b2 = new EnumC4710b("PROTOCOL_ERROR", 1, 1);
        f39100w = enumC4710b2;
        EnumC4710b enumC4710b3 = new EnumC4710b("INTERNAL_ERROR", 2, 2);
        f39101x = enumC4710b3;
        EnumC4710b enumC4710b4 = new EnumC4710b("FLOW_CONTROL_ERROR", 3, 3);
        f39102y = enumC4710b4;
        EnumC4710b enumC4710b5 = new EnumC4710b("SETTINGS_TIMEOUT", 4, 4);
        EnumC4710b enumC4710b6 = new EnumC4710b("STREAM_CLOSED", 5, 5);
        EnumC4710b enumC4710b7 = new EnumC4710b("FRAME_SIZE_ERROR", 6, 6);
        EnumC4710b enumC4710b8 = new EnumC4710b("REFUSED_STREAM", 7, 7);
        f39103z = enumC4710b8;
        EnumC4710b enumC4710b9 = new EnumC4710b("CANCEL", 8, 8);
        f39096A = enumC4710b9;
        EnumC4710b[] enumC4710bArr = {enumC4710b, enumC4710b2, enumC4710b3, enumC4710b4, enumC4710b5, enumC4710b6, enumC4710b7, enumC4710b8, enumC4710b9, new EnumC4710b("COMPRESSION_ERROR", 9, 9), new EnumC4710b("CONNECT_ERROR", 10, 10), new EnumC4710b("ENHANCE_YOUR_CALM", 11, 11), new EnumC4710b("INADEQUATE_SECURITY", 12, 12), new EnumC4710b("HTTP_1_1_REQUIRED", 13, 13)};
        f39097B = enumC4710bArr;
        W2.e.d(enumC4710bArr);
        f39098u = new C();
    }

    public EnumC4710b(String str, int i, int i4) {
        this.f39104n = i4;
    }

    public static EnumC4710b valueOf(String str) {
        return (EnumC4710b) Enum.valueOf(EnumC4710b.class, str);
    }

    public static EnumC4710b[] values() {
        return (EnumC4710b[]) f39097B.clone();
    }
}
