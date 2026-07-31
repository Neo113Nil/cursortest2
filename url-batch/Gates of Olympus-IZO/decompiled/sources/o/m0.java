package o;

import D1.C0014b;

/* loaded from: classes.dex */
public final class m0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public long f6576e;

    /* renamed from: f, reason: collision with root package name */
    public int f6577f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ long f6578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o0 f6579h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, P1.d dVar) {
        super(2, dVar);
        this.f6579h = o0Var;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        m0 m0Var = new m0(this.f6579h, dVar);
        m0Var.f6578g = ((M0.n) obj).f2783a;
        return m0Var;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        long j3 = ((M0.n) obj).f2783a;
        m0 m0Var = new m0(this.f6579h, (P1.d) obj2);
        m0Var.f6578g = j3;
        return m0Var.invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j3;
        Object e3;
        Object b2;
        long j4;
        long j5;
        Object d3;
        long j6;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f6577f;
        o0 o0Var = this.f6579h;
        if (i3 == 0) {
            I2.l.Q(obj);
            j3 = this.f6578g;
            C0014b c0014b = o0Var.f6597f;
            this.f6578g = j3;
            this.f6577f = 1;
            e3 = c0014b.e(j3, this);
            if (e3 == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j7 = this.f6576e;
                    j6 = this.f6578g;
                    I2.l.Q(obj);
                    j5 = j7;
                    d3 = obj;
                    return new M0.n(M0.n.d(j6, M0.n.d(j5, ((M0.n) d3).f2783a)));
                }
                j4 = this.f6576e;
                j3 = this.f6578g;
                I2.l.Q(obj);
                b2 = obj;
                j5 = ((M0.n) b2).f2783a;
                C0014b c0014b2 = o0Var.f6597f;
                long d4 = M0.n.d(j4, j5);
                this.f6578g = j3;
                this.f6576e = j5;
                this.f6577f = 3;
                d3 = c0014b2.d(d4, j5, this);
                if (d3 != aVar) {
                    return aVar;
                }
                j6 = j3;
                return new M0.n(M0.n.d(j6, M0.n.d(j5, ((M0.n) d3).f2783a)));
            }
            j3 = this.f6578g;
            I2.l.Q(obj);
            e3 = obj;
        }
        long d5 = M0.n.d(j3, ((M0.n) e3).f2783a);
        this.f6578g = j3;
        this.f6576e = d5;
        this.f6577f = 2;
        b2 = o0Var.b(d5, this);
        if (b2 == aVar) {
            return aVar;
        }
        j4 = d5;
        j5 = ((M0.n) b2).f2783a;
        C0014b c0014b22 = o0Var.f6597f;
        long d42 = M0.n.d(j4, j5);
        this.f6578g = j3;
        this.f6576e = j5;
        this.f6577f = 3;
        d3 = c0014b22.d(d42, j5, this);
        if (d3 != aVar) {
        }
    }
}
