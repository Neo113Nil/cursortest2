package u0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: u0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0233e {

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0233e f2992e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0233e[] f2993f;

    static {
        EnumC0233e enumC0233e = new EnumC0233e("PLAIN_TEXT", 0);
        f2992e = enumC0233e;
        f2993f = new EnumC0233e[]{enumC0233e};
    }

    public static EnumC0233e a(String str) {
        for (EnumC0233e enumC0233e : values()) {
            enumC0233e.getClass();
            if ("text/plain".equals(str)) {
                return enumC0233e;
            }
        }
        throw new NoSuchFieldException(L.d.g("No such ClipboardContentFormat: ", str));
    }

    public static EnumC0233e valueOf(String str) {
        return (EnumC0233e) Enum.valueOf(EnumC0233e.class, str);
    }

    public static EnumC0233e[] values() {
        return (EnumC0233e[]) f2993f.clone();
    }
}
