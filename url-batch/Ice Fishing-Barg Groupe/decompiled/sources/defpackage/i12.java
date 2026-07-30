package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i12 extends jc2 implements pe0 {
    public final /* synthetic */ l12 BRwzKIf41E4i;
    public int QrzZRwfaDlRX;
    public final /* synthetic */ long RfyTYNmI9Srp;
    public final /* synthetic */ yt1 XL4ISE6Oc65B;
    public yt1 cpQdD2nAriOS;
    public /* synthetic */ Object gPXPFXrUH4XX;
    public long r3s1LDPKFs1S;
    public l12 x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i12(l12 l12Var, yt1 yt1Var, long j, bt btVar) {
        super(2, btVar);
        this.BRwzKIf41E4i = l12Var;
        this.XL4ISE6Oc65B = yt1Var;
        this.RfyTYNmI9Srp = j;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        l12 l12Var;
        yt1 yt1Var;
        l12 l12Var2;
        long j;
        int i = this.QrzZRwfaDlRX;
        th1 th1Var = th1.OPXfSBeufaJ8;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            j12 j12Var = (j12) this.gPXPFXrUH4XX;
            l12Var = this.BRwzKIf41E4i;
            h12 h12Var = new h12(l12Var, j12Var);
            lw lwVar = l12Var.TSizfFm2Yiuu;
            yt1Var = this.XL4ISE6Oc65B;
            long j2 = yt1Var.rtx2ld2ELZv4;
            th1 th1Var2 = l12Var.Y1f8riQaR6yg;
            long j3 = this.RfyTYNmI9Srp;
            float Y1f8riQaR6yg = l12Var.Y1f8riQaR6yg(th1Var2 == th1Var ? yp2.lS5Rgt96tfkO(j3) : yp2.TSizfFm2Yiuu(j3));
            this.gPXPFXrUH4XX = l12Var;
            this.x50lh2ztY7Y5 = l12Var;
            this.cpQdD2nAriOS = yt1Var;
            this.r3s1LDPKFs1S = j2;
            this.QrzZRwfaDlRX = 1;
            lwVar.getClass();
            obj = fx1.OYiFbU3x63rc(lwVar.lS5Rgt96tfkO, new kw(Y1f8riQaR6yg, lwVar, h12Var, null), this);
            su suVar = su.rtx2ld2ELZv4;
            if (obj == suVar) {
                return suVar;
            }
            l12Var2 = l12Var;
            j = j2;
        } else {
            if (i != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.r3s1LDPKFs1S;
            yt1Var = this.cpQdD2nAriOS;
            l12Var = this.x50lh2ztY7Y5;
            l12Var2 = (l12) this.gPXPFXrUH4XX;
            ng0.tmVwIGCQF4zR(obj);
        }
        float Y1f8riQaR6yg2 = l12Var2.Y1f8riQaR6yg(((Number) obj).floatValue());
        yt1Var.rtx2ld2ELZv4 = l12Var.Y1f8riQaR6yg == th1Var ? yp2.PxuCJdSBwIXG(j, Y1f8riQaR6yg2, 0.0f, 2) : yp2.PxuCJdSBwIXG(j, 0.0f, Y1f8riQaR6yg2, 1);
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        i12 i12Var = new i12(this.BRwzKIf41E4i, this.XL4ISE6Oc65B, this.RfyTYNmI9Srp, btVar);
        i12Var.gPXPFXrUH4XX = obj;
        return i12Var;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((i12) gPXPFXrUH4XX((bt) obj2, (j12) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
