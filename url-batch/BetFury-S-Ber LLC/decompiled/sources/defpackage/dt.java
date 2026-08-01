package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class dt extends rf {
    public rf[] q0 = new rf[4];
    public int r0 = 0;

    public final void R(int i, sn0 sn0Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            rf rfVar = this.q0[i2];
            ArrayList arrayList2 = sn0Var.a;
            if (!arrayList2.contains(rfVar)) {
                arrayList2.add(rfVar);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            mv.o(this.q0[i3], i, arrayList, sn0Var);
        }
    }

    public void S() {
    }
}
