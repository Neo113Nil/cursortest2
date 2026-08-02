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
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14526a;

    /* renamed from: b, reason: collision with root package name */
    public final C1298k f14527b;

    /* renamed from: c, reason: collision with root package name */
    public F f14528c;

    /* renamed from: d, reason: collision with root package name */
    public long f14529d;

    /* renamed from: e, reason: collision with root package name */
    public long f14530e;

    /* renamed from: f, reason: collision with root package name */
    public int f14531f;

    /* renamed from: g, reason: collision with root package name */
    public int f14532g;

    /* renamed from: h, reason: collision with root package name */
    public long f14533h;

    /* renamed from: i, reason: collision with root package name */
    public int f14534i;

    /* renamed from: j, reason: collision with root package name */
    public int f14535j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14536k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14537l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14538m;

    public d(C1298k c1298k, int i4) {
        this.f14526a = i4;
        switch (i4) {
            case 1:
                this.f14527b = c1298k;
                this.f14529d = -9223372036854775807L;
                this.f14532g = -1;
                this.f14533h = -9223372036854775807L;
                this.f14530e = 0L;
                this.f14531f = -1;
                this.f14534i = -1;
                this.f14535j = -1;
                break;
            default:
                this.f14527b = c1298k;
                this.f14529d = -9223372036854775807L;
                this.f14532g = -1;
                break;
        }
    }

    @Override // n0.i
    public final void a(long j4, long j5) {
        switch (this.f14526a) {
            case 0:
                this.f14529d = j4;
                this.f14531f = 0;
                this.f14530e = j5;
                break;
            default:
                this.f14529d = j4;
                this.f14532g = -1;
                this.f14530e = j5;
                break;
        }
    }

    @Override // n0.i
    public final void b(long j4) {
        switch (this.f14526a) {
            case 0:
                AbstractC0124a.t(this.f14529d == -9223372036854775807L);
                this.f14529d = j4;
                break;
            default:
                AbstractC0124a.t(this.f14529d == -9223372036854775807L);
                this.f14529d = j4;
                break;
        }
    }

    @Override // n0.i
    public final void c(p pVar, int i4) {
        switch (this.f14526a) {
            case 0:
                F z = pVar.z(i4, 2);
                this.f14528c = z;
                z.d(this.f14527b.f14397c);
                break;
            default:
                F z4 = pVar.z(i4, 2);
                this.f14528c = z4;
                z4.d(this.f14527b.f14397c);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n0.i
    public final void d(u uVar, long j4, int i4, boolean z) {
        int i5;
        int i6;
        int i7 = this.f14526a;
        C1298k c1298k = this.f14527b;
        switch (i7) {
            case 0:
                this.f14528c.getClass();
                int i8 = uVar.f3352b;
                int G4 = uVar.G();
                Object[] objArr = (G4 & 1024) > 0;
                if ((G4 & 512) != 0 || (G4 & 504) != 0 || (G4 & 7) != 0) {
                    AbstractC0108a.s("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
                    break;
                } else {
                    if (objArr == true) {
                        if (this.f14538m && this.f14531f > 0) {
                            F f4 = this.f14528c;
                            f4.getClass();
                            f4.e(this.f14533h, this.f14536k ? 1 : 0, this.f14531f, 0, null);
                            this.f14531f = 0;
                            this.f14533h = -9223372036854775807L;
                            this.f14536k = false;
                            this.f14538m = false;
                        }
                        this.f14538m = true;
                        if ((uVar.j() & 252) < 128) {
                            AbstractC0108a.s("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                            break;
                        } else {
                            byte[] bArr = uVar.f3351a;
                            bArr[i8] = 0;
                            bArr[i8 + 1] = 0;
                            uVar.M(i8);
                        }
                    } else if (this.f14538m) {
                        int a3 = C1295h.a(this.f14532g);
                        if (i4 < a3) {
                            String str = J.f3263a;
                            Locale locale = Locale.US;
                            AbstractC0108a.s("RtpH263Reader", AbstractC0005f.l("Received RTP packet with unexpected sequence number. Expected: ", a3, "; received: ", i4, ". Dropping packet."));
                            break;
                        }
                    } else {
                        AbstractC0108a.s("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                        break;
                    }
                    if (this.f14531f == 0) {
                        boolean z4 = this.f14537l;
                        int i9 = uVar.f3352b;
                        if (((uVar.B() >> 10) & 63) == 32) {
                            int j5 = uVar.j();
                            int i10 = (j5 >> 1) & 1;
                            if (!z4 && i10 == 0) {
                                int i11 = (j5 >> 2) & 7;
                                if (i11 == 1) {
                                    this.f14534i = 128;
                                    this.f14535j = 96;
                                } else {
                                    int i12 = i11 - 2;
                                    this.f14534i = 176 << i12;
                                    this.f14535j = 144 << i12;
                                }
                            }
                            uVar.M(i9);
                            this.f14536k = i10 == 0;
                        } else {
                            uVar.M(i9);
                            this.f14536k = false;
                        }
                        if (!this.f14537l && this.f14536k) {
                            int i13 = this.f14534i;
                            C0097o c0097o = c1298k.f14397c;
                            if (i13 != c0097o.f2874u || this.f14535j != c0097o.v) {
                                F f5 = this.f14528c;
                                C0096n a4 = c0097o.a();
                                a4.f2836t = this.f14534i;
                                a4.f2837u = this.f14535j;
                                AbstractC0005f.w(a4, f5);
                            }
                            this.f14537l = true;
                        }
                    }
                    int a5 = uVar.a();
                    this.f14528c.a(a5, uVar);
                    this.f14531f += a5;
                    this.f14533h = AbstractC0124a.R(this.f14530e, j4, this.f14529d, 90000);
                    if (z) {
                        F f6 = this.f14528c;
                        f6.getClass();
                        f6.e(this.f14533h, this.f14536k ? 1 : 0, this.f14531f, 0, null);
                        this.f14531f = 0;
                        this.f14533h = -9223372036854775807L;
                        this.f14536k = false;
                        this.f14538m = false;
                    }
                    this.f14532g = i4;
                    break;
                }
                break;
            default:
                this.f14528c.getClass();
                int z5 = uVar.z();
                if ((z5 & 8) == 8) {
                    if (this.f14536k && this.f14532g > 0) {
                        F f7 = this.f14528c;
                        f7.getClass();
                        f7.e(this.f14533h, this.f14538m ? 1 : 0, this.f14532g, 0, null);
                        this.f14532g = -1;
                        this.f14533h = -9223372036854775807L;
                        this.f14536k = false;
                    }
                    this.f14536k = true;
                } else if (this.f14536k) {
                    int a6 = C1295h.a(this.f14531f);
                    if (i4 < a6) {
                        String str2 = J.f3263a;
                        Locale locale2 = Locale.US;
                        AbstractC0108a.s("RtpVp9Reader", AbstractC0005f.l("Received RTP packet with unexpected sequence number. Expected: ", a6, "; received: ", i4, ". Dropping packet."));
                        break;
                    }
                } else {
                    AbstractC0108a.s("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                    break;
                }
                if ((z5 & 128) == 0 || (uVar.z() & 128) == 0 || uVar.a() >= 1) {
                    int i14 = z5 & 16;
                    AbstractC0124a.g("VP9 flexible mode is not supported.", i14 == 0);
                    if ((z5 & 32) != 0) {
                        uVar.N(1);
                        if (uVar.a() >= 1) {
                            if (i14 == 0) {
                                uVar.N(1);
                            }
                        }
                    }
                    if ((z5 & 2) != 0) {
                        int z6 = uVar.z();
                        int i15 = (z6 >> 5) & 7;
                        if ((z6 & 16) != 0) {
                            int i16 = i15 + 1;
                            if (uVar.a() >= i16 * 4) {
                                for (int i17 = 0; i17 < i16; i17++) {
                                    this.f14534i = uVar.G();
                                    this.f14535j = uVar.G();
                                }
                            }
                        }
                        if ((z6 & 8) != 0) {
                            int z7 = uVar.z();
                            if (uVar.a() >= z7) {
                                for (int i18 = 0; i18 < z7; i18++) {
                                    int G5 = (uVar.G() & 12) >> 2;
                                    if (uVar.a() < G5) {
                                        break;
                                    } else {
                                        uVar.N(G5);
                                    }
                                }
                            }
                        }
                    }
                    if (this.f14532g == -1 && this.f14536k) {
                        this.f14538m = (uVar.j() & 4) == 0;
                    }
                    if (!this.f14537l && (i5 = this.f14534i) != -1 && (i6 = this.f14535j) != -1) {
                        C0097o c0097o2 = c1298k.f14397c;
                        if (i5 != c0097o2.f2874u || i6 != c0097o2.v) {
                            F f8 = this.f14528c;
                            C0096n a7 = c0097o2.a();
                            a7.f2836t = this.f14534i;
                            a7.f2837u = this.f14535j;
                            AbstractC0005f.w(a7, f8);
                        }
                        this.f14537l = true;
                    }
                    int a8 = uVar.a();
                    this.f14528c.a(a8, uVar);
                    int i19 = this.f14532g;
                    if (i19 == -1) {
                        this.f14532g = a8;
                    } else {
                        this.f14532g = i19 + a8;
                    }
                    this.f14533h = AbstractC0124a.R(this.f14530e, j4, this.f14529d, 90000);
                    if (z) {
                        F f9 = this.f14528c;
                        f9.getClass();
                        f9.e(this.f14533h, this.f14538m ? 1 : 0, this.f14532g, 0, null);
                        this.f14532g = -1;
                        this.f14533h = -9223372036854775807L;
                        this.f14536k = false;
                    }
                    this.f14531f = i4;
                    break;
                }
                break;
        }
    }
}
