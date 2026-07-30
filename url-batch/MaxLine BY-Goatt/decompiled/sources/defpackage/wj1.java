package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wj1 {
    public static final wj1 m;
    public static final wj1 n;
    public static final /* synthetic */ wj1[] o;

    static {
        wj1 wj1Var = new wj1("Min", 0);
        m = wj1Var;
        wj1 wj1Var2 = new wj1("Max", 1);
        n = wj1Var2;
        o = new wj1[]{wj1Var, wj1Var2};
    }

    public static wj1 valueOf(String str) {
        return (wj1) Enum.valueOf(wj1.class, str);
    }

    public static wj1[] values() {
        return (wj1[]) o.clone();
    }
}
