package r4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final e f7466d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ e[] f7467e;

    static {
        e eVar = new e("PLAIN_TEXT", 0);
        f7466d = eVar;
        f7467e = new e[]{eVar};
    }

    public static e a(String str) {
        for (e eVar : values()) {
            eVar.getClass();
            if ("text/plain".equals(str)) {
                return eVar;
            }
        }
        throw new NoSuchFieldException(f.i("No such ClipboardContentFormat: ", str));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f7467e.clone();
    }
}
