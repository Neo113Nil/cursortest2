package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
@sc1("dialog")
/* loaded from: classes.dex */
public final class wz extends tc1 {
    public static final uz Companion = new uz();

    @Override // defpackage.tc1
    public final za1 PxuCJdSBwIXG() {
        on onVar = wn.PxuCJdSBwIXG;
        return new vz(this);
    }

    @Override // defpackage.tc1
    public final void Y1f8riQaR6yg(List list, xb1 xb1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lS5Rgt96tfkO().a92UlCVFR9N8((x91) it.next());
        }
    }

    @Override // defpackage.tc1
    public final void e9gEMXR7LXtO(x91 x91Var, boolean z) {
        lS5Rgt96tfkO().e9gEMXR7LXtO(x91Var, z);
        int TVHukqbqS4tB = zk.TVHukqbqS4tB((Iterable) lS5Rgt96tfkO().a92UlCVFR9N8.rtx2ld2ELZv4.getValue(), x91Var);
        int i = 0;
        for (Object obj : (Iterable) lS5Rgt96tfkO().a92UlCVFR9N8.rtx2ld2ELZv4.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                fx1.mFd1aGiJX24N();
                throw null;
            }
            x91 x91Var2 = (x91) obj;
            if (i > TVHukqbqS4tB) {
                lS5Rgt96tfkO().TSizfFm2Yiuu(x91Var2);
            }
            i = i2;
        }
    }
}
