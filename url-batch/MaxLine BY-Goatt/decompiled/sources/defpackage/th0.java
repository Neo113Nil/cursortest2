package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class th0 {
    public static final th0 m;
    public static final th0 n;
    public static final th0 o;
    public static final /* synthetic */ th0[] p;

    static {
        th0 th0Var = new th0("PreEnter", 0);
        m = th0Var;
        th0 th0Var2 = new th0("Visible", 1);
        n = th0Var2;
        th0 th0Var3 = new th0("PostExit", 2);
        o = th0Var3;
        p = new th0[]{th0Var, th0Var2, th0Var3};
    }

    public static th0 valueOf(String str) {
        return (th0) Enum.valueOf(th0.class, str);
    }

    public static th0[] values() {
        return (th0[]) p.clone();
    }
}
