package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y41 {
    public static final y41 m;
    public static final y41 n;
    public static final y41 o;
    public static final y41 p;
    public static final /* synthetic */ y41[] q;

    static {
        y41 y41Var = new y41("IGNORED", 0);
        m = y41Var;
        y41 y41Var2 = new y41("SCHEDULED", 1);
        n = y41Var2;
        y41 y41Var3 = new y41("DEFERRED", 2);
        o = y41Var3;
        y41 y41Var4 = new y41("IMMINENT", 3);
        p = y41Var4;
        q = new y41[]{y41Var, y41Var2, y41Var3, y41Var4};
    }

    public static y41 valueOf(String str) {
        return (y41) Enum.valueOf(y41.class, str);
    }

    public static y41[] values() {
        return (y41[]) q.clone();
    }
}
