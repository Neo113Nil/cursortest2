package e6;

import a.AbstractC0219a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0356b {

    /* renamed from: g, reason: collision with root package name */
    public static final C f4037g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0356b f4038h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0356b f4039i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0356b f4040j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0356b f4041k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0356b f4042l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0356b f4043m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ EnumC0356b[] f4044n;

    /* renamed from: f, reason: collision with root package name */
    public final int f4045f;

    static {
        EnumC0356b enumC0356b = new EnumC0356b("NO_ERROR", 0, 0);
        f4038h = enumC0356b;
        EnumC0356b enumC0356b2 = new EnumC0356b("PROTOCOL_ERROR", 1, 1);
        f4039i = enumC0356b2;
        EnumC0356b enumC0356b3 = new EnumC0356b("INTERNAL_ERROR", 2, 2);
        f4040j = enumC0356b3;
        EnumC0356b enumC0356b4 = new EnumC0356b("FLOW_CONTROL_ERROR", 3, 3);
        f4041k = enumC0356b4;
        EnumC0356b enumC0356b5 = new EnumC0356b("SETTINGS_TIMEOUT", 4, 4);
        EnumC0356b enumC0356b6 = new EnumC0356b("STREAM_CLOSED", 5, 5);
        EnumC0356b enumC0356b7 = new EnumC0356b("FRAME_SIZE_ERROR", 6, 6);
        EnumC0356b enumC0356b8 = new EnumC0356b("REFUSED_STREAM", 7, 7);
        f4042l = enumC0356b8;
        EnumC0356b enumC0356b9 = new EnumC0356b("CANCEL", 8, 8);
        f4043m = enumC0356b9;
        EnumC0356b[] enumC0356bArr = {enumC0356b, enumC0356b2, enumC0356b3, enumC0356b4, enumC0356b5, enumC0356b6, enumC0356b7, enumC0356b8, enumC0356b9, new EnumC0356b("COMPRESSION_ERROR", 9, 9), new EnumC0356b("CONNECT_ERROR", 10, 10), new EnumC0356b("ENHANCE_YOUR_CALM", 11, 11), new EnumC0356b("INADEQUATE_SECURITY", 12, 12), new EnumC0356b("HTTP_1_1_REQUIRED", 13, 13)};
        f4044n = enumC0356bArr;
        AbstractC0219a.n(enumC0356bArr);
        f4037g = new C();
    }

    public EnumC0356b(String str, int i7, int i8) {
        this.f4045f = i8;
    }

    public static EnumC0356b valueOf(String str) {
        return (EnumC0356b) Enum.valueOf(EnumC0356b.class, str);
    }

    public static EnumC0356b[] values() {
        return (EnumC0356b[]) f4044n.clone();
    }
}
