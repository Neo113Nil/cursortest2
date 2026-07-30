package Q0;

import M0.C0061t;
import M0.P;
import M0.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u0.AbstractC0244d;
import u0.C0247g;

/* loaded from: classes.dex */
public final class n extends y0.b implements P0.e {

    /* renamed from: h, reason: collision with root package name */
    public final P0.e f854h;

    /* renamed from: i, reason: collision with root package name */
    public final w0.i f855i;

    /* renamed from: j, reason: collision with root package name */
    public final int f856j;

    /* renamed from: k, reason: collision with root package name */
    public w0.i f857k;

    /* renamed from: l, reason: collision with root package name */
    public w0.d f858l;

    public n(P0.e eVar, w0.i iVar) {
        super(k.f851e, w0.j.f3082e);
        this.f854h = eVar;
        this.f855i = iVar;
        this.f856j = ((Number) iVar.h(0, m.f853f)).intValue();
    }

    @Override // P0.e
    public final Object a(Object obj, w0.d dVar) {
        try {
            Object n2 = n(dVar, obj);
            return n2 == x0.a.f3094e ? n2 : C0247g.f3005a;
        } catch (Throwable th) {
            this.f857k = new i(th, dVar.getContext());
            throw th;
        }
    }

    @Override // y0.b, y0.c
    public final y0.c g() {
        w0.d dVar = this.f858l;
        if (dVar instanceof y0.c) {
            return (y0.c) dVar;
        }
        return null;
    }

    @Override // y0.b, w0.d
    public final w0.i getContext() {
        w0.i iVar = this.f857k;
        return iVar == null ? w0.j.f3082e : iVar;
    }

    @Override // y0.b
    public final StackTraceElement k() {
        return null;
    }

    @Override // y0.b
    public final Object l(Object obj) {
        Throwable a2 = AbstractC0244d.a(obj);
        if (a2 != null) {
            this.f857k = new i(a2, getContext());
        }
        w0.d dVar = this.f858l;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return x0.a.f3094e;
    }

    public final Object n(w0.d dVar, Object obj) {
        List list;
        Comparable comparable;
        String str;
        w0.i context = dVar.getContext();
        P p2 = (P) context.f(C0061t.f687f);
        if (p2 != null && !p2.b()) {
            throw ((Z) p2).y();
        }
        w0.i iVar = this.f857k;
        if (iVar != context) {
            int i2 = 0;
            if (iVar instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f849e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                F0.i.e(str2, "<this>");
                L0.a aVar = new L0.a(str2);
                if (aVar.hasNext()) {
                    Object next = aVar.next();
                    if (aVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (aVar.hasNext()) {
                            arrayList.add(aVar.next());
                        }
                        list = arrayList;
                    } else {
                        list = o.g.s(next);
                    }
                } else {
                    list = v0.l.f3013e;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!L0.h.Q((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i3);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                list.size();
                int size = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj3;
                    if ((i2 == 0 || i2 == size) && L0.h.Q(str4)) {
                        str = null;
                    } else {
                        F0.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        F0.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i2 = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                v0.d.C(arrayList4, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.h(0, new q(this))).intValue() != this.f856j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f855i + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f857k = context;
        }
        this.f858l = dVar;
        o oVar = p.f860a;
        P0.e eVar = this.f854h;
        F0.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object a2 = eVar.a(obj, this);
        if (!F0.i.a(a2, x0.a.f3094e)) {
            this.f858l = null;
        }
        return a2;
    }
}
