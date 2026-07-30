package m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC4791e {

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC4791e f39588n;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ EnumC4791e[] f39589u;

    static {
        EnumC4791e enumC4791e = new EnumC4791e("INSTANCE", 0);
        f39588n = enumC4791e;
        f39589u = new EnumC4791e[]{enumC4791e};
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            W6.a aVar = W6.a.f3461n;
        } else {
            new D5.a(11);
        }
    }

    public static EnumC4791e valueOf(String str) {
        return (EnumC4791e) Enum.valueOf(EnumC4791e.class, str);
    }

    public static EnumC4791e[] values() {
        return (EnumC4791e[]) f39589u.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "RandomIdGenerator{}";
    }
}
