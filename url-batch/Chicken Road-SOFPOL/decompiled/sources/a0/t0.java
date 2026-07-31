package a0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t0 extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f143h = 1;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f144j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f145k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(int i, int i8, g6.c cVar) {
        super(2, cVar);
        this.i = i;
        this.f144j = i8;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f143h) {
            case 0:
                return ((t0) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
            default:
                t0 t0Var = (t0) l((g6.c) obj2, (b4.a) obj);
                c6.m mVar = c6.m.f1757a;
                t0Var.p(mVar);
                return mVar;
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f143h) {
            case 0:
                return new t0((u0) this.f145k, this.f144j, cVar);
            default:
                t0 t0Var = new t0(this.i, this.f144j, cVar);
                t0Var.f145k = obj;
                return t0Var;
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        b4.c cVar;
        int i = this.f143h;
        int i8 = this.f144j;
        c6.m mVar = c6.m.f1757a;
        switch (i) {
            case 0:
                int i9 = this.i;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return mVar;
                }
                s6.a.K(obj);
                z.d dVar = ((u0) this.f145k).f149s;
                this.i = 1;
                z.p pVar = dVar.f9013a;
                a0 a0Var = z.p.f9076x;
                pVar.getClass();
                Object c8 = pVar.c(t.j0.f6794d, new p0(pVar, i8, (g6.c) null), this);
                h6.a aVar = h6.a.f3204d;
                if (c8 != aVar) {
                    c8 = mVar;
                }
                if (c8 != aVar) {
                    c8 = mVar;
                }
                return c8 == aVar ? aVar : mVar;
            default:
                b4.a aVar2 = (b4.a) this.f145k;
                s6.a.K(obj);
                int i10 = this.i;
                if (i10 == 1) {
                    cVar = b6.w.f1484j;
                } else if (i10 == 2) {
                    cVar = b6.w.f1485k;
                } else {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            cVar = b6.w.f1487m;
                        }
                        return mVar;
                    }
                    cVar = b6.w.f1486l;
                }
                Integer num = (Integer) aVar2.c(cVar);
                if (i8 > (num != null ? num.intValue() : 0)) {
                    aVar2.d(cVar, new Integer(i8));
                }
                return mVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, int i, g6.c cVar) {
        super(2, cVar);
        this.f145k = u0Var;
        this.f144j = i;
    }
}
