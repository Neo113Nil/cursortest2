package defpackage;

import kotlinx.serialization.json.lS5Rgt96tfkO;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class bu0 extends sv1 implements qe0 {
    public /* synthetic */ dw dgRBjINgWbAK;
    public int wdg6QnbFHrFF;
    public final /* synthetic */ um x50lh2ztY7Y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu0(um umVar, bt btVar) {
        super(3, btVar);
        this.x50lh2ztY7Y5 = umVar;
    }

    @Override // defpackage.nc
    public final Object RfyTYNmI9Srp(Object obj) {
        um umVar = this.x50lh2ztY7Y5;
        cb1 cb1Var = (cb1) umVar.TSizfFm2Yiuu;
        dw dwVar = this.dgRBjINgWbAK;
        int i = this.wdg6QnbFHrFF;
        if (i == 0) {
            ng0.tmVwIGCQF4zR(obj);
            byte gPXPFXrUH4XX = cb1Var.gPXPFXrUH4XX();
            if (gPXPFXrUH4XX == 1) {
                return umVar.OPXfSBeufaJ8(true);
            }
            if (gPXPFXrUH4XX == 0) {
                return umVar.OPXfSBeufaJ8(false);
            }
            if (gPXPFXrUH4XX != 6) {
                if (gPXPFXrUH4XX == 8) {
                    return umVar.rtx2ld2ELZv4();
                }
                cb1.x50lh2ztY7Y5(cb1Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.dgRBjINgWbAK = null;
            this.wdg6QnbFHrFF = 1;
            obj = um.PxuCJdSBwIXG(umVar, dwVar, this);
            su suVar = su.rtx2ld2ELZv4;
            if (obj == suVar) {
                return suVar;
            }
        } else {
            if (i != 1) {
                u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ng0.tmVwIGCQF4zR(obj);
        }
        return (lS5Rgt96tfkO) obj;
    }

    @Override // defpackage.qe0
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        bu0 bu0Var = new bu0(this.x50lh2ztY7Y5, (bt) obj3);
        bu0Var.dgRBjINgWbAK = (dw) obj;
        return bu0Var.RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
    }
}
