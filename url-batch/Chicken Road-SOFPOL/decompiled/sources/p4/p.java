package p4;

import java.util.Iterator;
import java.util.List;
import o4.x;
import o4.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
@x("dialog")
/* loaded from: classes.dex */
public final class p extends y {
    @Override // o4.y
    public final o4.o a() {
        u0.c cVar = e.f5745a;
        return new o(this);
    }

    @Override // o4.y
    public final void d(List list, o4.v vVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((o4.d) it.next());
        }
    }

    @Override // o4.y
    public final void e(o4.d dVar, boolean z3) {
        b().e(dVar, z3);
        int T = d6.m.T((Iterable) b().f5636f.f2430d.getValue(), dVar);
        int i = 0;
        for (Object obj : (Iterable) b().f5636f.f2430d.getValue()) {
            int i8 = i + 1;
            if (i < 0) {
                s6.a.J();
                throw null;
            }
            o4.d dVar2 = (o4.d) obj;
            if (i > T) {
                b().c(dVar2);
            }
            i = i8;
        }
    }
}
