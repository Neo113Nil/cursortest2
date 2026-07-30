package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t62 implements le0 {
    public final /* synthetic */ le0 OPXfSBeufaJ8;
    public final /* synthetic */ ae0 cpQdD2nAriOS;
    public final /* synthetic */ boolean dgRBjINgWbAK;
    public final /* synthetic */ boolean rtx2ld2ELZv4;
    public final /* synthetic */ tk wdg6QnbFHrFF;
    public final /* synthetic */ float x50lh2ztY7Y5;

    public t62(boolean z, le0 le0Var, tk tkVar, boolean z2, float f, ae0 ae0Var) {
        this.rtx2ld2ELZv4 = z;
        this.OPXfSBeufaJ8 = le0Var;
        this.wdg6QnbFHrFF = tkVar;
        this.dgRBjINgWbAK = z2;
        this.x50lh2ztY7Y5 = f;
        this.cpQdD2nAriOS = ae0Var;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        KeyEvent keyEvent = ((qu0) obj).PxuCJdSBwIXG;
        tk tkVar = this.wdg6QnbFHrFF;
        float f = tkVar.lS5Rgt96tfkO;
        if (!this.rtx2ld2ELZv4) {
            return Boolean.FALSE;
        }
        le0 le0Var = this.OPXfSBeufaJ8;
        if (le0Var == null) {
            return Boolean.FALSE;
        }
        int S9EYkSpbGuxq = jh0.S9EYkSpbGuxq(keyEvent);
        su0.Companion.getClass();
        boolean z = false;
        if (S9EYkSpbGuxq != 2) {
            if (S9EYkSpbGuxq == 1) {
                long TSizfFm2Yiuu = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
                ou0.Companion.getClass();
                if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.Y1f8riQaR6yg) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.e9gEMXR7LXtO) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.RAsUl2FVSrh6) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.a92UlCVFR9N8) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.VhhvGxCb8gfr) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.S2OOm9zPNm0h) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.aF05bpZJlKEP) || ou0.PxuCJdSBwIXG(TSizfFm2Yiuu, ou0.kpCQ9veP6n3I)) {
                    ae0 ae0Var = this.cpQdD2nAriOS;
                    if (ae0Var != null) {
                        ae0Var.PxuCJdSBwIXG();
                    }
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        float f2 = tkVar.PxuCJdSBwIXG;
        float abs = Math.abs(f - f2) / 100.0f;
        int i = this.dgRBjINgWbAK ? -1 : 1;
        long TSizfFm2Yiuu2 = ki0.TSizfFm2Yiuu(keyEvent.getKeyCode());
        ou0.Companion.getClass();
        boolean PxuCJdSBwIXG = ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.Y1f8riQaR6yg);
        float f3 = this.x50lh2ztY7Y5;
        if (PxuCJdSBwIXG) {
            le0Var.OPXfSBeufaJ8(ng0.x50lh2ztY7Y5(Float.valueOf((i * abs) + f3), tkVar));
        } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.e9gEMXR7LXtO)) {
            le0Var.OPXfSBeufaJ8(ng0.x50lh2ztY7Y5(Float.valueOf(f3 - (i * abs)), tkVar));
        } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.RAsUl2FVSrh6)) {
            le0Var.OPXfSBeufaJ8(ng0.x50lh2ztY7Y5(Float.valueOf((i * abs) + f3), tkVar));
        } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.a92UlCVFR9N8)) {
            le0Var.OPXfSBeufaJ8(ng0.x50lh2ztY7Y5(Float.valueOf(f3 - (i * abs)), tkVar));
        } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.VhhvGxCb8gfr)) {
            le0Var.OPXfSBeufaJ8(Float.valueOf(f2));
        } else if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.S2OOm9zPNm0h)) {
            le0Var.OPXfSBeufaJ8(Float.valueOf(f));
        } else {
            if (!ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.aF05bpZJlKEP)) {
                if (ou0.PxuCJdSBwIXG(TSizfFm2Yiuu2, ou0.kpCQ9veP6n3I)) {
                    le0Var.OPXfSBeufaJ8(ng0.x50lh2ztY7Y5(Float.valueOf((ng0.wdg6QnbFHrFF(10, 1, 10) * abs) + f3), tkVar));
                }
                return Boolean.valueOf(z);
            }
            le0Var.OPXfSBeufaJ8(ng0.x50lh2ztY7Y5(Float.valueOf(f3 - (ng0.wdg6QnbFHrFF(10, 1, 10) * abs)), tkVar));
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
