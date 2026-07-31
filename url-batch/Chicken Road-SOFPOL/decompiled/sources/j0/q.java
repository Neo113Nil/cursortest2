package j0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class q extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3857h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v.i f3858j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ w0.p f3859k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(v.i iVar, w0.p pVar, g6.c cVar, int i) {
        super(2, cVar);
        this.f3857h = i;
        this.f3858j = iVar;
        this.f3859k = pVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a7.u uVar = (a7.u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f3857h) {
        }
        return ((q) l(cVar, uVar)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f3857h) {
            case 0:
                return new q(this.f3858j, this.f3859k, cVar, 0);
            default:
                return new q(this.f3858j, this.f3859k, cVar, 1);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f3857h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    d7.f a8 = this.f3858j.a();
                    p pVar = new p(this.f3859k, 0);
                    this.i = 1;
                    Object c8 = a8.c(pVar, this);
                    h6.a aVar = h6.a.f3204d;
                    if (c8 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
            default:
                int i8 = this.i;
                if (i8 == 0) {
                    s6.a.K(obj);
                    d7.f a9 = this.f3858j.a();
                    p pVar2 = new p(this.f3859k, 1);
                    this.i = 1;
                    Object c9 = a9.c(pVar2, this);
                    h6.a aVar2 = h6.a.f3204d;
                    if (c9 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                }
                return c6.m.f1757a;
        }
    }
}
