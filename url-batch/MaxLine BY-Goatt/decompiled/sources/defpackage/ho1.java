package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ho1 {
    public static final ho1 m;
    public static final ho1 n;
    public static final /* synthetic */ ho1[] o;

    static {
        ho1 ho1Var = new ho1("Default", 0);
        m = ho1Var;
        ho1 ho1Var2 = new ho1("UserInput", 1);
        n = ho1Var2;
        o = new ho1[]{ho1Var, ho1Var2, new ho1("PreventUserInput", 2)};
    }

    public static ho1 valueOf(String str) {
        return (ho1) Enum.valueOf(ho1.class, str);
    }

    public static ho1[] values() {
        return (ho1[]) o.clone();
    }
}
