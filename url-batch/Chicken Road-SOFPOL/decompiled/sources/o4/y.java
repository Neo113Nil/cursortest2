package o4;

import java.util.List;
import java.util.ListIterator;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public g f5703a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5704b;

    public abstract o a();

    public final g b() {
        g gVar = this.f5703a;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, v vVar) {
        x6.c cVar = new x6.c(new x6.d(new x6.i(new d6.s(0, list), new a0.t(16, this, vVar), 1), new s1(24), 0));
        while (cVar.hasNext()) {
            b().f((d) cVar.next());
        }
    }

    public void e(d dVar, boolean z3) {
        List list = (List) b().f5635e.f2430d.getValue();
        if (!list.contains(dVar)) {
            throw new IllegalStateException(("popBackStack was called with " + dVar + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        d dVar2 = null;
        while (f()) {
            dVar2 = (d) listIterator.previous();
            if (q6.i.a(dVar2, dVar)) {
                break;
            }
        }
        if (dVar2 != null) {
            b().d(dVar2, z3);
        }
    }

    public boolean f() {
        return true;
    }

    public o c(o oVar) {
        return oVar;
    }
}
