package D6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final l f623e;

    /* renamed from: i, reason: collision with root package name */
    public static final x f624i;

    /* renamed from: l, reason: collision with root package name */
    public static final x f625l;

    /* renamed from: m, reason: collision with root package name */
    public static final x f626m;

    /* renamed from: n, reason: collision with root package name */
    public static final x f627n;

    /* renamed from: o, reason: collision with root package name */
    public static final x f628o;

    /* renamed from: p, reason: collision with root package name */
    public static final x f629p;

    /* renamed from: q, reason: collision with root package name */
    public static final x f630q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ x[] f631r;

    /* renamed from: d, reason: collision with root package name */
    public final String f632d;

    static {
        x xVar = new x("HTTP_1_0", 0, "http/1.0");
        f624i = xVar;
        x xVar2 = new x("HTTP_1_1", 1, "http/1.1");
        f625l = xVar2;
        x xVar3 = new x("SPDY_3", 2, "spdy/3.1");
        f626m = xVar3;
        x xVar4 = new x("HTTP_2", 3, "h2");
        f627n = xVar4;
        x xVar5 = new x("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f628o = xVar5;
        x xVar6 = new x("QUIC", 5, "quic");
        f629p = xVar6;
        x xVar7 = new x("HTTP_3", 6, "h3");
        f630q = xVar7;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7};
        f631r = xVarArr;
        d4.c.o(xVarArr);
        f623e = new l();
    }

    public x(String str, int i2, String str2) {
        this.f632d = str2;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f631r.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f632d;
    }
}
