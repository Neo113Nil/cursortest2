package W5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f2787d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f2788e;

    /* renamed from: i, reason: collision with root package name */
    public static final a f2789i;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a[] f2790l;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f2787d = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f2788e = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f2789i = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f2790l = aVarArr;
        d4.c.o(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2790l.clone();
    }
}
