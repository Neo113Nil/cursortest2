package Q7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final a f2731n;

    /* renamed from: u, reason: collision with root package name */
    public static final a f2732u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f2733v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ a[] f2734w;

    static {
        a aVar = new a("SUSPEND", 0);
        f2731n = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f2732u = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f2733v = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f2734w = aVarArr;
        W2.e.d(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2734w.clone();
    }
}
