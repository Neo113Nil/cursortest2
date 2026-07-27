package G;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: G.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226u0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f2942k;

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0226u0) j((C2.a) obj2, (EnumC0224t0) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0226u0 c0226u0 = new C0226u0(2, aVar);
        c0226u0.f2942k = obj;
        return c0226u0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        return Boolean.valueOf(((EnumC0224t0) this.f2942k) == EnumC0224t0.f2916d);
    }
}
