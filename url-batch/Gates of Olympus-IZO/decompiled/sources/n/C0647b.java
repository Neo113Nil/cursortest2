package n;

import k2.InterfaceC0550w;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647b extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q.j f6057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q.g f6058g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647b(q.j jVar, q.g gVar, P1.d dVar) {
        super(2, dVar);
        this.f6057f = jVar;
        this.f6058g = gVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0647b(this.f6057f, this.f6058g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0647b) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6056e;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f6056e = 1;
            if (this.f6057f.b(this.f6058g, this) == aVar) {
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
