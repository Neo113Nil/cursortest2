package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class e90 implements v80 {
    public final /* synthetic */ lo OPXfSBeufaJ8;
    public final /* synthetic */ vi rtx2ld2ELZv4;

    public e90(vi viVar, lo loVar) {
        this.rtx2ld2ELZv4 = viVar;
        this.OPXfSBeufaJ8 = loVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0062, code lost:
    
        if (r11.PxuCJdSBwIXG(r10, r0) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r11 = new defpackage.vj2(r10);
        r10 = r10.OPXfSBeufaJ8;
        r0.r3s1LDPKFs1S = r10;
        r0.QrzZRwfaDlRX = null;
        r0.x50lh2ztY7Y5 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (defpackage.cs0.rtx2ld2ELZv4(r11, r10, r10, r0) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.v80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG(w80 w80Var, bt btVar) {
        d90 d90Var;
        int i;
        no2 no2Var;
        su suVar;
        iy1 iy1Var;
        iy1 iy1Var2;
        try {
            if (btVar instanceof d90) {
                d90Var = (d90) btVar;
                int i2 = d90Var.x50lh2ztY7Y5;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    d90Var.x50lh2ztY7Y5 = i2 - Integer.MIN_VALUE;
                    Object obj = d90Var.dgRBjINgWbAK;
                    i = d90Var.x50lh2ztY7Y5;
                    no2Var = no2.PxuCJdSBwIXG;
                    suVar = su.rtx2ld2ELZv4;
                    if (i != 0) {
                        ng0.tmVwIGCQF4zR(obj);
                        vi viVar = this.rtx2ld2ELZv4;
                        d90Var.r3s1LDPKFs1S = this;
                        d90Var.QrzZRwfaDlRX = w80Var;
                        d90Var.x50lh2ztY7Y5 = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Throwable th = (Throwable) d90Var.r3s1LDPKFs1S;
                                ng0.tmVwIGCQF4zR(obj);
                                throw th;
                            }
                            if (i != 3) {
                                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            iy1Var2 = (iy1) d90Var.r3s1LDPKFs1S;
                            try {
                                ng0.tmVwIGCQF4zR(obj);
                                iy1Var2.EcgxDIVH5in8();
                                return no2Var;
                            } catch (Throwable th2) {
                                th = th2;
                                iy1Var2.EcgxDIVH5in8();
                                throw th;
                            }
                        }
                        w80Var = d90Var.QrzZRwfaDlRX;
                        this = (e90) d90Var.r3s1LDPKFs1S;
                        ng0.tmVwIGCQF4zR(obj);
                    }
                    hu huVar = d90Var.OPXfSBeufaJ8;
                    huVar.getClass();
                    iy1Var = new iy1(w80Var, huVar);
                    lo loVar = this.OPXfSBeufaJ8;
                    d90Var.r3s1LDPKFs1S = iy1Var;
                    d90Var.QrzZRwfaDlRX = null;
                    d90Var.x50lh2ztY7Y5 = 3;
                    loVar.a92UlCVFR9N8(iy1Var, null, d90Var);
                    if (no2Var != suVar) {
                        iy1Var2 = iy1Var;
                        iy1Var2.EcgxDIVH5in8();
                        return no2Var;
                    }
                    return suVar;
                }
            }
            lo loVar2 = this.OPXfSBeufaJ8;
            d90Var.r3s1LDPKFs1S = iy1Var;
            d90Var.QrzZRwfaDlRX = null;
            d90Var.x50lh2ztY7Y5 = 3;
            loVar2.a92UlCVFR9N8(iy1Var, null, d90Var);
            if (no2Var != suVar) {
            }
            return suVar;
        } catch (Throwable th3) {
            th = th3;
            iy1Var2 = iy1Var;
            iy1Var2.EcgxDIVH5in8();
            throw th;
        }
        d90Var = new d90(this, btVar);
        Object obj2 = d90Var.dgRBjINgWbAK;
        i = d90Var.x50lh2ztY7Y5;
        no2Var = no2.PxuCJdSBwIXG;
        suVar = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        hu huVar2 = d90Var.OPXfSBeufaJ8;
        huVar2.getClass();
        iy1Var = new iy1(w80Var, huVar2);
    }
}
