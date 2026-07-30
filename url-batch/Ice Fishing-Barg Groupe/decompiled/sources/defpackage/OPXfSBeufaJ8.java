package defpackage;

import android.view.textclassifier.TextClassifier;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class OPXfSBeufaJ8 extends jc2 implements pe0 {
    public final /* synthetic */ Object BRwzKIf41E4i;
    public Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ Object gPXPFXrUH4XX;
    public final /* synthetic */ long r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OPXfSBeufaJ8(ve2 ve2Var, long j, af2 af2Var, te2 te2Var, bt btVar) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = 3;
        this.QrzZRwfaDlRX = ve2Var;
        this.r3s1LDPKFs1S = j;
        this.gPXPFXrUH4XX = af2Var;
        this.BRwzKIf41E4i = te2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r10.PxuCJdSBwIXG(r0, r13) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r10.PxuCJdSBwIXG(r5, r13) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (new defpackage.vg2(r0.r3s1LDPKFs1S, r13, 0).RfyTYNmI9Srp(r6) == r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0138, code lost:
    
        if (((defpackage.xs0) r8).nLZGh9p8gVSu(r13) == r7) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        xp1 xp1Var;
        d91 d91Var;
        wp1 wp1Var;
        int i = this.x50lh2ztY7Y5;
        long j = this.r3s1LDPKFs1S;
        no2 no2Var = no2.PxuCJdSBwIXG;
        su suVar = su.rtx2ld2ELZv4;
        Object obj2 = this.gPXPFXrUH4XX;
        Object obj3 = this.BRwzKIf41E4i;
        switch (i) {
            case 0:
                e81 e81Var = (e81) obj3;
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                ng0.tmVwIGCQF4zR(obj);
                                return no2Var;
                            }
                            u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xp1Var = (xp1) this.QrzZRwfaDlRX;
                        ng0.tmVwIGCQF4zR(obj);
                        this.QrzZRwfaDlRX = null;
                        this.cpQdD2nAriOS = 3;
                        if (e81Var.PxuCJdSBwIXG(xp1Var, this) != suVar) {
                            return no2Var;
                        }
                        return suVar;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                wp1 wp1Var2 = new wp1(j);
                xp1 xp1Var2 = new xp1(wp1Var2);
                this.QrzZRwfaDlRX = xp1Var2;
                this.cpQdD2nAriOS = 2;
                if (e81Var.PxuCJdSBwIXG(wp1Var2, this) != suVar) {
                    xp1Var = xp1Var2;
                    this.QrzZRwfaDlRX = null;
                    this.cpQdD2nAriOS = 3;
                    if (e81Var.PxuCJdSBwIXG(xp1Var, this) != suVar) {
                    }
                }
                return suVar;
            case 1:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    TextClassifier dgRBjINgWbAK = hi.dgRBjINgWbAK(this.QrzZRwfaDlRX);
                    this.cpQdD2nAriOS = 1;
                    return cn1.PxuCJdSBwIXG((cn1) obj2, (CharSequence) obj3, this.r3s1LDPKFs1S, dgRBjINgWbAK, this) == suVar ? suVar : no2Var;
                }
                if (i3 == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                    return no2Var;
                }
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                l12 l12Var = (l12) obj2;
                int i4 = this.cpQdD2nAriOS;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ng0.tmVwIGCQF4zR(obj);
                        return no2Var;
                    }
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ng0.tmVwIGCQF4zR(obj);
                j12 j12Var = (j12) this.QrzZRwfaDlRX;
                float RAsUl2FVSrh6 = l12Var.RAsUl2FVSrh6(j);
                n6 n6Var = new n6((wt1) obj3, l12Var, j12Var, 7);
                this.cpQdD2nAriOS = 1;
                return ki0.cpQdD2nAriOS(0.0f, RAsUl2FVSrh6, null, n6Var, this, 12) == suVar ? suVar : no2Var;
            case 3:
                int i5 = this.cpQdD2nAriOS;
                if (i5 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    vg2 vg2Var = ((ve2) this.QrzZRwfaDlRX).ZbWwgt3aGe7A;
                    if (vg2Var != null) {
                        this.cpQdD2nAriOS = 1;
                        break;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            ng0.tmVwIGCQF4zR(obj);
                            return no2Var;
                        }
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                this.cpQdD2nAriOS = 2;
                if (((af2) obj2).PxuCJdSBwIXG((te2) obj3, this) != suVar) {
                    return no2Var;
                }
                return suVar;
            default:
                e81 e81Var2 = (e81) obj3;
                d91 d91Var2 = (d91) obj2;
                int i6 = this.cpQdD2nAriOS;
                if (i6 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    wp1 wp1Var3 = (wp1) d91Var2.getValue();
                    if (wp1Var3 != null) {
                        vp1 vp1Var = new vp1(wp1Var3);
                        if (e81Var2 != null) {
                            this.QrzZRwfaDlRX = d91Var2;
                            this.cpQdD2nAriOS = 1;
                            break;
                        }
                        d91Var = d91Var2;
                    }
                    wp1Var = new wp1(j);
                    if (e81Var2 != null) {
                        this.QrzZRwfaDlRX = wp1Var;
                        this.cpQdD2nAriOS = 2;
                        break;
                    }
                    d91Var2.setValue(wp1Var);
                    return no2Var;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wp1Var = (wp1) this.QrzZRwfaDlRX;
                    ng0.tmVwIGCQF4zR(obj);
                    d91Var2.setValue(wp1Var);
                    return no2Var;
                }
                d91Var = (d91) this.QrzZRwfaDlRX;
                ng0.tmVwIGCQF4zR(obj);
                d91Var.setValue(null);
                wp1Var = new wp1(j);
                if (e81Var2 != null) {
                }
                d91Var2.setValue(wp1Var);
                return no2Var;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.BRwzKIf41E4i;
        Object obj3 = this.gPXPFXrUH4XX;
        switch (i) {
            case 0:
                return new OPXfSBeufaJ8((xs0) obj3, this.r3s1LDPKFs1S, (e81) obj2, btVar, 0);
            case 1:
                OPXfSBeufaJ8 oPXfSBeufaJ8 = new OPXfSBeufaJ8(this.r3s1LDPKFs1S, btVar, (cn1) obj3, (CharSequence) obj2);
                oPXfSBeufaJ8.QrzZRwfaDlRX = obj;
                return oPXfSBeufaJ8;
            case 2:
                OPXfSBeufaJ8 oPXfSBeufaJ82 = new OPXfSBeufaJ8((l12) obj3, this.r3s1LDPKFs1S, (wt1) obj2, btVar, 2);
                oPXfSBeufaJ82.QrzZRwfaDlRX = obj;
                return oPXfSBeufaJ82;
            case 3:
                return new OPXfSBeufaJ8((ve2) this.QrzZRwfaDlRX, this.r3s1LDPKFs1S, (af2) obj3, (te2) obj2, btVar);
            default:
                return new OPXfSBeufaJ8((d91) obj3, this.r3s1LDPKFs1S, (e81) obj2, btVar, 4);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                return ((OPXfSBeufaJ8) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 1:
                return ((OPXfSBeufaJ8) gPXPFXrUH4XX((bt) obj2, hi.dgRBjINgWbAK(obj))).RfyTYNmI9Srp(no2Var);
            case 2:
                return ((OPXfSBeufaJ8) gPXPFXrUH4XX((bt) obj2, (j12) obj)).RfyTYNmI9Srp(no2Var);
            case 3:
                return ((OPXfSBeufaJ8) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            default:
                return ((OPXfSBeufaJ8) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OPXfSBeufaJ8(long j, bt btVar, cn1 cn1Var, CharSequence charSequence) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = 1;
        this.gPXPFXrUH4XX = cn1Var;
        this.BRwzKIf41E4i = charSequence;
        this.r3s1LDPKFs1S = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OPXfSBeufaJ8(Object obj, long j, Object obj2, bt btVar, int i) {
        super(2, btVar);
        this.x50lh2ztY7Y5 = i;
        this.gPXPFXrUH4XX = obj;
        this.r3s1LDPKFs1S = j;
        this.BRwzKIf41E4i = obj2;
    }
}
