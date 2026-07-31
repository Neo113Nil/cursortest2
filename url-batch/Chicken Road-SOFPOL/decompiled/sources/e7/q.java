package e7;

import a0.w0;
import a7.x;
import b6.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends i6.c implements d7.g {

    /* renamed from: g, reason: collision with root package name */
    public final d7.g f2568g;

    /* renamed from: h, reason: collision with root package name */
    public final g6.h f2569h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public g6.h f2570j;

    /* renamed from: k, reason: collision with root package name */
    public g6.c f2571k;

    public q(d7.g gVar, g6.h hVar) {
        super(o.f2566d, g6.i.f3046d);
        this.f2568g = gVar;
        this.f2569h = hVar;
        this.i = ((Number) hVar.g(0, new w0(9))).intValue();
    }

    @Override // d7.g
    public final Object a(Object obj, g6.c cVar) {
        try {
            Object r7 = r(cVar, obj);
            return r7 == h6.a.f3204d ? r7 : c6.m.f1757a;
        } catch (Throwable th) {
            this.f2570j = new m(cVar.f(), th);
            throw th;
        }
    }

    @Override // i6.a, i6.d
    public final i6.d e() {
        g6.c cVar = this.f2571k;
        if (cVar instanceof i6.d) {
            return (i6.d) cVar;
        }
        return null;
    }

    @Override // i6.c, g6.c
    public final g6.h f() {
        g6.h hVar = this.f2570j;
        return hVar == null ? g6.i.f3046d : hVar;
    }

    @Override // i6.a
    public final StackTraceElement n() {
        return null;
    }

    @Override // i6.a
    public final Object p(Object obj) {
        Throwable a8 = c6.i.a(obj);
        if (a8 != null) {
            this.f2570j = new m(f(), a8);
        }
        g6.c cVar = this.f2571k;
        if (cVar != null) {
            cVar.k(obj);
        }
        return h6.a.f3204d;
    }

    public final Object r(g6.c cVar, Object obj) {
        List list;
        Comparable comparable;
        String str;
        g6.h f6 = cVar.f();
        x.d(f6);
        g6.h hVar = this.f2570j;
        if (hVar != f6) {
            int i = 0;
            if (hVar instanceof m) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((m) hVar).f2565e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                q6.i.e(str2, "<this>");
                y6.a aVar = new y6.a(str2);
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
                        list = s6.a.x(next);
                    }
                } else {
                    list = d6.u.f2326d;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!y6.j.e0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(d6.n.M(arrayList2, 10));
                int size = arrayList2.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj3 = arrayList2.get(i8);
                    i8++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            i9 = -1;
                            break;
                        }
                        if (!r2.o.X(str3.charAt(i9))) {
                            break;
                        }
                        i9++;
                    }
                    if (i9 == -1) {
                        i9 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i9));
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
                int t3 = s6.a.t(list);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list) {
                    int i10 = i + 1;
                    if (i < 0) {
                        s6.a.J();
                        throw null;
                    }
                    String str4 = (String) obj4;
                    if ((i == 0 || i == t3) && y6.j.e0(str4)) {
                        str = null;
                    } else {
                        q6.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        q6.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i = i10;
                }
                StringBuilder sb = new StringBuilder(length2);
                d6.m.U(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) f6.g(0, new j0(2, this))).intValue() != this.i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f2569h + ",\n\t\tbut emission happened in " + f6 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f2570j = f6;
        }
        this.f2571k = cVar;
        p6.f fVar = s.f2573a;
        d7.g gVar = this.f2568g;
        q6.i.c(gVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object d8 = fVar.d(gVar, obj, this);
        if (!q6.i.a(d8, h6.a.f3204d)) {
            this.f2571k = null;
        }
        return d8;
    }
}
