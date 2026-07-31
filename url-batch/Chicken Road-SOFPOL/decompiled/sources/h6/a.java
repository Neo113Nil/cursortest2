package h6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f3204d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3205e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f3206f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f3207g;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f3204d = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f3205e = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f3206f = aVar3;
        f3207g = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3207g.clone();
    }
}
