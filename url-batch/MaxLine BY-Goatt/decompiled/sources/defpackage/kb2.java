package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kb2 {
    public static final kb2 m;
    public static final kb2 n;
    public static final kb2 o;
    public static final /* synthetic */ kb2[] p;

    static {
        kb2 kb2Var = new kb2("AUTOMATIC", 0);
        m = kb2Var;
        kb2 kb2Var2 = new kb2("TRUNCATE", 1);
        n = kb2Var2;
        kb2 kb2Var3 = new kb2("WRITE_AHEAD_LOGGING", 2);
        o = kb2Var3;
        p = new kb2[]{kb2Var, kb2Var2, kb2Var3};
    }

    public static kb2 valueOf(String str) {
        return (kb2) Enum.valueOf(kb2.class, str);
    }

    public static kb2[] values() {
        return (kb2[]) p.clone();
    }
}
