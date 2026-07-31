package q1;

import F.C0047j0;
import g2.C0409e;
import java.util.List;
import java.util.ListIterator;
import n2.C0692Q;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public C0787k f6872a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6873b;

    public abstract w a();

    public final C0787k b() {
        C0787k c0787k = this.f6872a;
        if (c0787k != null) {
            return c0787k;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, G g3) {
        C0409e c0409e = new C0409e(new M1.s(1, new g2.l(new M1.s(0, list), new C0047j0(this, g3), 1)));
        while (c0409e.hasNext()) {
            b().f((C0784h) c0409e.next());
        }
    }

    public void e(C0784h c0784h, boolean z3) {
        Z1.i.f(c0784h, "popUpTo");
        List list = (List) ((C0692Q) b().f6916e.f6272d).getValue();
        if (!list.contains(c0784h)) {
            throw new IllegalStateException(("popBackStack was called with " + c0784h + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C0784h c0784h2 = null;
        while (f()) {
            c0784h2 = (C0784h) listIterator.previous();
            if (Z1.i.a(c0784h2, c0784h)) {
                break;
            }
        }
        if (c0784h2 != null) {
            b().c(c0784h2, z3);
        }
    }

    public boolean f() {
        return true;
    }

    public w c(w wVar) {
        return wVar;
    }
}
