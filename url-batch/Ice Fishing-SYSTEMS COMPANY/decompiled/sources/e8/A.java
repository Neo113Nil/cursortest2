package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class A {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ A[] f37335A;

    /* renamed from: u, reason: collision with root package name */
    public static final C4484b f37336u;

    /* renamed from: v, reason: collision with root package name */
    public static final A f37337v;

    /* renamed from: w, reason: collision with root package name */
    public static final A f37338w;

    /* renamed from: x, reason: collision with root package name */
    public static final A f37339x;

    /* renamed from: y, reason: collision with root package name */
    public static final A f37340y;

    /* renamed from: z, reason: collision with root package name */
    public static final A f37341z;

    /* renamed from: n, reason: collision with root package name */
    public final String f37342n;

    static {
        A a9 = new A("TLS_1_3", 0, "TLSv1.3");
        f37337v = a9;
        A a10 = new A("TLS_1_2", 1, "TLSv1.2");
        f37338w = a10;
        A a11 = new A("TLS_1_1", 2, "TLSv1.1");
        f37339x = a11;
        A a12 = new A("TLS_1_0", 3, "TLSv1");
        f37340y = a12;
        A a13 = new A("SSL_3_0", 4, "SSLv3");
        f37341z = a13;
        A[] aArr = {a9, a10, a11, a12, a13};
        f37335A = aArr;
        W2.e.d(aArr);
        f37336u = new C4484b();
    }

    public A(String str, int i, String str2) {
        this.f37342n = str2;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f37335A.clone();
    }
}
