package s7;

import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.h9;
import com.google.android.gms.internal.measurement.i9;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.n8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.u8;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9003a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9004b;

    /* renamed from: c, reason: collision with root package name */
    public final h9 f9005c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f9006d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f9007e;

    /* renamed from: f, reason: collision with root package name */
    public final s.e f9008f;
    public final s.e g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f9009h;

    public s4(c cVar, String str, h9 h9Var, BitSet bitSet, BitSet bitSet2, s.e eVar, s.e eVar2) {
        this.f9009h = cVar;
        this.f9003a = str;
        this.f9006d = bitSet;
        this.f9007e = bitSet2;
        this.f9008f = eVar;
        this.g = new s.e(0);
        Iterator it = ((s.b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.f9004b = false;
        this.f9005c = h9Var;
    }

    public final void a(n4.t tVar) {
        int c10 = tVar.c();
        if (((Boolean) tVar.f7120c) != null) {
            this.f9007e.set(c10, true);
        }
        Boolean bool = (Boolean) tVar.f7121d;
        if (bool != null) {
            this.f9006d.set(c10, bool.booleanValue());
        }
        if (((Long) tVar.f7122e) != null) {
            Integer valueOf = Integer.valueOf(c10);
            s.e eVar = this.f9008f;
            Long l10 = (Long) eVar.get(valueOf);
            long longValue = ((Long) tVar.f7122e).longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                eVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (((Long) tVar.f7123f) != null) {
            Integer valueOf2 = Integer.valueOf(c10);
            s.e eVar2 = this.g;
            List list = (List) eVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                eVar2.put(valueOf2, list);
            }
            if (tVar.d()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.v3.a();
            q1 q1Var = (q1) this.f9009h.f1478d;
            g gVar = q1Var.f8935r;
            d0 d0Var = e0.F0;
            String str = this.f9003a;
            if (gVar.D(str, d0Var) && tVar.e()) {
                list.clear();
            }
            com.google.android.gms.internal.measurement.v3.a();
            boolean D = q1Var.f8935r.D(str, d0Var);
            Long l11 = (Long) tVar.f7123f;
            if (!D) {
                list.add(Long.valueOf(l11.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(l11.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final o8 b(int i3) {
        ArrayList arrayList;
        List list;
        n8 A = o8.A();
        A.b();
        ((o8) A.f2389e).B(i3);
        A.b();
        ((o8) A.f2389e).E(this.f9004b);
        h9 h9Var = this.f9005c;
        if (h9Var != null) {
            A.b();
            ((o8) A.f2389e).D(h9Var);
        }
        g9 B = h9.B();
        ArrayList Y = l4.Y(this.f9006d);
        B.b();
        ((h9) B.f2389e).F(Y);
        ArrayList Y2 = l4.Y(this.f9007e);
        B.b();
        ((h9) B.f2389e).D(Y2);
        s.e eVar = this.f9008f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f8369i);
            Iterator it = ((s.b) eVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l10 = (Long) eVar.get(num);
                if (l10 != null) {
                    t8 x10 = u8.x();
                    x10.b();
                    ((u8) x10.f2389e).y(intValue);
                    long longValue = l10.longValue();
                    x10.b();
                    ((u8) x10.f2389e).z(longValue);
                    arrayList2.add((u8) x10.d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            B.b();
            ((h9) B.f2389e).H(arrayList);
        }
        s.e eVar2 = this.g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f8369i);
            Iterator it2 = ((s.b) eVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                i9 y3 = j9.y();
                int intValue2 = num2.intValue();
                y3.b();
                ((j9) y3.f2389e).z(intValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    y3.b();
                    ((j9) y3.f2389e).A(list2);
                }
                arrayList3.add((j9) y3.d());
            }
            list = arrayList3;
        }
        B.b();
        ((h9) B.f2389e).J(list);
        A.b();
        ((o8) A.f2389e).C((h9) B.d());
        return (o8) A.d();
    }

    public s4(c cVar, String str) {
        this.f9009h = cVar;
        this.f9003a = str;
        this.f9004b = true;
        this.f9006d = new BitSet();
        this.f9007e = new BitSet();
        this.f9008f = new s.e(0);
        this.g = new s.e(0);
    }
}
