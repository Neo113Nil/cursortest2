package n;

import k2.InterfaceC0550w;
import n2.InterfaceC0700f;

/* renamed from: n.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0630A extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f5979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0631B f5980f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630A(C0631B c0631b, P1.d dVar) {
        super(2, dVar);
        this.f5980f = c0631b;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0630A(this.f5980f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0630A) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5979e;
        if (i3 == 0) {
            I2.l.Q(obj);
            Z1.r rVar = new Z1.r();
            Z1.r rVar2 = new Z1.r();
            Z1.r rVar3 = new Z1.r();
            C0631B c0631b = this.f5980f;
            InterfaceC0700f a3 = c0631b.f5981q.a();
            C0670z c0670z = new C0670z(rVar, rVar2, rVar3, c0631b, 0);
            this.f5979e = 1;
            if (a3.collect(c0670z, this) == aVar) {
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
