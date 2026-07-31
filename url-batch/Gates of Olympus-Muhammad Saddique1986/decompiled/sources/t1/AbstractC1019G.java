package t1;

import java.util.List;
import java.util.ListIterator;
import m2.C0655e;
import r0.C0929z;
import t2.C1045P;

/* renamed from: t1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1019G {

    /* renamed from: a, reason: collision with root package name */
    public k f8851a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8852b;

    public abstract u a();

    public final k b() {
        k kVar = this.f8851a;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, C1016D c1016d) {
        C0655e c0655e = new C0655e(new S1.s(1, new m2.k(new S1.s(0, list), new C0929z(this, c1016d), 1)));
        while (c0655e.hasNext()) {
            b().f((C1028h) c0655e.next());
        }
    }

    public void e(C1028h c1028h, boolean z3) {
        f2.j.f(c1028h, "popUpTo");
        List list = (List) ((C1045P) b().f8895e.f8956d).getValue();
        if (!list.contains(c1028h)) {
            throw new IllegalStateException(("popBackStack was called with " + c1028h + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C1028h c1028h2 = null;
        while (f()) {
            c1028h2 = (C1028h) listIterator.previous();
            if (f2.j.a(c1028h2, c1028h)) {
                break;
            }
        }
        if (c1028h2 != null) {
            b().c(c1028h2, z3);
        }
    }

    public boolean f() {
        return true;
    }

    public u c(u uVar) {
        return uVar;
    }
}
