package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s20 extends jc2 implements pe0 {
    public final /* synthetic */ t20 BRwzKIf41E4i;
    public int QrzZRwfaDlRX;
    public zt1 cpQdD2nAriOS;
    public /* synthetic */ Object gPXPFXrUH4XX;
    public zt1 r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s20(zt1 zt1Var, t20 t20Var, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = zt1Var;
        this.BRwzKIf41E4i = t20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r5.TVHukqbqS4tB(r9, r8) != r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        if (defpackage.t20.Yadk4uqlxLy8(r5, r8) == r4) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e7, code lost:
    
        if (defpackage.t20.Yadk4uqlxLy8(r5, r8) != r4) goto L12;
     */
    /* JADX WARN: Path cross not found for [B:32:0x00ca, B:29:0x00b8], limit reached: 87 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0089 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c5 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cc -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d9 -> B:10:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e7 -> B:9:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0133 -> B:60:0x0134). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0137 -> B:61:0x0139). Please report as a decompilation issue!!! */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        le0 le0Var;
        Object obj2;
        ru ruVar;
        zt1 zt1Var;
        zt1 zt1Var2;
        zt1 zt1Var3;
        ru ruVar2;
        ru ruVar3;
        f20 f20Var;
        Object obj3;
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        t20 t20Var = this.BRwzKIf41E4i;
        switch (i) {
            case 0:
                zt1 zt1Var4 = this.r3s1LDPKFs1S;
                int i2 = this.QrzZRwfaDlRX;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    le0Var = (le0) this.gPXPFXrUH4XX;
                    obj2 = zt1Var4.rtx2ld2ELZv4;
                    if (obj2 instanceof e20) {
                    }
                } else {
                    if (i2 != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zt1 zt1Var5 = this.cpQdD2nAriOS;
                    le0Var = (le0) this.gPXPFXrUH4XX;
                    ng0.tmVwIGCQF4zR(obj);
                    f20 f20Var2 = (f20) obj;
                    zt1Var5.rtx2ld2ELZv4 = f20Var2;
                    obj2 = zt1Var4.rtx2ld2ELZv4;
                    if ((obj2 instanceof e20) && !(obj2 instanceof b20)) {
                        c20 c20Var = obj2 instanceof c20 ? (c20) obj2 : null;
                        if (c20Var != null) {
                            le0Var.OPXfSBeufaJ8(c20Var);
                        }
                        eg egVar = t20Var.aF05bpZJlKEP;
                        if (egVar != null) {
                            this.gPXPFXrUH4XX = le0Var;
                            this.cpQdD2nAriOS = zt1Var4;
                            this.QrzZRwfaDlRX = 1;
                            obj = eg.BjEWd04qc7Mw(egVar, this);
                            if (obj == suVar) {
                                return suVar;
                            }
                            zt1Var5 = zt1Var4;
                            f20 f20Var22 = (f20) obj;
                            zt1Var5.rtx2ld2ELZv4 = f20Var22;
                            obj2 = zt1Var4.rtx2ld2ELZv4;
                            return obj2 instanceof e20 ? no2Var : no2Var;
                        }
                        zt1Var5 = zt1Var4;
                        f20Var22 = null;
                        zt1Var5.rtx2ld2ELZv4 = f20Var22;
                        obj2 = zt1Var4.rtx2ld2ELZv4;
                        if (obj2 instanceof e20) {
                        }
                    }
                }
            default:
                switch (this.QrzZRwfaDlRX) {
                    case 0:
                        ng0.tmVwIGCQF4zR(obj);
                        ruVar = (ru) this.gPXPFXrUH4XX;
                        if (cs0.jyegZNwi31qc(ruVar)) {
                            zt1Var = new zt1();
                            eg egVar2 = t20Var.aF05bpZJlKEP;
                            if (egVar2 != null) {
                                this.gPXPFXrUH4XX = ruVar;
                                this.cpQdD2nAriOS = zt1Var;
                                this.r3s1LDPKFs1S = zt1Var;
                                this.QrzZRwfaDlRX = 1;
                                obj = eg.BjEWd04qc7Mw(egVar2, this);
                                if (obj != suVar) {
                                    zt1Var2 = zt1Var;
                                    f20Var = (f20) obj;
                                    zt1Var.rtx2ld2ELZv4 = f20Var;
                                    obj3 = zt1Var2.rtx2ld2ELZv4;
                                    if (obj3 instanceof d20) {
                                        this.gPXPFXrUH4XX = ruVar;
                                        this.cpQdD2nAriOS = zt1Var2;
                                        this.r3s1LDPKFs1S = null;
                                        this.QrzZRwfaDlRX = 2;
                                        if (t20.MDTGUQSX7PXD(t20Var, (d20) obj3, this) != suVar) {
                                            zt1Var3 = zt1Var2;
                                            ruVar2 = ruVar;
                                            s20 s20Var = new s20(zt1Var3, t20Var, null);
                                            this.gPXPFXrUH4XX = ruVar2;
                                            this.cpQdD2nAriOS = zt1Var3;
                                            this.QrzZRwfaDlRX = 3;
                                            break;
                                        }
                                    }
                                    if (cs0.jyegZNwi31qc(ruVar)) {
                                        return no2Var;
                                    }
                                }
                                return suVar;
                            }
                            zt1Var2 = zt1Var;
                            f20Var = null;
                            zt1Var.rtx2ld2ELZv4 = f20Var;
                            obj3 = zt1Var2.rtx2ld2ELZv4;
                            if (obj3 instanceof d20) {
                            }
                            if (cs0.jyegZNwi31qc(ruVar)) {
                            }
                        }
                    case 1:
                        zt1Var = this.r3s1LDPKFs1S;
                        zt1Var2 = this.cpQdD2nAriOS;
                        ruVar = (ru) this.gPXPFXrUH4XX;
                        ng0.tmVwIGCQF4zR(obj);
                        f20Var = (f20) obj;
                        zt1Var.rtx2ld2ELZv4 = f20Var;
                        obj3 = zt1Var2.rtx2ld2ELZv4;
                        if (obj3 instanceof d20) {
                        }
                        if (cs0.jyegZNwi31qc(ruVar)) {
                        }
                        break;
                    case 2:
                        zt1Var3 = this.cpQdD2nAriOS;
                        ruVar2 = (ru) this.gPXPFXrUH4XX;
                        ng0.tmVwIGCQF4zR(obj);
                        s20 s20Var2 = new s20(zt1Var3, t20Var, null);
                        this.gPXPFXrUH4XX = ruVar2;
                        this.cpQdD2nAriOS = zt1Var3;
                        this.QrzZRwfaDlRX = 3;
                        break;
                    case 3:
                        zt1Var3 = this.cpQdD2nAriOS;
                        ruVar2 = (ru) this.gPXPFXrUH4XX;
                        try {
                            ng0.tmVwIGCQF4zR(obj);
                        } catch (CancellationException unused) {
                            ruVar3 = ruVar2;
                            this.gPXPFXrUH4XX = ruVar3;
                            this.cpQdD2nAriOS = null;
                            this.QrzZRwfaDlRX = 6;
                            break;
                        }
                        ruVar = ruVar2;
                        try {
                        } catch (CancellationException unused2) {
                            ruVar3 = ruVar;
                            this.gPXPFXrUH4XX = ruVar3;
                            this.cpQdD2nAriOS = null;
                            this.QrzZRwfaDlRX = 6;
                        }
                        Object obj4 = zt1Var3.rtx2ld2ELZv4;
                        if (obj4 instanceof e20) {
                            this.gPXPFXrUH4XX = ruVar;
                            this.cpQdD2nAriOS = null;
                            this.QrzZRwfaDlRX = 4;
                            if (t20.FT2GK7JK5Ma2(t20Var, (e20) obj4, this) == suVar) {
                                return suVar;
                            }
                            if (cs0.jyegZNwi31qc(ruVar)) {
                            }
                        } else {
                            if (obj4 instanceof b20) {
                                this.gPXPFXrUH4XX = ruVar;
                                this.cpQdD2nAriOS = null;
                                this.QrzZRwfaDlRX = 5;
                                break;
                            }
                            if (cs0.jyegZNwi31qc(ruVar)) {
                            }
                        }
                        break;
                    case 4:
                        ruVar3 = (ru) this.gPXPFXrUH4XX;
                        try {
                            ng0.tmVwIGCQF4zR(obj);
                        } catch (CancellationException unused3) {
                            this.gPXPFXrUH4XX = ruVar3;
                            this.cpQdD2nAriOS = null;
                            this.QrzZRwfaDlRX = 6;
                            break;
                        }
                        ruVar = ruVar3;
                        if (cs0.jyegZNwi31qc(ruVar)) {
                        }
                        break;
                    case 5:
                        ruVar3 = (ru) this.gPXPFXrUH4XX;
                        ng0.tmVwIGCQF4zR(obj);
                        ruVar = ruVar3;
                        if (cs0.jyegZNwi31qc(ruVar)) {
                        }
                        break;
                    case 6:
                        ruVar3 = (ru) this.gPXPFXrUH4XX;
                        ng0.tmVwIGCQF4zR(obj);
                        ruVar = ruVar3;
                        if (cs0.jyegZNwi31qc(ruVar)) {
                        }
                        break;
                    default:
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        t20 t20Var = this.BRwzKIf41E4i;
        switch (i) {
            case 0:
                s20 s20Var = new s20(this.r3s1LDPKFs1S, t20Var, btVar);
                s20Var.gPXPFXrUH4XX = obj;
                return s20Var;
            default:
                s20 s20Var2 = new s20(t20Var, btVar);
                s20Var2.gPXPFXrUH4XX = obj;
                return s20Var2;
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                return ((s20) gPXPFXrUH4XX((bt) obj2, (le0) obj)).RfyTYNmI9Srp(no2Var);
            default:
                return ((s20) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s20(t20 t20Var, bt btVar) {
        super(2, btVar);
        this.BRwzKIf41E4i = t20Var;
    }
}
