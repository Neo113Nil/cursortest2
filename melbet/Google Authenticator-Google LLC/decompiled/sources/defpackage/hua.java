package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hua extends htl {
    private List b;

    public hua(heb hebVar, boolean z) {
        super(hebVar, z, true);
        List E = hebVar.isEmpty() ? Collections.EMPTY_LIST : hnu.E(hebVar.size());
        for (int i = 0; i < hebVar.size(); i++) {
            E.add(null);
        }
        this.b = E;
        v();
    }

    @Override // defpackage.htl
    public final void e(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new bry(obj, (short[]) null));
        }
    }

    @Override // defpackage.htl
    public final void g() {
        List<bry> list = this.b;
        if (list != null) {
            ArrayList E = hnu.E(list.size());
            for (bry bryVar : list) {
                E.add(bryVar != null ? bryVar.a : null);
            }
            o(DesugarCollections.unmodifiableList(E));
        }
    }

    @Override // defpackage.htl
    public final void x(int i) {
        super.x(i);
        this.b = null;
    }
}
