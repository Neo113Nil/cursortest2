package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mv2 {
    public static final mv2 m;
    public static final mv2 n;
    public static final /* synthetic */ mv2[] o;

    static {
        mv2 mv2Var = new mv2("Filled", 0);
        m = mv2Var;
        mv2 mv2Var2 = new mv2("Outlined", 1);
        n = mv2Var2;
        o = new mv2[]{mv2Var, mv2Var2};
    }

    public static mv2 valueOf(String str) {
        return (mv2) Enum.valueOf(mv2.class, str);
    }

    public static mv2[] values() {
        return (mv2[]) o.clone();
    }
}
