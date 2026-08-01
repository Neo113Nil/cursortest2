package u;

import java.util.ArrayList;
import v.AbstractC0285h;
import v.C0291n;

/* loaded from: classes.dex */
public abstract class i extends C0275d {

    /* renamed from: q0, reason: collision with root package name */
    public C0275d[] f3779q0 = new C0275d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3780r0 = 0;

    public final void R(int i, ArrayList arrayList, C0291n c0291n) {
        for (int i2 = 0; i2 < this.f3780r0; i2++) {
            C0275d c0275d = this.f3779q0[i2];
            ArrayList arrayList2 = c0291n.f3831a;
            if (!arrayList2.contains(c0275d)) {
                arrayList2.add(c0275d);
            }
        }
        for (int i3 = 0; i3 < this.f3780r0; i3++) {
            AbstractC0285h.b(this.f3779q0[i3], i, arrayList, c0291n);
        }
    }

    public void S() {
    }
}
