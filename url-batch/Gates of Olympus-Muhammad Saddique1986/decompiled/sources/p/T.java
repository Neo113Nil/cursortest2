package p;

/* loaded from: classes.dex */
public final class T implements O0.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O0.b f7605d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7606e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7607f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.c f7608g = new y2.c(false);

    public T(O0.b bVar) {
        this.f7605d = bVar;
    }

    @Override // O0.b
    public final long E(long j3) {
        return this.f7605d.E(j3);
    }

    @Override // O0.b
    public final long G(float f3) {
        return this.f7605d.G(f3);
    }

    @Override // O0.b
    public final long H(long j3) {
        return this.f7605d.H(j3);
    }

    @Override // O0.b
    public final float J(float f3) {
        return this.f7605d.J(f3);
    }

    @Override // O0.b
    public final float K(long j3) {
        return this.f7605d.K(j3);
    }

    @Override // O0.b
    public final long T(float f3) {
        return this.f7605d.T(f3);
    }

    @Override // O0.b
    public final float Y(int i3) {
        return this.f7605d.Y(i3);
    }

    @Override // O0.b
    public final float a() {
        return this.f7605d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(X1.c cVar) {
        Q q3;
        int i3;
        T t3;
        if (cVar instanceof Q) {
            q3 = (Q) cVar;
            int i4 = q3.f7574j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                q3.f7574j = i4 - Integer.MIN_VALUE;
                Object obj = q3.f7572h;
                W1.a aVar = W1.a.f4608d;
                i3 = q3.f7574j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    q3.f7571g = this;
                    q3.f7574j = 1;
                    if (this.f7608g.c(null, q3) == aVar) {
                        return aVar;
                    }
                    t3 = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t3 = q3.f7571g;
                    R1.a.e(obj);
                }
                t3.f7606e = false;
                t3.f7607f = false;
                return R1.y.f4171a;
            }
        }
        q3 = new Q(this, cVar);
        Object obj2 = q3.f7572h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = q3.f7574j;
        if (i3 != 0) {
        }
        t3.f7606e = false;
        t3.f7607f = false;
        return R1.y.f4171a;
    }

    @Override // O0.b
    public final float b0(long j3) {
        return this.f7605d.b0(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(X1.c cVar) {
        S s3;
        int i3;
        T t3;
        if (cVar instanceof S) {
            s3 = (S) cVar;
            int i4 = s3.f7597j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s3.f7597j = i4 - Integer.MIN_VALUE;
                Object obj = s3.f7595h;
                W1.a aVar = W1.a.f4608d;
                i3 = s3.f7597j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    if (this.f7606e || this.f7607f) {
                        t3 = this;
                        return Boolean.valueOf(t3.f7606e);
                    }
                    s3.f7594g = this;
                    s3.f7597j = 1;
                    if (this.f7608g.c(null, s3) == aVar) {
                        return aVar;
                    }
                    t3 = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t3 = s3.f7594g;
                    R1.a.e(obj);
                }
                t3.f7608g.e(null);
                return Boolean.valueOf(t3.f7606e);
            }
        }
        s3 = new S(this, cVar);
        Object obj2 = s3.f7595h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = s3.f7597j;
        if (i3 != 0) {
        }
        t3.f7608g.e(null);
        return Boolean.valueOf(t3.f7606e);
    }

    @Override // O0.b
    public final float d0(float f3) {
        return this.f7605d.d0(f3);
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f7605d.l(f3);
    }

    @Override // O0.b
    public final float r() {
        return this.f7605d.r();
    }
}
