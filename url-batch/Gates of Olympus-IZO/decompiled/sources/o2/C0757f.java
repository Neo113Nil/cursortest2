package o2;

/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0757f extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6704e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0758g f6706g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0757f(AbstractC0758g abstractC0758g, P1.d dVar) {
        super(2, dVar);
        this.f6706g = abstractC0758g;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0757f c0757f = new C0757f(this.f6706g, dVar);
        c0757f.f6705f = obj;
        return c0757f;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0757f) create((m2.r) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6704e;
        if (i3 == 0) {
            I2.l.Q(obj);
            m2.r rVar = (m2.r) this.f6705f;
            this.f6704e = 1;
            if (this.f6706g.e(rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return L1.z.f2729a;
    }
}
