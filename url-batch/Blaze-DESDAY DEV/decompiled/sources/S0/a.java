package S0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f763a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f764b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f765c;
    public static final a d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f766e;

    static {
        a aVar = new a("UP", 0);
        f763a = aVar;
        a aVar2 = new a("DOWN", 1);
        f764b = aVar2;
        a aVar3 = new a("LEFT", 2);
        f765c = aVar3;
        a aVar4 = new a("RIGHT", 3);
        d = aVar4;
        f766e = new a[]{aVar, aVar2, aVar3, aVar4};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f766e.clone();
    }
}
