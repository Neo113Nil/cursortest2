package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y42 {
    public static final y42 m;
    public static final y42 n;
    public static final y42 o;
    public static final /* synthetic */ y42[] p;

    static {
        y42 y42Var = new y42("DEFAULT", 0);
        m = y42Var;
        y42 y42Var2 = new y42("VERY_LOW", 1);
        n = y42Var2;
        y42 y42Var3 = new y42("HIGHEST", 2);
        o = y42Var3;
        p = new y42[]{y42Var, y42Var2, y42Var3};
    }

    public static y42 valueOf(String str) {
        return (y42) Enum.valueOf(y42.class, str);
    }

    public static y42[] values() {
        return (y42[]) p.clone();
    }
}
