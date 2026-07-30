package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e91 {
    public static final e91 m;
    public static final e91 n;
    public static final e91 o;
    public static final e91 p;
    public static final e91 q;
    public static final /* synthetic */ e91[] r;

    static {
        e91 e91Var = new e91("Measuring", 0);
        m = e91Var;
        e91 e91Var2 = new e91("LookaheadMeasuring", 1);
        n = e91Var2;
        e91 e91Var3 = new e91("LayingOut", 2);
        o = e91Var3;
        e91 e91Var4 = new e91("LookaheadLayingOut", 3);
        p = e91Var4;
        e91 e91Var5 = new e91("Idle", 4);
        q = e91Var5;
        r = new e91[]{e91Var, e91Var2, e91Var3, e91Var4, e91Var5};
    }

    public static e91 valueOf(String str) {
        return (e91) Enum.valueOf(e91.class, str);
    }

    public static e91[] values() {
        return (e91[]) r.clone();
    }
}
