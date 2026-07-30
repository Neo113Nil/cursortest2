package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ns1 {
    public static final ns1 m;
    public static final ns1 n;
    public static final /* synthetic */ ns1[] o;

    static {
        ns1 ns1Var = new ns1("Min", 0);
        m = ns1Var;
        ns1 ns1Var2 = new ns1("Max", 1);
        n = ns1Var2;
        o = new ns1[]{ns1Var, ns1Var2};
    }

    public static ns1 valueOf(String str) {
        return (ns1) Enum.valueOf(ns1.class, str);
    }

    public static ns1[] values() {
        return (ns1[]) o.clone();
    }
}
