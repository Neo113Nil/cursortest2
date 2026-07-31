package f2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2711d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2712e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f2713f;

    static {
        a aVar = new a("On", 0);
        f2711d = aVar;
        a aVar2 = new a("Off", 1);
        f2712e = aVar2;
        f2713f = new a[]{aVar, aVar2, new a("Indeterminate", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2713f.clone();
    }
}
