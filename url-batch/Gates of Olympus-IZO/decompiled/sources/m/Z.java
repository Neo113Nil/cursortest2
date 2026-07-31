package m;

import I.AbstractC0085b;
import I.C0089d;
import I.C0094f0;
import I.C0102j0;
import e2.AbstractC0381e;
import j.C0503u;
import j.C0504v;
import java.util.concurrent.CancellationException;
import k2.C0536h;
import q1.C0784h;

/* loaded from: classes.dex */
public final class Z extends w0 {

    /* renamed from: r, reason: collision with root package name */
    public static final C0604n f5658r = new C0604n(0.0f);

    /* renamed from: s, reason: collision with root package name */
    public static final C0604n f5659s = new C0604n(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final C0102j0 f5660b;

    /* renamed from: c, reason: collision with root package name */
    public final C0102j0 f5661c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5662d;

    /* renamed from: e, reason: collision with root package name */
    public s0 f5663e;

    /* renamed from: f, reason: collision with root package name */
    public long f5664f;

    /* renamed from: g, reason: collision with root package name */
    public final A2.l f5665g;

    /* renamed from: h, reason: collision with root package name */
    public final C0094f0 f5666h;

    /* renamed from: i, reason: collision with root package name */
    public C0536h f5667i;

    /* renamed from: j, reason: collision with root package name */
    public final s2.c f5668j;

    /* renamed from: k, reason: collision with root package name */
    public final M f5669k;

    /* renamed from: l, reason: collision with root package name */
    public long f5670l;

    /* renamed from: m, reason: collision with root package name */
    public final C0504v f5671m;

    /* renamed from: n, reason: collision with root package name */
    public N f5672n;

    /* renamed from: o, reason: collision with root package name */
    public final O f5673o;
    public float p;

    /* renamed from: q, reason: collision with root package name */
    public final O f5674q;

    public Z(C0784h c0784h) {
        super(0);
        I.X x3 = I.X.f2228i;
        this.f5660b = C0089d.J(c0784h, x3);
        this.f5661c = C0089d.J(c0784h, x3);
        this.f5662d = c0784h;
        this.f5665g = new A2.l(22, this);
        int i3 = AbstractC0085b.f2235b;
        this.f5666h = new C0094f0(0.0f);
        this.f5668j = s2.d.a();
        this.f5669k = new M();
        this.f5670l = Long.MIN_VALUE;
        this.f5671m = new C0504v();
        this.f5673o = new O(this, 1);
        this.f5674q = new O(this, 0);
    }

    public static final void f(Z z3) {
        s0 s0Var = z3.f5663e;
        if (s0Var == null) {
            return;
        }
        N n3 = z3.f5672n;
        if (n3 == null) {
            if (z3.f5664f > 0) {
                C0094f0 c0094f0 = z3.f5666h;
                if (c0094f0.g() != 1.0f && !Z1.i.a(z3.f5661c.getValue(), z3.f5660b.getValue())) {
                    N n4 = new N();
                    n4.f5606d = c0094f0.g();
                    long j3 = z3.f5664f;
                    n4.f5609g = j3;
                    n4.f5610h = M1.B.N((1.0d - c0094f0.g()) * j3);
                    n4.f5607e.e(c0094f0.g(), 0);
                    n3 = n4;
                }
            }
            n3 = null;
        }
        if (n3 != null) {
            n3.f5609g = z3.f5664f;
            z3.f5671m.a(n3);
            s0Var.n(n3);
        }
        z3.f5672n = null;
    }

    public static final void g(Z z3, N n3, long j3) {
        z3.getClass();
        long j4 = n3.f5603a + j3;
        n3.f5603a = j4;
        long j5 = n3.f5610h;
        if (j4 >= j5) {
            n3.f5606d = 1.0f;
            return;
        }
        B0 b02 = n3.f5604b;
        if (b02 == null) {
            float a3 = n3.f5607e.a(0);
            float f3 = j4 / j5;
            y0 y0Var = z0.f5885a;
            n3.f5606d = (1.0f * f3) + ((1 - f3) * a3);
            return;
        }
        C0604n c0604n = f5659s;
        C0604n c0604n2 = n3.f5608f;
        if (c0604n2 == null) {
            c0604n2 = f5658r;
        }
        n3.f5606d = AbstractC0381e.q(((C0604n) b02.c(j4, n3.f5607e, c0604n, c0604n2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(Z z3, R1.c cVar) {
        S s3;
        Q1.a aVar;
        int i3;
        L1.z zVar;
        z3.getClass();
        if (cVar instanceof S) {
            s3 = (S) cVar;
            int i4 = s3.f5628g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s3.f5628g = i4 - Integer.MIN_VALUE;
                Object obj = s3.f5626e;
                aVar = Q1.a.f3113d;
                i3 = s3.f5628g;
                zVar = L1.z.f2729a;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    if (z3.f5671m.f5219b != 0 || z3.f5672n != null) {
                        if (AbstractC0595e.g(s3.getContext()) == 0.0f) {
                            z3.l();
                            z3.f5670l = Long.MIN_VALUE;
                        } else if (z3.f5670l == Long.MIN_VALUE) {
                            s3.f5625d = z3;
                            s3.f5628g = 1;
                            if (C0089d.F(s3.getContext()).j(z3.f5673o, s3) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    return zVar;
                }
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = s3.f5625d;
                I2.l.Q(obj);
                do {
                    if (z3.f5671m.f5219b == 0 && z3.f5672n == null) {
                        z3.f5670l = Long.MIN_VALUE;
                        return zVar;
                    }
                    s3.f5625d = z3;
                    s3.f5628g = 2;
                } while (z3.k(s3) != aVar);
                return aVar;
            }
        }
        s3 = new S(z3, cVar);
        Object obj2 = s3.f5626e;
        aVar = Q1.a.f3113d;
        i3 = s3.f5628g;
        zVar = L1.z.f2729a;
        if (i3 != 0) {
        }
        do {
            if (z3.f5671m.f5219b == 0) {
                z3.f5670l = Long.MIN_VALUE;
                return zVar;
            }
            s3.f5625d = z3;
            s3.f5628g = 2;
        } while (z3.k(s3) != aVar);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(Z z3, R1.c cVar) {
        X x3;
        Q1.a aVar;
        int i3;
        Object value;
        Object p;
        Z z4;
        Object obj;
        z3.getClass();
        if (cVar instanceof X) {
            x3 = (X) cVar;
            int i4 = x3.f5652h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x3.f5652h = i4 - Integer.MIN_VALUE;
                Object obj2 = x3.f5650f;
                aVar = Q1.a.f3113d;
                i3 = x3.f5652h;
                if (i3 != 0) {
                    I2.l.Q(obj2);
                    value = z3.f5660b.getValue();
                    x3.f5648d = z3;
                    x3.f5649e = value;
                    x3.f5652h = 1;
                    if (z3.f5668j.c(null, x3) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = x3.f5649e;
                        z4 = x3.f5648d;
                        I2.l.Q(obj2);
                        if (!Z1.i.a(obj2, obj)) {
                            return L1.z.f2729a;
                        }
                        z4.f5670l = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = x3.f5649e;
                    Z z5 = x3.f5648d;
                    I2.l.Q(obj2);
                    value = obj3;
                    z3 = z5;
                }
                x3.f5648d = z3;
                x3.f5649e = value;
                x3.f5652h = 2;
                C0536h c0536h = new C0536h(1, M1.B.G(x3));
                c0536h.q();
                z3.f5667i = c0536h;
                z3.f5668j.e(null);
                p = c0536h.p();
                if (p != aVar) {
                    return aVar;
                }
                z4 = z3;
                obj = value;
                obj2 = p;
                if (!Z1.i.a(obj2, obj)) {
                }
            }
        }
        x3 = new X(z3, cVar);
        Object obj22 = x3.f5650f;
        aVar = Q1.a.f3113d;
        i3 = x3.f5652h;
        if (i3 != 0) {
        }
        x3.f5648d = z3;
        x3.f5649e = value;
        x3.f5652h = 2;
        C0536h c0536h2 = new C0536h(1, M1.B.G(x3));
        c0536h2.q();
        z3.f5667i = c0536h2;
        z3.f5668j.e(null);
        p = c0536h2.p();
        if (p != aVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(Z z3, R1.c cVar) {
        Y y3;
        int i3;
        Z z4;
        Object obj;
        boolean a3;
        Z z5;
        z3.getClass();
        if (cVar instanceof Y) {
            y3 = (Y) cVar;
            int i4 = y3.f5657h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                y3.f5657h = i4 - Integer.MIN_VALUE;
                Object obj2 = y3.f5655f;
                Q1.a aVar = Q1.a.f3113d;
                i3 = y3.f5657h;
                if (i3 != 0) {
                    I2.l.Q(obj2);
                    Object value = z3.f5660b.getValue();
                    y3.f5653d = z3;
                    y3.f5654e = value;
                    y3.f5657h = 1;
                    if (z3.f5668j.c(null, y3) == aVar) {
                        return aVar;
                    }
                    z4 = z3;
                    obj = value;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = y3.f5654e;
                        z5 = y3.f5653d;
                        I2.l.Q(obj2);
                        if (!Z1.i.a(obj2, obj)) {
                            z5.f5670l = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return L1.z.f2729a;
                    }
                    obj = y3.f5654e;
                    z4 = y3.f5653d;
                    I2.l.Q(obj2);
                }
                a3 = Z1.i.a(obj, z4.f5662d);
                s2.c cVar2 = z4.f5668j;
                if (!a3) {
                    cVar2.e(null);
                    return L1.z.f2729a;
                }
                y3.f5653d = z4;
                y3.f5654e = obj;
                y3.f5657h = 2;
                C0536h c0536h = new C0536h(1, M1.B.G(y3));
                c0536h.q();
                z4.f5667i = c0536h;
                cVar2.e(null);
                obj2 = c0536h.p();
                if (obj2 == aVar) {
                    return aVar;
                }
                z5 = z4;
                if (!Z1.i.a(obj2, obj)) {
                }
                return L1.z.f2729a;
            }
        }
        y3 = new Y(z3, cVar);
        Object obj22 = y3.f5655f;
        Q1.a aVar2 = Q1.a.f3113d;
        i3 = y3.f5657h;
        if (i3 != 0) {
        }
        a3 = Z1.i.a(obj, z4.f5662d);
        s2.c cVar22 = z4.f5668j;
        if (!a3) {
        }
    }

    @Override // m.w0
    public final Object a() {
        return this.f5661c.getValue();
    }

    @Override // m.w0
    public final Object b() {
        return this.f5660b.getValue();
    }

    @Override // m.w0
    public final void c(Object obj) {
        this.f5661c.setValue(obj);
    }

    @Override // m.w0
    public final void d(s0 s0Var) {
        s0 s0Var2 = this.f5663e;
        if (s0Var2 == null || Z1.i.a(s0Var, s0Var2)) {
            this.f5663e = s0Var;
            return;
        }
        throw new IllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f5663e + ", new instance: " + s0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:4:0x0010, B:6:0x0018, B:9:0x007c, B:13:0x0087, B:15:0x0097, B:17:0x008c, B:21:0x002b, B:24:0x0037, B:26:0x004c, B:28:0x0058, B:30:0x0062, B:32:0x006f, B:38:0x0077, B:41:0x009b), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Type inference failed for: r0v1, types: [L1.g, java.lang.Object] */
    @Override // m.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int i3;
        this.f5663e = null;
        S.w wVar = (S.w) v0.f5874a.getValue();
        synchronized (wVar.f3267f) {
            try {
                K.d dVar = wVar.f3267f;
                int i4 = dVar.f2642f;
                int i5 = 0;
                int i6 = 0;
                while (i5 < i4) {
                    S.v vVar = (S.v) dVar.f2640d[i5];
                    C0503u c0503u = (C0503u) vVar.f3255f.g(this);
                    if (c0503u != null) {
                        Object[] objArr = c0503u.f5213b;
                        int[] iArr = c0503u.f5214c;
                        long[] jArr = c0503u.f5212a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j3 = jArr[i7];
                                i3 = i5;
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8;
                                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((j3 & 255) < 128) {
                                            int i11 = (i7 << 3) + i10;
                                            Object obj = objArr[i11];
                                            int i12 = iArr[i11];
                                            vVar.d(this, obj);
                                            i8 = 8;
                                        }
                                        j3 >>= i8;
                                    }
                                    if (i9 != i8) {
                                        break;
                                    }
                                }
                                if (i7 == length) {
                                    break;
                                }
                                i7++;
                                i5 = i3;
                            }
                            if (vVar.f3255f.f5230e == 0) {
                                i6++;
                            } else if (i6 > 0) {
                                Object[] objArr2 = dVar.f2640d;
                                objArr2[i3 - i6] = objArr2[i3];
                            }
                            i5 = i3 + 1;
                        }
                    }
                    i3 = i5;
                    if (vVar.f3255f.f5230e == 0) {
                    }
                    i5 = i3 + 1;
                }
                int i13 = i4 - i6;
                M1.k.c0(dVar.f2640d, i13, i4);
                dVar.f2642f = i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object k(R1.c cVar) {
        float g3 = AbstractC0595e.g(cVar.getContext());
        L1.z zVar = L1.z.f2729a;
        if (g3 <= 0.0f) {
            l();
            return zVar;
        }
        this.p = g3;
        Object j3 = C0089d.F(cVar.getContext()).j(this.f5674q, cVar);
        return j3 == Q1.a.f3113d ? j3 : zVar;
    }

    public final void l() {
        s0 s0Var = this.f5663e;
        if (s0Var != null) {
            s0Var.c();
        }
        C0504v c0504v = this.f5671m;
        M1.k.c0(c0504v.f5218a, 0, c0504v.f5219b);
        c0504v.f5219b = 0;
        if (this.f5672n != null) {
            this.f5672n = null;
            o(1.0f);
            n();
        }
    }

    public final Object m(float f3, Object obj, R1.i iVar) {
        if (0.0f > f3 || f3 > 1.0f) {
            throw new IllegalArgumentException("Expecting fraction between 0 and 1. Got " + f3);
        }
        s0 s0Var = this.f5663e;
        L1.z zVar = L1.z.f2729a;
        if (s0Var == null) {
            return zVar;
        }
        Object a3 = M.a(this.f5669k, new V(obj, this.f5660b.getValue(), this, s0Var, f3, null), iVar);
        return a3 == Q1.a.f3113d ? a3 : zVar;
    }

    public final void n() {
        s0 s0Var = this.f5663e;
        if (s0Var == null) {
            return;
        }
        s0Var.m(M1.B.N(this.f5666h.g() * ((Number) s0Var.f5852l.getValue()).longValue()));
    }

    public final void o(float f3) {
        this.f5666h.h(f3);
    }
}
