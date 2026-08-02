package g0;

import T.C0102u;
import T.C0103v;
import T.C0104w;
import T.C0107z;
import W.J;
import Y.A;
import a.AbstractC0124a;
import a0.C0144j;
import android.net.Uri;
import android.os.Looper;
import h0.C0446b;
import h0.C0447c;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import q0.AbstractC1359a;
import q0.C1353B;
import q0.InterfaceC1383z;
import q0.f0;
import t0.C1427b;
import v2.I;

/* loaded from: classes.dex */
public final class m extends AbstractC1359a {

    /* renamed from: h, reason: collision with root package name */
    public final C0435c f8906h;

    /* renamed from: i, reason: collision with root package name */
    public final e0.t f8907i;

    /* renamed from: j, reason: collision with root package name */
    public final C0144j f8908j;

    /* renamed from: k, reason: collision with root package name */
    public final f0.i f8909k;

    /* renamed from: l, reason: collision with root package name */
    public final C1427b f8910l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f8911m;
    public final int n;
    public final C0447c o;

    /* renamed from: p, reason: collision with root package name */
    public final long f8912p;

    /* renamed from: q, reason: collision with root package name */
    public C0103v f8913q;

    /* renamed from: r, reason: collision with root package name */
    public A f8914r;

    /* renamed from: s, reason: collision with root package name */
    public C0107z f8915s;

    static {
        T.A.a("media3.exoplayer.hls");
    }

    public m(C0107z c0107z, e0.t tVar, C0435c c0435c, C0144j c0144j, f0.i iVar, C1427b c1427b, C0447c c0447c, long j4, boolean z, int i4) {
        this.f8915s = c0107z;
        this.f8913q = c0107z.f2901c;
        this.f8907i = tVar;
        this.f8906h = c0435c;
        this.f8908j = c0144j;
        this.f8909k = iVar;
        this.f8910l = c1427b;
        this.o = c0447c;
        this.f8912p = j4;
        this.f8911m = z;
        this.n = i4;
    }

    public static h0.g x(List list, long j4) {
        h0.g gVar = null;
        for (int i4 = 0; i4 < list.size(); i4++) {
            h0.g gVar2 = (h0.g) list.get(i4);
            long j5 = gVar2.f9118e;
            if (j5 > j4 || !gVar2.f9107l) {
                if (j5 > j4) {
                    break;
                }
            } else {
                gVar = gVar2;
            }
        }
        return gVar;
    }

    @Override // q0.AbstractC1359a
    public final InterfaceC1383z b(C1353B c1353b, B1.j jVar, long j4) {
        f0.e a3 = a(c1353b);
        f0.e eVar = new f0.e(this.f14948d.f8493c, 0, c1353b);
        A a4 = this.f8914r;
        b0.i iVar = this.f14951g;
        iVar.getClass();
        return new l(this.f8906h, this.o, this.f8907i, a4, this.f8909k, eVar, this.f8910l, a3, jVar, this.f8908j, this.f8911m, this.n, iVar);
    }

    @Override // q0.AbstractC1359a
    public final synchronized C0107z i() {
        return this.f8915s;
    }

    @Override // q0.AbstractC1359a
    public final void k() {
        C0447c c0447c = this.o;
        u0.n nVar = c0447c.f9060g;
        if (nVar != null) {
            nVar.a();
        }
        Uri uri = c0447c.f9064k;
        if (uri != null) {
            C0446b c0446b = (C0446b) c0447c.f9057d.get(uri);
            c0446b.f9043b.a();
            IOException iOException = c0446b.f9051j;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // q0.AbstractC1359a
    public final void n(A a3) {
        this.f8914r = a3;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        b0.i iVar = this.f14951g;
        iVar.getClass();
        f0.i iVar2 = this.f8909k;
        iVar2.c(myLooper, iVar);
        iVar2.a();
        f0.e a4 = a(null);
        C0104w c0104w = i().f2900b;
        c0104w.getClass();
        Uri uri = c0104w.f2893a;
        C0447c c0447c = this.o;
        c0447c.getClass();
        c0447c.f9061h = J.o(null);
        c0447c.f9059f = a4;
        c0447c.f9062i = this;
        Map map = Collections.EMPTY_MAP;
        AbstractC0124a.o(uri, "The uri must be set.");
        u0.q qVar = new u0.q(((Y.g) c0447c.f9054a.f8416a).f(), new Y.k(uri, 1, null, map, 0L, -1L, null, 1), 4, c0447c.f9055b.v());
        AbstractC0124a.t(c0447c.f9060g == null);
        u0.n nVar = new u0.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        c0447c.f9060g = nVar;
        nVar.f(qVar, c0447c, c0447c.f9056c.g(qVar.f15489c));
    }

    @Override // q0.AbstractC1359a
    public final void r(InterfaceC1383z interfaceC1383z) {
        l lVar = (l) interfaceC1383z;
        lVar.f8887b.f9058e.remove(lVar);
        for (s sVar : lVar.f8903t) {
            if (sVar.f8937D) {
                for (r rVar : sVar.v) {
                    rVar.k();
                    e0.t tVar = rVar.f14966h;
                    if (tVar != null) {
                        tVar.H(rVar.f14963e);
                        rVar.f14966h = null;
                        rVar.f14965g = null;
                    }
                }
            }
            j jVar = sVar.f8960d;
            C0446b c0446b = (C0446b) jVar.f8851g.f9057d.get(jVar.f8849e[jVar.f8860r.k()]);
            if (c0446b != null) {
                c0446b.f9052k = false;
            }
            jVar.n = null;
            sVar.f8966j.e(sVar);
            sVar.f8972r.removeCallbacksAndMessages(null);
            sVar.f8941H = true;
            sVar.f8973s.clear();
        }
        lVar.f8900q = null;
    }

    @Override // q0.AbstractC1359a
    public final void t() {
        C0447c c0447c = this.o;
        c0447c.f9064k = null;
        c0447c.f9065l = null;
        c0447c.f9063j = null;
        c0447c.n = -9223372036854775807L;
        c0447c.f9060g.e(null);
        c0447c.f9060g = null;
        HashMap hashMap = c0447c.f9057d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((C0446b) it.next()).f9043b.e(null);
        }
        c0447c.f9061h.removeCallbacksAndMessages(null);
        c0447c.f9061h = null;
        hashMap.clear();
        this.f8909k.release();
    }

    @Override // q0.AbstractC1359a
    public final synchronized void w(C0107z c0107z) {
        this.f8915s = c0107z;
    }

    public final void y(h0.l lVar) {
        long j4;
        f0 f0Var;
        long j5;
        long j6;
        long j7;
        boolean z = lVar.f9140p;
        boolean z4 = lVar.f9133g;
        I i4 = lVar.f9142r;
        long j8 = lVar.f9145u;
        long j9 = lVar.f9131e;
        int i5 = lVar.f9130d;
        long j10 = lVar.f9134h;
        long Z3 = z ? J.Z(j10) : -9223372036854775807L;
        long j11 = (i5 == 2 || i5 == 1) ? Z3 : -9223372036854775807L;
        C0447c c0447c = this.o;
        c0447c.f9063j.getClass();
        C0144j c0144j = new C0144j(6, false);
        long j12 = 0;
        if (c0447c.f9066m) {
            h0.k kVar = lVar.v;
            long j13 = j10 - c0447c.n;
            boolean z5 = lVar.o;
            long j14 = z5 ? j13 + j8 : -9223372036854775807L;
            long M4 = lVar.f9140p ? J.M(J.A(this.f8912p)) - (j10 + j8) : 0L;
            long j15 = this.f8913q.f2888a;
            if (j15 != -9223372036854775807L) {
                j6 = J.M(j15);
            } else {
                if (j9 != -9223372036854775807L) {
                    j5 = j8 - j9;
                } else {
                    j5 = kVar.f9128d;
                    if (j5 == -9223372036854775807L || lVar.n == -9223372036854775807L) {
                        j5 = kVar.f9127c;
                        if (j5 == -9223372036854775807L) {
                            j5 = 3 * lVar.f9139m;
                        }
                    }
                }
                j6 = j5 + M4;
            }
            long j16 = j8 + M4;
            long k4 = J.k(j6, M4, j16);
            C0103v c0103v = i().f2901c;
            boolean z6 = c0103v.f2891d == -3.4028235E38f && c0103v.f2892e == -3.4028235E38f && kVar.f9127c == -9223372036854775807L && kVar.f9128d == -9223372036854775807L;
            C0102u a3 = this.f8913q.a();
            a3.f2883a = J.Z(k4);
            a3.f2886d = z6 ? 1.0f : this.f8913q.f2891d;
            a3.f2887e = z6 ? 1.0f : this.f8913q.f2892e;
            C0103v c0103v2 = new C0103v(a3);
            this.f8913q = c0103v2;
            if (j9 == -9223372036854775807L) {
                j9 = j16 - J.M(c0103v2.f2888a);
            }
            if (z4) {
                j12 = j9;
            } else {
                h0.g x4 = x(lVar.f9143s, j9);
                if (x4 != null) {
                    j7 = x4.f9118e;
                } else if (!i4.isEmpty()) {
                    h0.i iVar = (h0.i) i4.get(J.d(i4, Long.valueOf(j9), true));
                    h0.g x5 = x(iVar.f9113m, j9);
                    j7 = x5 != null ? x5.f9118e : iVar.f9118e;
                }
                j12 = j7;
            }
            f0Var = new f0(j11, Z3, j14, lVar.f9145u, j13, j12, true, !z5, i5 == 2 && lVar.f9132f, c0144j, i(), this.f8913q);
        } else {
            if (j9 == -9223372036854775807L || i4.isEmpty()) {
                j4 = 0;
            } else {
                if (!z4 && j9 != j8) {
                    j9 = ((h0.i) i4.get(J.d(i4, Long.valueOf(j9), true))).f9118e;
                }
                j4 = j9;
            }
            long j17 = lVar.f9145u;
            f0Var = new f0(j11, Z3, j17, j17, 0L, j4, true, false, true, c0144j, i(), null);
        }
        q(f0Var);
    }
}
