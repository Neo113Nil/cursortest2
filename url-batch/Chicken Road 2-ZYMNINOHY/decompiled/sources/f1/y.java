package f1;

import W.G;
import android.util.SparseArray;
import d2.C0389g;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import kotlin.KotlinVersion;
import t0.C1427b;

/* loaded from: classes.dex */
public final class y implements y0.n {

    /* renamed from: e, reason: collision with root package name */
    public boolean f8803e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8804f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8805g;

    /* renamed from: h, reason: collision with root package name */
    public long f8806h;

    /* renamed from: i, reason: collision with root package name */
    public D0.c f8807i;

    /* renamed from: j, reason: collision with root package name */
    public y0.p f8808j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8809k;

    /* renamed from: a, reason: collision with root package name */
    public final G f8799a = new G(0);

    /* renamed from: c, reason: collision with root package name */
    public final W.u f8801c = new W.u(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f8800b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final w f8802d = new w(0);

    @Override // y0.n
    public final void a(long j4, long j5) {
        long j6;
        SparseArray sparseArray = this.f8800b;
        G g4 = this.f8799a;
        synchronized (g4) {
            j6 = g4.f3259b;
        }
        boolean z = j6 == -9223372036854775807L;
        if (!z) {
            long d4 = g4.d();
            z = (d4 == -9223372036854775807L || d4 == 0 || d4 == j5) ? false : true;
        }
        if (z) {
            g4.f(j5);
        }
        D0.c cVar = this.f8807i;
        if (cVar != null) {
            cVar.d(j5);
        }
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            x xVar = (x) sparseArray.valueAt(i4);
            xVar.f8797f = false;
            xVar.f8792a.b();
        }
    }

    @Override // y0.n
    public final boolean b(y0.o oVar) {
        byte[] bArr = new byte[14];
        y0.k kVar = (y0.k) oVar;
        kVar.l(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            kVar.a(bArr[13] & 7, false);
            kVar.l(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // y0.n
    public final int c(y0.o oVar, T.r rVar) {
        int i4;
        int i5;
        long j4;
        h hVar;
        long j5;
        this.f8808j.getClass();
        long length = oVar.getLength();
        int i6 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j6 = -9223372036854775807L;
        w wVar = this.f8802d;
        if (i6 != 0 && !wVar.f8786d) {
            G g4 = wVar.f8784b;
            W.u uVar = wVar.f8785c;
            if (!wVar.f8788f) {
                long length2 = oVar.getLength();
                int min = (int) Math.min(20000L, length2);
                long j7 = length2 - min;
                if (oVar.getPosition() != j7) {
                    rVar.f2881a = j7;
                    return 1;
                }
                uVar.J(min);
                oVar.u();
                oVar.E(uVar.f3351a, 0, min);
                int i7 = uVar.f3352b;
                int i8 = uVar.f3353c - 4;
                while (true) {
                    if (i8 < i7) {
                        break;
                    }
                    if (w.b(i8, uVar.f3351a) == 442) {
                        uVar.M(i8 + 4);
                        long c4 = w.c(uVar);
                        if (c4 != -9223372036854775807L) {
                            j6 = c4;
                            break;
                        }
                    }
                    i8--;
                }
                wVar.f8790h = j6;
                wVar.f8788f = true;
                return 0;
            }
            if (wVar.f8790h == -9223372036854775807L) {
                wVar.a(oVar);
                return 0;
            }
            if (wVar.f8787e) {
                long j8 = wVar.f8789g;
                if (j8 == -9223372036854775807L) {
                    wVar.a(oVar);
                    return 0;
                }
                wVar.f8791i = g4.c(wVar.f8790h) - g4.b(j8);
                wVar.a(oVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, oVar.getLength());
            long j9 = 0;
            if (oVar.getPosition() != j9) {
                rVar.f2881a = j9;
                return 1;
            }
            uVar.J(min2);
            oVar.u();
            oVar.E(uVar.f3351a, 0, min2);
            int i9 = uVar.f3352b;
            int i10 = uVar.f3353c;
            while (true) {
                if (i9 >= i10 - 3) {
                    j5 = -9223372036854775807L;
                    break;
                }
                if (w.b(i9, uVar.f3351a) == 442) {
                    uVar.M(i9 + 4);
                    long c5 = w.c(uVar);
                    if (c5 != -9223372036854775807L) {
                        j5 = c5;
                        break;
                    }
                }
                i9++;
            }
            wVar.f8789g = j5;
            wVar.f8787e = true;
            return 0;
        }
        if (this.f8809k) {
            i4 = i6;
            i5 = 4;
        } else {
            this.f8809k = true;
            long j10 = wVar.f8791i;
            if (j10 != -9223372036854775807L) {
                i4 = i6;
                i5 = 4;
                D0.c cVar = new D0.c(new C1427b(5), new C0389g(wVar.f8784b), j10, j10 + 1, 0L, length, 188L, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT);
                this.f8807i = cVar;
                this.f8808j.x(cVar.f335a);
            } else {
                i4 = i6;
                i5 = 4;
                this.f8808j.x(new A0.b(j10));
            }
        }
        D0.c cVar2 = this.f8807i;
        if (cVar2 != null && cVar2.f337c != null) {
            return cVar2.b(oVar, rVar);
        }
        oVar.u();
        long m4 = i4 != 0 ? length - oVar.m() : -1L;
        if (m4 != -1 && m4 < 4) {
            return -1;
        }
        W.u uVar2 = this.f8801c;
        if (!oVar.l(uVar2.f3351a, 0, i5, true)) {
            return -1;
        }
        uVar2.M(0);
        int m5 = uVar2.m();
        if (m5 == 441) {
            return -1;
        }
        if (m5 == 442) {
            oVar.E(uVar2.f3351a, 0, 10);
            uVar2.M(9);
            oVar.v((uVar2.z() & 7) + 14);
            return 0;
        }
        if (m5 == 443) {
            oVar.E(uVar2.f3351a, 0, 2);
            uVar2.M(0);
            oVar.v(uVar2.G() + 6);
            return 0;
        }
        if (((m5 & (-256)) >> 8) != 1) {
            oVar.v(1);
            return 0;
        }
        int i11 = m5 & KotlinVersion.MAX_COMPONENT_VALUE;
        SparseArray sparseArray = this.f8800b;
        x xVar = (x) sparseArray.get(i11);
        if (!this.f8803e) {
            if (xVar == null) {
                if (i11 == 189) {
                    hVar = new C0414b("video/mp2p");
                    this.f8804f = true;
                    this.f8806h = oVar.getPosition();
                } else if ((m5 & 224) == 192) {
                    hVar = new t(null, 0, "video/mp2p");
                    this.f8804f = true;
                    this.f8806h = oVar.getPosition();
                } else if ((m5 & 240) == 224) {
                    hVar = new j(null, "video/mp2p");
                    this.f8805g = true;
                    this.f8806h = oVar.getPosition();
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    hVar.e(this.f8808j, new E(i11, 256));
                    xVar = new x(hVar, this.f8799a);
                    sparseArray.put(i11, xVar);
                }
            }
            if (oVar.getPosition() > ((this.f8804f && this.f8805g) ? this.f8806h + 8192 : 1048576L)) {
                this.f8803e = true;
                this.f8808j.r();
            }
        }
        oVar.E(uVar2.f3351a, 0, 2);
        uVar2.M(0);
        int G4 = uVar2.G() + 6;
        if (xVar == null) {
            oVar.v(G4);
            return 0;
        }
        uVar2.J(G4);
        oVar.readFully(uVar2.f3351a, 0, G4);
        uVar2.M(6);
        h hVar2 = xVar.f8792a;
        W.t tVar = xVar.f8794c;
        uVar2.k(tVar.f3345d, 0, 3);
        tVar.q(0);
        tVar.t(8);
        xVar.f8795d = tVar.h();
        xVar.f8796e = tVar.h();
        tVar.t(6);
        uVar2.k(tVar.f3345d, 0, tVar.i(8));
        tVar.q(0);
        G g5 = xVar.f8793b;
        xVar.f8798g = 0L;
        if (xVar.f8795d) {
            tVar.t(4);
            tVar.t(1);
            tVar.t(1);
            long i12 = (tVar.i(3) << 30) | (tVar.i(15) << 15) | tVar.i(15);
            tVar.t(1);
            if (xVar.f8797f || !xVar.f8796e) {
                j4 = i12;
            } else {
                tVar.t(4);
                tVar.t(1);
                tVar.t(1);
                tVar.t(1);
                g5.b((tVar.i(15) << 15) | (tVar.i(3) << 30) | tVar.i(15));
                xVar.f8797f = true;
                j4 = i12;
            }
            xVar.f8798g = g5.b(j4);
        }
        hVar2.d(4, xVar.f8798g);
        hVar2.a(uVar2);
        hVar2.c(false);
        uVar2.L(uVar2.f3351a.length);
        return 0;
    }

    @Override // y0.n
    public final void e(y0.p pVar) {
        this.f8808j = pVar;
    }

    @Override // y0.n
    public final void release() {
    }
}
