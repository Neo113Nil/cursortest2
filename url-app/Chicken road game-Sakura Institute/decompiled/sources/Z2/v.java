package Z2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class v extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ int f4732k;

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((v) j((C2.a) obj2, Integer.valueOf(((Number) obj).intValue()))).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        v vVar = new v(2, aVar);
        vVar.f4732k = ((Number) obj).intValue();
        return vVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        return Boolean.valueOf(this.f4732k > 0);
    }
}
