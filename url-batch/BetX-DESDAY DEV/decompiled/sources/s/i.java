package s;

import java.util.ArrayList;
import t.AbstractC0337h;
import t.C0343n;

/* loaded from: classes.dex */
public abstract class i extends C0327d {

    /* renamed from: q0, reason: collision with root package name */
    public C0327d[] f4146q0 = new C0327d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f4147r0 = 0;

    public final void R(int i, ArrayList arrayList, C0343n c0343n) {
        for (int i2 = 0; i2 < this.f4147r0; i2++) {
            C0327d c0327d = this.f4146q0[i2];
            ArrayList arrayList2 = c0343n.f4190a;
            if (!arrayList2.contains(c0327d)) {
                arrayList2.add(c0327d);
            }
        }
        for (int i3 = 0; i3 < this.f4147r0; i3++) {
            AbstractC0337h.b(this.f4146q0[i3], i, arrayList, c0343n);
        }
    }

    public void S() {
    }
}
