package M;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f337c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ e[] f338d;

    /* renamed from: b, reason: collision with root package name */
    public String f339b;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("PLAIN_TEXT", 0);
        eVar.f339b = "text/plain";
        f337c = eVar;
        f338d = new e[]{eVar};
    }

    public static e a(String str) {
        for (e eVar : values()) {
            if (eVar.f339b.equals(str)) {
                return eVar;
            }
        }
        throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f338d.clone();
    }
}
