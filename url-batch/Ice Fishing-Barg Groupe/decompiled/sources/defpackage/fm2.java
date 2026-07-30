package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fm2 extends jc2 implements pe0 {
    public int BRwzKIf41E4i;
    public final /* synthetic */ gm2 EcgxDIVH5in8;
    public int QrzZRwfaDlRX;
    public final /* synthetic */ te1[] RfyTYNmI9Srp;
    public final /* synthetic */ tk2 S9EYkSpbGuxq;
    public int XL4ISE6Oc65B;
    public gm2 cpQdD2nAriOS;
    public int gPXPFXrUH4XX;
    public tk2 r3s1LDPKFs1S;
    public te1[] x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm2(te1[] te1VarArr, gm2 gm2Var, tk2 tk2Var, bt btVar) {
        super(2, btVar);
        this.RfyTYNmI9Srp = te1VarArr;
        this.EcgxDIVH5in8 = gm2Var;
        this.S9EYkSpbGuxq = tk2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (defpackage.gm2.TSizfFm2Yiuu(r7, r6, r12, r11) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:10:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        int length;
        int i;
        tk2 tk2Var;
        te1[] te1VarArr;
        int i2;
        gm2 gm2Var;
        int i3 = this.XL4ISE6Oc65B;
        if (i3 == 0) {
            ng0.tmVwIGCQF4zR(obj);
            te1[] te1VarArr2 = this.RfyTYNmI9Srp;
            length = te1VarArr2.length;
            i = 0;
            gm2 gm2Var2 = this.EcgxDIVH5in8;
            tk2Var = this.S9EYkSpbGuxq;
            te1VarArr = te1VarArr2;
            i2 = 0;
            gm2Var = gm2Var2;
            if (i >= length) {
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.BRwzKIf41E4i;
            i = this.gPXPFXrUH4XX;
            int i4 = this.QrzZRwfaDlRX;
            tk2Var = this.r3s1LDPKFs1S;
            gm2Var = this.cpQdD2nAriOS;
            te1VarArr = this.x50lh2ztY7Y5;
            ng0.tmVwIGCQF4zR(obj);
            i2 = i4;
            i++;
            if (i >= length) {
                int i5 = i2 + 1;
                int ordinal = te1VarArr[i].ordinal();
                if (ordinal != 0) {
                    su suVar = su.rtx2ld2ELZv4;
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            u9.gPXPFXrUH4XX();
                            return null;
                        }
                        this.x50lh2ztY7Y5 = te1VarArr;
                        this.cpQdD2nAriOS = gm2Var;
                        this.r3s1LDPKFs1S = tk2Var;
                        this.QrzZRwfaDlRX = i5;
                        this.gPXPFXrUH4XX = i;
                        this.BRwzKIf41E4i = length;
                        this.XL4ISE6Oc65B = 2;
                        if (gm2.Y1f8riQaR6yg(gm2Var, tk2Var, i2, this) != suVar) {
                            i4 = i5;
                            i2 = i4;
                        }
                        return suVar;
                    }
                    this.x50lh2ztY7Y5 = te1VarArr;
                    this.cpQdD2nAriOS = gm2Var;
                    this.r3s1LDPKFs1S = tk2Var;
                    this.QrzZRwfaDlRX = i5;
                    this.gPXPFXrUH4XX = i;
                    this.BRwzKIf41E4i = length;
                    this.XL4ISE6Oc65B = 1;
                    i++;
                    if (i >= length) {
                        return no2.PxuCJdSBwIXG;
                    }
                } else {
                    i2 = i5;
                    i++;
                    if (i >= length) {
                    }
                }
            }
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        return new fm2(this.RfyTYNmI9Srp, this.EcgxDIVH5in8, this.S9EYkSpbGuxq, btVar);
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return ((fm2) gPXPFXrUH4XX((bt) obj2, (qj1) obj)).RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
