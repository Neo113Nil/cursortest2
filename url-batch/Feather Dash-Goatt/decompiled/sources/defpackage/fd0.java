package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fd0 {
    public static final fd0 d;
    public static final fd0 e;
    public static final fd0 g;
    public static final fd0 h;
    public static final fd0 i;
    public static final /* synthetic */ fd0[] j;

    static {
        fd0 fd0Var = new fd0("Measuring", 0);
        d = fd0Var;
        fd0 fd0Var2 = new fd0("LookaheadMeasuring", 1);
        e = fd0Var2;
        fd0 fd0Var3 = new fd0("LayingOut", 2);
        g = fd0Var3;
        fd0 fd0Var4 = new fd0("LookaheadLayingOut", 3);
        h = fd0Var4;
        fd0 fd0Var5 = new fd0("Idle", 4);
        i = fd0Var5;
        j = new fd0[]{fd0Var, fd0Var2, fd0Var3, fd0Var4, fd0Var5};
    }

    public static fd0 valueOf(String str) {
        return (fd0) Enum.valueOf(fd0.class, str);
    }

    public static fd0[] values() {
        return (fd0[]) j.clone();
    }
}
