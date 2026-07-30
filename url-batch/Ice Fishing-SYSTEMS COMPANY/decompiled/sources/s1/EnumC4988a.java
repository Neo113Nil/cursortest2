package s1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4988a {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4988a f40415n;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC4988a f40416u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC4988a f40417v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ EnumC4988a[] f40418w;

    static {
        EnumC4988a enumC4988a = new EnumC4988a("PREFER_ARGB_8888", 0);
        f40415n = enumC4988a;
        EnumC4988a enumC4988a2 = new EnumC4988a("PREFER_RGB_565", 1);
        f40416u = enumC4988a2;
        f40418w = new EnumC4988a[]{enumC4988a, enumC4988a2};
        f40417v = enumC4988a;
    }

    public static EnumC4988a valueOf(String str) {
        return (EnumC4988a) Enum.valueOf(EnumC4988a.class, str);
    }

    public static EnumC4988a[] values() {
        return (EnumC4988a[]) f40418w.clone();
    }
}
