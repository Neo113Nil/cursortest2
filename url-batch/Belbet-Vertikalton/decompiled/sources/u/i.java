package u;

import java.util.ArrayList;
import v.AbstractC0399h;
import v.C0405n;

/* loaded from: classes.dex */
public abstract class i extends C0387d {

    /* renamed from: q0, reason: collision with root package name */
    public C0387d[] f4366q0 = new C0387d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f4367r0 = 0;

    public final void R(int i, ArrayList arrayList, C0405n c0405n) {
        for (int i2 = 0; i2 < this.f4367r0; i2++) {
            C0387d c0387d = this.f4366q0[i2];
            ArrayList arrayList2 = c0405n.f4432a;
            if (!arrayList2.contains(c0387d)) {
                arrayList2.add(c0387d);
            }
        }
        for (int i3 = 0; i3 < this.f4367r0; i3++) {
            AbstractC0399h.b(this.f4366q0[i3], i, arrayList, c0405n);
        }
    }

    public void S() {
    }
}
