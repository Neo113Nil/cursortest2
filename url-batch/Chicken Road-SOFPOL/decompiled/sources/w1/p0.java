package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: d, reason: collision with root package name */
    public static final p0 f7748d;

    /* renamed from: e, reason: collision with root package name */
    public static final p0 f7749e;

    /* renamed from: f, reason: collision with root package name */
    public static final p0 f7750f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ p0[] f7751g;

    static {
        p0 p0Var = new p0("IsPlacedInLookahead", 0);
        f7748d = p0Var;
        p0 p0Var2 = new p0("IsPlacedInApproach", 1);
        f7749e = p0Var2;
        p0 p0Var3 = new p0("IsNotPlaced", 2);
        f7750f = p0Var3;
        f7751g = new p0[]{p0Var, p0Var2, p0Var3};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f7751g.clone();
    }
}
