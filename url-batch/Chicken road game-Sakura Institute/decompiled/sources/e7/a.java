package e7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f2833f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f2834g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f2835h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f2836i;

    static {
        a aVar = new a("SUSPEND", 0);
        f2833f = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f2834g = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f2835h = aVar3;
        f2836i = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2836i.clone();
    }
}
