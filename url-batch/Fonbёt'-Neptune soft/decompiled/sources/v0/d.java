package v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f3480e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f3481f;

    static {
        d dVar = new d("PLAIN_TEXT", 0);
        f3480e = dVar;
        f3481f = new d[]{dVar};
    }

    public static d a(String str) {
        for (d dVar : values()) {
            dVar.getClass();
            if ("text/plain".equals(str)) {
                return dVar;
            }
        }
        throw new NoSuchFieldException(A0.b.f("No such ClipboardContentFormat: ", str));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3481f.clone();
    }
}
