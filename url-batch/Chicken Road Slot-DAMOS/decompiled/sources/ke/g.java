package ke;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g extends e {

    /* renamed from: r, reason: collision with root package name */
    public final je.e f5521r;

    public g(je.e eVar, CoroutineContext coroutineContext, int i3, ie.a aVar) {
        super(coroutineContext, i3, aVar);
        this.f5521r = eVar;
    }

    @Override // ke.e, je.e
    public final Object c(je.f fVar, ld.a aVar) {
        if (this.f5513e == -3) {
            CoroutineContext context = aVar.getContext();
            Boolean bool = Boolean.FALSE;
            a1.e eVar = new a1.e(7, (byte) 0);
            CoroutineContext coroutineContext = this.f5512d;
            CoroutineContext p4 = !((Boolean) coroutineContext.z(bool, eVar)).booleanValue() ? context.p(coroutineContext) : ge.r.a(context, coroutineContext, false);
            if (Intrinsics.a(p4, context)) {
                Object h10 = h(fVar, aVar);
                return h10 == md.a.f6622d ? h10 : Unit.f5554a;
            }
            ld.b bVar = kotlin.coroutines.d.f5591n;
            if (Intrinsics.a(p4.m(bVar), context.m(bVar))) {
                CoroutineContext context2 = aVar.getContext();
                if (!(fVar instanceof t) && !(fVar instanceof p)) {
                    fVar = new je.n(fVar, context2);
                }
                Object a9 = c.a(p4, fVar, le.v.b(p4), new a3.t(this, (ld.a) null, 12), aVar);
                return a9 == md.a.f6622d ? a9 : Unit.f5554a;
            }
        }
        Object c10 = super.c(fVar, aVar);
        return c10 == md.a.f6622d ? c10 : Unit.f5554a;
    }

    @Override // ke.e
    public final Object d(ie.n nVar, ld.a aVar) {
        Object h10 = h(new t(nVar), aVar);
        return h10 == md.a.f6622d ? h10 : Unit.f5554a;
    }

    public abstract Object h(je.f fVar, ld.a aVar);

    @Override // ke.e
    public final String toString() {
        return this.f5521r + " -> " + super.toString();
    }
}
