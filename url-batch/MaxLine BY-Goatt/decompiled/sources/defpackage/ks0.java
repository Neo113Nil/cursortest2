package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ks0 {
    public static final ks0 m;
    public static final ks0 n;
    public static final ks0 o;
    public static final ks0 p;
    public static final ks0 q;
    public static final ks0 r;
    public static final ks0 s;
    public static final ks0 t;
    public static final /* synthetic */ ks0[] u;

    static {
        ks0 ks0Var = new ks0("PENALTY_LOG", 0);
        m = ks0Var;
        ks0 ks0Var2 = new ks0("PENALTY_DEATH", 1);
        n = ks0Var2;
        ks0 ks0Var3 = new ks0("DETECT_FRAGMENT_REUSE", 2);
        o = ks0Var3;
        ks0 ks0Var4 = new ks0("DETECT_FRAGMENT_TAG_USAGE", 3);
        p = ks0Var4;
        ks0 ks0Var5 = new ks0("DETECT_RETAIN_INSTANCE_USAGE", 4);
        q = ks0Var5;
        ks0 ks0Var6 = new ks0("DETECT_SET_USER_VISIBLE_HINT", 5);
        r = ks0Var6;
        ks0 ks0Var7 = new ks0("DETECT_TARGET_FRAGMENT_USAGE", 6);
        s = ks0Var7;
        ks0 ks0Var8 = new ks0("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
        t = ks0Var8;
        u = new ks0[]{ks0Var, ks0Var2, ks0Var3, ks0Var4, ks0Var5, ks0Var6, ks0Var7, ks0Var8};
    }

    public static ks0 valueOf(String str) {
        return (ks0) Enum.valueOf(ks0.class, str);
    }

    public static ks0[] values() {
        return (ks0[]) u.clone();
    }
}
