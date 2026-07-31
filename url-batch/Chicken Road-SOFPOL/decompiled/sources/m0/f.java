package m0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements w0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.m0 f4920d;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f4922f;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4921e = new Object();

    /* renamed from: g, reason: collision with root package name */
    public final u0.a f4923g = new u0.a(0);

    /* renamed from: h, reason: collision with root package name */
    public o.e0 f4924h = new o.e0();
    public o.e0 i = new o.e0();

    public f(androidx.lifecycle.m0 m0Var) {
        this.f4920d = m0Var;
    }

    @Override // g6.h
    public final g6.h c(g6.h hVar) {
        return a.a.v(this, hVar);
    }

    @Override // m0.w0
    public final Object d(p6.c cVar, i6.c cVar2) {
        int i;
        int i8;
        int i9;
        a7.h hVar = new a7.h(1, m.a.G(cVar2));
        hVar.t();
        d dVar = new d();
        dVar.f4887a = cVar;
        dVar.f4888b = hVar;
        q6.q qVar = new q6.q();
        qVar.f6203d = -1;
        synchronized (this.f4921e) {
            Throwable th = this.f4922f;
            if (th != null) {
                hVar.k(s6.a.l(th));
            } else {
                u0.a aVar = this.f4923g;
                do {
                    i = aVar.get();
                    i8 = i + 1;
                } while (!aVar.compareAndSet(i, i8));
                boolean z3 = (134217727 & i8) == 1;
                qVar.f6203d = (i8 >>> 27) & 15;
                this.f4924h.a(dVar);
                hVar.v(new e(dVar, this, qVar));
                if (z3) {
                    try {
                        this.f4920d.b();
                    } catch (Throwable th2) {
                        synchronized (this.f4921e) {
                            try {
                                if (this.f4922f == null) {
                                    this.f4922f = th2;
                                    o.e0 e0Var = this.f4924h;
                                    Object[] objArr = e0Var.f5442a;
                                    int i10 = e0Var.f5443b;
                                    for (int i11 = 0; i11 < i10; i11++) {
                                        a7.h hVar2 = ((d) objArr[i11]).f4888b;
                                        if (hVar2 != null) {
                                            hVar2.k(s6.a.l(th2));
                                        }
                                    }
                                    this.f4924h.c();
                                    u0.a aVar2 = this.f4923g;
                                    do {
                                        i9 = aVar2.get();
                                    } while (!aVar2.compareAndSet(i9, ((((i9 >>> 27) & 15) + 1) & 15) << 27));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        return hVar.s();
    }

    public final void e(long j7) {
        int i;
        a7.h hVar;
        Object l3;
        synchronized (this.f4921e) {
            try {
                o.e0 e0Var = this.f4924h;
                this.f4924h = this.i;
                this.i = e0Var;
                u0.a aVar = this.f4923g;
                do {
                    i = aVar.get();
                } while (!aVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i8 = e0Var.f5443b;
                for (int i9 = 0; i9 < i8; i9++) {
                    d dVar = (d) e0Var.e(i9);
                    p6.c cVar = dVar.f4887a;
                    if (cVar != null && (hVar = dVar.f4888b) != null) {
                        try {
                            l3 = cVar.i(Long.valueOf(j7));
                        } catch (Throwable th) {
                            l3 = s6.a.l(th);
                        }
                        hVar.k(l3);
                    }
                }
                e0Var.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g6.h
    public final Object g(Object obj, p6.e eVar) {
        return eVar.g(obj, this);
    }

    @Override // g6.h
    public final g6.f l(g6.g gVar) {
        return a.a.j(this, gVar);
    }

    @Override // g6.h
    public final g6.h v(g6.g gVar) {
        return a.a.s(this, gVar);
    }
}
