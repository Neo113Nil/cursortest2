package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10571a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f10572b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f10573c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f10574d;

    static {
        a aVar = new a("SUSPEND", 0);
        f10571a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f10572b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f10573c = aVar3;
        f10574d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10574d.clone();
    }
}
