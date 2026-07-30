package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v22 extends jc2 implements pe0 {
    public final /* synthetic */ Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ long r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v22(long j, oc2 oc2Var, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = j;
        this.QrzZRwfaDlRX = oc2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (defpackage.f2.gPXPFXrUH4XX(8, r13) == r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (defpackage.f2.gPXPFXrUH4XX(r8 - 8, r13) == r7) goto L16;
     */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.QrzZRwfaDlRX;
        su suVar = su.rtx2ld2ELZv4;
        long j = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ng0.tmVwIGCQF4zR(obj);
                        return no2Var;
                    }
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ng0.tmVwIGCQF4zR(obj);
                g7 g7Var = (g7) obj2;
                bf1 bf1Var = new bf1(j);
                w82 w82Var = w22.Y1f8riQaR6yg;
                this.cpQdD2nAriOS = 1;
                return g7.TSizfFm2Yiuu(g7Var, bf1Var, w82Var, null, this, 12) == suVar ? suVar : no2Var;
            default:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ng0.tmVwIGCQF4zR(obj);
                        bi biVar = ((oc2) obj2).wdg6QnbFHrFF;
                        if (biVar == null) {
                            return no2Var;
                        }
                        biVar.RAsUl2FVSrh6(new uv1(new sn1(j)));
                        return no2Var;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                this.cpQdD2nAriOS = 2;
                break;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.QrzZRwfaDlRX;
        long j = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new v22((g7) obj2, j, btVar);
            default:
                return new v22(j, (oc2) obj2, btVar);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ru ruVar = (ru) obj;
        bt btVar = (bt) obj2;
        switch (i) {
        }
        return ((v22) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v22(g7 g7Var, long j, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = g7Var;
        this.r3s1LDPKFs1S = j;
    }
}
