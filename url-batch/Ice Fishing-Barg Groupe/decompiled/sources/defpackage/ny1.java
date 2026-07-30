package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ny1 implements v80 {
    public final pe0 rtx2ld2ELZv4;

    public ny1(pe0 pe0Var) {
        this.rtx2ld2ELZv4 = pe0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.v80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG(w80 w80Var, bt btVar) {
        VhhvGxCb8gfr vhhvGxCb8gfr;
        int i;
        iy1 iy1Var;
        if (btVar instanceof VhhvGxCb8gfr) {
            vhhvGxCb8gfr = (VhhvGxCb8gfr) btVar;
            int i2 = vhhvGxCb8gfr.r3s1LDPKFs1S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vhhvGxCb8gfr.r3s1LDPKFs1S = i2 - Integer.MIN_VALUE;
                Object obj = vhhvGxCb8gfr.x50lh2ztY7Y5;
                i = vhhvGxCb8gfr.r3s1LDPKFs1S;
                no2 no2Var = no2.PxuCJdSBwIXG;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    hu huVar = vhhvGxCb8gfr.OPXfSBeufaJ8;
                    huVar.getClass();
                    iy1 iy1Var2 = new iy1(w80Var, huVar);
                    try {
                        vhhvGxCb8gfr.dgRBjINgWbAK = iy1Var2;
                        vhhvGxCb8gfr.r3s1LDPKFs1S = 1;
                        try {
                            Object rtx2ld2ELZv4 = this.rtx2ld2ELZv4.rtx2ld2ELZv4(iy1Var2, vhhvGxCb8gfr);
                            su suVar = su.rtx2ld2ELZv4;
                            if (rtx2ld2ELZv4 != suVar) {
                                rtx2ld2ELZv4 = no2Var;
                            }
                            if (rtx2ld2ELZv4 == suVar) {
                                return suVar;
                            }
                            iy1Var = iy1Var2;
                        } catch (Throwable th) {
                            th = th;
                            iy1Var = iy1Var2;
                            iy1Var.EcgxDIVH5in8();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iy1Var = vhhvGxCb8gfr.dgRBjINgWbAK;
                    try {
                        ng0.tmVwIGCQF4zR(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        iy1Var.EcgxDIVH5in8();
                        throw th;
                    }
                }
                iy1Var.EcgxDIVH5in8();
                return no2Var;
            }
        }
        vhhvGxCb8gfr = new VhhvGxCb8gfr(this, btVar);
        Object obj2 = vhhvGxCb8gfr.x50lh2ztY7Y5;
        i = vhhvGxCb8gfr.r3s1LDPKFs1S;
        no2 no2Var2 = no2.PxuCJdSBwIXG;
        if (i != 0) {
        }
        iy1Var.EcgxDIVH5in8();
        return no2Var2;
    }
}
