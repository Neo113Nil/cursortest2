package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ij0 {
    public static final ij0 d;
    public static final ij0 e;
    public static final ij0 g;
    public static final /* synthetic */ ij0[] h;

    static {
        ij0 ij0Var = new ij0("IsPlacedInLookahead", 0);
        d = ij0Var;
        ij0 ij0Var2 = new ij0("IsPlacedInApproach", 1);
        e = ij0Var2;
        ij0 ij0Var3 = new ij0("IsNotPlaced", 2);
        g = ij0Var3;
        h = new ij0[]{ij0Var, ij0Var2, ij0Var3};
    }

    public static ij0 valueOf(String str) {
        return (ij0) Enum.valueOf(ij0.class, str);
    }

    public static ij0[] values() {
        return (ij0[]) h.clone();
    }
}
