package r;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s0 extends p1 {

    /* renamed from: r, reason: collision with root package name */
    public static final l f6416r = new l(0.0f);

    /* renamed from: s, reason: collision with root package name */
    public static final l f6417s = new l(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final m0.h1 f6418b;

    /* renamed from: c, reason: collision with root package name */
    public final m0.h1 f6419c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6420d;

    /* renamed from: e, reason: collision with root package name */
    public l1 f6421e;

    /* renamed from: f, reason: collision with root package name */
    public long f6422f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.m0 f6423g;

    /* renamed from: h, reason: collision with root package name */
    public final m0.d1 f6424h;
    public a7.h i;

    /* renamed from: j, reason: collision with root package name */
    public final i7.c f6425j;

    /* renamed from: k, reason: collision with root package name */
    public final h0 f6426k;

    /* renamed from: l, reason: collision with root package name */
    public long f6427l;

    /* renamed from: m, reason: collision with root package name */
    public final o.e0 f6428m;

    /* renamed from: n, reason: collision with root package name */
    public l0 f6429n;

    /* renamed from: o, reason: collision with root package name */
    public final k0 f6430o;

    /* renamed from: p, reason: collision with root package name */
    public float f6431p;

    /* renamed from: q, reason: collision with root package name */
    public final k0 f6432q;

    /* JADX WARN: Type inference failed for: r3v6, types: [r.k0] */
    /* JADX WARN: Type inference failed for: r3v7, types: [r.k0] */
    public s0(o4.d dVar) {
        super(0);
        this.f6418b = m0.b.q(dVar);
        this.f6419c = m0.b.q(dVar);
        this.f6420d = dVar;
        this.f6423g = new androidx.lifecycle.m0(11, this);
        this.f6424h = new m0.d1(0.0f);
        this.f6425j = new i7.c();
        this.f6426k = new h0();
        this.f6427l = Long.MIN_VALUE;
        this.f6428m = new o.e0();
        final int i = 0;
        this.f6430o = new p6.c(this) { // from class: r.k0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ s0 f6336e;

            {
                this.f6336e = this;
            }

            @Override // p6.c
            public final Object i(Object obj) {
                Long l3 = (Long) obj;
                switch (i) {
                    case 0:
                        this.f6336e.f6427l = l3.longValue();
                        break;
                    default:
                        long longValue = l3.longValue();
                        s0 s0Var = this.f6336e;
                        long j7 = longValue - s0Var.f6427l;
                        s0Var.f6427l = longValue;
                        long C = s6.a.C(j7 / s0Var.f6431p);
                        o.e0 e0Var = s0Var.f6428m;
                        if (e0Var.h()) {
                            Object[] objArr = e0Var.f5442a;
                            int i8 = e0Var.f5443b;
                            int i9 = 0;
                            for (int i10 = 0; i10 < i8; i10++) {
                                l0 l0Var = (l0) objArr[i10];
                                s0.m(l0Var, C);
                                l0Var.f6340c = true;
                            }
                            l1 l1Var = s0Var.f6421e;
                            if (l1Var != null) {
                                l1Var.o();
                            }
                            int i11 = e0Var.f5443b;
                            Object[] objArr2 = e0Var.f5442a;
                            v6.d u02 = r2.o.u0(0, i11);
                            int i12 = u02.f7492d;
                            int i13 = u02.f7493e;
                            if (i12 <= i13) {
                                while (true) {
                                    objArr2[i12 - i9] = objArr2[i12];
                                    if (((l0) objArr2[i12]).f6340c) {
                                        i9++;
                                    }
                                    if (i12 != i13) {
                                        i12++;
                                    }
                                }
                            }
                            d6.l.L(objArr2, i11 - i9, i11);
                            e0Var.f5443b -= i9;
                        }
                        l0 l0Var2 = s0Var.f6429n;
                        if (l0Var2 != null) {
                            l0Var2.f6344g = s0Var.f6422f;
                            s0.m(l0Var2, C);
                            s0Var.p(l0Var2.f6341d);
                            if (l0Var2.f6341d == 1.0f) {
                                s0Var.f6429n = null;
                            }
                            s0Var.o();
                        }
                        break;
                }
                return c6.m.f1757a;
            }
        };
        final int i8 = 1;
        this.f6432q = new p6.c(this) { // from class: r.k0

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ s0 f6336e;

            {
                this.f6336e = this;
            }

            @Override // p6.c
            public final Object i(Object obj) {
                Long l3 = (Long) obj;
                switch (i8) {
                    case 0:
                        this.f6336e.f6427l = l3.longValue();
                        break;
                    default:
                        long longValue = l3.longValue();
                        s0 s0Var = this.f6336e;
                        long j7 = longValue - s0Var.f6427l;
                        s0Var.f6427l = longValue;
                        long C = s6.a.C(j7 / s0Var.f6431p);
                        o.e0 e0Var = s0Var.f6428m;
                        if (e0Var.h()) {
                            Object[] objArr = e0Var.f5442a;
                            int i82 = e0Var.f5443b;
                            int i9 = 0;
                            for (int i10 = 0; i10 < i82; i10++) {
                                l0 l0Var = (l0) objArr[i10];
                                s0.m(l0Var, C);
                                l0Var.f6340c = true;
                            }
                            l1 l1Var = s0Var.f6421e;
                            if (l1Var != null) {
                                l1Var.o();
                            }
                            int i11 = e0Var.f5443b;
                            Object[] objArr2 = e0Var.f5442a;
                            v6.d u02 = r2.o.u0(0, i11);
                            int i12 = u02.f7492d;
                            int i13 = u02.f7493e;
                            if (i12 <= i13) {
                                while (true) {
                                    objArr2[i12 - i9] = objArr2[i12];
                                    if (((l0) objArr2[i12]).f6340c) {
                                        i9++;
                                    }
                                    if (i12 != i13) {
                                        i12++;
                                    }
                                }
                            }
                            d6.l.L(objArr2, i11 - i9, i11);
                            e0Var.f5443b -= i9;
                        }
                        l0 l0Var2 = s0Var.f6429n;
                        if (l0Var2 != null) {
                            l0Var2.f6344g = s0Var.f6422f;
                            s0.m(l0Var2, C);
                            s0Var.p(l0Var2.f6341d);
                            if (l0Var2.f6341d == 1.0f) {
                                s0Var.f6429n = null;
                            }
                            s0Var.o();
                        }
                        break;
                }
                return c6.m.f1757a;
            }
        };
    }

    public static final void g(s0 s0Var) {
        l1 l1Var = s0Var.f6421e;
        m0.d1 d1Var = s0Var.f6424h;
        if (l1Var == null) {
            return;
        }
        l0 l0Var = s0Var.f6429n;
        if (l0Var == null) {
            if (s0Var.f6422f <= 0 || d1Var.g() == 1.0f || q6.i.a(s0Var.f6419c.getValue(), s0Var.f6418b.getValue())) {
                l0Var = null;
            } else {
                l0Var = new l0();
                l0Var.f6341d = d1Var.g();
                long j7 = s0Var.f6422f;
                l0Var.f6344g = j7;
                l0Var.f6345h = s6.a.C((1.0d - d1Var.g()) * j7);
                l0Var.f6342e.e(0, d1Var.g());
            }
        }
        if (l0Var != null) {
            l0Var.f6344g = s0Var.f6422f;
            s0Var.f6428m.a(l0Var);
            l1Var.m(l0Var);
        }
        s0Var.f6429n = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0070, code lost:
    
        if (m0.b.o(r11).d(r2, r1) == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(s0 s0Var, i6.c cVar) {
        n0 n0Var;
        int i;
        Object obj;
        o.e0 e0Var = s0Var.f6428m;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i8 = n0Var.i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                n0Var.i = i8 - Integer.MIN_VALUE;
                g6.h hVar = n0Var.f3460e;
                Object obj2 = n0Var.f6368g;
                i = n0Var.i;
                c6.m mVar = c6.m.f1757a;
                obj = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj2);
                    if (e0Var.g() && s0Var.f6429n == null) {
                        return mVar;
                    }
                    q6.i.b(hVar);
                    if (d.i(hVar) == 0.0f) {
                        s0Var.l();
                        s0Var.f6427l = Long.MIN_VALUE;
                        return mVar;
                    }
                    if (s0Var.f6427l == Long.MIN_VALUE) {
                        k0 k0Var = s0Var.f6430o;
                        n0Var.i = 1;
                        q6.i.b(hVar);
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s6.a.K(obj2);
                }
                do {
                    if (e0Var.h() && s0Var.f6429n == null) {
                        s0Var.f6427l = Long.MIN_VALUE;
                        return mVar;
                    }
                    n0Var.i = 2;
                } while (s0Var.k(n0Var) != obj);
                return obj;
            }
        }
        n0Var = new n0(s0Var, cVar);
        g6.h hVar2 = n0Var.f3460e;
        Object obj22 = n0Var.f6368g;
        i = n0Var.i;
        c6.m mVar2 = c6.m.f1757a;
        obj = h6.a.f3204d;
        if (i != 0) {
        }
        do {
            if (e0Var.h()) {
            }
            n0Var.i = 2;
        } while (s0Var.k(n0Var) != obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r0.d(r1) == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(s0 s0Var, i6.c cVar) {
        q0 q0Var;
        int i;
        h6.a aVar;
        Object value;
        Object s5;
        Object obj;
        i7.c cVar2 = s0Var.f6425j;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i8 = q0Var.f6398j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                q0Var.f6398j = i8 - Integer.MIN_VALUE;
                Object obj2 = q0Var.f6397h;
                i = q0Var.f6398j;
                aVar = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj2);
                    value = s0Var.f6418b.getValue();
                    q0Var.f6396g = value;
                    q0Var.f6398j = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = q0Var.f6396g;
                        s6.a.K(obj2);
                        if (!q6.i.a(obj2, obj)) {
                            return c6.m.f1757a;
                        }
                        s0Var.f6427l = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = q0Var.f6396g;
                    s6.a.K(obj2);
                    value = obj3;
                }
                q0Var.f6396g = value;
                q0Var.f6398j = 2;
                a7.h hVar = new a7.h(1, m.a.G(q0Var));
                hVar.t();
                s0Var.i = hVar;
                cVar2.f(null);
                s5 = hVar.s();
                if (s5 != aVar) {
                    obj = value;
                    obj2 = s5;
                    if (!q6.i.a(obj2, obj)) {
                    }
                }
                return aVar;
            }
        }
        q0Var = new q0(s0Var, cVar);
        Object obj22 = q0Var.f6397h;
        i = q0Var.f6398j;
        aVar = h6.a.f3204d;
        if (i != 0) {
        }
        q0Var.f6396g = value;
        q0Var.f6398j = 2;
        a7.h hVar2 = new a7.h(1, m.a.G(q0Var));
        hVar2.t();
        s0Var.i = hVar2;
        cVar2.f(null);
        s5 = hVar2.s();
        if (s5 != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r0.d(r1) == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(s0 s0Var, i6.c cVar) {
        r0 r0Var;
        int i;
        Object value;
        Object obj;
        i7.c cVar2 = s0Var.f6425j;
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i8 = r0Var.f6412j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                r0Var.f6412j = i8 - Integer.MIN_VALUE;
                Object obj2 = r0Var.f6411h;
                i = r0Var.f6412j;
                h6.a aVar = h6.a.f3204d;
                if (i != 0) {
                    s6.a.K(obj2);
                    value = s0Var.f6418b.getValue();
                    r0Var.f6410g = value;
                    r0Var.f6412j = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = r0Var.f6410g;
                        s6.a.K(obj2);
                        if (!q6.i.a(obj2, obj)) {
                            s0Var.f6427l = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return c6.m.f1757a;
                    }
                    Object obj3 = r0Var.f6410g;
                    s6.a.K(obj2);
                    value = obj3;
                }
                if (!q6.i.a(value, s0Var.f6420d)) {
                    cVar2.f(null);
                    return c6.m.f1757a;
                }
                r0Var.f6410g = value;
                r0Var.f6412j = 2;
                a7.h hVar = new a7.h(1, m.a.G(r0Var));
                hVar.t();
                s0Var.i = hVar;
                cVar2.f(null);
                Object s5 = hVar.s();
                if (s5 != aVar) {
                    obj = value;
                    obj2 = s5;
                    if (!q6.i.a(obj2, obj)) {
                    }
                    return c6.m.f1757a;
                }
                return aVar;
            }
        }
        r0Var = new r0(s0Var, cVar);
        Object obj22 = r0Var.f6411h;
        i = r0Var.f6412j;
        h6.a aVar2 = h6.a.f3204d;
        if (i != 0) {
        }
        if (!q6.i.a(value, s0Var.f6420d)) {
        }
    }

    public static void m(l0 l0Var, long j7) {
        long j8 = l0Var.f6338a;
        l lVar = l0Var.f6342e;
        long j9 = j8 + j7;
        l0Var.f6338a = j9;
        long j10 = l0Var.f6345h;
        if (j9 >= j10) {
            l0Var.f6341d = 1.0f;
            return;
        }
        v1 v1Var = l0Var.f6339b;
        if (v1Var == null) {
            float f6 = j9 / j10;
            l0Var.f6341d = (f6 * 1.0f) + ((1 - f6) * lVar.a(0));
            return;
        }
        l lVar2 = l0Var.f6343f;
        if (lVar2 == null) {
            lVar2 = f6416r;
        }
        l0Var.f6341d = r2.o.s(((l) v1Var.k(j9, lVar, f6417s, lVar2)).a(0), 0.0f, 1.0f);
    }

    @Override // r.p1
    public final Object b() {
        return this.f6419c.getValue();
    }

    @Override // r.p1
    public final void d(Object obj) {
        this.f6419c.setValue(obj);
    }

    @Override // r.p1
    public final void e(l1 l1Var) {
        l1 l1Var2 = this.f6421e;
        if (l1Var2 != null && !l1Var.equals(l1Var2)) {
            i0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f6421e + ", new instance: " + l1Var);
        }
        this.f6421e = l1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008a A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:4:0x0010, B:6:0x0018, B:9:0x0082, B:11:0x008a, B:13:0x009a, B:15:0x008f, B:18:0x002b, B:21:0x0037, B:23:0x004c, B:25:0x0058, B:27:0x0062, B:29:0x0072, B:36:0x007d, B:39:0x009e), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [c6.d, java.lang.Object] */
    @Override // r.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int i;
        int i8;
        this.f6421e = null;
        w0.s sVar = (w0.s) o1.f6383b.getValue();
        synchronized (sVar.f7565g) {
            try {
                o0.e eVar = sVar.f7564f;
                int i9 = eVar.f5580f;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i9) {
                    w0.r rVar = (w0.r) eVar.f5578d[i10];
                    o.d0 d0Var = (o.d0) rVar.f7553f.k(this);
                    if (d0Var != null) {
                        Object[] objArr = d0Var.f5435b;
                        int[] iArr = d0Var.f5436c;
                        long[] jArr = d0Var.f5434a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j7 = jArr[i12];
                                i = i10;
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8;
                                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                                    int i15 = 0;
                                    while (i15 < i14) {
                                        if ((j7 & 255) < 128) {
                                            int i16 = (i12 << 3) + i15;
                                            i8 = i13;
                                            Object obj = objArr[i16];
                                            int i17 = iArr[i16];
                                            rVar.d(this, obj);
                                        } else {
                                            i8 = i13;
                                        }
                                        j7 >>= i8;
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
                                i10 = i;
                            }
                            if (rVar.f7553f.j()) {
                                i11++;
                            } else if (i11 > 0) {
                                Object[] objArr2 = eVar.f5578d;
                                objArr2[i - i11] = objArr2[i];
                            }
                            i10 = i + 1;
                        }
                    }
                    i = i10;
                    if (rVar.f7553f.j()) {
                    }
                    i10 = i + 1;
                }
                int i18 = i9 - i11;
                d6.l.L(eVar.f5578d, i18, i9);
                eVar.f5580f = i18;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object k(i6.c cVar) {
        float i = d.i(cVar.f());
        c6.m mVar = c6.m.f1757a;
        if (i <= 0.0f) {
            l();
            return mVar;
        }
        this.f6431p = i;
        Object d8 = m0.b.o(cVar.f()).d(this.f6432q, cVar);
        return d8 == h6.a.f3204d ? d8 : mVar;
    }

    public final void l() {
        l1 l1Var = this.f6421e;
        if (l1Var != null) {
            l1Var.c();
        }
        this.f6428m.c();
        if (this.f6429n != null) {
            this.f6429n = null;
            p(1.0f);
            o();
        }
    }

    public final Object n(float f6, Object obj, i6.i iVar) {
        if (0.0f > f6 || f6 > 1.0f) {
            i0.a("Expecting fraction between 0 and 1. Got " + f6);
        }
        l1 l1Var = this.f6421e;
        if (l1Var != null) {
            Object a8 = h0.a(this.f6426k, new p0(obj, this.f6418b.getValue(), this, l1Var, f6, null), iVar);
            if (a8 == h6.a.f3204d) {
                return a8;
            }
        }
        return c6.m.f1757a;
    }

    public final void o() {
        l1 l1Var = this.f6421e;
        if (l1Var == null) {
            return;
        }
        l1Var.l(s6.a.C(this.f6424h.g() * ((Number) l1Var.f6356l.getValue()).longValue()));
    }

    public final void p(float f6) {
        this.f6424h.h(f6);
    }
}
