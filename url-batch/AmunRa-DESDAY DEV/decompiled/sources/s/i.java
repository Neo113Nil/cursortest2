package s;

import java.util.ArrayList;
import t.AbstractC0305h;
import t.C0311n;

/* loaded from: classes.dex */
public abstract class i extends C0295d {

    /* renamed from: q0, reason: collision with root package name */
    public C0295d[] f3798q0 = new C0295d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3799r0 = 0;

    public final void R(int i, ArrayList arrayList, C0311n c0311n) {
        for (int i2 = 0; i2 < this.f3799r0; i2++) {
            C0295d c0295d = this.f3798q0[i2];
            ArrayList arrayList2 = c0311n.f3859a;
            if (!arrayList2.contains(c0295d)) {
                arrayList2.add(c0295d);
            }
        }
        for (int i3 = 0; i3 < this.f3799r0; i3++) {
            AbstractC0305h.b(this.f3798q0[i3], i, arrayList, c0311n);
        }
    }

    public void S() {
    }
}
