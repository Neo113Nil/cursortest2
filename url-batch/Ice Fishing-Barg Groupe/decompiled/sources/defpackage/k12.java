package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class k12 extends jc2 implements pe0 {
    public final /* synthetic */ l12 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public /* synthetic */ long r3s1LDPKFs1S;
    public long x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k12(l12 l12Var, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = l12Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.cpQdD2nAriOS;
        l12 l12Var = this.QrzZRwfaDlRX;
        su suVar = su.rtx2ld2ELZv4;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            j = this.r3s1LDPKFs1S;
            e0 e0Var = l12Var.a92UlCVFR9N8;
            this.r3s1LDPKFs1S = j;
            this.cpQdD2nAriOS = 1;
            obj = e0Var.e9gEMXR7LXtO(j, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = this.x50lh2ztY7Y5;
                    j3 = this.r3s1LDPKFs1S;
                    ng0.tmVwIGCQF4zR(obj);
                    return new yp2(yp2.Y1f8riQaR6yg(j3, yp2.Y1f8riQaR6yg(j4, ((yp2) obj).PxuCJdSBwIXG)));
                }
                j2 = this.x50lh2ztY7Y5;
                j = this.r3s1LDPKFs1S;
                ng0.tmVwIGCQF4zR(obj);
                long j5 = ((yp2) obj).PxuCJdSBwIXG;
                e0 e0Var2 = l12Var.a92UlCVFR9N8;
                long Y1f8riQaR6yg = yp2.Y1f8riQaR6yg(j2, j5);
                this.r3s1LDPKFs1S = j;
                this.x50lh2ztY7Y5 = j5;
                this.cpQdD2nAriOS = 3;
                obj = e0Var2.Y1f8riQaR6yg(Y1f8riQaR6yg, j5, this);
                if (obj != suVar) {
                    j3 = j;
                    j4 = j5;
                    return new yp2(yp2.Y1f8riQaR6yg(j3, yp2.Y1f8riQaR6yg(j4, ((yp2) obj).PxuCJdSBwIXG)));
                }
                return suVar;
            }
            j = this.r3s1LDPKFs1S;
            ng0.tmVwIGCQF4zR(obj);
        }
        long Y1f8riQaR6yg2 = yp2.Y1f8riQaR6yg(j, ((yp2) obj).PxuCJdSBwIXG);
        this.r3s1LDPKFs1S = j;
        this.x50lh2ztY7Y5 = Y1f8riQaR6yg2;
        this.cpQdD2nAriOS = 2;
        obj = l12Var.PxuCJdSBwIXG(Y1f8riQaR6yg2, this);
        if (obj != suVar) {
            j2 = Y1f8riQaR6yg2;
            long j52 = ((yp2) obj).PxuCJdSBwIXG;
            e0 e0Var22 = l12Var.a92UlCVFR9N8;
            long Y1f8riQaR6yg3 = yp2.Y1f8riQaR6yg(j2, j52);
            this.r3s1LDPKFs1S = j;
            this.x50lh2ztY7Y5 = j52;
            this.cpQdD2nAriOS = 3;
            obj = e0Var22.Y1f8riQaR6yg(Y1f8riQaR6yg3, j52, this);
            if (obj != suVar) {
            }
        }
        return suVar;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        k12 k12Var = new k12(this.QrzZRwfaDlRX, btVar);
        k12Var.r3s1LDPKFs1S = ((yp2) obj).PxuCJdSBwIXG;
        return k12Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        long j = ((yp2) obj).PxuCJdSBwIXG;
        k12 k12Var = new k12(this.QrzZRwfaDlRX, (bt) obj2);
        k12Var.r3s1LDPKFs1S = j;
        return k12Var.RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
