package t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6769h;
    public final /* synthetic */ u i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(u uVar, g6.c cVar, int i) {
        super(2, cVar);
        this.f6769h = i;
        this.i = uVar;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        a7.u uVar = (a7.u) obj;
        g6.c cVar = (g6.c) obj2;
        switch (this.f6769h) {
            case 0:
                f fVar = (f) l(cVar, uVar);
                c6.m mVar = c6.m.f1757a;
                fVar.p(mVar);
                return mVar;
            default:
                f fVar2 = (f) l(cVar, uVar);
                c6.m mVar2 = c6.m.f1757a;
                fVar2.p(mVar2);
                return mVar2;
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f6769h) {
            case 0:
                return new f(this.i, cVar, 0);
            default:
                return new f(this.i, cVar, 1);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f6769h) {
            case 0:
                s6.a.K(obj);
                u uVar = this.i;
                if (uVar.D == null) {
                    v.f fVar = new v.f();
                    v.j jVar = uVar.f6860t;
                    if (jVar != null) {
                        a7.x.n(uVar.f0(), null, new b0.d(jVar, fVar, null, 9), 3);
                    }
                    uVar.D = fVar;
                }
                break;
            default:
                s6.a.K(obj);
                u uVar2 = this.i;
                v.f fVar2 = uVar2.D;
                if (fVar2 != null) {
                    v.g gVar = new v.g(fVar2);
                    v.j jVar2 = uVar2.f6860t;
                    g6.c cVar = null;
                    if (jVar2 != null) {
                        a7.x.n(uVar2.f0(), null, new b0.d(jVar2, gVar, cVar, 10), 3);
                    }
                    uVar2.D = null;
                }
                break;
        }
        return c6.m.f1757a;
    }
}
