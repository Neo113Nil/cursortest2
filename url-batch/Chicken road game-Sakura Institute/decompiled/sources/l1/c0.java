package l1;

import a0.k0;
import c7.m1;
import s1.l2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c0 implements m2.b, h6.d {

    /* renamed from: f, reason: collision with root package name */
    public final c7.h f5780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f5781g;

    /* renamed from: h, reason: collision with root package name */
    public c7.h f5782h;

    /* renamed from: i, reason: collision with root package name */
    public k f5783i = k.f5816g;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f5784j;

    public c0(d0 d0Var, c7.h hVar) {
        this.f5784j = d0Var;
        this.f5780f = hVar;
        this.f5781g = d0Var;
    }

    @Override // m2.b
    public final float G(long j8) {
        return this.f5781g.G(j8);
    }

    @Override // m2.b
    public final int K(float f9) {
        return this.f5781g.K(f9);
    }

    @Override // m2.b
    public final long U(long j8) {
        return this.f5781g.U(j8);
    }

    @Override // m2.b
    public final float X(long j8) {
        return this.f5781g.X(j8);
    }

    @Override // m2.b
    public final float a() {
        return this.f5781g.a();
    }

    public final Object b(k kVar, j6.a aVar) {
        c7.h hVar = new c7.h(1, a8.m.A(aVar));
        hVar.r();
        this.f5783i = kVar;
        this.f5782h = hVar;
        return hVar.q();
    }

    public final long c() {
        d0 d0Var = this.f5784j;
        long U = d0Var.U(r1.f.t(d0Var).f7737x.g());
        long j8 = d0Var.A;
        return v0.d.a(Math.max(0.0f, y0.f.d(U) - ((int) (j8 >> 32))) / 2.0f, Math.max(0.0f, y0.f.b(U) - ((int) (j8 & 4294967295L))) / 2.0f);
    }

    public final l2 e() {
        d0 d0Var = this.f5784j;
        d0Var.getClass();
        return r1.f.t(d0Var).f7737x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r6v0, types: [long] */
    /* JADX WARN: Type inference failed for: r6v1, types: [c7.x0] */
    /* JADX WARN: Type inference failed for: r6v4, types: [c7.x0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0, types: [q6.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j8, q6.e eVar, j6.a aVar) {
        b0 b0Var;
        int i7;
        c7.h hVar;
        try {
            if (aVar instanceof b0) {
                b0Var = (b0) aVar;
                int i8 = b0Var.f5777i;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    b0Var.f5777i = i8 - Integer.MIN_VALUE;
                    Object obj = b0Var.f5775g;
                    i7 = b0Var.f5777i;
                    if (i7 != 0) {
                        d6.a.e(obj);
                        if (j8 <= 0 && (hVar = this.f5782h) != null) {
                            hVar.resumeWith(d6.a.b(new l(j8)));
                        }
                        m1 p6 = c7.a0.p(this.f5784j.o0(), null, null, new k0((long) j8, this, (h6.d) null), 3);
                        b0Var.f5774f = p6;
                        b0Var.f5777i = 1;
                        obj = eVar.d(this, b0Var);
                        i6.a aVar2 = i6.a.f4956f;
                        j8 = p6;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m1 m1Var = b0Var.f5774f;
                        d6.a.e(obj);
                        j8 = m1Var;
                    }
                    return obj;
                }
            }
            if (i7 != 0) {
            }
            return obj;
        } finally {
            j8.c(b.f5773f);
        }
        b0Var = new b0(this, aVar);
        Object obj2 = b0Var.f5775g;
        i7 = b0Var.f5777i;
    }

    @Override // m2.b
    public final long g0(float f9) {
        return this.f5781g.g0(f9);
    }

    @Override // h6.d
    public final h6.i getContext() {
        return h6.j.f4661f;
    }

    @Override // m2.b
    public final float k0(int i7) {
        return this.f5781g.k0(i7);
    }

    @Override // m2.b
    public final float l0(float f9) {
        return f9 / this.f5781g.a();
    }

    @Override // m2.b
    public final float m() {
        return this.f5781g.m();
    }

    @Override // h6.d
    public final void resumeWith(Object obj) {
        d0 d0Var = this.f5784j;
        synchronized (d0Var.f5793x) {
            d0Var.f5793x.n(this);
        }
        this.f5780f.resumeWith(obj);
    }

    @Override // m2.b
    public final long w(float f9) {
        return this.f5781g.w(f9);
    }

    @Override // m2.b
    public final long x(long j8) {
        return this.f5781g.x(j8);
    }

    @Override // m2.b
    public final float y(float f9) {
        return this.f5781g.a() * f9;
    }
}
