package xe;

import a2.r;
import n0.i0;
import n0.r0;
import n0.u;
import n0.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final v f10567a;

    static {
        new r0(new u(6));
        new r0(new u(7));
        f10567a = new v(new u(8));
        new r0(new u(9));
    }

    public static final lf.a a(i0 i0Var) {
        v vVar = f10567a;
        try {
            a aVar = (a) i0Var.j(vVar);
            if (aVar.f10566b == null) {
                aVar.f10566b = aVar.f10565a.invoke();
            }
            Object obj = aVar.f10566b;
            if (obj != null) {
                return (lf.a) obj;
            }
            throw new IllegalStateException("Can't retrieve Koin context value. Ensure Koin is properly initialized with startKoin() or KoinApplication.");
        } catch (Exception e2) {
            a aVar2 = (a) i0Var.j(vVar);
            Object invoke = aVar2.f10565a.invoke();
            aVar2.f10566b = invoke;
            lf.a aVar3 = (lf.a) invoke;
            if (aVar3 != null) {
                return aVar3;
            }
            r.n(e2, "Can't get Koin scope due to error: ");
            return null;
        }
    }
}
