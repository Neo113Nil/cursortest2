package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: d, reason: collision with root package name */
    public static final u1 f5126d;

    /* renamed from: e, reason: collision with root package name */
    public static final u1 f5127e;

    /* renamed from: f, reason: collision with root package name */
    public static final u1 f5128f;

    /* renamed from: g, reason: collision with root package name */
    public static final u1 f5129g;

    /* renamed from: h, reason: collision with root package name */
    public static final u1 f5130h;
    public static final u1 i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ u1[] f5131j;

    static {
        u1 u1Var = new u1("ShutDown", 0);
        f5126d = u1Var;
        u1 u1Var2 = new u1("ShuttingDown", 1);
        f5127e = u1Var2;
        u1 u1Var3 = new u1("Inactive", 2);
        f5128f = u1Var3;
        u1 u1Var4 = new u1("InactivePendingWork", 3);
        f5129g = u1Var4;
        u1 u1Var5 = new u1("Idle", 4);
        f5130h = u1Var5;
        u1 u1Var6 = new u1("PendingWork", 5);
        i = u1Var6;
        f5131j = new u1[]{u1Var, u1Var2, u1Var3, u1Var4, u1Var5, u1Var6};
    }

    public static u1 valueOf(String str) {
        return (u1) Enum.valueOf(u1.class, str);
    }

    public static u1[] values() {
        return (u1[]) f5131j.clone();
    }
}
