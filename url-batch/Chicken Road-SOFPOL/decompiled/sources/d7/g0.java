package d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g0 f2360d;

    /* renamed from: e, reason: collision with root package name */
    public static final g0 f2361e;

    /* renamed from: f, reason: collision with root package name */
    public static final g0 f2362f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ g0[] f2363g;

    static {
        g0 g0Var = new g0("START", 0);
        f2360d = g0Var;
        g0 g0Var2 = new g0("STOP", 1);
        f2361e = g0Var2;
        g0 g0Var3 = new g0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f2362f = g0Var3;
        f2363g = new g0[]{g0Var, g0Var2, g0Var3};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f2363g.clone();
    }
}
