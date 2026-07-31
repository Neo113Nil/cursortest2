package c7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1760d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f1761e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f1762f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f1763g;

    static {
        a aVar = new a("SUSPEND", 0);
        f1760d = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f1761e = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f1762f = aVar3;
        f1763g = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1763g.clone();
    }
}
