package x3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1561v {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1561v f16060a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1561v f16061b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1561v[] f16062c;

    static {
        EnumC1561v enumC1561v = new EnumC1561v("DEFAULT", 0);
        f16060a = enumC1561v;
        EnumC1561v enumC1561v2 = new EnumC1561v("LAZY", 1);
        EnumC1561v enumC1561v3 = new EnumC1561v("ATOMIC", 2);
        f16061b = enumC1561v3;
        EnumC1561v[] enumC1561vArr = {enumC1561v, enumC1561v2, enumC1561v3, new EnumC1561v("UNDISPATCHED", 3)};
        f16062c = enumC1561vArr;
        O3.d.m(enumC1561vArr);
    }

    public static EnumC1561v valueOf(String str) {
        return (EnumC1561v) Enum.valueOf(EnumC1561v.class, str);
    }

    public static EnumC1561v[] values() {
        return (EnumC1561v[]) f16062c.clone();
    }
}
