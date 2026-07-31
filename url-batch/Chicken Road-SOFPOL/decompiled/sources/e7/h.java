package e7;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2549h = 1;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f2550j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f2551k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d7.g f2552l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, d7.g gVar, g6.c cVar) {
        super(2, cVar);
        this.f2551k = kVar;
        this.f2552l = gVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a7.u uVar = (a7.u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f2549h) {
        }
        return ((h) l(cVar, uVar)).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f2549h) {
            case 0:
                return new h(this.f2551k, this.f2552l, this.f2550j, cVar);
            default:
                h hVar = new h(this.f2551k, this.f2552l, cVar);
                hVar.f2550j = obj;
                return hVar;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [i6.i, p6.f] */
    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f2549h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    ?? r9 = this.f2551k.f2562h;
                    Object obj2 = this.f2550j;
                    this.i = 1;
                    Object d8 = r9.d(this.f2552l, obj2, this);
                    h6.a aVar = h6.a.f3204d;
                    if (d8 == aVar) {
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
                    a7.u uVar = (a7.u) this.f2550j;
                    q6.s sVar = new q6.s();
                    k kVar = this.f2551k;
                    d7.f fVar = kVar.f2548g;
                    j jVar = new j(sVar, uVar, kVar, this.f2552l, 0);
                    this.i = 1;
                    Object c8 = fVar.c(jVar, this);
                    h6.a aVar2 = h6.a.f3204d;
                    if (c8 == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, d7.g gVar, Object obj, g6.c cVar) {
        super(2, cVar);
        this.f2551k = kVar;
        this.f2552l = gVar;
        this.f2550j = obj;
    }
}
