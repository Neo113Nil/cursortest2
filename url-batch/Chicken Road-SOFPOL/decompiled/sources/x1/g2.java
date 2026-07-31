package x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class g2 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8420h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i2 f8421j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(i2 i2Var, g6.c cVar, int i) {
        super(2, cVar);
        this.f8420h = i;
        this.f8421j = i2Var;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a7.u uVar = (a7.u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f8420h) {
        }
        return ((g2) l(cVar, uVar)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f8420h) {
            case 0:
                return new g2(this.f8421j, cVar, 0);
            default:
                return new g2(this.f8421j, cVar, 1);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f8420h) {
            case 0:
                int i = this.i;
                c6.m mVar = c6.m.f1757a;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return mVar;
                }
                s6.a.K(obj);
                t tVar = this.f8421j.f8458d;
                this.i = 1;
                Object l3 = tVar.f8579v.l(this);
                h6.a aVar = h6.a.f3204d;
                if (l3 != aVar) {
                    l3 = mVar;
                }
                return l3 == aVar ? aVar : mVar;
            default:
                int i8 = this.i;
                c6.m mVar2 = c6.m.f1757a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return mVar2;
                }
                s6.a.K(obj);
                t tVar2 = this.f8421j.f8458d;
                this.i = 1;
                Object e8 = tVar2.f8581w.e(this);
                h6.a aVar2 = h6.a.f3204d;
                if (e8 != aVar2) {
                    e8 = mVar2;
                }
                return e8 == aVar2 ? aVar2 : mVar2;
        }
    }
}
