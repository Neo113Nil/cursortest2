package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k92 {
    public static final k92 m;
    public static final k92 n;
    public static final /* synthetic */ k92[] o;

    static {
        k92 k92Var = new k92("Ltr", 0);
        m = k92Var;
        k92 k92Var2 = new k92("Rtl", 1);
        n = k92Var2;
        o = new k92[]{k92Var, k92Var2};
    }

    public static k92 valueOf(String str) {
        return (k92) Enum.valueOf(k92.class, str);
    }

    public static k92[] values() {
        return (k92[]) o.clone();
    }
}
