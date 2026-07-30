package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ho0 {
    public static final ho0 d;
    public static final /* synthetic */ ho0[] e;

    static {
        ho0 ho0Var = new ho0("Default", 0);
        d = ho0Var;
        e = new ho0[]{ho0Var, new ho0("UserInput", 1), new ho0("PreventUserInput", 2)};
    }

    public static ho0 valueOf(String str) {
        return (ho0) Enum.valueOf(ho0.class, str);
    }

    public static ho0[] values() {
        return (ho0[]) e.clone();
    }
}
