package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v70 {
    public static final v70 d;
    public static final v70 e;
    public static final v70 g;
    public static final /* synthetic */ v70[] h;

    static {
        v70 v70Var = new v70("Yes", 0);
        d = v70Var;
        v70 v70Var2 = new v70("No", 1);
        e = v70Var2;
        v70 v70Var3 = new v70("NotInitialized", 2);
        g = v70Var3;
        h = new v70[]{v70Var, v70Var2, v70Var3};
    }

    public static v70 valueOf(String str) {
        return (v70) Enum.valueOf(v70.class, str);
    }

    public static v70[] values() {
        return (v70[]) h.clone();
    }
}
