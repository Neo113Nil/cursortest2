package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class yn1 extends nm2 {
    public static final int[] n = new int[0];
    public final Function1 e;
    public final Function1 f;
    public int g;
    public un1 h;
    public ArrayList i;
    public rm2 j;
    public int[] k;
    public int l;
    public boolean m;

    public yn1(long j, rm2 rm2Var, Function1 function1, Function1 function12) {
        super(j, rm2Var);
        this.e = function1;
        this.f = function12;
        this.j = rm2.q;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (tm2.c) {
            this.j = this.j.e(j);
            Unit unit = Unit.a;
        }
    }

    public void B(un1 un1Var) {
        this.h = un1Var;
    }

    public yn1 C(Function1 function1, Function1 function12) {
        fr1 fr1Var;
        if (this.c) {
            v32.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            v32.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = tm2.c;
        synchronized (obj) {
            long j = tm2.e;
            tm2.e = j + 1;
            tm2.d = tm2.d.e(j);
            rm2 d = d();
            r(d.e(j));
            fr1Var = new fr1(j, tm2.e(d, g() + 1, j), tm2.l(function1, e(), true), tm2.b(function12, i()), this);
        }
        if (this.m || this.c) {
            return fr1Var;
        }
        long g = g();
        synchronized (obj) {
            long j2 = tm2.e;
            tm2.e = j2 + 1;
            s(j2);
            tm2.d = tm2.d.e(g());
            Unit unit = Unit.a;
        }
        r(tm2.e(d(), g + 1, g()));
        return fr1Var;
    }

    @Override // defpackage.nm2
    public final void b() {
        tm2.d = tm2.d.b(g()).a(this.j);
    }

    @Override // defpackage.nm2
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        l();
    }

    @Override // defpackage.nm2
    public boolean f() {
        return false;
    }

    @Override // defpackage.nm2
    public int h() {
        return this.g;
    }

    @Override // defpackage.nm2
    public Function1 i() {
        return this.f;
    }

    @Override // defpackage.nm2
    public void k() {
        this.l++;
    }

    @Override // defpackage.nm2
    public void l() {
        if (this.l <= 0) {
            v32.a("no pending nested snapshots");
        }
        int i = this.l - 1;
        this.l = i;
        if (i != 0 || this.m) {
            return;
        }
        un1 x = x();
        if (x != null) {
            if (this.m) {
                v32.b("Unsupported operation on a snapshot that has been applied");
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
                                for (ap2 a = ((yo2) objArr[(i2 << 3) + i4]).a(); a != null; a = a.b) {
                                    long j2 = a.a;
                                    if (j2 == g || zv.q(this.j, Long.valueOf(j2))) {
                                        de2 de2Var = tm2.a;
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

    @Override // defpackage.nm2
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.nm2
    public void n(yo2 yo2Var) {
        un1 x = x();
        if (x == null) {
            int i = pe2.a;
            x = new un1();
            B(x);
        }
        x.a(yo2Var);
    }

    @Override // defpackage.nm2
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            tm2.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.nm2
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.nm2
    public nm2 u(Function1 function1) {
        gr1 gr1Var;
        if (this.c) {
            v32.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            v32.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g = g();
        A(g());
        Object obj = tm2.c;
        synchronized (obj) {
            long j = tm2.e;
            tm2.e = j + 1;
            tm2.d = tm2.d.e(j);
            gr1Var = new gr1(j, tm2.e(d(), g + 1, j), tm2.l(function1, e(), true), this);
        }
        if (this.m || this.c) {
            return gr1Var;
        }
        long g2 = g();
        synchronized (obj) {
            long j2 = tm2.e;
            tm2.e = j2 + 1;
            s(j2);
            tm2.d = tm2.d.e(g());
            Unit unit = Unit.a;
        }
        r(tm2.e(d(), g2 + 1, g()));
        return gr1Var;
    }

    public final void v() {
        A(g());
        Unit unit = Unit.a;
        if (this.m || this.c) {
            return;
        }
        long g = g();
        synchronized (tm2.c) {
            long j = tm2.e;
            tm2.e = j + 1;
            s(j);
            tm2.d = tm2.d.e(g());
        }
        r(tm2.e(d(), g + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad A[LOOP:1: B:32:0x00ab->B:33:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:38:0x00bc, B:40:0x00cc, B:43:0x00d8, B:45:0x00e4, B:47:0x00ee, B:49:0x00f4, B:51:0x0103, B:57:0x0114, B:60:0x011e, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x0142, B:74:0x014a, B:76:0x014d, B:78:0x0151, B:80:0x0158, B:82:0x0164, B:88:0x010b), top: B:37:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:38:0x00bc, B:40:0x00cc, B:43:0x00d8, B:45:0x00e4, B:47:0x00ee, B:49:0x00f4, B:51:0x0103, B:57:0x0114, B:60:0x011e, B:62:0x0128, B:64:0x0132, B:66:0x0138, B:68:0x0142, B:74:0x014a, B:76:0x014d, B:78:0x0151, B:80:0x0158, B:82:0x0164, B:88:0x010b), top: B:37:0x00bc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mi2 w() {
        HashMap hashMap;
        List list;
        un1 un1Var;
        long j;
        long j2;
        ArrayList arrayList;
        int size;
        int i;
        un1 x = x();
        if (x != null) {
            long j3 = tm2.j.b;
            hashMap = tm2.c(j3, this, tm2.d.b(j3));
        } else {
            hashMap = null;
        }
        ah0 ah0Var = ah0.m;
        synchronized (tm2.c) {
            try {
                tm2.d(this);
                if (x != null && x.d != 0) {
                    mv0 mv0Var = tm2.j;
                    mi2 z = z(tm2.e, x, hashMap, tm2.d.b(mv0Var.b));
                    if (!z.equals(pm2.a)) {
                        return z;
                    }
                    b();
                    un1Var = mv0Var.h;
                    tm2.v(mv0Var, tm2.a);
                    B(null);
                    mv0Var.h = null;
                    list = tm2.h;
                    Unit unit = Unit.a;
                    this.m = true;
                    if (un1Var != null) {
                        qe2 qe2Var = new qe2(un1Var);
                        if (!un1Var.g()) {
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                ((Function2) list.get(i2)).invoke(qe2Var, this);
                            }
                        }
                    }
                    if (x != null && x.h()) {
                        qe2 qe2Var2 = new qe2(x);
                        size = list.size();
                        for (i = 0; i < size; i++) {
                            ((Function2) list.get(i)).invoke(qe2Var2, this);
                        }
                    }
                    synchronized (tm2.c) {
                        try {
                            p();
                            tm2.g();
                            if (un1Var != null) {
                                Object[] objArr = un1Var.b;
                                long[] jArr = un1Var.a;
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
                                                    tm2.q((yo2) objArr[(i3 << 3) + i5]);
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
                                                            tm2.q((yo2) objArr2[(i6 << 3) + i8]);
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
                                            tm2.q((yo2) arrayList.get(i9));
                                        }
                                    }
                                    this.i = null;
                                    Unit unit2 = Unit.a;
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
                            Unit unit22 = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return pm2.a;
                }
                b();
                mv0 mv0Var2 = tm2.j;
                un1 un1Var2 = mv0Var2.h;
                tm2.v(mv0Var2, tm2.a);
                if (un1Var2 == null || !un1Var2.h()) {
                    list = ah0Var;
                    un1Var = null;
                } else {
                    list = tm2.h;
                    un1Var = un1Var2;
                }
                Unit unit3 = Unit.a;
                this.m = true;
                if (un1Var != null) {
                }
                if (x != null) {
                    qe2 qe2Var22 = new qe2(x);
                    size = list.size();
                    while (i < size) {
                    }
                }
                synchronized (tm2.c) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public un1 x() {
        return this.h;
    }

    @Override // defpackage.nm2
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1 e() {
        return this.e;
    }

    public final mi2 z(long j, un1 un1Var, HashMap hashMap, rm2 rm2Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        rm2 rm2Var2;
        Object[] objArr;
        long[] jArr;
        rm2 rm2Var3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList4;
        ap2 b;
        rm2 d = d().e(g()).d(this.j);
        Object[] objArr3 = un1Var.b;
        long[] jArr3 = un1Var.a;
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
                            yo2 yo2Var = (yo2) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            ap2 a = yo2Var.a();
                            i = i4;
                            ArrayList arrayList5 = arrayList3;
                            ap2 s = tm2.s(a, j, rm2Var);
                            if (s == null) {
                                arrayList4 = arrayList2;
                                j2 = j3;
                            } else {
                                arrayList4 = arrayList2;
                                j2 = j3;
                                ap2 s2 = tm2.s(a, g(), d);
                                if (s2 != null && s2.a != 1 && !s.equals(s2)) {
                                    rm2Var3 = d;
                                    ap2 s3 = tm2.s(a, g(), d());
                                    if (s3 == null) {
                                        tm2.r();
                                        throw null;
                                    }
                                    if (hashMap == null || (b = (ap2) hashMap.get(s)) == null) {
                                        b = yo2Var.b(s2, s, s3);
                                    }
                                    if (b == null) {
                                        return new om2();
                                    }
                                    if (!b.equals(s3)) {
                                        if (b.equals(s)) {
                                            ArrayList arrayList6 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList6.add(new Pair(yo2Var, s.b(g())));
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(yo2Var);
                                            arrayList3 = arrayList6;
                                        } else {
                                            arrayList3 = arrayList5 == null ? new ArrayList() : arrayList5;
                                            arrayList3.add(!b.equals(s2) ? new Pair(yo2Var, b) : new Pair(yo2Var, s2.b(g())));
                                            arrayList2 = arrayList4;
                                        }
                                    }
                                    arrayList3 = arrayList5;
                                    arrayList2 = arrayList4;
                                }
                            }
                            rm2Var3 = d;
                            arrayList3 = arrayList5;
                            arrayList2 = arrayList4;
                        } else {
                            rm2Var3 = d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        d = rm2Var3;
                    }
                    rm2Var2 = d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    rm2Var2 = d;
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
                d = rm2Var2;
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
                yo2 yo2Var2 = (yo2) pair.m;
                ap2 ap2Var = (ap2) pair.n;
                ap2Var.a = j;
                synchronized (tm2.c) {
                    ap2Var.b = yo2Var2.a();
                    yo2Var2.d(ap2Var);
                    Unit unit = Unit.a;
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                un1Var.k((yo2) arrayList2.get(i6));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = zv.E(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return pm2.a;
    }
}
