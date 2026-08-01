package s;

import java.util.ArrayList;
import t.AbstractC0291h;
import t.C0297n;

/* loaded from: classes.dex */
public abstract class i extends C0281d {

    /* renamed from: q0, reason: collision with root package name */
    public C0281d[] f3738q0 = new C0281d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3739r0 = 0;

    public final void R(int i, ArrayList arrayList, C0297n c0297n) {
        for (int i2 = 0; i2 < this.f3739r0; i2++) {
            C0281d c0281d = this.f3738q0[i2];
            ArrayList arrayList2 = c0297n.f3811a;
            if (!arrayList2.contains(c0281d)) {
                arrayList2.add(c0281d);
            }
        }
        for (int i3 = 0; i3 < this.f3739r0; i3++) {
            AbstractC0291h.b(this.f3738q0[i3], i, arrayList, c0297n);
        }
    }

    public void S() {
    }
}
