package i6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f4956f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f4957g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f4958h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ a[] f4959i;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f4956f = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f4957g = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f4958h = aVar3;
        f4959i = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4959i.clone();
    }
}
