package r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: f, reason: collision with root package name */
    public static final p1 f7876f;

    /* renamed from: g, reason: collision with root package name */
    public static final p1 f7877g;

    /* renamed from: h, reason: collision with root package name */
    public static final p1 f7878h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ p1[] f7879i;

    static {
        p1 p1Var = new p1("ContinueTraversal", 0);
        f7876f = p1Var;
        p1 p1Var2 = new p1("SkipSubtreeAndContinueTraversal", 1);
        f7877g = p1Var2;
        p1 p1Var3 = new p1("CancelTraversal", 2);
        f7878h = p1Var3;
        f7879i = new p1[]{p1Var, p1Var2, p1Var3};
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) f7879i.clone();
    }
}
