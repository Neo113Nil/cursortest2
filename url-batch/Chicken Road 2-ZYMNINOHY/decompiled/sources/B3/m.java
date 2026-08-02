package B3;

import E.AbstractC0005f;
import a.AbstractC0124a;
import c3.C0294f;
import c3.C0297i;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import f3.C0431i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import i2.AbstractC0457a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w3.AbstractC1510g;
import w3.C1507d;
import x3.C1559t;
import x3.T;
import x3.d0;

/* loaded from: classes.dex */
public final class m extends h3.c implements A3.e {

    /* renamed from: a, reason: collision with root package name */
    public final A3.e f241a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0430h f242b;

    /* renamed from: c, reason: collision with root package name */
    public final int f243c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0430h f244d;

    /* renamed from: e, reason: collision with root package name */
    public h3.c f245e;

    public m(A3.e eVar, InterfaceC0430h interfaceC0430h) {
        super(j.f238a, C0431i.f8817a);
        this.f241a = eVar;
        this.f242b = interfaceC0430h;
        this.f243c = ((Number) interfaceC0430h.e(0, l.f240e)).intValue();
    }

    public final Object b(h3.c cVar, Object obj) {
        List list;
        Comparable comparable;
        String str;
        InterfaceC0430h context = cVar.getContext();
        T t4 = (T) context.n(C1559t.f16059b);
        if (t4 != null && !t4.a()) {
            throw ((d0) t4).w();
        }
        InterfaceC0430h interfaceC0430h = this.f244d;
        if (interfaceC0430h != context) {
            int i4 = 0;
            if (interfaceC0430h instanceof h) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((h) interfaceC0430h).f236a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                C1507d c1507d = new C1507d(str2);
                if (c1507d.hasNext()) {
                    Object next = c1507d.next();
                    if (c1507d.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (c1507d.hasNext()) {
                            arrayList.add(c1507d.next());
                        }
                        list = arrayList;
                    } else {
                        list = AbstractC0124a.H(next);
                    }
                } else {
                    list = d3.q.f8333a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!AbstractC1510g.j0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(d3.k.Y(arrayList2));
                int size = arrayList2.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj3 = arrayList2.get(i5);
                    i5++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length) {
                            i6 = -1;
                            break;
                        }
                        if (!AbstractC0457a.w(str3.charAt(i6))) {
                            break;
                        }
                        i6++;
                    }
                    if (i6 == -1) {
                        i6 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i6));
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
                    int i7 = i4 + 1;
                    if (i4 < 0) {
                        d3.j.X();
                        throw null;
                    }
                    String str4 = (String) obj4;
                    if ((i4 == 0 || i4 == size2) && AbstractC1510g.j0(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(AbstractC0005f.k(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        kotlin.jvm.internal.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i4 = i7;
                }
                StringBuilder sb = new StringBuilder(length2);
                d3.i.e0(arrayList4, sb, IOUtils.LINE_SEPARATOR_UNIX, "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.e(0, new p(this))).intValue() != this.f243c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f242b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f244d = context;
        }
        this.f245e = cVar;
        o3.q qVar = o.f247a;
        A3.e eVar = this.f241a;
        kotlin.jvm.internal.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a3 = qVar.a(eVar, obj, this);
        if (!kotlin.jvm.internal.i.a(a3, EnumC0441a.f9038a)) {
            this.f245e = null;
        }
        return a3;
    }

    @Override // A3.e
    public final Object emit(Object obj, InterfaceC0425c interfaceC0425c) {
        try {
            Object b4 = b((h3.c) interfaceC0425c, obj);
            return b4 == EnumC0441a.f9038a ? b4 : C0297i.f5732a;
        } catch (Throwable th) {
            this.f244d = new h(interfaceC0425c.getContext(), th);
            throw th;
        }
    }

    @Override // h3.AbstractC0448a, h3.d
    public final h3.d getCallerFrame() {
        h3.c cVar = this.f245e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // h3.c, f3.InterfaceC0425c
    public final InterfaceC0430h getContext() {
        InterfaceC0430h interfaceC0430h = this.f244d;
        return interfaceC0430h == null ? C0431i.f8817a : interfaceC0430h;
    }

    @Override // h3.AbstractC0448a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        Throwable a3 = C0294f.a(obj);
        if (a3 != null) {
            this.f244d = new h(getContext(), a3);
        }
        h3.c cVar = this.f245e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return EnumC0441a.f9038a;
    }
}
