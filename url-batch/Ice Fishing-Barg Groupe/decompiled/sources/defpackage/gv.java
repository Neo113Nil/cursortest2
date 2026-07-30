package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gv extends jc2 implements pe0 {
    public /* synthetic */ Object cpQdD2nAriOS;
    public final /* synthetic */ Object r3s1LDPKFs1S;
    public final /* synthetic */ int x50lh2ztY7Y5 = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(d91 d91Var, fj1 fj1Var, bt btVar) {
        super(2, btVar);
        this.cpQdD2nAriOS = d91Var;
        this.r3s1LDPKFs1S = fj1Var;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        boolean z;
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                ng0.tmVwIGCQF4zR(obj);
                ru ruVar = (ru) this.cpQdD2nAriOS;
                hv hvVar = (hv) obj2;
                xs0 xs0Var = (xs0) hvVar.lS5Rgt96tfkO.getAndSet(null);
                AtomicReference atomicReference = hvVar.lS5Rgt96tfkO;
                z82 KUoIVIumpKat = fx1.KUoIVIumpKat(ruVar, null, new a92UlCVFR9N8(xs0Var, hvVar, null, 16), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, KUoIVIumpKat)) {
                        z = true;
                    } else if (atomicReference.get() != null) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                ng0.tmVwIGCQF4zR(obj);
                qj1 qj1Var = (qj1) this.cpQdD2nAriOS;
                qj1Var.getClass();
                return ((le0) obj2).OPXfSBeufaJ8(qj1Var.lS5Rgt96tfkO());
            default:
                ng0.tmVwIGCQF4zR(obj);
                if (((qs0) ((d91) this.cpQdD2nAriOS).getValue()) != null) {
                    ((fj1) obj2).OPXfSBeufaJ8(r5.TSizfFm2Yiuu);
                }
                return no2.PxuCJdSBwIXG;
        }
    }

    @Override // defpackage.nc
    public final bt gPXPFXrUH4XX(bt btVar, Object obj) {
        int i = this.x50lh2ztY7Y5;
        Object obj2 = this.r3s1LDPKFs1S;
        switch (i) {
            case 0:
                gv gvVar = new gv((hv) obj2, btVar);
                gvVar.cpQdD2nAriOS = obj;
                return gvVar;
            case 1:
                gv gvVar2 = new gv(btVar, (le0) obj2);
                gvVar2.cpQdD2nAriOS = obj;
                return gvVar2;
            default:
                return new gv((d91) this.cpQdD2nAriOS, (fj1) obj2, btVar);
        }
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        int i = this.x50lh2ztY7Y5;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                return ((gv) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
            case 1:
                return ((gv) gPXPFXrUH4XX((bt) obj2, (qj1) obj)).RfyTYNmI9Srp(no2Var);
            default:
                ((gv) gPXPFXrUH4XX((bt) obj2, (ru) obj)).RfyTYNmI9Srp(no2Var);
                return no2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(hv hvVar, bt btVar) {
        super(2, btVar);
        this.r3s1LDPKFs1S = hvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv(bt btVar, le0 le0Var) {
        super(2, btVar);
        this.r3s1LDPKFs1S = le0Var;
    }
}
