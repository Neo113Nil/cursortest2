package a1;

import W0.C0079t;
import W0.P;
import W0.Z;
import a.AbstractC0086a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends I0.b implements Z0.e {

    /* renamed from: h, reason: collision with root package name */
    public final Z0.e f1163h;

    /* renamed from: i, reason: collision with root package name */
    public final G0.i f1164i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1165j;

    /* renamed from: k, reason: collision with root package name */
    public G0.i f1166k;

    /* renamed from: l, reason: collision with root package name */
    public I0.b f1167l;

    public n(Z0.e eVar, G0.i iVar) {
        super(k.f1160e, G0.j.f500e);
        this.f1163h = eVar;
        this.f1164i = iVar;
        this.f1165j = ((Number) iVar.h(0, m.f1162f)).intValue();
    }

    @Override // Z0.e
    public final Object a(Object obj, I0.b bVar) {
        try {
            Object p2 = p(bVar, obj);
            return p2 == H0.a.f511e ? p2 : D0.h.f206a;
        } catch (Throwable th) {
            this.f1166k = new i(bVar.e(), th);
            throw th;
        }
    }

    @Override // I0.b, I0.c
    public final I0.c d() {
        I0.b bVar = this.f1167l;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    @Override // I0.b, G0.d
    public final G0.i e() {
        G0.i iVar = this.f1166k;
        return iVar == null ? G0.j.f500e : iVar;
    }

    @Override // I0.b
    public final StackTraceElement l() {
        return null;
    }

    @Override // I0.b
    public final Object m(Object obj) {
        Throwable a2 = D0.e.a(obj);
        if (a2 != null) {
            this.f1166k = new i(e(), a2);
        }
        I0.b bVar = this.f1167l;
        if (bVar != null) {
            bVar.g(obj);
        }
        return H0.a.f511e;
    }

    public final Object p(I0.b bVar, Object obj) {
        List list;
        Comparable comparable;
        String str;
        G0.i e2 = bVar.e();
        P p2 = (P) e2.m(C0079t.f974f);
        if (p2 != null && !p2.a()) {
            throw ((Z) p2).z();
        }
        G0.i iVar = this.f1166k;
        if (iVar != e2) {
            int i2 = 0;
            if (iVar instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f1158e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                P0.h.e(str2, "<this>");
                V0.a aVar = new V0.a(str2);
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
                        list = AbstractC0086a.x(next);
                    }
                } else {
                    list = E0.o.f219e;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!V0.i.P((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i4 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i4);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i4++;
                    }
                    if (i4 == -1) {
                        i4 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i4));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
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
                int size2 = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i2 == 0 || i2 == size2) && V0.i.P(str4)) {
                        str = null;
                    } else {
                        P0.h.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        P0.h.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i2 = i5;
                }
                StringBuilder sb = new StringBuilder(length2);
                E0.f.P(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) e2.h(0, new q(this))).intValue() != this.f1165j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1164i + ",\n\t\tbut emission happened in " + e2 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f1166k = e2;
        }
        this.f1167l = bVar;
        O0.q qVar = p.f1169a;
        Z0.e eVar = this.f1163h;
        P0.h.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object k2 = qVar.k(eVar, obj, this);
        if (!P0.h.a(k2, H0.a.f511e)) {
            this.f1167l = null;
        }
        return k2;
    }
}
