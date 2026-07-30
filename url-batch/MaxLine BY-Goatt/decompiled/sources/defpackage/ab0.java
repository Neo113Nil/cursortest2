package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
@br1("dialog")
/* loaded from: classes.dex */
public final class ab0 extends cr1 {
    @Override // defpackage.cr1
    public final op1 a() {
        my myVar = uy.a;
        return new za0(this);
    }

    @Override // defpackage.cr1
    public final void d(List list, dq1 dq1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((cp1) it.next());
        }
    }

    @Override // defpackage.cr1
    public final void e(cp1 cp1Var, boolean z) {
        b().e(cp1Var, z);
        int x = zv.x((Iterable) b().f.m.getValue(), cp1Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.m.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                qv.k();
                throw null;
            }
            cp1 cp1Var2 = (cp1) obj;
            if (i > x) {
                b().b(cp1Var2);
            }
            i = i2;
        }
    }
}
