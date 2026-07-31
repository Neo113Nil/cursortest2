package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1037H {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1037H f8981d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1037H f8982e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1037H f8983f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC1037H[] f8984g;

    static {
        EnumC1037H enumC1037H = new EnumC1037H("START", 0);
        f8981d = enumC1037H;
        EnumC1037H enumC1037H2 = new EnumC1037H("STOP", 1);
        f8982e = enumC1037H2;
        EnumC1037H enumC1037H3 = new EnumC1037H("STOP_AND_RESET_REPLAY_CACHE", 2);
        f8983f = enumC1037H3;
        f8984g = new EnumC1037H[]{enumC1037H, enumC1037H2, enumC1037H3};
    }

    public static EnumC1037H valueOf(String str) {
        return (EnumC1037H) Enum.valueOf(EnumC1037H.class, str);
    }

    public static EnumC1037H[] values() {
        return (EnumC1037H[]) f8984g.clone();
    }
}
