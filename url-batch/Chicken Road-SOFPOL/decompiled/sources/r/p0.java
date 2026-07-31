package r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p0 extends i6.i implements p6.c {

    /* renamed from: h, reason: collision with root package name */
    public int f6384h;
    public final /* synthetic */ Object i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6385j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s0 f6386k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l1 f6387l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f6388m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Object obj, Object obj2, s0 s0Var, l1 l1Var, float f6, g6.c cVar) {
        super(1, cVar);
        this.i = obj;
        this.f6385j = obj2;
        this.f6386k = s0Var;
        this.f6387l = l1Var;
        this.f6388m = f6;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        l1 l1Var = this.f6387l;
        float f6 = this.f6388m;
        return new p0(this.i, this.f6385j, this.f6386k, l1Var, f6, (g6.c) obj).p(c6.m.f1757a);
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f6384h;
        if (i == 0) {
            s6.a.K(obj);
            o0 o0Var = new o0(this.i, this.f6385j, this.f6386k, this.f6387l, this.f6388m, null);
            this.f6384h = 1;
            Object b8 = a7.x.b(o0Var, this);
            h6.a aVar = h6.a.f3204d;
            if (b8 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s6.a.K(obj);
        }
        return c6.m.f1757a;
    }
}
