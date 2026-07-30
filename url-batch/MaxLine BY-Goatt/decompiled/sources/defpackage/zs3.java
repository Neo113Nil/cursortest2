package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zs3 {
    public final String a;
    public final boolean b;
    public final xj3 c;
    public final BitSet d;
    public final BitSet e;
    public final hi f;
    public final hi g;
    public final /* synthetic */ nb3 h;

    public zs3(nb3 nb3Var, String str, xj3 xj3Var, BitSet bitSet, BitSet bitSet2, hi hiVar, hi hiVar2) {
        this.h = nb3Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = hiVar;
        this.g = new hi(0);
        Iterator it = ((ei) hiVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) hiVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = xj3Var;
    }

    public final void a(kb3 kb3Var) {
        int q;
        switch (kb3Var.g) {
            case 0:
                q = ((ig3) kb3Var.i).q();
                break;
            default:
                q = ((pg3) kb3Var.i).q();
                break;
        }
        boolean z = true;
        if (kb3Var.c != null) {
            this.e.set(q, true);
        }
        Boolean bool = kb3Var.d;
        if (bool != null) {
            this.d.set(q, bool.booleanValue());
        }
        if (kb3Var.e != null) {
            Integer valueOf = Integer.valueOf(q);
            hi hiVar = this.f;
            Long l = (Long) hiVar.get(valueOf);
            long longValue = kb3Var.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                hiVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (kb3Var.f != null) {
            Integer valueOf2 = Integer.valueOf(q);
            hi hiVar2 = this.g;
            List list = (List) hiVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                hiVar2.put(valueOf2, list);
            }
            boolean z2 = false;
            switch (kb3Var.g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                list.clear();
            }
            dr3.a();
            pj3 pj3Var = (pj3) this.h.m;
            ec3 ec3Var = pj3Var.p;
            tg3 tg3Var = ug3.F0;
            String str = this.a;
            if (ec3Var.G(str, tg3Var)) {
                switch (kb3Var.g) {
                    case 0:
                        z2 = ((ig3) kb3Var.i).v();
                        break;
                }
                if (z2) {
                    list.clear();
                }
            }
            dr3.a();
            boolean G = pj3Var.p.G(str, tg3Var);
            Long l2 = kb3Var.f;
            if (!G) {
                list.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(l2.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final pi3 b(int i) {
        ArrayList arrayList;
        List list;
        oi3 w = pi3.w();
        w.b();
        ((pi3) w.n).x(i);
        w.b();
        ((pi3) w.n).A(this.b);
        xj3 xj3Var = this.c;
        if (xj3Var != null) {
            w.b();
            ((pi3) w.n).z(xj3Var);
        }
        wj3 x = xj3.x();
        ArrayList e0 = bi3.e0(this.d);
        x.b();
        ((xj3) x.n).B(e0);
        ArrayList e02 = bi3.e0(this.e);
        x.b();
        ((xj3) x.n).z(e02);
        hi hiVar = this.f;
        if (hiVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(hiVar.o);
            Iterator it = ((ei) hiVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l = (Long) hiVar.get(num);
                if (l != null) {
                    yi3 t = aj3.t();
                    t.b();
                    ((aj3) t.n).u(intValue);
                    long longValue = l.longValue();
                    t.b();
                    ((aj3) t.n).v(longValue);
                    arrayList2.add((aj3) t.d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            x.b();
            ((xj3) x.n).D(arrayList);
        }
        hi hiVar2 = this.g;
        if (hiVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(hiVar2.o);
            Iterator it2 = ((ei) hiVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                zj3 u = ak3.u();
                int intValue2 = num2.intValue();
                u.b();
                ((ak3) u.n).v(intValue2);
                List list2 = (List) hiVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    u.b();
                    ((ak3) u.n).w(list2);
                }
                arrayList3.add((ak3) u.d());
            }
            list = arrayList3;
        }
        x.b();
        ((xj3) x.n).F(list);
        w.b();
        ((pi3) w.n).y((xj3) x.d());
        return (pi3) w.d();
    }

    public zs3(nb3 nb3Var, String str) {
        this.h = nb3Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new hi(0);
        this.g = new hi(0);
    }
}
