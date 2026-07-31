package X5;

import a.AbstractC0219a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: g, reason: collision with root package name */
    public static final C0218b f3036g;

    /* renamed from: h, reason: collision with root package name */
    public static final t f3037h;

    /* renamed from: i, reason: collision with root package name */
    public static final t f3038i;

    /* renamed from: j, reason: collision with root package name */
    public static final t f3039j;

    /* renamed from: k, reason: collision with root package name */
    public static final t f3040k;

    /* renamed from: l, reason: collision with root package name */
    public static final t f3041l;

    /* renamed from: m, reason: collision with root package name */
    public static final t f3042m;

    /* renamed from: n, reason: collision with root package name */
    public static final t f3043n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ t[] f3044o;

    /* renamed from: f, reason: collision with root package name */
    public final String f3045f;

    static {
        t tVar = new t("HTTP_1_0", 0, "http/1.0");
        f3037h = tVar;
        t tVar2 = new t("HTTP_1_1", 1, "http/1.1");
        f3038i = tVar2;
        t tVar3 = new t("SPDY_3", 2, "spdy/3.1");
        f3039j = tVar3;
        t tVar4 = new t("HTTP_2", 3, "h2");
        f3040k = tVar4;
        t tVar5 = new t("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f3041l = tVar5;
        t tVar6 = new t("QUIC", 5, "quic");
        f3042m = tVar6;
        t tVar7 = new t("HTTP_3", 6, "h3");
        f3043n = tVar7;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7};
        f3044o = tVarArr;
        AbstractC0219a.n(tVarArr);
        f3036g = new C0218b();
    }

    public t(String str, int i7, String str2) {
        this.f3045f = str2;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f3044o.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3045f;
    }
}
