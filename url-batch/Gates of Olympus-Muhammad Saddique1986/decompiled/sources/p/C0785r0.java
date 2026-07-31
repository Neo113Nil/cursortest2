package p;

import e2.InterfaceC0426e;
import q2.AbstractC0837y;

/* renamed from: p.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0785r0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public C0793v0 f7758h;

    /* renamed from: i, reason: collision with root package name */
    public f2.t f7759i;

    /* renamed from: j, reason: collision with root package name */
    public long f7760j;

    /* renamed from: k, reason: collision with root package name */
    public int f7761k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7762l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0793v0 f7763m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f2.t f7764n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f7765o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0785r0(C0793v0 c0793v0, f2.t tVar, long j3, V1.d dVar) {
        super(2, dVar);
        this.f7763m = c0793v0;
        this.f7764n = tVar;
        this.f7765o = j3;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C0785r0) o((V1.d) obj2, (C0787s0) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        C0785r0 c0785r0 = new C0785r0(this.f7763m, this.f7764n, this.f7765o, dVar);
        c0785r0.f7762l = obj;
        return c0785r0;
    }

    @Override // X1.a
    public final Object q(Object obj) {
        C0793v0 c0793v0;
        f2.t tVar;
        long j3;
        C0793v0 c0793v02;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f7761k;
        P p3 = P.f7568e;
        if (i3 == 0) {
            R1.a.e(obj);
            C0787s0 c0787s0 = (C0787s0) this.f7762l;
            c0793v0 = this.f7763m;
            C0784q0 c0784q0 = new C0784q0(c0793v0, c0787s0);
            C0775m c0775m = c0793v0.f7780c;
            tVar = this.f7764n;
            long j4 = tVar.f5831d;
            P p4 = c0793v0.f7781d;
            long j5 = this.f7765o;
            float c2 = c0793v0.c(p4 == p3 ? O0.o.b(j5) : O0.o.c(j5));
            this.f7762l = c0793v0;
            this.f7758h = c0793v0;
            this.f7759i = tVar;
            this.f7760j = j4;
            this.f7761k = 1;
            c0775m.getClass();
            obj = AbstractC0837y.z(c0775m.f7716b, new C0773l(c2, c0775m, c0784q0, null), this);
            if (obj == aVar) {
                return aVar;
            }
            j3 = j4;
            c0793v02 = c0793v0;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = this.f7760j;
            tVar = this.f7759i;
            c0793v0 = this.f7758h;
            c0793v02 = (C0793v0) this.f7762l;
            R1.a.e(obj);
        }
        float c3 = c0793v02.c(((Number) obj).floatValue());
        tVar.f5831d = c0793v0.f7781d == p3 ? O0.o.a(j3, c3, 0.0f, 2) : O0.o.a(j3, 0.0f, c3, 1);
        return R1.y.f4171a;
    }
}
