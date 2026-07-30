package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class me2 {
    public static final me2 m;
    public static final me2 n;
    public static final /* synthetic */ me2[] o;

    static {
        me2 me2Var = new me2("FILL", 0);
        m = me2Var;
        me2 me2Var2 = new me2("FIT", 1);
        n = me2Var2;
        o = new me2[]{me2Var, me2Var2};
    }

    public static me2 valueOf(String str) {
        return (me2) Enum.valueOf(me2.class, str);
    }

    public static me2[] values() {
        return (me2[]) o.clone();
    }
}
