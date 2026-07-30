package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rw2 {
    public static final rw2 m;
    public static final rw2 n;
    public static final /* synthetic */ rw2[] o;

    static {
        rw2 rw2Var = new rw2("Shown", 0);
        m = rw2Var;
        rw2 rw2Var2 = new rw2("Hidden", 1);
        n = rw2Var2;
        o = new rw2[]{rw2Var, rw2Var2};
    }

    public static rw2 valueOf(String str) {
        return (rw2) Enum.valueOf(rw2.class, str);
    }

    public static rw2[] values() {
        return (rw2[]) o.clone();
    }
}
