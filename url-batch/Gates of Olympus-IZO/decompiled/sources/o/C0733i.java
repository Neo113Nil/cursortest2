package o;

/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0733i extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6532e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f6533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A0 f6534g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0735k f6535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0728d f6536i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k2.X f6537j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0733i(A0 a02, C0735k c0735k, InterfaceC0728d interfaceC0728d, k2.X x3, P1.d dVar) {
        super(2, dVar);
        this.f6534g = a02;
        this.f6535h = c0735k;
        this.f6536i = interfaceC0728d;
        this.f6537j = x3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0733i c0733i = new C0733i(this.f6534g, this.f6535h, this.f6536i, this.f6537j, dVar);
        c0733i.f6533f = obj;
        return c0733i;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0733i) create((l0) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6532e;
        if (i3 == 0) {
            I2.l.Q(obj);
            l0 l0Var = (l0) this.f6533f;
            InterfaceC0728d interfaceC0728d = this.f6536i;
            C0735k c0735k = this.f6535h;
            float v0 = C0735k.v0(c0735k, interfaceC0728d);
            A0 a02 = this.f6534g;
            a02.f6412e = v0;
            R.h hVar = new R.h(c0735k, this.f6537j, l0Var, 7);
            E2.j jVar = new E2.j(c0735k, a02, interfaceC0728d, 2);
            this.f6532e = 1;
            if (a02.a(hVar, jVar, this) == aVar) {
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
