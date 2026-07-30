package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i41 {
    public static final i41 m;
    public static final i41 n;
    public static final /* synthetic */ i41[] o;

    static {
        i41 i41Var = new i41("Min", 0);
        m = i41Var;
        i41 i41Var2 = new i41("Max", 1);
        n = i41Var2;
        o = new i41[]{i41Var, i41Var2};
    }

    public static i41 valueOf(String str) {
        return (i41) Enum.valueOf(i41.class, str);
    }

    public static i41[] values() {
        return (i41[]) o.clone();
    }
}
