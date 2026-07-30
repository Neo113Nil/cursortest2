package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@sc1("navigation")
/* loaded from: classes.dex */
public class kb1 extends tc1 {
    public static final jb1 Companion = new jb1();
    public final vc1 TSizfFm2Yiuu;

    public kb1(vc1 vc1Var) {
        vc1Var.getClass();
        this.TSizfFm2Yiuu = vc1Var;
    }

    @Override // defpackage.tc1
    /* renamed from: RAsUl2FVSrh6, reason: merged with bridge method [inline-methods] */
    public eb1 PxuCJdSBwIXG() {
        return new eb1(this);
    }

    @Override // defpackage.tc1
    public final void Y1f8riQaR6yg(List list, xb1 xb1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            x91 x91Var = (x91) it.next();
            za1 za1Var = x91Var.OPXfSBeufaJ8;
            za1Var.getClass();
            eb1 eb1Var = (eb1) za1Var;
            cb1 cb1Var = eb1Var.OPXfSBeufaJ8;
            zt1 zt1Var = new zt1();
            zt1Var.rtx2ld2ELZv4 = x91Var.QrzZRwfaDlRX.PxuCJdSBwIXG();
            id0 id0Var = eb1Var.x50lh2ztY7Y5;
            int i = id0Var.lS5Rgt96tfkO;
            String str = (String) id0Var.a92UlCVFR9N8;
            if (i == 0 && str == null) {
                cb1Var.getClass();
                String valueOf = String.valueOf(cb1Var.lS5Rgt96tfkO);
                valueOf.getClass();
                if (((eb1) id0Var.TSizfFm2Yiuu).OPXfSBeufaJ8.lS5Rgt96tfkO == 0) {
                    valueOf = "the root navigation";
                }
                rc1.e9gEMXR7LXtO("no start destination defined via app:startDestination for ".concat(valueOf));
                return;
            }
            int i2 = 0;
            za1 dgRBjINgWbAK = str != null ? id0Var.dgRBjINgWbAK(str, false) : (za1) ((s82) id0Var.Y1f8riQaR6yg).lS5Rgt96tfkO(i);
            if (dgRBjINgWbAK == null) {
                if (((String) id0Var.e9gEMXR7LXtO) == null) {
                    String str2 = (String) id0Var.a92UlCVFR9N8;
                    if (str2 == null) {
                        str2 = String.valueOf(id0Var.lS5Rgt96tfkO);
                    }
                    id0Var.e9gEMXR7LXtO = str2;
                }
                String str3 = (String) id0Var.e9gEMXR7LXtO;
                str3.getClass();
                u9.XL4ISE6Oc65B(o0.x50lh2ztY7Y5("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            cb1 cb1Var2 = dgRBjINgWbAK.OPXfSBeufaJ8;
            if (str != null) {
                if (!str.equals((String) cb1Var2.a92UlCVFR9N8)) {
                    ya1 r3s1LDPKFs1S = cb1Var2.r3s1LDPKFs1S(str);
                    Bundle bundle = r3s1LDPKFs1S != null ? r3s1LDPKFs1S.OPXfSBeufaJ8 : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle ZbWwgt3aGe7A = mm2.ZbWwgt3aGe7A((vi1[]) Arrays.copyOf(new vi1[0], 0));
                        ZbWwgt3aGe7A.putAll(bundle);
                        Bundle bundle2 = (Bundle) zt1Var.rtx2ld2ELZv4;
                        if (bundle2 != null) {
                            ZbWwgt3aGe7A.putAll(bundle2);
                        }
                        zt1Var.rtx2ld2ELZv4 = ZbWwgt3aGe7A;
                    }
                }
                if (dgRBjINgWbAK.TSizfFm2Yiuu().isEmpty()) {
                    continue;
                } else {
                    ArrayList ozEBbv0hFTAB = sj0.ozEBbv0hFTAB(dgRBjINgWbAK.TSizfFm2Yiuu(), new ib1(i2, zt1Var));
                    if (!ozEBbv0hFTAB.isEmpty()) {
                        u9.x50lh2ztY7Y5("Cannot navigate to startDestination ", dgRBjINgWbAK, ". Missing required arguments [", ozEBbv0hFTAB, 93);
                        return;
                    }
                }
            }
            this.TSizfFm2Yiuu.lS5Rgt96tfkO(dgRBjINgWbAK.rtx2ld2ELZv4).Y1f8riQaR6yg(fx1.jJwa0q7P5wHq(lS5Rgt96tfkO().lS5Rgt96tfkO(dgRBjINgWbAK, dgRBjINgWbAK.PxuCJdSBwIXG((Bundle) zt1Var.rtx2ld2ELZv4))), xb1Var);
        }
    }
}
