package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class wg2 extends jc2 implements le0 {
    public final /* synthetic */ eh2 cpQdD2nAriOS;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(eh2 eh2Var, bt btVar) {
        super(1, btVar);
        this.cpQdD2nAriOS = eh2Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        return new wg2(this.cpQdD2nAriOS, (bt) obj).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r13 == r6) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0028, code lost:
    
        if (r5.S9EYkSpbGuxq(r13) == r6) goto L28;
     */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        Object obj2;
        int i = this.x50lh2ztY7Y5;
        bt btVar = null;
        no2 no2Var = no2.PxuCJdSBwIXG;
        eh2 eh2Var = this.cpQdD2nAriOS;
        su suVar = su.rtx2ld2ELZv4;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            this.x50lh2ztY7Y5 = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ng0.tmVwIGCQF4zR(obj);
                eh2Var.e6tOsSdd2EFb = true;
                return no2Var;
            }
            ng0.tmVwIGCQF4zR(obj);
        }
        vi1 PxuCJdSBwIXG = eh2.PxuCJdSBwIXG(eh2Var);
        if (PxuCJdSBwIXG != null) {
            String str = (String) PxuCJdSBwIXG.rtx2ld2ELZv4;
            long j = ((vi2) PxuCJdSBwIXG.OPXfSBeufaJ8).PxuCJdSBwIXG;
            cn1 cn1Var = eh2Var.OPXfSBeufaJ8;
            if (cn1Var != null) {
                this.x50lh2ztY7Y5 = 2;
                if (str.length() == 0 || vi2.TSizfFm2Yiuu(j)) {
                    obj2 = no2Var;
                } else {
                    obj2 = fx1.OYiFbU3x63rc(cn1Var.PxuCJdSBwIXG, new e4(cn1Var, new OPXfSBeufaJ8(j, null, cn1Var, str), btVar, 7), this);
                }
                if (obj2 != suVar) {
                    obj2 = no2Var;
                }
            }
        }
        eh2Var.e6tOsSdd2EFb = true;
        return no2Var;
    }
}
