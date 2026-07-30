package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class h90 extends jc2 implements qe0 {
    public /* synthetic */ Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ xe0 gPXPFXrUH4XX;
    public /* synthetic */ w80 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h90(xe0 xe0Var, bt btVar, int i) {
        super(3, btVar);
        this.x50lh2ztY7Y5 = i;
        this.gPXPFXrUH4XX = xe0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r9 == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
    
        if (r9 == r4) goto L30;
     */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        w80 w80Var;
        w80 w80Var2;
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        xe0 xe0Var = this.gPXPFXrUH4XX;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    w80Var = this.r3s1LDPKFs1S;
                    Object obj2 = this.QrzZRwfaDlRX;
                    this.r3s1LDPKFs1S = w80Var;
                    this.cpQdD2nAriOS = 1;
                    obj = ((pe0) xe0Var).rtx2ld2ELZv4(obj2, this);
                    break;
                } else if (i2 == 1) {
                    w80Var = this.r3s1LDPKFs1S;
                    ng0.tmVwIGCQF4zR(obj);
                } else if (i2 != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                this.r3s1LDPKFs1S = null;
                this.cpQdD2nAriOS = 2;
                if (w80Var.cpQdD2nAriOS(obj, this) != suVar) {
                }
                break;
            default:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    w80Var2 = this.r3s1LDPKFs1S;
                    Object[] objArr = (Object[]) this.QrzZRwfaDlRX;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.r3s1LDPKFs1S = w80Var2;
                    this.cpQdD2nAriOS = 1;
                    obj = ((qe0) xe0Var).a92UlCVFR9N8(obj3, obj4, this);
                    break;
                } else if (i3 == 1) {
                    w80Var2 = this.r3s1LDPKFs1S;
                    ng0.tmVwIGCQF4zR(obj);
                } else if (i3 != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                this.r3s1LDPKFs1S = null;
                this.cpQdD2nAriOS = 2;
                if (w80Var2.cpQdD2nAriOS(obj, this) != suVar) {
                }
                break;
        }
        return suVar;
    }

    @Override // defpackage.qe0
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        xe0 xe0Var = this.gPXPFXrUH4XX;
        w80 w80Var = (w80) obj;
        switch (i) {
            case 0:
                h90 h90Var = new h90((pe0) xe0Var, (bt) obj3, 0);
                h90Var.r3s1LDPKFs1S = w80Var;
                h90Var.QrzZRwfaDlRX = obj2;
                return h90Var.RfyTYNmI9Srp(no2Var);
            default:
                h90 h90Var2 = new h90((qe0) xe0Var, (bt) obj3, 1);
                h90Var2.r3s1LDPKFs1S = w80Var;
                h90Var2.QrzZRwfaDlRX = (Object[]) obj2;
                return h90Var2.RfyTYNmI9Srp(no2Var);
        }
    }
}
