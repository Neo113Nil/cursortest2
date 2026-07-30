package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w41 {
    public static final w41 m;
    public static final w41 n;
    public static final w41 o;
    public static final w41 p;
    public static final /* synthetic */ w41[] q;

    static {
        w41 w41Var = new w41("LookaheadMeasurement", 0);
        m = w41Var;
        w41 w41Var2 = new w41("LookaheadPlacement", 1);
        n = w41Var2;
        w41 w41Var3 = new w41("Measurement", 2);
        o = w41Var3;
        w41 w41Var4 = new w41("Placement", 3);
        p = w41Var4;
        q = new w41[]{w41Var, w41Var2, w41Var3, w41Var4};
    }

    public static w41 valueOf(String str) {
        return (w41) Enum.valueOf(w41.class, str);
    }

    public static w41[] values() {
        return (w41[]) q.clone();
    }
}
