package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ua0 {
    public static final ua0 d;
    public static final ua0 e;
    public static final ua0 g;
    public static final ua0 h;
    public static final /* synthetic */ ua0[] i;

    static {
        ua0 ua0Var = new ua0("LookaheadMeasurement", 0);
        d = ua0Var;
        ua0 ua0Var2 = new ua0("LookaheadPlacement", 1);
        e = ua0Var2;
        ua0 ua0Var3 = new ua0("Measurement", 2);
        g = ua0Var3;
        ua0 ua0Var4 = new ua0("Placement", 3);
        h = ua0Var4;
        i = new ua0[]{ua0Var, ua0Var2, ua0Var3, ua0Var4};
    }

    public static ua0 valueOf(String str) {
        return (ua0) Enum.valueOf(ua0.class, str);
    }

    public static ua0[] values() {
        return (ua0[]) i.clone();
    }
}
