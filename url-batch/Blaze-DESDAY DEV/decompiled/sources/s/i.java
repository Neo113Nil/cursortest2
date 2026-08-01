package s;

import java.util.ArrayList;
import t.n;

/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f3713q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3714r0 = 0;

    public final void R(int i, ArrayList arrayList, n nVar) {
        for (int i2 = 0; i2 < this.f3714r0; i2++) {
            d dVar = this.f3713q0[i2];
            ArrayList arrayList2 = nVar.f3759a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i3 = 0; i3 < this.f3714r0; i3++) {
            t.h.b(this.f3713q0[i3], i, arrayList, nVar);
        }
    }

    public void S() {
    }
}
