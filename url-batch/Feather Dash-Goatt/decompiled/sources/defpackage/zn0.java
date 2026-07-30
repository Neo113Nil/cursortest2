package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class zn0 extends ib1 {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public wn0 h;
    public ArrayList i;
    public mb1 j;
    public int[] k;
    public int l;
    public boolean m;

    public zn0(long j, mb1 mb1Var, Function1 function1, Function1 function12) {
        super(j, mb1Var);
        this.e = function1;
        this.f = function12;
        this.j = mb1.i;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (pb1.c) {
            this.j = this.j.f(j);
        }
    }

    public void B(wn0 wn0Var) {
        this.h = wn0Var;
    }

    public zn0 C(Function1 function1, Function1 function12) {
        ro0 ro0Var;
        if (this.c) {
            cy0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            cy0.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = pb1.c;
        synchronized (obj) {
            long j = pb1.e;
            pb1.e = j + 1;
            pb1.d = pb1.d.f(j);
            mb1 d = d();
            r(d.f(j));
            ro0Var = new ro0(j, pb1.d(d, g() + 1, j), pb1.k(function1, e(), true), pb1.l(function12, i()), this);
        }
        if (this.m || this.c) {
            return ro0Var;
        }
        long g = g();
        synchronized (obj) {
            long j2 = pb1.e;
            pb1.e = j2 + 1;
            s(j2);
            pb1.d = pb1.d.f(g());
        }
        r(pb1.d(d(), g + 1, g()));
        return ro0Var;
    }

    @Override // defpackage.ib1
    public final void b() {
        pb1.d = pb1.d.b(g()).a(this.j);
    }

    @Override // defpackage.ib1
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (pb1.c) {
            o();
        }
        l();
    }

    @Override // defpackage.ib1
    public boolean f() {
        return false;
    }

    @Override // defpackage.ib1
    public int h() {
        return this.g;
    }

    @Override // defpackage.ib1
    public Function1 i() {
        return this.f;
    }

    @Override // defpackage.ib1
    public void k() {
        this.l++;
    }

    @Override // defpackage.ib1
    public void l() {
        if (this.l <= 0) {
            cy0.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        wn0 x = x();
        if (x != null) {
            if (this.m) {
                cy0.b("Unsupported operation on a snapshot that has been applied");
            }
            B(null);
            long g = g();
            Object[] objArr = x.b;
            long[] jArr = x.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                for (ie1 a = ((ge1) objArr[(i2 << 3) + i4]).a(); a != null; a = a.b) {
                                    long j2 = a.a;
                                    if (j2 == g || CollectionsKt.n(this.j, Long.valueOf(j2))) {
                                        k61 k61Var = pb1.a;
                                        a.a = 0L;
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        a();
    }

    @Override // defpackage.ib1
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.ib1
    public void n(ge1 ge1Var) {
        wn0 x = x();
        if (x == null) {
            wn0 wn0Var = r61.a;
            x = new wn0();
            B(x);
        }
        x.a(ge1Var);
    }

    @Override // defpackage.ib1
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            pb1.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.ib1
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.ib1
    public ib1 u(Function1 function1) {
        so0 so0Var;
        if (this.c) {
            cy0.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            cy0.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = pb1.c;
        synchronized (obj) {
            long j = pb1.e;
            pb1.e = j + 1;
            pb1.d = pb1.d.f(j);
            so0Var = new so0(j, pb1.d(d(), g + 1, j), pb1.k(function1, e(), true), this);
        }
        if (this.m || this.c) {
            return so0Var;
        }
        long g2 = g();
        synchronized (obj) {
            long j2 = pb1.e;
            pb1.e = j2 + 1;
            s(j2);
            pb1.d = pb1.d.f(g());
        }
        r(pb1.d(d(), g2 + 1, g()));
        return so0Var;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (pb1.c) {
            long j = pb1.e;
            pb1.e = j + 1;
            s(j);
            pb1.d = pb1.d.f(g());
        }
        r(pb1.d(d(), g + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[LOOP:1: B:31:0x00a9->B:32:0x00ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e A[Catch: all -> 0x00fe, TryCatch #1 {all -> 0x00fe, blocks: (B:37:0x00ba, B:39:0x00ca, B:42:0x00d6, B:44:0x00e2, B:46:0x00ec, B:48:0x00f2, B:50:0x0100, B:56:0x0111, B:59:0x011b, B:61:0x0125, B:63:0x012f, B:65:0x0135, B:67:0x013f, B:73:0x0147, B:75:0x014a, B:77:0x014e, B:79:0x0155, B:81:0x0161, B:87:0x0108), top: B:36:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ka0 w() {
        HashMap hashMap;
        List list;
        wn0 wn0Var;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        wn0 x = x();
        if (x != null) {
            long j3 = pb1.j.b;
            hashMap = pb1.b(j3, this, pb1.d.b(j3));
        } else {
            hashMap = null;
        }
        nv nvVar = nv.d;
        synchronized (pb1.c) {
            try {
                pb1.c(this);
                if (x != null && x.d != 0) {
                    x40 x40Var = pb1.j;
                    ka0 z = z(pb1.e, x, hashMap, pb1.d.b(x40Var.b));
                    if (!z.equals(kb1.a)) {
                        return z;
                    }
                    b();
                    wn0Var = x40Var.h;
                    pb1.v(x40Var, pb1.a);
                    B(null);
                    x40Var.h = null;
                    list = pb1.h;
                    this.m = true;
                    if (wn0Var != null) {
                        s61 s61Var = new s61(wn0Var);
                        if (!wn0Var.g()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((Function2) list.get(i2)).b(s61Var, this);
                            }
                        }
                    }
                    if (x != null && x.h()) {
                        s61 s61Var2 = new s61(x);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((Function2) list.get(i)).b(s61Var2, this);
                        }
                    }
                    synchronized (pb1.c) {
                        try {
                            p();
                            pb1.f();
                            if (wn0Var != null) {
                                Object[] objArr = wn0Var.b;
                                long[] jArr = wn0Var.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    j = 128;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        j2 = 255;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    pb1.q((ge1) objArr[(i3 << 3) + i5]);
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                                break;
                                            }
                                        }
                                        if (i3 == length) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (x != null) {
                                        Object[] objArr2 = x.b;
                                        long[] jArr2 = x.a;
                                        int length2 = jArr2.length - 2;
                                        if (length2 >= 0) {
                                            int i6 = 0;
                                            while (true) {
                                                long j5 = jArr2[i6];
                                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                                    for (int i8 = 0; i8 < i7; i8++) {
                                                        if ((j5 & j2) < j) {
                                                            pb1.q((ge1) objArr2[(i6 << 3) + i8]);
                                                        }
                                                        j5 >>= 8;
                                                    }
                                                    if (i7 != 8) {
                                                        break;
                                                    }
                                                }
                                                if (i6 == length2) {
                                                    break;
                                                }
                                                i6++;
                                            }
                                        }
                                    }
                                    arrayList = this.i;
                                    if (arrayList != null) {
                                        int size3 = arrayList.size();
                                        for (int i9 = 0; i9 < size3; i9++) {
                                            pb1.q((ge1) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                }
                            }
                            j = 128;
                            j2 = 255;
                            if (x != null) {
                            }
                            arrayList = this.i;
                            if (arrayList != null) {
                            }
                            this.i = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return kb1.a;
                }
                b();
                x40 x40Var2 = pb1.j;
                wn0 wn0Var2 = x40Var2.h;
                pb1.v(x40Var2, pb1.a);
                if (wn0Var2 == null || !wn0Var2.h()) {
                    list = nvVar;
                    wn0Var = null;
                } else {
                    list = pb1.h;
                    wn0Var = wn0Var2;
                }
                this.m = true;
                if (wn0Var != null) {
                }
                if (x != null) {
                    s61 s61Var22 = new s61(x);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (pb1.c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public wn0 x() {
        return this.h;
    }

    @Override // defpackage.ib1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.e;
    }

    public final ka0 z(long j, wn0 wn0Var, HashMap hashMap, mb1 mb1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        mb1 mb1Var2;
        Object[] objArr;
        long[] jArr;
        mb1 mb1Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        ie1 b;
        mb1 e = d().f(g()).e(this.j);
        Object[] objArr3 = wn0Var.b;
        long[] jArr3 = wn0Var.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            ge1 ge1Var = (ge1) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            ie1 a = ge1Var.a();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            ie1 s = pb1.s(a, j, mb1Var);
                            if (s == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                ie1 s2 = pb1.s(a, g(), e);
                                if (s2 != null && s2.a != 1 && !s.equals(s2)) {
                                    mb1Var3 = e;
                                    ie1 s3 = pb1.s(a, g(), d());
                                    if (s3 == null) {
                                        pb1.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (b = (ie1) hashMap.get(s)) == null) {
                                        b = ge1Var.b(s2, s, s3);
                                    }
                                    if (b == null) {
                                        return new jb1(this);
                                    }
                                    if (!b.equals(s3)) {
                                        if (b.equals(s)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new Pair(ge1Var, s.b(g())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(ge1Var);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!b.equals(s2) ? new Pair(ge1Var, b) : new Pair(ge1Var, s2.b(g())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            mb1Var3 = e;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            mb1Var3 = e;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        e = mb1Var3;
                    }
                    mb1Var2 = e;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    mb1Var2 = e;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList3;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                e = mb1Var2;
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList3.get(i5);
                ge1 ge1Var2 = (ge1) pair.d;
                ie1 ie1Var = (ie1) pair.e;
                ie1Var.a = j;
                synchronized (pb1.c) {
                    ie1Var.b = ge1Var2.a();
                    ge1Var2.d(ie1Var);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                wn0Var.l((ge1) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = CollectionsKt.u(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return kb1.a;
    }
}
