package z3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f16290a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f16291b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f16292c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f16293d;

    static {
        a aVar = new a("SUSPEND", 0);
        f16290a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f16291b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f16292c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f16293d = aVarArr;
        O3.d.m(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f16293d.clone();
    }
}
