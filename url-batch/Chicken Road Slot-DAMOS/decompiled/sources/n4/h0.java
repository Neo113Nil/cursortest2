package n4;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public k f7070a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7071b;

    public abstract s a();

    public final k b() {
        k kVar = this.f7070a;
        if (kVar != null) {
            return kVar;
        }
        kotlin.collections.i0.l("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, a0 a0Var) {
        list.getClass();
        de.c cVar = new de.c(new de.d(new de.o(new de.j(2, list), new a1.d(12, this, a0Var), 1), new a1.f(14), 0));
        while (cVar.hasNext()) {
            b().f((h) cVar.next());
        }
    }

    public void e(h hVar, boolean z10) {
        List list = (List) b().f7081e.f5239d.getValue();
        if (!list.contains(hVar)) {
            kotlin.collections.i0.m("popBackStack was called with ", hVar, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        h hVar2 = null;
        while (f()) {
            hVar2 = (h) listIterator.previous();
            if (Intrinsics.a(hVar2, hVar)) {
                break;
            }
        }
        if (hVar2 != null) {
            b().d(hVar2, z10);
        }
    }

    public boolean f() {
        return true;
    }

    public s c(s sVar) {
        return sVar;
    }
}
