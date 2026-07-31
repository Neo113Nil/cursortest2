package m2;

import M1.B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0626a {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0626a f5929d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0626a f5930e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0626a f5931f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0626a[] f5932g;

    static {
        EnumC0626a enumC0626a = new EnumC0626a("SUSPEND", 0);
        f5929d = enumC0626a;
        EnumC0626a enumC0626a2 = new EnumC0626a("DROP_OLDEST", 1);
        f5930e = enumC0626a2;
        EnumC0626a enumC0626a3 = new EnumC0626a("DROP_LATEST", 2);
        f5931f = enumC0626a3;
        EnumC0626a[] enumC0626aArr = {enumC0626a, enumC0626a2, enumC0626a3};
        f5932g = enumC0626aArr;
        B.x(enumC0626aArr);
    }

    public static EnumC0626a valueOf(String str) {
        return (EnumC0626a) Enum.valueOf(EnumC0626a.class, str);
    }

    public static EnumC0626a[] values() {
        return (EnumC0626a[]) f5932g.clone();
    }
}
