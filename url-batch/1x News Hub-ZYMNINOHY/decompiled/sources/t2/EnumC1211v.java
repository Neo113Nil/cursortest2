package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1211v {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1211v f10442a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1211v f10443b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1211v[] f10444c;

    static {
        EnumC1211v enumC1211v = new EnumC1211v("DEFAULT", 0);
        f10442a = enumC1211v;
        EnumC1211v enumC1211v2 = new EnumC1211v("LAZY", 1);
        EnumC1211v enumC1211v3 = new EnumC1211v("ATOMIC", 2);
        f10443b = enumC1211v3;
        f10444c = new EnumC1211v[]{enumC1211v, enumC1211v2, enumC1211v3, new EnumC1211v("UNDISPATCHED", 3)};
    }

    public static EnumC1211v valueOf(String str) {
        return (EnumC1211v) Enum.valueOf(EnumC1211v.class, str);
    }

    public static EnumC1211v[] values() {
        return (EnumC1211v[]) f10444c.clone();
    }
}
