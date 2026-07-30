package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ic3 extends zb3 {
    public final ArrayList o;
    public final ArrayList p;
    public final js0 q;

    public ic3(String str, ArrayList arrayList, List list, js0 js0Var) {
        super(str);
        this.o = new ArrayList();
        this.q = js0Var;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.o.add(((kc3) obj).zzc());
            }
        }
        this.p = new ArrayList(list);
    }

    @Override // defpackage.zb3
    public final kc3 h(js0 js0Var, List list) {
        qc3 qc3Var;
        js0 L = this.q.L();
        tt1 tt1Var = (tt1) L.p;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.o;
            int size = arrayList.size();
            qc3Var = kc3.e;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                L.O((String) arrayList.get(i2), ((tt1) js0Var.p).x(js0Var, (kc3) list.get(i2)));
            } else {
                L.O((String) arrayList.get(i2), qc3Var);
            }
            i2++;
        }
        ArrayList arrayList2 = this.p;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            kc3 kc3Var = (kc3) obj;
            kc3 x = tt1Var.x(L, kc3Var);
            if (x instanceof lc3) {
                x = tt1Var.x(L, kc3Var);
            }
            if (x instanceof vb3) {
                return ((vb3) x).m;
            }
        }
        return qc3Var;
    }

    @Override // defpackage.zb3, defpackage.kc3
    public final kc3 k() {
        return new ic3(this);
    }

    public ic3(ic3 ic3Var) {
        super(ic3Var.m);
        ArrayList arrayList = new ArrayList(ic3Var.o.size());
        this.o = arrayList;
        arrayList.addAll(ic3Var.o);
        ArrayList arrayList2 = new ArrayList(ic3Var.p.size());
        this.p = arrayList2;
        arrayList2.addAll(ic3Var.p);
        this.q = ic3Var.q;
    }
}
