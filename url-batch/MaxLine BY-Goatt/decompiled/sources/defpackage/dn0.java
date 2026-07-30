package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dn0 implements xm0 {
    public final /* synthetic */ xm0 m;
    public final /* synthetic */ xt0 n;

    public dn0(xm0 xm0Var, xt0 xt0Var) {
        this.m = xm0Var;
        this.n = xt0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if (r10.a(r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r10 = new defpackage.kx2(r9);
        r9 = r9.n;
        r0.p = r9;
        r0.q = null;
        r0.n = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (defpackage.s93.v(r10, r9, r9, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ym0 ym0Var, o30 o30Var) {
        cn0 cn0Var;
        b50 b50Var;
        int i;
        vc2 vc2Var;
        vc2 vc2Var2;
        xt0 xt0Var;
        try {
            if (o30Var instanceof cn0) {
                cn0Var = (cn0) o30Var;
                int i2 = cn0Var.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cn0Var.n = i2 - Integer.MIN_VALUE;
                    Object obj = cn0Var.m;
                    b50Var = b50.m;
                    i = cn0Var.n;
                    if (i != 0) {
                        ca2.b(obj);
                        xm0 xm0Var = this.m;
                        cn0Var.p = this;
                        cn0Var.q = ym0Var;
                        cn0Var.n = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) cn0Var.p;
                                ca2.b(obj);
                                throw th;
                            }
                            if (i != 3) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vc2Var2 = (vc2) cn0Var.p;
                            try {
                                ca2.b(obj);
                                vc2Var2.releaseIntercepted();
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                vc2Var2.releaseIntercepted();
                                throw th;
                            }
                        }
                        ym0Var = cn0Var.q;
                        this = (dn0) cn0Var.p;
                        ca2.b(obj);
                    }
                    vc2Var = new vc2(ym0Var, cn0Var.getContext());
                    xt0Var = this.n;
                    cn0Var.p = vc2Var;
                    cn0Var.q = null;
                    cn0Var.n = 3;
                    if (xt0Var.a(vc2Var, null, cn0Var) != b50Var) {
                        vc2Var2 = vc2Var;
                        vc2Var2.releaseIntercepted();
                        return Unit.a;
                    }
                    return b50Var;
                }
            }
            xt0Var = this.n;
            cn0Var.p = vc2Var;
            cn0Var.q = null;
            cn0Var.n = 3;
            if (xt0Var.a(vc2Var, null, cn0Var) != b50Var) {
            }
            return b50Var;
        } catch (Throwable th3) {
            th = th3;
            vc2Var2 = vc2Var;
            vc2Var2.releaseIntercepted();
            throw th;
        }
        cn0Var = new cn0(this, o30Var);
        Object obj2 = cn0Var.m;
        b50Var = b50.m;
        i = cn0Var.n;
        if (i != 0) {
        }
        vc2Var = new vc2(ym0Var, cn0Var.getContext());
    }
}
