package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@br1("composable")
/* loaded from: classes.dex */
public final class ez extends cr1 {
    public final lz1 c = ij2.j(Boolean.FALSE);

    @Override // defpackage.cr1
    public final op1 a() {
        return new dz(this, ry.a);
    }

    @Override // defpackage.cr1
    public final void d(List list, dq1 dq1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cp1 cp1Var = (cp1) it.next();
            fp1 b = b();
            m62 m62Var = b.e;
            cp1Var.getClass();
            vo2 vo2Var = b.c;
            Iterable iterable = (Iterable) vo2Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((cp1) it2.next()) == cp1Var) {
                        Iterable iterable2 = (Iterable) m62Var.m.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((cp1) it3.next()) == cp1Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            cp1 cp1Var2 = (cp1) zv.C((List) m62Var.m.getValue());
            if (cp1Var2 != null) {
                vo2Var.j(null, sj2.d((Set) vo2Var.getValue(), cp1Var2));
            }
            vo2Var.j(null, sj2.d((Set) vo2Var.getValue(), cp1Var));
            b.f(cp1Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.cr1
    public final void e(cp1 cp1Var, boolean z) {
        b().e(cp1Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(cp1 cp1Var) {
        fp1 b = b();
        cp1Var.getClass();
        vo2 vo2Var = b.c;
        vo2Var.j(null, sj2.d((Set) vo2Var.getValue(), cp1Var));
        if (!b.h.g.contains(cp1Var)) {
            lh.g("Cannot transition entry that is not in the back stack");
        } else {
            cp1Var.w = zc1.p;
            cp1Var.b();
        }
    }
}
