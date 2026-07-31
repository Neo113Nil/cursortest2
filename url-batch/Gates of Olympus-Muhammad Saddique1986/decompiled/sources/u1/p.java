package u1;

import java.util.Iterator;
import java.util.List;
import t1.AbstractC1019G;
import t1.C1016D;
import t1.C1028h;
import t1.InterfaceC1018F;
import t2.C1045P;

@InterfaceC1018F("dialog")
/* loaded from: classes.dex */
public final class p extends AbstractC1019G {
    @Override // t1.AbstractC1019G
    public final t1.u a() {
        Q.a aVar = e.f9586a;
        return new o(this);
    }

    @Override // t1.AbstractC1019G
    public final void d(List list, C1016D c1016d) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C1028h) it.next());
        }
    }

    @Override // t1.AbstractC1019G
    public final void e(C1028h c1028h, boolean z3) {
        b().e(c1028h, z3);
        int M02 = S1.l.M0((Iterable) ((C1045P) b().f8896f.f8956d).getValue(), c1028h);
        int i3 = 0;
        for (Object obj : (Iterable) ((C1045P) b().f8896f.f8956d).getValue()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                S1.m.D0();
                throw null;
            }
            C1028h c1028h2 = (C1028h) obj;
            if (i3 > M02) {
                b().b(c1028h2);
            }
            i3 = i4;
        }
    }
}
