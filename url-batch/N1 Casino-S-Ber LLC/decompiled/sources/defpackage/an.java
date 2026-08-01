package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class an extends ad {
    public ad[] q0 = new ad[4];
    public int r0 = 0;

    public final void R(int i, ja0 ja0Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            ad adVar = this.q0[i2];
            ArrayList arrayList2 = ja0Var.a;
            if (!arrayList2.contains(adVar)) {
                arrayList2.add(adVar);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            e70.t(this.q0[i3], i, arrayList, ja0Var);
        }
    }

    public void S() {
    }
}
