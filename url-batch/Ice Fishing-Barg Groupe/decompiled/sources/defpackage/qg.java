package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qg extends jc2 implements pe0 {
    public final /* synthetic */ kr0 BRwzKIf41E4i;
    public final /* synthetic */ boolean QrzZRwfaDlRX;
    public final /* synthetic */ g7 cpQdD2nAriOS;
    public final /* synthetic */ rg gPXPFXrUH4XX;
    public final /* synthetic */ float r3s1LDPKFs1S;
    public int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(g7 g7Var, float f, boolean z, rg rgVar, kr0 kr0Var, bt btVar) {
        super(2, btVar);
        this.cpQdD2nAriOS = g7Var;
        this.r3s1LDPKFs1S = f;
        this.QrzZRwfaDlRX = z;
        this.gPXPFXrUH4XX = rgVar;
        this.BRwzKIf41E4i = kr0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
    
        if ((r0 instanceof defpackage.ia0) != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc A[RETURN] */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        kr0 jk0Var;
        Object e9gEMXR7LXtO;
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        km2 km2Var = null;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            g7 g7Var = this.cpQdD2nAriOS;
            float f = ((k10) g7Var.e9gEMXR7LXtO.getValue()).rtx2ld2ELZv4;
            float f2 = this.r3s1LDPKFs1S;
            if (!k10.lS5Rgt96tfkO(f, f2)) {
                boolean z = this.QrzZRwfaDlRX;
                su suVar = su.rtx2ld2ELZv4;
                if (z) {
                    float f3 = ((k10) g7Var.e9gEMXR7LXtO.getValue()).rtx2ld2ELZv4;
                    if (k10.lS5Rgt96tfkO(f3, 0.0f)) {
                        bf1.Companion.getClass();
                        jk0Var = new wp1(0L);
                    } else {
                        jk0Var = k10.lS5Rgt96tfkO(f3, this.gPXPFXrUH4XX.PxuCJdSBwIXG) ? new jk0() : k10.lS5Rgt96tfkO(f3, 0.0f) ? new ia0() : null;
                    }
                    this.x50lh2ztY7Y5 = 2;
                    km2 km2Var2 = s40.lS5Rgt96tfkO;
                    km2 km2Var3 = s40.PxuCJdSBwIXG;
                    kr0 kr0Var = this.BRwzKIf41E4i;
                    if (kr0Var != null) {
                        if ((kr0Var instanceof wp1) || (kr0Var instanceof v20) || (kr0Var instanceof jk0) || (kr0Var instanceof ia0)) {
                            km2Var = km2Var3;
                        }
                    } else if (jk0Var != null) {
                        if (!(jk0Var instanceof wp1) && !(jk0Var instanceof v20)) {
                            if (jk0Var instanceof jk0) {
                                km2Var = s40.TSizfFm2Yiuu;
                            }
                        }
                        km2Var = km2Var2;
                    }
                    if (km2Var == null ? (e9gEMXR7LXtO = g7Var.e9gEMXR7LXtO(this, new k10(f2))) != suVar : (e9gEMXR7LXtO = g7.TSizfFm2Yiuu(g7Var, new k10(f2), km2Var, null, this, 12)) != suVar) {
                        e9gEMXR7LXtO = no2Var;
                    }
                    if (e9gEMXR7LXtO == suVar) {
                    }
                } else {
                    k10 k10Var = new k10(f2);
                    this.x50lh2ztY7Y5 = 1;
                    if (g7Var.e9gEMXR7LXtO(this, k10Var) == suVar) {
                        return suVar;
                    }
                }
            }
        } else {
            if (i != 1 && i != 2) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ng0.tmVwIGCQF4zR(obj);
        }
        return no2Var;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new qg(this.cpQdD2nAriOS, this.r3s1LDPKFs1S, this.QrzZRwfaDlRX, this.gPXPFXrUH4XX, this.BRwzKIf41E4i, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((qg) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
