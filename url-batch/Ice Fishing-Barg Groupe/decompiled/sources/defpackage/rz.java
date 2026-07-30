package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rz extends jc2 implements pe0 {
    public final /* synthetic */ Object QrzZRwfaDlRX;
    public /* synthetic */ Object cpQdD2nAriOS;
    public final /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(d91 d91Var, wz wzVar, d82 d82Var, bt btVar) {
        super(2, btVar);
        this.cpQdD2nAriOS = d91Var;
        this.r3s1LDPKFs1S = wzVar;
        this.QrzZRwfaDlRX = d82Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.QrzZRwfaDlRX;
        Object obj3 = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                ng0.tmVwIGCQF4zR(obj);
                wz wzVar = (wz) obj3;
                d82 d82Var = (d82) obj2;
                for (x91 x91Var : (Set) ((d91) this.cpQdD2nAriOS).getValue()) {
                    if (!((List) wzVar.lS5Rgt96tfkO().e9gEMXR7LXtO.rtx2ld2ELZv4.getValue()).contains(x91Var) && !d82Var.contains(x91Var)) {
                        wzVar.lS5Rgt96tfkO().TSizfFm2Yiuu(x91Var);
                    }
                }
                return no2.PxuCJdSBwIXG;
            default:
                ng0.tmVwIGCQF4zR(obj);
                ru ruVar = (ru) this.cpQdD2nAriOS;
                eo1 eo1Var = (eo1) obj3;
                of2 of2Var = (of2) obj2;
                bt btVar = null;
                fx1.KUoIVIumpKat(ruVar, null, new ut(eo1Var, of2Var, btVar, 1), 1);
                return fx1.KUoIVIumpKat(ruVar, null, new ut(eo1Var, of2Var, btVar, 2), 1);
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.QrzZRwfaDlRX;
        Object obj3 = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                return new rz((d91) this.cpQdD2nAriOS, (wz) obj3, (d82) obj2, btVar);
            default:
                rz rzVar = new rz((eo1) obj3, (of2) obj2, btVar);
                rzVar.cpQdD2nAriOS = obj;
                return rzVar;
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        ru ruVar = (ru) obj;
        bt btVar = (bt) obj2;
        switch (i) {
            case 0:
                ((rz) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
                return no2Var;
            default:
                return ((rz) gPXPFXrUH4XX(btVar, ruVar)).RfyTYNmI9Srp(no2Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz(eo1 eo1Var, of2 of2Var, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = eo1Var;
        this.QrzZRwfaDlRX = of2Var;
    }
}
