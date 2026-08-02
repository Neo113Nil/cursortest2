package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cn {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;

    public cn(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final cn c(ViewGroup viewGroup, by byVar) {
        viewGroup.getClass();
        e aj = byVar.aj();
        aj.getClass();
        return a.P(viewGroup, aj);
    }

    public final cm a(bd bdVar) {
        Object obj;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            cm cmVar = (cm) obj;
            if (ksp.b(cmVar.a, bdVar) && !cmVar.b) {
                break;
            }
        }
        return (cm) obj;
    }

    public final cm b(bd bdVar) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            cm cmVar = (cm) obj;
            if (ksp.b(cmVar.a, bdVar) && !cmVar.b) {
                break;
            }
        }
        return (cm) obj;
    }

    public final void d(cm cmVar) {
        cmVar.getClass();
        if (cmVar.f) {
            int i = cmVar.h;
            bd bdVar = cmVar.a;
            a.L(i, bdVar.J(), this.a);
            cmVar.g();
        }
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ixc.v(arrayList, ((cm) it.next()).g);
        }
        List p = ixc.p(ixc.s(arrayList));
        int size = p.size();
        for (int i = 0; i < size; i++) {
            ((ck) p.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d((cm) list.get(i2));
        }
        List p2 = ixc.p(list);
        int size3 = p2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            cm cmVar = (cm) p2.get(i3);
            if (cmVar.g.isEmpty()) {
                cmVar.a();
            }
        }
    }

    public final void f() {
        ViewGroup viewGroup = this.a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        List list = this.b;
        synchronized (list) {
            h();
            g(list);
            List<cm> q = ixc.q(this.c);
            Iterator it = q.iterator();
            while (it.hasNext()) {
                ((cm) it.next()).d = false;
            }
            for (cm cmVar : q) {
                if (by.U(2)) {
                    if (!isAttachedToWindow) {
                        a.ab(viewGroup, "Container ", " is not attached to window. ");
                    }
                    Objects.toString(cmVar);
                }
                cmVar.e(viewGroup);
            }
            List<cm> q2 = ixc.q(list);
            Iterator it2 = q2.iterator();
            while (it2.hasNext()) {
                ((cm) it2.next()).d = false;
            }
            for (cm cmVar2 : q2) {
                if (by.U(2)) {
                    if (!isAttachedToWindow) {
                        a.ab(viewGroup, "Container ", " is not attached to window. ");
                    }
                    Objects.toString(cmVar2);
                }
                cmVar2.e(viewGroup);
            }
        }
    }

    public final void g(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((cm) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ixc.v(arrayList, ((cm) it.next()).g);
        }
        List p = ixc.p(ixc.s(arrayList));
        int size2 = p.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ck ckVar = (ck) p.get(i2);
            ViewGroup viewGroup = this.a;
            if (!ckVar.b) {
                ckVar.c(viewGroup);
            }
            ckVar.b = true;
        }
    }

    public final void h() {
        for (cm cmVar : this.b) {
            if (cmVar.i == 2) {
                cmVar.h(a.M(cmVar.a.J().getVisibility()), 1);
            }
        }
    }

    public final void i(int i, int i2, gam gamVar) {
        List list = this.b;
        synchronized (list) {
            Object obj = gamVar.e;
            obj.getClass();
            cm a = a((bd) obj);
            if (a == null) {
                if (!((bd) obj).u && !((bd) obj).t) {
                    a = null;
                }
                obj.getClass();
                a = b((bd) obj);
            }
            if (a != null) {
                a.h(i, i2);
            } else {
                cl clVar = new cl(i, i2, gamVar);
                list.add(clVar);
                clVar.c(new at(this, clVar, 6));
                clVar.c(new at(this, clVar, 7));
            }
        }
    }
}
