package m;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p extends j6.i implements q6.f {

    /* renamed from: g, reason: collision with root package name */
    public int f6224g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ o.m0 f6225h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ long f6226i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f6227j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, h6.d dVar) {
        super(3, dVar);
        this.f6227j = qVar;
    }

    @Override // q6.f
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j8 = ((y0.c) obj2).f9778a;
        p pVar = new p(this.f6227j, (h6.d) obj3);
        pVar.f6225h = (o.m0) obj;
        pVar.f6226i = j8;
        return pVar.invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i7 = this.f6224g;
        d6.z zVar = d6.z.f2639a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
            return zVar;
        }
        d6.a.e(obj);
        o.m0 m0Var = this.f6225h;
        long j8 = this.f6226i;
        q qVar = this.f6227j;
        if (qVar.f6235y) {
            this.f6224g = 1;
            p.j jVar = qVar.f6231u;
            i6.a aVar = i6.a.f4956f;
            if (jVar == null || (obj2 = c7.a0.d(new b(m0Var, j8, jVar, qVar, null), this)) != aVar) {
                obj2 = zVar;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return zVar;
    }
}
