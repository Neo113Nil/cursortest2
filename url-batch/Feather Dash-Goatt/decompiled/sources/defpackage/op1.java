package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class op1 {
    public static final en0 a;
    public static final mp1[] b;

    static {
        en0 en0Var = new en0(8);
        mp1.a.getClass();
        np1 np1Var = lp1.g;
        en0Var.h(1, np1Var);
        np1 np1Var2 = lp1.f;
        en0Var.h(2, np1Var2);
        np1 np1Var3 = lp1.b;
        en0Var.h(4, np1Var3);
        np1 np1Var4 = lp1.d;
        en0Var.h(8, np1Var4);
        np1 np1Var5 = lp1.h;
        en0Var.h(16, np1Var5);
        np1 np1Var6 = lp1.e;
        en0Var.h(32, np1Var6);
        np1 np1Var7 = lp1.i;
        en0Var.h(64, np1Var7);
        np1 np1Var8 = lp1.c;
        en0Var.h(128, np1Var8);
        a = en0Var;
        b = new mp1[]{np1Var, np1Var2, np1Var3, np1Var7, np1Var5, np1Var6, np1Var4, lp1.j, np1Var8};
    }

    public static final void a(bj0 bj0Var, w80 w80Var, long j, int i, int i2) {
        if (t90.n(j, -1L)) {
            return;
        }
        bj0Var.a(w80Var.b(), (int) ((j >>> 48) & 65535));
        bj0Var.a(w80Var.d(), (int) ((j >>> 32) & 65535));
        bj0Var.a(w80Var.c(), i - ((int) ((j >>> 16) & 65535)));
        bj0Var.a(w80Var.a(), i2 - ((int) (j & 65535)));
    }
}
