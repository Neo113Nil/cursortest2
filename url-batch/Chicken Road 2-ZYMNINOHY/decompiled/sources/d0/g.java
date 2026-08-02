package d0;

import Y.z;
import android.net.Uri;
import androidx.datastore.preferences.protobuf.C0179l;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import m0.C1281C;
import m0.C1292e;
import m0.C1293f;
import m0.RunnableC1302o;
import m0.q;
import m0.r;
import m0.t;
import m0.u;
import q0.C1377t;
import q0.Z;
import v0.AbstractC1450b;
import v2.I;

/* loaded from: classes.dex */
public final class g implements u0.i, Z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8129a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8130b;

    public /* synthetic */ g(int i4, Object obj) {
        this.f8129a = i4;
        this.f8130b = obj;
    }

    @Override // q0.Z
    public void a() {
        r rVar = (r) this.f8130b;
        rVar.f14435b.post(new RunnableC1302o(rVar, 1));
    }

    public void c(C0179l c0179l) {
        r rVar = (r) this.f8130b;
        if (!(c0179l instanceof t) || rVar.v) {
            rVar.f14445l = c0179l;
        } else {
            r.g(rVar);
        }
    }

    public void d(long j4, I i4) {
        C1292e c1292e;
        ArrayList arrayList = new ArrayList(i4.size());
        for (int i5 = 0; i5 < i4.size(); i5++) {
            String path = ((C1281C) i4.get(i5)).f14302c.getPath();
            path.getClass();
            arrayList.add(path);
        }
        for (int i6 = 0; i6 < ((r) this.f8130b).f14439f.size(); i6++) {
            if (!arrayList.contains(((m0.p) ((r) this.f8130b).f14439f.get(i6)).f14425b.f14352b.f14462b.getPath())) {
                u uVar = (u) ((r) this.f8130b).f14440g.f8416a;
                uVar.f14459m = false;
                uVar.x();
                if (((r) this.f8130b).k()) {
                    r rVar = (r) this.f8130b;
                    rVar.f14448q = true;
                    rVar.n = -9223372036854775807L;
                    rVar.f14446m = -9223372036854775807L;
                    rVar.o = -9223372036854775807L;
                }
            }
        }
        for (int i7 = 0; i7 < i4.size(); i7++) {
            C1281C c1281c = (C1281C) i4.get(i7);
            r rVar2 = (r) this.f8130b;
            Uri uri = c1281c.f14302c;
            ArrayList arrayList2 = rVar2.f14438e;
            int i8 = 0;
            while (true) {
                if (i8 >= arrayList2.size()) {
                    c1292e = null;
                    break;
                }
                if (!((q) arrayList2.get(i8)).f14431d) {
                    m0.p pVar = ((q) arrayList2.get(i8)).f14428a;
                    if (pVar.f14425b.f14352b.f14462b.equals(uri)) {
                        c1292e = pVar.f14425b;
                        break;
                    }
                }
                i8++;
            }
            if (c1292e != null) {
                long j5 = c1281c.f14300a;
                if (j5 != -9223372036854775807L) {
                    C1293f c1293f = c1292e.f14358h;
                    c1293f.getClass();
                    if (!c1293f.f14370h) {
                        c1292e.f14358h.f14371i = j5;
                    }
                }
                int i9 = c1281c.f14301b;
                C1293f c1293f2 = c1292e.f14358h;
                c1293f2.getClass();
                if (!c1293f2.f14370h) {
                    c1292e.f14358h.f14372j = i9;
                }
                if (((r) this.f8130b).k()) {
                    r rVar3 = (r) this.f8130b;
                    if (rVar3.n == rVar3.f14446m) {
                        long j6 = c1281c.f14300a;
                        c1292e.f14361k = j4;
                        c1292e.f14362l = j6;
                    }
                }
            }
        }
        if (!((r) this.f8130b).k()) {
            r rVar4 = (r) this.f8130b;
            long j7 = rVar4.o;
            if (j7 == -9223372036854775807L || !rVar4.v) {
                return;
            }
            rVar4.i(j7);
            ((r) this.f8130b).o = -9223372036854775807L;
            return;
        }
        r rVar5 = (r) this.f8130b;
        long j8 = rVar5.n;
        long j9 = rVar5.f14446m;
        if (j8 == j9) {
            rVar5.n = -9223372036854775807L;
            rVar5.f14446m = -9223372036854775807L;
        } else {
            rVar5.n = -9223372036854775807L;
            rVar5.i(j9);
        }
    }

    public void e(String str, IOException iOException) {
        ((r) this.f8130b).f14444k = iOException == null ? new IOException(str) : new IOException(str, iOException);
    }

    @Override // u0.i
    public final void g(u0.k kVar, long j4, long j5) {
        boolean z;
        switch (this.f8129a) {
            case 0:
                u0.q qVar = (u0.q) kVar;
                h hVar = (h) this.f8130b;
                long j6 = qVar.f15487a;
                Y.k kVar2 = qVar.f15488b;
                z zVar = qVar.f15490d;
                C1377t c1377t = new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
                hVar.f8151m.getClass();
                hVar.f8153q.d(c1377t, qVar.f15489c);
                hVar.f8141K = ((Long) qVar.f15492f).longValue() - j4;
                hVar.B(true);
                return;
            case 1:
                C1292e c1292e = (C1292e) kVar;
                r rVar = (r) this.f8130b;
                long u4 = rVar.u();
                ArrayList arrayList = rVar.f14438e;
                if (u4 == 0) {
                    if (rVar.v) {
                        return;
                    }
                    r.g(rVar);
                    return;
                }
                int i4 = 0;
                while (true) {
                    if (i4 < arrayList.size()) {
                        q qVar2 = (q) arrayList.get(i4);
                        if (qVar2.f14428a.f14425b == c1292e) {
                            qVar2.a();
                        } else {
                            i4++;
                        }
                    }
                }
                rVar.f14437d.o = 1;
                return;
            default:
                C0377d c0377d = (C0377d) this.f8130b;
                synchronized (AbstractC1450b.f15532b) {
                    z = AbstractC1450b.f15533c;
                }
                if (z) {
                    c0377d.b();
                    return;
                } else {
                    c0377d.f8117a.A(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }

    @Override // u0.i
    public final void m(u0.k kVar, long j4, long j5, boolean z) {
        switch (this.f8129a) {
            case 0:
                ((h) this.f8130b).z((u0.q) kVar, j4, j5);
                break;
            case 1:
                break;
        }
    }

    @Override // u0.i
    public final g1.e p(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        switch (this.f8129a) {
            case 0:
                u0.q qVar = (u0.q) kVar;
                h hVar = (h) this.f8130b;
                f0.e eVar = hVar.f8153q;
                long j6 = qVar.f15487a;
                Y.k kVar2 = qVar.f15488b;
                z zVar = qVar.f15490d;
                eVar.g(new C1377t(kVar2, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b), qVar.f15489c, iOException, true);
                hVar.f8151m.getClass();
                hVar.A(iOException);
                break;
            case 1:
                C1292e c1292e = (C1292e) kVar;
                r rVar = (r) this.f8130b;
                if (!rVar.f14450s) {
                    rVar.f14444k = iOException;
                } else if (iOException.getCause() instanceof BindException) {
                    int i5 = rVar.f14452u;
                    rVar.f14452u = i5 + 1;
                    if (i5 < 3) {
                        break;
                    }
                } else {
                    rVar.f14445l = new C0179l(c1292e.f14352b.f14462b.toString(), iOException);
                }
                break;
            default:
                ((C0377d) this.f8130b).f8117a.A(iOException);
                break;
        }
        return u0.n.f15482e;
    }

    private final void b(u0.k kVar, long j4, long j5, boolean z) {
    }
}
