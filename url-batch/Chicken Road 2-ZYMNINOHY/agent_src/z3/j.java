package z3;

import c3.C0297i;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import g3.EnumC0441a;
import x3.C1546f;
import x3.C1559t;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f16329a = new i();

    public static c a(int i4, a aVar, int i5) {
        if ((i5 & 2) != 0) {
            aVar = a.f16290a;
        }
        if (i4 == -2) {
            if (aVar != a.f16290a) {
                return new m(1, aVar);
            }
            g.f16327z0.getClass();
            return new c(f.f16326b);
        }
        if (i4 != -1) {
            return i4 != 0 ? i4 != Integer.MAX_VALUE ? aVar == a.f16290a ? new c(i4) : new m(i4, aVar) : new c(Integer.MAX_VALUE) : aVar == a.f16290a ? new c(0) : new m(1, aVar);
        }
        if (aVar == a.f16290a) {
            return new m(1, a.f16291b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, M.b bVar, h3.c cVar) {
        n nVar;
        int i4;
        try {
            if (cVar instanceof n) {
                nVar = (n) cVar;
                int i5 = nVar.f16335c;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    nVar.f16335c = i5 - Integer.MIN_VALUE;
                    Object obj = nVar.f16334b;
                    EnumC0441a enumC0441a = EnumC0441a.f9038a;
                    i4 = nVar.f16335c;
                    if (i4 != 0) {
                        O3.l.w(obj);
                        if (nVar.getContext().n(C1559t.f16059b) != pVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        nVar.f16333a = bVar;
                        nVar.f16335c = 1;
                        C1546f c1546f = new C1546f(1, AbstractC0347t0.m(nVar));
                        c1546f.r();
                        ((o) pVar).T(new F3.g(3, c1546f));
                        if (c1546f.q() == enumC0441a) {
                            return enumC0441a;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = nVar.f16333a;
                        O3.l.w(obj);
                    }
                    bVar.invoke();
                    return C0297i.f5732a;
                }
            }
            if (i4 != 0) {
            }
            bVar.invoke();
            return C0297i.f5732a;
        } catch (Throwable th) {
            bVar.invoke();
            throw th;
        }
        nVar = new n(cVar);
        Object obj2 = nVar.f16334b;
        EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
        i4 = nVar.f16335c;
    }
}
