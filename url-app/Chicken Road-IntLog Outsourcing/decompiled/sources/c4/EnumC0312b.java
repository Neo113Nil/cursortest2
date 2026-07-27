package c4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0312b implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0312b f4924a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0312b[] f4925b;

    static {
        EnumC0312b enumC0312b = new EnumC0312b("INSTANCE", 0);
        f4924a = enumC0312b;
        f4925b = new EnumC0312b[]{enumC0312b};
    }

    public static EnumC0312b valueOf(String str) {
        return (EnumC0312b) Enum.valueOf(EnumC0312b.class, str);
    }

    public static EnumC0312b[] values() {
        return (EnumC0312b[]) f4925b.clone();
    }

    @Override // c4.d
    public final String getDescription() {
        return "AlwaysOnSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOnSampler";
    }
}
