package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ur3 {
    public static final tl3 a;
    public static final tl3 b;
    public static final tl3 c;
    public static final tl3 d;
    public static final tl3 e;
    public static final tl3 f;

    static {
        pf2 pf2Var = new pf2(rl3.a(), true, true);
        a = pf2Var.b("measurement.test.boolean_flag", false);
        b = pf2Var.a(-1L, "measurement.test.cached_long_flag");
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = tl3.g;
        c = new tl3(pf2Var, "measurement.test.double_flag", valueOf, 2);
        d = pf2Var.a(-2L, "measurement.test.int_flag");
        e = pf2Var.a(-1L, "measurement.test.long_flag");
        f = pf2Var.c("measurement.test.string_flag", "---");
    }
}
