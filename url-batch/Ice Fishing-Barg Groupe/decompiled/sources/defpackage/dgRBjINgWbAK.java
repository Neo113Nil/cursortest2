package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dgRBjINgWbAK extends jc2 implements pe0 {
    public final /* synthetic */ wp1 QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ kk gPXPFXrUH4XX;
    public final /* synthetic */ e81 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dgRBjINgWbAK(e81 e81Var, wp1 wp1Var, kk kkVar, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.r3s1LDPKFs1S = e81Var;
        this.QrzZRwfaDlRX = wp1Var;
        this.gPXPFXrUH4XX = kkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r3.PxuCJdSBwIXG(r9, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (defpackage.f2.gPXPFXrUH4XX(r4, r10) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r3.PxuCJdSBwIXG(r9, r10) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
    
        if (defpackage.f2.gPXPFXrUH4XX(r4, r10) == r6) goto L31;
     */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        kk kkVar = this.gPXPFXrUH4XX;
        e81 e81Var = this.r3s1LDPKFs1S;
        su suVar = su.rtx2ld2ELZv4;
        wp1 wp1Var = this.QrzZRwfaDlRX;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    long j = lk.PxuCJdSBwIXG;
                    this.cpQdD2nAriOS = 1;
                    break;
                } else if (i2 == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                } else if (i2 != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    kkVar.nLZGh9p8gVSu = wp1Var;
                    break;
                }
                this.cpQdD2nAriOS = 2;
                break;
            default:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    long j2 = lk.PxuCJdSBwIXG;
                    this.cpQdD2nAriOS = 1;
                    break;
                } else if (i3 == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                } else if (i3 != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    kkVar.tmVwIGCQF4zR = wp1Var;
                    break;
                }
                this.cpQdD2nAriOS = 2;
                break;
        }
        return no2Var;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        switch (this.x50lh2ztY7Y5) {
            case 0:
                return new dgRBjINgWbAK(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, btVar, 0);
            default:
                return new dgRBjINgWbAK(this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, btVar, 1);
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
        return ((dgRBjINgWbAK) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }
}
