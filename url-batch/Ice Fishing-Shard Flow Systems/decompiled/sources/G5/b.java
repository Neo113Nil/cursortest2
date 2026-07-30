package G5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f844d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f845e;

    static {
        b bVar = new b("INSTANCE", 0);
        f844d = bVar;
        f845e = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f845e.clone();
    }
}
