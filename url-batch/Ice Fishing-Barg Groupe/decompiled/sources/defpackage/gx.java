package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class gx implements qe0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ gx(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // defpackage.qe0
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        Icon icon;
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj4 = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                long j = ((hl) obj).PxuCJdSBwIXG;
                hp hpVar = (hp) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((tf0) hpVar).e9gEMXR7LXtO(j) ? 4 : 2;
                }
                tf0 tf0Var = (tf0) hpVar;
                if (!tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 19) != 18)) {
                    tf0Var.i68hK7ahKtgp();
                    break;
                } else {
                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                    hx.lS5Rgt96tfkO(((ye2) obj4).TSizfFm2Yiuu, j, tf0Var, (intValue << 3) & 112);
                    break;
                }
            case 1:
                long j2 = ((hl) obj).PxuCJdSBwIXG;
                hp hpVar2 = (hp) obj2;
                int intValue2 = ((Number) obj3).intValue();
                tf0 tf0Var2 = (tf0) hpVar2;
                if (!tf0Var2.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 17) != 16)) {
                    tf0Var2.i68hK7ahKtgp();
                    break;
                } else {
                    gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                    jx1.ZbWwgt3aGe7A.dgRBjINgWbAK((Drawable) obj4, tf0Var2, 48);
                    break;
                }
            default:
                long j3 = ((hl) obj).PxuCJdSBwIXG;
                hp hpVar3 = (hp) obj2;
                int intValue3 = ((Number) obj3).intValue();
                tf0 tf0Var3 = (tf0) hpVar3;
                if (!tf0Var3.Pf0ThKz3j5YS(intValue3 & 1, (intValue3 & 17) != 16)) {
                    tf0Var3.i68hK7ahKtgp();
                    break;
                } else {
                    gg1 gg1Var3 = mp.PxuCJdSBwIXG;
                    jx1 jx1Var = jx1.ZbWwgt3aGe7A;
                    icon = ((RemoteAction) obj4).getIcon();
                    jx1Var.x50lh2ztY7Y5(icon, tf0Var3, 48);
                    break;
                }
        }
        return no2Var;
    }
}
