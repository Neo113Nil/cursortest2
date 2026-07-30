package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ww implements l01 {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4 = 3;
    public final Object wdg6QnbFHrFF;

    public ww(n01 n01Var) {
        this.OPXfSBeufaJ8 = n01Var;
        hk hkVar = hk.TSizfFm2Yiuu;
        Class<?> cls = n01Var.getClass();
        fk fkVar = (fk) hkVar.PxuCJdSBwIXG.get(cls);
        this.wdg6QnbFHrFF = fkVar == null ? hkVar.PxuCJdSBwIXG(cls, null) : fkVar;
    }

    @Override // defpackage.l01
    public final void cpQdD2nAriOS(o01 o01Var, e01 e01Var) {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        Object obj2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                uw uwVar = (uw) obj;
                switch (vw.PxuCJdSBwIXG[e01Var.ordinal()]) {
                    case 1:
                        uwVar.getClass();
                        break;
                    case 2:
                        uwVar.a92UlCVFR9N8(o01Var);
                        break;
                    case 3:
                        uwVar.OPXfSBeufaJ8(o01Var);
                        break;
                    case 4:
                        uwVar.getClass();
                        break;
                    case 5:
                        uwVar.lS5Rgt96tfkO(o01Var);
                        break;
                    case 6:
                        uwVar.getClass();
                        break;
                    case 7:
                        u9.XL4ISE6Oc65B("ON_ANY must not been send by anybody");
                        break;
                    default:
                        u9.gPXPFXrUH4XX();
                        break;
                }
                l01 l01Var = (l01) obj2;
                if (l01Var != null) {
                    l01Var.cpQdD2nAriOS(o01Var, e01Var);
                    break;
                }
                break;
            case 1:
                if (e01Var == e01.ON_START) {
                    ((s01) obj).a92UlCVFR9N8(this);
                    ((cr1) obj2).dgRBjINgWbAK();
                    break;
                }
                break;
            case 2:
                of1 of1Var = (of1) obj;
                int i2 = tf1.PxuCJdSBwIXG[e01Var.ordinal()];
                if (i2 == 1) {
                    of1Var.RAsUl2FVSrh6(true);
                    break;
                } else if (i2 == 2) {
                    of1Var.RAsUl2FVSrh6(false);
                    break;
                } else if (i2 == 3) {
                    of1Var.e9gEMXR7LXtO();
                    ((s01) obj2).a92UlCVFR9N8(this);
                    break;
                }
                break;
            default:
                HashMap hashMap = ((fk) obj2).PxuCJdSBwIXG;
                fk.PxuCJdSBwIXG((List) hashMap.get(e01Var), o01Var, e01Var, obj);
                fk.PxuCJdSBwIXG((List) hashMap.get(e01.ON_ANY), o01Var, e01Var, obj);
                break;
        }
    }

    public ww(uw uwVar, l01 l01Var) {
        uwVar.getClass();
        this.OPXfSBeufaJ8 = uwVar;
        this.wdg6QnbFHrFF = l01Var;
    }

    public ww(s01 s01Var, cr1 cr1Var) {
        this.OPXfSBeufaJ8 = s01Var;
        this.wdg6QnbFHrFF = cr1Var;
    }

    public ww(of1 of1Var, uf1 uf1Var, s01 s01Var) {
        this.OPXfSBeufaJ8 = of1Var;
        this.wdg6QnbFHrFF = s01Var;
    }
}
