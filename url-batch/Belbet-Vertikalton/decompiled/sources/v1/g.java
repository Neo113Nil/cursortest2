package v1;

import X0.k;
import X0.l;
import X0.m;
import b1.EnumC0098a;
import c1.AbstractC0106c;
import c1.InterfaceC0107d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r1.C0367q;
import r1.N;
import r1.V;

/* loaded from: classes.dex */
public final class g extends AbstractC0106c implements u1.c {

    /* renamed from: a, reason: collision with root package name */
    public final u1.c f4452a;

    /* renamed from: b, reason: collision with root package name */
    public final a1.i f4453b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4454c;

    /* renamed from: d, reason: collision with root package name */
    public a1.i f4455d;
    public AbstractC0106c e;

    public g(u1.c cVar, a1.i iVar) {
        super(d.f4449a, a1.j.f1673a);
        this.f4452a = cVar;
        this.f4453b = iVar;
        this.f4454c = ((Number) iVar.q(0, f.f4451b)).intValue();
    }

    public final Object a(AbstractC0106c abstractC0106c, Object obj) {
        Comparable comparable;
        String str;
        a1.i context = abstractC0106c.getContext();
        N n2 = (N) context.d(C0367q.f4090b);
        if (n2 != null && !n2.a()) {
            throw ((V) n2).o();
        }
        a1.i iVar = this.f4455d;
        if (iVar != context) {
            int i = 0;
            if (iVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) iVar).f4447a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                j1.h.e(str2, "<this>");
                List D0 = q1.e.D0(str2);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : D0) {
                    if (!q1.e.B0((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(m.m0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            i2 = -1;
                            break;
                        }
                        if (!H1.d.R(str3.charAt(i2))) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 == -1) {
                        i2 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i2));
                }
                Iterator it2 = arrayList2.iterator();
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
                D0.size();
                int size = D0.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : D0) {
                    int i3 = i + 1;
                    if (i < 0) {
                        l.l0();
                        throw null;
                    }
                    String str4 = (String) obj3;
                    if ((i == 0 || i == size) && q1.e.B0(str4)) {
                        str = null;
                    } else {
                        j1.h.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        j1.h.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i = i3;
                }
                StringBuilder sb = new StringBuilder(length2);
                k.o0(arrayList3, sb, "\n", "", "", -1, "...", null);
                String sb2 = sb.toString();
                j1.h.d(sb2, "toString(...)");
                throw new IllegalStateException(sb2.toString());
            }
            if (((Number) context.q(0, new j(this))).intValue() != this.f4454c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f4453b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f4455d = context;
        }
        this.e = abstractC0106c;
        h hVar = i.f4456a;
        u1.c cVar = this.f4452a;
        j1.h.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        hVar.getClass();
        Object emit = cVar.emit(obj, this);
        if (!j1.h.a(emit, EnumC0098a.f2223a)) {
            this.e = null;
        }
        return emit;
    }

    @Override // u1.c
    public final Object emit(Object obj, a1.d dVar) {
        try {
            Object a2 = a((AbstractC0106c) dVar, obj);
            return a2 == EnumC0098a.f2223a ? a2 : W0.i.f1345a;
        } catch (Throwable th) {
            this.f4455d = new c(dVar.getContext(), th);
            throw th;
        }
    }

    @Override // c1.AbstractC0104a, c1.InterfaceC0107d
    public final InterfaceC0107d getCallerFrame() {
        AbstractC0106c abstractC0106c = this.e;
        if (abstractC0106c != null) {
            return abstractC0106c;
        }
        return null;
    }

    @Override // c1.AbstractC0106c, a1.d
    public final a1.i getContext() {
        a1.i iVar = this.f4455d;
        return iVar == null ? a1.j.f1673a : iVar;
    }

    @Override // c1.AbstractC0104a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // c1.AbstractC0104a
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = W0.f.a(obj);
        if (a2 != null) {
            this.f4455d = new c(getContext(), a2);
        }
        AbstractC0106c abstractC0106c = this.e;
        if (abstractC0106c != null) {
            abstractC0106c.resumeWith(obj);
        }
        return EnumC0098a.f2223a;
    }
}
