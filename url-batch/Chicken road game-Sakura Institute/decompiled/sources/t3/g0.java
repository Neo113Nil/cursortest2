package t3;

import java.util.List;
import java.util.ListIterator;
import s1.l0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public k f8789a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8790b;

    public abstract v a();

    public final k b() {
        k kVar = this.f8789a;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, d0 d0Var) {
        i.z zVar = new i.z(new e6.s(1, new y6.k(new e6.s(0, list), new l0(this, d0Var), 1)));
        while (zVar.hasNext()) {
            b().f((h) zVar.next());
        }
    }

    public void e(h hVar, boolean z8) {
        r6.k.f(hVar, "popUpTo");
        List list = (List) b().f8815e.f3566f.getValue();
        if (!list.contains(hVar)) {
            throw new IllegalStateException(("popBackStack was called with " + hVar + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        h hVar2 = null;
        while (f()) {
            hVar2 = (h) listIterator.previous();
            if (r6.k.a(hVar2, hVar)) {
                break;
            }
        }
        if (hVar2 != null) {
            b().c(hVar2, z8);
        }
    }

    public boolean f() {
        return true;
    }

    public v c(v vVar) {
        return vVar;
    }
}
