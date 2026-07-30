package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0195e {

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0195e f2711f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ EnumC0195e[] f2712g;

    /* renamed from: e, reason: collision with root package name */
    public String f2713e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0195e EF0;

    static {
        EnumC0195e enumC0195e = new EnumC0195e("PLAIN_TEXT", 0);
        enumC0195e.f2713e = "text/plain";
        f2711f = enumC0195e;
        f2712g = new EnumC0195e[]{enumC0195e};
    }

    public static EnumC0195e a(String str) {
        for (EnumC0195e enumC0195e : values()) {
            if (enumC0195e.f2713e.equals(str)) {
                return enumC0195e;
            }
        }
        throw new NoSuchFieldException(F0.h.f("No such ClipboardContentFormat: ", str));
    }

    public static EnumC0195e valueOf(String str) {
        return (EnumC0195e) Enum.valueOf(EnumC0195e.class, str);
    }

    public static EnumC0195e[] values() {
        return (EnumC0195e[]) f2712g.clone();
    }
}
