package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class za2 {
    public static final bp2 a = new bp2(o00.J);
    public static final r00 b = new r00(o00.I);
    public static final cb2 c;
    public static final cb2 d;

    static {
        long j = aw.g;
        c = new cb2(true, Float.NaN, j);
        d = new cb2(false, Float.NaN, j);
    }

    public static final z11 a(a00 a00Var, int i, int i2) {
        z11 cb2Var;
        boolean z = true;
        boolean z2 = (i2 & 1) != 0;
        float f = (i2 & 2) != 0 ? Float.NaN : 20.0f;
        long j = aw.g;
        a00Var.X(-1280632857);
        if (((Boolean) a00Var.j(a)).booleanValue()) {
            h03 h03Var = ab2.a;
            zn1 k = ij2.k(new aw(j), a00Var);
            boolean z3 = (((i & 14) ^ 6) > 4 && a00Var.g(z2)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !a00Var.c(f)) && (i & 48) != 32) {
                z = false;
            }
            boolean z4 = z3 | z;
            Object M = a00Var.M();
            if (z4 || M == sz.a) {
                M = new d22(z2, f, k);
                a00Var.i0(M);
            }
            cb2Var = (d22) M;
        } else {
            cb2Var = (pc0.a(f, Float.NaN) && aw.c(j, j)) ? z2 ? c : d : new cb2(z2, f, j);
        }
        a00Var.q(false);
        return cb2Var;
    }
}
