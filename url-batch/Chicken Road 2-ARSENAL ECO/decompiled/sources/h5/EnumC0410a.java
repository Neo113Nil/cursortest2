package h5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0410a implements InterfaceC0413d {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0410a f4339f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0410a[] f4340g;

    static {
        EnumC0410a enumC0410a = new EnumC0410a("INSTANCE", 0);
        f4339f = enumC0410a;
        f4340g = new EnumC0410a[]{enumC0410a};
    }

    public static EnumC0410a valueOf(String str) {
        return (EnumC0410a) Enum.valueOf(EnumC0410a.class, str);
    }

    public static EnumC0410a[] values() {
        return (EnumC0410a[]) f4340g.clone();
    }

    @Override // h5.InterfaceC0413d
    public final String a() {
        return "AlwaysOffSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOffSampler";
    }
}
