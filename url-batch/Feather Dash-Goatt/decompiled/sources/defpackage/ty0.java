package defpackage;

import android.os.Trace;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ty0 implements af0 {
    public final int d;
    public final i8 e;
    public final Function1 g;
    public mm h;
    public bf1 i;
    public wd0 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public Object n;
    public boolean o;
    public sy0 p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public boolean u;
    public final /* synthetic */ nz v;

    public ty0(nz nzVar, int i, i8 i8Var, q1 q1Var) {
        this.v = nzVar;
        this.d = i;
        this.e = i8Var;
        this.g = q1Var;
        ki1.a.getClass();
        hm0.a.getClass();
        this.t = System.nanoTime() - hm0.b;
    }

    public final void a() {
        wd0 wd0Var = this.j;
        if (wd0Var != null) {
            switch (wd0Var.a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    break;
                default:
                    pd0 b = wd0Var.b();
                    if ((b != null ? b.f : null) != null) {
                        xd0.b(wd0Var.b, wd0Var.c);
                        break;
                    }
                    break;
            }
        }
        this.j = null;
        bf1 bf1Var = this.i;
        if (bf1Var != null) {
            bf1Var.a();
        }
        this.i = null;
        this.p = null;
    }

    public final boolean b(g6 g6Var) {
        boolean c;
        if (!this.v.a) {
            return false;
        }
        if (this.q) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                c = c(g6Var);
            } finally {
                Trace.endSection();
            }
        } else {
            c = c(g6Var);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0239 A[Catch: all -> 0x0258, LOOP:2: B:96:0x020d->B:106:0x0239, LOOP_END, TRY_ENTER, TryCatch #2 {all -> 0x0258, blocks: (B:84:0x0178, B:86:0x0180, B:88:0x0186, B:91:0x0194, B:93:0x01a1, B:94:0x0200, B:95:0x0206, B:96:0x020d, B:98:0x0215, B:103:0x0226, B:104:0x022b, B:106:0x0239, B:113:0x023f, B:115:0x01a9, B:117:0x01b8, B:118:0x01be, B:123:0x01ce, B:127:0x01ed, B:128:0x01dc, B:131:0x01f4), top: B:83:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(g6 g6Var) {
        long j;
        boolean z;
        Function1 function1;
        ?? r9;
        int i;
        List list;
        int i2;
        int i3;
        boolean z2;
        bf1 f;
        int i4 = this.d;
        long j2 = i4;
        Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
        mf0 mf0Var = (mf0) ((pe0) this.v.b).b.invoke();
        if (!this.l) {
            int c = mf0Var.c();
            if (i4 >= 0 && i4 < c) {
                Object d = mf0Var.d(i4);
                Object obj = this.n;
                if (obj != null && !d.equals(obj)) {
                    a();
                    return false;
                }
                Object b = mf0Var.b(i4);
                i8 i8Var = this.e;
                hc hcVar = (hc) i8Var.h;
                if (i8Var.g != b || hcVar == null) {
                    vn0 vn0Var = (vn0) i8Var.e;
                    Object g = vn0Var.g(b);
                    Object obj2 = g;
                    if (g == null) {
                        hc hcVar2 = new hc();
                        hcVar2.e = -1;
                        vn0Var.m(b, hcVar2);
                        obj2 = hcVar2;
                    }
                    hcVar = (hc) obj2;
                    i8Var.g = b;
                    i8Var.h = hcVar;
                }
                d();
                long a = g6Var.a();
                this.r = a;
                ki1.a.getClass();
                hm0.a.getClass();
                this.t = System.nanoTime() - hm0.b;
                this.s = 0L;
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", a);
                if (d()) {
                    j = 0;
                } else {
                    j = 0;
                    if (i(this.r, hcVar.a + hcVar.b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            g(d, b, hcVar);
                        } finally {
                        }
                    }
                    if (!d()) {
                        return true;
                    }
                }
                Function1 function12 = null;
                if (this.j != null) {
                    if (!i(this.r, hcVar.c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        wd0 wd0Var = this.j;
                        if (wd0Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (wd0Var.a) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                f = wd0Var.b.f(wd0Var.c);
                                break;
                            default:
                                xd0 xd0Var = wd0Var.b;
                                pd0 b2 = wd0Var.b();
                                if (b2 != null) {
                                    xd0Var.d(b2, false);
                                }
                                f = xd0Var.f(wd0Var.c);
                                break;
                        }
                        this.i = f;
                        this.j = null;
                        this.m = true;
                        Trace.endSection();
                        j();
                        hcVar.c = hc.a(this.s, hcVar.c);
                    } finally {
                    }
                }
                if (!this.o) {
                    if (this.r <= j) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.p = h();
                        this.o = true;
                    } finally {
                    }
                }
                sy0 sy0Var = this.p;
                if (sy0Var != null) {
                    int i5 = hcVar.e;
                    boolean z3 = this.q;
                    List[] listArr = sy0Var.b;
                    int i6 = sy0Var.c;
                    List list2 = sy0Var.a;
                    if (i6 < list2.size()) {
                        if (sy0Var.f.l) {
                            r80.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i7 = 0; i7 < size; i7++) {
                                ((bf0) list2.get(i7)).d = i5;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (sy0Var.c < list2.size()) {
                                try {
                                    if (listArr[sy0Var.c] != null) {
                                        z = z3;
                                        function1 = function12;
                                    } else {
                                        if (g6Var.a() <= j) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i8 = sy0Var.c;
                                        bf0 bf0Var = (bf0) list2.get(i8);
                                        tf0 tf0Var = bf0Var.a;
                                        if (tf0Var == null) {
                                            list = nv.d;
                                            i = i8;
                                            z = z3;
                                            function1 = function12;
                                        } else {
                                            int i9 = bf0Var.d;
                                            ArrayList arrayList = new ArrayList();
                                            int i10 = tf0Var.d;
                                            ib1 n = ca0.n();
                                            if (n != null) {
                                                function12 = n.e();
                                            }
                                            ca0.u(n, ca0.s(n), function12);
                                            if (i9 == -1) {
                                                i9 = 2;
                                            }
                                            int i11 = 0;
                                            while (i11 < i9) {
                                                int i12 = i10 + i11;
                                                nz nzVar = bf0Var.c;
                                                if (nzVar == null) {
                                                    i2 = i11;
                                                    i3 = i8;
                                                    z2 = z3;
                                                } else {
                                                    i2 = i11;
                                                    i3 = i8;
                                                    z2 = z3;
                                                    arrayList.add(new ty0(nzVar, i12, bf0Var.b, null));
                                                }
                                                i11 = i2 + 1;
                                                i8 = i3;
                                                z3 = z2;
                                            }
                                            i = i8;
                                            z = z3;
                                            function1 = null;
                                            bf0Var.f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i] = list;
                                    }
                                    List list3 = listArr[sy0Var.c];
                                    list3.getClass();
                                    while (sy0Var.d < list3.size()) {
                                        ty0 ty0Var = (ty0) list3.get(sy0Var.d);
                                        if (z) {
                                            ty0 ty0Var2 = ty0Var != null ? ty0Var : function1;
                                            if (ty0Var2 != 0) {
                                                r9 = 1;
                                                ty0Var2.q = true;
                                                sy0Var.e = r9;
                                                if (!ty0Var.b(g6Var)) {
                                                    return r9;
                                                }
                                                sy0Var.d += r9;
                                            }
                                        }
                                        r9 = 1;
                                        sy0Var.e = r9;
                                        if (!ty0Var.b(g6Var)) {
                                        }
                                    }
                                    sy0Var.d = 0;
                                    sy0Var.c++;
                                    function12 = function1;
                                    z3 = z;
                                    j = 0;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                sy0 sy0Var2 = this.p;
                if (sy0Var2 != null && sy0Var2.e) {
                    j();
                    Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
                    sy0 sy0Var3 = this.p;
                    if (sy0Var3 != null) {
                        sy0Var3.e = false;
                    }
                }
                mm mmVar = this.h;
                if (!this.k && mmVar != null) {
                    if (!i(this.r, hcVar.d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        f(mmVar.a);
                        Trace.endSection();
                        j();
                        hcVar.d = hc.a(this.s, hcVar.d);
                        Function1 function13 = this.g;
                        if (function13 != null) {
                            function13.invoke(this);
                        }
                    } finally {
                    }
                }
                sy0 sy0Var4 = this.p;
                if (!this.k || !this.o || sy0Var4 == null) {
                    return false;
                }
                List list4 = sy0Var4.a;
                int size2 = list4.size();
                int i13 = Integer.MAX_VALUE;
                for (int i14 = 0; i14 < size2; i14++) {
                    i13 = Math.min(i13, ((bf0) list4.get(i14)).e);
                }
                int i15 = i13 == Integer.MAX_VALUE ? 0 : i13;
                int i16 = hcVar.e;
                hcVar.e = i16 == -1 ? i15 : ((i16 * 3) + i15) / 4;
                int size3 = list4.size();
                int i17 = Integer.MAX_VALUE;
                for (int i18 = 0; i18 < size3; i18++) {
                    i17 = Math.min(i17, ((bf0) list4.get(i18)).f);
                }
                if (i17 == Integer.MAX_VALUE) {
                    i17 = 0;
                }
                if (i17 >= i15) {
                    return false;
                }
                hcVar.d = 0L;
                return false;
            }
        }
        a();
        return false;
    }

    @Override // defpackage.af0
    public final void cancel() {
        if (this.l) {
            return;
        }
        this.l = true;
        a();
    }

    public final boolean d() {
        wd0 wd0Var;
        return this.m || ((wd0Var = this.j) != null && wd0Var.c());
    }

    @Override // defpackage.af0
    public final void e() {
        this.q = true;
    }

    public final void f(long j) {
        if (this.l) {
            r80.a("Callers should check whether the request is still valid before calling performMeasure()");
        }
        if (this.k) {
            r80.a("Request was already measured!");
        }
        this.k = true;
        bf1 bf1Var = this.i;
        if (bf1Var == null) {
            r80.b("performComposition() must be called before performMeasure()");
            throw new kc0();
        }
        int b = bf1Var.b();
        for (int i = 0; i < b; i++) {
            bf1Var.c(i, j);
        }
    }

    public final void g(Object obj, Object obj2, hc hcVar) {
        wd0 wd0Var;
        wd0 wd0Var2 = this.j;
        int i = 0;
        int i2 = 1;
        if (wd0Var2 == null) {
            nz nzVar = this.v;
            Function2 a = ((pe0) nzVar.b).a(obj, this.d, obj2);
            xd0 a2 = ((df1) nzVar.c).a();
            if (a2.d.F()) {
                a2.k(obj, a, true);
                wd0Var = new wd0(a2, obj, i2);
            } else {
                wd0Var = new wd0(a2, obj, i);
            }
            wd0Var2 = wd0Var;
            this.j = wd0Var2;
            this.n = obj;
        }
        this.u = false;
        while (!wd0Var2.c() && !this.u) {
            bk bkVar = new bk(this, 3, hcVar);
            switch (wd0Var2.a) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    break;
                default:
                    pd0 b = wd0Var2.b();
                    cw0 cw0Var = b != null ? b.f : null;
                    if (cw0Var != null && !cw0Var.c()) {
                        xd0 xd0Var = wd0Var2.b;
                        ib1 n = ca0.n();
                        Function1 e = n != null ? n.e() : null;
                        ib1 s = ca0.s(n);
                        try {
                            jd0 jd0Var = xd0Var.d;
                            jd0Var.v = true;
                            try {
                                cw0Var.e(bkVar);
                                jd0Var.v = false;
                                break;
                            } finally {
                            }
                        } finally {
                            ca0.u(n, s, e);
                        }
                    }
                    break;
            }
        }
        j();
        boolean z = this.u;
        long j = this.s;
        if (z) {
            hcVar.b = hc.a(j, hcVar.b);
        } else {
            hcVar.a = hc.a(j, hcVar.a);
        }
    }

    public final sy0 h() {
        bf1 bf1Var = this.i;
        if (bf1Var == null) {
            r80.b("Should precompose before resolving nested prefetch states");
            throw new kc0();
        }
        z11 z11Var = new z11();
        bf1Var.d(new l(14, z11Var));
        List list = (List) z11Var.d;
        if (list != null) {
            return new sy0(this, list);
        }
        return null;
    }

    public final boolean i(long j, long j2) {
        if (this.q) {
            j2 = 0;
        }
        return j > j2;
    }

    public final void j() {
        ki1.a.getClass();
        hm0 hm0Var = hm0.a;
        hm0Var.getClass();
        long nanoTime = System.nanoTime() - hm0.b;
        long j = this.t;
        hm0Var.getClass();
        nu nuVar = nu.NANOSECONDS;
        long j2 = 0;
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime == j) {
                ku.d.getClass();
            } else {
                long A = gb0.A(j);
                ju juVar = ku.d;
                j2 = ((-(A >> 1)) << 1) + (((int) A) & 1);
                int i = mu.a;
            }
        } else if (((nanoTime - 1) | 1) == Long.MAX_VALUE) {
            j2 = gb0.A(nanoTime);
        } else {
            long j3 = nanoTime - j;
            if (((j3 ^ nanoTime) & (~(j3 ^ j))) < 0) {
                nu nuVar2 = nu.MILLISECONDS;
                if (nuVar.compareTo(nuVar2) < 0) {
                    long j4 = (nanoTime / 1000000) - (j / 1000000);
                    long j5 = (nanoTime % 1000000) - (j % 1000000);
                    ju juVar2 = ku.d;
                    long H = mo.H(j4, nuVar2);
                    long H2 = mo.H(j5, nuVar);
                    if (ku.b(H)) {
                        if (ku.b(H2) && (H2 ^ H) < 0) {
                            dd0.e("Summing infinite durations of different signs yields an undefined result.");
                            return;
                        }
                        j2 = H;
                    } else if (ku.b(H2)) {
                        j2 = H2;
                    } else {
                        int i2 = ((int) H) & 1;
                        if (i2 == (((int) H2) & 1)) {
                            long j6 = (H >> 1) + (H2 >> 1);
                            if (i2 == 0) {
                                if (-4611686018426999999L > j6 || j6 >= 4611686018427000000L) {
                                    j2 = mo.m(j6 / 1000000);
                                } else {
                                    j2 = j6 << 1;
                                    int i3 = mu.a;
                                }
                            } else if (-4611686018426L > j6 || j6 >= 4611686018427L) {
                                j2 = mo.m(b11.d(j6));
                            } else {
                                j2 = (j6 * 1000000) << 1;
                                int i4 = mu.a;
                            }
                        } else {
                            j2 = i2 == 1 ? ku.a(H >> 1, H2 >> 1) : ku.a(H2 >> 1, H >> 1);
                        }
                    }
                } else {
                    long A2 = gb0.A(j3);
                    ju juVar3 = ku.d;
                    j2 = ((-(A2 >> 1)) << 1) + (((int) A2) & 1);
                    int i5 = mu.a;
                }
            } else {
                j2 = mo.H(j3, nuVar);
            }
        }
        long j7 = j2 >> 1;
        ju juVar4 = ku.d;
        long j8 = (((int) j2) & 1) == 0 ? j7 : j7 > 9223372036854L ? Long.MAX_VALUE : j7 < -9223372036854L ? Long.MIN_VALUE : j7 * 1000000;
        this.s = j8;
        long j9 = this.r - j8;
        this.r = j9;
        this.t = nanoTime;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j9);
    }

    public final String toString() {
        return "HandleAndRequestImpl { index = " + this.d + ", constraints = " + this.h + ", isComposed = " + d() + ", isMeasured = " + this.k + ", isCanceled = " + this.l + " }";
    }
}
