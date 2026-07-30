package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class la1 {
    public static final la1 d;
    public static final la1 e;
    public static final la1 g;
    public static final /* synthetic */ la1[] h;

    static {
        la1 la1Var = new la1("START", 0);
        d = la1Var;
        la1 la1Var2 = new la1("STOP", 1);
        e = la1Var2;
        la1 la1Var3 = new la1("STOP_AND_RESET_REPLAY_CACHE", 2);
        g = la1Var3;
        h = new la1[]{la1Var, la1Var2, la1Var3};
    }

    public static la1 valueOf(String str) {
        return (la1) Enum.valueOf(la1.class, str);
    }

    public static la1[] values() {
        return (la1[]) h.clone();
    }
}
