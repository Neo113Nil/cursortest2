package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class a82 extends jc2 implements pe0 {
    public final /* synthetic */ pe0 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ d91 gPXPFXrUH4XX;
    public /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a82(pe0 pe0Var, d91 d91Var, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.QrzZRwfaDlRX = pe0Var;
        this.gPXPFXrUH4XX = d91Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        d91 d91Var = this.gPXPFXrUH4XX;
        pe0 pe0Var = this.QrzZRwfaDlRX;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    pq1 pq1Var = new pq1(d91Var, ((ru) this.r3s1LDPKFs1S).cpQdD2nAriOS());
                    this.cpQdD2nAriOS = 1;
                    if (pe0Var.rtx2ld2ELZv4(pq1Var, this) == suVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    pq1 pq1Var2 = new pq1(d91Var, ((ru) this.r3s1LDPKFs1S).cpQdD2nAriOS());
                    this.cpQdD2nAriOS = 1;
                    if (pe0Var.rtx2ld2ELZv4(pq1Var2, this) == suVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
            default:
                int i4 = this.cpQdD2nAriOS;
                if (i4 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    pq1 pq1Var3 = new pq1(d91Var, ((ru) this.r3s1LDPKFs1S).cpQdD2nAriOS());
                    this.cpQdD2nAriOS = 1;
                    if (pe0Var.rtx2ld2ELZv4(pq1Var3, this) == suVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                break;
        }
        return suVar;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                a82 a82Var = new a82(this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, btVar, 0);
                a82Var.r3s1LDPKFs1S = obj;
                return a82Var;
            case 1:
                a82 a82Var2 = new a82(this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, btVar, 1);
                a82Var2.r3s1LDPKFs1S = obj;
                return a82Var2;
            default:
                a82 a82Var3 = new a82(this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, btVar, 2);
                a82Var3.r3s1LDPKFs1S = obj;
                return a82Var3;
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
        return ((a82) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
