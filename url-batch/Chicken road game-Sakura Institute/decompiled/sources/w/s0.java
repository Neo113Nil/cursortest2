package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public g0.z0 f9420g;

    /* renamed from: h, reason: collision with root package name */
    public int f9421h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g0.z0 f9422i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f9423j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p.j f9424k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(g0.z0 z0Var, boolean z8, p.j jVar, h6.d dVar) {
        super(2, dVar);
        this.f9422i = z0Var;
        this.f9423j = z8;
        this.f9424k = jVar;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        return new s0(this.f9422i, this.f9423j, this.f9424k, dVar);
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((s0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        g0.z0 z0Var;
        int i7 = this.f9421h;
        if (i7 == 0) {
            d6.a.e(obj);
            z0Var = this.f9422i;
            p.l lVar = (p.l) z0Var.getValue();
            if (lVar != null) {
                p.h mVar = this.f9423j ? new p.m(lVar) : new p.k(lVar);
                p.j jVar = this.f9424k;
                if (jVar != null) {
                    this.f9420g = z0Var;
                    this.f9421h = 1;
                    Object b9 = jVar.b(mVar, this);
                    i6.a aVar = i6.a.f4956f;
                    if (b9 == aVar) {
                        return aVar;
                    }
                }
            }
            return d6.z.f2639a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z0Var = this.f9420g;
        d6.a.e(obj);
        z0Var.setValue(null);
        return d6.z.f2639a;
    }
}
