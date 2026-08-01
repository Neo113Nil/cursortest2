package x3;

import kotlin.Unit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m extends nd.i implements vd.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10405d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f10406e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10407i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z zVar, ld.a aVar) {
        super(3, aVar);
        this.f10407i = zVar;
    }

    @Override // vd.n
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.f10405d) {
            case 0:
                return new m((z) this.f10407i, (ld.a) obj3).invokeSuspend(Unit.f5554a);
            default:
                ((Boolean) obj2).getClass();
                m mVar = new m(3, (ld.a) obj3);
                mVar.f10407i = (d0) obj;
                return mVar.invokeSuspend(Unit.f5554a);
        }
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f10405d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i3 = this.f10406e;
                if (i3 == 0) {
                    cf.c.M(obj);
                    z zVar = (z) this.f10407i;
                    this.f10406e = 1;
                    if (z.a(zVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            default:
                md.a aVar2 = md.a.f6622d;
                int i10 = this.f10406e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    d0 d0Var = (d0) this.f10407i;
                    this.f10406e = 1;
                    if (!d0Var.f10348b.get()) {
                        Object a9 = j0.a(d0Var.f10347a, new t(d0Var, null, 1), this);
                        return a9 == aVar2 ? aVar2 : a9;
                    }
                    kotlin.collections.i0.l("This scope has already been closed.");
                } else {
                    if (i10 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ m(int i3, ld.a aVar) {
        super(i3, aVar);
    }
}
