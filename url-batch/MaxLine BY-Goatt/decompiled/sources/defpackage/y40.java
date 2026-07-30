package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y40 {
    public static final y40 m;
    public static final y40 n;
    public static final y40 o;
    public static final y40 p;
    public static final y40 q;
    public static final /* synthetic */ y40[] r;

    static {
        y40 y40Var = new y40("CPU_ACQUIRED", 0);
        m = y40Var;
        y40 y40Var2 = new y40("BLOCKING", 1);
        n = y40Var2;
        y40 y40Var3 = new y40("PARKING", 2);
        o = y40Var3;
        y40 y40Var4 = new y40("DORMANT", 3);
        p = y40Var4;
        y40 y40Var5 = new y40("TERMINATED", 4);
        q = y40Var5;
        r = new y40[]{y40Var, y40Var2, y40Var3, y40Var4, y40Var5};
    }

    public static y40 valueOf(String str) {
        return (y40) Enum.valueOf(y40.class, str);
    }

    public static y40[] values() {
        return (y40[]) r.clone();
    }
}
