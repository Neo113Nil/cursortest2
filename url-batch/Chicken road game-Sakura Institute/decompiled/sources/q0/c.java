package q0;

import i.b0;
import i.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class c extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f7386n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final q6.c f7387e;

    /* renamed from: f, reason: collision with root package name */
    public final q6.c f7388f;

    /* renamed from: g, reason: collision with root package name */
    public int f7389g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f7390h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f7391i;

    /* renamed from: j, reason: collision with root package name */
    public l f7392j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f7393k;

    /* renamed from: l, reason: collision with root package name */
    public int f7394l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7395m;

    public c(int i7, l lVar, q6.c cVar, q6.c cVar2) {
        super(i7, lVar);
        this.f7387e = cVar;
        this.f7388f = cVar2;
        this.f7392j = l.f7418j;
        this.f7393k = f7386n;
        this.f7394l = 1;
    }

    public void A(b0 b0Var) {
        this.f7390h = b0Var;
    }

    public c B(q6.c cVar, q6.c cVar2) {
        if (this.f7404c) {
            g0.d.R("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f7395m && this.f7405d < 0) {
            g0.d.S("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = n.f7427b;
        synchronized (obj) {
            try {
                int i7 = n.f7429d;
                n.f7429d = i7 + 1;
                n.f7428c = n.f7428c.x(i7);
                l e9 = e();
                r(e9.x(i7));
                try {
                    d dVar = new d(i7, n.e(e9, d() + 1, i7), n.l(cVar, f(), true), n.b(cVar2, i()), this);
                    if (this.f7395m || this.f7404c) {
                        return dVar;
                    }
                    int d8 = d();
                    synchronized (obj) {
                        int i8 = n.f7429d;
                        n.f7429d = i8 + 1;
                        q(i8);
                        n.f7428c = n.f7428c.x(d());
                    }
                    r(n.e(e(), d8 + 1, d()));
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

    @Override // q0.g
    public final void b() {
        n.f7428c = n.f7428c.g(d()).a(this.f7392j);
    }

    @Override // q0.g
    public void c() {
        if (this.f7404c) {
            return;
        }
        this.f7404c = true;
        synchronized (n.f7427b) {
            int i7 = this.f7405d;
            if (i7 >= 0) {
                n.u(i7);
                this.f7405d = -1;
            }
        }
        l();
    }

    @Override // q0.g
    public boolean g() {
        return false;
    }

    @Override // q0.g
    public int h() {
        return this.f7389g;
    }

    @Override // q0.g
    public q6.c i() {
        return this.f7388f;
    }

    @Override // q0.g
    public void k() {
        this.f7394l++;
    }

    @Override // q0.g
    public void l() {
        int i7 = this.f7394l;
        if (i7 <= 0) {
            g0.d.R("no pending nested snapshots");
            throw null;
        }
        int i8 = i7 - 1;
        this.f7394l = i8;
        if (i8 != 0 || this.f7395m) {
            return;
        }
        b0 w4 = w();
        if (w4 != null) {
            if (this.f7395m) {
                g0.d.S("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int d8 = d();
            Object[] objArr = w4.f4722b;
            long[] jArr = w4.f4721a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i9 = 0;
                while (true) {
                    long j8 = jArr[i9];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                        for (int i11 = 0; i11 < i10; i11++) {
                            if ((255 & j8) < 128) {
                                for (w a3 = ((u) objArr[(i9 << 3) + i11]).a(); a3 != null; a3 = a3.f7465b) {
                                    int i12 = a3.f7464a;
                                    if (i12 == d8 || e6.l.f0(this.f7392j, Integer.valueOf(i12))) {
                                        a3.f7464a = 0;
                                    }
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i9 == length) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
        }
        a();
    }

    @Override // q0.g
    public void m() {
        if (this.f7395m || this.f7404c) {
            return;
        }
        u();
    }

    @Override // q0.g
    public void n(u uVar) {
        b0 w4 = w();
        if (w4 == null) {
            int i7 = f0.f4740a;
            w4 = new b0();
            A(w4);
        }
        w4.a(uVar);
    }

    @Override // q0.g
    public final void o() {
        int length = this.f7393k.length;
        for (int i7 = 0; i7 < length; i7++) {
            n.u(this.f7393k[i7]);
        }
        int i8 = this.f7405d;
        if (i8 >= 0) {
            n.u(i8);
            this.f7405d = -1;
        }
    }

    @Override // q0.g
    public void s(int i7) {
        this.f7389g = i7;
    }

    @Override // q0.g
    public g t(q6.c cVar) {
        e eVar;
        if (this.f7404c) {
            g0.d.R("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f7395m && this.f7405d < 0) {
            g0.d.S("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int d8 = d();
        z(d());
        Object obj = n.f7427b;
        synchronized (obj) {
            int i7 = n.f7429d;
            n.f7429d = i7 + 1;
            n.f7428c = n.f7428c.x(i7);
            eVar = new e(i7, n.e(e(), d8 + 1, i7), n.l(cVar, f(), true), this);
        }
        if (this.f7395m || this.f7404c) {
            return eVar;
        }
        int d9 = d();
        synchronized (obj) {
            int i8 = n.f7429d;
            n.f7429d = i8 + 1;
            q(i8);
            n.f7428c = n.f7428c.x(d());
        }
        r(n.e(e(), d9 + 1, d()));
        return eVar;
    }

    public final void u() {
        z(d());
        if (this.f7395m || this.f7404c) {
            return;
        }
        int d8 = d();
        synchronized (n.f7427b) {
            int i7 = n.f7429d;
            n.f7429d = i7 + 1;
            q(i7);
            n.f7428c = n.f7428c.x(d());
        }
        r(n.e(e(), d8 + 1, d()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[LOOP:1: B:31:0x00bd->B:32:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:37:0x00ce, B:39:0x00de, B:42:0x00ea, B:44:0x00f6, B:46:0x0100, B:48:0x0106, B:50:0x0114, B:56:0x0125, B:59:0x012f, B:61:0x0139, B:63:0x0143, B:65:0x0149, B:67:0x0153, B:73:0x015b, B:75:0x015e, B:77:0x0162, B:79:0x0169, B:81:0x0175, B:87:0x011c), top: B:36:0x00ce }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:37:0x00ce, B:39:0x00de, B:42:0x00ea, B:44:0x00f6, B:46:0x0100, B:48:0x0106, B:50:0x0114, B:56:0x0125, B:59:0x012f, B:61:0x0139, B:63:0x0143, B:65:0x0149, B:67:0x0153, B:73:0x015b, B:75:0x015e, B:77:0x0162, B:79:0x0169, B:81:0x0175, B:87:0x011c), top: B:36:0x00ce }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r v() {
        HashMap hashMap;
        b0 b0Var;
        e6.u uVar;
        long j8;
        long j9;
        ArrayList arrayList;
        int size;
        int i7;
        b0 w4 = w();
        if (w4 != null) {
            AtomicReference atomicReference = n.f7434i;
            hashMap = n.c((c) atomicReference.get(), this, n.f7428c.g(((b) atomicReference.get()).f7403b));
        } else {
            hashMap = null;
        }
        e6.u uVar2 = e6.u.f2826f;
        synchronized (n.f7427b) {
            try {
                n.d(this);
                if (w4 != null && w4.f4724d != 0) {
                    b bVar = (b) n.f7434i.get();
                    r y4 = y(n.f7429d, hashMap, n.f7428c.g(bVar.f7403b));
                    if (!y4.equals(i.f7406b)) {
                        return y4;
                    }
                    b();
                    n.v(bVar, m.f7424i);
                    b0Var = bVar.f7390h;
                    A(null);
                    bVar.f7390h = null;
                    uVar = n.f7432g;
                    this.f7395m = true;
                    if (b0Var != null) {
                        i0.f fVar = new i0.f(b0Var);
                        if (!b0Var.g()) {
                            int size2 = uVar.size();
                            for (int i8 = 0; i8 < size2; i8++) {
                                ((q6.e) uVar.get(i8)).d(fVar, this);
                            }
                        }
                    }
                    if (w4 != null && w4.h()) {
                        i0.f fVar2 = new i0.f(w4);
                        size = uVar.size();
                        for (i7 = 0; i7 < size; i7++) {
                            ((q6.e) uVar.get(i7)).d(fVar2, this);
                        }
                    }
                    synchronized (n.f7427b) {
                        try {
                            o();
                            n.g();
                            if (b0Var != null) {
                                Object[] objArr = b0Var.f4722b;
                                long[] jArr = b0Var.f4721a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i9 = 0;
                                    j8 = 128;
                                    while (true) {
                                        long j10 = jArr[i9];
                                        j9 = 255;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((j10 & 255) < 128) {
                                                    n.q((u) objArr[(i9 << 3) + i11]);
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
                                    if (w4 != null) {
                                        Object[] objArr2 = w4.f4722b;
                                        long[] jArr2 = w4.f4721a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j11 = jArr2[i12];
                                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j11 & j9) < j8) {
                                                            n.q((u) objArr2[(i12 << 3) + i14]);
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
                                    arrayList = this.f7391i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i15 = 0; i15 < size3; i15++) {
                                            n.q((u) arrayList.get(i15));
                                        }
                                    }
                                    this.f7391i = null;
                                }
                            }
                            j8 = 128;
                            j9 = 255;
                            if (w4 != null) {
                            }
                            arrayList = this.f7391i;
                            if (arrayList != null) {
                            }
                            this.f7391i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return i.f7406b;
                }
                b();
                b bVar2 = (b) n.f7434i.get();
                n.v(bVar2, m.f7424i);
                b0Var = bVar2.f7390h;
                if (b0Var == null || !b0Var.h()) {
                    b0Var = null;
                    uVar = uVar2;
                } else {
                    uVar = n.f7432g;
                }
                this.f7395m = true;
                if (b0Var != null) {
                }
                if (w4 != null) {
                    i0.f fVar22 = new i0.f(w4);
                    size = uVar.size();
                    while (i7 < size) {
                    }
                }
                synchronized (n.f7427b) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b0 w() {
        return this.f7390h;
    }

    @Override // q0.g
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public q6.c f() {
        return this.f7387e;
    }

    public final r y(int i7, HashMap hashMap, l lVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        l lVar2;
        Object[] objArr;
        long[] jArr;
        l lVar3;
        Object[] objArr2;
        long[] jArr2;
        int i8;
        int i9;
        w s5;
        w g9;
        l w4 = e().x(d()).w(this.f7392j);
        b0 w5 = w();
        r6.k.c(w5);
        Object[] objArr3 = w5.f4722b;
        long[] jArr3 = w5.f4721a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            arrayList4 = null;
            arrayList3 = null;
            while (true) {
                long j8 = jArr3[i10];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j8 & 255) < 128) {
                            u uVar = (u) objArr3[(i10 << 3) + i13];
                            i9 = i11;
                            w a3 = uVar.a();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i8 = i13;
                            w s8 = n.s(a3, i7, lVar);
                            if (s8 == null || (s5 = n.s(a3, d(), w4)) == null) {
                                lVar3 = w4;
                            } else {
                                lVar3 = w4;
                                if (s5.f7464a != 1 && !s8.equals(s5)) {
                                    w s9 = n.s(a3, d(), e());
                                    if (s9 == null) {
                                        n.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (g9 = (w) hashMap.get(s8)) == null) {
                                        g9 = uVar.g(s5, s8, s9);
                                    }
                                    if (g9 == null) {
                                        return new h();
                                    }
                                    if (!g9.equals(s9)) {
                                        if (g9.equals(s8)) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(new d6.j(uVar, s8.b()));
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(uVar);
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(!g9.equals(s5) ? new d6.j(uVar, g9) : new d6.j(uVar, s5.b()));
                                        }
                                    }
                                }
                            }
                        } else {
                            lVar3 = w4;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i8 = i13;
                            i9 = i11;
                        }
                        j8 >>= i9;
                        i13 = i8 + 1;
                        i11 = i9;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        w4 = lVar3;
                    }
                    lVar2 = w4;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i12 != i11) {
                        break;
                    }
                } else {
                    lVar2 = w4;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i10 == length) {
                    arrayList2 = arrayList4;
                    arrayList = arrayList3;
                    break;
                }
                i10++;
                objArr3 = objArr;
                jArr3 = jArr;
                w4 = lVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList4 = arrayList2;
        arrayList3 = arrayList;
        if (arrayList4 != null) {
            u();
            int size = arrayList4.size();
            for (int i14 = 0; i14 < size; i14++) {
                d6.j jVar = (d6.j) arrayList4.get(i14);
                u uVar2 = (u) jVar.f2618f;
                w wVar = (w) jVar.f2619g;
                wVar.f7464a = d();
                synchronized (n.f7427b) {
                    wVar.f7465b = uVar2.a();
                    uVar2.m(wVar);
                }
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                w5.j((u) arrayList3.get(i15));
            }
            ArrayList arrayList5 = this.f7391i;
            if (arrayList5 != null) {
                arrayList3 = e6.l.r0(arrayList5, arrayList3);
            }
            this.f7391i = arrayList3;
        }
        return i.f7406b;
    }

    public final void z(int i7) {
        synchronized (n.f7427b) {
            this.f7392j = this.f7392j.x(i7);
        }
    }
}
