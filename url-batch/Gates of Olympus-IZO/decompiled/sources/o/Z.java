package o;

import k2.InterfaceC0550w;

/* loaded from: classes.dex */
public final class Z extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int f6483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f6484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f6485g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(g0 g0Var, long j3, P1.d dVar) {
        super(2, dVar);
        this.f6484f = g0Var;
        this.f6485g = j3;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new Z(this.f6484f, this.f6485g, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((Z) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r9 != r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r9 == r0) goto L24;
     */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invokeSuspend;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6483e;
        L1.z zVar = L1.z.f2729a;
        if (i3 == 0) {
            I2.l.Q(obj);
            o0 o0Var = this.f6484f.f6516F;
            this.f6483e = 1;
            J j3 = o0Var.f6595d;
            J j4 = J.f6444e;
            long j5 = this.f6485g;
            long a3 = j3 == j4 ? M0.n.a(j5, 0.0f, 0.0f, 1) : M0.n.a(j5, 0.0f, 0.0f, 2);
            m0 m0Var = new m0(o0Var, null);
            n.e0 e0Var = o0Var.f6593b;
            if (e0Var == null || !(o0Var.f6592a.a() || o0Var.f6592a.c())) {
                m0 m0Var2 = new m0(m0Var.f6579h, this);
                m0Var2.f6578g = a3;
                invokeSuspend = m0Var2.invokeSuspend(zVar);
            } else {
                invokeSuspend = e0Var.f(a3, m0Var, this);
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
