package b1;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.n1;
import s.q0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class d extends i {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f956n = new int[0];

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f957e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f958f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public s.i0 f959h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f960i;
    public o j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f961k;

    /* renamed from: l, reason: collision with root package name */
    public int f962l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f963m;

    public d(long j, o oVar, Function1 function1, Function1 function12) {
        super(j, oVar);
        this.f957e = function1;
        this.f958f = function12;
        this.j = o.f1018s;
        this.f961k = f956n;
        this.f962l = 1;
    }

    public final void A(long j) {
        synchronized (r.f1030c) {
            this.j = this.j.g(j);
        }
    }

    public void B(s.i0 i0Var) {
        this.f959h = i0Var;
    }

    public d C(Function1 function1, Function1 function12) {
        if (this.f985c) {
            n1.a("Cannot use a disposed snapshot");
        }
        if (this.f963m && this.f986d < 0) {
            n1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = r.f1030c;
        synchronized (obj) {
            try {
                long j = r.f1032e;
                long j3 = 1;
                r.f1032e = j + j3;
                r.f1031d = r.f1031d.g(j);
                o d10 = d();
                r(d10.g(j));
                try {
                    e eVar = new e(j, r.d(d10, g() + j3, j), r.k(function1, e(), true), r.l(function12, i()), this);
                    if (this.f963m || this.f985c) {
                        return eVar;
                    }
                    long g = g();
                    synchronized (obj) {
                        long j10 = r.f1032e;
                        r.f1032e = j10 + j3;
                        s(j10);
                        r.f1031d = r.f1031d.g(g());
                    }
                    r(r.d(d(), g + j3, g()));
                    return eVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // b1.i
    public final void b() {
        r.f1031d = r.f1031d.c(g()).b(this.j);
    }

    @Override // b1.i
    public void c() {
        if (this.f985c) {
            return;
        }
        this.f985c = true;
        synchronized (r.f1030c) {
            o();
        }
        l();
    }

    @Override // b1.i
    public boolean f() {
        return false;
    }

    @Override // b1.i
    public int h() {
        return this.g;
    }

    @Override // b1.i
    public Function1 i() {
        return this.f958f;
    }

    @Override // b1.i
    public void k() {
        this.f962l++;
    }

    @Override // b1.i
    public void l() {
        if (this.f962l <= 0) {
            n1.a("no pending nested snapshots");
        }
        int i3 = this.f962l - 1;
        this.f962l = i3;
        if (i3 != 0 || this.f963m) {
            return;
        }
        s.i0 x10 = x();
        if (x10 != null) {
            if (this.f963m) {
                n1.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g = g();
            Object[] objArr = x10.f8320b;
            long[] jArr = x10.f8319a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j = jArr[i10];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j) < 128) {
                                for (h0 c10 = ((f0) objArr[(i10 << 3) + i12]).c(); c10 != null; c10 = c10.f982b) {
                                    long j3 = c10.f981a;
                                    if (j3 == g || CollectionsKt.u(this.j, Long.valueOf(j3))) {
                                        a1.f fVar = r.f1028a;
                                        c10.f981a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        }
                    }
                    if (i10 == length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        a();
    }

    @Override // b1.i
    public void m() {
        if (this.f963m || this.f985c) {
            return;
        }
        v();
    }

    @Override // b1.i
    public void n(f0 f0Var) {
        s.i0 x10 = x();
        if (x10 == null) {
            int i3 = q0.f8360a;
            x10 = new s.i0();
            B(x10);
        }
        x10.a(f0Var);
    }

    @Override // b1.i
    public final void p() {
        int length = this.f961k.length;
        for (int i3 = 0; i3 < length; i3++) {
            r.u(this.f961k[i3]);
        }
        o();
    }

    @Override // b1.i
    public void t(int i3) {
        this.g = i3;
    }

    @Override // b1.i
    public i u(Function1 function1) {
        if (this.f985c) {
            n1.a("Cannot use a disposed snapshot");
        }
        if (this.f963m && this.f986d < 0) {
            n1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = r.f1030c;
        synchronized (obj) {
            try {
                long j = r.f1032e;
                long j3 = 1;
                r.f1032e = j + j3;
                r.f1031d = r.f1031d.g(j);
                try {
                    f fVar = new f(j, r.d(d(), g + j3, j), r.k(function1, e(), true), this);
                    if (this.f963m || this.f985c) {
                        return fVar;
                    }
                    long g2 = g();
                    synchronized (obj) {
                        long j10 = r.f1032e;
                        r.f1032e = j10 + j3;
                        s(j10);
                        r.f1031d = r.f1031d.g(g());
                    }
                    r(r.d(d(), g2 + j3, g()));
                    return fVar;
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
        long j;
        A(g());
        if (this.f963m || this.f985c) {
            return;
        }
        long g = g();
        synchronized (r.f1030c) {
            long j3 = r.f1032e;
            j = 1;
            r.f1032e = j3 + j;
            s(j3);
            r.f1031d = r.f1031d.g(g());
        }
        r(r.d(d(), g + j, g()));
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
    public x w() {
        HashMap hashMap;
        kotlin.collections.j0 j0Var;
        s.i0 i0Var;
        long j;
        long j3;
        ArrayList arrayList;
        int size;
        int i3;
        s.i0 x10 = x();
        if (x10 != null) {
            long j10 = r.j.f984b;
            hashMap = r.b(j10, this, r.f1031d.c(j10));
        } else {
            hashMap = null;
        }
        kotlin.collections.j0 j0Var2 = kotlin.collections.j0.f5574d;
        synchronized (r.f1030c) {
            try {
                r.c(this);
                if (x10 != null && x10.f8322d != 0) {
                    c cVar = r.j;
                    x z10 = z(r.f1032e, x10, hashMap, r.f1031d.c(cVar.f984b));
                    if (!z10.equals(l.f1002b)) {
                        return z10;
                    }
                    b();
                    i0Var = cVar.f959h;
                    r.v(cVar, r.f1028a);
                    B(null);
                    cVar.f959h = null;
                    j0Var = r.f1034h;
                    this.f963m = true;
                    if (i0Var != null) {
                        o0.h hVar = new o0.h(i0Var);
                        if (!i0Var.g()) {
                            int size2 = j0Var.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                ((Function2) j0Var.get(i10)).invoke(hVar, this);
                            }
                        }
                    }
                    if (x10 != null && x10.h()) {
                        o0.h hVar2 = new o0.h(x10);
                        size = j0Var.size();
                        for (i3 = 0; i3 < size; i3++) {
                            ((Function2) j0Var.get(i3)).invoke(hVar2, this);
                        }
                    }
                    synchronized (r.f1030c) {
                        try {
                            p();
                            r.f();
                            if (i0Var != null) {
                                Object[] objArr = i0Var.f8320b;
                                long[] jArr = i0Var.f8319a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i11 = 0;
                                    j = 128;
                                    while (true) {
                                        long j11 = jArr[i11];
                                        j3 = 255;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                                            for (int i13 = 0; i13 < i12; i13++) {
                                                if ((j11 & 255) < 128) {
                                                    r.q((f0) objArr[(i11 << 3) + i13]);
                                                }
                                                j11 >>= 8;
                                            }
                                            if (i12 != 8) {
                                                break;
                                            }
                                        }
                                        if (i11 == length) {
                                            break;
                                        }
                                        i11++;
                                    }
                                    if (x10 != null) {
                                        Object[] objArr2 = x10.f8320b;
                                        long[] jArr2 = x10.f8319a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j12 = jArr2[i14];
                                                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i16 = 0; i16 < i15; i16++) {
                                                        if ((j12 & j3) < j) {
                                                            r.q((f0) objArr2[(i14 << 3) + i16]);
                                                        }
                                                        j12 >>= 8;
                                                    }
                                                    if (i15 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                            }
                                        }
                                    }
                                    arrayList = this.f960i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i17 = 0; i17 < size3; i17++) {
                                            r.q((f0) arrayList.get(i17));
                                        }
                                    }
                                    this.f960i = null;
                                }
                            }
                            j = 128;
                            j3 = 255;
                            if (x10 != null) {
                            }
                            arrayList = this.f960i;
                            if (arrayList != null) {
                            }
                            this.f960i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return l.f1002b;
                }
                b();
                c cVar2 = r.j;
                s.i0 i0Var2 = cVar2.f959h;
                r.v(cVar2, r.f1028a);
                if (i0Var2 == null || !i0Var2.h()) {
                    j0Var = j0Var2;
                    i0Var = null;
                } else {
                    j0Var = r.f1034h;
                    i0Var = i0Var2;
                }
                this.f963m = true;
                if (i0Var != null) {
                }
                if (x10 != null) {
                    o0.h hVar22 = new o0.h(x10);
                    size = j0Var.size();
                    while (i3 < size) {
                    }
                }
                synchronized (r.f1030c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s.i0 x() {
        return this.f959h;
    }

    @Override // b1.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.f957e;
    }

    public final x z(long j, s.i0 i0Var, HashMap hashMap, o oVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        o oVar2;
        Object[] objArr;
        long[] jArr;
        o oVar3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j3;
        ArrayList arrayList4;
        h0 e2;
        o f3 = d().g(g()).f(this.j);
        Object[] objArr3 = i0Var.f8320b;
        long[] jArr3 = i0Var.f8319a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j10 = jArr3[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j10 & 255) < 128) {
                            objArr2 = objArr3;
                            f0 f0Var = (f0) objArr3[(i10 << 3) + i12];
                            jArr2 = jArr3;
                            h0 c10 = f0Var.c();
                            i3 = i12;
                            ArrayList arrayList5 = arrayList3;
                            h0 s3 = r.s(c10, j, oVar);
                            if (s3 == null) {
                                oVar3 = f3;
                                arrayList4 = arrayList2;
                                j3 = j10;
                            } else {
                                arrayList4 = arrayList2;
                                j3 = j10;
                                h0 s10 = r.s(c10, g(), f3);
                                if (s10 == null) {
                                    oVar3 = f3;
                                } else {
                                    oVar3 = f3;
                                    if (s10.f981a != 1 && !s3.equals(s10)) {
                                        h0 s11 = r.s(c10, g(), d());
                                        if (s11 == null) {
                                            r.r();
                                            throw null;
                                        }
                                        if (hashMap == null || (e2 = (h0) hashMap.get(s3)) == null) {
                                            e2 = f0Var.e(s10, s3, s11);
                                        }
                                        if (e2 == null) {
                                            return new k(this);
                                        }
                                        if (!e2.equals(s11)) {
                                            if (e2.equals(s3)) {
                                                ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList6.add(new Pair(f0Var, s3.b(g())));
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(f0Var);
                                                arrayList3 = arrayList6;
                                            } else {
                                                arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                                arrayList3.add(!e2.equals(s10) ? new Pair(f0Var, e2) : new Pair(f0Var, s10.b(g())));
                                                arrayList2 = arrayList4;
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            oVar3 = f3;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i12;
                            j3 = j10;
                        }
                        j10 = j3 >> 8;
                        i12 = i3 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        f3 = oVar3;
                    }
                    oVar2 = f3;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    oVar2 = f3;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i10 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i10++;
                jArr3 = jArr;
                objArr3 = objArr;
                f3 = oVar2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i13 = 0; i13 < size; i13++) {
                Pair pair = (Pair) arrayList3.get(i13);
                f0 f0Var2 = (f0) pair.f5552d;
                h0 h0Var = (h0) pair.f5553e;
                h0Var.f981a = j;
                synchronized (r.f1030c) {
                    h0Var.f982b = f0Var2.c();
                    f0Var2.b(h0Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                i0Var.k((f0) arrayList2.get(i14));
            }
            ArrayList arrayList7 = this.f960i;
            if (arrayList7 != null) {
                arrayList2 = CollectionsKt.G(arrayList7, arrayList2);
            }
            this.f960i = arrayList2;
        }
        return l.f1002b;
    }
}
