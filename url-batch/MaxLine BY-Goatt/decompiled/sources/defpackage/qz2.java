package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qz2 {
    public static final qz2 m;
    public static final qz2 n;
    public static final qz2 o;
    public static final /* synthetic */ qz2[] p;

    static {
        qz2 qz2Var = new qz2("ContinueTraversal", 0);
        m = qz2Var;
        qz2 qz2Var2 = new qz2("SkipSubtreeAndContinueTraversal", 1);
        n = qz2Var2;
        qz2 qz2Var3 = new qz2("CancelTraversal", 2);
        o = qz2Var3;
        p = new qz2[]{qz2Var, qz2Var2, qz2Var3};
    }

    public static qz2 valueOf(String str) {
        return (qz2) Enum.valueOf(qz2.class, str);
    }

    public static qz2[] values() {
        return (qz2[]) p.clone();
    }
}
