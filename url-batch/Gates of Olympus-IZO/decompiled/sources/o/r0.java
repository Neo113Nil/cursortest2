package o;

import k2.InterfaceC0550w;
import n.C0666v;

/* loaded from: classes.dex */
public final class r0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0666v f6613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ M f6614g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.m f6615h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(C0666v c0666v, M m3, n0.m mVar, P1.d dVar) {
        super(2, dVar);
        this.f6613f = c0666v;
        this.f6614g = m3;
        this.f6615h = mVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new r0(this.f6613f, this.f6614g, this.f6615h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((r0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6612e;
        L1.z zVar = L1.z.f2729a;
        if (i3 == 0) {
            I2.l.Q(obj);
            long j3 = this.f6615h.f6225c;
            this.f6612e = 1;
            C0666v c0666v = this.f6613f;
            M m3 = this.f6614g;
            C0666v c0666v2 = new C0666v(c0666v.f6167h, this);
            c0666v2.f6165f = m3;
            c0666v2.f6166g = j3;
            if (c0666v2.invokeSuspend(zVar) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I2.l.Q(obj);
        }
        return zVar;
    }
}
