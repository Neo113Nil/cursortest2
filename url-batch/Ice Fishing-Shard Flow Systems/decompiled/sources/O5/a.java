package O5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1924d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f1925e;

    static {
        a aVar = new a("INSTANCE", 0);
        f1924d = aVar;
        f1925e = new a[]{aVar};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1925e.clone();
    }

    @Override // O5.d
    public final String getDescription() {
        return "AlwaysOffSampler";
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOffSampler";
    }
}
