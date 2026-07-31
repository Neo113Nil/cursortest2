package X5;

import a.AbstractC0219a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: g, reason: collision with root package name */
    public static final C0218b f2869g;

    /* renamed from: h, reason: collision with root package name */
    public static final A f2870h;

    /* renamed from: i, reason: collision with root package name */
    public static final A f2871i;

    /* renamed from: j, reason: collision with root package name */
    public static final A f2872j;

    /* renamed from: k, reason: collision with root package name */
    public static final A f2873k;

    /* renamed from: l, reason: collision with root package name */
    public static final A f2874l;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ A[] f2875m;

    /* renamed from: f, reason: collision with root package name */
    public final String f2876f;

    static {
        A a7 = new A("TLS_1_3", 0, "TLSv1.3");
        f2870h = a7;
        A a8 = new A("TLS_1_2", 1, "TLSv1.2");
        f2871i = a8;
        A a9 = new A("TLS_1_1", 2, "TLSv1.1");
        f2872j = a9;
        A a10 = new A("TLS_1_0", 3, "TLSv1");
        f2873k = a10;
        A a11 = new A("SSL_3_0", 4, "SSLv3");
        f2874l = a11;
        A[] aArr = {a7, a8, a9, a10, a11};
        f2875m = aArr;
        AbstractC0219a.n(aArr);
        f2869g = new C0218b();
    }

    public A(String str, int i7, String str2) {
        this.f2876f = str2;
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f2875m.clone();
    }
}
