package r1;

import java.util.Iterator;
import java.util.List;
import n2.C0692Q;
import q1.C0784h;
import q1.G;
import q1.I;
import q1.J;

@I("dialog")
/* loaded from: classes.dex */
public final class p extends J {
    @Override // q1.J
    public final q1.w a() {
        Q.a aVar = AbstractC0853e.f7217a;
        return new o(this);
    }

    @Override // q1.J
    public final void d(List list, G g3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C0784h) it.next());
        }
    }

    @Override // q1.J
    public final void e(C0784h c0784h, boolean z3) {
        b().e(c0784h, z3);
        int o02 = M1.l.o0((Iterable) ((C0692Q) b().f6917f.f6272d).getValue(), c0784h);
        int i3 = 0;
        for (Object obj : (Iterable) ((C0692Q) b().f6917f.f6272d).getValue()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                M1.m.f0();
                throw null;
            }
            C0784h c0784h2 = (C0784h) obj;
            if (i3 > o02) {
                b().b(c0784h2);
            }
            i3 = i4;
        }
    }
}
