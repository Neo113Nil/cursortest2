package w0;

import java.util.ArrayList;
import java.util.HashMap;
import m0.p1;
import o.k0;
import o.s0;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class b extends f {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f7501n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final p6.c f7502e;

    /* renamed from: f, reason: collision with root package name */
    public final p6.c f7503f;

    /* renamed from: g, reason: collision with root package name */
    public int f7504g;

    /* renamed from: h, reason: collision with root package name */
    public k0 f7505h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public k f7506j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f7507k;

    /* renamed from: l, reason: collision with root package name */
    public int f7508l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7509m;

    public b(long j7, k kVar, p6.c cVar, p6.c cVar2) {
        super(j7, kVar);
        this.f7502e = cVar;
        this.f7503f = cVar2;
        this.f7506j = k.f7527h;
        this.f7507k = f7501n;
        this.f7508l = 1;
    }

    public final void A(long j7) {
        synchronized (m.f7537c) {
            this.f7506j = this.f7506j.f(j7);
        }
    }

    public void B(k0 k0Var) {
        this.f7505h = k0Var;
    }

    public b C(p6.c cVar, p6.c cVar2) {
        if (this.f7518c) {
            p1.a("Cannot use a disposed snapshot");
        }
        if (this.f7509m && this.f7519d < 0) {
            p1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = m.f7537c;
        synchronized (obj) {
            try {
                long j7 = m.f7539e;
                long j8 = 1;
                m.f7539e = j7 + j8;
                m.f7538d = m.f7538d.f(j7);
                k d8 = d();
                r(d8.f(j7));
                try {
                    c cVar3 = new c(j7, m.e(d8, g() + j8, j7), m.l(cVar, e(), true), m.b(cVar2, i()), this);
                    if (this.f7509m || this.f7518c) {
                        return cVar3;
                    }
                    long g3 = g();
                    synchronized (obj) {
                        long j9 = m.f7539e;
                        m.f7539e = j9 + j8;
                        s(j9);
                        m.f7538d = m.f7538d.f(g());
                    }
                    r(m.e(d(), g3 + j8, g()));
                    return cVar3;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // w0.f
    public final void b() {
        m.f7538d = m.f7538d.b(g()).a(this.f7506j);
    }

    @Override // w0.f
    public void c() {
        if (this.f7518c) {
            return;
        }
        this.f7518c = true;
        synchronized (m.f7537c) {
            o();
        }
        l();
    }

    @Override // w0.f
    public boolean f() {
        return false;
    }

    @Override // w0.f
    public int h() {
        return this.f7504g;
    }

    @Override // w0.f
    public p6.c i() {
        return this.f7503f;
    }

    @Override // w0.f
    public void k() {
        this.f7508l++;
    }

    @Override // w0.f
    public void l() {
        if (this.f7508l <= 0) {
            p1.a("no pending nested snapshots");
        }
        int i = this.f7508l - 1;
        this.f7508l = i;
        if (i != 0 || this.f7509m) {
            return;
        }
        k0 x7 = x();
        if (x7 != null) {
            if (this.f7509m) {
                p1.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g3 = g();
            Object[] objArr = x7.f5490b;
            long[] jArr = x7.f5489a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j7 = jArr[i8];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((255 & j7) < 128) {
                                for (w a8 = ((u) objArr[(i8 << 3) + i10]).a(); a8 != null; a8 = a8.f7573b) {
                                    long j8 = a8.f7572a;
                                    if (j8 == g3 || d6.m.Q(this.f7506j, Long.valueOf(j8))) {
                                        s1 s1Var = m.f7535a;
                                        a8.f7572a = 0L;
                                    }
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
        }
        a();
    }

    @Override // w0.f
    public void m() {
        if (this.f7509m || this.f7518c) {
            return;
        }
        v();
    }

    @Override // w0.f
    public void n(u uVar) {
        k0 x7 = x();
        if (x7 == null) {
            k0 k0Var = s0.f5536a;
            x7 = new k0();
            B(x7);
        }
        x7.a(uVar);
    }

    @Override // w0.f
    public final void p() {
        int length = this.f7507k.length;
        for (int i = 0; i < length; i++) {
            m.u(this.f7507k[i]);
        }
        o();
    }

    @Override // w0.f
    public void t(int i) {
        this.f7504g = i;
    }

    @Override // w0.f
    public f u(p6.c cVar) {
        if (this.f7518c) {
            p1.a("Cannot use a disposed snapshot");
        }
        if (this.f7509m && this.f7519d < 0) {
            p1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g3 = g();
        A(g());
        Object obj = m.f7537c;
        synchronized (obj) {
            try {
                long j7 = m.f7539e;
                long j8 = 1;
                m.f7539e = j7 + j8;
                m.f7538d = m.f7538d.f(j7);
                try {
                    d dVar = new d(j7, m.e(d(), g3 + j8, j7), m.l(cVar, e(), true), this);
                    if (this.f7509m || this.f7518c) {
                        return dVar;
                    }
                    long g7 = g();
                    synchronized (obj) {
                        long j9 = m.f7539e;
                        m.f7539e = j9 + j8;
                        s(j9);
                        m.f7538d = m.f7538d.f(g());
                    }
                    r(m.e(d(), g7 + j8, g()));
                    return dVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j7;
        A(g());
        if (this.f7509m || this.f7518c) {
            return;
        }
        long g3 = g();
        synchronized (m.f7537c) {
            long j8 = m.f7539e;
            j7 = 1;
            m.f7539e = j8 + j7;
            s(j8);
            m.f7538d = m.f7538d.f(g());
        }
        r(m.e(d(), g3 + j7, g()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q w() {
        HashMap hashMap;
        d6.u uVar;
        k0 k0Var;
        long j7;
        long j8;
        ArrayList arrayList;
        int size;
        int i;
        k0 x7 = x();
        if (x7 != null) {
            long j9 = m.f7543j.f7517b;
            hashMap = m.c(j9, this, m.f7538d.b(j9));
        } else {
            hashMap = null;
        }
        d6.u uVar2 = d6.u.f2326d;
        synchronized (m.f7537c) {
            try {
                m.d(this);
                if (x7 != null && x7.f5492d != 0) {
                    a aVar = m.f7543j;
                    q z3 = z(m.f7539e, x7, hashMap, m.f7538d.b(aVar.f7517b));
                    if (!z3.equals(i.f7521b)) {
                        return z3;
                    }
                    b();
                    k0Var = aVar.f7505h;
                    m.v(aVar, m.f7535a);
                    B(null);
                    aVar.f7505h = null;
                    uVar = m.f7542h;
                    this.f7509m = true;
                    if (k0Var != null) {
                        o0.g gVar = new o0.g(k0Var);
                        if (!k0Var.g()) {
                            int size2 = uVar.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                ((p6.e) uVar.get(i8)).g(gVar, this);
                            }
                        }
                    }
                    if (x7 != null && x7.h()) {
                        o0.g gVar2 = new o0.g(x7);
                        size = uVar.size();
                        for (i = 0; i < size; i++) {
                            ((p6.e) uVar.get(i)).g(gVar2, this);
                        }
                    }
                    synchronized (m.f7537c) {
                        try {
                            p();
                            m.g();
                            if (k0Var != null) {
                                Object[] objArr = k0Var.f5490b;
                                long[] jArr = k0Var.f5489a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i9 = 0;
                                    j7 = 128;
                                    while (true) {
                                        long j10 = jArr[i9];
                                        j8 = 255;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((j10 & 255) < 128) {
                                                    m.q((u) objArr[(i9 << 3) + i11]);
                                                }
                                                j10 >>= 8;
                                            }
                                            if (i10 != 8) {
                                                break;
                                            }
                                        }
                                        if (i9 == length) {
                                            break;
                                        }
                                        i9++;
                                    }
                                    if (x7 != null) {
                                        Object[] objArr2 = x7.f5490b;
                                        long[] jArr2 = x7.f5489a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j11 = jArr2[i12];
                                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j11 & j8) < j7) {
                                                            m.q((u) objArr2[(i12 << 3) + i14]);
                                                        }
                                                        j11 >>= 8;
                                                    }
                                                    if (i13 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i12 == length2) {
                                                    break;
                                                }
                                                i12++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i15 = 0; i15 < size3; i15++) {
                                            m.q((u) arrayList.get(i15));
                                        }
                                    }
                                    this.i = null;
                                }
                            }
                            j7 = 128;
                            j8 = 255;
                            if (x7 != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return i.f7521b;
                }
                b();
                a aVar2 = m.f7543j;
                k0 k0Var2 = aVar2.f7505h;
                m.v(aVar2, m.f7535a);
                if (k0Var2 == null || !k0Var2.h()) {
                    uVar = uVar2;
                    k0Var = null;
                } else {
                    uVar = m.f7542h;
                    k0Var = k0Var2;
                }
                this.f7509m = true;
                if (k0Var != null) {
                }
                if (x7 != null) {
                    o0.g gVar22 = new o0.g(x7);
                    size = uVar.size();
                    while (i < size) {
                    }
                }
                synchronized (m.f7537c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k0 x() {
        return this.f7505h;
    }

    @Override // w0.f
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public p6.c e() {
        return this.f7502e;
    }

    public final q z(long j7, k0 k0Var, HashMap hashMap, k kVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        k kVar2;
        Object[] objArr;
        long[] jArr;
        k kVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j8;
        ArrayList arrayList4;
        w b8;
        k e8 = d().f(g()).e(this.f7506j);
        Object[] objArr3 = k0Var.f5490b;
        long[] jArr3 = k0Var.f5489a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i8 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j9 = jArr3[i8];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j9 & 255) < 128) {
                            objArr2 = objArr3;
                            u uVar = (u) objArr3[(i8 << 3) + i10];
                            jArr2 = jArr3;
                            w a8 = uVar.a();
                            i = i10;
                            ArrayList arrayList5 = arrayList3;
                            w s5 = m.s(a8, j7, kVar);
                            if (s5 == null) {
                                kVar3 = e8;
                                arrayList4 = arrayList2;
                                j8 = j9;
                            } else {
                                arrayList4 = arrayList2;
                                j8 = j9;
                                w s7 = m.s(a8, g(), e8);
                                if (s7 == null) {
                                    kVar3 = e8;
                                } else {
                                    kVar3 = e8;
                                    if (s7.f7572a != 1 && !s5.equals(s7)) {
                                        w s8 = m.s(a8, g(), d());
                                        if (s8 == null) {
                                            m.r();
                                            throw null;
                                        }
                                        if (hashMap == null || (b8 = (w) hashMap.get(s5)) == null) {
                                            b8 = uVar.b(s7, s5, s8);
                                        }
                                        if (b8 == null) {
                                            return new h(this);
                                        }
                                        if (!b8.equals(s8)) {
                                            if (b8.equals(s5)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new c6.f(uVar, s5.b(g())));
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(uVar);
                                                arrayList3 = arrayList6;
                                            } else {
                                                arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList3.add(!b8.equals(s7) ? new c6.f(uVar, b8) : new c6.f(uVar, s7.b(g())));
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            kVar3 = e8;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i10;
                            j8 = j9;
                        }
                        j9 = j8 >> 8;
                        i10 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        e8 = kVar3;
                    }
                    kVar2 = e8;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    kVar2 = e8;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i8 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i8++;
                jArr3 = jArr;
                objArr3 = objArr;
                e8 = kVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i11 = 0; i11 < size; i11++) {
                c6.f fVar = (c6.f) arrayList3.get(i11);
                u uVar2 = (u) fVar.f1747d;
                w wVar = (w) fVar.f1748e;
                wVar.f7572a = j7;
                synchronized (m.f7537c) {
                    wVar.f7573b = uVar2.a();
                    uVar2.c(wVar);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                k0Var.l((u) arrayList2.get(i12));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = d6.m.b0(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return i.f7521b;
    }
}
