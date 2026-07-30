package r6;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import n6.AbstractC0792z;
import p6.EnumC0830a;

/* loaded from: classes.dex */
public final class m extends g {

    /* renamed from: m, reason: collision with root package name */
    public final q6.o f7576m;

    public m(q6.o oVar, q6.d dVar, CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a) {
        super(dVar, coroutineContext, i2, enumC0830a);
        this.f7576m = oVar;
    }

    @Override // r6.e
    public final e b(CoroutineContext coroutineContext, int i2, EnumC0830a enumC0830a) {
        return new m(this.f7576m, this.f7558l, coroutineContext, i2, enumC0830a);
    }

    @Override // r6.g
    public final Object c(q6.e eVar, V5.b bVar) {
        Object c7 = AbstractC0792z.c(new l(this, eVar, null), bVar);
        return c7 == W5.a.f2787d ? c7 : Unit.f6114a;
    }
}
