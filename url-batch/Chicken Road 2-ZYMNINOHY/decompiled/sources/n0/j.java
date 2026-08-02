package n0;

import E.AbstractC0005f;
import T.C0096n;
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
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C1298k f14572a;

    /* renamed from: b, reason: collision with root package name */
    public F f14573b;

    /* renamed from: c, reason: collision with root package name */
    public long f14574c = -9223372036854775807L;

    /* renamed from: d, reason: collision with root package name */
    public int f14575d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f14576e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f14577f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    public long f14578g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14579h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14580i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14581j;

    public j(C1298k c1298k) {
        this.f14572a = c1298k;
    }

    @Override // n0.i
    public final void a(long j4, long j5) {
        this.f14574c = j4;
        this.f14576e = -1;
        this.f14578g = j5;
    }

    @Override // n0.i
    public final void b(long j4) {
        AbstractC0124a.t(this.f14574c == -9223372036854775807L);
        this.f14574c = j4;
    }

    @Override // n0.i
    public final void c(p pVar, int i4) {
        F z = pVar.z(i4, 2);
        this.f14573b = z;
        z.d(this.f14572a.f14397c);
    }

    @Override // n0.i
    public final void d(u uVar, long j4, int i4, boolean z) {
        this.f14573b.getClass();
        int z4 = uVar.z();
        if ((z4 & 16) == 16 && (z4 & 7) == 0) {
            if (this.f14579h && this.f14576e > 0) {
                F f4 = this.f14573b;
                f4.getClass();
                f4.e(this.f14577f, this.f14580i ? 1 : 0, this.f14576e, 0, null);
                this.f14576e = -1;
                this.f14577f = -9223372036854775807L;
                this.f14579h = false;
            }
            this.f14579h = true;
        } else {
            if (!this.f14579h) {
                AbstractC0108a.s("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int a3 = C1295h.a(this.f14575d);
            if (i4 < a3) {
                String str = J.f3263a;
                Locale locale = Locale.US;
                AbstractC0108a.s("RtpVP8Reader", AbstractC0005f.l("Received RTP packet with unexpected sequence number. Expected: ", a3, "; received: ", i4, ". Dropping packet."));
                return;
            }
        }
        if ((z4 & 128) != 0) {
            int z5 = uVar.z();
            if ((z5 & 128) != 0 && (uVar.z() & 128) != 0) {
                uVar.N(1);
            }
            if ((z5 & 64) != 0) {
                uVar.N(1);
            }
            if ((z5 & 32) != 0 || (z5 & 16) != 0) {
                uVar.N(1);
            }
        }
        if (this.f14576e == -1 && this.f14579h) {
            this.f14580i = (uVar.j() & 1) == 0;
        }
        if (!this.f14581j) {
            int i5 = uVar.f3352b;
            uVar.M(i5 + 6);
            int s4 = uVar.s() & 16383;
            int s5 = uVar.s() & 16383;
            uVar.M(i5);
            C0097o c0097o = this.f14572a.f14397c;
            if (s4 != c0097o.f2874u || s5 != c0097o.v) {
                F f5 = this.f14573b;
                C0096n a4 = c0097o.a();
                a4.f2836t = s4;
                a4.f2837u = s5;
                AbstractC0005f.w(a4, f5);
            }
            this.f14581j = true;
        }
        int a5 = uVar.a();
        this.f14573b.a(a5, uVar);
        int i6 = this.f14576e;
        if (i6 == -1) {
            this.f14576e = a5;
        } else {
            this.f14576e = i6 + a5;
        }
        this.f14577f = AbstractC0124a.R(this.f14578g, j4, this.f14574c, 90000);
        if (z) {
            F f6 = this.f14573b;
            f6.getClass();
            f6.e(this.f14577f, this.f14580i ? 1 : 0, this.f14576e, 0, null);
            this.f14576e = -1;
            this.f14577f = -9223372036854775807L;
            this.f14579h = false;
        }
        this.f14575d = i4;
    }
}
