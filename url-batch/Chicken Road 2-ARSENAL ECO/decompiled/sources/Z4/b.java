package Z4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final b f3107f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f3108g;

    static {
        b bVar = new b("INSTANCE", 0);
        f3107f = bVar;
        f3108g = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3108g.clone();
    }
}
