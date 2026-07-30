package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y21 {
    public static final y21 m;
    public static final y21 n;
    public static final y21 o;
    public static final /* synthetic */ y21[] p;

    static {
        y21 y21Var = new y21("Focused", 0);
        m = y21Var;
        y21 y21Var2 = new y21("UnfocusedEmpty", 1);
        n = y21Var2;
        y21 y21Var3 = new y21("UnfocusedNotEmpty", 2);
        o = y21Var3;
        p = new y21[]{y21Var, y21Var2, y21Var3};
    }

    public static y21 valueOf(String str) {
        return (y21) Enum.valueOf(y21.class, str);
    }

    public static y21[] values() {
        return (y21[]) p.clone();
    }
}
