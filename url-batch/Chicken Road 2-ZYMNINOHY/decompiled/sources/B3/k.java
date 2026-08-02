package B3;

import C3.v;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f3.C0431i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;
import y3.C1578c;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final v f239a = new v("NULL", 0);

    public static A3.d a(A3.c cVar, C1578c c1578c, int i4, z3.a aVar, int i5) {
        InterfaceC0430h interfaceC0430h = c1578c;
        if ((i5 & 1) != 0) {
            interfaceC0430h = C0431i.f8817a;
        }
        if ((i5 & 2) != 0) {
            i4 = -3;
        }
        if ((i5 & 4) != 0) {
            aVar = z3.a.f16290a;
        }
        z3.a aVar2 = cVar.f231c;
        int i6 = cVar.f230b;
        InterfaceC0430h interfaceC0430h2 = cVar.f229a;
        InterfaceC0430h f4 = interfaceC0430h.f(interfaceC0430h2);
        if (aVar == z3.a.f16290a) {
            if (i6 != -3) {
                if (i4 != -3) {
                    if (i6 != -2) {
                        if (i4 != -2) {
                            i4 += i6;
                            if (i4 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i4 = i6;
            }
            aVar = aVar2;
        }
        return (kotlin.jvm.internal.i.a(f4, interfaceC0430h2) && i4 == i6 && aVar == aVar2) ? cVar : new A3.c(cVar.f77e, f4, i4, aVar);
    }

    public static final Object b(InterfaceC0430h interfaceC0430h, Object obj, Object obj2, o3.p pVar, InterfaceC0425c frame) {
        Object invoke;
        Object l4 = C3.a.l(interfaceC0430h, obj2);
        try {
            r rVar = new r(frame, interfaceC0430h);
            if (pVar == null) {
                invoke = AbstractC0347t0.v(pVar, obj, rVar);
            } else {
                kotlin.jvm.internal.s.a(2, pVar);
                invoke = pVar.invoke(obj, rVar);
            }
            C3.a.f(interfaceC0430h, l4);
            if (invoke == EnumC0441a.f9038a) {
                kotlin.jvm.internal.i.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            C3.a.f(interfaceC0430h, l4);
            throw th;
        }
    }
}
