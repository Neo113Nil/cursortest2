package F;

import k2.InterfaceC0550w;
import n2.C0681F;

/* renamed from: F.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052m extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f1297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q.j f1298f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S.t f1299g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052m(q.j jVar, S.t tVar, P1.d dVar) {
        super(2, dVar);
        this.f1298f = jVar;
        this.f1299g = tVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0052m(this.f1298f, this.f1299g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0052m) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f1297e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
            return L1.z.f2729a;
        }
        I2.l.Q(obj);
        C0681F c0681f = this.f1298f.f6817a;
        C0050l c0050l = new C0050l(this.f1299g, 0);
        this.f1297e = 1;
        c0681f.getClass();
        C0681F.k(c0681f, c0050l, this);
        return aVar;
    }
}
