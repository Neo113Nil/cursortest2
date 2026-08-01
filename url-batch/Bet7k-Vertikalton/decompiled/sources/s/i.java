package s;

import java.util.ArrayList;
import t.AbstractC0308h;
import t.C0314n;

/* loaded from: classes.dex */
public abstract class i extends C0298d {

    /* renamed from: q0, reason: collision with root package name */
    public C0298d[] f3750q0 = new C0298d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3751r0 = 0;

    public final void R(int i, ArrayList arrayList, C0314n c0314n) {
        for (int i2 = 0; i2 < this.f3751r0; i2++) {
            C0298d c0298d = this.f3750q0[i2];
            ArrayList arrayList2 = c0314n.f3790a;
            if (!arrayList2.contains(c0298d)) {
                arrayList2.add(c0298d);
            }
        }
        for (int i3 = 0; i3 < this.f3751r0; i3++) {
            AbstractC0308h.b(this.f3750q0[i3], i, arrayList, c0314n);
        }
    }

    public void S() {
    }
}
