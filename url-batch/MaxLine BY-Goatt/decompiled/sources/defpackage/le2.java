package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class le2 {
    public static final le2 m;
    public static final le2 n;
    public static final le2 o;
    public static final le2 p;
    public static final le2 q;
    public static final /* synthetic */ le2[] r;

    static {
        le2 le2Var = new le2("TopBar", 0);
        m = le2Var;
        le2 le2Var2 = new le2("MainContent", 1);
        n = le2Var2;
        le2 le2Var3 = new le2("Snackbar", 2);
        o = le2Var3;
        le2 le2Var4 = new le2("Fab", 3);
        p = le2Var4;
        le2 le2Var5 = new le2("BottomBar", 4);
        q = le2Var5;
        r = new le2[]{le2Var, le2Var2, le2Var3, le2Var4, le2Var5};
    }

    public static le2 valueOf(String str) {
        return (le2) Enum.valueOf(le2.class, str);
    }

    public static le2[] values() {
        return (le2[]) r.clone();
    }
}
