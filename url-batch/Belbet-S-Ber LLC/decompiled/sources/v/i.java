package v;

import java.util.ArrayList;
import w.n;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f3689q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3690r0 = 0;

    public final void R(int i, ArrayList arrayList, n nVar) {
        for (int i4 = 0; i4 < this.f3690r0; i4++) {
            d dVar = this.f3689q0[i4];
            ArrayList arrayList2 = nVar.f3767a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i5 = 0; i5 < this.f3690r0; i5++) {
            w.h.b(this.f3689q0[i5], i, arrayList, nVar);
        }
    }

    public void S() {
    }
}
