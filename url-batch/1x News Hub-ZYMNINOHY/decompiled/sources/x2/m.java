package x2;

import E1.AbstractC0033i;
import a.AbstractC0129a;
import b2.C0192f;
import b2.C0195i;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import f2.InterfaceC0327d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t2.C1209t;
import t2.U;
import t2.e0;

/* loaded from: classes.dex */
public final class m extends AbstractC0326c implements w2.e {

    /* renamed from: d, reason: collision with root package name */
    public final w2.e f10790d;

    /* renamed from: e, reason: collision with root package name */
    public final d2.h f10791e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public d2.h f10792g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0300c f10793h;

    public m(w2.e eVar, d2.h hVar) {
        super(j.f10787a, d2.i.f4951a);
        this.f10790d = eVar;
        this.f10791e = hVar;
        this.f = ((Number) hVar.l(0, l.f10789e)).intValue();
    }

    @Override // w2.e
    public final Object a(Object obj, InterfaceC0300c interfaceC0300c) {
        try {
            Object i3 = i(interfaceC0300c, obj);
            return i3 == EnumC0317a.f4969a ? i3 : C0195i.f2555a;
        } catch (Throwable th) {
            this.f10792g = new h(interfaceC0300c.getContext(), th);
            throw th;
        }
    }

    @Override // f2.AbstractC0324a, f2.InterfaceC0327d
    public final InterfaceC0327d c() {
        InterfaceC0300c interfaceC0300c = this.f10793h;
        if (interfaceC0300c instanceof InterfaceC0327d) {
            return (InterfaceC0327d) interfaceC0300c;
        }
        return null;
    }

    @Override // f2.AbstractC0324a
    public final StackTraceElement e() {
        return null;
    }

    @Override // f2.AbstractC0324a
    public final Object g(Object obj) {
        Throwable a3 = C0192f.a(obj);
        if (a3 != null) {
            this.f10792g = new h(getContext(), a3);
        }
        InterfaceC0300c interfaceC0300c = this.f10793h;
        if (interfaceC0300c != null) {
            interfaceC0300c.f(obj);
        }
        return EnumC0317a.f4969a;
    }

    @Override // f2.AbstractC0326c, d2.InterfaceC0300c
    public final d2.h getContext() {
        d2.h hVar = this.f10792g;
        return hVar == null ? d2.i.f4951a : hVar;
    }

    public final Object i(InterfaceC0300c interfaceC0300c, Object obj) {
        List list;
        Comparable comparable;
        String str;
        d2.h context = interfaceC0300c.getContext();
        U u3 = (U) context.h(C1209t.f10441b);
        if (u3 != null && !u3.a()) {
            throw ((e0) u3).z();
        }
        d2.h hVar = this.f10792g;
        if (hVar != context) {
            int i3 = 0;
            if (hVar instanceof h) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((h) hVar).f10785a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.j.e(str2, "<this>");
                s2.d dVar = new s2.d(str2);
                if (dVar.hasNext()) {
                    Object next = dVar.next();
                    if (dVar.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (dVar.hasNext()) {
                            arrayList.add(dVar.next());
                        }
                        list = arrayList;
                    } else {
                        list = AbstractC0129a.r(next);
                    }
                } else {
                    list = c2.m.f2637a;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!s2.n.U((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c2.g.N(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
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
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        c2.f.M();
                        throw null;
                    }
                    String str4 = (String) obj3;
                    if ((i3 == 0 || i3 == size) && s2.n.U(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.j.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(AbstractC0033i.i(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        kotlin.jvm.internal.j.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList4.add(str);
                    }
                    i3 = i5;
                }
                StringBuilder sb = new StringBuilder(length2);
                c2.e.R(arrayList4, sb, IOUtils.LINE_SEPARATOR_UNIX, "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.l(0, new p(this))).intValue() != this.f) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f10791e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f10792g = context;
        }
        this.f10793h = interfaceC0300c;
        n nVar = o.f10795a;
        w2.e eVar = this.f10790d;
        kotlin.jvm.internal.j.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        nVar.getClass();
        Object a3 = eVar.a(obj, this);
        if (!kotlin.jvm.internal.j.a(a3, EnumC0317a.f4969a)) {
            this.f10793h = null;
        }
        return a3;
    }
}
