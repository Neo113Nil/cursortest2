package e1;

/* loaded from: classes.dex */
public final class r extends R1.i implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public int f4734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0341D f4735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0341D c0341d, P1.d dVar) {
        super(1, dVar);
        this.f4735f = c0341d;
    }

    @Override // R1.a
    public final P1.d create(P1.d dVar) {
        return new r(this.f4735f, dVar);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4734e;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f4734e = 1;
            obj = this.f4735f.j(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return obj;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        return ((r) create((P1.d) obj)).invokeSuspend(L1.z.f2729a);
    }
}
