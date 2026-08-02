package n0;

import E.AbstractC0005f;
import T.C0097o;
import W.AbstractC0108a;
import W.J;
import W.u;
import a.AbstractC0124a;
import java.util.Locale;
import m0.C1295h;
import m0.C1298k;
import y0.F;
import y0.p;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public int f14558a;

    /* renamed from: b, reason: collision with root package name */
    public int f14559b;

    /* renamed from: c, reason: collision with root package name */
    public int f14560c;

    /* renamed from: d, reason: collision with root package name */
    public long f14561d;

    /* renamed from: e, reason: collision with root package name */
    public long f14562e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14563f;

    /* renamed from: g, reason: collision with root package name */
    public Object f14564g;

    public g(C1298k c1298k) {
        this.f14563f = c1298k;
        this.f14561d = -9223372036854775807L;
        this.f14559b = -1;
    }

    @Override // n0.i
    public void a(long j4, long j5) {
        this.f14561d = j4;
        this.f14562e = j5;
        this.f14560c = 0;
    }

    @Override // n0.i
    public void c(p pVar, int i4) {
        F z = pVar.z(i4, 2);
        this.f14564g = z;
        String str = J.f3263a;
        z.d(((C1298k) this.f14563f).f14397c);
    }

    @Override // n0.i
    public void d(u uVar, long j4, int i4, boolean z) {
        int i5;
        int a3;
        ((F) this.f14564g).getClass();
        int i6 = this.f14559b;
        if (i6 != -1 && i4 != (a3 = C1295h.a(i6))) {
            String str = J.f3263a;
            Locale locale = Locale.US;
            AbstractC0108a.s("RtpMpeg4Reader", AbstractC0005f.l("Received RTP packet with unexpected sequence number. Expected: ", a3, "; received: ", i4, ". Dropping packet."));
        }
        int a4 = uVar.a();
        ((F) this.f14564g).a(a4, uVar);
        if (this.f14560c == 0) {
            byte[] bArr = uVar.f3351a;
            byte[] bArr2 = {0, 0, 1, -74};
            AbstractC0124a.o(bArr, "array");
            int i7 = 0;
            loop0: while (true) {
                if (i7 >= bArr.length - 3) {
                    i7 = -1;
                    break;
                }
                for (int i8 = 0; i8 < 4; i8++) {
                    if (bArr[i7 + i8] != bArr2[i8]) {
                        break;
                    }
                }
                break loop0;
                i7++;
            }
            if (i7 != -1) {
                uVar.M(i7 + 4);
                if ((uVar.j() >> 6) == 0) {
                    i5 = 1;
                    this.f14558a = i5;
                }
            }
            i5 = 0;
            this.f14558a = i5;
        }
        this.f14560c += a4;
        if (z) {
            if (this.f14561d == -9223372036854775807L) {
                this.f14561d = j4;
            }
            ((F) this.f14564g).e(AbstractC0124a.R(this.f14562e, j4, this.f14561d, 90000), this.f14558a, this.f14560c, 0, null);
            this.f14560c = 0;
        }
        this.f14559b = i4;
    }

    public g(int i4, int i5, C0097o c0097o, int i6, Object obj, long j4, long j5) {
        this.f14558a = i4;
        this.f14559b = i5;
        this.f14563f = c0097o;
        this.f14560c = i6;
        this.f14564g = obj;
        this.f14561d = j4;
        this.f14562e = j5;
    }

    @Override // n0.i
    public void b(long j4) {
    }
}
