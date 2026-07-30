package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class et0 {
    public static final et0 d;
    public static final et0 e;
    public static final /* synthetic */ et0[] g;

    static {
        et0 et0Var = new et0("Vertical", 0);
        d = et0Var;
        et0 et0Var2 = new et0("Horizontal", 1);
        e = et0Var2;
        g = new et0[]{et0Var, et0Var2};
    }

    public static et0 valueOf(String str) {
        return (et0) Enum.valueOf(et0.class, str);
    }

    public static et0[] values() {
        return (et0[]) g.clone();
    }
}
