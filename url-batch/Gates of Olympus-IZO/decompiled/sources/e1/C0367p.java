package e1;

import k2.InterfaceC0550w;
import n2.C0720z;

/* renamed from: e1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367p extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f4729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0351N f4730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0367p(C0351N c0351n, P1.d dVar) {
        super(2, dVar);
        this.f4730f = c0351n;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0367p(this.f4730f, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        ((C0367p) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
        return Q1.a.f3113d;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f4729e;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
            throw new L1.f();
        }
        I2.l.Q(obj);
        C0720z c0720z = this.f4730f.f4642d;
        C0366o c0366o = C0366o.f4728d;
        this.f4729e = 1;
        c0720z.f6402d.collect(c0366o, this);
        return aVar;
    }
}
