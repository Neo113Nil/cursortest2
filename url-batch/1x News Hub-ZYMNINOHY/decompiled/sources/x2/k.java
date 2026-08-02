package x2;

import d2.InterfaceC0300c;
import e2.EnumC0317a;
import kotlin.jvm.internal.t;
import n0.C1148j;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final C1148j f10788a = new C1148j("NULL");

    public static /* synthetic */ w2.d a(i iVar, u2.c cVar, int i3, v2.a aVar, int i4) {
        d2.h hVar = cVar;
        if ((i4 & 1) != 0) {
            hVar = d2.i.f4951a;
        }
        if ((i4 & 2) != 0) {
            i3 = -3;
        }
        if ((i4 & 4) != 0) {
            aVar = v2.a.f10571a;
        }
        return iVar.i(hVar, i3, aVar);
    }

    public static final Object b(d2.h hVar, Object obj, Object obj2, l2.p pVar, InterfaceC0300c frame) {
        Object invoke;
        Object l3 = y2.a.l(hVar, obj2);
        try {
            r rVar = new r(frame, hVar);
            if (pVar == null) {
                invoke = C2.b.L(pVar, obj, rVar);
            } else {
                t.b(2, pVar);
                invoke = pVar.invoke(obj, rVar);
            }
            y2.a.f(hVar, l3);
            if (invoke == EnumC0317a.f4969a) {
                kotlin.jvm.internal.j.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            y2.a.f(hVar, l3);
            throw th;
        }
    }
}
