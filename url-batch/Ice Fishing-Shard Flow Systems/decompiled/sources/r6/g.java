package r6;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import p6.EnumC0830a;

/* loaded from: classes.dex */
public abstract class g extends e {

    /* renamed from: l, reason: collision with root package name */
    public final q6.d f7558l;

    public g(q6.d dVar, CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a) {
        super(coroutineContext, i2, enumC0830a);
        this.f7558l = dVar;
    }

    @Override // r6.e
    public final Object a(p6.q qVar, V5.b bVar) {
        Object c7 = c(new x(qVar), bVar);
        return c7 == W5.a.f2787d ? c7 : Unit.f6114a;
    }

    public abstract Object c(q6.e eVar, V5.b bVar);

    @Override // r6.e, q6.d
    public final Object e(q6.e eVar, V5.b bVar) {
        if (this.f7553e == -3) {
            CoroutineContext context = bVar.getContext();
            Boolean bool = Boolean.FALSE;
            V5.a aVar = new V5.a(2);
            CoroutineContext coroutineContext = this.f7552d;
            CoroutineContext j = !((Boolean) coroutineContext.t(bool, aVar)).booleanValue() ? context.j(coroutineContext) : n6.r.a(context, coroutineContext, false);
            if (Intrinsics.a(j, context)) {
                Object c7 = c(eVar, bVar);
                return c7 == W5.a.f2787d ? c7 : Unit.f6114a;
            }
            V5.c cVar = kotlin.coroutines.d.f6145f;
            if (Intrinsics.a(j.g(cVar), context.g(cVar))) {
                CoroutineContext context2 = bVar.getContext();
                if (!(eVar instanceof x) && !(eVar instanceof r)) {
                    eVar = new q6.l(eVar, context2);
                }
                Object b7 = s.b(j, eVar, s6.u.b(j), new f(this, null), bVar);
                return b7 == W5.a.f2787d ? b7 : Unit.f6114a;
            }
        }
        Object e7 = super.e(eVar, bVar);
        return e7 == W5.a.f2787d ? e7 : Unit.f6114a;
    }

    @Override // r6.e
    public final String toString() {
        return this.f7558l + " -> " + super.toString();
    }
}
