package n;

import k2.InterfaceC0550w;

/* renamed from: n.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636G extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q.j f6002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q.h f6003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k2.G f6004h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0636G(q.j jVar, q.h hVar, k2.G g3, P1.d dVar) {
        super(2, dVar);
        this.f6002f = jVar;
        this.f6003g = hVar;
        this.f6004h = g3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0636G(this.f6002f, this.f6003g, this.f6004h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0636G) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6001e;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f6001e = 1;
            if (this.f6002f.b(this.f6003g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        k2.G g3 = this.f6004h;
        if (g3 != null) {
            g3.a();
        }
        return L1.z.f2729a;
    }
}
