package f1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626u extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6624k;

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0626u) j((C2.a) obj2, (Y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0626u c0626u = new C0626u(2, aVar);
        c0626u.f6624k = obj;
        return c0626u;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        return Boolean.valueOf(!(((Y) this.f6624k) instanceof O));
    }
}
