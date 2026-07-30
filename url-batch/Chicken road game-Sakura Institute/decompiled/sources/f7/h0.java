package f7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: f, reason: collision with root package name */
    public static final h0 f3480f;

    /* renamed from: g, reason: collision with root package name */
    public static final h0 f3481g;

    /* renamed from: h, reason: collision with root package name */
    public static final h0 f3482h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h0[] f3483i;

    static {
        h0 h0Var = new h0("START", 0);
        f3480f = h0Var;
        h0 h0Var2 = new h0("STOP", 1);
        f3481g = h0Var2;
        h0 h0Var3 = new h0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f3482h = h0Var3;
        f3483i = new h0[]{h0Var, h0Var2, h0Var3};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f3483i.clone();
    }
}
