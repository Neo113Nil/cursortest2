package w1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: d, reason: collision with root package name */
    public static final w1 f7817d;

    /* renamed from: e, reason: collision with root package name */
    public static final w1 f7818e;

    /* renamed from: f, reason: collision with root package name */
    public static final w1 f7819f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ w1[] f7820g;

    static {
        w1 w1Var = new w1("ContinueTraversal", 0);
        f7817d = w1Var;
        w1 w1Var2 = new w1("SkipSubtreeAndContinueTraversal", 1);
        f7818e = w1Var2;
        w1 w1Var3 = new w1("CancelTraversal", 2);
        f7819f = w1Var3;
        f7820g = new w1[]{w1Var, w1Var2, w1Var3};
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) f7820g.clone();
    }
}
