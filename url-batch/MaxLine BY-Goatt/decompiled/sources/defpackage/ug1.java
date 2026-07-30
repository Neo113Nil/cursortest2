package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ug1 {
    public static final ug1 m;
    public static final ug1 n;
    public static final ug1 o;
    public static final /* synthetic */ ug1[] p;

    static {
        ug1 ug1Var = new ug1("IsPlacedInLookahead", 0);
        m = ug1Var;
        ug1 ug1Var2 = new ug1("IsPlacedInApproach", 1);
        n = ug1Var2;
        ug1 ug1Var3 = new ug1("IsNotPlaced", 2);
        o = ug1Var3;
        p = new ug1[]{ug1Var, ug1Var2, ug1Var3};
    }

    public static ug1 valueOf(String str) {
        return (ug1) Enum.valueOf(ug1.class, str);
    }

    public static ug1[] values() {
        return (ug1[]) p.clone();
    }
}
