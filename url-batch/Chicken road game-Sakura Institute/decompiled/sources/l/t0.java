package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class t0 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f5659g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f5660h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5661i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5662j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0 f5663k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p1 f5664l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5665m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Object obj, Object obj2, x0 x0Var, p1 p1Var, float f9, h6.d dVar) {
        super(2, dVar);
        this.f5661i = obj;
        this.f5662j = obj2;
        this.f5663k = x0Var;
        this.f5664l = p1Var;
        this.f5665m = f9;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        t0 t0Var = new t0(this.f5661i, this.f5662j, this.f5663k, this.f5664l, this.f5665m, dVar);
        t0Var.f5660h = obj;
        return t0Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((t0) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f5659g;
        d6.z zVar = d6.z.f2639a;
        x0 x0Var = this.f5663k;
        if (i7 == 0) {
            d6.a.e(obj);
            c7.x xVar = (c7.x) this.f5660h;
            Object obj2 = this.f5661i;
            Object obj3 = this.f5662j;
            h6.d dVar = null;
            if (r6.k.a(obj2, obj3)) {
                x0Var.f5718n = null;
                if (r6.k.a(x0Var.f5707c.getValue(), obj2)) {
                    return zVar;
                }
            } else {
                x0.f(x0Var);
            }
            boolean a3 = r6.k.a(obj2, obj3);
            float f9 = this.f5665m;
            if (!a3) {
                p1 p1Var = this.f5664l;
                p1Var.q(obj2);
                p1Var.o(0L);
                x0Var.f5706b.setValue(obj2);
                p1Var.j(f9);
            }
            x0Var.o(f9);
            if (x0Var.f5717m.f4805b != 0) {
                c7.a0.p(xVar, null, null, new f4.c(x0Var, dVar, 3), 3);
            } else {
                x0Var.f5716l = Long.MIN_VALUE;
            }
            this.f5659g = 1;
            Object j8 = x0.j(x0Var, this);
            i6.a aVar = i6.a.f4956f;
            if (j8 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
        }
        x0Var.n();
        return zVar;
    }
}
