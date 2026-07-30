package g0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: f, reason: collision with root package name */
    public static final q1 f3860f;

    /* renamed from: g, reason: collision with root package name */
    public static final q1 f3861g;

    /* renamed from: h, reason: collision with root package name */
    public static final q1 f3862h;

    /* renamed from: i, reason: collision with root package name */
    public static final q1 f3863i;

    /* renamed from: j, reason: collision with root package name */
    public static final q1 f3864j;

    /* renamed from: k, reason: collision with root package name */
    public static final q1 f3865k;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ q1[] f3866l;

    static {
        q1 q1Var = new q1("ShutDown", 0);
        f3860f = q1Var;
        q1 q1Var2 = new q1("ShuttingDown", 1);
        f3861g = q1Var2;
        q1 q1Var3 = new q1("Inactive", 2);
        f3862h = q1Var3;
        q1 q1Var4 = new q1("InactivePendingWork", 3);
        f3863i = q1Var4;
        q1 q1Var5 = new q1("Idle", 4);
        f3864j = q1Var5;
        q1 q1Var6 = new q1("PendingWork", 5);
        f3865k = q1Var6;
        f3866l = new q1[]{q1Var, q1Var2, q1Var3, q1Var4, q1Var5, q1Var6};
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) f3866l.clone();
    }
}
