package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class go0 {
    public static final go0 d;
    public static final go0 e;
    public static final /* synthetic */ go0[] g;

    static {
        go0 go0Var = new go0("Default", 0);
        d = go0Var;
        go0 go0Var2 = new go0("UserInput", 1);
        e = go0Var2;
        g = new go0[]{go0Var, go0Var2, new go0("PreventUserInput", 2)};
    }

    public static go0 valueOf(String str) {
        return (go0) Enum.valueOf(go0.class, str);
    }

    public static go0[] values() {
        return (go0[]) g.clone();
    }
}
