package b4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0290e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0290e f4836a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0290e[] f4837b;

    static {
        EnumC0290e enumC0290e = new EnumC0290e("INSTANCE", 0);
        f4836a = enumC0290e;
        f4837b = new EnumC0290e[]{enumC0290e};
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            L3.a aVar = L3.a.f1483a;
        } else {
            new D3.h(1);
        }
    }

    public static EnumC0290e valueOf(String str) {
        return (EnumC0290e) Enum.valueOf(EnumC0290e.class, str);
    }

    public static EnumC0290e[] values() {
        return (EnumC0290e[]) f4837b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "RandomIdGenerator{}";
    }
}
