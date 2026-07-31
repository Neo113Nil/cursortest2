package W1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f4608d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4609e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f4610f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f4611g;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f4608d = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f4609e = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f4610f = aVar3;
        f4611g = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4611g.clone();
    }
}
