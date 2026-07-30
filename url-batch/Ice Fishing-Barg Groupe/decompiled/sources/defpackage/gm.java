package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gm implements w80 {
    public final /* synthetic */ int OPXfSBeufaJ8;
    public final /* synthetic */ eg rtx2ld2ELZv4;

    public gm(eg egVar, int i) {
        this.rtx2ld2ELZv4 = egVar;
        this.OPXfSBeufaJ8 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (defpackage.xi0.JHNfcAUfKc4G(r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r5.rtx2ld2ELZv4.PxuCJdSBwIXG(r0, r7) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.w80
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cpQdD2nAriOS(Object obj, bt btVar) {
        fm fmVar;
        int i;
        if (btVar instanceof fm) {
            fmVar = (fm) btVar;
            int i2 = fmVar.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fmVar.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                Object obj2 = fmVar.dgRBjINgWbAK;
                i = fmVar.cpQdD2nAriOS;
                su suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj2);
                    tn0 tn0Var = new tn0(this.OPXfSBeufaJ8, obj);
                    fmVar.cpQdD2nAriOS = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ng0.tmVwIGCQF4zR(obj2);
                            return no2.PxuCJdSBwIXG;
                        }
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj2);
                }
                fmVar.cpQdD2nAriOS = 2;
            }
        }
        fmVar = new fm(this, btVar);
        Object obj22 = fmVar.dgRBjINgWbAK;
        i = fmVar.cpQdD2nAriOS;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        fmVar.cpQdD2nAriOS = 2;
    }
}
