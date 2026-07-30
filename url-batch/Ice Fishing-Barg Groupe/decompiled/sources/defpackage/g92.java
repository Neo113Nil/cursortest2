package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g92 extends jc2 implements qe0 {
    public final /* synthetic */ h92 QrzZRwfaDlRX;
    public /* synthetic */ w80 cpQdD2nAriOS;
    public /* synthetic */ int r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g92(h92 h92Var, bt btVar) {
        super(3, btVar);
        this.QrzZRwfaDlRX = h92Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007b, code lost:
    
        if (r0.cpQdD2nAriOS(defpackage.j52.wdg6QnbFHrFF, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (defpackage.f2.gPXPFXrUH4XX(Long.MAX_VALUE, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r0.cpQdD2nAriOS(defpackage.j52.OPXfSBeufaJ8, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r0.cpQdD2nAriOS(defpackage.j52.rtx2ld2ELZv4, r8) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        if (defpackage.f2.gPXPFXrUH4XX(0, r8) == r7) goto L32;
     */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        w80 w80Var;
        int i = this.x50lh2ztY7Y5;
        su suVar = su.rtx2ld2ELZv4;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            w80Var = this.cpQdD2nAriOS;
            if (this.r3s1LDPKFs1S > 0) {
                this.x50lh2ztY7Y5 = 1;
            } else {
                this.cpQdD2nAriOS = w80Var;
                this.x50lh2ztY7Y5 = 2;
            }
            return suVar;
        }
        if (i != 1) {
            if (i == 2) {
                w80Var = this.cpQdD2nAriOS;
                ng0.tmVwIGCQF4zR(obj);
                this.cpQdD2nAriOS = w80Var;
                this.x50lh2ztY7Y5 = 3;
            } else if (i == 3) {
                w80Var = this.cpQdD2nAriOS;
                ng0.tmVwIGCQF4zR(obj);
                this.cpQdD2nAriOS = w80Var;
                this.x50lh2ztY7Y5 = 4;
            } else if (i == 4) {
                w80Var = this.cpQdD2nAriOS;
                ng0.tmVwIGCQF4zR(obj);
                this.cpQdD2nAriOS = null;
                this.x50lh2ztY7Y5 = 5;
            } else if (i != 5) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        ng0.tmVwIGCQF4zR(obj);
        return no2.PxuCJdSBwIXG;
    }

    @Override // defpackage.qe0
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        g92 g92Var = new g92(this.QrzZRwfaDlRX, (bt) obj3);
        g92Var.cpQdD2nAriOS = (w80) obj;
        g92Var.r3s1LDPKFs1S = intValue;
        return g92Var.RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
