package h5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0411b implements InterfaceC0413d {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0411b f4341f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0411b[] f4342g;

    static {
        EnumC0411b enumC0411b = new EnumC0411b("INSTANCE", 0);
        f4341f = enumC0411b;
        f4342g = new EnumC0411b[]{enumC0411b};
    }

    public static EnumC0411b valueOf(String str) {
        return (EnumC0411b) Enum.valueOf(EnumC0411b.class, str);
    }

    public static EnumC0411b[] values() {
        return (EnumC0411b[]) f4342g.clone();
    }

    @Override // h5.InterfaceC0413d
    public final String a() {
        return "AlwaysOnSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOnSampler";
    }
}
