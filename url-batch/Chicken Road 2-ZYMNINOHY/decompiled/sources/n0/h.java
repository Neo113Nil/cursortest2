package n0;

import E.AbstractC0005f;
import T.C0096n;
import W.AbstractC0108a;
import W.J;
import W.u;
import a.AbstractC0124a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import m0.C1295h;
import m0.C1298k;
import y0.AbstractC1569a;
import y0.F;
import y0.p;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C1298k f14565a;

    /* renamed from: b, reason: collision with root package name */
    public F f14566b;

    /* renamed from: d, reason: collision with root package name */
    public long f14568d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14570f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14571g;

    /* renamed from: c, reason: collision with root package name */
    public long f14567c = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f14569e = -1;

    public h(C1298k c1298k) {
        this.f14565a = c1298k;
    }

    @Override // n0.i
    public final void a(long j4, long j5) {
        this.f14567c = j4;
        this.f14568d = j5;
    }

    @Override // n0.i
    public final void b(long j4) {
        this.f14567c = j4;
    }

    @Override // n0.i
    public final void c(p pVar, int i4) {
        F z = pVar.z(i4, 1);
        this.f14566b = z;
        z.d(this.f14565a.f14397c);
    }

    @Override // n0.i
    public final void d(u uVar, long j4, int i4, boolean z) {
        this.f14566b.getClass();
        if (!this.f14570f) {
            int i5 = uVar.f3352b;
            AbstractC0124a.g("ID Header has insufficient data", uVar.f3353c > 18);
            AbstractC0124a.g("ID Header missing", uVar.x(8, StandardCharsets.UTF_8).equals("OpusHead"));
            AbstractC0124a.g("version number must always be 1", uVar.z() == 1);
            uVar.M(i5);
            ArrayList c4 = AbstractC1569a.c(uVar.f3351a);
            C0096n a3 = this.f14565a.f14397c.a();
            a3.f2832p = c4;
            AbstractC0005f.w(a3, this.f14566b);
            this.f14570f = true;
        } else if (this.f14571g) {
            int a4 = C1295h.a(this.f14569e);
            if (i4 != a4) {
                String str = J.f3263a;
                Locale locale = Locale.US;
                AbstractC0108a.s("RtpOpusReader", AbstractC0005f.l("Received RTP packet with unexpected sequence number. Expected: ", a4, "; received: ", i4, "."));
            }
            int a5 = uVar.a();
            this.f14566b.a(a5, uVar);
            this.f14566b.e(AbstractC0124a.R(this.f14568d, j4, this.f14567c, 48000), 1, a5, 0, null);
        } else {
            AbstractC0124a.g("Comment Header has insufficient data", uVar.f3353c >= 8);
            AbstractC0124a.g("Comment Header should follow ID Header", uVar.x(8, StandardCharsets.UTF_8).equals("OpusTags"));
            this.f14571g = true;
        }
        this.f14569e = i4;
    }
}
