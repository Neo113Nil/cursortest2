package n2;

/* renamed from: n2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0710p extends R1.i implements Y1.f {

    /* renamed from: e, reason: collision with root package name */
    public int f6372e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ InterfaceC0701g f6373f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f6374g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0716v f6375h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0710p(C0716v c0716v, P1.d dVar) {
        super(3, dVar);
        this.f6375h = c0716v;
    }

    @Override // Y1.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        C0710p c0710p = new C0710p(this.f6375h, (P1.d) obj3);
        c0710p.f6373f = (InterfaceC0701g) obj;
        c0710p.f6374g = obj2;
        return c0710p.invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0701g interfaceC0701g;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6372e;
        if (i3 == 0) {
            I2.l.Q(obj);
            interfaceC0701g = this.f6373f;
            Object obj2 = this.f6374g;
            this.f6373f = interfaceC0701g;
            this.f6372e = 1;
            obj = this.f6375h.g(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                I2.l.Q(obj);
                return L1.z.f2729a;
            }
            interfaceC0701g = this.f6373f;
            I2.l.Q(obj);
        }
        this.f6373f = null;
        this.f6372e = 2;
        if (interfaceC0701g.emit(obj, this) == aVar) {
            return aVar;
        }
        return L1.z.f2729a;
    }
}
