package M;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f272c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f273d;

    /* renamed from: b, reason: collision with root package name */
    public String f274b;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("PLAIN_TEXT", 0);
        eVar.f274b = "text/plain";
        f272c = eVar;
        f273d = new e[]{eVar};
    }

    public static e a(String str) {
        for (e eVar : values()) {
            if (eVar.f274b.equals(str)) {
                return eVar;
            }
        }
        throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f273d.clone();
    }
}
