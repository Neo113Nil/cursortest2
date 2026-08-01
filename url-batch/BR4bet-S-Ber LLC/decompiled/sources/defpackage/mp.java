package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class mp extends ae {
    public ae[] q0 = new ae[4];
    public int r0 = 0;

    public final void R(int i, qd0 qd0Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            ae aeVar = this.q0[i2];
            ArrayList arrayList2 = qd0Var.a;
            if (!arrayList2.contains(aeVar)) {
                arrayList2.add(aeVar);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            b9.n(this.q0[i3], i, arrayList, qd0Var);
        }
    }

    public void S() {
    }
}
