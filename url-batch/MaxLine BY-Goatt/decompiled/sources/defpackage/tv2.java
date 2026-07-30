package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tv2 {
    public static final tv2 m;
    public static final tv2 n;
    public static final tv2 o;
    public static final tv2 p;
    public static final /* synthetic */ tv2[] q;

    static {
        tv2 tv2Var = new tv2("StartInput", 0);
        m = tv2Var;
        tv2 tv2Var2 = new tv2("StopInput", 1);
        n = tv2Var2;
        tv2 tv2Var3 = new tv2("ShowKeyboard", 2);
        o = tv2Var3;
        tv2 tv2Var4 = new tv2("HideKeyboard", 3);
        p = tv2Var4;
        q = new tv2[]{tv2Var, tv2Var2, tv2Var3, tv2Var4};
    }

    public static tv2 valueOf(String str) {
        return (tv2) Enum.valueOf(tv2.class, str);
    }

    public static tv2[] values() {
        return (tv2[]) q.clone();
    }
}
