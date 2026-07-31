package f4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0384k implements InterfaceC0379f {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0384k f4238f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0384k[] f4239g;

    static {
        EnumC0384k enumC0384k = new EnumC0384k("INSTANCE", 0);
        f4238f = enumC0384k;
        f4239g = new EnumC0384k[]{enumC0384k};
    }

    public static EnumC0384k valueOf(String str) {
        return (EnumC0384k) Enum.valueOf(EnumC0384k.class, str);
    }

    public static EnumC0384k[] values() {
        return (EnumC0384k[]) f4239g.clone();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
