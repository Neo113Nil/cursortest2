package n7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4816b implements d {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4816b f39651n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4816b[] f39652u;

    static {
        EnumC4816b enumC4816b = new EnumC4816b("INSTANCE", 0);
        f39651n = enumC4816b;
        f39652u = new EnumC4816b[]{enumC4816b};
    }

    public static EnumC4816b valueOf(String str) {
        return (EnumC4816b) Enum.valueOf(EnumC4816b.class, str);
    }

    public static EnumC4816b[] values() {
        return (EnumC4816b[]) f39652u.clone();
    }

    @Override // n7.d
    public final String getDescription() {
        return "AlwaysOnSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOnSampler";
    }
}
