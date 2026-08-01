package v;

import java.util.ArrayList;
import w.n;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f3471q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3472r0 = 0;

    public final void R(int i, ArrayList arrayList, n nVar) {
        for (int i4 = 0; i4 < this.f3472r0; i4++) {
            d dVar = this.f3471q0[i4];
            ArrayList arrayList2 = nVar.f3545a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i5 = 0; i5 < this.f3472r0; i5++) {
            w.h.b(this.f3471q0[i5], i, arrayList, nVar);
        }
    }

    public void S() {
    }
}
