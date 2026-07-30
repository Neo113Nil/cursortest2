package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ty0 extends jc2 implements pe0 {
    public final /* synthetic */ uy0 cpQdD2nAriOS;
    public final /* synthetic */ int r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(uy0 uy0Var, int i, bt btVar) {
        super(2, btVar);
        this.cpQdD2nAriOS = uy0Var;
        this.r3s1LDPKFs1S = i;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        bt btVar = null;
        no2 no2Var = no2.PxuCJdSBwIXG;
        if (i != 0) {
            if (i == 1) {
                ng0.tmVwIGCQF4zR(obj);
                return no2Var;
            }
            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ng0.tmVwIGCQF4zR(obj);
        py0 py0Var = this.cpQdD2nAriOS.S2OOm9zPNm0h;
        this.x50lh2ztY7Y5 = 1;
        jz0 jz0Var = py0Var.lS5Rgt96tfkO;
        gz0 gz0Var = jz0.Companion;
        jz0Var.getClass();
        Object Y1f8riQaR6yg = jz0Var.Y1f8riQaR6yg(h91.rtx2ld2ELZv4, new ew(jz0Var, this.r3s1LDPKFs1S, btVar, 7), this);
        su suVar = su.rtx2ld2ELZv4;
        if (Y1f8riQaR6yg != suVar) {
            Y1f8riQaR6yg = no2Var;
        }
        if (Y1f8riQaR6yg != suVar) {
            Y1f8riQaR6yg = no2Var;
        }
        return Y1f8riQaR6yg == suVar ? suVar : no2Var;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new ty0(this.cpQdD2nAriOS, this.r3s1LDPKFs1S, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((ty0) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
