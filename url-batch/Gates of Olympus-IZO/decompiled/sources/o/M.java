package o;

/* loaded from: classes.dex */
public final class M implements M0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M0.b f6454d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6455e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6456f;

    /* renamed from: g, reason: collision with root package name */
    public final s2.c f6457g = new s2.c(false);

    public M(M0.b bVar) {
        this.f6454d = bVar;
    }

    @Override // M0.b
    public final long C(long j3) {
        return this.f6454d.C(j3);
    }

    @Override // M0.b
    public final long D(float f3) {
        return this.f6454d.D(f3);
    }

    @Override // M0.b
    public final float F(float f3) {
        return this.f6454d.F(f3);
    }

    @Override // M0.b
    public final float G(long j3) {
        return this.f6454d.G(j3);
    }

    @Override // M0.b
    public final long R(float f3) {
        return this.f6454d.R(f3);
    }

    @Override // M0.b
    public final float Z(int i3) {
        return this.f6454d.Z(i3);
    }

    @Override // M0.b
    public final float a() {
        return this.f6454d.a();
    }

    @Override // M0.b
    public final float a0(long j3) {
        return this.f6454d.a0(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(R1.c cVar) {
        K k3;
        int i3;
        M m3;
        if (cVar instanceof K) {
            k3 = (K) cVar;
            int i4 = k3.f6449g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                k3.f6449g = i4 - Integer.MIN_VALUE;
                Object obj = k3.f6447e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = k3.f6449g;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    k3.f6446d = this;
                    k3.f6449g = 1;
                    if (this.f6457g.c(null, k3) == aVar) {
                        return aVar;
                    }
                    m3 = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m3 = k3.f6446d;
                    I2.l.Q(obj);
                }
                m3.f6455e = false;
                m3.f6456f = false;
                return L1.z.f2729a;
            }
        }
        k3 = new K(this, cVar);
        Object obj2 = k3.f6447e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = k3.f6449g;
        if (i3 != 0) {
        }
        m3.f6455e = false;
        m3.f6456f = false;
        return L1.z.f2729a;
    }

    @Override // M0.b
    public final float c0(float f3) {
        return this.f6454d.c0(f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(R1.c cVar) {
        L l3;
        int i3;
        M m3;
        if (cVar instanceof L) {
            l3 = (L) cVar;
            int i4 = l3.f6453g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                l3.f6453g = i4 - Integer.MIN_VALUE;
                Object obj = l3.f6451e;
                Q1.a aVar = Q1.a.f3113d;
                i3 = l3.f6453g;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    if (this.f6455e || this.f6456f) {
                        m3 = this;
                        return Boolean.valueOf(m3.f6455e);
                    }
                    l3.f6450d = this;
                    l3.f6453g = 1;
                    if (this.f6457g.c(null, l3) == aVar) {
                        return aVar;
                    }
                    m3 = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m3 = l3.f6450d;
                    I2.l.Q(obj);
                }
                m3.f6457g.e(null);
                return Boolean.valueOf(m3.f6455e);
            }
        }
        l3 = new L(this, cVar);
        Object obj2 = l3.f6451e;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = l3.f6453g;
        if (i3 != 0) {
        }
        m3.f6457g.e(null);
        return Boolean.valueOf(m3.f6455e);
    }

    @Override // M0.b
    public final int k(float f3) {
        return this.f6454d.k(f3);
    }

    @Override // M0.b
    public final float p() {
        return this.f6454d.p();
    }
}
