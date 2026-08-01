package s;

import java.util.ArrayList;
import t.AbstractC0335h;
import t.C0341n;

/* loaded from: classes.dex */
public abstract class i extends C0325d {

    /* renamed from: q0, reason: collision with root package name */
    public C0325d[] f4142q0 = new C0325d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f4143r0 = 0;

    public final void R(int i, ArrayList arrayList, C0341n c0341n) {
        for (int i2 = 0; i2 < this.f4143r0; i2++) {
            C0325d c0325d = this.f4142q0[i2];
            ArrayList arrayList2 = c0341n.f4186a;
            if (!arrayList2.contains(c0325d)) {
                arrayList2.add(c0325d);
            }
        }
        for (int i3 = 0; i3 < this.f4143r0; i3++) {
            AbstractC0335h.b(this.f4142q0[i3], i, arrayList, c0341n);
        }
    }

    public void S() {
    }
}
