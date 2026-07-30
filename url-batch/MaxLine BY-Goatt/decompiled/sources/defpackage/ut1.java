package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ut1 {
    public static final ut1 m;
    public static final ut1 n;
    public static final ut1 o;
    public static final /* synthetic */ ut1[] p;

    static {
        ut1 ut1Var = new ut1("NO_OP", 0);
        m = ut1Var;
        ut1 ut1Var2 = new ut1("ADD", 1);
        n = ut1Var2;
        ut1 ut1Var3 = new ut1("REMOVE", 2);
        o = ut1Var3;
        p = new ut1[]{ut1Var, ut1Var2, ut1Var3};
    }

    public static ut1 valueOf(String str) {
        return (ut1) Enum.valueOf(ut1.class, str);
    }

    public static ut1[] values() {
        return (ut1[]) p.clone();
    }
}
