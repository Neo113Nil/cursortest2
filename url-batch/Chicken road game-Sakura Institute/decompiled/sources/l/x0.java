package l;

import java.util.Arrays;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x0 extends u1 {

    /* renamed from: r, reason: collision with root package name */
    public static final m f5704r = new m(0.0f);

    /* renamed from: s, reason: collision with root package name */
    public static final m f5705s = new m(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final g0.g1 f5706b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.g1 f5707c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5708d;

    /* renamed from: e, reason: collision with root package name */
    public p1 f5709e;

    /* renamed from: f, reason: collision with root package name */
    public long f5710f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.r0 f5711g;

    /* renamed from: h, reason: collision with root package name */
    public final g0.c1 f5712h;

    /* renamed from: i, reason: collision with root package name */
    public c7.h f5713i;

    /* renamed from: j, reason: collision with root package name */
    public final k7.c f5714j;

    /* renamed from: k, reason: collision with root package name */
    public final o0 f5715k;

    /* renamed from: l, reason: collision with root package name */
    public long f5716l;

    /* renamed from: m, reason: collision with root package name */
    public final i.v f5717m;

    /* renamed from: n, reason: collision with root package name */
    public p0 f5718n;

    /* renamed from: o, reason: collision with root package name */
    public final q0 f5719o;

    /* renamed from: p, reason: collision with root package name */
    public float f5720p;

    /* renamed from: q, reason: collision with root package name */
    public final q0 f5721q;

    public x0(t3.h hVar) {
        super(0);
        g0.t0 t0Var = g0.t0.f3903k;
        this.f5706b = g0.d.J(hVar, t0Var);
        this.f5707c = g0.d.J(hVar, t0Var);
        this.f5708d = hVar;
        this.f5711g = new androidx.lifecycle.r0(18, this);
        this.f5712h = g0.d.H(0.0f);
        this.f5714j = new k7.c();
        this.f5715k = new o0();
        this.f5716l = Long.MIN_VALUE;
        this.f5717m = new i.v();
        this.f5719o = new q0(this, 1);
        this.f5721q = new q0(this, 0);
    }

    public static final void f(x0 x0Var) {
        p1 p1Var = x0Var.f5709e;
        g0.c1 c1Var = x0Var.f5712h;
        if (p1Var == null) {
            return;
        }
        p0 p0Var = x0Var.f5718n;
        if (p0Var == null) {
            if (x0Var.f5710f <= 0 || c1Var.e() == 1.0f || r6.k.a(x0Var.f5707c.getValue(), x0Var.f5706b.getValue())) {
                p0Var = null;
            } else {
                p0Var = new p0();
                p0Var.f5605d = c1Var.e();
                long j8 = x0Var.f5710f;
                p0Var.f5608g = j8;
                p0Var.f5609h = t6.a.P((1.0d - c1Var.e()) * j8);
                p0Var.f5606e.e(c1Var.e(), 0);
            }
        }
        if (p0Var != null) {
            p0Var.f5608g = x0Var.f5710f;
            x0Var.f5717m.a(p0Var);
            p1Var.n(p0Var);
        }
        x0Var.f5718n = null;
    }

    public static final void g(x0 x0Var, p0 p0Var, long j8) {
        long j9 = p0Var.f5602a;
        m mVar = p0Var.f5606e;
        long j10 = j9 + j8;
        p0Var.f5602a = j10;
        long j11 = p0Var.f5609h;
        if (j10 >= j11) {
            p0Var.f5605d = 1.0f;
            return;
        }
        a2 a2Var = p0Var.f5603b;
        if (a2Var != null) {
            m mVar2 = p0Var.f5607f;
            if (mVar2 == null) {
                mVar2 = f5704r;
            }
            p0Var.f5605d = v1.g.d(((m) a2Var.e(j10, mVar, f5705s, mVar2)).a(0), 0.0f, 1.0f);
            return;
        }
        float a3 = mVar.a(0);
        float f9 = j10 / j11;
        w1 w1Var = x1.f5722a;
        p0Var.f5605d = (1.0f * f9) + ((1 - f9) * a3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if (g0.d.E(r0.getContext()).t(r11, r0) == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(x0 x0Var, j6.c cVar) {
        s0 s0Var;
        int i7;
        d6.z zVar;
        i6.a aVar;
        x0Var.getClass();
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i8 = s0Var.f5654i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                s0Var.f5654i = i8 - Integer.MIN_VALUE;
                Object obj = s0Var.f5652g;
                i7 = s0Var.f5654i;
                zVar = d6.z.f2639a;
                aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj);
                    if (x0Var.f5717m.f4805b == 0 && x0Var.f5718n == null) {
                        return zVar;
                    }
                    if (e.i(s0Var.getContext()) == 0.0f) {
                        x0Var.l();
                        x0Var.f5716l = Long.MIN_VALUE;
                        return zVar;
                    }
                    if (x0Var.f5716l == Long.MIN_VALUE) {
                        q0 q0Var = x0Var.f5719o;
                        s0Var.f5651f = x0Var;
                        s0Var.f5654i = 1;
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x0Var = s0Var.f5651f;
                    d6.a.e(obj);
                }
                do {
                    if (x0Var.f5717m.f4805b == 0 && x0Var.f5718n == null) {
                        x0Var.f5716l = Long.MIN_VALUE;
                        return zVar;
                    }
                    s0Var.f5651f = x0Var;
                    s0Var.f5654i = 2;
                } while (x0Var.k(s0Var) != aVar);
                return aVar;
            }
        }
        s0Var = new s0(x0Var, cVar);
        Object obj2 = s0Var.f5652g;
        i7 = s0Var.f5654i;
        zVar = d6.z.f2639a;
        aVar = i6.a.f4956f;
        if (i7 != 0) {
        }
        do {
            if (x0Var.f5717m.f4805b == 0) {
                x0Var.f5716l = Long.MIN_VALUE;
                return zVar;
            }
            s0Var.f5651f = x0Var;
            s0Var.f5654i = 2;
        } while (x0Var.k(s0Var) != aVar);
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r1.c(r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(x0 x0Var, j6.c cVar) {
        v0 v0Var;
        int i7;
        i6.a aVar;
        Object value;
        Object q8;
        x0 x0Var2;
        Object obj;
        x0Var.getClass();
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i8 = v0Var.f5692j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                v0Var.f5692j = i8 - Integer.MIN_VALUE;
                Object obj2 = v0Var.f5690h;
                i7 = v0Var.f5692j;
                aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj2);
                    value = x0Var.f5706b.getValue();
                    k7.c cVar2 = x0Var.f5714j;
                    v0Var.f5688f = x0Var;
                    v0Var.f5689g = value;
                    v0Var.f5692j = 1;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = v0Var.f5689g;
                        x0Var2 = v0Var.f5688f;
                        d6.a.e(obj2);
                        if (!r6.k.a(obj2, obj)) {
                            return d6.z.f2639a;
                        }
                        x0Var2.f5716l = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = v0Var.f5689g;
                    x0 x0Var3 = v0Var.f5688f;
                    d6.a.e(obj2);
                    value = obj3;
                    x0Var = x0Var3;
                }
                v0Var.f5688f = x0Var;
                v0Var.f5689g = value;
                v0Var.f5692j = 2;
                c7.h hVar = new c7.h(1, a8.m.A(v0Var));
                hVar.r();
                x0Var.f5713i = hVar;
                x0Var.f5714j.e(null);
                q8 = hVar.q();
                if (q8 != aVar) {
                    x0Var2 = x0Var;
                    obj = value;
                    obj2 = q8;
                    if (!r6.k.a(obj2, obj)) {
                    }
                }
                return aVar;
            }
        }
        v0Var = new v0(x0Var, cVar);
        Object obj22 = v0Var.f5690h;
        i7 = v0Var.f5692j;
        aVar = i6.a.f4956f;
        if (i7 != 0) {
        }
        v0Var.f5688f = x0Var;
        v0Var.f5689g = value;
        v0Var.f5692j = 2;
        c7.h hVar2 = new c7.h(1, a8.m.A(v0Var));
        hVar2.r();
        x0Var.f5713i = hVar2;
        x0Var.f5714j.e(null);
        q8 = hVar2.q();
        if (q8 != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(x0 x0Var, j6.c cVar) {
        w0 w0Var;
        int i7;
        x0 x0Var2;
        Object obj;
        Object obj2;
        x0 x0Var3;
        x0Var.getClass();
        if (cVar instanceof w0) {
            w0Var = (w0) cVar;
            int i8 = w0Var.f5701j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                w0Var.f5701j = i8 - Integer.MIN_VALUE;
                Object obj3 = w0Var.f5699h;
                i7 = w0Var.f5701j;
                i6.a aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj3);
                    Object value = x0Var.f5706b.getValue();
                    k7.c cVar2 = x0Var.f5714j;
                    w0Var.f5697f = x0Var;
                    w0Var.f5698g = value;
                    w0Var.f5701j = 1;
                    if (cVar2.c(w0Var) != aVar) {
                        x0Var2 = x0Var;
                        obj = value;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = w0Var.f5698g;
                    x0Var3 = w0Var.f5697f;
                    d6.a.e(obj3);
                    if (!r6.k.a(obj3, obj)) {
                        x0Var3.f5716l = Long.MIN_VALUE;
                        throw new CancellationException("snapTo() was canceled because state was changed to " + obj3 + " instead of " + obj);
                    }
                    return d6.z.f2639a;
                }
                obj = w0Var.f5698g;
                x0Var2 = w0Var.f5697f;
                d6.a.e(obj3);
                obj2 = x0Var2.f5708d;
                k7.c cVar3 = x0Var2.f5714j;
                if (!r6.k.a(obj, obj2)) {
                    cVar3.e(null);
                    return d6.z.f2639a;
                }
                w0Var.f5697f = x0Var2;
                w0Var.f5698g = obj;
                w0Var.f5701j = 2;
                c7.h hVar = new c7.h(1, a8.m.A(w0Var));
                hVar.r();
                x0Var2.f5713i = hVar;
                cVar3.e(null);
                obj3 = hVar.q();
                if (obj3 != aVar) {
                    x0Var3 = x0Var2;
                    if (!r6.k.a(obj3, obj)) {
                    }
                    return d6.z.f2639a;
                }
                return aVar;
            }
        }
        w0Var = new w0(x0Var, cVar);
        Object obj32 = w0Var.f5699h;
        i7 = w0Var.f5701j;
        i6.a aVar2 = i6.a.f4956f;
        if (i7 != 0) {
        }
        obj2 = x0Var2.f5708d;
        k7.c cVar32 = x0Var2.f5714j;
        if (!r6.k.a(obj, obj2)) {
        }
    }

    @Override // l.u1
    public final Object a() {
        return this.f5707c.getValue();
    }

    @Override // l.u1
    public final Object b() {
        return this.f5706b.getValue();
    }

    @Override // l.u1
    public final void c(Object obj) {
        this.f5707c.setValue(obj);
    }

    @Override // l.u1
    public final void d(p1 p1Var) {
        p1 p1Var2 = this.f5709e;
        if (p1Var2 == null || p1Var.equals(p1Var2)) {
            this.f5709e = p1Var;
            return;
        }
        throw new IllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f5709e + ", new instance: " + p1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008f A[Catch: all -> 0x009d, TryCatch #0 {all -> 0x009d, blocks: (B:4:0x0010, B:6:0x0018, B:9:0x0084, B:13:0x008f, B:15:0x009f, B:17:0x0094, B:21:0x002b, B:24:0x0037, B:26:0x004c, B:28:0x0058, B:30:0x0062, B:32:0x0072, B:40:0x007e, B:43:0x00a4), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [d6.g, java.lang.Object] */
    @Override // l.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int i7;
        int i8;
        this.f5709e = null;
        q0.t tVar = (q0.t) t1.f5666a.getValue();
        synchronized (tVar.f7459f) {
            try {
                i0.d dVar = tVar.f7459f;
                int i9 = dVar.f4842h;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i9) {
                    q0.s sVar = (q0.s) dVar.f4840f[i10];
                    i.u uVar = (i.u) sVar.f7447f.g(this);
                    if (uVar != null) {
                        Object[] objArr = uVar.f4799b;
                        int[] iArr = uVar.f4800c;
                        long[] jArr = uVar.f4798a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j8 = jArr[i12];
                                i7 = i10;
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8;
                                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        if ((j8 & 255) < 128) {
                                            int i16 = (i12 << 3) + i15;
                                            i8 = i13;
                                            Object obj = objArr[i16];
                                            int i17 = iArr[i16];
                                            sVar.d(this, obj);
                                        } else {
                                            i8 = i13;
                                        }
                                        j8 >>= i8;
                                        i15++;
                                        i13 = i8;
                                    }
                                    if (i14 != i13) {
                                        break;
                                    }
                                }
                                if (i12 == length) {
                                    break;
                                }
                                i12++;
                                i10 = i7;
                            }
                            if (sVar.f7447f.f4816e == 0) {
                                i11++;
                            } else if (i11 > 0) {
                                Object[] objArr2 = dVar.f4840f;
                                objArr2[i7 - i11] = objArr2[i7];
                            }
                            i10 = i7 + 1;
                        }
                    }
                    i7 = i10;
                    if (sVar.f7447f.f4816e == 0) {
                    }
                    i10 = i7 + 1;
                }
                int i18 = i9 - i11;
                Arrays.fill(dVar.f4840f, i18, i9, (Object) null);
                dVar.f4842h = i18;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object k(j6.c cVar) {
        float i7 = e.i(cVar.getContext());
        d6.z zVar = d6.z.f2639a;
        if (i7 <= 0.0f) {
            l();
            return zVar;
        }
        this.f5720p = i7;
        Object t2 = g0.d.E(cVar.getContext()).t(this.f5721q, cVar);
        return t2 == i6.a.f4956f ? t2 : zVar;
    }

    public final void l() {
        p1 p1Var = this.f5709e;
        if (p1Var != null) {
            p1Var.c();
        }
        i.v vVar = this.f5717m;
        e6.k.c0(0, vVar.f4805b, null, vVar.f4804a);
        vVar.f4805b = 0;
        if (this.f5718n != null) {
            this.f5718n = null;
            o(1.0f);
            n();
        }
    }

    public final Object m(float f9, Object obj, j6.i iVar) {
        if (0.0f > f9 || f9 > 1.0f) {
            throw new IllegalArgumentException("Expecting fraction between 0 and 1. Got " + f9);
        }
        p1 p1Var = this.f5709e;
        if (p1Var != null) {
            Object a3 = o0.a(this.f5715k, new u0(obj, this.f5706b.getValue(), this, p1Var, f9, null), iVar);
            if (a3 == i6.a.f4956f) {
                return a3;
            }
        }
        return d6.z.f2639a;
    }

    public final void n() {
        p1 p1Var = this.f5709e;
        if (p1Var == null) {
            return;
        }
        p1Var.m(t6.a.P(this.f5712h.e() * ((Number) p1Var.f5621l.getValue()).longValue()));
    }

    public final void o(float f9) {
        this.f5712h.f(f9);
    }
}
