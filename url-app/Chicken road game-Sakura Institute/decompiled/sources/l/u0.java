package l;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u0 extends j6.i implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public int f5673g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5674h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5675i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0 f5676j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p1 f5677k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f5678l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Object obj, Object obj2, x0 x0Var, p1 p1Var, float f9, h6.d dVar) {
        super(1, dVar);
        this.f5674h = obj;
        this.f5675i = obj2;
        this.f5676j = x0Var;
        this.f5677k = p1Var;
        this.f5678l = f9;
    }

    @Override // j6.a
    public final h6.d create(h6.d dVar) {
        return new u0(this.f5674h, this.f5675i, this.f5676j, this.f5677k, this.f5678l, dVar);
    }

    @Override // q6.c
    public final Object f(Object obj) {
        return ((u0) create((h6.d) obj)).invokeSuspend(d6.z.f2639a);
    }

    @Override // j6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f5673g;
        if (i7 == 0) {
            d6.a.e(obj);
            t0 t0Var = new t0(this.f5674h, this.f5675i, this.f5676j, this.f5677k, this.f5678l, null);
            this.f5673g = 1;
            Object d8 = c7.a0.d(t0Var, this);
            i6.a aVar = i6.a.f4956f;
            if (d8 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d6.a.e(obj);
        }
        return d6.z.f2639a;
    }
}
