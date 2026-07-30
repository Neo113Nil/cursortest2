package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final A f770d;

    /* renamed from: e, reason: collision with root package name */
    public static final A f771e;

    /* renamed from: i, reason: collision with root package name */
    public static final A f772i;

    /* renamed from: l, reason: collision with root package name */
    public static final A f773l;

    /* renamed from: m, reason: collision with root package name */
    public static final A f774m;

    /* renamed from: n, reason: collision with root package name */
    public static final A f775n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ A[] f776o;

    static {
        A a7 = new A("ENQUEUED", 0);
        f770d = a7;
        A a8 = new A("RUNNING", 1);
        f771e = a8;
        A a9 = new A("SUCCEEDED", 2);
        f772i = a9;
        A a10 = new A("FAILED", 3);
        f773l = a10;
        A a11 = new A("BLOCKED", 4);
        f774m = a11;
        A a12 = new A("CANCELLED", 5);
        f775n = a12;
        f776o = new A[]{a7, a8, a9, a10, a11, a12};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f776o.clone();
    }

    public final boolean a() {
        return this == f772i || this == f773l || this == f775n;
    }
}
