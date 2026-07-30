package S7;

import v7.InterfaceC5133d;
import v7.InterfaceC5138i;
import w7.EnumC5179a;
import x7.AbstractC5217a;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final T7.v f3014a = new T7.v("NULL", 0);

    public static final Object a(InterfaceC5138i interfaceC5138i, Object obj, Object obj2, E7.p pVar, InterfaceC5133d frame) {
        Object invoke;
        Object m8 = T7.a.m(interfaceC5138i, obj2);
        try {
            v vVar = new v(frame, interfaceC5138i);
            if (pVar instanceof AbstractC5217a) {
                kotlin.jvm.internal.u.b(2, pVar);
                invoke = pVar.invoke(obj, vVar);
            } else {
                invoke = w8.a.m(pVar, obj, vVar);
            }
            T7.a.g(interfaceC5138i, m8);
            if (invoke == EnumC5179a.f41704n) {
                kotlin.jvm.internal.h.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            T7.a.g(interfaceC5138i, m8);
            throw th;
        }
    }
}
