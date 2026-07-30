package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class c20 {
    public static final c20 m;
    public static final c20 n;
    public static final /* synthetic */ c20[] o;

    static {
        c20 c20Var = new c20("VIEW_APPEAR", 0);
        m = c20Var;
        c20 c20Var2 = new c20("VIEW_DISAPPEAR", 1);
        n = c20Var2;
        o = new c20[]{c20Var, c20Var2};
    }

    public static c20 valueOf(String str) {
        return (c20) Enum.valueOf(c20.class, str);
    }

    public static c20[] values() {
        return (c20[]) o.clone();
    }
}
