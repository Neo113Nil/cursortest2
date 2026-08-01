package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: d, reason: collision with root package name */
    public static final v1 f6824d;

    /* renamed from: e, reason: collision with root package name */
    public static final v1 f6825e;

    /* renamed from: i, reason: collision with root package name */
    public static final v1 f6826i;

    /* renamed from: r, reason: collision with root package name */
    public static final v1 f6827r;

    /* renamed from: s, reason: collision with root package name */
    public static final v1 f6828s;

    /* renamed from: t, reason: collision with root package name */
    public static final v1 f6829t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ v1[] f6830u;

    static {
        v1 v1Var = new v1("ShutDown", 0);
        f6824d = v1Var;
        v1 v1Var2 = new v1("ShuttingDown", 1);
        f6825e = v1Var2;
        v1 v1Var3 = new v1("Inactive", 2);
        f6826i = v1Var3;
        v1 v1Var4 = new v1("InactivePendingWork", 3);
        f6827r = v1Var4;
        v1 v1Var5 = new v1("Idle", 4);
        f6828s = v1Var5;
        v1 v1Var6 = new v1("PendingWork", 5);
        f6829t = v1Var6;
        f6830u = new v1[]{v1Var, v1Var2, v1Var3, v1Var4, v1Var5, v1Var6};
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) f6830u.clone();
    }
}
