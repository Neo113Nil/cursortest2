package m0;

import a.AbstractC0124a;
import android.os.SystemClock;
import n0.C1315a;
import n0.C1316b;
import n0.C1317c;

/* renamed from: m0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1293f implements y0.n {

    /* renamed from: a, reason: collision with root package name */
    public final n0.i f14363a;

    /* renamed from: b, reason: collision with root package name */
    public final W.u f14364b;

    /* renamed from: c, reason: collision with root package name */
    public final W.u f14365c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14366d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14367e;

    /* renamed from: f, reason: collision with root package name */
    public final C1297j f14368f;

    /* renamed from: g, reason: collision with root package name */
    public y0.p f14369g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14370h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f14371i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f14372j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14373k;

    /* renamed from: l, reason: collision with root package name */
    public long f14374l;

    /* renamed from: m, reason: collision with root package name */
    public long f14375m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C1293f(C1298k c1298k, int i4) {
        char c4;
        n0.i dVar;
        n0.i iVar;
        this.f14366d = i4;
        String str = c1298k.f14397c.n;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -1606874997:
                if (str.equals("audio/amr-wb")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c4 = 4;
                    break;
                }
                c4 = 65535;
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 1503095341:
                if (str.equals("audio/3gpp")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                dVar = new n0.d(c1298k, 0);
                iVar = dVar;
                break;
            case 1:
                dVar = new n0.e(c1298k, 1);
                iVar = dVar;
                break;
            case 2:
            case '\b':
                dVar = new C1317c(c1298k);
                iVar = dVar;
                break;
            case 3:
                dVar = c1298k.f14399e.equals("MP4A-LATM") ? new n0.f(c1298k) : new C1315a(c1298k);
                iVar = dVar;
                break;
            case 4:
                dVar = new C1316b(c1298k);
                iVar = dVar;
                break;
            case 5:
            case '\f':
            case '\r':
                dVar = new c2.r(c1298k);
                iVar = dVar;
                break;
            case 6:
                dVar = new n0.g(c1298k);
                iVar = dVar;
                break;
            case 7:
                dVar = new n0.e(c1298k, 0);
                iVar = dVar;
                break;
            case '\t':
                dVar = new n0.h(c1298k);
                iVar = dVar;
                break;
            case '\n':
                dVar = new n0.j(c1298k);
                iVar = dVar;
                break;
            case 11:
                dVar = new n0.d(c1298k, 1);
                iVar = dVar;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f14363a = iVar;
        this.f14364b = new W.u(65507);
        this.f14365c = new W.u();
        this.f14367e = new Object();
        this.f14368f = new C1297j();
        this.f14371i = -9223372036854775807L;
        this.f14372j = -1;
        this.f14374l = -9223372036854775807L;
        this.f14375m = -9223372036854775807L;
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        synchronized (this.f14367e) {
            try {
                if (!this.f14373k) {
                    this.f14373k = true;
                }
                this.f14374l = j4;
                this.f14375m = j5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y0.n
    public final boolean b(y0.o oVar) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(y0.o oVar, T.r rVar) {
        boolean z;
        this.f14369g.getClass();
        int read = oVar.read(this.f14364b.f3351a, 0, 65507);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f14364b.M(0);
        this.f14364b.L(read);
        W.u uVar = this.f14364b;
        byte[] bArr = C1295h.f14382g;
        C1295h c1295h = null;
        if (uVar.a() >= 12) {
            int z4 = uVar.z();
            byte b4 = (byte) (z4 >> 6);
            byte b5 = (byte) (z4 & 15);
            boolean z5 = ((z4 >> 4) & 1) == 1;
            if (b4 == 2) {
                int z6 = uVar.z();
                boolean z7 = ((z6 >> 7) & 1) == 1;
                byte b6 = (byte) (z6 & 127);
                int G4 = uVar.G();
                long B4 = uVar.B();
                int m4 = uVar.m();
                if (b5 > 0) {
                    byte[] bArr2 = new byte[b5 * 4];
                    z = true;
                    for (int i4 = 0; i4 < b5; i4++) {
                        uVar.k(bArr2, i4 * 4, 4);
                    }
                } else {
                    z = true;
                }
                if (z5) {
                    uVar.N(2);
                    short w4 = uVar.w();
                    if (w4 != 0) {
                        uVar.N(w4 * 4);
                    }
                }
                byte[] bArr3 = new byte[uVar.a()];
                uVar.k(bArr3, 0, uVar.a());
                C1294g c1294g = new C1294g();
                c1294g.f14381f = bArr;
                c1294g.f14376a = z7;
                c1294g.f14377b = b6;
                AbstractC0124a.h((G4 < 0 || G4 > 65535) ? false : z);
                c1294g.f14378c = 65535 & G4;
                c1294g.f14379d = B4;
                c1294g.f14380e = m4;
                c1294g.f14381f = bArr3;
                c1295h = new C1295h(c1294g);
                if (c1295h != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j4 = elapsedRealtime - 30;
                    C1297j c1297j = this.f14368f;
                    synchronized (c1297j) {
                        if (c1297j.f14391a.size() >= 5000) {
                            throw new IllegalStateException("Queue size limit of 5000 reached.");
                        }
                        int i5 = c1295h.f14385c;
                        if (!c1297j.f14394d) {
                            c1297j.d();
                            c1297j.f14393c = AbstractC0124a.K(i5 - 1);
                            c1297j.f14394d = z;
                            c1297j.a(new C1296i(c1295h, elapsedRealtime));
                        } else if (Math.abs(C1297j.b(i5, C1295h.a(c1297j.f14392b))) >= 1000) {
                            c1297j.f14393c = AbstractC0124a.K(i5 - 1);
                            c1297j.f14391a.clear();
                            c1297j.a(new C1296i(c1295h, elapsedRealtime));
                        } else if (C1297j.b(i5, c1297j.f14393c) > 0) {
                            c1297j.a(new C1296i(c1295h, elapsedRealtime));
                        }
                    }
                    C1295h c4 = this.f14368f.c(j4);
                    if (c4 != null) {
                        if (!this.f14370h) {
                            if (this.f14371i == -9223372036854775807L) {
                                this.f14371i = c4.f14386d;
                            }
                            if (this.f14372j == -1) {
                                this.f14372j = c4.f14385c;
                            }
                            this.f14363a.b(this.f14371i);
                            this.f14370h = true;
                        }
                        synchronized (this.f14367e) {
                            try {
                                if (!this.f14373k) {
                                    do {
                                        W.u uVar2 = this.f14365c;
                                        byte[] bArr4 = c4.f14388f;
                                        uVar2.getClass();
                                        uVar2.K(bArr4.length, bArr4);
                                        this.f14363a.d(this.f14365c, c4.f14386d, c4.f14385c, c4.f14383a);
                                        c4 = this.f14368f.c(j4);
                                    } while (c4 != null);
                                } else if (this.f14374l != -9223372036854775807L && this.f14375m != -9223372036854775807L) {
                                    this.f14368f.d();
                                    this.f14363a.a(this.f14374l, this.f14375m);
                                    this.f14373k = false;
                                    this.f14374l = -9223372036854775807L;
                                    this.f14375m = -9223372036854775807L;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return 0;
                    }
                }
                return 0;
            }
        }
        z = true;
        if (c1295h != null) {
        }
        return 0;
    }

    @Override // y0.n
    public final void e(y0.p pVar) {
        this.f14363a.c(pVar, this.f14366d);
        pVar.r();
        pVar.x(new A0.b(-9223372036854775807L));
        this.f14369g = pVar;
    }

    @Override // y0.n
    public final void release() {
    }
}
