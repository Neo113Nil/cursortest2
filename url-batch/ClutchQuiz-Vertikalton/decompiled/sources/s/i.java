package s;

import java.util.ArrayList;
import t.AbstractC0350h;
import t.C0357o;

/* loaded from: classes.dex */
public abstract class i extends C0340d {
    public C0340d[] q0 = new C0340d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3633r0 = 0;

    public final void R(int i, ArrayList arrayList, C0357o c0357o) {
        for (int i2 = 0; i2 < this.f3633r0; i2++) {
            C0340d c0340d = this.q0[i2];
            ArrayList arrayList2 = c0357o.f3707a;
            if (!arrayList2.contains(c0340d)) {
                arrayList2.add(c0340d);
            }
        }
        for (int i3 = 0; i3 < this.f3633r0; i3++) {
            AbstractC0350h.b(this.q0[i3], i, arrayList, c0357o);
        }
    }

    public void S() {
    }
}
