package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e0 extends w0.v implements t2 {

    /* renamed from: e, reason: collision with root package name */
    public final p6.a f4903e;

    /* renamed from: f, reason: collision with root package name */
    public final n2 f4904f;

    /* renamed from: g, reason: collision with root package name */
    public d0 f4905g = new d0(w0.m.k().g());

    public e0(p6.a aVar, v0 v0Var) {
        this.f4903e = aVar;
        this.f4904f = v0Var;
    }

    @Override // w0.u
    public final w0.w a() {
        return this.f4905g;
    }

    @Override // w0.u
    public final void c(w0.w wVar) {
        q6.i.c(wVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f4905g = (d0) wVar;
    }

    public final d0 g(d0 d0Var, w0.f fVar, boolean z3, p6.a aVar) {
        o0.e m7;
        n2 n2Var;
        int i;
        d0 d0Var2 = d0Var;
        if (d0Var2.c(this, fVar)) {
            if (z3) {
                m7 = b.m();
                Object[] objArr = m7.f5578d;
                int i8 = m7.f5580f;
                for (int i9 = 0; i9 < i8; i9++) {
                    ((r) objArr[i9]).b();
                }
                try {
                    o.d0 d0Var3 = d0Var2.f4892e;
                    a0.g1 g1Var = o2.f5033a;
                    u0.d dVar = (u0.d) g1Var.l();
                    if (dVar == null) {
                        dVar = new u0.d();
                        g1Var.I(dVar);
                    }
                    int i10 = dVar.f7143a;
                    Object[] objArr2 = d0Var3.f5435b;
                    int[] iArr = d0Var3.f5436c;
                    long[] jArr = d0Var3.f5434a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        while (true) {
                            long j7 = jArr[i11];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i12 = 8;
                                int i13 = 8 - ((~(i11 - length)) >>> 31);
                                int i14 = 0;
                                while (i14 < i13) {
                                    if ((j7 & 255) < 128) {
                                        int i15 = (i11 << 3) + i14;
                                        i = i12;
                                        w0.u uVar = (w0.u) objArr2[i15];
                                        dVar.f7143a = i10 + iArr[i15];
                                        p6.c e8 = fVar.e();
                                        if (e8 != null) {
                                            e8.i(uVar);
                                        }
                                    } else {
                                        i = i12;
                                    }
                                    j7 >>= i;
                                    i14++;
                                    i12 = i;
                                }
                                if (i13 != i12) {
                                    break;
                                }
                            }
                            if (i11 == length) {
                                break;
                            }
                            i11++;
                        }
                    }
                    dVar.f7143a = i10;
                    Object[] objArr3 = m7.f5578d;
                    int i16 = m7.f5580f;
                    for (int i17 = 0; i17 < i16; i17++) {
                        ((r) objArr3[i17]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return d0Var2;
        }
        o.d0 d0Var4 = new o.d0();
        a0.g1 g1Var2 = o2.f5033a;
        u0.d dVar2 = (u0.d) g1Var2.l();
        if (dVar2 == null) {
            dVar2 = new u0.d();
            g1Var2.I(dVar2);
        }
        int i18 = dVar2.f7143a;
        m7 = b.m();
        Object[] objArr4 = m7.f5578d;
        int i19 = m7.f5580f;
        for (int i20 = 0; i20 < i19; i20++) {
            ((r) objArr4[i20]).b();
        }
        try {
            dVar2.f7143a = i18 + 1;
            Object j8 = w0.q.j(new j0.f(this, dVar2, d0Var4, i18), aVar);
            dVar2.f7143a = i18;
            Object[] objArr5 = m7.f5578d;
            int i21 = m7.f5580f;
            for (int i22 = 0; i22 < i21; i22++) {
                ((r) objArr5[i22]).a();
            }
            Object obj = w0.m.f7537c;
            synchronized (obj) {
                try {
                    w0.f k3 = w0.m.k();
                    Object obj2 = d0Var2.f4893f;
                    if (obj2 == d0.f4889h || (n2Var = this.f4904f) == null || !n2Var.a(j8, obj2)) {
                        d0 d0Var5 = this.f4905g;
                        synchronized (obj) {
                            w0.w m8 = w0.m.m(d0Var5, this);
                            m8.a(d0Var5);
                            m8.f7572a = k3.g();
                            d0Var2 = (d0) m8;
                            d0Var2.f4892e = d0Var4;
                            d0Var2.f4894g = d0Var2.d(this, k3);
                            d0Var2.f4893f = j8;
                        }
                        return d0Var2;
                    }
                    d0Var2.f4892e = d0Var4;
                    d0Var2.f4894g = d0Var2.d(this, k3);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u0.d dVar3 = (u0.d) o2.f5033a.l();
            if (dVar3 == null || dVar3.f7143a != 0) {
                return d0Var2;
            }
            w0.m.k().m();
            synchronized (obj) {
                w0.f k7 = w0.m.k();
                d0Var2.f4890c = k7.g();
                d0Var2.f4891d = k7.h();
                return d0Var2;
            }
        } finally {
            Object[] objArr6 = m7.f5578d;
            int i23 = m7.f5580f;
            for (int i24 = 0; i24 < i23; i24++) {
                ((r) objArr6[i24]).a();
            }
        }
    }

    @Override // m0.t2
    public final Object getValue() {
        p6.c e8 = w0.m.k().e();
        if (e8 != null) {
            e8.i(this);
        }
        w0.f k3 = w0.m.k();
        return g((d0) w0.m.j(this.f4905g, k3), k3, true, this.f4903e).f4893f;
    }

    public final d0 h() {
        w0.f k3 = w0.m.k();
        return g((d0) w0.m.j(this.f4905g, k3), k3, false, this.f4903e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        d0 d0Var = (d0) w0.m.i(this.f4905g);
        sb.append(d0Var.c(this, w0.m.k()) ? String.valueOf(d0Var.f4893f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
