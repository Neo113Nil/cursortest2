package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gp3 {
    public static final gp3 m;
    public static final gp3 n;
    public static final /* synthetic */ gp3[] o;

    static {
        gp3 gp3Var = new gp3("CONSENT", 0);
        m = gp3Var;
        gp3 gp3Var2 = new gp3("LEGITIMATE_INTEREST", 1);
        gp3 gp3Var3 = new gp3("FLEXIBLE_CONSENT", 2);
        gp3 gp3Var4 = new gp3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        n = gp3Var4;
        o = new gp3[]{gp3Var, gp3Var2, gp3Var3, gp3Var4};
    }

    public static gp3[] values() {
        return (gp3[]) o.clone();
    }
}
