package y3;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends i6.i implements p6.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8910h = 1;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8911j;

    public /* synthetic */ n(int i, g6.c cVar) {
        super(i, cVar);
    }

    @Override // p6.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f8910h) {
            case 0:
                return new n((b0) this.f8911j, (g6.c) obj3).p(c6.m.f1757a);
            default:
                ((Boolean) obj2).getClass();
                n nVar = new n(3, (g6.c) obj3);
                nVar.f8911j = (d0) obj;
                return nVar.p(c6.m.f1757a);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        switch (this.f8910h) {
            case 0:
                int i = this.i;
                if (i == 0) {
                    s6.a.K(obj);
                    b0 b0Var = (b0) this.f8911j;
                    this.i = 1;
                    Object a8 = b0.a(b0Var, this);
                    h6.a aVar = h6.a.f3204d;
                    if (a8 == aVar) {
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
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj);
                    return obj;
                }
                s6.a.K(obj);
                d0 d0Var = (d0) this.f8911j;
                this.i = 1;
                if (d0Var.f8857b.get()) {
                    throw new IllegalStateException("This scope has already been closed.");
                }
                Object e8 = r2.r.e(d0Var.f8856a, new v(d0Var, null, 1), this);
                h6.a aVar2 = h6.a.f3204d;
                return e8 == aVar2 ? aVar2 : e8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b0 b0Var, g6.c cVar) {
        super(3, cVar);
        this.f8911j = b0Var;
    }
}
