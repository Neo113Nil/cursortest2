package s;

import java.util.ArrayList;
import t.AbstractC0303h;
import t.C0309n;

/* loaded from: classes.dex */
public abstract class i extends C0293d {

    /* renamed from: q0, reason: collision with root package name */
    public C0293d[] f3662q0 = new C0293d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f3663r0 = 0;

    public final void R(int i, ArrayList arrayList, C0309n c0309n) {
        for (int i2 = 0; i2 < this.f3663r0; i2++) {
            C0293d c0293d = this.f3662q0[i2];
            ArrayList arrayList2 = c0309n.f3714a;
            if (!arrayList2.contains(c0293d)) {
                arrayList2.add(c0293d);
            }
        }
        for (int i3 = 0; i3 < this.f3663r0; i3++) {
            AbstractC0303h.b(this.f3662q0[i3], i, arrayList, c0309n);
        }
    }

    public void S() {
    }
}
