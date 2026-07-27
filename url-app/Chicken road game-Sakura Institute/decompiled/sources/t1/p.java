package t1;

import Z2.S;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import s1.C1193i;
import s1.E;
import s1.G;
import s1.H;
import z2.C1403G;
import z2.C1441y;

@Metadata
@G("dialog")
/* loaded from: classes.dex */
public final class p extends H {
    @Override // s1.H
    public final s1.v a() {
        O.a aVar = e.f10648a;
        return new o(this);
    }

    @Override // s1.H
    public final void d(List list, E e4) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((C1193i) it.next());
        }
    }

    @Override // s1.H
    public final void e(C1193i c1193i, boolean z4) {
        b().e(c1193i, z4);
        int t4 = C1403G.t((Iterable) ((S) b().f10532f.f4611d).getValue(), c1193i);
        int i2 = 0;
        for (Object obj : (Iterable) ((S) b().f10532f.f4611d).getValue()) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                C1441y.g();
                throw null;
            }
            C1193i c1193i2 = (C1193i) obj;
            if (i2 > t4) {
                b().b(c1193i2);
            }
            i2 = i4;
        }
    }
}
