package t0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f8779d;

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f8780e;

    /* renamed from: f, reason: collision with root package name */
    public static final q0 f8781f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ q0[] f8782g;

    static {
        q0 q0Var = new q0("ContinueTraversal", 0);
        f8779d = q0Var;
        q0 q0Var2 = new q0("SkipSubtreeAndContinueTraversal", 1);
        f8780e = q0Var2;
        q0 q0Var3 = new q0("CancelTraversal", 2);
        f8781f = q0Var3;
        f8782g = new q0[]{q0Var, q0Var2, q0Var3};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f8782g.clone();
    }
}
