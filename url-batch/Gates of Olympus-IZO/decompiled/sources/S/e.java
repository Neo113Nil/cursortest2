package S;

import I.C0089d;
import j.AbstractC0479E;
import j.C0475A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class e extends i {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f3193n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final Y1.c f3194e;

    /* renamed from: f, reason: collision with root package name */
    public final Y1.c f3195f;

    /* renamed from: g, reason: collision with root package name */
    public int f3196g;

    /* renamed from: h, reason: collision with root package name */
    public C0475A f3197h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3198i;

    /* renamed from: j, reason: collision with root package name */
    public n f3199j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f3200k;

    /* renamed from: l, reason: collision with root package name */
    public int f3201l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3202m;

    public e(int i3, n nVar, Y1.c cVar, Y1.c cVar2) {
        super(i3, nVar);
        this.f3194e = cVar;
        this.f3195f = cVar2;
        this.f3199j = n.f3224h;
        this.f3200k = f3193n;
        this.f3201l = 1;
    }

    public void A(C0475A c0475a) {
        this.f3197h = c0475a;
    }

    public e B(Y1.c cVar, Y1.c cVar2) {
        f fVar;
        if (this.f3210c) {
            C0089d.R("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f3202m && this.f3211d < 0) {
            C0089d.S("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        z(d());
        Object obj = q.f3235b;
        synchronized (obj) {
            int i3 = q.f3237d;
            q.f3237d = i3 + 1;
            q.f3236c = q.f3236c.j(i3);
            n e3 = e();
            r(e3.j(i3));
            fVar = new f(i3, q.e(e3, d() + 1, i3), q.l(cVar, f(), true), q.b(cVar2, i()), this);
        }
        if (!this.f3202m && !this.f3210c) {
            int d3 = d();
            synchronized (obj) {
                int i4 = q.f3237d;
                q.f3237d = i4 + 1;
                q(i4);
                q.f3236c = q.f3236c.j(d());
            }
            r(q.e(e(), d3 + 1, d()));
        }
        return fVar;
    }

    @Override // S.i
    public final void b() {
        q.f3236c = q.f3236c.c(d()).b(this.f3199j);
    }

    @Override // S.i
    public void c() {
        if (this.f3210c) {
            return;
        }
        this.f3210c = true;
        synchronized (q.f3235b) {
            int i3 = this.f3211d;
            if (i3 >= 0) {
                q.u(i3);
                this.f3211d = -1;
            }
        }
        l();
    }

    @Override // S.i
    public boolean g() {
        return false;
    }

    @Override // S.i
    public int h() {
        return this.f3196g;
    }

    @Override // S.i
    public Y1.c i() {
        return this.f3195f;
    }

    @Override // S.i
    public void k() {
        this.f3201l++;
    }

    @Override // S.i
    public void l() {
        int i3 = this.f3201l;
        if (!(i3 > 0)) {
            C0089d.R("no pending nested snapshots");
            throw null;
        }
        int i4 = i3 - 1;
        this.f3201l = i4;
        if (i4 != 0 || this.f3202m) {
            return;
        }
        C0475A w3 = w();
        if (w3 != null) {
            if (this.f3202m) {
                C0089d.S("Unsupported operation on a snapshot that has been applied");
                throw null;
            }
            A(null);
            int d3 = d();
            Object[] objArr = w3.f5130b;
            long[] jArr = w3.f5129a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j3 = jArr[i5];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((255 & j3) < 128) {
                                for (z c3 = ((x) objArr[(i5 << 3) + i7]).c(); c3 != null; c3 = c3.f3273b) {
                                    int i8 = c3.f3272a;
                                    if (i8 != d3) {
                                        Iterable iterable = this.f3199j;
                                        Integer valueOf = Integer.valueOf(i8);
                                        Z1.i.f(iterable, "<this>");
                                        if (!(iterable instanceof Collection ? ((Collection) iterable).contains(valueOf) : M1.l.o0(iterable, valueOf) >= 0)) {
                                        }
                                    }
                                    c3.f3272a = 0;
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        a();
    }

    @Override // S.i
    public void m() {
        if (this.f3202m || this.f3210c) {
            return;
        }
        u();
    }

    @Override // S.i
    public void n(x xVar) {
        C0475A w3 = w();
        if (w3 == null) {
            int i3 = AbstractC0479E.f5137a;
            w3 = new C0475A();
            A(w3);
        }
        w3.a(xVar);
    }

    @Override // S.i
    public final void o() {
        int length = this.f3200k.length;
        for (int i3 = 0; i3 < length; i3++) {
            q.u(this.f3200k[i3]);
        }
        int i4 = this.f3211d;
        if (i4 >= 0) {
            q.u(i4);
            this.f3211d = -1;
        }
    }

    @Override // S.i
    public void s(int i3) {
        this.f3196g = i3;
    }

    @Override // S.i
    public i t(Y1.c cVar) {
        g gVar;
        if (this.f3210c) {
            C0089d.R("Cannot use a disposed snapshot");
            throw null;
        }
        if (this.f3202m && this.f3211d < 0) {
            C0089d.S("Unsupported operation on a disposed or applied snapshot");
            throw null;
        }
        int d3 = d();
        z(d());
        Object obj = q.f3235b;
        synchronized (obj) {
            int i3 = q.f3237d;
            q.f3237d = i3 + 1;
            q.f3236c = q.f3236c.j(i3);
            gVar = new g(i3, q.e(e(), d3 + 1, i3), q.l(cVar, f(), true), this);
        }
        if (!this.f3202m && !this.f3210c) {
            int d4 = d();
            synchronized (obj) {
                int i4 = q.f3237d;
                q.f3237d = i4 + 1;
                q(i4);
                q.f3236c = q.f3236c.j(d());
            }
            r(q.e(e(), d4 + 1, d()));
        }
        return gVar;
    }

    public final void u() {
        z(d());
        if (this.f3202m || this.f3210c) {
            return;
        }
        int d3 = d();
        synchronized (q.f3235b) {
            int i3 = q.f3237d;
            q.f3237d = i3 + 1;
            q(i3);
            q.f3236c = q.f3236c.j(d());
        }
        r(q.e(e(), d3 + 1, d()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf A[LOOP:1: B:31:0x00bd->B:32:0x00bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u v() {
        HashMap hashMap;
        C0475A c0475a;
        M1.u uVar;
        int size;
        int i3;
        C0475A w3 = w();
        if (w3 != null) {
            AtomicReference atomicReference = q.f3242i;
            hashMap = q.c((e) atomicReference.get(), this, q.f3236c.c(((d) atomicReference.get()).f3209b));
        } else {
            hashMap = null;
        }
        M1.u uVar2 = M1.u.f2803d;
        synchronized (q.f3235b) {
            try {
                q.d(this);
                if (w3 != null && w3.f5132d != 0) {
                    d dVar = (d) q.f3242i.get();
                    u y3 = y(q.f3237d, hashMap, q.f3236c.c(dVar.f3209b));
                    if (!y3.equals(k.f3212b)) {
                        return y3;
                    }
                    b();
                    q.v(dVar, o.f3230g);
                    c0475a = dVar.f3197h;
                    A(null);
                    dVar.f3197h = null;
                    uVar = q.f3240g;
                    this.f3202m = true;
                    if (c0475a != null) {
                        K.f fVar = new K.f(c0475a);
                        if (!c0475a.g()) {
                            int size2 = uVar.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                ((Y1.e) uVar.get(i4)).g(fVar, this);
                            }
                        }
                    }
                    if (w3 != null && w3.h()) {
                        K.f fVar2 = new K.f(w3);
                        size = uVar.size();
                        for (i3 = 0; i3 < size; i3++) {
                            ((Y1.e) uVar.get(i3)).g(fVar2, this);
                        }
                    }
                    synchronized (q.f3235b) {
                        try {
                            o();
                            q.g();
                            if (c0475a != null) {
                                Object[] objArr = c0475a.f5130b;
                                long[] jArr = c0475a.f5129a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    while (true) {
                                        long j3 = jArr[i5];
                                        long[] jArr2 = jArr;
                                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                                            for (int i7 = 0; i7 < i6; i7++) {
                                                if ((j3 & 255) < 128) {
                                                    q.q((x) objArr[(i5 << 3) + i7]);
                                                }
                                                j3 >>= 8;
                                            }
                                            if (i6 != 8) {
                                                break;
                                            }
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                        jArr = jArr2;
                                    }
                                }
                            }
                            if (w3 != null) {
                                Object[] objArr2 = w3.f5130b;
                                long[] jArr3 = w3.f5129a;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    int i8 = 0;
                                    while (true) {
                                        long j4 = jArr3[i8];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j4 & 255) < 128) {
                                                    q.q((x) objArr2[(i8 << 3) + i10]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i9 != 8) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                            }
                            ArrayList arrayList = this.f3198i;
                            if (arrayList != null) {
                                int size3 = arrayList.size();
                                for (int i11 = 0; i11 < size3; i11++) {
                                    q.q((x) arrayList.get(i11));
                                }
                            }
                            this.f3198i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return k.f3212b;
                }
                b();
                d dVar2 = (d) q.f3242i.get();
                q.v(dVar2, o.f3230g);
                c0475a = dVar2.f3197h;
                if (c0475a == null || !c0475a.h()) {
                    c0475a = null;
                    uVar = uVar2;
                } else {
                    uVar = q.f3240g;
                }
                this.f3202m = true;
                if (c0475a != null) {
                }
                if (w3 != null) {
                    K.f fVar22 = new K.f(w3);
                    size = uVar.size();
                    while (i3 < size) {
                    }
                }
                synchronized (q.f3235b) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C0475A w() {
        return this.f3197h;
    }

    @Override // S.i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Y1.c f() {
        return this.f3194e;
    }

    public final u y(int i3, HashMap hashMap, n nVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        n nVar2;
        Object[] objArr;
        long[] jArr;
        n nVar3;
        Object[] objArr2;
        long[] jArr2;
        int i4;
        z s3;
        z b2;
        n i5 = e().j(d()).i(this.f3199j);
        C0475A w3 = w();
        Z1.i.c(w3);
        Object[] objArr3 = w3.f5130b;
        long[] jArr3 = w3.f5129a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            arrayList4 = null;
            arrayList3 = null;
            while (true) {
                long j3 = jArr3[i6];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j3 & 255) < 128) {
                            x xVar = (x) objArr3[(i6 << 3) + i9];
                            z c3 = xVar.c();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            z s4 = q.s(c3, i3, nVar);
                            if (s4 == null || (s3 = q.s(c3, d(), i5)) == null) {
                                nVar3 = i5;
                            } else {
                                nVar3 = i5;
                                if (s3.f3272a != 1 && !s4.equals(s3)) {
                                    z s5 = q.s(c3, d(), e());
                                    if (s5 == null) {
                                        q.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (b2 = (z) hashMap.get(s4)) == null) {
                                        b2 = xVar.b(s3, s4, s5);
                                    }
                                    if (b2 == null) {
                                        return new j();
                                    }
                                    if (!b2.equals(s5)) {
                                        if (b2.equals(s4)) {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(new L1.j(xVar, s4.b()));
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(xVar);
                                        } else {
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                            }
                                            arrayList4.add(!b2.equals(s3) ? new L1.j(xVar, b2) : new L1.j(xVar, s3.b()));
                                        }
                                    }
                                }
                            }
                            i4 = 8;
                        } else {
                            nVar3 = i5;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i4 = i7;
                        }
                        j3 >>= i4;
                        i9++;
                        i7 = i4;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        i5 = nVar3;
                    }
                    nVar2 = i5;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i8 != i7) {
                        break;
                    }
                } else {
                    nVar2 = i5;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i6 == length) {
                    arrayList2 = arrayList4;
                    arrayList = arrayList3;
                    break;
                }
                i6++;
                objArr3 = objArr;
                jArr3 = jArr;
                i5 = nVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        arrayList4 = arrayList2;
        if (arrayList4 != null) {
            u();
            int size = arrayList4.size();
            for (int i10 = 0; i10 < size; i10++) {
                L1.j jVar = (L1.j) arrayList4.get(i10);
                x xVar2 = (x) jVar.f2708d;
                z zVar = (z) jVar.f2709e;
                zVar.f3272a = d();
                synchronized (q.f3235b) {
                    zVar.f3273b = xVar2.c();
                    xVar2.d(zVar);
                }
            }
        }
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                w3.j((x) arrayList3.get(i11));
            }
            ArrayList arrayList5 = this.f3198i;
            if (arrayList5 != null) {
                arrayList3 = M1.l.w0(arrayList5, arrayList3);
            }
            this.f3198i = arrayList3;
        }
        return k.f3212b;
    }

    public final void z(int i3) {
        synchronized (q.f3235b) {
            this.f3199j = this.f3199j.j(i3);
        }
    }
}
