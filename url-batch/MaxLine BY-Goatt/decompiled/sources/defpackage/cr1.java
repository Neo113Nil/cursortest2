package defpackage;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class cr1 {
    public fp1 a;
    public boolean b;

    public abstract op1 a();

    public final fp1 b() {
        fp1 fp1Var = this.a;
        if (fp1Var != null) {
            return fp1Var;
        }
        lh.g("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, dq1 dq1Var) {
        list.getClass();
        xl0 xl0Var = new xl0(new yl0(new ps2(new yv(0, list), new j6(25, this, dq1Var), 1), new de2(23)));
        while (xl0Var.hasNext()) {
            b().f((cp1) xl0Var.next());
        }
    }

    public void e(cp1 cp1Var, boolean z) {
        cp1Var.getClass();
        List list = (List) b().e.m.getValue();
        if (!list.contains(cp1Var)) {
            b71.k("popBackStack was called with ", cp1Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        cp1 cp1Var2 = null;
        while (f()) {
            cp1Var2 = (cp1) listIterator.previous();
            if (Intrinsics.b(cp1Var2, cp1Var)) {
                break;
            }
        }
        if (cp1Var2 != null) {
            b().c(cp1Var2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public op1 c(op1 op1Var) {
        return op1Var;
    }
}
