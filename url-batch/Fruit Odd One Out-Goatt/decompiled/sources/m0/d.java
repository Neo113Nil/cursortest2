package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f772b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f773c;

    static {
        d dVar = new d("PLAIN_TEXT", 0);
        f772b = dVar;
        f773c = new d[]{dVar};
    }

    public static d a(String str) {
        for (d dVar : values()) {
            dVar.getClass();
            if ("text/plain".equals(str)) {
                return dVar;
            }
        }
        f0.l.h("No such ClipboardContentFormat: ", str);
        return null;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f773c.clone();
    }
}
