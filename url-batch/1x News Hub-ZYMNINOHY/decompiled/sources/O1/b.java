package O1;

import E1.AbstractC0033i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1139a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f1140b;

    static {
        b bVar = new b("PLAIN_TEXT", 0);
        f1139a = bVar;
        f1140b = new b[]{bVar};
    }

    public static b a(String str) {
        for (b bVar : values()) {
            bVar.getClass();
            if ("text/plain".equals(str)) {
                return bVar;
            }
        }
        throw new NoSuchFieldException(AbstractC0033i.j("No such ClipboardContentFormat: ", str));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1140b.clone();
    }
}
