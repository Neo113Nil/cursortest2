package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class sb1 implements re0 {
    public final /* synthetic */ x91 OPXfSBeufaJ8;
    public final /* synthetic */ d91 dgRBjINgWbAK;
    public final /* synthetic */ x12 rtx2ld2ELZv4;
    public final /* synthetic */ wy1 wdg6QnbFHrFF;
    public final /* synthetic */ i92 x50lh2ztY7Y5;

    public sb1(x12 x12Var, x91 x91Var, yy1 yy1Var, d91 d91Var, i92 i92Var) {
        this.rtx2ld2ELZv4 = x12Var;
        this.OPXfSBeufaJ8 = x91Var;
        this.wdg6QnbFHrFF = yy1Var;
        this.dgRBjINgWbAK = d91Var;
        this.x50lh2ztY7Y5 = i92Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    @Override // defpackage.re0
    public final Object r3s1LDPKFs1S(Object obj, Object obj2, Object obj3, Object obj4) {
        x91 x91Var;
        s7 s7Var = (s7) obj;
        x91 x91Var2 = (x91) obj2;
        hp hpVar = (hp) obj3;
        ((Number) obj4).intValue();
        gg1 gg1Var = mp.PxuCJdSBwIXG;
        boolean wdg6QnbFHrFF = cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4.TSizfFm2Yiuu.getValue(), this.OPXfSBeufaJ8);
        if (!((Boolean) this.dgRBjINgWbAK.getValue()).booleanValue() && !wdg6QnbFHrFF) {
            List list = (List) this.x50lh2ztY7Y5.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    x91Var = 0;
                    break;
                }
                x91Var = listIterator.previous();
                if (cs0.wdg6QnbFHrFF(x91Var2, (x91) x91Var)) {
                    break;
                }
            }
            x91Var2 = x91Var;
        }
        tf0 tf0Var = (tf0) hpVar;
        if (x91Var2 == null) {
            tf0Var.IXK6ba3ucyzm(105930796);
        } else {
            tf0Var.IXK6ba3ucyzm(-1520603531);
            ng0.TSizfFm2Yiuu(x91Var2, this.wdg6QnbFHrFF, bs0.kpCQ9veP6n3I(-1263531443, new pz(x91Var2, s7Var), tf0Var), tf0Var, 384);
        }
        tf0Var.gPXPFXrUH4XX(false);
        gg1 gg1Var2 = mp.PxuCJdSBwIXG;
        return no2.PxuCJdSBwIXG;
    }
}
