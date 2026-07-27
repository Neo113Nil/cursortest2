package l;

import G.C0192d;
import G.C0197f0;
import G.C0205j0;
import W2.C0286h;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import s1.C1193i;
import y2.AbstractC1343r;
import z2.C1436t;

/* loaded from: classes.dex */
public final class U extends t0 {

    /* renamed from: r, reason: collision with root package name */
    public static final C0789o f7632r = new C0789o(0.0f);

    /* renamed from: s, reason: collision with root package name */
    public static final C0789o f7633s = new C0789o(1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final C0205j0 f7634b;

    /* renamed from: c, reason: collision with root package name */
    public final C0205j0 f7635c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7636d;

    /* renamed from: e, reason: collision with root package name */
    public m0 f7637e;

    /* renamed from: f, reason: collision with root package name */
    public long f7638f;

    /* renamed from: g, reason: collision with root package name */
    public final A3.e f7639g;

    /* renamed from: h, reason: collision with root package name */
    public final C0197f0 f7640h;

    /* renamed from: i, reason: collision with root package name */
    public C0286h f7641i;

    /* renamed from: j, reason: collision with root package name */
    public final e3.c f7642j;

    /* renamed from: k, reason: collision with root package name */
    public final C0764I f7643k;

    /* renamed from: l, reason: collision with root package name */
    public long f7644l;

    /* renamed from: m, reason: collision with root package name */
    public final i.w f7645m;

    /* renamed from: n, reason: collision with root package name */
    public C0765J f7646n;

    /* renamed from: o, reason: collision with root package name */
    public final C0766K f7647o;

    /* renamed from: p, reason: collision with root package name */
    public float f7648p;

    /* renamed from: q, reason: collision with root package name */
    public final C0766K f7649q;

    public U(C1193i c1193i) {
        super(0);
        G.W w4 = G.W.f2779l;
        this.f7634b = C0192d.K(c1193i, w4);
        this.f7635c = C0192d.K(c1193i, w4);
        this.f7636d = c1193i;
        this.f7639g = new A3.e(17, this);
        this.f7640h = C0192d.I(0.0f);
        this.f7642j = e3.d.a();
        this.f7643k = new C0764I();
        this.f7644l = Long.MIN_VALUE;
        this.f7645m = new i.w();
        this.f7647o = new C0766K(this, 1);
        this.f7649q = new C0766K(this, 0);
    }

    public static final void q(U u4) {
        m0 m0Var = u4.f7637e;
        if (m0Var == null) {
            return;
        }
        C0765J c0765j = u4.f7646n;
        if (c0765j == null) {
            if (u4.f7638f > 0) {
                C0197f0 c0197f0 = u4.f7640h;
                if (c0197f0.d() != 1.0f && !Intrinsics.a(u4.f7635c.getValue(), u4.f7634b.getValue())) {
                    C0765J c0765j2 = new C0765J();
                    c0765j2.f7585d = c0197f0.d();
                    long j4 = u4.f7638f;
                    c0765j2.f7588g = j4;
                    c0765j2.f7589h = O2.c.b((1.0d - c0197f0.d()) * j4);
                    c0765j2.f7586e.e(c0197f0.d(), 0);
                    c0765j = c0765j2;
                }
            }
            c0765j = null;
        }
        if (c0765j != null) {
            c0765j.f7588g = u4.f7638f;
            u4.f7645m.a(c0765j);
            m0Var.n(c0765j);
        }
        u4.f7646n = null;
    }

    public static final void r(U u4, C0765J c0765j, long j4) {
        u4.getClass();
        long j5 = c0765j.f7582a + j4;
        c0765j.f7582a = j5;
        long j6 = c0765j.f7589h;
        if (j5 >= j6) {
            c0765j.f7585d = 1.0f;
            return;
        }
        z0 z0Var = c0765j.f7583b;
        if (z0Var == null) {
            float a4 = c0765j.f7586e.a(0);
            float f4 = j5 / j6;
            v0 v0Var = w0.f7856a;
            c0765j.f7585d = (1.0f * f4) + ((1 - f4) * a4);
            return;
        }
        C0789o c0789o = f7633s;
        C0789o c0789o2 = c0765j.f7587f;
        if (c0789o2 == null) {
            c0789o2 = f7632r;
        }
        c0765j.f7585d = kotlin.ranges.b.d(((C0789o) z0Var.f(j5, c0765j.f7586e, c0789o, c0789o2)).a(0), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(U u4, E2.c cVar) {
        C0768M c0768m;
        D2.a aVar;
        int i2;
        u4.getClass();
        if (cVar instanceof C0768M) {
            c0768m = (C0768M) cVar;
            int i4 = c0768m.f7602m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0768m.f7602m = i4 - Integer.MIN_VALUE;
                Object obj = c0768m.f7600k;
                aVar = D2.a.f2163d;
                i2 = c0768m.f7602m;
                if (i2 != 0) {
                    AbstractC1343r.b(obj);
                    if (u4.f7645m.f6975b == 0 && u4.f7646n == null) {
                        return Unit.f7487a;
                    }
                    CoroutineContext coroutineContext = c0768m.f2311e;
                    Intrinsics.c(coroutineContext);
                    if (AbstractC0779e.h(coroutineContext) == 0.0f) {
                        u4.w();
                        u4.f7644l = Long.MIN_VALUE;
                        return Unit.f7487a;
                    }
                    if (u4.f7644l == Long.MIN_VALUE) {
                        c0768m.f7599j = u4;
                        c0768m.f7602m = 1;
                        Intrinsics.c(coroutineContext);
                        if (C0192d.F(coroutineContext).f(u4.f7647o, c0768m) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u4 = c0768m.f7599j;
                    AbstractC1343r.b(obj);
                }
                do {
                    if (u4.f7645m.f6975b == 0 && u4.f7646n == null) {
                        u4.f7644l = Long.MIN_VALUE;
                        return Unit.f7487a;
                    }
                    c0768m.f7599j = u4;
                    c0768m.f7602m = 2;
                } while (u4.v(c0768m) != aVar);
                return aVar;
            }
        }
        c0768m = new C0768M(u4, cVar);
        Object obj2 = c0768m.f7600k;
        aVar = D2.a.f2163d;
        i2 = c0768m.f7602m;
        if (i2 != 0) {
        }
        do {
            if (u4.f7645m.f6975b == 0) {
                u4.f7644l = Long.MIN_VALUE;
                return Unit.f7487a;
            }
            c0768m.f7599j = u4;
            c0768m.f7602m = 2;
        } while (u4.v(c0768m) != aVar);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(U u4, E2.c cVar) {
        S frame;
        D2.a aVar;
        int i2;
        Object value;
        Object r2;
        U u5;
        Object obj;
        u4.getClass();
        if (cVar instanceof S) {
            frame = (S) cVar;
            int i4 = frame.f7626n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                frame.f7626n = i4 - Integer.MIN_VALUE;
                Object obj2 = frame.f7624l;
                aVar = D2.a.f2163d;
                i2 = frame.f7626n;
                if (i2 != 0) {
                    AbstractC1343r.b(obj2);
                    value = u4.f7634b.getValue();
                    frame.f7622j = u4;
                    frame.f7623k = value;
                    frame.f7626n = 1;
                    if (u4.f7642j.c(null, frame) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = frame.f7623k;
                        u5 = frame.f7622j;
                        AbstractC1343r.b(obj2);
                        if (!Intrinsics.a(obj2, obj)) {
                            return Unit.f7487a;
                        }
                        u5.f7644l = Long.MIN_VALUE;
                        throw new CancellationException("targetState while waiting for composition");
                    }
                    Object obj3 = frame.f7623k;
                    U u6 = frame.f7622j;
                    AbstractC1343r.b(obj2);
                    value = obj3;
                    u4 = u6;
                }
                frame.f7622j = u4;
                frame.f7623k = value;
                frame.f7626n = 2;
                C0286h c0286h = new C0286h(1, D2.f.b(frame));
                c0286h.s();
                u4.f7641i = c0286h;
                u4.f7642j.e(null);
                r2 = c0286h.r();
                if (r2 == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (r2 != aVar) {
                    return aVar;
                }
                u5 = u4;
                obj = value;
                obj2 = r2;
                if (!Intrinsics.a(obj2, obj)) {
                }
            }
        }
        frame = new S(u4, cVar);
        Object obj22 = frame.f7624l;
        aVar = D2.a.f2163d;
        i2 = frame.f7626n;
        if (i2 != 0) {
        }
        frame.f7622j = u4;
        frame.f7623k = value;
        frame.f7626n = 2;
        C0286h c0286h2 = new C0286h(1, D2.f.b(frame));
        c0286h2.s();
        u4.f7641i = c0286h2;
        u4.f7642j.e(null);
        r2 = c0286h2.r();
        if (r2 == aVar) {
        }
        if (r2 != aVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(U u4, E2.c cVar) {
        T frame;
        int i2;
        U u5;
        Object obj;
        boolean a4;
        U u6;
        u4.getClass();
        if (cVar instanceof T) {
            frame = (T) cVar;
            int i4 = frame.f7631n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                frame.f7631n = i4 - Integer.MIN_VALUE;
                Object obj2 = frame.f7629l;
                D2.a aVar = D2.a.f2163d;
                i2 = frame.f7631n;
                if (i2 != 0) {
                    AbstractC1343r.b(obj2);
                    Object value = u4.f7634b.getValue();
                    frame.f7627j = u4;
                    frame.f7628k = value;
                    frame.f7631n = 1;
                    if (u4.f7642j.c(null, frame) == aVar) {
                        return aVar;
                    }
                    u5 = u4;
                    obj = value;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = frame.f7628k;
                        u6 = frame.f7627j;
                        AbstractC1343r.b(obj2);
                        if (!Intrinsics.a(obj2, obj)) {
                            u6.f7644l = Long.MIN_VALUE;
                            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                        }
                        return Unit.f7487a;
                    }
                    obj = frame.f7628k;
                    u5 = frame.f7627j;
                    AbstractC1343r.b(obj2);
                }
                a4 = Intrinsics.a(obj, u5.f7636d);
                e3.c cVar2 = u5.f7642j;
                if (!a4) {
                    cVar2.e(null);
                    return Unit.f7487a;
                }
                frame.f7627j = u5;
                frame.f7628k = obj;
                frame.f7631n = 2;
                C0286h c0286h = new C0286h(1, D2.f.b(frame));
                c0286h.s();
                u5.f7641i = c0286h;
                cVar2.e(null);
                obj2 = c0286h.r();
                if (obj2 == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (obj2 == aVar) {
                    return aVar;
                }
                u6 = u5;
                if (!Intrinsics.a(obj2, obj)) {
                }
                return Unit.f7487a;
            }
        }
        frame = new T(u4, cVar);
        Object obj22 = frame.f7629l;
        D2.a aVar2 = D2.a.f2163d;
        i2 = frame.f7631n;
        if (i2 != 0) {
        }
        a4 = Intrinsics.a(obj, u5.f7636d);
        e3.c cVar22 = u5.f7642j;
        if (!a4) {
        }
    }

    @Override // l.t0
    public final Object l() {
        return this.f7635c.getValue();
    }

    @Override // l.t0
    public final Object m() {
        return this.f7634b.getValue();
    }

    @Override // l.t0
    public final void n(Object obj) {
        this.f7635c.setValue(obj);
    }

    @Override // l.t0
    public final void o(m0 m0Var) {
        m0 m0Var2 = this.f7637e;
        if (m0Var2 == null || Intrinsics.a(m0Var, m0Var2)) {
            this.f7637e = m0Var;
            return;
        }
        throw new IllegalStateException("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f7637e + ", new instance: " + m0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:4:0x0010, B:6:0x0018, B:9:0x0083, B:13:0x008e, B:15:0x009f, B:17:0x0093, B:21:0x002b, B:24:0x0037, B:26:0x004c, B:28:0x0058, B:30:0x0062, B:32:0x006f, B:39:0x007e, B:44:0x00a3), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, y2.j] */
    @Override // l.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p() {
        int i2;
        this.f7637e = null;
        Q.A a4 = (Q.A) s0.f7840a.getValue();
        synchronized (a4.f3795f) {
            try {
                I.d dVar = a4.f3795f;
                int i4 = dVar.f3332i;
                int i5 = 0;
                int i6 = 0;
                while (i5 < i4) {
                    Q.z zVar = (Q.z) dVar.f3330d[i5];
                    i.v vVar = (i.v) zVar.f3910f.g(this);
                    if (vVar != null) {
                        Object[] objArr = vVar.f6969b;
                        int[] iArr = vVar.f6970c;
                        long[] jArr = vVar.f6968a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j4 = jArr[i7];
                                i2 = i5;
                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8;
                                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((j4 & 255) < 128) {
                                            int i11 = (i7 << 3) + i10;
                                            Object obj = objArr[i11];
                                            int i12 = iArr[i11];
                                            zVar.d(this, obj);
                                            i8 = 8;
                                        }
                                        j4 >>= i8;
                                    }
                                    if (i9 != i8) {
                                        break;
                                    }
                                }
                                if (i7 == length) {
                                    break;
                                }
                                i7++;
                                i5 = i2;
                            }
                            if (zVar.f3910f.f6986e == 0) {
                                i6++;
                            } else if (i6 > 0) {
                                Object[] objArr2 = dVar.f3330d;
                                objArr2[i2 - i6] = objArr2[i2];
                            }
                            i5 = i2 + 1;
                        }
                    }
                    i2 = i5;
                    if (zVar.f3910f.f6986e == 0) {
                    }
                    i5 = i2 + 1;
                }
                int i13 = i4 - i6;
                C1436t.k(dVar.f3330d, i13, i4);
                dVar.f3332i = i13;
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object v(E2.c cVar) {
        float h4 = AbstractC0779e.h(cVar.p());
        if (h4 <= 0.0f) {
            w();
            return Unit.f7487a;
        }
        this.f7648p = h4;
        Object f4 = C0192d.F(cVar.p()).f(this.f7649q, cVar);
        return f4 == D2.a.f2163d ? f4 : Unit.f7487a;
    }

    public final void w() {
        m0 m0Var = this.f7637e;
        if (m0Var != null) {
            m0Var.c();
        }
        i.w wVar = this.f7645m;
        C1436t.k(wVar.f6974a, 0, wVar.f6975b);
        wVar.f6975b = 0;
        if (this.f7646n != null) {
            this.f7646n = null;
            z(1.0f);
            y();
        }
    }

    public final Object x(float f4, Object obj, E2.j jVar) {
        if (0.0f > f4 || f4 > 1.0f) {
            throw new IllegalArgumentException("Expecting fraction between 0 and 1. Got " + f4);
        }
        m0 m0Var = this.f7637e;
        if (m0Var == null) {
            return Unit.f7487a;
        }
        Object a4 = C0764I.a(this.f7643k, new C0771P(obj, this.f7634b.getValue(), this, m0Var, f4, null), jVar);
        return a4 == D2.a.f2163d ? a4 : Unit.f7487a;
    }

    public final void y() {
        m0 m0Var = this.f7637e;
        if (m0Var == null) {
            return;
        }
        m0Var.m(O2.c.b(this.f7640h.d() * ((Number) m0Var.f7811l.getValue()).longValue()));
    }

    public final void z(float f4) {
        this.f7640h.f(f4);
    }
}
