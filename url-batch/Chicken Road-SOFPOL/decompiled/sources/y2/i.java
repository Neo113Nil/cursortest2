package y2;

import java.util.ArrayList;
import z2.n;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f8831q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f8832r0 = 0;

    public final void R(int i, ArrayList arrayList, n nVar) {
        for (int i8 = 0; i8 < this.f8832r0; i8++) {
            d dVar = this.f8831q0[i8];
            ArrayList arrayList2 = nVar.f9156a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i9 = 0; i9 < this.f8832r0; i9++) {
            z2.h.b(this.f8831q0[i9], i, arrayList, nVar);
        }
    }

    public void S() {
    }
}
