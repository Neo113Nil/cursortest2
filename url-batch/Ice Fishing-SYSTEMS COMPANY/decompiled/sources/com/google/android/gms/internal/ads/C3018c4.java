package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3018c4 implements O0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2964b4 f29635a = new C2964b4(0, 1, null, "audio/ac4");

    /* renamed from: b, reason: collision with root package name */
    public final Lr f29636b = new Lr(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f29637c;

    static {
        int i = AbstractC3194fG.f30672t0;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        this.f29635a.e(q02, new D4(Integer.MIN_VALUE, 0, 1));
        PQ pq = (PQ) q02;
        pq.v();
        pq.w(new T0(com.anythink.basead.exoplayer.b.f6539b, 0L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(P0 p02) {
        J0 j02;
        int i;
        Lr lr = new Lr(10);
        int i4 = 0;
        while (true) {
            j02 = (J0) p02;
            j02.I(lr.f26233a, 0, 10, false);
            lr.E(0);
            if (lr.O() != 4801587) {
                break;
            }
            lr.G(3);
            int g9 = lr.g();
            i4 += g9 + 10;
            j02.d(g9, false);
        }
        j02.f25677y = 0;
        j02.d(i4, false);
        int i9 = 0;
        int i10 = i4;
        while (true) {
            int i11 = 7;
            j02.I(lr.f26233a, 0, 7, false);
            lr.E(0);
            int L8 = lr.L();
            if (L8 == 44096 || L8 == 44097) {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                byte[] bArr = lr.f26233a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i12 == 65535) {
                        i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (L8 == 44097) {
                        i11 += 2;
                    }
                    i = i12 + i11;
                }
                if (i == -1) {
                    break;
                }
                j02.d(i - 7, false);
            } else {
                j02.f25677y = 0;
                i10++;
                if (i10 - i4 >= 8192) {
                    break;
                }
                j02.d(i10, false);
                i9 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        this.f29637c = false;
        this.f29635a.a();
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final int e(P0 p02, S0 s02) {
        Lr lr = this.f29636b;
        int z8 = ((J0) p02).z(lr.f26233a, 0, 16384);
        if (z8 == -1) {
            return -1;
        }
        lr.E(0);
        lr.C(z8);
        boolean z9 = this.f29637c;
        C2964b4 c2964b4 = this.f29635a;
        if (!z9) {
            c2964b4.f29400o = 0L;
            this.f29637c = true;
        }
        c2964b4.c(lr);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }
}
