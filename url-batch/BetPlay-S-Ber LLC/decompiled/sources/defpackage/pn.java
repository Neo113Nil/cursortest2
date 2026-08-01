package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class pn extends ed {
    public ed[] q0 = new ed[4];
    public int r0 = 0;

    public final void R(int i, qa0 qa0Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            ed edVar = this.q0[i2];
            ArrayList arrayList2 = qa0Var.a;
            if (!arrayList2.contains(edVar)) {
                arrayList2.add(edVar);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            op.t(this.q0[i3], i, arrayList, qa0Var);
        }
    }

    public void S() {
    }
}
