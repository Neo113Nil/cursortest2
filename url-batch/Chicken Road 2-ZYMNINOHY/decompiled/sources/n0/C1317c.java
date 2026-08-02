package n0;

import E.AbstractC0005f;
import W.AbstractC0108a;
import W.J;
import W.u;
import a.AbstractC0124a;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import java.util.Locale;
import m0.C1295h;
import m0.C1298k;
import y0.F;
import y0.p;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1317c implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f14517h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f14518i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a, reason: collision with root package name */
    public final C1298k f14519a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14520b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14521c;

    /* renamed from: d, reason: collision with root package name */
    public F f14522d;

    /* renamed from: e, reason: collision with root package name */
    public long f14523e;

    /* renamed from: f, reason: collision with root package name */
    public long f14524f;

    /* renamed from: g, reason: collision with root package name */
    public int f14525g;

    public C1317c(C1298k c1298k) {
        this.f14519a = c1298k;
        String str = c1298k.f14397c.n;
        str.getClass();
        this.f14520b = "audio/amr-wb".equals(str);
        this.f14521c = c1298k.f14396b;
        this.f14523e = -9223372036854775807L;
        this.f14525g = -1;
        this.f14524f = 0L;
    }

    @Override // n0.i
    public final void a(long j4, long j5) {
        this.f14523e = j4;
        this.f14524f = j5;
    }

    @Override // n0.i
    public final void b(long j4) {
        this.f14523e = j4;
    }

    @Override // n0.i
    public final void c(p pVar, int i4) {
        F z = pVar.z(i4, 1);
        this.f14522d = z;
        z.d(this.f14519a.f14397c);
    }

    @Override // n0.i
    public final void d(u uVar, long j4, int i4, boolean z) {
        int a3;
        this.f14522d.getClass();
        int i5 = this.f14525g;
        if (i5 != -1 && i4 != (a3 = C1295h.a(i5))) {
            String str = J.f3263a;
            Locale locale = Locale.US;
            AbstractC0108a.s("RtpAmrReader", AbstractC0005f.l("Received RTP packet with unexpected sequence number. Expected: ", a3, "; received: ", i4, "."));
        }
        uVar.N(1);
        int j5 = (uVar.j() >> 3) & 15;
        boolean z4 = (j5 >= 0 && j5 <= 8) || j5 == 15;
        boolean z5 = this.f14520b;
        String str2 = z5 ? "WB" : "NB";
        if (!z4) {
            throw new IllegalArgumentException(AbstractC0347t0.n("Illegal AMR %s frame type %s", str2, Integer.valueOf(j5)));
        }
        int i6 = z5 ? f14518i[j5] : f14517h[j5];
        int a4 = uVar.a();
        AbstractC0124a.g("compound payload not supported currently", a4 == i6);
        this.f14522d.a(a4, uVar);
        this.f14522d.e(AbstractC0124a.R(this.f14524f, j4, this.f14523e, this.f14521c), 1, a4, 0, null);
        this.f14525g = i4;
    }
}
