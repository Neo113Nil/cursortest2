package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1112e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1112e f9958a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1112e f9959b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC1112e[] f9960c;

    static {
        EnumC1112e enumC1112e = new EnumC1112e("image", 0);
        f9958a = enumC1112e;
        EnumC1112e enumC1112e2 = new EnumC1112e("video", 1);
        f9959b = enumC1112e2;
        f9960c = new EnumC1112e[]{enumC1112e, enumC1112e2};
    }

    public static EnumC1112e valueOf(String str) {
        return (EnumC1112e) Enum.valueOf(EnumC1112e.class, str);
    }

    public static EnumC1112e[] values() {
        return (EnumC1112e[]) f9960c.clone();
    }
}
