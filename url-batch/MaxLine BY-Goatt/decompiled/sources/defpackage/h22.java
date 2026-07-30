package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class h22 {
    public static final bp2 a = new bp2(o00.H);

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(nc1 nc1Var, j5 j5Var, r30 r30Var) {
        f22 f22Var;
        int i;
        if (r30Var instanceof f22) {
            f22Var = (f22) r30Var;
            int i2 = f22Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f22Var.n = i2 - Integer.MIN_VALUE;
                Object obj = f22Var.m;
                b50 b50Var = b50.m;
                i = f22Var.n;
                if (i == 0) {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return;
                    } else {
                        ca2.b(obj);
                        throw new k81();
                    }
                }
                ca2.b(obj);
                if (!nc1Var.m.z) {
                    lh.e("establishTextInputSession called from an unattached node");
                    return;
                }
                rx1 K = s03.K(nc1Var);
                v02 v02Var = (v02) s03.J(nc1Var).L;
                v02Var.getClass();
                if (ll3.P(v02Var, a) != null) {
                    b71.o();
                    return;
                } else {
                    f22Var.n = 1;
                    b(K, j5Var, f22Var);
                    return;
                }
            }
        }
        f22Var = new f22(r30Var);
        Object obj2 = f22Var.m;
        b50 b50Var2 = b50.m;
        i = f22Var.n;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(rx1 rx1Var, Function2 function2, r30 r30Var) {
        g22 g22Var;
        int i;
        if (r30Var instanceof g22) {
            g22Var = (g22) r30Var;
            int i2 = g22Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g22Var.n = i2 - Integer.MIN_VALUE;
                Object obj = g22Var.m;
                b50 b50Var = b50.m;
                i = g22Var.n;
                if (i != 0) {
                    ca2.b(obj);
                    g22Var.n = 1;
                    ((t7) rx1Var).J(function2, g22Var);
                    return;
                } else {
                    if (i == 1) {
                        ca2.b(obj);
                        throw new k81();
                    }
                    if (i != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return;
                    } else {
                        ca2.b(obj);
                        throw new k81();
                    }
                }
            }
        }
        g22Var = new g22(r30Var);
        Object obj2 = g22Var.m;
        b50 b50Var2 = b50.m;
        i = g22Var.n;
        if (i != 0) {
        }
    }
}
