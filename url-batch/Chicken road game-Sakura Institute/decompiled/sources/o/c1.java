package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c1 extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public f1 f6579g;

    /* renamed from: h, reason: collision with root package name */
    public r6.u f6580h;

    /* renamed from: i, reason: collision with root package name */
    public long f6581i;

    /* renamed from: j, reason: collision with root package name */
    public int f6582j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f6583k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f1 f6584l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r6.u f6585m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f6586n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(f1 f1Var, r6.u uVar, long j8, h6.d dVar) {
        super(2, dVar);
        this.f6584l = f1Var;
        this.f6585m = uVar;
        this.f6586n = j8;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        c1 c1Var = new c1(this.f6584l, this.f6585m, this.f6586n, dVar);
        c1Var.f6583k = obj;
        return c1Var;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((c1) create((d1) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        f1 f1Var;
        r6.u uVar;
        long j8;
        f1 f1Var2;
        int i7 = this.f6582j;
        j0 j0Var = j0.f6658g;
        if (i7 == 0) {
            d6.a.e(obj);
            d1 d1Var = (d1) this.f6583k;
            f1Var = this.f6584l;
            b1 b1Var = new b1(f1Var, d1Var);
            k kVar = f1Var.f6611c;
            r6.u uVar2 = this.f6585m;
            long j9 = uVar2.f7967f;
            j0 j0Var2 = f1Var.f6612d;
            long j10 = this.f6586n;
            float c4 = f1Var.c(j0Var2 == j0Var ? m2.o.b(j10) : m2.o.c(j10));
            this.f6583k = f1Var;
            this.f6579g = f1Var;
            this.f6580h = uVar2;
            this.f6581i = j9;
            this.f6582j = 1;
            kVar.getClass();
            obj = c7.a0.x(kVar.f6663b, new j(c4, kVar, b1Var, null), this);
            i6.a aVar = i6.a.f4956f;
            if (obj == aVar) {
                return aVar;
            }
            uVar = uVar2;
            j8 = j9;
            f1Var2 = f1Var;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j8 = this.f6581i;
            uVar = this.f6580h;
            f1Var = this.f6579g;
            f1Var2 = (f1) this.f6583k;
            d6.a.e(obj);
        }
        float c6 = f1Var2.c(((Number) obj).floatValue());
        uVar.f7967f = f1Var.f6612d == j0Var ? m2.o.a(j8, c6, 0.0f, 2) : m2.o.a(j8, 0.0f, c6, 1);
        return d6.z.f2639a;
    }
}
