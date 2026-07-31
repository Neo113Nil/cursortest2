package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InterruptedIOException;

/* loaded from: classes3.dex */
public final class qm {

    /* renamed from: a, reason: collision with root package name */
    private final C1933fm f30835a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1837bm f30836b;

    /* renamed from: c, reason: collision with root package name */
    private final mv f30837c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30838d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f30839e = new byte[131072];

    /* renamed from: f, reason: collision with root package name */
    private final a f30840f;

    /* renamed from: g, reason: collision with root package name */
    private long f30841g;

    /* renamed from: h, reason: collision with root package name */
    private long f30842h;

    /* renamed from: i, reason: collision with root package name */
    private long f30843i;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f30844j;

    public interface a {
        void a(long j4, long j5, long j6);
    }

    public qm(C1933fm c1933fm, mv mvVar, a aVar) {
        this.f30835a = c1933fm;
        this.f30836b = c1933fm.f();
        this.f30837c = mvVar;
        this.f30840f = aVar;
        this.f30838d = c1933fm.g().a(mvVar);
        this.f30841g = mvVar.f29244f;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0165 A[Catch: IOException -> 0x011d, TryCatch #2 {IOException -> 0x011d, blocks: (B:60:0x00fc, B:63:0x0103, B:68:0x0115, B:69:0x010f, B:77:0x0125, B:79:0x0129, B:82:0x0134, B:84:0x0140, B:87:0x0151, B:88:0x0157, B:91:0x014a, B:95:0x015b, B:96:0x0160, B:101:0x0165, B:104:0x016e, B:109:0x0181, B:110:0x017b), top: B:59:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0103 A[Catch: IOException -> 0x011d, TryCatch #2 {IOException -> 0x011d, blocks: (B:60:0x00fc, B:63:0x0103, B:68:0x0115, B:69:0x010f, B:77:0x0125, B:79:0x0129, B:82:0x0134, B:84:0x0140, B:87:0x0151, B:88:0x0157, B:91:0x014a, B:95:0x015b, B:96:0x0160, B:101:0x0165, B:104:0x016e, B:109:0x0181, B:110:0x017b), top: B:59:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0125 A[Catch: IOException -> 0x011d, TryCatch #2 {IOException -> 0x011d, blocks: (B:60:0x00fc, B:63:0x0103, B:68:0x0115, B:69:0x010f, B:77:0x0125, B:79:0x0129, B:82:0x0134, B:84:0x0140, B:87:0x0151, B:88:0x0157, B:91:0x014a, B:95:0x015b, B:96:0x0160, B:101:0x0165, B:104:0x016e, B:109:0x0181, B:110:0x017b), top: B:59:0x00fc }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j4;
        int i4;
        long j5;
        long j6;
        long j7;
        if (this.f30844j) {
            throw new InterruptedIOException();
        }
        InterfaceC1837bm interfaceC1837bm = this.f30836b;
        String str = this.f30838d;
        mv mvVar = this.f30837c;
        this.f30843i = interfaceC1837bm.b(str, mvVar.f29244f, mvVar.f29245g);
        mv mvVar2 = this.f30837c;
        long j8 = mvVar2.f29245g;
        long j9 = -1;
        if (j8 != -1) {
            this.f30842h = mvVar2.f29244f + j8;
        } else {
            long b4 = this.f30836b.b(this.f30838d).b();
            if (b4 == -1) {
                b4 = -1;
            }
            this.f30842h = b4;
        }
        a aVar = this.f30840f;
        if (aVar != null) {
            long j10 = this.f30842h;
            aVar.a(j10 == -1 ? -1L : j10 - this.f30837c.f29244f, this.f30843i, 0L);
        }
        while (true) {
            long j11 = this.f30842h;
            if (j11 != j9 && this.f30841g >= j11) {
                return;
            }
            if (this.f30844j) {
                throw new InterruptedIOException();
            }
            long j12 = this.f30842h;
            long d4 = this.f30836b.d(this.f30838d, this.f30841g, j12 == j9 ? Long.MAX_VALUE : j12 - this.f30841g);
            if (d4 > 0) {
                this.f30841g += d4;
            } else {
                long j13 = -d4;
                if (j13 == Long.MAX_VALUE) {
                    j13 = j9;
                }
                long j14 = this.f30841g;
                boolean z4 = true;
                boolean z5 = j14 + j13 == this.f30842h || j13 == j9;
                if (j13 != j9) {
                    try {
                        j4 = this.f30835a.a(this.f30837c.a().b(j14).a(j13).a());
                    } catch (IOException unused) {
                        lv.a(this.f30835a);
                    }
                    if (!z4) {
                        if (this.f30844j) {
                            throw new InterruptedIOException();
                        }
                        try {
                            j4 = this.f30835a.a(this.f30837c.a().b(j14).a(j9).a());
                        } catch (IOException e4) {
                            lv.a(this.f30835a);
                            throw e4;
                        }
                    }
                    if (z5 && j4 != j9) {
                        j7 = j4 + j14;
                        try {
                            if (this.f30842h == j7) {
                                this.f30842h = j7;
                                a aVar2 = this.f30840f;
                                if (aVar2 != null) {
                                    aVar2.a(j7 == j9 ? j9 : j7 - this.f30837c.f29244f, this.f30843i, 0L);
                                }
                            }
                        } catch (IOException e5) {
                            lv.a(this.f30835a);
                            throw e5;
                        }
                    }
                    i4 = 0;
                    int i5 = 0;
                    while (i4 != -1) {
                        if (this.f30844j) {
                            throw new InterruptedIOException();
                        }
                        C1933fm c1933fm = this.f30835a;
                        byte[] bArr = this.f30839e;
                        i4 = c1933fm.read(bArr, 0, bArr.length);
                        if (i4 != -1) {
                            long j15 = i4;
                            long j16 = this.f30843i + j15;
                            this.f30843i = j16;
                            a aVar3 = this.f30840f;
                            if (aVar3 != null) {
                                long j17 = this.f30842h;
                                if (j17 == j9) {
                                    j6 = j9;
                                    j5 = j6;
                                } else {
                                    j5 = j9;
                                    j6 = j17 - this.f30837c.f29244f;
                                }
                                aVar3.a(j6, j16, j15);
                            } else {
                                j5 = j9;
                            }
                            i5 += i4;
                            j9 = j5;
                        }
                    }
                    long j18 = j9;
                    if (z5) {
                        long j19 = i5 + j14;
                        if (this.f30842h != j19) {
                            this.f30842h = j19;
                            a aVar4 = this.f30840f;
                            if (aVar4 != null) {
                                aVar4.a(j19 == j18 ? j18 : j19 - this.f30837c.f29244f, this.f30843i, 0L);
                            }
                        }
                    }
                    this.f30835a.close();
                    this.f30841g = j14 + i5;
                    j9 = j18;
                }
                j4 = j9;
                z4 = false;
                if (!z4) {
                }
                if (z5) {
                    j7 = j4 + j14;
                    if (this.f30842h == j7) {
                    }
                }
                i4 = 0;
                int i52 = 0;
                while (i4 != -1) {
                }
                long j182 = j9;
                if (z5) {
                }
                this.f30835a.close();
                this.f30841g = j14 + i52;
                j9 = j182;
            }
        }
    }

    public final void b() {
        this.f30844j = true;
    }
}
