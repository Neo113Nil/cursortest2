package n0;

import E.AbstractC0005f;
import T.G;
import W.AbstractC0108a;
import W.J;
import W.u;
import X.p;
import a.AbstractC0124a;
import java.util.Locale;
import m0.C1295h;
import m0.C1298k;
import y0.F;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14539a;

    /* renamed from: b, reason: collision with root package name */
    public final u f14540b;

    /* renamed from: c, reason: collision with root package name */
    public final u f14541c;

    /* renamed from: d, reason: collision with root package name */
    public final C1298k f14542d;

    /* renamed from: e, reason: collision with root package name */
    public F f14543e;

    /* renamed from: f, reason: collision with root package name */
    public int f14544f;

    /* renamed from: g, reason: collision with root package name */
    public long f14545g;

    /* renamed from: h, reason: collision with root package name */
    public int f14546h;

    /* renamed from: i, reason: collision with root package name */
    public int f14547i;

    /* renamed from: j, reason: collision with root package name */
    public long f14548j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14549k;

    public e(C1298k c1298k, int i4) {
        this.f14539a = i4;
        switch (i4) {
            case 1:
                this.f14540b = new u();
                this.f14541c = new u(p.f3552a);
                this.f14542d = c1298k;
                this.f14545g = -9223372036854775807L;
                this.f14546h = -1;
                break;
            default:
                this.f14541c = new u(p.f3552a);
                this.f14542d = c1298k;
                this.f14540b = new u();
                this.f14545g = -9223372036854775807L;
                this.f14546h = -1;
                break;
        }
    }

    @Override // n0.i
    public final void a(long j4, long j5) {
        switch (this.f14539a) {
            case 0:
                this.f14545g = j4;
                this.f14547i = 0;
                this.f14548j = j5;
                break;
            default:
                this.f14545g = j4;
                this.f14547i = 0;
                this.f14548j = j5;
                break;
        }
    }

    @Override // n0.i
    public final void b(long j4) {
        int i4 = this.f14539a;
    }

    @Override // n0.i
    public final void c(y0.p pVar, int i4) {
        int i5 = this.f14539a;
        C1298k c1298k = this.f14542d;
        switch (i5) {
            case 0:
                F z = pVar.z(i4, 2);
                this.f14543e = z;
                String str = J.f3263a;
                z.d(c1298k.f14397c);
                break;
            default:
                F z4 = pVar.z(i4, 2);
                this.f14543e = z4;
                z4.d(c1298k.f14397c);
                break;
        }
    }

    @Override // n0.i
    public final void d(u uVar, long j4, int i4, boolean z) {
        int i5;
        int i6;
        int i7 = this.f14539a;
        u uVar2 = this.f14540b;
        switch (i7) {
            case 0:
                try {
                    int i8 = uVar.f3351a[0] & 31;
                    this.f14543e.getClass();
                    if (i8 != 28) {
                        this.f14549k = false;
                        this.f14547i = 0;
                    }
                    if (i8 > 0 && i8 < 24) {
                        int a3 = uVar.a();
                        this.f14547i = g() + this.f14547i;
                        this.f14543e.a(a3, uVar);
                        this.f14547i += a3;
                        this.f14544f = (uVar.f3351a[0] & 31) == 5 ? 1 : 0;
                    } else if (i8 == 24) {
                        uVar.z();
                        while (uVar.a() > 4) {
                            int G4 = uVar.G();
                            this.f14547i = g() + this.f14547i;
                            this.f14543e.a(G4, uVar);
                            this.f14547i += G4;
                        }
                        this.f14544f = 0;
                    } else {
                        if (i8 != 28) {
                            throw G.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i8)), null);
                        }
                        byte[] bArr = uVar.f3351a;
                        byte b4 = bArr[0];
                        byte b5 = bArr[1];
                        int i9 = (b4 & 224) | (b5 & 31);
                        boolean z4 = (b5 & 128) > 0;
                        boolean z5 = (b5 & 64) > 0;
                        if (z4) {
                            i6 = 0;
                            this.f14549k = false;
                            this.f14547i = 0;
                            this.f14547i = g();
                            byte[] bArr2 = uVar.f3351a;
                            i5 = 1;
                            bArr2[1] = (byte) i9;
                            uVar2.getClass();
                            uVar2.K(bArr2.length, bArr2);
                            uVar2.M(1);
                        } else {
                            i5 = 1;
                            i6 = 0;
                            if (!this.f14549k) {
                                int a4 = C1295h.a(this.f14546h);
                                if (i4 != a4) {
                                    this.f14549k = true;
                                    String str = J.f3263a;
                                    Locale locale = Locale.US;
                                    AbstractC0108a.s("RtpH264Reader", AbstractC0005f.l("Received RTP packet with unexpected sequence number. Expected: ", a4, "; received: ", i4, ". Dropping packet."));
                                } else {
                                    byte[] bArr3 = uVar.f3351a;
                                    uVar2.getClass();
                                    uVar2.K(bArr3.length, bArr3);
                                    uVar2.M(2);
                                }
                            }
                        }
                        int a5 = uVar2.a();
                        this.f14543e.a(a5, uVar2);
                        this.f14547i += a5;
                        if (z5) {
                            if ((i9 & 31) == 5) {
                                i6 = i5;
                            }
                            this.f14544f = i6;
                        }
                    }
                    if (this.f14545g == -9223372036854775807L) {
                        this.f14545g = j4;
                    }
                    if (z && !this.f14549k) {
                        this.f14543e.e(AbstractC0124a.R(this.f14548j, j4, this.f14545g, 90000), this.f14544f, this.f14547i, 0, null);
                    }
                    this.f14546h = i4;
                    return;
                } catch (IndexOutOfBoundsException e4) {
                    throw G.b(null, e4);
                }
            default:
                byte[] bArr4 = uVar.f3351a;
                if (bArr4.length == 0) {
                    throw G.b("Empty RTP data packet.", null);
                }
                int i10 = (bArr4[0] >> 1) & 63;
                this.f14543e.getClass();
                if (i10 != 49) {
                    this.f14549k = false;
                    this.f14547i = 0;
                }
                if (i10 >= 0 && i10 < 48) {
                    int a6 = uVar.a();
                    this.f14547i = h() + this.f14547i;
                    this.f14543e.a(a6, uVar);
                    this.f14547i += a6;
                    int i11 = (uVar.f3351a[0] >> 1) & 63;
                    this.f14544f = (i11 == 19 || i11 == 20) ? 1 : 0;
                } else if (i10 == 48) {
                    uVar.M(2);
                    int i12 = 0;
                    while (uVar.a() > 2) {
                        int G5 = uVar.G();
                        int i13 = (uVar.f3351a[uVar.f3352b] & 126) >> 1;
                        if (uVar.a() < G5) {
                            throw G.b("Malformed Aggregation Packet. NAL unit size exceeds packet size.", null);
                        }
                        this.f14547i = h() + this.f14547i;
                        this.f14543e.a(G5, uVar);
                        this.f14547i += G5;
                        this.f14544f |= (i13 == 19 || i13 == 20) ? 1 : 0;
                        i12++;
                    }
                    if (uVar.a() > 0) {
                        throw G.b("Malformed Aggregation Packet. Packet size exceeds NAL unit size.", null);
                    }
                    if (i12 < 2) {
                        throw G.b("Aggregation Packet must contain at least 2 NAL units.", null);
                    }
                } else {
                    if (i10 != 49) {
                        throw G.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i10)), null);
                    }
                    byte[] bArr5 = uVar.f3351a;
                    if (bArr5.length < 3) {
                        throw G.b("Malformed FU header.", null);
                    }
                    int i14 = bArr5[1] & 7;
                    byte b6 = bArr5[2];
                    int i15 = b6 & 63;
                    boolean z6 = (b6 & 128) > 0;
                    boolean z7 = (b6 & 64) > 0;
                    if (z6) {
                        this.f14549k = false;
                        this.f14547i = 0;
                        this.f14547i = h();
                        byte[] bArr6 = (byte[]) uVar.f3351a.clone();
                        uVar2.getClass();
                        uVar2.K(bArr6.length, bArr6);
                        byte[] bArr7 = uVar2.f3351a;
                        bArr7[1] = (byte) ((i15 << 1) & 127);
                        bArr7[2] = (byte) i14;
                        uVar2.M(1);
                    } else if (!this.f14549k) {
                        int i16 = (this.f14546h + 1) % 65535;
                        if (i4 != i16) {
                            this.f14549k = true;
                            String str2 = J.f3263a;
                            Locale locale2 = Locale.US;
                            AbstractC0108a.s("RtpH265Reader", AbstractC0005f.l("Received RTP packet with unexpected sequence number. Expected: ", i16, "; received: ", i4, ". Dropping packet."));
                        } else {
                            uVar2.getClass();
                            uVar2.K(bArr5.length, bArr5);
                            uVar2.M(3);
                        }
                    }
                    int a7 = uVar2.a();
                    this.f14543e.a(a7, uVar2);
                    this.f14547i += a7;
                    if (z7) {
                        this.f14544f = (i15 == 19 || i15 == 20) ? 1 : 0;
                    }
                }
                if (this.f14545g == -9223372036854775807L) {
                    this.f14545g = j4;
                }
                if (z && !this.f14549k) {
                    this.f14543e.e(AbstractC0124a.R(this.f14548j, j4, this.f14545g, 90000), this.f14544f, this.f14547i, 0, null);
                }
                this.f14546h = i4;
                return;
        }
    }

    public int g() {
        u uVar = this.f14541c;
        uVar.M(0);
        int a3 = uVar.a();
        F f4 = this.f14543e;
        f4.getClass();
        f4.a(a3, uVar);
        return a3;
    }

    public int h() {
        u uVar = this.f14541c;
        uVar.M(0);
        int a3 = uVar.a();
        F f4 = this.f14543e;
        f4.getClass();
        f4.a(a3, uVar);
        return a3;
    }

    private final void e(long j4) {
    }

    private final void f(long j4) {
    }
}
