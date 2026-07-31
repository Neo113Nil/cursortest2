package n0;

import a.AbstractC0235a;
import a0.C0241f;
import e2.InterfaceC0426e;
import p.C0797x0;
import q2.AbstractC0837y;
import q2.C0821h;
import q2.m0;
import t0.AbstractC0993f;
import u0.O0;

/* renamed from: n0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700A implements O0.b, V1.d {

    /* renamed from: d, reason: collision with root package name */
    public final C0821h f7252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0702C f7253e;

    /* renamed from: f, reason: collision with root package name */
    public C0821h f7254f;

    /* renamed from: g, reason: collision with root package name */
    public EnumC0712j f7255g = EnumC0712j.f7296e;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0702C f7256h;

    public C0700A(C0702C c0702c, C0821h c0821h) {
        this.f7256h = c0702c;
        this.f7252d = c0821h;
        this.f7253e = c0702c;
    }

    @Override // O0.b
    public final long E(long j3) {
        return this.f7253e.E(j3);
    }

    @Override // O0.b
    public final long G(float f3) {
        return this.f7253e.G(f3);
    }

    @Override // O0.b
    public final long H(long j3) {
        return this.f7253e.H(j3);
    }

    @Override // O0.b
    public final float J(float f3) {
        return this.f7253e.a() * f3;
    }

    @Override // O0.b
    public final float K(long j3) {
        return this.f7253e.K(j3);
    }

    @Override // O0.b
    public final long T(float f3) {
        return this.f7253e.T(f3);
    }

    @Override // O0.b
    public final float Y(int i3) {
        return this.f7253e.Y(i3);
    }

    @Override // O0.b
    public final float a() {
        return this.f7253e.a();
    }

    public final Object b(EnumC0712j enumC0712j, X1.a aVar) {
        C0821h c0821h = new C0821h(1, l0.c.B(aVar));
        c0821h.r();
        this.f7255g = enumC0712j;
        this.f7254f = c0821h;
        return c0821h.q();
    }

    @Override // O0.b
    public final float b0(long j3) {
        return this.f7253e.b0(j3);
    }

    public final long c() {
        C0702C c0702c = this.f7256h;
        c0702c.getClass();
        long E3 = c0702c.E(AbstractC0993f.t(c0702c).f8558v.g());
        long j3 = c0702c.f7268z;
        return AbstractC0235a.e(Math.max(0.0f, C0241f.d(E3) - ((int) (j3 >> 32))) / 2.0f, Math.max(0.0f, C0241f.b(E3) - ((int) (j3 & 4294967295L))) / 2.0f);
    }

    @Override // O0.b
    public final float d0(float f3) {
        return f3 / this.f7253e.a();
    }

    public final O0 e() {
        C0702C c0702c = this.f7256h;
        c0702c.getClass();
        return AbstractC0993f.t(c0702c).f8558v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [q2.X] */
    /* JADX WARN: Type inference failed for: r7v4, types: [q2.X] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [e2.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j3, InterfaceC0426e interfaceC0426e, X1.a aVar) {
        x xVar;
        int i3;
        C0821h c0821h;
        try {
            if (aVar instanceof x) {
                xVar = (x) aVar;
                int i4 = xVar.f7340j;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    xVar.f7340j = i4 - Integer.MIN_VALUE;
                    Object obj = xVar.f7338h;
                    W1.a aVar2 = W1.a.f4608d;
                    i3 = xVar.f7340j;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        if (j3 <= 0 && (c0821h = this.f7254f) != null) {
                            c0821h.u(R1.a.b(new C0713k(j3)));
                        }
                        m0 r3 = AbstractC0837y.r(this.f7256h.m0(), null, null, new y(j3, this, null), 3);
                        xVar.f7337g = r3;
                        xVar.f7340j = 1;
                        obj = interfaceC0426e.h(this, xVar);
                        j3 = r3;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m0 m0Var = xVar.f7337g;
                        R1.a.e(obj);
                        j3 = m0Var;
                    }
                    return obj;
                }
            }
            if (i3 != 0) {
            }
            return obj;
        } finally {
            j3.a(C0704b.f7270d);
        }
        xVar = new x(this, aVar);
        Object obj2 = xVar.f7338h;
        W1.a aVar22 = W1.a.f4608d;
        i3 = xVar.f7340j;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j3, C0797x0 c0797x0, X1.a aVar) {
        z zVar;
        int i3;
        try {
            if (aVar instanceof z) {
                zVar = (z) aVar;
                int i4 = zVar.f7346i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    zVar.f7346i = i4 - Integer.MIN_VALUE;
                    Object obj = zVar.f7344g;
                    Object obj2 = W1.a.f4608d;
                    i3 = zVar.f7346i;
                    if (i3 != 0) {
                        R1.a.e(obj);
                        zVar.f7346i = 1;
                        obj = f(j3, c0797x0, zVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        R1.a.e(obj);
                    }
                    return obj;
                }
            }
            if (i3 != 0) {
            }
            return obj;
        } catch (C0713k unused) {
            return null;
        }
        zVar = new z(this, aVar);
        Object obj3 = zVar.f7344g;
        Object obj22 = W1.a.f4608d;
        i3 = zVar.f7346i;
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f7253e.l(f3);
    }

    @Override // O0.b
    public final float r() {
        return this.f7253e.r();
    }

    @Override // V1.d
    public final V1.i t() {
        return V1.j.f4558d;
    }

    @Override // V1.d
    public final void u(Object obj) {
        C0702C c0702c = this.f7256h;
        synchronized (c0702c.f7265w) {
            c0702c.f7265w.n(this);
        }
        this.f7252d.u(obj);
    }
}
