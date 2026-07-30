package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class al2 {
    public static final al2 m;
    public static final al2 n;
    public static final al2 o;
    public static final /* synthetic */ al2[] p;

    static {
        al2 al2Var = new al2("START", 0);
        m = al2Var;
        al2 al2Var2 = new al2("STOP", 1);
        n = al2Var2;
        al2 al2Var3 = new al2("STOP_AND_RESET_REPLAY_CACHE", 2);
        o = al2Var3;
        p = new al2[]{al2Var, al2Var2, al2Var3};
    }

    public static al2 valueOf(String str) {
        return (al2) Enum.valueOf(al2.class, str);
    }

    public static al2[] values() {
        return (al2[]) p.clone();
    }
}
