package b6;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1392h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f1393j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i, int i8, g6.c cVar) {
        super(2, cVar);
        this.f1392h = i8;
        switch (i8) {
            case 1:
                super(i, cVar);
                break;
            default:
                this.i = i;
                break;
        }
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1392h) {
            case 0:
                n nVar = (n) l((g6.c) obj2, (b4.a) obj);
                c6.m mVar = c6.m.f1757a;
                nVar.p(mVar);
                return mVar;
            default:
                return ((n) l((g6.c) obj2, (a7.u) obj)).p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f1392h) {
            case 0:
                n nVar = new n(this.i, 0, cVar);
                nVar.f1393j = obj;
                return nVar;
            default:
                n nVar2 = new n(2, 1, cVar);
                nVar2.f1393j = obj;
                return nVar2;
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        a7.u uVar;
        switch (this.f1392h) {
            case 0:
                b4.a aVar = (b4.a) this.f1393j;
                s6.a.K(obj);
                b4.c cVar = w.i;
                Integer num = (Integer) aVar.c(cVar);
                int intValue = num != null ? num.intValue() : 1;
                int i = this.i;
                if (i > intValue) {
                    aVar.d(cVar, new Integer(i));
                }
                return c6.m.f1757a;
            default:
                int i8 = this.i;
                if (i8 == 0) {
                    s6.a.K(obj);
                    uVar = (a7.u) this.f1393j;
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uVar = (a7.u) this.f1393j;
                    s6.a.K(obj);
                }
                while (a7.x.m(uVar.h())) {
                    r.s1 s1Var = new r.s1(17);
                    this.f1393j = uVar;
                    this.i = 1;
                    g6.h hVar = this.f3460e;
                    q6.i.b(hVar);
                    Object d8 = m0.b.o(hVar).d(s1Var, this);
                    h6.a aVar2 = h6.a.f3204d;
                    if (d8 == aVar2) {
                        return aVar2;
                    }
                }
                return c6.m.f1757a;
        }
    }
}
