package s;

import java.util.ArrayList;
import t.n;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f3311q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3312r0 = 0;

    public final void R(int i4, ArrayList arrayList, n nVar) {
        for (int i5 = 0; i5 < this.f3312r0; i5++) {
            d dVar = this.f3311q0[i5];
            ArrayList arrayList2 = nVar.f3350a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i6 = 0; i6 < this.f3312r0; i6++) {
            t.h.b(this.f3311q0[i6], i4, arrayList, nVar);
        }
    }

    public void S() {
    }
}
