package m0;

import E1.P;
import T.C0097o;
import T.U;
import W.J;
import a.AbstractC0124a;
import a0.Q;
import a0.p0;
import android.net.Uri;
import android.os.Handler;
import androidx.datastore.preferences.protobuf.C0179l;
import d2.C0389g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.SocketFactory;
import q0.InterfaceC1382y;
import q0.InterfaceC1383z;
import q0.b0;
import q0.j0;
import v2.a0;
import v2.f0;

/* loaded from: classes.dex */
public final class r implements InterfaceC1383z {

    /* renamed from: a, reason: collision with root package name */
    public final B1.j f14434a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f14435b = J.o(null);

    /* renamed from: c, reason: collision with root package name */
    public final d0.g f14436c;

    /* renamed from: d, reason: collision with root package name */
    public final C1300m f14437d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f14438e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f14439f;

    /* renamed from: g, reason: collision with root package name */
    public final e0.t f14440g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1290c f14441h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1382y f14442i;

    /* renamed from: j, reason: collision with root package name */
    public a0 f14443j;

    /* renamed from: k, reason: collision with root package name */
    public IOException f14444k;

    /* renamed from: l, reason: collision with root package name */
    public C0179l f14445l;

    /* renamed from: m, reason: collision with root package name */
    public long f14446m;
    public long n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14447p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14448q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14449r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14450s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14451t;

    /* renamed from: u, reason: collision with root package name */
    public int f14452u;
    public boolean v;

    public r(B1.j jVar, InterfaceC1290c interfaceC1290c, Uri uri, e0.t tVar, String str, SocketFactory socketFactory) {
        this.f14434a = jVar;
        this.f14441h = interfaceC1290c;
        this.f14440g = tVar;
        d0.g gVar = new d0.g(1, this);
        this.f14436c = gVar;
        this.f14437d = new C1300m(gVar, gVar, str, uri, socketFactory);
        this.f14438e = new ArrayList();
        this.f14439f = new ArrayList();
        this.n = -9223372036854775807L;
        this.f14446m = -9223372036854775807L;
        this.o = -9223372036854775807L;
    }

    public static void a(r rVar) {
        ArrayList arrayList = rVar.f14438e;
        rVar.f14447p = true;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            rVar.f14447p &= ((q) arrayList.get(i4)).f14431d;
        }
    }

    public static void c(r rVar) {
        ArrayList arrayList = rVar.f14438e;
        if (rVar.f14449r || rVar.f14450s) {
            return;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            if (((q) arrayList.get(i5)).f14430c.w() == null) {
                return;
            }
        }
        rVar.f14450s = true;
        v2.I k4 = v2.I.k(arrayList);
        v2.r.d(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i6 = 0;
        while (i4 < k4.size()) {
            q0.a0 a0Var = ((q) k4.get(i4)).f14430c;
            String num = Integer.toString(i4);
            C0097o w4 = a0Var.w();
            w4.getClass();
            U u4 = new U(num, w4);
            int i7 = i6 + 1;
            int e4 = v2.C.e(objArr.length, i7);
            if (e4 > objArr.length) {
                objArr = Arrays.copyOf(objArr, e4);
            }
            objArr[i6] = u4;
            i4++;
            i6 = i7;
        }
        rVar.f14443j = v2.I.i(i6, objArr);
        InterfaceC1382y interfaceC1382y = rVar.f14442i;
        interfaceC1382y.getClass();
        interfaceC1382y.m(rVar);
    }

    public static void g(r rVar) {
        ArrayList arrayList = rVar.f14439f;
        ArrayList arrayList2 = rVar.f14438e;
        rVar.v = true;
        C1300m c1300m = rVar.f14437d;
        c1300m.getClass();
        try {
            c1300m.close();
            y yVar = new y(new C0389g(c1300m));
            c1300m.f14412i = yVar;
            yVar.a(c1300m.e(c1300m.f14411h));
            c1300m.f14414k = null;
            c1300m.f14418q = false;
            c1300m.n = null;
        } catch (IOException e4) {
            c1300m.f14405b.c(new C0179l(e4));
        }
        InterfaceC1290c b4 = rVar.f14441h.b();
        if (b4 == null) {
            rVar.f14445l = new C0179l("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        ArrayList arrayList4 = new ArrayList(arrayList.size());
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            q qVar = (q) arrayList2.get(i4);
            boolean z = qVar.f14431d;
            p pVar = qVar.f14428a;
            if (z) {
                arrayList3.add(qVar);
            } else {
                q qVar2 = new q(rVar, pVar.f14424a, i4, b4);
                arrayList3.add(qVar2);
                p pVar2 = qVar2.f14428a;
                qVar2.f14429b.f(pVar2.f14425b, rVar.f14436c, 0);
                if (arrayList.contains(pVar)) {
                    arrayList4.add(pVar2);
                }
            }
        }
        v2.I k4 = v2.I.k(arrayList2);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        arrayList.clear();
        arrayList.addAll(arrayList4);
        for (int i5 = 0; i5 < k4.size(); i5++) {
            ((q) k4.get(i5)).a();
        }
    }

    @Override // q0.InterfaceC1383z
    public final long d(t0.t[] tVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j4) {
        ArrayList arrayList;
        for (int i4 = 0; i4 < tVarArr.length; i4++) {
            if (b0VarArr[i4] != null && (tVarArr[i4] == null || !zArr[i4])) {
                b0VarArr[i4] = null;
            }
        }
        ArrayList arrayList2 = this.f14439f;
        arrayList2.clear();
        int i5 = 0;
        while (true) {
            int length = tVarArr.length;
            arrayList = this.f14438e;
            if (i5 >= length) {
                break;
            }
            t0.t tVar = tVarArr[i5];
            if (tVar != null) {
                U c4 = tVar.c();
                a0 a0Var = this.f14443j;
                a0Var.getClass();
                int indexOf = a0Var.indexOf(c4);
                q qVar = (q) arrayList.get(indexOf);
                qVar.getClass();
                arrayList2.add(qVar.f14428a);
                if (this.f14443j.contains(c4) && b0VarArr[i5] == null) {
                    b0VarArr[i5] = new P(indexOf, 8, this);
                    zArr2[i5] = true;
                }
            }
            i5++;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            q qVar2 = (q) arrayList.get(i6);
            if (!arrayList2.contains(qVar2.f14428a)) {
                qVar2.a();
            }
        }
        this.f14451t = true;
        if (j4 != 0) {
            this.f14446m = j4;
            this.n = j4;
            this.o = j4;
        }
        m();
        return j4;
    }

    @Override // q0.d0
    public final long e() {
        return u();
    }

    @Override // q0.InterfaceC1383z
    public final void f(InterfaceC1382y interfaceC1382y, long j4) {
        C1300m c1300m = this.f14437d;
        this.f14442i = interfaceC1382y;
        try {
            c1300m.getClass();
            try {
                c1300m.f14412i.a(c1300m.e(c1300m.f14411h));
                L3.h hVar = c1300m.f14410g;
                hVar.g(hVar.c(4, c1300m.f14414k, f0.f15629g, c1300m.f14411h));
            } catch (IOException e4) {
                J.h(c1300m.f14412i);
                throw e4;
            }
        } catch (IOException e5) {
            this.f14444k = e5;
            J.h(c1300m);
        }
    }

    @Override // q0.InterfaceC1383z
    public final void h() {
        IOException iOException = this.f14444k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // q0.InterfaceC1383z
    public final long i(long j4) {
        if (u() == 0 && !this.v) {
            this.o = j4;
            return j4;
        }
        j(j4);
        this.f14446m = j4;
        if (k()) {
            C1300m c1300m = this.f14437d;
            int i4 = c1300m.o;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException();
                }
                this.n = j4;
                c1300m.f(j4);
                return j4;
            }
        } else {
            ArrayList arrayList = this.f14438e;
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                if (((q) arrayList.get(i5)).f14430c.G(j4, this.f14447p)) {
                    i5++;
                } else {
                    this.n = j4;
                    if (this.f14447p) {
                        for (int i6 = 0; i6 < this.f14438e.size(); i6++) {
                            q qVar = (q) this.f14438e.get(i6);
                            AbstractC0124a.t(qVar.f14431d);
                            qVar.f14431d = false;
                            a(qVar.f14433f);
                            qVar.f14429b.f(qVar.f14428a.f14425b, qVar.f14433f.f14436c, 0);
                        }
                        if (this.v) {
                            this.f14437d.k(J.Z(j4));
                        } else {
                            this.f14437d.f(j4);
                        }
                    } else {
                        this.f14437d.f(j4);
                    }
                    for (int i7 = 0; i7 < this.f14438e.size(); i7++) {
                        q qVar2 = (q) this.f14438e.get(i7);
                        if (!qVar2.f14431d) {
                            C1293f c1293f = qVar2.f14428a.f14425b.f14358h;
                            c1293f.getClass();
                            synchronized (c1293f.f14367e) {
                                c1293f.f14373k = true;
                            }
                            qVar2.f14430c.E(false);
                            qVar2.f14430c.f14976t = j4;
                        }
                    }
                }
            }
        }
        return j4;
    }

    @Override // q0.InterfaceC1383z
    public final void j(long j4) {
        if (k()) {
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f14438e;
            if (i4 >= arrayList.size()) {
                return;
            }
            q qVar = (q) arrayList.get(i4);
            if (!qVar.f14431d) {
                qVar.f14430c.j(j4, true);
            }
            i4++;
        }
    }

    public final boolean k() {
        return this.n != -9223372036854775807L;
    }

    @Override // q0.d0
    public final boolean l() {
        if (this.f14447p) {
            return false;
        }
        int i4 = this.f14437d.o;
        return i4 == 2 || i4 == 1;
    }

    public final void m() {
        ArrayList arrayList;
        boolean z = true;
        int i4 = 0;
        while (true) {
            arrayList = this.f14439f;
            if (i4 >= arrayList.size()) {
                break;
            }
            z &= ((p) arrayList.get(i4)).f14426c != null;
            i4++;
        }
        if (z && this.f14451t) {
            C1300m c1300m = this.f14437d;
            c1300m.f14408e.addAll(arrayList);
            c1300m.b();
        }
    }

    @Override // q0.InterfaceC1383z
    public final long q() {
        if (!this.f14448q) {
            return -9223372036854775807L;
        }
        this.f14448q = false;
        return 0L;
    }

    @Override // q0.InterfaceC1383z
    public final j0 t() {
        AbstractC0124a.t(this.f14450s);
        a0 a0Var = this.f14443j;
        a0Var.getClass();
        return new j0((U[]) a0Var.toArray(new U[0]));
    }

    @Override // q0.d0
    public final long u() {
        if (!this.f14447p) {
            ArrayList arrayList = this.f14438e;
            if (!arrayList.isEmpty()) {
                long j4 = this.f14446m;
                if (j4 != -9223372036854775807L) {
                    return j4;
                }
                boolean z = true;
                long j5 = Long.MAX_VALUE;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    q qVar = (q) arrayList.get(i4);
                    if (!qVar.f14431d) {
                        j5 = Math.min(j5, qVar.f14430c.q());
                        z = false;
                    }
                }
                if (z || j5 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q0.d0
    public final boolean v(Q q4) {
        return l();
    }

    @Override // q0.d0
    public final void w(long j4) {
    }

    @Override // q0.InterfaceC1383z
    public final long b(long j4, p0 p0Var) {
        return j4;
    }
}
