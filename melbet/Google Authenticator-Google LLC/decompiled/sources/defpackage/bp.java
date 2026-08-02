package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bp extends ns {
    final /* synthetic */ by a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(by byVar) {
        super(false);
        this.a = byVar;
    }

    @Override // defpackage.ns
    public final void a() {
        if (by.U(3)) {
            Objects.toString(this.a);
        }
        this.a.m();
    }

    @Override // defpackage.ns
    public final void b() {
        int i;
        if (by.U(3)) {
            Objects.toString(this.a);
        }
        by byVar = this.a;
        byVar.f = true;
        byVar.af(true);
        byVar.f = false;
        if (byVar.e == null) {
            if (byVar.g.c) {
                byVar.ag(0);
                return;
            } else {
                byVar.w.c();
                return;
            }
        }
        if (!byVar.i.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(by.aa(byVar.e));
            ArrayList arrayList = byVar.i;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                    }
                }
                i2 = i;
            }
        }
        ArrayList arrayList2 = byVar.e.d;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bd bdVar = ((ce) arrayList2.get(i3)).b;
            if (bdVar != null) {
                bdVar.u = false;
            }
        }
        for (cn cnVar : byVar.i(new ArrayList(Collections.singletonList(byVar.e)), 0, 1)) {
            List list = cnVar.c;
            cnVar.g(list);
            cnVar.e(list);
        }
        ArrayList arrayList3 = byVar.e.d;
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            bd bdVar2 = ((ce) arrayList3.get(i4)).b;
            if (bdVar2 != null && bdVar2.Q == null) {
                byVar.ai(bdVar2).l();
            }
        }
        byVar.e = null;
        byVar.P();
        if (by.U(3)) {
            boolean z = byVar.g.c;
            Objects.toString(byVar);
        }
    }

    @Override // defpackage.ns
    public final void c(mx mxVar) {
        if (by.U(2)) {
            Objects.toString(this.a);
        }
        by byVar = this.a;
        ae aeVar = byVar.e;
        if (aeVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(aeVar));
            for (cn cnVar : byVar.i(arrayList, 0, 1)) {
                if (by.U(2)) {
                    float f = mxVar.b;
                }
                List list = cnVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ixc.v(arrayList2, ((cm) it.next()).g);
                }
                List p = ixc.p(ixc.s(arrayList2));
                int size = p.size();
                for (int i = 0; i < size; i++) {
                    ck ckVar = (ck) p.get(i);
                    ViewGroup viewGroup = cnVar.a;
                    ckVar.e(mxVar);
                }
            }
            ArrayList arrayList3 = byVar.i;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
            }
        }
    }

    @Override // defpackage.ns
    public final void d() {
        if (by.U(3)) {
            Objects.toString(this.a);
        }
        by byVar = this.a;
        byVar.E();
        byVar.F(new bx(byVar), false);
    }
}
