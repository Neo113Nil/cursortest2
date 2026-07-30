package defpackage;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rb1 extends jc2 implements pe0 {
    public /* synthetic */ Object QrzZRwfaDlRX;
    public int cpQdD2nAriOS;
    public final /* synthetic */ Object gPXPFXrUH4XX;
    public float r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(float f, x12 x12Var, x91 x91Var, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = f;
        this.QrzZRwfaDlRX = x12Var;
        this.gPXPFXrUH4XX = x91Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bd, code lost:
    
        if (r12.S9EYkSpbGuxq(r0, r12.lS5Rgt96tfkO.getValue(), r12) == r4) goto L50;
     */
    @Override // defpackage.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object RfyTYNmI9Srp(Object obj) {
        Object PxuCJdSBwIXG;
        float kpCQ9veP6n3I;
        ru ruVar;
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.gPXPFXrUH4XX;
        su suVar = su.rtx2ld2ELZv4;
        switch (i) {
            case 0:
                x12 x12Var = (x12) this.QrzZRwfaDlRX;
                float f = this.r3s1LDPKFs1S;
                int i2 = this.cpQdD2nAriOS;
                if (i2 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    if (f > 0.0f) {
                        this.cpQdD2nAriOS = 1;
                        break;
                    }
                } else if (i2 == 1) {
                    ng0.tmVwIGCQF4zR(obj);
                } else if (i2 != 2) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ng0.tmVwIGCQF4zR(obj);
                    break;
                }
                if (f == 0.0f) {
                    x91 x91Var = (x91) obj2;
                    this.cpQdD2nAriOS = 2;
                    gl2 gl2Var = x12Var.e9gEMXR7LXtO;
                    if (gl2Var == null || ((cs0.wdg6QnbFHrFF(x12Var.TSizfFm2Yiuu.getValue(), x91Var) && cs0.wdg6QnbFHrFF(x12Var.lS5Rgt96tfkO.getValue(), x91Var)) || (PxuCJdSBwIXG = o91.PxuCJdSBwIXG(x12Var.x50lh2ztY7Y5, new r12(x12Var, x91Var, gl2Var, null), this)) != suVar)) {
                        PxuCJdSBwIXG = no2Var;
                    }
                    if (PxuCJdSBwIXG != suVar) {
                    }
                    break;
                }
                break;
            case 1:
                int i3 = this.cpQdD2nAriOS;
                if (i3 == 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    this.cpQdD2nAriOS = 1;
                    if (g7.TSizfFm2Yiuu((g7) ((uj) this.QrzZRwfaDlRX).TSizfFm2Yiuu, new Float(this.r3s1LDPKFs1S), (i8) obj2, null, this, 12) == suVar) {
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
                    ru ruVar2 = (ru) this.QrzZRwfaDlRX;
                    kpCQ9veP6n3I = ki0.kpCQ9veP6n3I(ruVar2.cpQdD2nAriOS());
                    ruVar = ruVar2;
                } else if (i4 != 1) {
                    u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    kpCQ9veP6n3I = this.r3s1LDPKFs1S;
                    ruVar = (ru) this.QrzZRwfaDlRX;
                    ng0.tmVwIGCQF4zR(obj);
                }
                while (cs0.jyegZNwi31qc(ruVar)) {
                    yq1 yq1Var = new yq1((gl2) obj2, kpCQ9veP6n3I);
                    this.QrzZRwfaDlRX = ruVar;
                    this.r3s1LDPKFs1S = kpCQ9veP6n3I;
                    this.cpQdD2nAriOS = 1;
                    hu huVar = this.OPXfSBeufaJ8;
                    huVar.getClass();
                    if (ki0.BjEWd04qc7Mw(huVar).PxuCJdSBwIXG(this, yq1Var) == suVar) {
                        break;
                    }
                }
                break;
        }
        return suVar;
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.gPXPFXrUH4XX;
        switch (i) {
            case 0:
                return new rb1(this.r3s1LDPKFs1S, (x12) this.QrzZRwfaDlRX, (x91) obj2, btVar);
            case 1:
                return new rb1((uj) this.QrzZRwfaDlRX, this.r3s1LDPKFs1S, (i8) obj2, btVar);
            default:
                rb1 rb1Var = new rb1((gl2) obj2, btVar);
                rb1Var.QrzZRwfaDlRX = obj;
                return rb1Var;
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
        return ((rb1) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(uj ujVar, float f, i8 i8Var, bt btVar) {
        super(2, btVar);
        this.QrzZRwfaDlRX = ujVar;
        this.r3s1LDPKFs1S = f;
        this.gPXPFXrUH4XX = i8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb1(gl2 gl2Var, bt btVar) {
        super(2, btVar);
        this.gPXPFXrUH4XX = gl2Var;
    }
}
