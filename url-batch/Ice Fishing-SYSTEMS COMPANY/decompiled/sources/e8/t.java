package e8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t {

    /* renamed from: A, reason: collision with root package name */
    public static final t f37498A;

    /* renamed from: B, reason: collision with root package name */
    public static final t f37499B;

    /* renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ t[] f37500C;

    /* renamed from: u, reason: collision with root package name */
    public static final C4484b f37501u;

    /* renamed from: v, reason: collision with root package name */
    public static final t f37502v;

    /* renamed from: w, reason: collision with root package name */
    public static final t f37503w;

    /* renamed from: x, reason: collision with root package name */
    public static final t f37504x;

    /* renamed from: y, reason: collision with root package name */
    public static final t f37505y;

    /* renamed from: z, reason: collision with root package name */
    public static final t f37506z;

    /* renamed from: n, reason: collision with root package name */
    public final String f37507n;

    static {
        t tVar = new t("HTTP_1_0", 0, "http/1.0");
        f37502v = tVar;
        t tVar2 = new t("HTTP_1_1", 1, "http/1.1");
        f37503w = tVar2;
        t tVar3 = new t("SPDY_3", 2, "spdy/3.1");
        f37504x = tVar3;
        t tVar4 = new t("HTTP_2", 3, "h2");
        f37505y = tVar4;
        t tVar5 = new t("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f37506z = tVar5;
        t tVar6 = new t("QUIC", 5, "quic");
        f37498A = tVar6;
        t tVar7 = new t("HTTP_3", 6, "h3");
        f37499B = tVar7;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7};
        f37500C = tVarArr;
        W2.e.d(tVarArr);
        f37501u = new C4484b();
    }

    public t(String str, int i, String str2) {
        this.f37507n = str2;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f37500C.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f37507n;
    }
}
