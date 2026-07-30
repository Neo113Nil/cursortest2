package M4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final l f1759d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ l[] f1760e;

    static {
        l lVar = new l("INSTANCE", 0);
        f1759d = lVar;
        f1760e = new l[]{lVar};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f1760e.clone();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
