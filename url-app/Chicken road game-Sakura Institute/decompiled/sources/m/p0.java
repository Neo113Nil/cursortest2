package m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: f, reason: collision with root package name */
    public static final p0 f6228f;

    /* renamed from: g, reason: collision with root package name */
    public static final p0 f6229g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ p0[] f6230h;

    static {
        p0 p0Var = new p0("Default", 0);
        f6228f = p0Var;
        p0 p0Var2 = new p0("UserInput", 1);
        f6229g = p0Var2;
        f6230h = new p0[]{p0Var, p0Var2, new p0("PreventUserInput", 2)};
    }

    public static p0 valueOf(String str) {
        return (p0) Enum.valueOf(p0.class, str);
    }

    public static p0[] values() {
        return (p0[]) f6230h.clone();
    }
}
