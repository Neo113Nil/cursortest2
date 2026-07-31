package m;

import I.C0143d;
import I.C0148f0;
import I.C0156j0;
import h2.AbstractC0508a;
import j.C0547u;
import j.C0548v;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import q2.C0821h;
import t1.C1028h;

/* loaded from: classes.dex */
public final class U extends s0 {

    /* renamed from: r, reason: collision with root package name */
    public static final C0629n f6670r = new C0629n(0.0f);

    /* renamed from: s, reason: collision with root package name */
    public static final C0629n f6671s = new C0629n(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final C0156j0 f6672b;

    /* renamed from: c, reason: collision with root package name */
    public final C0156j0 f6673c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6674d;

    /* renamed from: e, reason: collision with root package name */
    public l0 f6675e;

    /* renamed from: f, reason: collision with root package name */
    public long f6676f;

    /* renamed from: g, reason: collision with root package name */
    public final A.h f6677g;

    /* renamed from: h, reason: collision with root package name */
    public final C0148f0 f6678h;

    /* renamed from: i, reason: collision with root package name */
    public C0821h f6679i;

    /* renamed from: j, reason: collision with root package name */
    public final y2.c f6680j;

    /* renamed from: k, reason: collision with root package name */
    public final C0613I f6681k;

    /* renamed from: l, reason: collision with root package name */
    public long f6682l;

    /* renamed from: m, reason: collision with root package name */
    public final C0548v f6683m;

    /* renamed from: n, reason: collision with root package name */
    public C0614J f6684n;

    /* renamed from: o, reason: collision with root package name */
    public final C0615K f6685o;

    /* renamed from: p, reason: collision with root package name */
    public float f6686p;

    /* renamed from: q, reason: collision with root package name */
    public final C0615K f6687q;

    public U(C1028h c1028h) {
        super(0);
        I.W w2 = I.W.f2783i;
        this.f6672b = C0143d.K(c1028h, w2);
        this.f6673c = C0143d.K(c1028h, w2);
        this.f6674d = c1028h;
        this.f6677g = new A.h(21, this);
        this.f6678h = C0143d.I(0.0f);
        this.f6680j = y2.d.a();
        this.f6681k = new C0613I();
        this.f6682l = Long.MIN_VALUE;
        this.f6683m = new C0548v();
        this.f6685o = new C0615K(this, 1);
        this.f6687q = new C0615K(this, 0);
    }

    public static final void f(U u3) {
        l0 l0Var = u3.f6675e;
        if (l0Var == null) {
            return;
        }
        C0614J c0614j = u3.f6684n;
        if (c0614j == null) {
            if (u3.f6676f > 0) {
                C0148f0 c0148f0 = u3.f6678h;
                if (c0148f0.g() != 1.0f && !f2.j.a(u3.f6673c.getValue(), u3.f6672b.getValue())) {
                    C0614J c0614j2 = new C0614J();
                    c0614j2.f6623d = c0148f0.g();
                    long j3 = u3.f6676f;
                    c0614j2.f6626g = j3;
                    c0614j2.f6627h = AbstractC0508a.R((1.0d - c0148f0.g()) * j3);
                    c0614j2.f6624e.e(c0148f0.g(), 0);
                    c0614j = c0614j2;
                }
            }
            c0614j = null;
        }
        if (c0614j != null) {
            c0614j.f6626g = u3.f6676f;
            u3.f6683m.a(c0614j);
            l0Var.n(c0614j);
        }
        u3.f6684n = null;
    }

    public static final void g(U u3, C0614J c0614j, long j3) {
        u3.getClass();
        long j4 = c0614j.f6620a + j3;
        c0614j.f6620a = j4;
        long j5 = c0614j.f6627h;
        if (j4 >= j5) {
            c0614j.f6623d = 1.0f;
            return;
        }
        x0 x0Var = c0614j.f6621b;
        if (x0Var == null) {
            float a3 = c0614j.f6624e.a(0);
            float f3 = j4 / j5;
            u0 u0Var = v0.f6899a;
            c0614j.f6623d = (1.0f * f3) + ((1 - f3) * a3);
            return;
        }
        C0629n c0629n = f6671s;
        C0629n c0629n2 = c0614j.f6625f;
        if (c0629n2 == null) {
            c0629n2 = f6670r;
        }
        c0614j.f6623d = O2.d.x(((C0629n) x0Var.f(j4, c0614j.f6624e, c0629n, c0629n2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(U u3, X1.c cVar) {
        M m3;
        W1.a aVar;
        int i3;
        R1.y yVar;
        u3.getClass();
        if (cVar instanceof M) {
            m3 = (M) cVar;
            int i4 = m3.f6640j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                m3.f6640j = i4 - Integer.MIN_VALUE;
                Object obj = m3.f6638h;
                aVar = W1.a.f4608d;
                i3 = m3.f6640j;
                yVar = R1.y.f4171a;
                if (i3 != 0) {
                    R1.a.e(obj);
                    if (u3.f6683m.f6337b != 0 || u3.f6684n != null) {
                        V1.i iVar = m3.f4642e;
                        f2.j.c(iVar);
                        if (AbstractC0620e.h(iVar) == 0.0f) {
                            u3.l();
                            u3.f6682l = Long.MIN_VALUE;
                        } else if (u3.f6682l == Long.MIN_VALUE) {
                            m3.f6637g = u3;
                            m3.f6640j = 1;
                            f2.j.c(iVar);
                            if (C0143d.F(iVar).n(u3.f6685o, m3) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    return yVar;
                }
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u3 = m3.f6637g;
                R1.a.e(obj);
                do {
                    if (u3.f6683m.f6337b == 0 && u3.f6684n == null) {
                        u3.f6682l = Long.MIN_VALUE;
                        return yVar;
                    }
                    m3.f6637g = u3;
                    m3.f6640j = 2;
                } while (u3.k(m3) != aVar);
                return aVar;
            }
        }
        m3 = new M(u3, cVar);
        Object obj2 = m3.f6638h;
        aVar = W1.a.f4608d;
        i3 = m3.f6640j;
        yVar = R1.y.f4171a;
        if (i3 != 0) {
        }
        do {
            if (u3.f6683m.f6337b == 0) {
                u3.f6682l = Long.MIN_VALUE;
                return yVar;
            }
            m3.f6637g = u3;
            m3.f6640j = 2;
        } while (u3.k(m3) != aVar);
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
    public static final Object i(U u3, X1.c cVar) {
        S s3;
        W1.a aVar;
        int i3;
        Object value;
        Object q3;
        U u4;
        Object obj;
        u3.getClass();
        if (cVar instanceof S) {
            s3 = (S) cVar;
            int i4 = s3.f6664k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s3.f6664k = i4 - Integer.MIN_VALUE;
                Object obj2 = s3.f6662i;
                aVar = W1.a.f4608d;
                i3 = s3.f6664k;
                if (i3 != 0) {
                    R1.a.e(obj2);
                    value = u3.f6672b.getValue();
                    s3.f6660g = u3;
                    s3.f6661h = value;
                    s3.f6664k = 1;
                    if (u3.f6680j.c(null, s3) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = s3.f6661h;
                        u4 = s3.f6660g;
                        R1.a.e(obj2);
                        if (!f2.j.a(obj2, obj)) {
                            return R1.y.f4171a;
                        }
                        u4.f6682l = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = s3.f6661h;
                    U u5 = s3.f6660g;
                    R1.a.e(obj2);
                    value = obj3;
                    u3 = u5;
                }
                s3.f6660g = u3;
                s3.f6661h = value;
                s3.f6664k = 2;
                C0821h c0821h = new C0821h(1, l0.c.B(s3));
                c0821h.r();
                u3.f6679i = c0821h;
                u3.f6680j.e(null);
                q3 = c0821h.q();
                if (q3 != aVar) {
                    return aVar;
                }
                u4 = u3;
                obj = value;
                obj2 = q3;
                if (!f2.j.a(obj2, obj)) {
                }
            }
        }
        s3 = new S(u3, cVar);
        Object obj22 = s3.f6662i;
        aVar = W1.a.f4608d;
        i3 = s3.f6664k;
        if (i3 != 0) {
        }
        s3.f6660g = u3;
        s3.f6661h = value;
        s3.f6664k = 2;
        C0821h c0821h2 = new C0821h(1, l0.c.B(s3));
        c0821h2.r();
        u3.f6679i = c0821h2;
        u3.f6680j.e(null);
        q3 = c0821h2.q();
        if (q3 != aVar) {
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
    public static final Object j(U u3, X1.c cVar) {
        T t3;
        int i3;
        U u4;
        Object obj;
        boolean a3;
        U u5;
        u3.getClass();
        if (cVar instanceof T) {
            t3 = (T) cVar;
            int i4 = t3.f6669k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t3.f6669k = i4 - Integer.MIN_VALUE;
                Object obj2 = t3.f6667i;
                W1.a aVar = W1.a.f4608d;
                i3 = t3.f6669k;
                if (i3 != 0) {
                    R1.a.e(obj2);
                    Object value = u3.f6672b.getValue();
                    t3.f6665g = u3;
                    t3.f6666h = value;
                    t3.f6669k = 1;
                    if (u3.f6680j.c(null, t3) == aVar) {
                        return aVar;
                    }
                    u4 = u3;
                    obj = value;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = t3.f6666h;
                        u5 = t3.f6665g;
                        R1.a.e(obj2);
                        if (!f2.j.a(obj2, obj)) {
                            u5.f6682l = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return R1.y.f4171a;
                    }
                    obj = t3.f6666h;
                    u4 = t3.f6665g;
                    R1.a.e(obj2);
                }
                a3 = f2.j.a(obj, u4.f6674d);
                y2.c cVar2 = u4.f6680j;
                if (!a3) {
                    cVar2.e(null);
                    return R1.y.f4171a;
                }
                t3.f6665g = u4;
                t3.f6666h = obj;
                t3.f6669k = 2;
                C0821h c0821h = new C0821h(1, l0.c.B(t3));
                c0821h.r();
                u4.f6679i = c0821h;
                cVar2.e(null);
                obj2 = c0821h.q();
                if (obj2 == aVar) {
                    return aVar;
                }
                u5 = u4;
                if (!f2.j.a(obj2, obj)) {
                }
                return R1.y.f4171a;
            }
        }
        t3 = new T(u3, cVar);
        Object obj22 = t3.f6667i;
        W1.a aVar2 = W1.a.f4608d;
        i3 = t3.f6669k;
        if (i3 != 0) {
        }
        a3 = f2.j.a(obj, u4.f6674d);
        y2.c cVar22 = u4.f6680j;
        if (!a3) {
        }
    }

    @Override // m.s0
    public final Object a() {
        return this.f6673c.getValue();
    }

    @Override // m.s0
    public final Object b() {
        return this.f6672b.getValue();
    }

    @Override // m.s0
    public final void c(Object obj) {
        this.f6673c.setValue(obj);
    }

    @Override // m.s0
    public final void d(l0 l0Var) {
        l0 l0Var2 = this.f6675e;
        if (l0Var2 == null || f2.j.a(l0Var, l0Var2)) {
            this.f6675e = l0Var;
            return;
        }
        throw new IllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f6675e + ", new instance: " + l0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0088 A[Catch: all -> 0x0096, TryCatch #0 {all -> 0x0096, blocks: (B:4:0x0010, B:6:0x0018, B:9:0x007d, B:13:0x0088, B:15:0x0098, B:17:0x008d, B:21:0x002b, B:24:0x0037, B:26:0x004c, B:28:0x0058, B:30:0x0062, B:32:0x006f, B:38:0x0077, B:41:0x009d), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Type inference failed for: r2v0, types: [R1.f, java.lang.Object] */
    @Override // m.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        int i3;
        this.f6675e = null;
        S.w wVar = (S.w) r0.f6876a.getValue();
        synchronized (wVar.f4276f) {
            try {
                K.d dVar = wVar.f4276f;
                int i4 = dVar.f3216f;
                int i5 = 0;
                int i6 = 0;
                while (i5 < i4) {
                    S.v vVar = (S.v) dVar.f3214d[i5];
                    C0547u c0547u = (C0547u) vVar.f4264f.g(this);
                    if (c0547u != null) {
                        Object[] objArr = c0547u.f6331b;
                        int[] iArr = c0547u.f6332c;
                        long[] jArr = c0547u.f6330a;
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
                            if (vVar.f4264f.f6348e == 0) {
                                i6++;
                            } else if (i6 > 0) {
                                Object[] objArr2 = dVar.f3214d;
                                objArr2[i3 - i6] = objArr2[i3];
                            }
                            i5 = i3 + 1;
                        }
                    }
                    i3 = i5;
                    if (vVar.f4264f.f6348e == 0) {
                    }
                    i5 = i3 + 1;
                }
                int i13 = i4 - i6;
                Arrays.fill(dVar.f3214d, i13, i4, (Object) null);
                dVar.f3216f = i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object k(X1.c cVar) {
        float h3 = AbstractC0620e.h(cVar.t());
        R1.y yVar = R1.y.f4171a;
        if (h3 <= 0.0f) {
            l();
            return yVar;
        }
        this.f6686p = h3;
        Object n3 = C0143d.F(cVar.t()).n(this.f6687q, cVar);
        return n3 == W1.a.f4608d ? n3 : yVar;
    }

    public final void l() {
        l0 l0Var = this.f6675e;
        if (l0Var != null) {
            l0Var.c();
        }
        C0548v c0548v = this.f6683m;
        S1.k.r0(c0548v.f6336a, null, 0, c0548v.f6337b);
        c0548v.f6337b = 0;
        if (this.f6684n != null) {
            this.f6684n = null;
            o(1.0f);
            n();
        }
    }

    public final Object m(float f3, Object obj, X1.i iVar) {
        if (0.0f > f3 || f3 > 1.0f) {
            throw new IllegalArgumentException("Expecting fraction between 0 and 1. Got " + f3);
        }
        l0 l0Var = this.f6675e;
        R1.y yVar = R1.y.f4171a;
        if (l0Var == null) {
            return yVar;
        }
        Object a3 = C0613I.a(this.f6681k, new P(obj, this.f6672b.getValue(), this, l0Var, f3, null), iVar);
        return a3 == W1.a.f4608d ? a3 : yVar;
    }

    public final void n() {
        l0 l0Var = this.f6675e;
        if (l0Var == null) {
            return;
        }
        l0Var.m(AbstractC0508a.R(this.f6678h.g() * ((Number) l0Var.f6847l.getValue()).longValue()));
    }

    public final void o(float f3) {
        this.f6678h.h(f3);
    }
}
