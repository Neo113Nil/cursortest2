package O5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: d, reason: collision with root package name */
    public static final b f1926d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f1927e;

    static {
        b bVar = new b("INSTANCE", 0);
        f1926d = bVar;
        f1927e = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1927e.clone();
    }

    @Override // O5.d
    public final String getDescription() {
        return "AlwaysOnSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOnSampler";
    }
}
