package G0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final t f825d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f826e;

    /* renamed from: i, reason: collision with root package name */
    public static final t f827i;

    /* renamed from: l, reason: collision with root package name */
    public static final t f828l;

    /* renamed from: m, reason: collision with root package name */
    public static final t f829m;

    /* renamed from: n, reason: collision with root package name */
    public static final t f830n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ t[] f831o;

    static {
        t tVar = new t("NOT_REQUIRED", 0);
        f825d = tVar;
        t tVar2 = new t("CONNECTED", 1);
        f826e = tVar2;
        t tVar3 = new t("UNMETERED", 2);
        f827i = tVar3;
        t tVar4 = new t("NOT_ROAMING", 3);
        f828l = tVar4;
        t tVar5 = new t("METERED", 4);
        f829m = tVar5;
        t tVar6 = new t("TEMPORARILY_UNMETERED", 5);
        f830n = tVar6;
        f831o = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f831o.clone();
    }
}
