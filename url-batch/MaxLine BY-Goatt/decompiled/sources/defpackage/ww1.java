package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ww1 {
    public static final ww1 m;
    public static final ww1 n;
    public static final /* synthetic */ ww1[] o;

    static {
        ww1 ww1Var = new ww1("Vertical", 0);
        m = ww1Var;
        ww1 ww1Var2 = new ww1("Horizontal", 1);
        n = ww1Var2;
        o = new ww1[]{ww1Var, ww1Var2};
    }

    public static ww1 valueOf(String str) {
        return (ww1) Enum.valueOf(ww1.class, str);
    }

    public static ww1[] values() {
        return (ww1[]) o.clone();
    }
}
