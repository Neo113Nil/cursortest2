package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 extends j6.i implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public int f9433g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ o.m0 f9434h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ long f9435i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h7.c f9436j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f9437k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p.j f9438l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(h7.c cVar, g0.z0 z0Var, p.j jVar, h6.d dVar) {
        super(3, dVar);
        this.f9436j = cVar;
        this.f9437k = z0Var;
        this.f9438l = jVar;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j8 = ((y0.c) obj2).f9778a;
        g0.z0 z0Var = this.f9437k;
        p.j jVar = this.f9438l;
        t0 t0Var = new t0(this.f9436j, z0Var, jVar, (h6.d) obj3);
        t0Var.f9434h = (o.m0) obj;
        t0Var.f9435i = j8;
        return t0Var.invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f9433g;
        h7.c cVar = this.f9436j;
        if (i7 == 0) {
            d6.a.e(obj);
            o.m0 m0Var = this.f9434h;
            c7.a0.p(cVar, null, null, new m.a(this.f9437k, this.f9435i, this.f9438l, null, 2), 3);
            this.f9433g = 1;
            obj = m0Var.c(this);
            i6.a aVar = i6.a.f4956f;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
        }
        c7.a0.p(cVar, null, null, new s0(this.f9437k, ((Boolean) obj).booleanValue(), this.f9438l, null), 3);
        return d6.z.f2639a;
    }
}
