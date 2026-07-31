package n;

import k2.InterfaceC0550w;
import q.C0771f;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646a extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q.j f6052f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0771f f6053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0646a(q.j jVar, C0771f c0771f, P1.d dVar) {
        super(2, dVar);
        this.f6052f = jVar;
        this.f6053g = c0771f;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0646a(this.f6052f, this.f6053g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0646a) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6051e;
        if (i3 == 0) {
            I2.l.Q(obj);
            this.f6051e = 1;
            if (this.f6052f.b(this.f6053g, this) == aVar) {
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
