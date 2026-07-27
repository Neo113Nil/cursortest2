package G2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f931b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f932c;

    /* renamed from: a, reason: collision with root package name */
    public String f933a;

    /* JADX INFO: Fake field, exist only in values array */
    c EF0;

    static {
        c cVar = new c("PLAIN_TEXT", 0);
        cVar.f933a = "text/plain";
        f931b = cVar;
        f932c = new c[]{cVar};
    }

    public static c a(String str) {
        for (c cVar : values()) {
            if (cVar.f933a.equals(str)) {
                return cVar;
            }
        }
        throw new NoSuchFieldException(B0.o.i("No such ClipboardContentFormat: ", str));
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f932c.clone();
    }
}
