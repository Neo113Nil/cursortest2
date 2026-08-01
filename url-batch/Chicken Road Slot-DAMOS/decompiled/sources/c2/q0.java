package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f1641d;

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f1642e;

    /* renamed from: i, reason: collision with root package name */
    public static final q0 f1643i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ q0[] f1644r;

    static {
        q0 q0Var = new q0("IsPlacedInLookahead", 0);
        f1641d = q0Var;
        q0 q0Var2 = new q0("IsPlacedInApproach", 1);
        f1642e = q0Var2;
        q0 q0Var3 = new q0("IsNotPlaced", 2);
        f1643i = q0Var3;
        f1644r = new q0[]{q0Var, q0Var2, q0Var3};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f1644r.clone();
    }
}
