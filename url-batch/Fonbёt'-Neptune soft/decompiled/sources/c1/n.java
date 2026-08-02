package c1;

import Y0.C0125t;
import Y0.P;
import Y0.Z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends J0.b implements b1.e {

    /* renamed from: h, reason: collision with root package name */
    public final b1.e f2021h;

    /* renamed from: i, reason: collision with root package name */
    public final H0.i f2022i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2023j;

    /* renamed from: k, reason: collision with root package name */
    public H0.i f2024k;

    /* renamed from: l, reason: collision with root package name */
    public H0.d f2025l;

    public n(b1.e eVar, H0.i iVar) {
        super(k.f2018e, H0.j.f503e);
        this.f2021h = eVar;
        this.f2022i = iVar;
        this.f2023j = ((Number) iVar.m(0, m.f2020f)).intValue();
    }

    @Override // b1.e
    public final Object a(Object obj, H0.d dVar) {
        try {
            Object p2 = p(dVar, obj);
            return p2 == I0.a.f733e ? p2 : F0.h.f469a;
        } catch (Throwable th) {
            this.f2024k = new i(dVar.f(), th);
            throw th;
        }
    }

    @Override // J0.b, J0.c
    public final J0.c e() {
        H0.d dVar = this.f2025l;
        if (dVar instanceof J0.c) {
            return (J0.c) dVar;
        }
        return null;
    }

    @Override // J0.b, H0.d
    public final H0.i f() {
        H0.i iVar = this.f2024k;
        return iVar == null ? H0.j.f503e : iVar;
    }

    @Override // J0.b
    public final StackTraceElement k() {
        return null;
    }

    @Override // J0.b
    public final Object l(Object obj) {
        Throwable a2 = F0.e.a(obj);
        if (a2 != null) {
            this.f2024k = new i(f(), a2);
        }
        H0.d dVar = this.f2025l;
        if (dVar != null) {
            dVar.j(obj);
        }
        return I0.a.f733e;
    }

    public final Object p(H0.d dVar, Object obj) {
        Comparable comparable;
        String str;
        H0.i f2 = dVar.f();
        P p2 = (P) f2.k(C0125t.f1230f);
        if (p2 != null && !p2.b()) {
            throw ((Z) p2).A();
        }
        H0.i iVar = this.f2024k;
        if (iVar != f2) {
            int i2 = 0;
            if (iVar instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f2016e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                Q0.h.e(str2, "<this>");
                List asList = Arrays.asList("\r\n", "\n", "\r");
                Q0.h.d(asList, "asList(...)");
                List S2 = W0.c.S(new W0.g(new X0.b(str2, 0, 0, new X0.i(asList, false)), new D0.P(2, str2)));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : S2) {
                    if (!X0.j.R((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
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
                    arrayList2.add(Integer.valueOf(i3));
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
                S2.size();
                int size = S2.size() - 1;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : S2) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj3;
                    if ((i2 == 0 || i2 == size) && X0.j.R(str4)) {
                        str = null;
                    } else {
                        Q0.h.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        Q0.h.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i2 = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                G0.d.P(arrayList3, sb, "\n", "", "", -1, "...", null);
                String sb2 = sb.toString();
                Q0.h.d(sb2, "toString(...)");
                throw new IllegalStateException(sb2.toString());
            }
            if (((Number) f2.m(0, new q(this))).intValue() != this.f2023j) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f2022i + ",\n\t\tbut emission happened in " + f2 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f2024k = f2;
        }
        this.f2025l = dVar;
        o oVar = p.f2027a;
        b1.e eVar = this.f2021h;
        Q0.h.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object a2 = eVar.a(obj, this);
        if (!Q0.h.a(a2, I0.a.f733e)) {
            this.f2025l = null;
        }
        return a2;
    }
}
