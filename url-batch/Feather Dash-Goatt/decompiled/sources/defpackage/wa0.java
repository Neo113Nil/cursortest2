package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wa0 {
    public static final wa0 d;
    public static final wa0 e;
    public static final wa0 g;
    public static final wa0 h;
    public static final /* synthetic */ wa0[] i;

    static {
        wa0 wa0Var = new wa0("IGNORED", 0);
        d = wa0Var;
        wa0 wa0Var2 = new wa0("SCHEDULED", 1);
        e = wa0Var2;
        wa0 wa0Var3 = new wa0("DEFERRED", 2);
        g = wa0Var3;
        wa0 wa0Var4 = new wa0("IMMINENT", 3);
        h = wa0Var4;
        i = new wa0[]{wa0Var, wa0Var2, wa0Var3, wa0Var4};
    }

    public static wa0 valueOf(String str) {
        return (wa0) Enum.valueOf(wa0.class, str);
    }

    public static wa0[] values() {
        return (wa0[]) i.clone();
    }
}
